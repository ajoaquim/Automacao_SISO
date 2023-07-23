package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9511LiberacaoPagamento extends UtilsSteps {
	
	
	String windowsHandle;
	
	
	@When("^optar por selecionar o menu Pagamento,Liberação de Pagamento RB$")
	public void optarPorSelecionarOMenuPagamentoLiberaçãoDePagamentoRB() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamentoR.MenuPagamento();
		pagamentoR.LiberacaoPagamento();
	}

	@When("^preencher os dados de pesquisa\\.$")
	public void preencherOsDadosDePesquisa() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		pagamentoR.PagamentoPrevistoInicial();
		pagamentoR.PagamentoPrevistoFim();
		pagamentoR.BeneficiarioLiberacao();
		
	}

	@When("^selecionar Continuar$")
	public void selecionarContinuar() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		pagamentoR.Continuar();
	}

	@When("^selecionar um pagamento  para liberação$")
	public void selecionarUmPagamentoParaLiberação() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		
		windowsHandle = driver.getWindowHandle();
		pagamentoR.DataDeProcessamento();
		pagamentoR.SelecionarPagamento();
		
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		
	}

	@When("^flegar o Reembolso a ser liberado$")
	public void flegarOReembolsoASerLiberado() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		
		
		Thread.sleep(4000);
		pagamentoR.SelecionarTodos();
		driver.switchTo().alert().accept();
	
	}

	@When("^Gravar as alterações$")
	public void gravarAsAlterações() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		pagamentoR.Gravar();
	}

	@When("^o valor selecionado fica na coluna Liberado$")
	public void oValorSelecionadoFicaNaColunaLiberado() throws Throwable {
		frame.trocarJanela(windowsHandle);
		}

	@When("^selecionar Processar pagamento$")
	public void selecionarProcessarPagamento() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		pagamentoR.ProcessarPagamento();
	}

	@Then("^sistema apresenta a mensagem Operação realizada com sucesso assim como o valor na coluna liberado fica zerado$")
	public void sistemaApresentaAMensagemOperaçãoRealizadaComSucessoAssimComoOValorNaColunaLiberadoFicaZerado() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		
		
		Thread.sleep(4500);
		
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9511LiberacaoPagamento");
	}

}
