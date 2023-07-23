package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9260DemonstrativodePagamento extends UtilsSteps{
	
	
	@Given("^acesse a aba Conta Odontológica, Demonstrativo de Pagamento Diferenciado$")
	public void acesseAAbaContaOdontológicaDemonstrativoDePagamentoDiferenciado() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		contasR.MenuContasOdontologicas();
		contasR.DemonstrativoDePagamento();
		
	}
	
	@When("^informar o filtro desejado$")
	public void informarOFiltroDesejado() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		contasR.ReferenciaInicial();
		contasR.ReferenciaFinal();
		contasR.Prestador();
	}

	@When("^selecionar continuar$")
	public void selecionarContinuar() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		contasR.Continuar();
	}

	@Then("^o sistema apresenta em tela as remessas buscadas$")
	public void oSistemaApresentaEmTelaAsRemessasBuscadas() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9260DemonstrativodePagamento");
	}


}
