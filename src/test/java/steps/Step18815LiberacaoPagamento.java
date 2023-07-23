package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step18815LiberacaoPagamento extends UtilsSteps{
	String windowsHandler;
	@When("^optar por selecionar o menu Pagamento,Liberação Pagamentos por data pagamento$")
	public void optarPorSelecionarOMenuPagamentoLiberaçãoPagamentosPorDataPagamento() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamento.acessarTelas("Pagamento", "Liberação de Pagamento por Data");
	}

	@When("^informar os dados de pesquisa pagamento$")
	public void informarOsDadosDePesquisaPagamento() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	 	pagamento.preencherDatas("10102019", "01022020");
	 	pagamento.selecionarOrigem("3");
	}

	@When("^selecionar continuar pagamento$")
	public void selecionarContinuarPagamento() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	 	pagamento.clickContinuar();
		
	}

	@When("^selecionar o pagamento para liberação pagamento$")
	public void selecionarOPagamentoParaLiberaçãoPagamento() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	 	windowsHandler = driver.getWindowHandle();
		pagamento.selecionarPagamento();
		
		 

		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		pagamento.clickOpcaoPagamento();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		pagamento.gravarPagamento();
		Thread.sleep(2000);
		frame.trocarJanela(windowsHandler);
	}

	@When("^selecionar Executar pagamento$")
	public void selecionarExecutarPagamento() throws Throwable {
		
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	 	pagamento.processarPagamento();
	}

	@When("^o sistema apresenta a mensagem Operação realizada com sucesso pagamento$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucessoPagamento() throws Throwable {
		String element = "#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > p > font";
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	 	Thread.sleep(5000);
		work.validarMensagem(element, "Operação realizada com sucesso.", "seletor");
	}

	@Then("^em Análise o pagamento é apresentado como calculado pagamento$")
	public void emAnáliseOPagamentoÉApresentadoComoCalculadoPagamento() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "18815_Pagamento_1");
	}
//Cenario B
	
	@When("^informar os dados de pesquisa pagamentooo$")
	public void informarOsDadosDePesquisaPagamentooo() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	 	pagamento.preencherDatas("10102019", "01022020");
	 	pagamento.selecionarOrigem("1");
	}

	@When("^selecionar continuar pagamentooo$")
	public void selecionarContinuarPagamentooo() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	 	pagamento.clickContinuar();
	}

	@When("^selecionar o pagamento para liberação pagamentooo$")
	public void selecionarOPagamentoParaLiberaçãoPagamentooo() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	 	windowsHandler = driver.getWindowHandle();
		pagamento.selecionarPagamento();
		
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		pagamento.clickOpcaoPagamento();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		pagamento.gravarPagamento();
		Thread.sleep(2000);
		frame.trocarJanela(windowsHandler);
	}

	@When("^selecionar \"([^\"]*)\" pagamentooo$")
	public void selecionarPagamentooo(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	 	pagamento.processarPagamento();
	}

	@When("^o sistema apresenta a mensagem \"([^\"]*)\" pagamentooo$")
	public void oSistemaApresentaAMensagemPagamentooo(String arg1) throws Throwable {
		String element = "#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > p > font";
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	 	Thread.sleep(5000);
		work.validarMensagem(element, "Operação realizada com sucesso.", "seletor");
	}	

	@Then("^em \"([^\"]*)\" o pagamento é apresentado como calculado pagamentooo$")
	public void emOPagamentoÉApresentadoComoCalculadoPagamentooo(String arg1) throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "18815_PagamentoCn2_1");
	}

}
