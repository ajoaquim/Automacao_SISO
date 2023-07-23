package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps1261AnexosAltorizacao extends UtilsSteps{
	
	@Given("^acesse a aba Autorização->Pedido de Autorização-> Anexos$")
	public void acesseAAbaAutorizaçãoPedidoDeAutorizaçãoAnexos() throws Throwable {
		initiate();
		work.acessoWorkflow();
		
	
	}
	
	@When("^Informar um número de pedido existente$")
	public void informarUmNúmeroDePedidoExistente() throws Throwable {
		
	}
	
	@When("^Clicar no Botão \"([^\"]*)\" em autorização$")
	public void clicarNoBotãoEmAutorização(String arg1) throws Throwable {

	}

	@When("^Clucar no botão \"([^\"]*)\" em autorização$")
	public void clucarNoBotãoEmAutorização(String arg1) throws Throwable {

	}

	@When("^Anexar documentos$")
	public void anexarDocumentos() throws Throwable {

	}

}
