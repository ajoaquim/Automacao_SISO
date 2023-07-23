package steps;


import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9306ConsultaGeral extends UtilsSteps {
	@When("^informar uma \"([^\"]*)\" de consulta geral já existente$")
	public void informar_uma_de_consulta_geral_já_existente(String arg1) throws Throwable {
	   initiate();
	   frame.framePaginaInicial("//*[@id='iframeasp']");
	   frame.framePaginaInicial("//*[@id='principal2']");
	   work.preencherSolicitacao("526");
	   frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^selecionar Histórico consulta geral$")
	public void selecionar_Histórico() throws Throwable {
		
		work.abrirHistorico();
	}

	@When("^o dados for apresentado em tela consultar historico consulta geral$")
	public void o_dados_for_apresentado_em_tela_consultar_historico() throws Throwable {
	   
	}

	@When("^selecionar Envio de acompanhamento de demanda consulta geral$")
	public void selecionar_Envio_de_acompanhamento_de_demanda() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.executar();
	}
	
	@When("^selecionar a forma de retorno consulta geral$")
	public void selecionar_a_forma_de_retorno() throws Throwable {
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		work.digitarEmail("teste@gmail.com");
		
	}

	@When("^selecionar Executar consulta geral$")
	public void selecionar_Executar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
	    work.enviar();
	}
	@Then("^o Acompanhamento de demanda é enviado para o canal informado consulta historico consulta geral$")
	public void o_Acompanhamento_de_demanda_é_enviado_para_o_canal_informado_consulta_historico() throws Throwable {
		String txt = "Acompanhamento de demanda enviado com sucesso para o email";
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		work.validarMensagemStatico("body > font > b > p > font", txt);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "3906_Consulta_Geral_1");
	}						  


}
