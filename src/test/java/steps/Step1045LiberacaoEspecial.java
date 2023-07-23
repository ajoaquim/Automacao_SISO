package steps;


import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1045LiberacaoEspecial extends UtilsSteps {
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Cadastro Prestador , Liberação Especial$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosCadastroPrestadorLiberaçãoEspecial() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.CadastroPrestador();
		menugestao.LiberacaoEspecial();
	}

	@When("^Passar um Prestador existente e Liberado$")
	public void passarUmPrestadorExistenteELiberado() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
	     frame.framePaginaInicial("//*[@id='principal2']");
	    gestao.PrestadorLiberado();
	    frame.clicar_fora("//*[@id='cod_prestador']");
	     
	}

	@Then("^a aplicacao apresenta a mensagem Prestador já está liberado em todas as operadoras$")
	public void aAplicacaoApresentaAMensagemPrestadorJáEstáLiberadoEmTodasAsOperadoras() throws Throwable {
		Thread.sleep(2000);
		gestao.ValideLiberacao();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "após_liberacao1044"); 
	}

	@When("^Passar um Prestador existente$")
	public void passarUmPrestadorExistente() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		
		gestao.LimparConsulta();
		
		Thread.sleep(2000);
		
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		
		
	    gestao.PrestadorExistente();
	    frame.clicar_fora("//*[@id='cod_prestador']");
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "antes_liberacao1045"); 
	}

	@When("^Clicar o fleg para Liberar$")
	public void clicarOFlegParaLiberar() throws Throwable {
		gestao.FlegLiberar();
	}

	@When("^Acessar o botão Executar$")
	public void acessarOBotãoExecutar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		gestao.AcaoExecutar();
	}

	@Then("^a aplicacao apresenta a mensagem Alteração realizada com sucesso!$")
	public void aAplicacaoApresentaAMensagemAlteraçãoRealizadaComSucesso() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
		
	    Thread.sleep(2000);
	    //gestao.LiberacaoEfetuada();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "após_liberacao1045");
	    
	}

	
	

	


}
