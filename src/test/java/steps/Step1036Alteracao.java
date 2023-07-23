package steps;
import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1036Alteracao extends UtilsSteps {
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos,Cadastro Prestador,Alteração$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosCadastroPrestadorAlteração() throws Throwable {
		initiate();
		frame.sairFrame();
	    frame.sairFrame();
		alteracao.Menu_Gestão_Prestadores_odontologicos();
		alteracao.Menu_Cadastro_prestador();
		alteracao.Menu_Alteracao();
	}

	@When("^Informar um Prestador existente na tela de alteração$")
	public void informarUmPrestadorExistenteNaTelaDeAlteração() throws Throwable {
		alteracao.PrestadorAlteracao("014028");
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "informa_prest_consulta_alteracao");
	}

	@When("^clicar fora do campo na tela de alteração$")
	public void clicarForaDoCampoNaTelaDeAlteração() throws Throwable {
		frame.clicar_fora("//*[@id=\"cod_prestador\"]");
	}

	@Then("^o sistema apresenta o resultado da busca na tela de alteração$")
	public void oSistemaApresentaOResultadoDaBuscaNaTelaDeAlteração() throws Throwable {
		frame.sairFrame();
		alteracao.tabela();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "consulta_alteracao");
	}

	@When("^Informar um Prestador existente para alteração na tela de alteração$")
	public void informarUmPrestadorExistenteParaAlteraçãoNaTelaDeAlteração() throws Throwable {
		alteracao.PrestadorAlteracao("014028");
	}

	@When("^alterar os dados do menu Dados Cadastrais$")
	public void alterarOsDadosDoMenuDadosCadastrais() throws Throwable {
		frame.sairFrame();
		alteracao.tabela();
	    alteracao.alteraemail("teste@teste.com");
	}

	@When("^alterar os dados do menu Endereço de Relacionamento$")
	public void alterarOsDadosDoMenuEndereçoDeRelacionamento() throws Throwable {
	    frame.sairFrame();
	    frame.sairFrame();
	    alteracao.EnderecoRelacionamento();
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeaspsubmenu\"]");
	    frame.framePaginaInicial("//*[@id=\"I4\"]");
	    alteracao.numero("777");
	}

	@When("^alterar os dados do menu Rede Atendimento$")
	public void alterarOsDadosDoMenuRedeAtendimento() throws Throwable {
	    frame.sairFrame();
	    frame.sairFrame();
	    alteracao.RedeAtendimento();
	    frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id=\"iframeaspsubmenu\"]");
	    frame.framePaginaInicial("//*[@id=\"I5\"]");
	    alteracao.table();
	    
	}

	@When("^alterar os dados do menu Tipo de Estabelecimento$")
	public void alterarOsDadosDoMenuTipoDeEstabelecimento() throws Throwable {
	   frame.sairFrame();
	   frame.sairFrame();
	   alteracao.TpEstabelecimento();
	   frame.sairFrame();
	   frame.sairFrame();
	   frame.framePaginaInicial("//*[@id=\"iframeaspsubmenu\"]");
	   frame.framePaginaInicial("//*[@id=\"I6\"]");
	   alteracao.Divulga();
	   
	}

	@When("^alterar os dados do menu Habilitação - Especialidades$")
	public void alterarOsDadosDoMenuHabilitaçãoEspecialidades() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		alteracao.HabilitacaoEspecialidades();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeaspsubmenu\"]");
		frame.framePaginaInicial("//*[@id=\"I7\"]");
		//alteracao.Adicionar();
		alteracao.baixo();
		//alteracao.AdEspecialidades();
		
		//alteracao.Adicionar();
		String windowsHandler = driver.getWindowHandle();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		alteracao.Pesquisa();
		alteracao.MarcaTodos();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"toolbarModal\"]");
		alteracao.Continuar();
//		frame.fecharJanela();
		frame.trocarJanela(windowsHandler);
	}

	@When("^alterar os dados do menu Endereço Atendimento$")
	public void alterarOsDadosDoMenuEndereçoAtendimento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		alteracao.EnderecoAtendimento();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeaspsubmenu\"]");
		frame.framePaginaInicial("//*[@id=\"I3\"]");
		alteracao.numeroAtendimento("777");
	}

	@When("^alterar os dados do menu Tipo de atendimento$")
	public void alterarOsDadosDoMenuTipoDeAtendimento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		alteracao.TipoAtendimento();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeaspsubmenu\"]");
		frame.framePaginaInicial("//*[@id=\"I11\"]");
		alteracao.Seltipoatendimento();
	}

	@When("^alterar os dados do menu Dados para pagamento$")
	public void alterarOsDadosDoMenuDadosParaPagamento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		alteracao.DadosPagamento();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeaspsubmenu\"]");
		frame.framePaginaInicial("//*[@id=\"I13\"]");
		alteracao.Dtfimpagamento();
	}

	@When("^alterar os dados do menu Documentação$")
	public void alterarOsDadosDoMenuDocumentação() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		alteracao.Documentacao();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeaspsubmenu\"]");
		frame.framePaginaInicial("//*[@id=\"I14\"]");
		alteracao.AlteraDoc();
		//alteracao.Dtfimpagamento("31/11/2050");
	}

	@When("^clicar no botão Alterar na tela de alteração$")
	public void clicarNoBotãoAlterarNaTelaDeAlteração() throws Throwable {
	    
	}

	@Then("^o sistema apresenta a mensagem Operação Realizada com Sucesso na tela de alteração$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucessoNaTelaDeAlteração() throws Throwable {
	    
	}

	@When("^Informar um Prestador existente para exclusão na tela de alteração$")
	public void informarUmPrestadorExistenteParaExclusãoNaTelaDeAlteração() throws Throwable {
		alteracao.PrestadorExclusao("014028");
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "informa_prest_exclusao");
		frame.sairFrame();
	}

	@When("^clicar no botão Excluir na tela de alteração$")
	public void clicarNoBotãoExcluirNaTelaDeAlteração() throws Throwable {
		alteracao.BotExcluirPrest();
	}

	@When("^o sitema apresenta a mensagem O prestador será excluído fisicamente do Banco de Dados, isto é, todas as suas informações serão deletadas\\. Confirma a exclusão$")
	public void oSitemaApresentaAMensagemOPrestadorSeráExcluídoFisicamenteDoBancoDeDadosIstoÉTodasAsSuasInformaçõesSerãoDeletadasConfirmaAExclusão() throws Throwable {
		//modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "alerta_exclui_prest");
		alteracao.Textoalertaexcluirprest();
	}

	@When("^clicar no botão Sim no alerta da tela de alteração$")
	public void clicarNoBotãoSimNoAlertaDaTelaDeAlteração() throws Throwable {
		alteracao.alertaExlcuiPrest();
	}
}