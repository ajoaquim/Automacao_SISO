package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9507ReagendaItensPorData extends UtilsSteps {
	
    @When("^optar por selecionar o menu Pagamento,Reagenda Itens por Data$") 
        public void optarporselecionaromenuPagamentoReagendaItensporData() throws Throwable {
    	initiate();
		frame.sairFrame();
		frame.sairFrame();
		
		auto.acessoPagamentoReagendaItensPorData();
		
    }

	//Scenario: Efetuar  Reagendamento via Reembolso
        @When("^opto por informar uma Operadora via Reembolso$") 
        public void optoporinformarumaOperadoraviaReembolso() throws Throwable {
        	
        }

        @And("^opto por informar uma Operadora Origem via Reembolso$") 
        public void optoporinformarumaOperadoraOrigemviaReembolso() throws Throwable {
        	
        }
        
        @And("^opto por informar a Data Prevista Original via Reembolso$")
        public void optoporinformaraDataPrevistaOriginalviaReembolso() throws Throwable {
        	
        	
        	
        	auto.optoPorInformarAdataPrevistaOriginalViaReembolso();
        	
        	
        }
 
        @And("^opto por informar a Nova Data Prevista via Reembolso$") 
        public void optoporinformaraNovaDataPrevistaviaReembolso() throws Throwable {
        	
        	auto.optoPorInformaraNovaDataPrevistaviaReembolso();
        	auto.selecionarOrigemViaReembolso();
        }

        @And("^opto em clicar em Executar via Reembolso$") 
        public void optoemclicaremExecutarviaReembolso() throws Throwable {
        	
        	
        	auto.optoEmClicarEmExecutarViaReembolso();
        	auto.alertaOptoEmClicarEmExecutarViaReembolso();
        }

        @Then("^o sistema apresenta a mensagem Operação realizada com sucesso via Reembolso$") 
      public void osistemaapresentaamensagemOperaçãorealizadacomsucessoviaReembolso() throws Throwable {
        	////-- operacao realizada com sucesso xpath //*[@id="tbl_inc_abre_table"]/center/table/tbody/tr/td/table/tbody/tr/td/p/font
        	auto.oSistemaApresentaAmensagemOperaçãoRealizadaComSucessoViaReembolso();
        }

   //Scenario: Efetuar  Reagendamento via Contas Ondontologicas
        @When("^opto por informar uma Operadora via Contas Ondontologicas$") 
        public void optoporinformarumaOperadoraviaContasOndontologicas() throws Throwable {
        	
        }

        @And("^opto por informar uma Operadora Origem via Contas Ondontologicas$") 
        public void optoporinformarumaOperadoraOrigemviaContasOndontologicas() throws Throwable {
        	
        }

        @And("^opto por informar a Data Prevista Original via Contas Ondontologicas$") 
        public void optoporinformaraDataPrevistaOriginalviaContasOndontologicas() throws Throwable {
        	auto.optoporinformaraDataPrevistaOriginalviaContasOndontologicas();
        }

        @And("^opto por informar a Nova Data Prevista via Contas Ondontologicas$") 
        public void optoporinformaraNovaDataPrevistaviaContasOndontologicas() throws Throwable {
        	auto.optoporinformaraNovaDataPrevistaviaContasOndontologicas();
        	auto.selelecionarOrigemViaContasOdontologicas();
        }

        @And("^opto em clicar em Executar via Contas Ondontologicas$") 
        public void optoemclicaremExecutarviaContasOndontologicas() throws Throwable {
        	auto.optoEmClicarEmExecutarViaReembolso();
        	auto.alertaOptoEmClicarEmExecutarViaReembolso();
        }

        @Then("^o sistema apresenta a mensagem Operação realizada com sucesso via Contas Ondontologicas$") 
        public void osistemaapresentaamensagemOperaçãorealizadacomsucessoviaContasOndontologicas() throws Throwable {
        	auto.oSistemaApresentaAmensagemOperaçãoRealizadaComSucessoViaReembolso();
        }


	
}
