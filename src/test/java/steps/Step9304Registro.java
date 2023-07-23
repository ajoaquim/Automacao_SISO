package steps;


import org.openqa.selenium.By;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9304Registro extends UtilsSteps{
	
	@When("^informar um Nº da Solicitação já existente rAtividadeee$")
	public void informarUmNºDaSolicitaçãoJáExistenteRAtividadeee() throws Throwable {
		initiate();
		 frame.framePaginaInicial("//*[@id='iframeasp']");
		 frame.framePaginaInicial("//*[@id='principal2']");
		 work.preencherSolicitacao("207");
	}

	@When("^clicar fora do campo rAtividadeee$")
	public void clicar_fora_do_campo_rAtividade() throws Throwable {
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^registrar uma Atividade em registro rAtividadeee$")
	public void registrarUmaAtividadeEmRegistroRAtividadeee() throws Throwable {
		 
	}

	@When("^Incluir o registro rAtividadeee$")
	public void incluirORegistroRAtividadeee() throws Throwable {
		frame.sairFrame();
		 frame.framePaginaInicial("//*[@id='iframeasp']");
	     frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	     work.incluirAtividade();
	}

	@Then("^a nova atividade é registrada no grid rAtividadeee$")
	public void a_nova_atividade_é_registrada_no_grid_rAtividade() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		waitVisibility(By.cssSelector("#txt_msg"));
		work.focusElement("#tbl_ocorrencias > tbody > tr:nth-child(3) > td:nth-child(1)", "a");
		
		Thread.sleep(1000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3907_RegistroCen1_1");
	}
	
	
	//Cenário B
	@When("^informar um Nº da Solicitação já existente rAtividade$")
	public void informarUmNºDaSolicitaçãoJáExistenteRAtividade() throws Throwable {

	

	     initiate();

		 frame.framePaginaInicial("//*[@id='iframeasp']");
		 frame.framePaginaInicial("//*[@id='principal2']");
		 work.preencherSolicitacao("236");
		 frame.clicar_fora("//*[@id='num_sac']");
	}
	@When("^clicar fora do campo rAtividade$")
	public void clicarForaDoCampoRAtividade() throws Throwable {
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^Redirecionar uma Solicitação rAtividade$")
	public void redirecionarUmaSolicitaçãoRAtividade() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		 frame.framePaginaInicial("//*[@id='principal2']");
		work.redirecionarAtividade();
	}

	@When("^Selecionar a área rAtividade$")
	public void selecionarAÁreaRAtividade() throws Throwable {
		
	}

	@When("^Alterar a solicitação rAtividade$")
	public void alterarASolicitaçãoRAtividade() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.alterarAtividade();
		
	}

	@When("^o sistema informa Redirecionamento da solictação realizado rAtividade$")
	public void oSistemaInformaRedirecionamentoDaSolictaçãoRealizadoRAtividade() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.validarMensagem("#txt_msg","Redirecionamento da Solicitação [0-9]* realizado.", "seletor");
	}

	@Then("^a solicitação é enviada para a área informada rAtividade$")
	public void aSolicitaçãoÉEnviadaParaAÁreaInformadaRAtividade() throws Throwable {
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3907_RegistroCen2_1");
	}
	
	//Cenário C
	
	
	@When("^informar um Nº da Solicitação já existente rAtividadee$")
	public void informarUmNºDaSolicitaçãoJáExistenteRAtividadee() throws Throwable {

		initiate();


		 frame.framePaginaInicial("//*[@id='iframeasp']");
		 frame.framePaginaInicial("//*[@id='principal2']");
		 work.preencherSolicitacao("609");
		 
	}

	@When("^clicar fora do campo rAtividadee$")
	public void clicarForaDoCampoRAtividadee() throws Throwable {
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^Encerrar uma atividade  rAtividadee$")
	public void encerrarUmaAtividadeRAtividadee() throws Throwable {
	}

	@When("^Encerrar uma atividade  rAtividadee()$")
	public void encerrarUmaAtividadeE() throws Throwable {

		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.encerrarAtividadeRA();
	}
	

	@When("^Alterar a solicitaçãorAtividade  rAtividadee$")

	public void alterarASolicitaçãorAtividadeRAtividadee() throws Throwable {
	}
	public void alterarASolicitaçãorAtividadee() throws Throwable {

		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.alterarAtividade();
	}

	@When("^o sistema informa Encerramento da solictação realizado rAtividadee$")
	public void oSistemaInformaEncerramentoDaSolictaçãoRealizadoRAtividadee() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		 
		work.validarMensagem("#txt_msg", "Encerramento da Solicitação [0-9]* realizado.", "seletor");
	}


	
	

	@Then("^a solicitação fica com status encerrado pelo solicitante  rAtividadee$$")

	public void aSolicitaçãoFicaComStatusEncerradoPeloSolicitanteRAtividadee() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		Thread.sleep(2000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3907_RegistroCen3_1");
	}
}
