package steps;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ultils.UtilsSteps;

import br.com.portoseguro.data.textreader.TextReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9225FechamentoTecnico extends UtilsSteps {

	@When("^optar por selecionar o menu Conta Odontológica,Fechamento Técnico odonto$")
	public void optarPorSelecionarOMenuContaOdontológicaFechamentoTécnico() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamento.acessarTelas("Conta Odontológica", "Fechamento Técnico");
	}

	@Given("^que tenha remessa com o status análisado odonto$")
	public void queTenhaRemessaComOStatusAnálisado() throws Throwable {
		
	}

	@When("^informar os dados da busca odonto$")
	public void informarOsDadosDaBusca() throws Throwable {
		contas.selecionarCombo("02/2020","#h_MES_ANO_REF");
		Thread.sleep(2000);
		contas.botãoBuscar2();
		
	}

	@When("^selecionar uma ou mais remessas odonto$")
	public void selecionarUmaOuMaisRemessas() throws Throwable {
		Thread.sleep(2000);
		work.focusElement("#gridpager_left", "aa");
		Thread.sleep(5000);
		contas.selecionarRemessaFechamentoT();
		
		
	}

	@When("^selecionar executar odonto$")
	public void selecionarExecutar() throws Throwable {
		work.focusElement("#btnexecutar > i", "a");
	    contas.executarRemessa();
	    driver.switchTo().alert().accept();
	}

	@Then("^o sistema apresenta a tela do job que está sendo executado odonto$")
	public void oSistemaApresentaATelaDoJobQueEstáSendoExecutado() throws Throwable {
		Thread.sleep(3000);
		String txtEsperado = "Job para reprocessar";
		modulo.screenshot(driver, System.currentTimeMillis(), "Odonto", "9225_FechamentoT_1");
	}
}

	