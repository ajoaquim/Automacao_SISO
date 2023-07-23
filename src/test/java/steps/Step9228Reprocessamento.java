package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.OdontoPage;

public class Step9228Reprocessamento extends UtilsSteps {
	@When("^optar por selecionar o menu \"([^\"]*)\",\"([^\"]*)\" reprocessamento$")
	public void optarPorSelecionarOMenuReprocessamento(String arg1, String arg2) throws Throwable {
	    initiate();
	    frame.sairFrame();
	    frame.sairFrame();
	    pagamento.acessarTelas("Conta Odontológica", "Reprocessamento Prestador");
	   
	}
	
	@When("^informar um filtro desejado reprocessamento$")
	public void informarUmFiltroDesejadoReprocessamento() throws Throwable {
		frame.sairFrame();
		
	    contas.selecionarCombo("02/2020", "#MES_ANO_REF");
	}

	@When("^selecionar buscar reprocessamento$")
	public void selecionarBuscarReprocessamento() throws Throwable {
		frame.sairFrame();
		Thread.sleep(3000);
		contas.botãoBuscar();
	}

	@When("^selecionar uma remessa reprocessamento$")
	public void selecionarUmaRemessaReprocessamento() throws Throwable {
		Thread.sleep(5000);
		work.focusElement("#grid", "aa");
		Thread.sleep(2000);
		contas.selecionarRemessa();
	}

	@When("^selecionar executar reprocessamento$")
	public void selecionarExecutarReprocessamento() throws Throwable {
	    work.focusElement("#btnexecutar > i", "a");
	    contas.executarRemessa();
	    driver.switchTo().alert().accept();
	}

	@Then("^o sistema análisa a remessa automáticamente e o status da mesma é alterado reprocessamento$")
	public void oSistemaAnálisaARemessaAutomáticamenteEOStatusDaMesmaÉAlteradoReprocessamento() throws Throwable {
	   Thread.sleep(3000);
	   String txtEsperado = "Job para reprocessar";
	   contas.validarMensagemDinamico("#PROCESSO", txtEsperado, 0, 20);
	   modulo.screenshot(driver, System.currentTimeMillis(), "Odonto", "9228_Reprocessamento_1");
	}
}
