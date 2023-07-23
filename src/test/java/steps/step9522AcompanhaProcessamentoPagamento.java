package steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step9522AcompanhaProcessamentoPagamento extends UtilsSteps {
	@When("^optar por selecionar o menu Pagamento,Relatórios,Relatório Acompanha Processamento do Pagamento$")
	public void optarPorSelecionarOMenuPagamentoRelatóriosRelatórioAcompanhaProcessamentoDoPagamento() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamentoi.Menu_Pagamento();
		pagamentoi.Menu_Relatorios();
		pagamentoi.Menu_AcompanhaProcessamentoPagamento();
	}

	@When("^informar os dados necessários no menu acompanha processo pagamento$")
	public void informarOsDadosNecessáriosNoMenuAcompanhaProcessoPagamento() throws Throwable {
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
	    pagamentoi.InformaCodPrestador();
	    pagamentoi.DtiniProcessamento("01012020");
	    pagamentoi.DtfimProcessamento("01122020");
	    modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9522dados");
	}

	@When("^selecionar Continuar no menu acompanha processo pagamento$")
	public void selecionarContinuarNoMenuAcompanhaProcessoPagamento() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
	    pagamentoi.Botcontinuar();
	}

	@Then("^o sistema realiza o download de um arquivo txt no menu acompanha processo pagamento$")
	public void oSistemaRealizaODownloadDeUmArquivoTxtNoMenuAcompanhaProcessoPagamento() throws Throwable {
	    Thread.sleep(4000);
	    modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9522donwload_arquivo");
	}
	
	
}