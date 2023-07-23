package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9224FechamentoReferencia extends UtilsSteps{

	@When("^optar por selecionar o menu Conta Odontológica,Fechamento Referência odonto$")
	public void optarPorSelecionarOMenuContaOdontológicaFechamentoReferênciaOdonto() throws Throwable {
	   initiate();
	   frame.sairFrame();
	   frame.sairFrame();
	   pagamento.acessarTelas("Conta Odontológica", "Fechamento Referência");
	}

	@Given("^que tenha uma referência onde nem todas as remessas estejam com o status enviado para pagamento$")
	public void queTenhaUmaReferênciaOndeNemTodasAsRemessasEstejamComOStatusEnviadoParaPagamento() throws Throwable {
	   
	   
	}

	@When("^selecionar a referência varios status$")
	public void selecionarAReferênciaVariosStatus() throws Throwable {
		Thread.sleep(4000);
		contas.selecionarFecharReferencia(); 
	}

	@When("^selecionar o botão Executar varios status$")
	public void selecionarOBotãoExecutarVariosStatus() throws Throwable {
	    contas.btnExecutarFR();
	}

	@Then("^o sistema apresenta a mensagem Não foi possível fechar a referência pois existe remessa em análise$")
	public void oSistemaApresentaAMensagemNãoFoiPossívelFecharAReferênciaPoisExisteRemessaEmAnálise() throws Throwable {
		
		Thread.sleep(3000);
		String element = "/html/body/div[4]/div[3]/div/div[2]/div[2]/form/div[2]/div/div/div[2]/"
				+ "div/div/div/div[3]/div[3]/div/table/tbody/tr[2]/td[3]";
		String txtEsperado = "Não foi possível fechar a referência pois existe remessa em análise.";
		contas.validarMensagemText(element, txtEsperado);
		
		modulo.screenshot(driver, System.currentTimeMillis(), "Odonto", "9224_FechamentoReferencia_1");
	}


}
