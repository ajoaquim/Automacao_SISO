package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9308Encerramento extends UtilsSteps{
	 
	 
	 @When("^informar um \"([^\"]*)\" já existentes$")
	 public void informar_um_já_existente(String arg1) throws Throwable {
		 initiate();
		 frame.framePaginaInicial("//*[@id='iframeasp']");
		 frame.framePaginaInicial("//*[@id='principal2']");
		 work.preencherSolicitacao("207");
		
	 }
	 @When("^clicar fora do campoo$")
	 public void clicar_fora_do_campoo() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		  frame.clicar_fora("//*[@id='num_sac']");
		
	 }


	 @When("^\"([^\"]*)\" a solicitação$")
	 public void a_solicitação(String arg)  {
		 frame.sairFrame();
		 frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	     frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		 work.alterarSolicitacao();
			
			
	 }

	 @When("^o sistema informa \"([^\"]*)\"$")
	 public void o_sistema_informa(String arg)  {
		 frame.sairFrame();
		 frame.framePaginaInicial("//*[@id='iframeasp']");
		 frame.framePaginaInicial("//*[@id='principal2']");
		 modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3908_Encerramento_1");
	   
	 }

	 @Then("^a solicitação fica com status encerrado pelo solicitante$")
	 public void a_solicitação_fica_com_status_encerrado_pelo_solicitante() {
	     
	 
	 }
}
