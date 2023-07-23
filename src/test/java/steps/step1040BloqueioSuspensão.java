package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step1040BloqueioSuspensão extends UtilsSteps {
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos,Cadastro Prestador,BloqueioSuspensão de Prestador,Registra BloqueioSuspensão$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosCadastroPrestadorBloqueioSuspensãoDePrestadorRegistraBloqueioSuspensão() throws Throwable {
		initiate();
	    frame.sairFrame();
	    frame.sairFrame();
	    alteracao.Menu_Gestão_Prestadores_odontologicos();
	    alteracao.Menu_Cadastro_prestador();
	    alteracao.Menu_ResgistroSuspensao();
	    Thread.sleep(1000);
	    alteracao.Menu_interirorBloqueio();
	}

	@When("^Informar um Prestador já existente na tela de registro e suspensão$")
	public void informarUmPrestadorJáExistenteNaTelaDeRegistroESuspensão() throws Throwable {
		Thread.sleep(2000);
	    alteracao.LimparConsulta();
	    frame.sairFrame();
	    Thread.sleep(3000);
		alteracao.Informa_prestador("011614");
	}

	@When("^clicar fora do campo na tela de registro e suspensão$")
	public void clicarForaDoCampoNaTelaDeRegistroESuspensão() throws Throwable {
		frame.clicar_fora("//*[@id=\"cod_prestador\"]");
	}

	@When("^preencher os dados de inclusão na tela de RegistroSuspensão$")
	public void preencherOsDadosDeInclusãoNaTelaDeRegistroSuspensão() throws Throwable {
		alteracao.DtRegistroBloq("12/12/2020");
		alteracao.Situacao();
		alteracao.Ate();
		alteracao.AlterarMotivo();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "1040_dados_inclui_bloqueio");
	}

	@When("^clicar no botão Incluir da tela de registro e suspensão$")
	public void clicarNoBotãoIncluirDaTelaDeRegistroESuspensão() throws Throwable {
		alteracao.BloqOperadora();
	    frame.sairFrame();
	    alteracao.BotIncluir();
	    Thread.sleep(5000);
	}

	@Then("^o sistema apresenta a mensagem Operação realizada com sucesso$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucesso() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
	    Thread.sleep(2000);
	    //alteracao.UsuarioAlterado();
	    alteracao.BloqueioIncluido();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "1040_inclui_bloqueio");
	}

	@When("^Informar um Prestador existente na tela de registro e suspensão$")
	public void informarUmPrestadorExistenteNaTelaDeRegistroESuspensão() throws Throwable {
		Thread.sleep(2000);
		   alteracao.LimparConsulta();
		   frame.sairFrame();
		   Thread.sleep(3000);
		   alteracao.Informa_prestador("011614");
	}

	@Then("^o sistema apresenta o resultado da busca da tela de registro e suspensão$")
	public void oSistemaApresentaOResultadoDaBuscaDaTelaDeRegistroESuspensão() throws Throwable {
		alteracao.Confirmaobs();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "1040_consulta_bloqueio");
	}
	

}