package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9523ItensPagamento extends UtilsSteps {
	
	@When("^optar por selecionar o menu Itens Pagamento$")
	public void optarPorSelecionarOMenuItensPagamento() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamento.acessoPagamento();
		pagamento.acessoItensPagamento();
		Thread.sleep(100000);
	}

	@When("^informar os dados necessários$")
	public void informarOsDadosNecessários() throws Throwable {


	}

//	@When("^selecionar Continuar$")
//	public void selecionarContinuar() throws Throwable {
//		
//		
//	}

	@Then("^o sistema apresenta em tela os dados buscados$")
	public void oSistemaApresentaEmTelaOsDadosBuscados() throws Throwable {
	  

	}
	
}
