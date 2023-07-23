package steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.ContasOdontologicasi;

public class step9214AlteracaoDataPrevistaPgto extends UtilsSteps {
	@When("^optar por selecionar o menu Conta Odontológica,Alteração Data Prevista Pagto$")
	public void optarPorSelecionarOMenuContaOdontológicaAlteraçãoDataPrevistaPagto() throws Throwable {
		initiate();
		frame.sairFrame();
	    frame.sairFrame();
	   contasodontologicasi.Menu_contas_odontologicas();
	   contasodontologicasi.Menu_contas_Alteradtpag();
	}

	@When("^realizar o filtro para busca da remessa na tela de alteracao data prevista pgto$")
	public void realizarOFiltroParaBuscaDaRemessaNaTelaDeAlteracaoDataPrevistaPgto() throws Throwable {
		contasodontologicasi.ValidaReferencia();
	    contasodontologicasi.SelReferencia();
	    contasodontologicasi.SelOperadora();
	}

	@When("^selecinar continuar na tela de alteracao data prevista pgto$")
	public void selecinarContinuarNaTelaDeAlteracaoDataPrevistaPgto() throws Throwable {
	    contasodontologicasi.botcontinuar();
	}

	@When("^selecionar uma Remessa na tela de alteracao data prevista pgto$")
	public void selecionarUmaRemessaNaTelaDeAlteracaoDataPrevistaPgto() throws Throwable {
	    Thread.sleep(4000);
	    contasodontologicasi.Selremessa();
	    modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9214antesalterar");
	}

	@When("^realizar a alteração das datas na tela de alteracao data prevista pgto$")
	public void realizarAAlteraçãoDasDatasNaTelaDeAlteracaoDataPrevistaPgto() throws Throwable {
	    contasodontologicasi.SelAltReferencia();
	    contasodontologicasi.Altdtpag();
	    modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9214depoisalterar");
	}

	@When("^selecionar executar na tela de alteracao data prevista pgto$")
	public void selecionarExecutarNaTelaDeAlteracaoDataPrevistaPgto() throws Throwable {
	    contasodontologicasi.botexecutar();
	    alteracao.alerta();
	}

	@Then("^o sistema apresenta um pop-up com as alterações realizadas na tela de alteracao data prevista pgto$")
	public void oSistemaApresentaUmPopUpComAsAlteraçõesRealizadasNaTelaDeAlteracaoDataPrevistaPgto() throws Throwable {
		contasodontologicasi.validabotfechar();
		modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9214fimalteracao");
		contasodontologicasi.botfechar();
	}
}