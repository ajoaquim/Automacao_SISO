package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step1039QualificaçãoPrestador extends UtilsSteps {
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos,Cadastro Prestador,Qualificação Prestador$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosCadastroPrestadorQualificaçãoPrestador() throws Throwable {
		initiate();
	    frame.sairFrame();
	    frame.sairFrame();
	    alteracao.Menu_Gestão_Prestadores_odontologicos();
	    alteracao.Menu_Cadastro_prestador();
	    alteracao.Menu_Qualificação();
	}

	@When("^informar um Prestador na tela qualificação$")
	public void informarUmPrestadorNaTelaQualificação() throws Throwable {
		Thread.sleep(1000);
	    alteracao.Informa_prestador("011010");
	}


	@When("^clicar fora do campo qualificacao Prestador$")
	public void clicarForaDoCampoQualificacaoPrestador() throws Throwable {
		frame.clicar_fora("//*[@id=\"cod_prestador\"]");
	}

	@When("^preencher os dados de inclusão na tela de qualificação$")
	public void preencherOsDadosDeInclusãoNaTelaDeQualificação() throws Throwable {
		Thread.sleep(3000);
		alteracao.tpenter();
		//Thread.sleep(1000);
		alteracao.Qualificação();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "antes_inclusão_qualificação");
		alteracao.dtInicioQualif();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "depois_inclusão_qualificação");
	}

	@When("^clicar no botão Incluir na tela de qualificação$")
	public void clicarNoBotãoIncluirNaTelaDeQualificação() throws Throwable {
		frame.sairFrame();
	    alteracao.BotIncluirQuali();
	}

	@Then("^o sistema apresenta a mensagem Operação realizada com Sucesso na tela de qualificação$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucessoNaTelaDeQualificação() throws Throwable {
		//Thread.sleep(1000);
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
	    Thread.sleep(2000);
	    alteracao.UsuarioAlterado();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "inclusão_qualificação");
	}

	@When("^selecionar um Prestador existente na tela qualificação$")
	public void selecionarUmPrestadorExistenteNaTelaQualificação() throws Throwable {
		Thread.sleep(1000);
		alteracao.Informa_prestador("011010");
		frame.clicar_fora("//*[@id=\"cod_prestador\"]");
		Thread.sleep(2000);
	}

	@Then("^o sistema apresenta o resultado da busca na tela de qualificação$")
	public void oSistemaApresentaOResultadoDaBuscaNaTelaDeQualificação() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "consulta_qualificação");
	}

	@When("^selecionar um Prestador existente na tela de qualificação$")
	public void selecionarUmPrestadorExistenteNaTelaDeQualificação() throws Throwable {
		Thread.sleep(1000);
		alteracao.Informa_prestador("011010");
		frame.clicar_fora("//*[@id=\"cod_prestador\"]");
		Thread.sleep(2000);
	}

	@When("^realizar uma alteração nos dados na tela de qualificação$")
	public void realizarUmaAlteraçãoNosDadosNaTelaDeQualificação() throws Throwable {
		//alteracao.TipoEstabelecimento();
		//alteracao.TeclaEnter();
		alteracao.tpenter();
		alteracao.AlteraQuali();
		alteracao.antesobs();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "antes_alteração_qualificação");
		alteracao.ObsQuali("Teste altera");
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "depois_alteração_qualificação");
		
	}
	
	@When("^clicar no botão Alterar na tela de qualificação$")
	public void clicarNoBotãoAlterarNaTelaDeQualificação() throws Throwable {
		frame.sairFrame();
	    alteracao.BotAlterar();
	}

	@Then("^o sistema apresenta a mensagem Gravado com Sucesso$")
	public void oSistemaApresentaAMensagemGravadoComSucesso() throws Throwable {
		Thread.sleep(2000);
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
	    Thread.sleep(2000);
	    alteracao.UsuarioAlterado();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "sucesso_qualificação");
	}

	@When("^Flegar  a qualificação que deseja excluir$")
	public void flegarAQualificaçãoQueDesejaExcluir() throws Throwable {
	    Thread.sleep(2000);
		alteracao.FlegaExcluir();
	}

	@When("^Clicar no botão Excluir na tela de qualificação$")
	public void clicarNoBotãoExcluirNaTelaDeQualificação() throws Throwable {
		frame.sairFrame();
	    alteracao.BotExcluirQuali();
	}

	@When("^O sistema apresenta a mensagem Deseja excluir a qualificação selecionada\\?$")
	public void oSistemaApresentaAMensagemDesejaExcluirAQualificaçãoSelecionada() throws Throwable {
		alteracao.Textoalerta();
		Thread.sleep(2000);
		//modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "alerta_excluir_qualificação");
	}

	@When("^clicar no botão Sim na tela de qualificação$")
	public void clicarNoBotãoSimNaTelaDeQualificação() throws Throwable {
		alteracao.alerta();
	}

	@Then("^Sistema Exclui as qualificações do Prestador$")
	public void sistemaExcluiAsQualificaçõesDoPrestador() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
	    Thread.sleep(2000);
	    alteracao.UsuarioAlterado();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "sucesso_excluir_qualificação");
	}
}