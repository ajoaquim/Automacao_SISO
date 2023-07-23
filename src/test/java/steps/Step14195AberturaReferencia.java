package steps;

import Ultils.UtilsSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step14195AberturaReferencia extends UtilsSteps{
	
	@When("^optar por selecionar o menu Conta Odontológica, Abertura Referência$")
	public void optarPorSelecionarOMenuContaOdontológicaAberturaReferência() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		contasR.MenuContasOdontologicas();
		contasR.AberturaReferencia();
	}


	@When("^selecinar abertura de referência$")
	public void selecinarAberturaDeReferência() throws Throwable {
		contasR.ExecutarAberturaReferencia();
	}

	@Then("^a data da última referência fica com o valor da Próxima referência que passa a ter uma nova data$")
	public void aDataDaÚltimaReferênciaFicaComOValorDaPróximaReferênciaQuePassaATerUmaNovaData() throws Throwable {
		Thread.sleep(4500); 
		modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "14195AberturaReferencia");
		 
	}
	
	

}
