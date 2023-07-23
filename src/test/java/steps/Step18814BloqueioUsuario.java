package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step18814BloqueioUsuario extends UtilsSteps {
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Bloqueio de usuário$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosBloqueioDeUsuário() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.BloqueioUsuario();
	}

	@Given("^que tenho um login Candidato cadastrado$")
	public void queTenhoUmLoginCandidatoCadastrado() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		gestao.LimparConsulta();
	}

	@When("^informar o candidato desejado e clicar em Alterar$")
	public void informarOCandidatoDesejadoEClicarEmAlterar() throws Throwable {
		Thread.sleep(2000);
		
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
	    gestao.LoginCandidato();
	    frame.clicar_fora("//*[@id='cod_usuario']");
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "18814UsuarioCandidato");
	    
	    
	    frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		gestao.Alterar();
	    
	}

	@Then("^o sistema irá exibir Usuário Bloqueado$")
	public void oSistemaIráExibirUsuárioBloqueado() throws Throwable {
		//gestao.ValideBloqueio();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "18814UsuarioBloqueado");
	}

	@Given("^que tenho um login Prestador cadastrado$")
	public void queTenhoUmLoginPrestadorCadastrado() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		
		gestao.LimparConsulta();
		
	}

	@When("^informar o prestador desejado e clicar em Alterar$")
	public void informarOPrestadorDesejadoEClicarEmAlterar() throws Throwable {
		Thread.sleep(2000);
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		gestao.LoginPrestador();
		frame.clicar_fora("//*[@id='cod_usuario']");

		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "18814UsuarioPrestador");

		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");

		gestao.Alterar();
	}


}
