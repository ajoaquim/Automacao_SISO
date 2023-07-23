package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1240CancelamentoParcial extends UtilsSteps {

	@When("^acesse a aba Autorização Pedido de Autorização e Cancelamento Parcial$")
	public void parcial() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		auto.acessoAutorizacao();
		auto.autorizacaoCancelamentoParcial();

	}

	@When("^Informar um número de Pedido autorizado$")
	public void informarUmNúmeroDePedidoAutorizado() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoNumPedido();
		auto.autorizacaoOpcaoCancelamentoParcial();
		auto.autorizacaoObservacao();
		modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "Observacao_1240");

	}

	@When("^Clicar no Botão \"([^\"]*)\"$")
	public void clicarNoBotão(String arg1) throws Throwable {

	}

	@When("^Flegar o Procedimento para cancelamento$")
	public void flegarOProcedimentoParaCancelamento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		auto.autorizacaoBntCancelamentoParcial();

	}

	@When("^clicar no botão \"([^\"]*)\" da mensagem confirmação$")
	public void clicarNoBotãoDaMensagemConfirmação(String arg1) throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoConfirmarBntCancelamentoParcial();
		Thread.sleep(5000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "Cancelamento_Parcial_1240");
	}

	@Then("^o sitema apresenta a mensagem xxx$")
	public void oSitemaApresentaAMensagemXxx() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		auto.menuHamb();
		auto.autorizacaoAnalise();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoNumPedido();
		auto.autorizacaoAnaliseLupa();
		auto.autorizacaoAnaliseOpcao();
		// auto.autorizacaoObservacao();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		auto.autorizacaoReprocessar();
		frame.alertaObterConfirmar();

	}
	
	@When("^Clicar no Botão Continuar Cancelamento Parcial$")
	public void clicarNoBotãoContinuarCancelamentoParcial() throws Throwable {

	}

	@When("^Clicar no Botão Cancelamento Parcial$")
	public void clicarNoBotãoCancelamentoParcial() throws Throwable {

	}

}
