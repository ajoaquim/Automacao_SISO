package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step16094DesbloqueioUsuario extends UtilsSteps{
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos e Desbloqueio usuário$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosEDesbloqueioUsuário() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.DesbloqueioUsuario();
		
	}

	@When("^Informar um login de usuário bloqueado do portal Candidato$")
	public void informarUmLoginDeUsuárioBloqueadoDoPortalCandidato() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		
		gestao.LimparConsulta();
		
		Thread.sleep(2000);
		
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	     frame.framePaginaInicial("//*[@id='principal2']");
	     gestao.LoginCandidato();
	     frame.clicar_fora("//*[@id='cod_usuario']");
	}

	
	@When("^clicar no botão Alterar do desbloqueio$")
	public void clicarNoBotãoAlterarDoDesbloqueio() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		gestao.Alterar();
	}



	
	@When("^o sistema apresenta a mensagem Usuário desbloqueado$")
	public void oSistemaApresentaAMensagemUsuárioDesbloqueado() throws Throwable {
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
	    
	    Thread.sleep(4000);
		gestao.ValideDesbloqueio();
	}

	@Then("^o sistema desbloqueia o login no Portal do Candidato$")
	public void oSistemaDesbloqueiaOLoginNoPortalDoCandidato() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "16094UsuarioDesbloqueioCandidato");
	}
	
	
	@When("^Informar um login de usuário bloqueado do portal Prestador$")
	public void informarUmLoginDeUsuárioBloqueadoDoPortalPrestador() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		
		gestao.LimparConsulta();
		
		Thread.sleep(2000);
		
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	     frame.framePaginaInicial("//*[@id='principal2']");
	     gestao.LoginPrestador();
	     frame.clicar_fora("//*[@id='cod_usuario']");
	}

	

	@Then("^o sistema desbloqueia o login no Portal do Prestador$")
	public void oSistemaDesbloqueiaOLoginNoPortalDoPrestador() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "16094UsuarioDesbloqueioPrestador");
	}


}
