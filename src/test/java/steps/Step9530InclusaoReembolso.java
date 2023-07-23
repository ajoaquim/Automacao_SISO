package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Ultils.GeradorCPF;
import Ultils.UtilsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9530InclusaoReembolso extends UtilsSteps {

	WebElement element;
	String windowHandle;

	@When("optar por selecionar o menu Reembolso Odontológico,Inclusão")
	public void optarPorSelecionarOMenuReembolsoOdontológicosInclusao() throws InterruptedException {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menuReembolso.menuReembolsoOdontologicos();
		menuReembolso.acessarInclusaoReembolso();
		frame.sairFrame();
	}

	@When("^informar um Beneficiário ativo na tela de reembolso inclusao$")
	public void informarUmBeneficiárioAtivoNaTelaDeReembolsoInclusao() throws Throwable {
		menuReembolso.Informa_beneficiario("2019120010");
		menuReembolso.BeneficiarioTab();
	}

	@When("^clicar fora do campo na tela de reembolso inclusao na hora da inclusao$")
	public void clicarForaDoCampoNaTelaDeReembolsoInclusao() throws Throwable {
		Thread.sleep(2000);
		String windowsHandler = driver.getWindowHandle();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		menuReembolso.AlertaInclusao();
		frame.trocarJanela(windowsHandler);
		frame.frame(2);
		frame.frame(2);
	}

	@When("^preencher os dados de Procedimento$")
	public void preencherOsDadosDeProcedimento() throws Exception {
		menuReembolso.preencherOsDadosProcedimento("85200123", 1, "17/01/2020", "100");
	}

	@When("^Consultar Reembolsos do beneficiário$")
	public void consultarReembolsosDoBeneficiário() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.ConsultaReembolsoBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		menuReembolso.validarTelaConsultaReembolso();
	}

	@When("^Pesquisar Prévia do Contrato$")
	public void pesquisarPréviaDoContrato() throws Throwable {

		windowHandle = driver.getWindowHandle();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[0]);
		frame.sairFrame();
		frame.sairFrame();
		menuReembolso.ConsultaPreviaPorContrato();

		menuReembolso.validarTelaPreviaDoContrato();
	}

	@When("^Pesquisar Prévia por Família$")
	public void pesquisarPréviaPorFamília() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.ConsultaPreviaPorFamilia();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		menuReembolso.validarTelaPreviaPorFamilia();
		frame.fecharJanela();
	}

	@When("^Pesquisar Prévia por Beneficiário$")
	public void pesquisarPréviaPorBeneficiário() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.ConsultaPreviaPorBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		menuReembolso.validarTelaPreviaPorBeneficiario();
		frame.fecharJanela();
	}

	@When("^Consultar Histórico de Procedimentos$")
	public void consultarHistóricoDeProcedimentos() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.ConsultaHistoricoProcedimento();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		menuReembolso.validarTelaHistoricoProcedimento();
	}

	private void validaAbrirContatosDoBeneficiário() {
		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(1));
		driver.switchTo().frame(1);
		WebElement elemento = driver.findElement(By.linkText("Critérios"));
		assertTrue(elemento.isDisplayed());
		driver.close();
	}

	@When("^Incluir data Postagem na inclusao$")
	public void incluirDataPostagem() throws Throwable {
		menuReembolso.preencherDataPostada("14/01/2020");
	}

	@When("^incluir data Recebimento na inclusao$")
	public void incluirDataRecebimento() throws Throwable {
		menuReembolso.preencherDataRecebimento("15/01/2020");
	}

	@When("^incluir Forma Pagamento na inclusao$")
	public void incluirFormaPagamento() throws Throwable {
		menuReembolso.preencherFormaPagamento();
	}

	@When("^Preencher campos obrigatórios$")
	public void preencherCamposObrigatórios() throws Throwable {

	}

	@When("^clicar no botão Analise/Inclusão na hora da inclusao$")
	public void clicarNoBotãoAnaliseInclusão() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		menuReembolso.clicarAlterarAnalise();
	}

	@When("^o sistema apresenta a mensagem Pedido Incluido para Situação em Análise com Sucesso$")
	public void oSistemaApresentaAMensagemPedidoIncluidoParaSituaçãoEmAnáliseComSucesso() throws Throwable {
		Thread.sleep(2000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9530^o sistema apresenta a mensagem Pedido Incluido para a situação em Analise");
	}

	@When("^Clicar no Botão Submeter na tela de inclusão$")
	public void clicarNoBotãoSubmeter() throws Throwable {
	//	frame.sairFrame();
	//	frame.frame("principal2");
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");

		menuReembolso.clicarSubmeter();
	}


	@Then("^o sistema apresenta a mensagem Pedido Aprovado com Sucesso$")
	public void oSistemaApresentaAMensagemPedidoAprovadoComSucesso() throws Throwable {
		String mensagem = menuReembolso.textoAlerta();
		assertEquals("Pedido Aprovado com Sucesso", mensagem);
	}

	@When("^Informar um Beneficiário existente Suspenso$")
	public void informarBeneficiarioSuspenso() throws Exception {
		sleep(200);
		String codBeneficiarioSuspenso = "2019120036";
		menuReembolso.Informa_beneficiario(codBeneficiarioSuspenso);
		menuReembolso.BeneficiarioTab();
	}

	@When("^Informar um Beneficiário existente Excluído$")
	public void informarBeneficiarioExcluido() throws Exception {
		String codBeneficiarioExcluido = "2019090010";
		menuReembolso.Informa_beneficiario(codBeneficiarioExcluido);
		menuReembolso.BeneficiarioTab();
	}

	@When("^Preencher os Campos de Informações do Beneficiario Excluido$")
	public void preencherCamposInformacoesExcluido() throws AWTException {
		menuReembolso.preencherCamposInformacoes("20/01/2020", "1501", "20/01/2020", 1);
	}

	@When("^Preencher os Campos de Informações do Beneficiario$")
	public void preencherCamposInformacoes() throws AWTException {
		menuReembolso.preencherCamposInformacoes("20/01/2020", "1501", "20/01/2020", 1);
	}

	@When("^Preencher os Campos de Informações do Beneficiario Suspenso$")
	public void preencherCamposInformacoesSuspenso() throws AWTException {
		menuReembolso.preencherCamposInformacoes("20/01/2020", "1501", "20/01/2020", 1);
	}

	@When("^Preencher os campos de Atendimento do Beneficiario Suspenso$")
	public void preencherCamposAtendimentosBeneficiarioSuspenso() throws AWTException {
		menuReembolso.preencherOscamposDeAtendimento("850.727.390-40");
	}

	@When("^Preencher os campos de Atendimento do Beneficiario Excluido$")
	public void preencherCamposAtendimentosBeneficiarioExcluido() throws AWTException {
		menuReembolso.preencherOscamposDeAtendimento("850.727.390-40");
	}

	@When("^Preencher os Campos de Procedimento do Beneficiario Suspenso$")
	public void preencherCamposProcedimentoBeneficiarioSuspenso() throws AWTException, InterruptedException {
		menuReembolso.preencherOsDadosProcedimentoSuspenso("85200123", 1, "17/01/2020", "100");
	}

	@When("^Preencher os Campos de Procedimento do Beneficiario Excluido$")
	public void preencherCamposProcedimentoBeneficiarioExcluido() throws AWTException, InterruptedException {
		menuReembolso.preencherOsDadosProcedimento("85200123", 1, "17/01/2020", "100");
	}

	@When("^Preencher os Campos de Observação do Beneficiario Excluido$")
	public void preencherCamposObservacaoBeneficiarioExcluido() throws InterruptedException, AWTException {
		menuReembolso.preencherCamposObservacao("obsEmissao", "obsOperadora");
	}

	@When("^Preencher os Campos de Observação do Beneficiario Suspenso$")
	public void preencherCamposObservacaoBeneficiarioSuspenso() throws InterruptedException, AWTException {
		menuReembolso.preencherCamposObservacao("obsEmissao", "obsOperadora");
	}

	@And("^informar um Anexo do Beneficiario Suspenso$")
	public void informarUmAnexoBeneficiarioSuspenso() throws Exception {
		String numeroReembolso = "862";
		menuReembolso.acessarTelaAnexo();
		menuReembolso.incluirAnexo(numeroReembolso);
	}

	@And("^informar um Anexo do Beneficiario Excluido$")
	public void informarUmAnexoBeneficiarioExcluido() {
		menuReembolso.acessarTelaAnexo();
	}

	@Then("^o sistema apresenta Glosa com crítica informando que o Beneficiário esta excluído")
	public void oSistemaApresentaGlosaComCriticaInformandoBeneficiarioExcluido() throws InterruptedException {
		Thread.sleep(6000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9530Validar um Beneficiário Excluído");
	}

	@Then("^o sistema apresenta Glosa com crítica informando que o Beneficiário esta suspenso")
	public void oSistemaApresentaGlosaComCriticaInformandoBeneficiarioSuspenso() {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9530Validar um Beneficiário Suspenso");
	}

	@When("^Clicar no Botão Incluir Escolha")
	public void clicarBotaoIncluir() {
		menuReembolso.retornarFrameInicial();
		menuReembolso.clicarBotaoIncluir();
	}

	@When("^informar um CPF no campo Inscrição Prestador$")
	public void informarUmCPFPrestador() throws Throwable {
		menuReembolso.selecionarCPFInformado();
	}

	@When("^Preencher os campos Nome, Sigla, numero e UF em Inscrição Prestador$")
	public void preencherOsDadosSolicitados() throws Throwable {
		String cpf = "427.600.420-90";

		menuReembolso.acessarFrameCadastroPrestador();
		menuReembolso.preencherNumeroPrestador(cpf);
		menuReembolso.preencherNomePrestador("João Costa");
		menuReembolso.preencherCodigoCRO("15104");
		menuReembolso.selecionarSiglaPrestador(0);
		menuReembolso.selecionarUFPrestador(1);
		menuReembolso.selecionarCEPPrestador("5806131");
	}

	@When("^clicar no Botão Incluir na hora da inclusao$")
	public void clicarNoBotãoIncluirLivreEscolha() throws Throwable {

		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#btn_acao_incluir\\(\\)\\; > .barimg:nth-child(1)")).click();
	}

	// B
	@When("^na seção Prestador/Livre Escolha na hora da inclusao$")
	public void naSeçãoPrestadorLivreEscolha() throws Throwable {
		Thread.sleep(1000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9530Na seção Prestador/Livre Escolha");
	}

	@When("^clicar em Incluir Livre Escolha na hora da inclusao$")
	public void clicarEmIncluirLivreEscolha() throws Throwable {
		menuReembolso.clicarBotaoID("imgIncluiLivreEscolha");
	}

	GeradorCPF geradorCPFSegundaIncricao = new GeradorCPF();
	String segundoCpf = geradorCPFSegundaIncricao.cpf(true);

	@When("^informar um CPF no campo Inscrição na hora da inclusao$")
	public void informarUmCPFNoCampoInscrição() throws Throwable {
		menuReembolso.acessarFrameCadastroPrestador();
		menuReembolso.preencherCampoInput("num_insc_fiscal_prestador", segundoCpf);
	}

	@When("^Preencher os campos Nome, Sigla, numero e UF na hora da inclusao$")
	public void preencherOsCamposNomeSiglaNumeroEUF() throws Throwable {
		menuReembolso.acessarFrameCadastroPrestador();
		menuReembolso.preencherNomePrestador("João Costa");
		menuReembolso.preencherCodigoCRO("15104");
		menuReembolso.selecionarSiglaPrestador(0);
		menuReembolso.selecionarUFPrestador(1);
	}

	@When("^o sistema apresenta a mensagem Operação realizada na hora da inclusao$")
	public void oSistemaApresentaAMensagemOperaçãoRealizada() throws Throwable {
		String mensagem = menuReembolso.textoAlerta();
		assertEquals("Operação realizada", mensagem);
		menuReembolso.alertaAcept();
	}

	@And("^selecionar um prestador para edição na hora da inclusao$")
	public void selecionarUmPrestadorParaEdicao() throws Exception {

		String cpfEdicao = "850.727.390-40";

		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(0));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame(2);

		menuReembolso.selecionarPrestadorParaEdicao(cpfEdicao);
		menuReembolso.BeneficiarioTab();
		sleep(200);
		menuReembolso.preencherDataPostada("14/01/2020");
		menuReembolso.preencherDataRecebimento("14/01/2020");

	}

	@When("^clicar em Alterar Livre Escolha na hora da inclusao$")
	public void clicarEmAlterarLivreEscolha() throws Throwable {
		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(0));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame(2);

		WebElement element = driver.findElement(By.id("imgAlteraLivreEscolha"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		sleep(100);
	}

	@When("^realizar uma alteração na hora da inclusao$")
	public void realizarUmaAlteração() throws Throwable {
		menuReembolso.acessarFrameCadastroPrestador();
		menuReembolso.preencherCodigoCRO("15104");
	}

	@When("^clicar em Incluir na hora da inclusao$")
	public void clicarEmIncluir() throws Throwable {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#btn_acao_alterar\\(\\)\\; > .barimg:nth-child(1)")).click();
	}

	@When("^adicionar um procedimento na hora da inclusao$")
	public void adicionarUmProcedimento() throws Throwable {
		String numProc = "81000030";
		menuReembolso.clicarBotaoID("button2");

		menuReembolso.preencherCampoInput("item_medico_1", numProc);
		menuReembolso.clicarBotaoID("Pesquisa_Item_Medido_1");
	}

	@When("^preencher o campo Dente/Região selecionando a opção que estiver em azul na hora da inclusao$")
	public void preencherOCampoDenteRegiãoSelecionandoAOpçãoQueEstiverEmAzul() throws Throwable {
		menuReembolso.preencherCampoInput("cod_dente_regiao_1", "1");
	}

	@When("^flegar Laudo, Raio-x inicial e Raio-x final na hora da inclusao$")
	public void flegarLaudoRaioXInicialERaioXFinal() throws Throwable {
		menuReembolso.ativarOpcaoLaudo();
		menuReembolso.ativarOpcaoRaioXNoInicio();
		menuReembolso.ativarOpcaoRaioXNoFim();
		menuReembolso.informarCodigoDente();
	}

	@When("^inserir data em Realização na hora da inclusao$")
	public void inserirDataEmRealização() throws Throwable {
		String dataRealizacao = "15/01/2020";
		menuReembolso.preencherCampoDataRealizacao(dataRealizacao);
	}

	@When("^informar o Valor Informado na hora da inclusao$")
	public void informarOValorInformado() throws Throwable {
		String valorInformado = "150";
		menuReembolso.preencherValorInformado(valorInformado);
		menuReembolso.preencherFormaPagamento();
	}

	@When("^selecionar o botão Alteração/Análise na hora da inclusao$")
	public void selecionarOBotãoAlteraçãoAnálise() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		menuReembolso.clicarAlterarAnalise();
	}

	@When("^selecionar o botão submeter$")
	public void selecionarOBotãoSubmeter() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		menuReembolso.clicarSubmeter();
	}

	@Then("^o sistema permite submeter o pedido com sucesso$")
	public void oSistemaPermiteSubmeterOPedidoComSucesso() throws Throwable {
		Thread.sleep(2000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso",
				"9530Validar Inclusão de Prestador Livre Escolha na hora da inclusao");
	}

	// New A
	@When("^Consultar Reembolsos do beneficiário na Inclusao$")
	public void clicarEmConsultarReembolsosDoBeneficiário() throws Throwable {
		windowHandle = driver.getWindowHandle();
		sleep(200);
		menuReembolso.ConsultaReembolsoBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		menuReembolso.validarTelaConsultaReembolso();
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");

	}

	@When("^Pesquisar Prévia por Família na Inclusao$")
	public void pesquisarPreviaPorFamilia() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.ConsultaPreviaPorFamilia();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		menuReembolso.validarTelaPreviaPorFamiliaBeneficiario();
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
	}

	@When("^Pesquisar Prévia por Beneficiário na Inclusao$")
	public void pesquisarPreviaPorBeneficiario() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.ConsultaPreviaPorBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		menuReembolso.validarTelaPreviaPorBeneficiario();
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
	}

	@When("^Consultar Histórico de Procedimentos na Inclusao$")
	public void pesquisarHistorico() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.ConsultaHistoricoProcedimento();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		menuReembolso.validarTelaHistoricoProcedimento();
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
	}

	@When("^Pesquisar dados beneficiário/Contratos na Inclusao$")
	public void pesquisarDadosBeneficiárioContratos() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.ConsultaPesquisaDadosBeneficiarioContrato();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		menuReembolso.validarTelaPesquisaPorBeneficiarioContratos();
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
	}

	@When("^Abrir alertas beneficiário na Inclusao$")
	public void clicarEmAlertasBeneficiário() throws Throwable {

		windowHandle = driver.getWindowHandle();
		menuReembolso.alertasBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		menuReembolso.validarTelaAlertaBeneficiario();
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");

	}

	@When("^Abrir Contatos do Beneficiário na Inclusao$")
	public void abrirContatosDoBeneficiário() throws Throwable {

		windowHandle = driver.getWindowHandle();
		menuReembolso.pesquisarContato();
		assertTrue(driver.findElement(By.id("btnFecharContato")).isEnabled());

		menuReembolso.fecharContato();

		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
	}

	@When("^preencher os dados do Atendente$")
	public void preencherDadosAtendente() {
		String cpfEdicao = "850.727.390-40";

		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(0));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame(2);

		menuReembolso.selecionarPrestadorParaEdicao(cpfEdicao);
		menuReembolso.BeneficiarioTab();
	}

	@And("^Aprovar a Glosa na tela de reembolso inclusao$")
	public void aprovarGlosa() throws Throwable {
		System.out.println(driver.getWindowHandle());
		List<String> abas = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(abas.get(0));
		frame.sairFrame();
		frame.mudarModalToolbarSISO();
		menuReembolso.realizarAprovacaoGlosa();
	}
	
	@And("^Clicar no Botão Aprovar Pedido na tela de reembolso inclusao$")
	public void clicarBotaoAprovarPedido() {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		menuReembolso.clicarAprovarAnalise();
	}

	@Then("^o sistema apresenta a mensagem Numero pedido, senha e validade$")
	public void validarMensagemExibidaNoFinal() throws InterruptedException {
		Thread.sleep(3000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9530O Sistema exibe a mensagem com o numero do pedido senha e validade");
	}
}
