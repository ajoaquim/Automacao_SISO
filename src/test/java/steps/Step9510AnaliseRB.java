package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9510AnaliseRB extends UtilsSteps{
	
	
	@When("^optar por selecionar o menu Pagamento,Análise RB$")
	public void optarPorSelecionarOMenuPagamentoAnáliseRB() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamentoR.MenuPagamento();
		pagamentoR.AnaliseRB();
	}

	@When("^informar os dados de pesquisa RB$")
	public void informarOsDadosDePesquisaRB() throws Throwable {
		frame.mudarModalPrincipalSISO();
		pagamentoR.BeneficiarioLiberacao();
		frame.clicar_fora("//*[@id='num_associado']");
		
		Thread.sleep(4500);
		pagamentoR.MesAno();
	}

	@When("^selecionar continuar RB$")
	public void selecionarContinuarRB() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		pagamentoR.Continuar();
	}

	@Then("^o sistema apresenta em tela os reembolso enviados para pagamento durante o período informado\\.$")
	public void oSistemaApresentaEmTelaOsReembolsoEnviadosParaPagamentoDuranteOPeríodoInformado() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		
		work.validarMensagem("#form01 > table:nth-child(4) > tbody > tr > td > table > tbody > tr > td.grid_cabec > h1 > label > font > b", " Pagamentos Gerados", "seletor");
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9510AnaliseRB");
	}



}
