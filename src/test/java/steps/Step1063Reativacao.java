package steps;


import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1063Reativacao extends UtilsSteps{
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Exclusão Operadora, Reativação$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosExclusãoOperadoraReativação() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.ExclusaoOperadora();
		menugestao.Reativacao();
	}

	@When("^Escrever um Prestador existente e Ativo$")
	public void escreverUmPrestadorExistenteEAtivo() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		gestao.PrestadorNaoExcluido();
	    alteracao.seleciona_fora();
	}

	@Then("^A aplicacao apresenta que o Prestador não está excluído em nenhuma operadora\\.$")
	public void aAplicacaoApresentaQueOPrestadorNãoEstáExcluídoEmNenhumaOperadora() throws Throwable {
		//gestao.ValidarPrestadorNaoExcluido();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "nao_excluido1063");
	}

	@When("^Informar um Prestador existente e Cancelado$")
	public void informarUmPrestadorExistenteECancelado() throws Throwable {
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
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "antes_reativacao1063"); 
	}

	@When("^Selecionar a fleg Reativar e informar dataReativação$")
	public void selecionarAFlegReativarEInformarDataReativação() throws Throwable {
	   gestao.FlegReativar();
	   gestao.DataReativacao();
	}

	@When("^Selecionar o botao Alterar$")
	public void selecionarOBotaoAlterar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		gestao.Alterar();
	}

	@Then("^A aplicacao apresenta Operação realizada com sucesso$")
	public void aAplicacaoApresentaOperaçãoRealizadaComSucesso() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
		
		Thread.sleep(2000);
		//gestao.ValideOperacao();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "apos_reativacao1063"); 
	}
	
	

}
