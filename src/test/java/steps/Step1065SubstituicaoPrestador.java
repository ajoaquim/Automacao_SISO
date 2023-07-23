package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step1065SubstituicaoPrestador extends UtilsSteps{
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Exclusão Operadora, Substituição de Prestador$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosExclusãoOperadoraSubstituiçãoDePrestador()
			throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.ExclusaoOperadora();
		menugestao.SubstituicaoPrestador();
		
	}

	@When("^Selecionar um Prestador Ativo$")
	public void selecionarUmPrestadorAtivo() throws Throwable {
	     gestao.PrestadorSubstituto();
	     
	}

	@When("^selecionar operadora e motivo exclusão$")
	public void selecionarOperadoraEMotivoExclusão() throws Throwable {
		Thread.sleep(5000);
		gestao.Operadora();
		Thread.sleep(5000);
		gestao.Exclusao();
	}

	@When("^selecionar flag emitir carta$")
	public void selecionarFlagEmitirCarta() throws Throwable {
		gestao.Emitir();
	}

	@When("^informar observacao$")
	public void informarObservacao() throws Throwable {
		gestao.Observacao();
	}
	
	@When("^clicar no Salvar$")
	public void clicarNoSalvar() throws Throwable {
		gestao.SalvarSubstituicao();
	}


	@When("^o sistema apresenta a mensagem Exclusão realizada com sucesso\\. Indique um prestador substituto\\.$")
	public void oSistemaApresentaAMensagemExclusãoRealizadaComSucessoIndiqueUmPrestadorSubstituto() throws Throwable {
		 modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "exclusao_com_sucesso1065");
	}

	@When("^clicar em Pesquisa Geral$")
	public void clicarEmPesquisaGeral() throws Throwable {

	}

	@When("^Escolher um Prestador clicar na Fleg Substituto$")
	public void escolherUmPrestadorClicarNaFlegSubstituto() throws Throwable {
		gestao.FlegSubstituicao();
		gestao.Substituto();
	}

	@Then("^Automáticamente o sistema apresenta a mensagem Operação realizada com sucesso$")
	public void automáticamenteOSistemaApresentaAMensagemOperaçãoRealizadaComSucesso() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "automaticamente_OperacaoRealizadacomSucesso1065");
	}

	@When("^Selecionar um Prestador  Ativo já Substituido$")
	public void selecionarUmPrestadorAtivoJáSubstituido() throws Throwable {
		gestao.PrestadorSubstituto();
	}

	@When("^Selecionar a operadora$")
	public void selecionarAOperadora() throws Throwable {
		gestao.Operadora();
		Thread.sleep(4000);
		gestao.SubstitutoInicial();
		
	}

	@When("^Escolher Outro Prestador para substituir e clicar na Fleg Substituto$")
	public void escolherOutroPrestadorParaSubstituirEClicarNaFlegSubstituto() throws Throwable {
		gestao.Candidato();
		gestao.Substituto();
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "automaticamente_NovoSubstitutoOperacaoRealizadacomSucesso1065");
		
	}

	@When("^escolher um Prestador que é substituto e clicar na Fleg Recusado$")
	public void escolherUmPrestadorQueÉSubstitutoEClicarNaFlegRecusado() throws Throwable {
		gestao.Recusado();
	}

	@Then("^Automáticamente o sistema apresenta a mensagem Operação realizada com sucesso e a fleg marcada como substituto será desflegada automaticamente\\.$")
	public void automáticamenteOSistemaApresentaAMensagemOperaçãoRealizadaComSucessoEAFlegMarcadaComoSubstitutoSeráDesflegadaAutomaticamente()
			throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "automaticamente_RecusadoOperacaoRealizadacomSucesso1065");
		
	}


}
