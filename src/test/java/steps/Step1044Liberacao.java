package steps;




import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1044Liberacao extends UtilsSteps {
	
	

	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Cadastro Prestador, Liberação$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosCadastroPrestadorLiberação() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.CadastroPrestador();
		menugestao.Liberacao();
		
	}

	@When("^Selecionar um Prestador existente Liberado$")
	public void selecionarUmPrestadorExistenteLiberado() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
	     frame.framePaginaInicial("//*[@id='principal2']");
	     gestao.PrestadorLiberado();
	     alteracao.seleciona_fora();
	    
	}
	
	@Then("^o sistema apresenta a mensagem Prestador já está liberado em todas as operadoras$")
	public void oSistemaApresentaAMensagemPrestadorJáEstáLiberadoEmTodasAsOperadoras() throws Throwable {
		Thread.sleep(2000);
		gestao.ValideLiberacao();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "após_liberacao1044"); 
	}

	@When("^selecionar um Prestador existente$")
	public void selecionarUmPrestadorExistente() throws Throwable {
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
	    alteracao.seleciona_fora();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "antes_liberacao1044"); 
	}

	@When("^Selecionar o fleg de liberação$")
	public void selecionarOFlegDeLiberação() throws Throwable {
		gestao.FlegLiberar(); 
	}

	@When("^clicar no botão Executar$")
	public void clicarNoBotãoExecutar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		gestao.AcaoExecutar();
	}

	@Then("^o sistema apresenta a mensagem Alteração realizada com sucesso!$")
	public void oSistemaApresentaAMensagemAlteraçãoRealizadaComSucesso() throws Throwable {
		 	frame.sairFrame();
		    frame.sairFrame();
		    frame.framePaginaInicial("//*[@id='iframeasp']");
		    frame.framePaginaInicial("//*[@id='principal2']");
			
		    Thread.sleep(2000);
		    //gestao.LiberacaoEfetuada();
		    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "alteração_liberacao1044"); 
	}



	
}
