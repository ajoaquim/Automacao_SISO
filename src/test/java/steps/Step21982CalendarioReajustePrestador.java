package steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step21982CalendarioReajustePrestador extends UtilsSteps {
	
	@Given("^acesso o módulo Gestão Prestador, Reajuste Prestador, Calendário de Reajuste Prestador$")
	public void acessoOMóduloGestãoPrestadorReajustePrestadorCalendárioDeReajustePrestador() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.sendKeys("Reajuste Prestador");
		driver.findElement(By.id("btn-filtro-menu")).click();
		List<WebElement> firstLevelMenu = driver.findElements(By.id("dropdown"));

		boolean result = false;
		for (WebElement first : firstLevelMenu) {
			if (first.getAttribute("style").contains("block") && first.getText().toLowerCase().contains("gestão prestadores")) {
				result = true;
				first.findElement(By.partialLinkText("Calendario de Reajuste Prestador")).click();
				break;
			}
		}

		assertTrue(result);
	}

	@Given("^que insiro uma referência nova$")
	public void queInsiroUmaReferênciaNova() throws Throwable {
		gestao.Referencia();
	}

	@Given("^clicar fora do campo Calendário$")
	public void clicarForaDoCampoCalendário() throws Throwable {
		frame.clicar_fora("//*[@id='mes_ano_ref']");
	}

	@Given("^preencher os campos$")
	public void preencherOsCampos() throws Throwable {
	    gestao.IndiceEconomico();
	    gestao.Processamento();
	    gestao.Reajuste();
	}

	@Given("^clicar em Salvar$")
	public void clicarEmSalvar() throws Throwable {
	   gestao.Salvar();
	}

	@Then("^o sistema exibe Operação Realizada com Sucesso$")
	public void oSistemaExibeOperaçãoRealizadaComSucesso() throws Throwable {
		 Thread.sleep(2000);
		 modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "21982OperacaoRealizadaComSucesso");
	}
	
	@Given("^que informo uma referência existente$")
	public void queInformoUmaReferênciaExistente() throws Throwable {
		gestao.Referencia();
		frame.clicar_fora("//*[@id='mes_ano_ref']");
	}

	@When("^realizar alteração da informação que desejo$")
	public void realizarAlteraçãoDaInformaçãoQueDesejo() throws Throwable {
		gestao.ProcessamentoAlteracao();
		gestao.Salvar();
	}

	@Then("^o sistema irá retornar Operação Realizada com Sucesso$")
	public void oSistemaIráRetornarOperaçãoRealizadaComSucesso() throws Throwable {
		Thread.sleep(2000);
		 modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "21982OperacaoRealizadaComSucessoAlteracao");
	}
	
	@When("^clicar no botão Excluir Calendário$")
	public void clicarNoBotãoExcluirCalendário() throws Throwable {
		gestao.ExcluirCalendario();
		driver.switchTo().alert().accept();
	}

	@Then("^o sistema retorna Operação Realizada com Sucesso$")
	public void oSistemaRetornaOperaçãoRealizadaComSucesso() throws Throwable {
		Thread.sleep(2000);
		 modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "21982OperacaoRealizadaComSucessoExcluir");
	}
	

	@Given("^que estou em uma referência existente$")
	public void queEstouEmUmaReferênciaExistente() throws Throwable {
		gestao.ReferenciaPrestador();
		frame.clicar_fora("//*[@id='mes_ano_ref']");
	}

	@When("^quando clicar no botão Prestadores$")
	public void quandoClicarNoBotãoPrestadores() throws Throwable {
		gestao.BotaoPrestador();
	}

	@When("^inserir as datas de referência contrato$")
	public void inserirAsDatasDeReferênciaContrato() throws Throwable {
		gestao.ReferenciaContratoDe();
		gestao.ReferenciaContratoAte();
	}

	@When("^clicar executar$")
	public void clicarExecutar() throws Throwable {
		gestao.ExecutarCalendario();

	}

	@Then("^o sistema deve retornar os prestadores existentes de acordo com as datas referência contratos$")
	public void oSistemaDeveRetornarOsPrestadoresExistentesDeAcordoComAsDatasReferênciaContratos() throws Throwable {
		Thread.sleep(2000);
		 modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "21982OperacaoRealizadaComSucessoValidarPrestador");
	}



}
