package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9525CancelaArquivoPagamento extends UtilsSteps {
	
	@When("^optar por selecionar o menu Cancela Arquivo Pagamento$")
	public void optarPorSelecionarOMenuCancelaArquivoPagamento() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamento.acessoPagamento();
		pagamento.acessoCancelaArquivaPagamento();
	}

	@When("^opto por informar um banco$")
	public void optoPorInformarUm() throws Throwable {
	    
	    
	}

	@When("^opto por informar duas datas em data de pagamento$")
	public void optoPorInformarDuasDatasEmDataDePagamento() throws Throwable {
	    
	    
	}

	@When("^clicar no botão para continuar$")
	public void clicarNoBotãoParaContinuar() throws Throwable {
	    
	    
	}

	@Then("^o sistema apresenta o arquivo gerado$")
	public void oSistemaApresentaOArquivoGerado() throws Throwable {
	    
	    
	}
	
}
