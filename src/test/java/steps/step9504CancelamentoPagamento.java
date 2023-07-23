package steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step9504CancelamentoPagamento extends UtilsSteps {
	@When("^optar por selecionar o menu Pagamento,Cancelamento de pagamento$")
	public void optarPorSelecionarOMenuPagamentoCancelamentoDePagamento() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamentoi.Menu_Pagamento();
		pagamentoi.Menu_CancelamentoOrdemPagamento();
	}

	@When("^informar os dados de pesquisa no menu cancelamento de pagamento$")
	public void informarOsDadosDePesquisaNoMenuCancelamentoDePagamento() throws Throwable {
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
		pagamentoi.Nropagcancel("1451");
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9504informa_nro_pag");
	}

	@When("^selecionar continuar no menu cancelamento de pagamento$")
	public void selecionarContinuarNoMenuCancelamentoDePagamento() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
	    pagamentoi.Botcontinuar();
	}

	@When("^flegar o pagamento para cancelamento no menu cancelamento de pagamento$")
	public void flegarOPagamentoParaCancelamentoNoMenuCancelamentoDePagamento() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
		pagamentoi.Selcancelamento();
		pagamentoi.ObsCancelamento();
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9504cancelando_pagamento");
	}

	@When("^selecionar Executar no menu cancelamento de pagamento$")
	public void selecionarExecutarNoMenuCancelamentoDePagamento() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
	    pagamentoi.Botexecutar();
	}

	@When("^o sistema apresenta a mensagem Operação realizada com sucesso no menu cancelamento de pagamento$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucessoNoMenuCancelamentoDePagamento() throws Throwable {
		pagamentoi.Validabotcontinuar();		
//		frame.sairFrame();
//	    frame.sairFrame();
//	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
//	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
//		String txtEsperado = "Cancelamento(s) realizado(s) com sucesso";
//		work.validarMensagem("txt_msg", txtEsperado, "id");
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9504cancelamento_realizado");
	}

	@Then("^o em Análise RB o pagamento é apresentado como cancelado no menu cancelamento de pagamento$")
	public void oEmAnáliseRBOPagamentoÉApresentadoComoCanceladoNoMenuCancelamentoDePagamento() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    pagamentoi.Menu_Analiserb();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
	    pagamentoi.Beneficiario("2019090031");
	    pagamentoi.MesAnoPag("022020");
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
	    pagamentoi.Botcontinuar(); 
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
	    pagamentoi.MesAnotab();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9504visualiza_cancelado2");
	    
	}

	@When("^informar os dados de pesquisa de credenciado no menu cancelamento de pagamento$")
	public void informarOsDadosDePesquisaDeCredenciadoNoMenuCancelamentoDePagamento() throws Throwable {
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
		pagamentoi.Nropagcancel("1458");
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9504informa_nro_pag2");
		
		
	}

	@Then("^o em Análise o pagamento é apresentado como cancelado no menu cancelamento de pagamento$")
	public void oEmAnáliseOPagamentoÉApresentadoComoCanceladoNoMenuCancelamentoDePagamento() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    pagamentoi.Menu_Analise();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
	    pagamentoi.prestador("018864");
	    pagamentoi.MesAnoPag("022020");
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
	    pagamentoi.Botcontinuar();    
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
	    pagamentoi.MesAnotab();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9504visualiza_cancelado2");
	}
	
	
}