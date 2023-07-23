package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9312Reabertura extends UtilsSteps {
	@When("^informar um \"([^\"]*)\" já encerrada$")
	public void informar_um_já_encerrada(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    initiate();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
	    work.preencherSolicitacao("281");
	}

	@When("^clicar fora do campo reabertura$")
	public void clicar_fora_do_campo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^o sistema apresentar o resultado da busca$")
	public void o_sistema_apresentar_o_resultado_da_busca() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("^clicar no botão \"([^\"]*)\"$")
	public void clicar_no_botão(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.alterar();
	}

	@When("^o sistema apresenta a mensagemm \"([^\"]*)\"$")
	public void o_sistema_apresenta_a_mensagemm(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   frame.sairFrame();
	   frame.framePaginaInicial("//*[@id='iframeasp']");
	   frame.framePaginaInicial("//*[@id='principal2']");
	   work.validarMensagem("#txt_msg", "Reabertura da solicitação [0-9]* realizada.", "seletor");
	   modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3912_Reabertura_1");
	}

	@Then("^a solicitação volta para fila de análise\\.$")
	public void a_solicitação_volta_para_fila_de_análise() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
}
