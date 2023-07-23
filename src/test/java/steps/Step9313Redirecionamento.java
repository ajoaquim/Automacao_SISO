package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9313Redirecionamento extends UtilsSteps {
	@When("^informar um \"([^\"]*)\" já existente$")
	public void informar_um_já_existente(String arg1) throws Throwable {
	   initiate();
	   frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	 	work.preencherSolicitacao("401");
	   
	}

	@When("^clicar foraa do campoo$")
	public void clicar_foraa_do_campoo() throws Throwable {
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^o sistema apresentar o resultado da buscaaa$")
	public void o_sistema_apresentar_o_resultado_da_buscaaa() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
		String element = "//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/table/tbody/tr/td/font";
	    work.validarMensagem(element, "Redirecionamento", "xpath");
	}

	@When("^informar \"([^\"]*)\"$")
	public void informar(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^selecionar no botãoo \"([^\"]*)\"$")
	public void selecionar_no_botãoo(String arg1) throws Throwable {
		 frame.sairFrame();
		 frame.framePaginaInicial("//*[@id='iframeasp']");
		 frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		 work.executarRedirecionamento();
	    
	}

	@When("^o sistema apresenta a mensagemmm \"([^\"]*)\"$")
	public void o_sistema_apresenta_a_mensagemmm(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	    work.validarMensagem("txt_msg", "Redirecionamento da Solicitação [0-9]* realizado.", "id");
	    modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3913_Redirecionamento_1");
	}

	@Then("^a solicitação é encaminhada para a área informada$")
	public void a_solicitação_é_encaminhada_para_a_área_informada() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
