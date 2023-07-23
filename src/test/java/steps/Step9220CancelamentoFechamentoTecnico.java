package steps;

import Ultils.UtilsSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9220CancelamentoFechamentoTecnico extends UtilsSteps {

		/*	
		@Given("^que acesso o sistema SISO$")
		public void  queacessoosistemaSIS() throws Throwable {
			
		}
	    @And("^preencho o login e senha$") 
public void  preenchoologinesenha() throws Throwable {
			
		}	    
	    @And("^o sistema apresenta a mensagem de boas vindas$") 
public void  osistemaapresentaamensagemdeboasvindas() throws Throwable {
		
	
		}	    
		 */
	
@When("^optar pelo menu Conta Odontológica Cancelamento Fechamento Técnico$") 
public void  optarporselecionaromenuContaOdontológicaCancelamentoFechamentoTécnico() throws Throwable {
	//acesso contas odontologica
	//acesso cancelamento fechamento tecnico
	initiate();
	frame.sairFrame();
	frame.sairFrame();
	contas.acessoContasOdontologicas();
	contas.acessoCancelamentoFechamentoTecnico();
			
		}	    

//Scenario: Validar cancelamento do fechamento técnico 
	        @Given("^que tenha um fechamento técnico realizado$") 
	        public void  quetenhaumfechamentotécnicorealizado() throws Throwable {
	        	contas.queTenhaUmFechamentoTécnicoRealizado();
	        			
			}	
	        
			@When("^informar os dados para busca$")
			public void  informarosdadosparabusca() throws Throwable {
			contas.informarOsDadosParaBusca();
			}	
			
	        @And("^selecionar uma ou mais \"remessas\"$") 
	        public void  selecionarumaoumaisremessascancelamentofechamentotecnico() throws Throwable {
				contas.selecionarUmaOuMaisRemessasCancelamentoFechamentoTecnico();
			}	

	        @And("^selecionar executar fechamento técnico$")
	        public void  selecionarexecutarfechamentotécnico() throws Throwable {
	        	
	        	contas.clicarEmExecutarFechamentoTecnico();
	        	
	        	
	    		
			}
    
			@Then("^o sistema apresenta a tela com o job que está sendo executado$") 
			public void  osistemaapresentaateladojobqueestásendoexecutado() throws Throwable {
				
				contas.alertaExecutarCancelamentoFechamentoTecnico();
				
			}
}
			
	
