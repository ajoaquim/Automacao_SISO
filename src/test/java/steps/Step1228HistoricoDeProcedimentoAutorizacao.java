package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1228HistoricoDeProcedimentoAutorizacao  extends UtilsSteps {
	@Then("^o sistema apresenta a tela de Histórico de Procedimento$")
	public void oSistemaApresentaATelaDeHistóricoDeProcedimento() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Historico", "HistoricoPedido");

	}
	
	@Given("^acesse a aba Autorização Pedido de Autorização e Histórico de Procedimento$")
	public void acesseAAbaAutorizaçãoPedidoDeAutorizaçãoEHistóricoDeProcedimento() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		auto.acessoAutorizacao();
		auto.autorizacaoHistoricoDeProcedimentos();
	
	}

	@When("^informar um \"([^\"]*)\" já existente no historico de procedimento$")
	public void informarUmJáExistenteNoHistoricoDeProcedimento(String arg1) throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoHistoricoDeProcedimentosBenef();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		auto.executarHistPod();

	}

	@When("^clicar no botão F(\\d+) - Executar$")
	public void clicarNoBotãoFExecutar(int arg1) throws Throwable {
	}



}
