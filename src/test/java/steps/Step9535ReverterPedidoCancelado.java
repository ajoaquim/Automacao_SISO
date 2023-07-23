package steps;

import Ultils.UtilsSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9535ReverterPedidoCancelado extends UtilsSteps {

	@When("^optar por selecionar o menu Reembolso Odontológico, Reverter Pedido Cancelado$")
	public void optarPorSelecionarOMenuReembolsoOdontológicoReverterPedidoCancelado() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		reembolsoR.ReembolsoOndotologico();
		reembolsoR.ReverterPedidoCancelado();
	}

	@When("^Informar um Reembolso Cancelado$")
	public void informarUmReembolsoCancelado() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		
		reembolsoR.ReembolsoCancelado();
	}

	@When("^Clicar no Botão Continuar Cancelado$")
	public void clicarNoBotãoContinuarCancelado() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		reembolsoR.ContinuarReverter();
	}

	@When("^Clicar no Botão Reverter Cancelado$")
	public void clicarNoBotãoReverterCancelado() throws Throwable {
		reembolsoR.ReverterClick();
		Thread.sleep(2000);
	}

	@When("^Sistema Apresenta a mensagem Confirma reverter cancelamento do pedido de reembolso\\?$")
	public void sistemaApresentaAMensagemConfirmaReverterCancelamentoDoPedidoDeReembolso() throws Throwable {
		
	}

	@When("^Clicar no Botão OK Cancelado$")
	public void clicarNoBotãoOKCancelado() throws Throwable {
		driver.switchTo().alert().accept();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9535ConfirmaReverterCancelamento");
	}

	@When("^O Sistema apresenta a mensagem Atenção: Cancelamento do pedido revertido com sucesso\\.$")
	public void oSistemaApresentaAMensagemAtençãoCancelamentoDoPedidoRevertidoComSucesso() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9535CancelamentodoPedidoRevertidoComSucesso");
	}

	@When("^Clicar no Menu Histórico$")
	public void clicarNoMenuHistórico() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		reembolsoR.Historico();
	}

	@When("^Informar o número de Reembolso$")
	public void informarONúmeroDeReembolso() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		
		reembolsoR.ReembolsoHistorico();
		frame.clicar_fora("//*[@id='num_reembolso']");
	}

	@Then("^O Sistema Apresenta o Status Em Análise$")
	public void oSistemaApresentaOStatusEmAnálise() throws Throwable {
		reembolsoR.ValidarHistorico();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9535StatusEmAnalise");
	}

	@When("^Informar um Reembolso Em Análise$")
	public void informarUmReembolsoEmAnálise() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
	
		reembolsoR.ReembolsoCancelado();
		frame.clicar_fora("//*[@id=\"num_reembolso\"]");
	}

	@When("^Clicar no Botão Continuar Análise$")
	public void clicarNoBotãoContinuarAnálise() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		reembolsoR.ContinuarReverter();
	}

	@Then("^O Sistema apresenta a mensagem  Atenção: Não é possível Reverter Cancelamento pois pedido está na situação Em análise$")
	public void oSistemaApresentaAMensagemAtençãoNãoÉPossívelReverterCancelamentoPoisPedidoEstáNaSituaçãoEmAnálise()
			throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9535AnaliseNaoPossivelReverter");
	}
	
	@When("^informar um reembolso existente não vinculado ao usuario assumir$")
	public void informarUmReembolsoExistenteNãoVinculadoAoUsuarioAssumir() throws Throwable {
		
		reembolsoR.CancelamentoPedidoReembolso();
		
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		
		reembolsoR.ReembolsoHistorico();
		
		frame.clicar_fora("//*[@id=\"num_reembolso\"]");
	}
	
	
	@When("^o sistem mostrar o pop up com a mensagem Deseja assumir o pedido do reembolso\\?Assumindo o pedido do reembolso, a mesma ficará bloqueada para seu usuário até que seja finalizada sua alteração assumir$")
	public void oSistemMostrarOPopUpComAMensagemDesejaAssumirOPedidoDoReembolsoAssumindoOPedidoDoReembolsoAMesmaFicaráBloqueadaParaSeuUsuárioAtéQueSejaFinalizadaSuaAlteraçãoAssumir() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9535PopupAssumirpedido");
	}
	
	@When("^clicar em Assumir Reembolso$")
	public void clicarEmAssumirReembolso() throws Throwable {
		reembolsoR.Assumir();
		
	
	}
	

	@Then("^o sistema abre o pedido de reembolso assumir$")
	public void oSistemaAbreOPedidoDeReembolsoAssumir() throws Throwable {
		reembolsoR.ValidarHistorico();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9532ReembolsoAssumir");
	}

	


	

}
