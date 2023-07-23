package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9307ConsultaPropria extends UtilsSteps {
	@When("^informar um \"([^\"]*)\" já existenteee$")
	public void informar_um_já_existenteee(String arg1) throws Throwable {
	   initiate();
	   frame.framePaginaInicial("//*[@id='iframeasp']");
	   frame.framePaginaInicial("//*[@id='principal2']");
	   work.preencherSolicitacao("657");
	}

	@When("^clicar fora do campooo$")
	public void clicar_fora_do_campooo() throws Throwable {
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^\"([^\"]*)\" uma Solicitaçãoo$")
	public void uma_Solicitaçãoo(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.redirecionar();
		
	}

	@When("^\"([^\"]*)\" a áreaa$")
	public void a_áreaa(String arg1) throws Throwable {
	   
	 
	}

	@When("^\"([^\"]*)\" a solicitaçãooo$")
	public void a_solicitaçãooo(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.alterar();
		
	   
	}

	@When("^o sistema informaa \"([^\"]*)\"$")
	public void o_sistema_informaa(String arg1) throws Throwable {

		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3907_Consulta_Propria_1");
	}

	@Then("^a solicitaçãoo é enviada para a área informada$")
	public void a_solicitaçãoo_é_enviada_para_a_área_informada() throws Throwable {
	
	
	}
	//Cenário B
	
	@When("^informar um Nº da Solicitação já existente consultaP$")
	public void informarUmNºDaSolicitaçãoJáExistenteConsultaP() throws Throwable {
		initiate();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("218");
	}

	@When("^clicar fora do campo consultaP$")
	public void clicarForaDoCampoConsultaP() throws Throwable {
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^registrar uma \"([^\"]*)\" consultaP$")
	public void registrarUmaConsultaP(String arg1) throws Throwable {
	     frame.sairFrame();
		 frame.framePaginaInicial("//*[@id='iframeasp']");
		 frame.framePaginaInicial("//*[@id='principal2']");
		 work.atividadeCP();
	}

	@When("^\"([^\"]*)\" o registro consultaP$")
	public void oRegistroConsultaP(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.incluirAtividadeCP();
	}

	@Then("^a nova atividade é registrada no grid consultaP$")
	public void aNovaAtividadeÉRegistradaNoGridConsultaP() throws Throwable {
		 frame.sairFrame();
		 frame.framePaginaInicial("//*[@id='iframeasp']");
		 frame.framePaginaInicial("//*[@id='principal2']");
		 work.focusElement("#tbl_ocorrencias > tbody > tr:nth-child(3) > td:nth-child(1)", "a");
		 Thread.sleep(1500);
		 modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3907_Consulta_Propria2_1");
		
		
	}
	//Cenário C
	@When("^informar um Nº da Solicitação já existente consultaPP$")
	public void informarUmNºDaSolicitaçãoJáExistenteConsultaPP() throws Throwable {
		initiate();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("658");
	}

	@When("^clicar fora do campo consultaPP$")
	public void clicarForaDoCampoConsultaPP() throws Throwable {
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^\"([^\"]*)\" uma atividade consultaPP$")
	public void umaAtividadeConsultaPP(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.encerrarAtividadeCP();
	}

	@When("^\"([^\"]*)\" a solicitação consultaPP$")
	public void aSolicitaçãoConsultaPP(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.alterarAtividadeCP();
	}

	@When("^o sistema informa Encerramento da solictação realizado consultaPP$")
	public void oSistemaInformaEncerramentoDaSolictaçãoRealizadoConsultaPP() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		Thread.sleep(4000);
		work.validarMensagem("#txt_msg","Encerramento da Solicitação [0-9]* realizado.", "seletor");
	  
	}

	@Then("^a solicitação fica com status encerrado pelo solicitante consultaPP$")
	public void aSolicitaçãoFicaComStatusEncerradoPeloSolicitanteConsultaPP() throws Throwable {
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3907_Consulta_Propria3_1");
	}
	
	//Cenario D
	@When("^informar um Nº da Solicitação já existente ccPropria$")
	public void informarUmNºDaSolicitaçãoJáExistenteCcPropria() throws Throwable {
		initiate();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("626");
	}

	@When("^selecionar Histórico ccPropria$")
	public void selecionarHistóricoCcPropria() throws Throwable {
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^o dados for apresentado em tela ccPropria$")
	public void oDadosForApresentadoEmTelaCcPropria() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.historicoCP();
	}

	@When("^selecionar Envio de acompanhamento de demanda ccPropria$")
	public void selecionarEnvioDeAcompanhamentoDeDemandaCcPropria() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.envioAcompanhamentoCP();
	}

	@When("^selecionar a forma de retorno , <canal> e <Complemento> ccPropria$")
	public void selecionarAFormaDeRetornoCanalEComplementoCcPropria() throws Throwable {
		
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		work.digitarEmail("teste@gmail.com");
		
		
	}

	@When("^selecionar Executar ccPropria$")
	public void selecionarExecutarCcPropria() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		work.executarCP();
	}

	@Then("^o Acompanhamento de demanda é enviado para o canal informado ccPropria$")
	public void oAcompanhamentoDeDemandaÉEnviadoParaOCanalInformadoCcPropria() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		String txt = "Acompanhamento de demanda enviado com sucesso para o email";
		Thread.sleep(4000);
	    work.validarMensagemStatico("body > font > b > p > font", txt);
	    Thread.sleep(1000);
	    modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3907_ConsultaPropria_1");
	}



}
