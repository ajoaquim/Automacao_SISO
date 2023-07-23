package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps1282CancelamentoAutorizacao extends UtilsSteps {

	@Given("^acesse a aba Autorização->Pedido de Autorização-> Cancelamento Parcial$")
	public void acesseAAbaAutorizaçãoPedidoDeAutorizaçãoCancelamentoParcial() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		auto.acessoAutorizacao();
		auto.autorizacaoCancelamentoParcial();
	}

	@When("^Informar um número de pedido existente na tela cancelar$")
	public void informarUmNúmeroDePedidoExistenteNaTelaCancelar() throws Throwable {

		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoNumPedido();
	}

	@When("^Clicar no Botão Continuar na tela cancelar$")
	public void clicarNoBotãoContinuarNaTelaCancelar() throws Throwable {
		try {
			auto.autorizacaoOpcaoCancelamentoParcial();
			auto.autorizacaoObservacao();
			modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "Observacao_1240");
			frame.sairFrame();
			frame.sairFrame();
			frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
			auto.autorizacaoBntCancelamentoParcial();
		} catch (Exception ex) {

		}
	}

	@Then("^o sistema apresenta o resultado da busca na tela cancelar$")
	public void oSistemaApresentaOResultadoDaBuscaNaTelaCancelar() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoConfirmarBntCancelamentoParcial();
		Thread.sleep(5000);

		// menu
		frame.sairFrame();
		frame.sairFrame();
		auto.menuHamb();
		auto.autorizacaoAnalise();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoNumPedido();
		auto.autorizacaoAnaliseLupa();
		// revert
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		Thread.sleep(2000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "Cancelamento_Parcial_1282");
		auto.autorizacaoVoltarSituacao();

		// situacao
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoConfirmarVoltarSituacao();
		// auto.autorizacaoAnaliseOpcao();

		// frame.sairFrame();
		// frame.sairFrame();
		// frame.framePaginaInicial("//*[@id='iframeasp']");
		// frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		// auto.autorizacaoReprocessar();
		// frame.alertaObterConfirmar();

		frame.sairFrame();
		frame.sairFrame();

	}

	@When("^Informar um número de pedido Autorizado$")
	public void informarUmNúmeroDePedidoAutorizado() throws Throwable {

		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoNumPedidoAutorizado();

	}

	@When("^Clicar no Botão Cancelar na tela cancelar$")
	public void clicarNoBotãoCancelarNaTelaCancelar() throws Throwable {

	}

	@When("^Preencher campos na tela cancelar$")
	public void preencherCamposNaTelaCancelar() throws Throwable {
		try {
			auto.autorizacaoOpcaoCancelamentoParcial();
			Thread.sleep(3000);
			auto.autorizacaoObservacao();
			modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "Observacao_1240");
			frame.sairFrame();
			frame.sairFrame();
			frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
			auto.autorizacaoBntCancelamentoParcial();
		} catch (Exception ex) {

		}

	}

	@When("^Clicar no Botão Cancelar Pedido Autorizado$")
	public void clicarNoBotãoCancelarPedidoAutorizado() throws Throwable {

	}

	@Then("^o sitema apresenta a mensagem Cancelamento realizado$")
	public void oSitemaApresentaAMensagemCancelamentoRealizado() throws Throwable {

		try {
			frame.sairFrame();
			frame.sairFrame();
			frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='principal2']");
			auto.autorizacaoConfirmarBntCancelamentoParcial();
			Thread.sleep(5000);

			// menu
			frame.sairFrame();
			frame.sairFrame();
			auto.menuHamb();
			auto.autorizacaoAnalise();
			frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='principal2']");
			auto.autorizacaoNumPedido();
			auto.autorizacaoAnaliseLupa();
			// revert
			frame.sairFrame();
			frame.sairFrame();
			frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
			Thread.sleep(2000);
			modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "Cancelamento_1282");
			auto.autorizacaoVoltarSituacao();

			// situacao
			frame.sairFrame();
			frame.sairFrame();
			frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='principal2']");
			auto.autorizacaoConfirmarVoltarSituacao();
			// auto.autorizacaoAnaliseOpcao();

			// frame.sairFrame();
			// frame.sairFrame();
			// frame.framePaginaInicial("//*[@id='iframeasp']");
			// frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
			// auto.autorizacaoReprocessar();
			// frame.alertaObterConfirmar();

			frame.sairFrame();
			frame.sairFrame();
		} catch (Exception ex) {

		}

	}

	@When("^Informar um número de pedido em análise$")
	public void informarUmNúmeroDePedidoEmAnálise() throws Throwable {

		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoNumPedido();

	}

	@When("^Clicar no Botão Cancelar Pedido em Analise$")
	public void clicarNoBotãoCancelarPedidoEmAnalise() throws Throwable {

	}

	@When("^Informar um número de pedido Negado$")
	public void informarUmNúmeroDePedidoNegado() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoNumPedidoNegado();

	}

	@Then("^o sitema apresenta a mensagem \"([^\"]*)\"$")
	public void oSitemaApresentaAMensagem(String arg1) throws Throwable {

		modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "Cancelamento_PedidoNegado_1282");

	}

	@When("^Clicar no Botão Continuar na tela cancelar Autorização$")
	public void clicarNoBotãoContinuarNaTelaCancelar_() throws Throwable {

	}

}
