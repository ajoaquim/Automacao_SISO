package steps;

import org.openqa.selenium.By;

import Ultils.UtilsSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9309Historico extends UtilsSteps{
	
	@When("^informar uma \"([^\"]*)\" já existente$")
	public void informar_uma_já_existente(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    initiate();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("211");
		
		
		
	    
	}

	@When("^selecionar \"([^\"]*)\"$")
	public void selecionar(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^o dados for apresentado em telaa$")
	public void o_dados_for_apresentado_em_telaa() throws Throwable {
	   
	
		//work.validarMensagem("//*[@id='num_sac']", "211");
	}
	

	@When("^selecionarr \"([^\"]*)\"$")
	public void selecionarr(String arg1) throws Throwable {
		 frame.sairFrame();
		 frame.framePaginaInicial("//*[@id='iframeasp']");
		 frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		 work.executar();
	}

	@When("^selecionarr a \"([^\"]*)\"$")
	public void selecionarr_a(String arg1) throws Throwable {
		String windowsHandler = driver.getWindowHandle();

		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
	
	    
	}

	@When("^selecionaarr \"([^\"]*)\"$")
	public void selecionaarr(String arg1) throws Throwable {
		frame.framePaginaInicial("//*[@id='principal2']");
		work.digitarEmail("teste@gmail.com");
	    
	}

	@Then("^o Acompanhamento de demanda é enviado para o canal informado$")
	public void o_Acompanhamento_de_demanda_é_enviado_para_o_canal_informado() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
	    work.enviar();
	    frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
	    String txt = "Acompanhamento de demanda enviado com sucesso para o email";
	    modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3909_Historico_1");
	    work.validarMensagemStatico("body > font > b > p", txt);
	}

	@When("^informar uma \"([^\"]*)\" já existentee$")
	public void informar_uma_já_existentee(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^clicarr fora do campo$")
	public void clicarr_fora_do_campo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^selecionaaar \"([^\"]*)\"$")
	public void selecionaaar(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^o Download do arquivo for realizadoo$")
	public void o_Download_do_arquivo_for_realizadoo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^os dados da tela são extraídoss em XML$")
	public void os_dados_da_tela_são_extraídoss_em_XML() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
