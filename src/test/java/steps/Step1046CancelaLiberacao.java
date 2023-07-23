package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1046CancelaLiberacao extends UtilsSteps {

	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Gestão Prestadores Odontológicos, Cadastro Prestador , Cancela Liberação Cadastro$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosGestãoPrestadoresOdontológicosCadastroPrestadorCancelaLiberaçãoCadastro()
			throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.CadastroPrestador();
		menugestao.CancelaLiberacao();
		
	}

	@When("^Informar um\\(a\\) Prestador existente com a liberação já Cancelada$")
	public void informarUmAPrestadorExistenteComALiberaçãoJáCancelada() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
		gestao.PrestadorNaoExcluido();
		alteracao.seleciona_fora();
		
	}

	@Then("^o sistema apresenta o resultado da busca e a mensagem Prestador está em implantação em todas as operadoras\\.$")
	public void oSistemaApresentaOResultadoDaBuscaEAMensagemPrestadorEstáEmImplantaçãoEmTodasAsOperadoras()
			throws Throwable {
		Thread.sleep(2000);
		gestao.ValidarPrestadorImplantacao();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "após_Cancela1046");
	}

	@When("^Seleciono Prestador existente$")
	public void selecionoPrestadorExistente() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		
		gestao.LimparConsulta();
		
		Thread.sleep(2000);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
		
	    gestao.PrestadorCancelado();
	    alteracao.seleciona_fora();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "antes_Cancelar1046");
	}

	@When("^Selecionar a fleg Cancela$")
	public void selecionarAFlegCancela() throws Throwable {
		gestao.FlegCancelarLiberacao();
	}

	@When("^clicar no Executar$")
	public void clicarNoExecutar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		gestao.Executar();
	}

	@Then("^aplicacao apresenta a mensagem Operação realizada com sucesso$")
	public void aplicacaoApresentaAMensagemOperaçãoRealizadaComSucesso() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
	    
	    Thread.sleep(4000);
	    
	    gestao.OperacaoRealizado();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "OperaçãoRealizadacomSucesso1046");
	}

	
}
