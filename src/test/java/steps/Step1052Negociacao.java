package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1052Negociacao extends UtilsSteps{


	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Negociação, Consulta Negociação$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosNegociaçãoConsultaNegociação() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.MenuNegociacao();
		menugestao.ConsultaNegociacao();
	}

	@When("^selecionar um Prestador existente para consulta de negociacao$")
	public void selecionarUmPrestadorExistenteParaConsultaDeNegociacao() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
		gestao.CodigoNegociacao();
		frame.clicar_fora("//*[@id='cod_negociacao']");
	}

	@Then("^apresenta o resultado da busca consulta negociacao$")
	public void apresentaOResultadoDaBuscaConsultaNegociacao() throws Throwable {
		gestao.ValidarConsultaNegociacao();
	}
}
