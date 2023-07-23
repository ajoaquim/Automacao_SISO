package steps;


import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1037Ocorrencias extends UtilsSteps {
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos,Cadastro Prestador,Ocorrências$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosCadastroPrestadorOcorrências() throws Throwable {
		initiate();
		frame.sairFrame();
	    frame.sairFrame();
		alteracao.Menu_Gestão_Prestadores_odontologicos();
		alteracao.Menu_Cadastro_prestador();
		alteracao.Menu_ocorrencias();
		alteracao.LimparConsulta();
		frame.sairFrame();
	}

	@When("^Informar Prestador na tela de ocorrencias$")
	public void informarPrestadorNaTelaDeOcorrencias() throws Throwable {
		Thread.sleep(2000);
	    alteracao.Informa_prestador("011010");
	}

	@When("^clicar fora do campo selecionado anteriormente na tela de ocorrencias$")
	public void clicarForaDoCampoSelecionadoAnteriormenteNaTelaDeOcorrencias() throws Throwable {
		frame.clicar_fora("//*[@id=\"cod_prestador\"]");
	}

	@Then("^o sistema apresenta o resultado da busca feita pelo sistema na tela de ocorrencias$")
	public void oSistemaApresentaOResultadoDaBuscaFeitaPeloSistemaNaTelaDeOcorrencias() throws Throwable {
		alteracao.cofirmaConsulta();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "Pesquisa_de_ocorrencia");
	}

	@When("^informar prestador existente na tela de ocorrencias$")
	public void informarPrestadorExistenteNaTelaDeOcorrencias() throws Throwable {
		Thread.sleep(2000);
		alteracao.Informa_prestador("011010");
	}

	@When("^clicar fora na tela de ocorrencias$")
	public void clicarForaNaTelaDeOcorrencias() throws Throwable {
		frame.clicar_fora("//*[@id=\"cod_prestador\"]");
	}

	@When("^realizar alteração nos dados na tela de ocorrencias$")
	public void realizarAlteraçãoNosDadosNaTelaDeOcorrencias() throws Throwable {
		alteracao.cofirmaConsulta();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "antes_alterar_ocorrencia");
		alteracao.Alterarlista();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "depois_alterar_ocorrencia");
	}

	@When("^clicar no botão alterar na tela de ocorrencias$")
	public void clicarNoBotãoAlterarNaTelaDeOcorrencias() throws Throwable {
		frame.sairFrame();
		Thread.sleep(5000);
		alteracao.BotAlterar();
	}

	@Then("^o sistema apresenta a mensagem Operação realizada com sucesso pelo sistema na tela de ocorrencia$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucessoPeloSistemaNaTelaDeOcorrencia() throws Throwable {
		Thread.sleep(3000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "alteração_ocorrencia");
	}
}
