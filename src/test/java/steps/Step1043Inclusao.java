package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1043Inclusao extends UtilsSteps {

	String windowsHandler;
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Cadastro Prestador, Inclusão$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosCadastroPrestadorInclusão() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.CadastroPrestador();
		menugestao.Inclusao();
		
	}

	@When("^Informar o tipo de Pessoa$")
	public void informarOTipoDePessoa() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='pesquisa']");
		Thread.sleep(4500);
		gestao.FlegFisica();
	}

	@When("^preencher os dados do menu Dados Cadastrais$")
	public void preencherOsDadosDoMenuDadosCadastrais() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I1']");
		gestao.Cpf();
		gestao.NomeInclusao();
		gestao.IncluirNome();
		gestao.Sigla();
		gestao.NumeroInclusao();
		gestao.Uf();
	}

	@When("^preencher os dados do menu Informações Complementares$")
	public void preencherOsDadosDoMenuInformaçõesComplementares() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.InformacoesComplementares();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I2']");
		gestao.Classe();
		gestao.DataCredenciamento();
		gestao.DataContratualizacao();
	}

	@When("^preencher os dados do menu Endereços de antendimento$")
	public void preencherOsDadosDoMenuEndereçosDeAntendimento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.EnderecoAntendimento();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I3']");
		gestao.AdicionarEndereco();
		gestao.Cep();
		frame.clicar_fora("//*[@id='num_cep_1']");
		gestao.Numero();
		gestao.Manha();
		gestao.Tarde();
		gestao.Noite();
	
		
	}

	@When("^preencher os dados do menu Rede Atendimento$")
	public void preencherOsDadosDoMenuRedeAtendimento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.RedeAtendimento();
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I5']");
		gestao.Inserir();
		
		windowsHandler = driver.getWindowHandle();
		gestao.PesquisaRede();
		
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		gestao.Continuar();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		gestao.SelecionaOdonto();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		gestao.Continuar();
		
		frame.trocarJanela(windowsHandler);
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I5']");
		gestao.SelecionaDivulga();
		
		
	}

	@When("^preencher os dados do menu Tipo Estabelecimento$")
	public void preencherOsDadosDoMenuTipoEstabelecimento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.TipoEstabelecimento();
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I6']");
		Thread.sleep(4500);
		gestao.Clinica14();
		gestao.Clinica13();
		gestao.Clinica4();
		gestao.Principal();
		gestao.Divulga();
		gestao.Divulga2();
		gestao.Divulga3();
	}

	@When("^preencher os dados do menu Habilitação - Especialidades$")
	public void preencherOsDadosDoMenuHabilitaçãoEspecialidades() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.Habilitacao();
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I7']");
		
		String windowsHandles = driver.getWindowHandle();
		
		gestao.Adicionar();
		
		
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		
		frame.framePaginaInicial("//*[@id='principal2']");
		gestao.Pesquisa();
		Thread.sleep(4000);
		gestao.MarcarTodas();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		gestao.ContinuarInclusao();
		frame.trocarJanela(windowsHandles);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I7']");
		gestao.PrincipalHabilitacao();
		
		
		
	}

	@When("^preencher os dados do menu Dados de pagamento$")
	public void preencherOsDadosDoMenuDadosDePagamento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.DadosPagamento();
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I13']");
		gestao.Vigente();
		gestao.FormaPagamento();
		gestao.AdicionarConta();
		gestao.BancoItau();
		gestao.AgenciaItau();
		gestao.ContaItau();
		gestao.PrincipalItau();
		
	}

	@When("^preencher os dados do menu Documentação$")
	public void preencherOsDadosDoMenuDocumentação() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.Documentacao();

		
	}

	@When("^Incluir$")
	public void incluir() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='toolbarsubmenu']");
		gestao.BotaoIncluir();
	}

	@Then("^o sistema apresenta a mensagem Operação realizada com sucesso na tela de inclusao$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucessoNaTelaDeInclusao() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "1043InclusaoComSucesso");
	}

	
	@When("^Informar o tipo de Pessoa alteracao$")
	public void informarOTipoDePessoaAlteracao() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='pesquisa']");
		gestao.FlegFisica();
		Thread.sleep(4500);
		frame.sairFrame();
		frame.sairFrame();
	}

	
	
	@When("^preencher os dados do menu Dados Cadastrais com informações já cadastradas$")
	public void preencherOsDadosDoMenuDadosCadastraisComInformaçõesJáCadastradas() throws Throwable {
		
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I1']");
		gestao.Cpf();
		gestao.NomeInclusao();
		gestao.IncluirNome();
		gestao.Sigla();
		gestao.NumeroInclusao();
		gestao.Uf();
	}
	
	@When("^preencher os dados do menu Tipo Estabelecimento Alteracao$")
	public void preencherOsDadosDoMenuTipoEstabelecimentoAlteracao() throws Throwable {
		//preencherOsDadosDoMenuTipoEstabelecimento();
	}


	@Then("^o sistema apresenta a mensagem O prestador já está cadastrado com o CPF/CNPJ informado\\.$")
	public void oSistemaApresentaAMensagemOPrestadorJáEstáCadastradoComOCPFCNPJInformado() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "1043InclusaoJaCadastradoComCPFInformado");
	}

	@When("^preencher os dados do menu Endereços de Relacionamento$")
	public void preencherOsDadosDoMenuEndereçosDeRelacionamento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.EnderecoRelacionamento();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I4']");
		gestao.Residencia();
	}
	
	@When("^preencher os dados do menu Tipo Estabelecimento Validar$")
	public void preencherOsDadosDoMenuTipoEstabelecimentoValidar() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.TipoEstabelecimento();
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='I6']");
		
	}


	@When("^preencher os dados do menu Dados para Pagamento$")
	public void preencherOsDadosDoMenuDadosParaPagamento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.DadosPagamento();
		
	
		
		
	}

	@When("^preencher os dados do menu Entrega$")
	public void preencherOsDadosDoMenuEntrega() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.Entrega();
	}

	@When("^preencher os dados do menu Tipo de Atendimento$")
	public void preencherOsDadosDoMenuTipoDeAtendimento() throws Throwable {
		driver.switchTo().alert().accept();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeaspsubmenu']");
		frame.framePaginaInicial("//*[@id='submenu']");
		gestao.TipoAtendimento();
	}

	@Then("^o sistema apresenta sinal de alerta informando o campo que ficou faltando o preenchimento$")
	public void oSistemaApresentaSinalDeAlertaInformandoOCampoQueFicouFaltandoOPreenchimento() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "1043InclusaoCampoQueFicouFaltandoPreenchimento");
	}





}
