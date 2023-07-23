package steps;
import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9549PreviaReembolsoSituacaoPrevia extends UtilsSteps {
	@When("^optar por selecionar o menu Reembolso Odontológico,Prévia Reembolso,Situação Prévia$")
	public void optarPorSelecionarOMenuReembolsoOdontológicoPréviaReembolsoSituaçãoPrévia() throws Throwable {
		initiate();
		frame.sairFrame();
	    frame.sairFrame();
	    reembolsoi.Menu_Reembolso();
	    reembolsoi.Menu_Previa_reembolso();
	    reembolsoi.Menu_Situacao_previa();
	}

	@When("^Selecionar a fleg Em Análise na Situação Previa Reembolso$")
	public void selecionarAFlegEmAnáliseNaSituaçãoPreviaReembolso() throws Throwable {
	    reembolsoi.BeneficiarioAnalise();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9549emanalise");
	    
	}

	@When("^Clicar no Botão Pesquisar na tela de previa reembolso$")
	public void clicarNoBotãoPesquisarNaTelaDePreviaReembolso() throws Throwable {
		reembolsoi.BotConsulta();
	}

	@When("^Clicar no Botão Abrir Tela do Anexo de Reembolso$")
	public void clicarNoBotãoAbrirTelaDoAnexoDeReembolso() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9549_janela");
	    reembolsoi.SelAbrirAnexo();
	}

	@Then("^Sistema Apresenta Tela de Anexo da Previa Reembolso$")
	public void sistemaApresentaTelaDeAnexoDaPreviaReembolso() throws Throwable {
		String windowsHandler = driver.getWindowHandle();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		reembolsoi.Txtobs();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9549_testeJanela");
		frame.fecharJanela();
		frame.trocarJanela(windowsHandler);
	}
//cenario2
	@When("^Clicar no Botão Abrir Tela de Alteração do Reembolso$")
	public void clicarNoBotãoAbrirTelaDeAlteraçãoDoReembolso() throws Throwable {
	    Thread.sleep(2000);
		reembolsoi.usubaixo();
		Thread.sleep(2000);
		reembolsoi.SelAltPrevia();
	}

	@Then("^Sistema Apresenta Tela de Alteração da Previa Reembolso\\.$")
	public void sistemaApresentaTelaDeAlteraçãoDaPreviaReembolso() throws Throwable {
		String windowsHandler = driver.getWindowHandle();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		reembolsoi.previa();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9549_testealtJanela");
		frame.fecharJanela();
		frame.trocarJanela(windowsHandler);
	}
//cenario3
	@When("^Clicar no Botão Abrir Tela de Cancelamento de Reembolso$")
	public void clicarNoBotãoAbrirTelaDeCancelamentoDeReembolso() throws Throwable {
	    reembolsoi.SelAbrirCancelamentoPrevia();
	}

	@Then("^Sistema Apresenta Tela de Cancelamento da Previa Reembolso\\.$")
	public void sistemaApresentaTelaDeCancelamentoDaPreviaReembolso() throws Throwable {
		String windowsHandler = driver.getWindowHandle();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		reembolsoi.previa();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9549_testecancelaJanela");
		frame.fecharJanela();
		frame.trocarJanela(windowsHandler);
	}
//cenario4
	@When("^Clicar no Botão Consulta Pedido de Reembolso$")
	public void clicarNoBotãoConsultaPedidoDeReembolso() throws Throwable {
	    reembolsoi.SelConsultaPrevia();
	}

	@Then("^Sistema Apresenta Tela de Consulta da Previa Reembolso\\.$")
	public void sistemaApresentaTelaDeConsultaDaPreviaReembolso() throws Throwable {
		String windowsHandler = driver.getWindowHandle();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		reembolsoi.numprevia();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9549_consultahistoricoprevia");
		frame.fecharJanela();
		frame.trocarJanela(windowsHandler);
	}
//cenario5
	@When("^Selecionar a fleg Autorizado na Situação Previa Reembolso$")
	public void selecionarAFlegAutorizadoNaSituaçãoPreviaReembolso() throws Throwable {
	    reembolsoi.BeneficiarioAutorizado();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9549_autorizado");
	}

	@When("^Clicar no Botão Abrir Tela do Anexo da Previa do Reembolso$")
	public void clicarNoBotãoAbrirTelaDoAnexoDaPreviaDoReembolso() throws Throwable {
		reembolsoi.SelAbrirAnexo();
	}

	@When("^Clicar no Botão Consulta Pedido de Previa de Reembolso$")
	public void clicarNoBotãoConsultaPedidoDePreviaDeReembolso() throws Throwable {
		reembolsoi.SelConsultaPrevia();
	}

	@When("^Selecionar uma situação exceto Status Em Análise$")
	public void selecionarUmaSituaçãoExcetoStatusEmAnálise() throws Throwable {
	   reembolsoi.BeneficiarioCancelado();
	   modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9549_cancelado");
	}
	
	@Then("^Sistema Apresenta Tela de Consulta do Reembolso\\.$")
	public void sistemaApresentaTelaDeConsultaDoReembolso() throws Throwable {
		String windowsHandler = driver.getWindowHandle();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		reembolsoi.numprevia();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9549_consultacancelado");
		frame.fecharJanela();
		frame.trocarJanela(windowsHandler);
	}

}
