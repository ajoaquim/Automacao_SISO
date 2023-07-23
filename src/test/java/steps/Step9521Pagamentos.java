package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9521Pagamentos extends UtilsSteps {
	
	@When("^optar por selecionar o menu pagamentos$")
	public void optarPorSelecionarOMenuPagamentos() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamento.acessoPagamento();
		pagamento.acessoMenuPagamento();
	    
	}

	@When("^informar os dados$")
	public void informarOsDados() throws Throwable {
	    
	    
	}

	@When("^selecionar Continuar\"$")
	public void selecionarContinuar() throws Throwable {
	    
		pagamento.clicarContinuar();
	}

	@Then("^o sistema apresenta em tela os pagamentos buscados$")
	public void oSistemaApresentaEmTelaOsPagamentosBuscados() throws Throwable {
	    
	    
	}

	
}
