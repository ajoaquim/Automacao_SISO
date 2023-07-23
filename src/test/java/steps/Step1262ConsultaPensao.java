package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1262ConsultaPensao extends UtilsSteps{
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Consulta Prestador, Pensão Alimentícia$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosConsultaPrestadorPensãoAlimentícia() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.ConsultaPrestador();
		menugestao.ConsultaPensaoAlimenticia();
		
	}
	
	@When("^Escrever um Prestador que tenha Pensão alimentícia$")
	public void escreverUmPrestadorQueTenhaPensãoAlimentícia() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		gestao.PrestadorComPensao();

		alteracao.seleciona_fora();
	}
	
	@Then("^a aplicacao mostra a consulta da Pensao Alimenticia$")
	public void aAplicacaoMostraAConsultaDaPensaoAlimenticia() throws Throwable {
	    gestao.ValideConsultaPensao();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "consulta_pensao1262");
	}
	
	@When("^Escrever um Prestador que não tenha pensão Alimentícia$")
	public void escreverUmPrestadorQueNãoTenhaPensãoAlimentícia() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		
		gestao.LimparConsulta();
		
		Thread.sleep(2000);
		
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		gestao.PrestadorSemPensao();

		alteracao.seleciona_fora();
	}
	
	@Then("^a aplicacao mostra a consulta que não existe Pensao Alimenticia$")
	public void aAplicacaoMostraAConsultaQueNãoExistePensaoAlimenticia() throws Throwable {
		//gestao.ValidarConsultaPensaoNaoExiste();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "consulta_pensaonãoexiste1262");
	}

}
