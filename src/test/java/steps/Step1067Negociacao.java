package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1067Negociacao extends UtilsSteps {
		
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Consulta Prestador, Negociação$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosConsultaPrestadorNegociação() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.ConsultaPrestador();
		menugestao.Negociacao();
	
		
	}

	@When("^selecionar um Prestador existente com Negociação$")
	public void selecionarUmPrestadorExistenteComNegociação() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		
		gestao.LimparConsulta();
		
		Thread.sleep(2000);
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
	    gestao.PrestadorNegociacao();
	  
	    alteracao.seleciona_fora();
	}

	@Then("^o sistema apresenta o resultado da busca$")
	public void oSistemaApresentaOResultadoDaBusca() throws Throwable {
		gestao.RegistroEncontardo();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "consulta_negociacao_1067");
	}

	@When("^selecionar um Prestador existente sem Negociação$")
	public void selecionarUmPrestadorExistenteSemNegociação() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		
		gestao.LimparConsulta();
		
		Thread.sleep(2000);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
		
		
	    gestao.PrestadorSemNegociacao();
	    alteracao.seleciona_fora();
	}

	@Then("^o sistema apresenta o resultado da busca Nenhum registro encontrado$")
	public void oSistemaApresentaOResultadoDaBuscaNenhumRegistroEncontrado() throws Throwable {
		gestao.SemRegistroEncontardo();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "consulta_sem_negociacao1067");
	}


}
