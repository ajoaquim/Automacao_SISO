package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9506Analise2 extends UtilsSteps{
	
	  @When("^optar por selecionar o menu Pagamento,Análise$") 
	  public void optarPorSelecionarOmenuPagamentoAnalise() throws Throwable {
			initiate();
			frame.sairFrame();
			frame.sairFrame();
			
			auto.acessoPagamento();
			
			//auto.menuAnalisePagamento();
		 
	  }
	    
		//Scenario: Validar consulta de análise 
	         @When("^informar os dados de pesquisa de analise$") 
	  public void informarOsDadosDePesquisaDeAnalise() throws Throwable {
	        	 auto.informarOsDadosDePesquisaDeAnalise();
	        	 
		  
	  }
	         @And("^selecionar continuar de analise$") 
	         public void selecionarContinuarDeAnalise() throws Throwable {
	        	 
	        auto.selecionarContinuarDeAnalise();	 
	         }
	         
	         @Then("^o sistema apresenta em tela os pagamentos enviados durante o período informado.$") 
	          public void oSistemaApresentaEmTelaOsPagamentosEnviadosDurenteOPeriodoInformado() throws Throwable {
	        	 auto.mostraTelaPagamentosGerados();
	        	 
	         }
	         

}
