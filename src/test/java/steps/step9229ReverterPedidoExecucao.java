package steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.ContasOdontologicasi;

public class step9229ReverterPedidoExecucao extends UtilsSteps {
	@When("^acesse a aba Autorização/Pedido de Autorização/Reverte Confirmação de Execução$")
	public void acesseAAbaAutorizaçãoPedidoDeAutorizaçãoReverteConfirmaçãoDeExecução() throws Throwable {
		initiate();
		frame.sairFrame();
	    frame.sairFrame();
	    contasodontologicasi.Menu_contas_odontologicas();
	    contasodontologicasi.Menu_contas_ReverterPedido();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
	}

	@When("^informar um pedido autorizado e com confirmação de execução reverter pedido menu contas odontologicos$")
	public void informarUmPedidoAutorizadoEComConfirmaçãoDeExecuçãoReverterPedidoMenuContasOdontologicos() throws Throwable {
	    contasodontologicasi.NumPedido("697");
	    modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9229_informa_pedido_backoffice");
	}

	@When("^clicar fora do campo reverter pedido menu contas odontologicos$")
	public void clicarForaDoCampoReverterPedidoMenuContasOdontologicos() throws Throwable {
	    contasodontologicasi.TabPedido();
	}

	@When("^selecionar o procedimento para reversão$")
	public void selecionarOProcedimentoParaReversão() throws Throwable {
		Thread.sleep(2000);
	    contasodontologicasi.Procedimentos();
	    Thread.sleep(2000);
	    modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9229_Seleciona_procedimento");
	}

	@When("^clicar no botão Reverte Confirmação de Execução reverter pedido menu contas odontologicos$")
	public void clicarNoBotãoReverteConfirmaçãoDeExecuçãoReverterPedidoMenuContasOdontologicos() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
		contasodontologicasi.botreverter();
	}

	@When("^clicar no botão ok reverter pedido menu contas odontologicos$")
	public void clicarNoBotãoOkReverterPedidoMenuContasOdontologicos() throws Throwable {
	    alteracao.alerta();
	}

	@Then("^o sistema apresenta a mensagem Atenção: Reversão da confirmacão do pedido realizada\\.$")
	public void oSistemaApresentaAMensagemAtençãoReversãoDaConfirmacãoDoPedidoRealizada() throws Throwable {
	    contasodontologicasi.botAcaoContinuar();
	    modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9229_final");
	}

	@When("^informar um pedido autorizado vindo do portal e com confirmação de execução$")
	public void informarUmPedidoAutorizadoVindoDoPortalEComConfirmaçãoDeExecução() throws Throwable {
		contasodontologicasi.NumPedido("714");
	    modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9229_informa_pedido_portal");
	}
	
	}
