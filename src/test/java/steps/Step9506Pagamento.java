package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9506Pagamento extends UtilsSteps {
	@When("^optar por selecionar o menu \"([^\"]*)\",\"([^\"]*)\" pagamento$")
	public void optarPorSelecionarOMenuPagamento(String arg1, String arg2) throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamento.acessarPagamento();
		pagamento.subMenuPagamento("Análise");
	}

	@When("^informar os dados de pesquisa pagamentoooo$")
	public void informarOsDadosDePesquisaPagamentoooo() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		pagamento.preencherPrestador("011215");
		frame.clicar_fora("//*[@id=\"cod_prestador\"]");
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		
		pagamento.preencherReferencia("022020");
		
		
		
	}

	@When("^selecionar continuar pagamentoooo$")
	public void selecionarContinuarPagamentoooo() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		pagamento.clickContinuar();
		
	}

	@Then("^o sistema apresenta em tela os pagamentos enviados durante o período informado\\. pagamentoooo$")
	public void oSistemaApresentaEmTelaOsPagamentosEnviadosDuranteOPeríodoInformadoPagamentoooo() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9506_Analise2_1");
	}


}
