package steps;
import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9545PreviaReembolsoHistorico extends UtilsSteps {
	@When("^optar por selecionar o menu Reembolso Odontológico,Prévia Reembolso,Histórico$")
	public void optarPorSelecionarOMenuReembolsoOdontológicoPréviaReembolsoHistórico() throws Throwable {
		initiate();
		frame.sairFrame();
	    frame.sairFrame();
	    reembolsoi.Menu_Reembolso();
	    reembolsoi.Menu_Previa_reembolso();
	    reembolsoi.Menu_Historico_reembolso();
	}

	@When("^informar um número de prévia existente na tela de previa reembolso historico$")
	public void informarUmNúmeroDePréviaExistenteNaTelaDePreviaReembolsoHistorico() throws Throwable {
	    reembolsoi.Informa_previa("422");
	    modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9545_informa_previa");
	    frame.sairFrame();
	    frame.sairFrame();
	}

	@When("^clicar no Botão Continuar  na tela de previa reembolso historico$")
	public void clicarNoBotãoContinuarNaTelaDePreviaReembolsoHistorico() throws Throwable {
		alteracao.BotContinuar();
		frame.sairFrame();
		frame.sairFrame();
	}

	@Then("^informações Corretas em tela de Histórico\\.$")
	public void informaçõesCorretasEmTelaDeHistórico() throws Throwable {
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    reembolsoi.previa();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9545_previa");
	}
}
