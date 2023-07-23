package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1066SuspensaoBloqueioEncerrar extends UtilsSteps {
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Consulta Prestador, Suspensão/Bloqueio a Encerrar$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosConsultaPrestadorSuspensãoBloqueioAEncerrar() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.ConsultaPrestador();
		menugestao.SuspensaoBloqueioEncerrar();
	}

	@When("^digitar um período para pesquisa$")
	public void digitarUmPeríodoParaPesquisa() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		gestao.TempoPesquisa();
	}

	@When("^clicar no Continuar$")
	public void clicarNoContinuar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		gestao.Continuar();
	}

	@Then("^a aplicacao apresenta o resultado da busca$")
	public void aAplicacaoApresentaOResultadoDaBusca() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		gestao.ValideBusca();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "suspensao_bloqueio1066");
	}

}
