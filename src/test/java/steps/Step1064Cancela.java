package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1064Cancela extends UtilsSteps {
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Exclusão Operadora , Cancela$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosExclusãoOperadoraCancela() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.ExclusaoOperadora();
		menugestao.Cancela();
	    
	}

	@When("^Informou um Prestador existente não excluído$")
	public void informouUmPrestadorExistenteNãoExcluído() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
	     frame.framePaginaInicial("//*[@id='principal2']");
	     gestao.PrestadorNaoExcluido();
	     alteracao.seleciona_fora();
	  
	}

	@Then("^o sitema apresenta a mensagem Prestador não está excluído em nenhuma operadora\\.$")
	public void oSitemaApresentaAMensagemPrestadorNãoEstáExcluídoEmNenhumaOperadora() throws Throwable {
	     //gestao.NaoExcluido();
	     modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "Não_Excluido1064");
	}

	@When("^Informou um Prestador existente e Cancelado$")
	public void informouUmPrestadorExistenteECancelado() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		
		gestao.LimparConsulta();
		
		Thread.sleep(2000);
		
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		
		gestao.PrestadorSubstituto();
		alteracao.seleciona_fora();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "Antes_Cancelar1064");
	}

	@When("^Selecionar a fleg Cancelar Exclusão$")
	public void selecionarAFlegCancelarExclusão() throws Throwable {
		gestao.FlegCancelar();
	}

	@When("^Clicar no Botão Alterar$")
	public void clicarNoBotãoAlterar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		gestao.Alterar();
	}

	@Then("^o sitema apresenta a mensagem Operação realizada com sucesso$")
	public void oSitemaApresentaAMensagemOperaçãoRealizadaComSucesso() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
	    
	    Thread.sleep(4000);
	    
	    gestao.ValideOperacao();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "OperacaoRealizadaComSucesso1064");
	    
	}

}
