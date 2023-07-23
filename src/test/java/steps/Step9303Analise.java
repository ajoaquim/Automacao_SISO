package steps;
import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9303Analise extends UtilsSteps {

	@When("^informar um \"([^\"]*)\" já existente analise$")
	public void informarUmJáExistente(String arg1) throws Throwable {

		initiate();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.workflowAnalisePrenchersolicitação();
		
	}

	@When("^clicar fora do campo workflow$")
	public void clicarForaDoCampo() throws Throwable {
		
		work.worflowClicarEnter();
		//work.workflowAnaliseLupa();
		//frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		//frame.IniciarFrame("//*[@id='principal2']");

		//work.workflowAnaliseNSolicitacao();
		//frame.sairFrame();
		//frame.sairFrame();

		//frame.trocarJanela((String) driver.getWindowHandles().toArray()[0]);
		//frame.IniciarFrame("//*[@id='iframeasp']");
		//frame.IniciarFrame("//*[@id='principal2']");

	}

	@When("^\"([^\"]*)\" uma Solicitação$")
	public void umaSolicitação(String arg1) throws Throwable {
		
	}

	@When("^\"([^\"]*)\" a área$")
	public void aÁrea(String arg1) throws Throwable {

	}

	@When("^\"([^\"]*)\" a solicitação analise$")
	public void aSolicitação(String arg1) throws Throwable {
		work.workflowAnaliseRedirecionar();
	}

	@When("^o sistema informa \"([^\"]*)\" analise$")
	public void oSistemaInforma(String arg1) throws Throwable {

	}

	@Then("^a solicitação é enviada para a área informada$")
	public void aSolicitaçãoÉEnviadaParaAÁreaInformada() throws Throwable {

	}

	@When("^\"([^\"]*)\" uma atividade$")
	public void umaAtividade(String arg1) throws Throwable {
		work.workflowAnaliseEncerrar();

	}

	@Then("^a solicitação fica com status encerrado pelo solicitante analise$")
	public void aSolicitaçãoFicaComStatusEncerradoPeloSolicitante() throws Throwable {

	}

	@When("^registrar uma \"([^\"]*)\"$")
	public void registrarUma(String arg1) throws Throwable {
		work.workflowAnaliseAtividade();
		work.workflowAnaliseRegistrarAtividade();
	}

	@When("^\"([^\"]*)\" o registro$")
	public void oRegistro(String arg1) throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.worflowIncluir();

	}

	@Then("^a nova atividade é registrada no grid$")
	public void aNovaAtividadeÉRegistradaNoGrid() throws Throwable {
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.workflowAnaliseAccertRegistrar();
	}

	@When("^selecionar \"([^\"]*)\" analise$")
	public void selecionar(String arg1) throws Throwable {

	}

	@When("^selecionar a \"([^\"]*)\"$")
	public void selecionarA(String arg1) throws Throwable {

	}

	@Then("^o Acompanhamento de demanda é enviado para o canal informado de analise$")
	public void oAcompanhamentoDeDemandaÉEnviadoParaOCanalInformado() throws Throwable {

	}

}

