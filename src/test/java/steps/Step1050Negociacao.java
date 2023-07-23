package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1050Negociacao extends UtilsSteps{
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Negociação, Cancela Negociação de Prestador$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosNegociaçãoCancelaNegociaçãoDePrestador() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.MenuNegociacao();
	}

	@When("^informar um Prestador existente$")
	public void informarUmPrestadorExistente() throws Throwable {
	   
	}

	@When("^Alterar$")
	public void alterar() throws Throwable {
	    
	}

	@Then("^Operação realizada com sucesso$")
	public void operaçãoRealizadaComSucesso() throws Throwable {
	    
	}


}
