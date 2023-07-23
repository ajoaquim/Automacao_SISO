package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step16036Situacao extends UtilsSteps {
	// Cenário A
	@When("^Redirecionar uma Solicitação situacao$")
	public void redirecionarUmaSolicitaçãoSituacao() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.redirecionarSituacao();
	}

	@When("^Selecionar a área situacao$")
	public void selecionarAÁreaSituacao() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.alterarAtividade();
	}

	@When("^Alterar a solicitação situacao$")
	public void alterarASolicitaçãoSituacao() throws Throwable {

	}

	@When("^o sistema informa Redirecionamento da solictação realizado situacao$")
	public void oSistemaInformaRedirecionamentoDaSolictaçãoRealizadoSituacao() throws Throwable {

	}

	@Then("^a solicitação é enviada para a área informada situacao$")
	public void aSolicitaçãoÉEnviadaParaAÁreaInformadaSituacao() throws Throwable {

	}

	// Cenário B
	@When("^registrar uma Atividade situacao$")
	public void registrarUmaAtividadeSituacao() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.registrarAtividadeSituacao(
				"#dvresultado > table > tbody > tr:nth-child(32) > td:nth-child(1) > a:nth-child(2) > img");

	}

	@When("^\"([^\"]*)\" o registro situacao$")
	public void oRegistroSituacao(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.incluirAtividade();
	}

	@Then("^a nova atividade é registrada no grid situacao$")
	public void aNovaAtividadeÉRegistradaNoGridSituacao() throws Throwable {

	}

	// Cennário C
	@When("^\"([^\"]*)\" uma atividade situacao(\\d+)$")
	public void umaAtividadeSituacao(String arg1, int arg2) throws Throwable {
		initiate();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.encerrarAtividadeSituacao(
				"#dvresultado > table > tbody > tr:nth-child(26) > td:nth-child(1) > a:nth-child(3) > img");
	}

	@When("^\"([^\"]*)\" a solicitação situacao(\\d+)$")
	public void aSolicitaçãoSituacao(String arg1, int arg2) throws Throwable {

	}

	@When("^o sistema informa \"([^\"]*)\" situacao(\\d+)$")
	public void oSistemaInformaSituacao(String arg1, int arg2) throws Throwable {

	}

	@Then("^a solicitação fica com status encerrado pelo solicitante situacao(\\d+)$")
	public void aSolicitaçãoFicaComStatusEncerradoPeloSolicitanteSituacao(int arg1) throws Throwable {

	}
	// Cenario D

	@When("^selecionar Histórico situacaoo$")
	public void selecionarHistóricoSituacaoo() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.clicarHistoricoSituacao("#dvresultado > table > tbody > tr:nth-child(26) > td:nth-child(1) > a:nth-child(4) > img");
		
		
	}

	@When("^o dados for apresentado em tela situacaoo$")
	public void oDadosForApresentadoEmTelaSituacaoo() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		String element = "#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font";
		work.validarMensagem(element, "Histórico", "seletor");
	}

	@When("^selecionar Envio de acompanhamento de demanda situacaoo$")
	public void selecionarEnvioDeAcompanhamentoDeDemandaSituacaoo() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.envioAcompanhamentoSituacao();
	}

	@When("^selecionar a forma de retorno situacaoo$")
	public void selecionarAFormaDeRetornoSituacaoo() throws Throwable {
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		work.digitarEmail("teste@gmail.com");
	}

	@When("^selecionar Executar situacaoo$")
	public void selecionarExecutarSituacaoo() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		work.execuarSituacao();
	}

	@Then("^o Acompanhamento de demanda é enviado para o canal informado situacaoo$")
	public void oAcompanhamentoDeDemandaÉEnviadoParaOCanalInformadoSituacaoo() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		String element = "body > font > b > p > font";
		work.validarMensagemStatico(element,"Acompanhamento de demanda enviado com sucesso para o email");
	}
}
