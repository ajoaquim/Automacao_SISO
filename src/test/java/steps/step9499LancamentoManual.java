package steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step9499LancamentoManual extends UtilsSteps {
	@When("^selecionar o menu Pagamento,Lançamento Manual$")
	public void selecionarOMenuPagamentoLançamentoManual() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamentoi.Menu_Pagamento();
		pagamentoi.Menu_LancamentoManual();
	}

	@When("^incluir um novo lançamento informando Adiantamento Prestador de Serviços no menu de lancamento manual$")
	public void incluirUmNovoLançamentoInformandoAdiantamentoPrestadorDeServiçosNoMenuDeLancamentoManual() throws Throwable {
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
	    pagamentoi.InformaCodPrestador();
	    pagamentoi.Referencia();
	    pagamentoi.Beneficiario("2019090010");
	    pagamentoi.DtInipag();
	    pagamentoi.Dtfimpag();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9499inicio_inclusao");
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
	    pagamentoi.BotIncluirLancamento();
	    Thread.sleep(3000);
	}

	@When("^informar os dados do lançanmento no menu de lancamento manual$")
	public void informarOsDadosDoLançanmentoNoMenuDeLancamentoManual() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
	    pagamentoi.Rubrica();
	    //pagamentoi.Referencia();
	    pagamentoi.Valorbruto();
	    pagamentoi.Dtpagprevis();
	    pagamentoi.Dtdescprevis();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9499dados_inclusao");
	    //pagamentoi.Formpag();
	}

	@When("^clicar no botão Incluir no menu de lancamento manual$")
	public void clicarNoBotãoIncluirNoMenuDeLancamentoManual() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
	    pagamentoi.BotIncluirLancamento();
	    Thread.sleep(2000);
	}

	@Then("^o sistema apresenta a mensagem Operação realizada com sucesso no menu de lancamento manual$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucessoNoMenuDeLancamentoManual() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
		String txtEsperado = "Operação realizada com sucesso. Número Item Pagamento gerado : [0-9]*";
		work.validarMensagem("txt_msg", txtEsperado, "id");
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9499Final_inclusao");
	}

	@When("^informar um número de Item de Pagamento já existente no menu de lancamento manual$")
	public void informarUmNúmeroDeItemDePagamentoJáExistenteNoMenuDeLancamentoManual() throws Throwable {
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
	    pagamentoi.Nropag();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9499item_para_consulta_lancamento");
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
	    pagamentoi.Botcontinuar();
	}

	@Then("^o sistema apresenta em tela os dados da consulta no menu de lancamento manual$")
	public void oSistemaApresentaEmTelaOsDadosDaConsultaNoMenuDeLancamentoManual() throws Throwable {
	    pagamentoi.Botvoltar();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9499consulta_lancamento");
	}

	@When("^selecionar Excluir no menu de lancamento manual$")
	public void selecionarExcluirNoMenuDeLancamentoManual() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
	    pagamentoi.Nroitem();
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
	    modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9499antes_excluir_lancamento");
	    pagamentoi.Botexcluir();
	}

	@Then("^o sistema apresentar a mensagem Operação realizada com sucesso no menu de lancamento manual$")
	public void oSistemaApresentarAMensagemOperaçãoRealizadaComSucessoNoMenuDeLancamentoManual() throws Throwable {
	    alteracao.alerta();
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
		String txtEsperado = "Operação realizada com sucesso.";
		work.validarMensagem("txt_msg", txtEsperado, "id");
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9499Final_exclusao");
	}
	
	
}