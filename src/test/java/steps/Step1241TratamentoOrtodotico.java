package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1241TratamentoOrtodotico extends UtilsSteps {
	
	
	@Given("^acesse a aba Autorização Pedido de Autorização e Tratamento Ortodôntico$")
	public void acesseAAbaAutorizaçãoPedidoDeAutorizaçãoETratamentoOrtodôntico() throws Throwable {
		initiate();
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		auto.acessoAutorizacao();
		auto.autorizacaoTratamentoOrtodontico();
	}

	@When("^informar um Tratamento Ortodôntico$")
	public void informarUmTratamentoOrtodôntico() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		auto.autorizacaoTratamentoOrtodonticoNumTrat();

	}
	
	@Then("^o sistema apresenta a tela do Tratamento Ortodôntico informado$")
	public void oSistemaApresentaATelaDoTratamentoOrtodônticoInformado() throws Throwable {
		auto.autorizacaoTratamentoOrtodonticoAccert();
		modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "ResultadoTratamento_1241");
	}



}
