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

public class Step12008ControleRevisao extends UtilsSteps {
	
	@When("^selecionar o menu Conta Odontológica, Revisão, Controle de Revisão por Referência$")
	public void selecionarOMenuContaOdontológicaRevisãoControleDeRevisãoPorReferência() throws Throwable {	
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.sendKeys("Controle Revisão por Referência");
		driver.findElement(By.id("btn-filtro-menu")).click();
		List<WebElement> firstLevelMenu = driver.findElements(By.id("dropdown"));

		boolean result = false;
		for (WebElement first : firstLevelMenu) {
			if (first.getAttribute("style").contains("block") && first.getText().toLowerCase().contains("contasodontologicas")) {
				result = true;
				first.findElement(By.partialLinkText("Controle Revisão por Referência")).click();
				break;
		
			}
		}

		assertTrue(result);
	
	}

	@Given("^que tenha uma remessa já gerada$")
	public void queTenhaUmaRemessaJáGerada() throws Throwable {
		frame.mudarModalPrincipalSISO();
	}

	@When("^realizar o filtro para busca da remessa$")
	public void realizarOFiltroParaBuscaDaRemessa() throws Throwable {
		contasR.MesReferencia();
		frame.mudarModalToolbarSISO();
		contasR.Atualizar();
	}

	@When("^selecionar Atualizar$")
	public void selecionarAtualizar() throws Throwable {
		frame.mudarModalToolbarSISO();
		contasR.Atualizar();
		
	}
	
	@When("^selecionar a remessa desejada$")
	public void selecionarARemessaDesejada() throws Throwable {
		frame.mudarModalPrincipalSISO();
		contasR.SelecionarRemessa();
		
	}

	@When("^selecionar continuar Controle$")
	public void selecionarContinuarControle() throws Throwable {
		frame.mudarModalToolbarSISO();
		contasR.ContinuarControle();
		contasR.Limpar();
		driver.switchTo().alert().accept();
	}


	@Given("^que tenha uma remessa já gerada com outro usuário Controle$")
	public void queTenhaUmaRemessaJáGeradaComOutroUsuárioControle() throws Throwable {
		frame.mudarModalPrincipalSISO();
	}

	@When("^realizar o filtro para busca da remessa Controle$")
	public void realizarOFiltroParaBuscaDaRemessaControle() throws Throwable {
		contasR.MesReferencia();
		contasR.Situacao();
	}

	@When("^selecionar Atualizar Controle$")
	public void selecionarAtualizarControle() throws Throwable {
		frame.mudarModalToolbarSISO();
		contasR.Atualizar();
	}

	@When("^selecionar a remessa desejada Controle$")
	public void selecionarARemessaDesejadaControle() throws Throwable {
		frame.mudarModalPrincipalSISO();
		contasR.SelecionarRemessa();
		frame.mudarModalToolbarSISO();
		contasR.ContinuarControle();
	}

	@When("^selecinar Desbloquear Controle$")
	public void selecinarDesbloquearControle() throws Throwable {

	}

	@When("^selecionar assumir Controle$")
	public void selecionarAssumirControle() throws Throwable {
		contasR.Assumir();
		driver.switchTo().alert().accept();
	}

	@Then("^a remessa fica assumida para o usuário logado Controle$")
	public void aRemessaFicaAssumidaParaOUsuárioLogadoControle() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "12008ControleRevisaoPorReferencia");
	}
	
	
	@Given("^que tenha uma remessa já gerada Excluir$")
	public void queTenhaUmaRemessaJáGeradaExcluir() throws Throwable {
		frame.mudarModalPrincipalSISO();
	}

	@When("^realizar o filtro para busca da remessa Excluir$")
	public void realizarOFiltroParaBuscaDaRemessaExcluir() throws Throwable {
		contasR.MesReferencia();
		contasR.SituacaoEmRevisao();
	}

	@When("^selecionar Atualizar Excluir$")
	public void selecionarAtualizarExcluir() throws Throwable {
		frame.mudarModalToolbarSISO();
		contasR.Atualizar();
	}
	
	@When("^selecionar a remessa desejada Excluir$")
	public void selecionarARemessaDesejadaExcluir() throws Throwable {
		frame.mudarModalPrincipalSISO();
		contasR.SelecionarRemessa();
		frame.mudarModalToolbarSISO();
		contasR.ContinuarControle();
	}


	@When("^selecionar a guia Protocoloada processada Excluir$")
	public void selecionarAGuiaProtocoloadaProcessadaExcluir() throws Throwable {
		frame.mudarModalPrincipalSISO();
		contasR.SelecionaPrestador();
		
	}

	@When("^selecionar Excluir Guia$")
	public void selecionarExcluirGuia() throws Throwable {

	}
	
	@Then("^a guia é excluída da remessa Excluir$")
	public void aGuiaÉExcluídaDaRemessaExcluir() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "12008ControleRevisaoPorReferenciaExcluir");
	
	}
	
	@Given("^que tenha uma remessa já gerada Validar$")
	public void queTenhaUmaRemessaJáGeradaValidar() throws Throwable {
		frame.mudarModalPrincipalSISO();
	}	

	@When("^realizar o filtro para busca da remessa Validar$")
	public void realizarOFiltroParaBuscaDaRemessaValidar() throws Throwable {
		contasR.MesReferencia();
		contasR.SituacaoEmRevisao();
	}

	@When("^selecionar Atualizar Validar$")
	public void selecionarAtualizarValidar() throws Throwable {
		frame.mudarModalToolbarSISO();
		contasR.Atualizar();
	}

	@When("^selecionar a remessa desejada Validar$")
	public void selecionarARemessaDesejadaValidar() throws Throwable {
		frame.mudarModalPrincipalSISO();
		contasR.SelecionarRemessa();
		frame.mudarModalToolbarSISO();
		contasR.ContinuarControle();
	}

	@When("^selecionar Ocorrências da Remessa Validar$")
	public void selecionarOcorrênciasDaRemessaValidar() throws Throwable {
	
	}

	@When("^o sistema apresenta um pop-up com ocorrências Validar$")
	public void oSistemaApresentaUmPopUpComOcorrênciasValidar() throws Throwable {
	
	}

	@When("^selecinar Próxima Validar$")
	public void selecinarPróximaValidar() throws Throwable {
	
	}

	@When("^o sistema passa para a remessa seguinte da fila Validar$")
	public void oSistemaPassaParaARemessaSeguinteDaFilaValidar() throws Throwable {
	
	}

	@When("^selecinar Anterior Validar$")
	public void selecinarAnteriorValidar() throws Throwable {
	
	}

	@When("^o sistema volta para a remessa anterior da fila Validar$")
	public void oSistemaVoltaParaARemessaAnteriorDaFilaValidar() throws Throwable {
	
	}

	@When("^selecionar fechar Validar$")
	public void selecionarFecharValidar() throws Throwable {
	
	}

	@Then("^o sistema fecha a remessa que estava em tela e volta para a página inicial do menu Análise Remessa por Referência Validar$")
	public void oSistemaFechaARemessaQueEstavaEmTelaEVoltaParaAPáginaInicialDoMenuAnáliseRemessaPorReferênciaValidar() throws Throwable {

	}




	
	

}
