package pageObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;

public class MenuGestaoReembolsoOdontologicosPage {
	/**
	 * 
	 * @author rcalandreli
	 */
	private WebDriverWait wait;
	private String janelaAtual;
	UtilsModule modulo = new UtilsModule();
	private Map<String, Object> vars = new HashMap<String, Object>();
	WebDriver driver;
	String elementStr;
	WebElement element;
	UtilsFrames frame;

	public MenuGestaoReembolsoOdontologicosPage(WebDriver driver) {
		this.driver = driver;
		this.frame = new UtilsFrames(driver);
	}

	public WebElement elementControlXpath(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "xpath");
		element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		return element;
	}

	public void menuReembolsoOdontologicos() {
		elementControlXpath("//*[@id='dropdown'][18]");
		element.click();
	}

	public void acessarInclusaoReembolso() {
		String element = "//*[@id='dropdown-lvl85']/div/ul/li[1]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement menuInclusao = driver.findElement(By.xpath(element));
		menuInclusao.click();
	}

	public void acessarAlterarReembolso() {
		String element = "//*[@id=\"dropdown-lvl85\"]/div/ul/li[2]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement menuInclusao = driver.findElement(By.xpath(element));
		menuInclusao.click();
	}

	public void consultaPrestador(String cod_prestador) throws InterruptedException {

		String numeroReembolso = "num_reembolso";

		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);

		preencherCampoInput(numeroReembolso, cod_prestador);

	}

	public void acessarFrame(String id) {
		WebElement iframe1 = driver.findElement(By.id(id));
		driver.switchTo().frame(iframe1);
	}

	public void acessarFrameByPosition(int i) {
		driver.switchTo().frame(i);
	}

	public void preencherSecaoAtendimento() throws AWTException {
		preencherCPF("332.367.810-92");
		teclarParaBaixo();
	}

	public void salvar() throws AWTException {
		teclarF2();
	}

	public void preencherProcedimento() throws InterruptedException, AWTException {
		clicarAdicionarProcedimento();
		informarCodigo();
		selecionarDente();
		ativarOpcaoLaudo();
		ativarOpcaoRaioXNoInicio();
		ativarOpcaoRaioXNoFim();
		informarDataDeRealizacao();
		informarValorInformado();
	}

	public void informarDataDeRealizacao() throws AWTException {
		preencherDataRealizacao();
	}

	public void fecharNotificacoes() throws Exception {
		Thread.sleep(2000);
		String windowsHandler = driver.getWindowHandle();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		AlertaInclusao();
		frame.trocarJanela(windowsHandler);
		frame.frame(2);
		frame.frame(2);
	}

	public void ativarOpcaoRaioXNoFim() {
		ativarRadio("ind_raiox_fim_1");
	}

	public void ativarOpcaoRaioXNoInicio() {
		ativarRadio("ind_raiox_ini_1");
	}

	private void informarValorInformado() {
		preencherCampoInput("valor_informado_1", "1250,00");
	}

	public void preencherDataPostada(String value) throws AWTException {
		elementControlId("data_postagem");
		element.sendKeys(value);
	}

	private void preencherDataRealizacao() throws AWTException {
		preencherData("data_realizacao_1", "18/01/2020");
	}

	public void preencherDataRecebimento(String value) throws AWTException {
		elementControlId("data_recebimento");
		element.sendKeys(value);
	}

	private void preencherData(String id, String valor) throws AWTException {
		preencherCampoInput(id, valor);
		teclarParaBaixo();
	}

	public void ativarOpcaoLaudo() {
		ativarRadio("ind_laudo_1");
	}

	private void selecionarDente() {
		selecionarItem("cod_dente_regiao_1", 4);
	}

	public void selecionarItem(String id, int value) {
		Select combo2 = new Select(driver.findElement(By.id(id)));
		combo2.selectByIndex(value);
	}

	private void informarCodigo() throws InterruptedException, AWTException {
		driver.findElement(By.id("Pesquisa_Item_Medido_1")).click();
		Thread.sleep(500);

		driver.findElement(By.id("procedimento_autocomplete")).sendKeys("82000026");
		Thread.sleep(3000);
		List<WebElement> listItems = driver.findElements(By.id("procedimento_autocomplete_listbox"));
		listItems.get(0).click();
		teclarEnter();
	}

	private void clicarAdicionarProcedimento() throws InterruptedException {
		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(0));
		clicarBotaoID("button2");
	}

	public void teclarParaBaixo() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
	}

	public void teclarEnter() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}

	public void teclarF2() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_F2);
	}

	public String waitForWindow(int timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Set<String> whNow = driver.getWindowHandles();
		Set<String> whThen = (Set<String>) vars.get("window_handles");
		if (whNow.size() > whThen.size()) {
			whNow.removeAll(whThen);
		}
		return whNow.iterator().next();
	}

	public void preencherCPF(String cpf) {
		preencherCampoInput("num_insc_fiscal_prestador", cpf);
	}

	private void selecionarEstado(int id) {
		selecionarItem("sgl_uf", id);
	}

	private void preencherBairro(String bairro) {
		preencherCampoInput("nom_bairro", bairro);
	}

	private void preencherEndereco(String endereco) {
		preencherCampoInput("txt_complemento", endereco);
	}

	private void preencherNumeroEndereco(String numeroEndereco) {
		preencherCampoInput("num_endereco", numeroEndereco);
	}

	public void preencherLogradouro(String logradouro) {
		preencherCampoInput("nom_logradouro", logradouro);
	}

	public void selecionarCEPPrestador(String cep) {
		preencherCampoInput("num_cep", cep);
	}

	public void selecionarUFPrestador(int id) {
		selecionarItem("uf_cro_prestador", id);
	}

	public void selecionarSiglaPrestador(int id) {
		selecionarItem("sgl_cro_prestador", id);
	}

	public void preencherCodigoCRO(String codigoCRO) {
		limparCampo("cro_prestador");
		preencherCampoInput("cro_prestador", codigoCRO);
	}

	public void preencherNomePrestador(String nomePrestador) {
		limparCampo("nome_prestador");
		preencherCampoInput("nome_prestador", nomePrestador);
	}

	private void limparCampo(String campo) {
		driver.findElement(By.id(campo)).clear();
	}

	public void preencherNumeroPrestador(String numero) {
		limparCampo("num_insc_fiscal_prestador");
		preencherCampoInput("num_insc_fiscal_prestador", numero);
	}

	public void dadosTelefones() {
		preencherCampoInput("num_ddd_telefone_1", "");
		preencherCampoInput("num_telefone_1", "");
		preencherCampoInput("num_ramal_1", "");
		preencherCampoInput("nom_contato_1", "");
	}

////////////////ALERTA//////////////////	  
	public String alerta() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		print();
		Thread.sleep(500);
		alert.accept();
		return null;
	}

	public String textoAlerta() {
		String alert = driver.switchTo().alert().getText();
		return alert;
	}

	public void print() {
		try {
			Robot robot = new Robot();
			BufferedImage bi = robot.createScreenCapture(new Rectangle(1400, 700));
			ImageIO.write(bi, "jpg", new File("C:\\Users\\iduarteb\\Desktop\\print\\teste.jpg"));
		} catch (AWTException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void aplicandoFiltroComSucesso(String cpfFiltro) {
		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(1));
		driver.switchTo().frame(1);
		preencherCampoInput("num_insc_fiscal_prestador", cpfFiltro);
	}

	private void informarNaPesquisaNome() {
		preencherCampoInput("nome_prestador", "João Da Silva Testes");
	}

	public void retornarFrameInicial() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
	}

	public void clicarBotaoIncluir() {
		clicarBotaoCSS("#btn_acao_incluir\\(\\)\\; > .barimg:nth-child(1)");

	}

	public void acessarFrameCadastroPrestador() {
		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());

		driver.switchTo().window(x.get(1));
		driver.switchTo().frame(1);
	}

	public void consultaReembolso(String cod_prestador) throws InterruptedException {
		String numeroAssociado = "num_reembolso";
		String botao = "Pesquisa_Pedido";

		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);

		preencherCampoInput(numeroAssociado, cod_prestador);
		clicarBotaoID(botao);
	}

	public void clicarBotaoID(String id) {
		WebElement botao = driver.findElement(By.id(id));
		botao.click();
	}

	public void clicarBotaoCSS(String id) {
		WebElement botao = driver.findElement(By.cssSelector(id));
		botao.click();
	}

	private void clicarBotaoClass(String classe) {
		WebElement botao = driver.findElement(By.className(classe));
		botao.click();
	}

	public void preencherCampoInput(String campo, String value) {
		driver.findElement(By.id(campo)).click();
		driver.findElement(By.id(campo)).sendKeys(value);
	}

	private void ativarRadio(String id) {
		WebElement radio = driver.findElement(By.id(id));
		radio.click();
	}

	private void desativarRadio(String id) {
		WebElement radio = driver.findElement(By.id(id));
		if (radio.isSelected())
			radio.click();
	}

	public void clicarConfirmacao() {
		retornarFrameInicial();
		clicarBotaoCSS("#btn_acao_executar\\(\\)\\; > .barimg:nth-child(1)");

	}

	public void clicarBotaoXpath(String id) {
		WebElement botao = driver.findElement(By.xpath(id));
		botao.click();
	}

	public void acessarCancelamentoPedidoReembolso() {
		String element = "//*[@id='dropdown-lvl85']/div/ul/li[5]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement menuInclusao = driver.findElement(By.xpath(element));
		menuInclusao.click();
	}

	public void consultaPedido(String cod_prestador) throws InterruptedException {

		String numeroAssociado = "num_associado";
		String botao = "imgPesquisaBeneficiario";

		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);

		preencherCampoInput(numeroAssociado, cod_prestador);
		clicarBotaoID(botao);

	}

	public void consultaReembolsoAnalise(String codPrestadorAnalise) throws InterruptedException {
		String numeroAssociado = "num_reembolso";
		String botao = "Pesquisa_Pedido";

		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);

		preencherCampoInput(numeroAssociado, codPrestadorAnalise);
	}

	public void clicarNoBotãoCancelarPedido(String id) {
		clicarBotaoXpath(id);
	}

	public void Informa_beneficiario(String num) {
		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		elementControlId("num_associado");
		element.sendKeys(num);
	}

	public void BeneficiarioTab() {
		WebElement ben = driver.findElement(By.id("num_associado"));
		ben.sendKeys(Keys.TAB);
	}

	public void AlertaInclusao() {
		WebElement iframe2 = driver.findElement(By.id("toolbarModal"));
		driver.switchTo().frame(iframe2);
		elementControlId("btn_acao_voltar");
		element.click();
	}

	public WebElement elementControlId(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "id");
		element = driver.findElement(By.id(elementStr));
		modulo.highLight(element, driver);
		return element;
	}

	public void selecionarFormaPagamento(String id) {
		selecionarItem(id, 1);
	}

	public void preencherOsDadosProcedimento(String codProcedimento, int codDente, String dataRealizacao,
			String valorInformado) throws AWTException, InterruptedException {

		elementControlId("button2");
		element.click();

		elementControlId("item_medico_1");
		element.sendKeys(codProcedimento);
		teclarParaBaixo();

		elementControlId("data_realizacao_1");
		element.sendKeys(dataRealizacao);
		teclarParaBaixo();

		elementControlId("valor_informado_1");
		element.sendKeys(valorInformado);
		teclarParaBaixo();

		elementControlId("cod_dente_regiao_1");
		Select combo = new Select(driver.findElement(By.id("cod_dente_regiao_1")));
		combo.selectByIndex(1);
	}

	public void preencherCamposObservacao(String obsEmissao, String obsOperadora)
			throws InterruptedException, AWTException {
		element = driver.findElement(By.linkText("Observações"));
		element.click();

		Thread.sleep(300);
		elementControlId("txt_obs_emissao");
		element.click();
		element.sendKeys(obsEmissao);
		teclarParaBaixo();

		elementControlId("txt_obs_operadora");
		element.click();
		element.sendKeys(obsOperadora);
		teclarParaBaixo();
	}

	public void preencherCamposInformacoes(String dataPostagem, String numero, String dataRecebimento, int formaPgto)
			throws AWTException {
		elementControlId("data_postagem");
		element.sendKeys(dataPostagem);
		teclarParaBaixo();

		elementControlId("num_comprovante");
		element.sendKeys(numero);

		elementControlId("data_recebimento");
		element.sendKeys(dataRecebimento);
		teclarParaBaixo();
		Select combo2 = new Select(driver.findElement(By.id("ind_forma_pgto")));
		combo2.selectByIndex(formaPgto);
		teclarParaBaixo();
	}

	public void preencherOscamposDeAtendimento(String numeroPrestador) throws AWTException {
		elementControlId("num_insc_fiscal_prestador");
		element.sendKeys(numeroPrestador);
		teclarParaBaixo();
	}

	public void ConsultaReembolsoBeneficiario() {
		elementControlXpath("//*[@id=\'imgAutorizacaoPrevia\']");
		element.click();
	}

	public void validarTelaConsultaReembolso() {
		elementControlCssSelector(
				"#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font");
		element.click();

		String value = element.getText().toString();

		assertEquals("Consulta Reembolso", value);

	}

	public WebElement elementControlCssSelector(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "cssSelector");
		element = driver.findElement(By.cssSelector(elementStr));
		modulo.highLight(element, driver);
		return element;
	}

	public void acessarTelaAnexo() {
		element = driver.findElement(By.linkText("Anexos"));
		element.click();
		elementControlId("btnAnexo");
		element.click();
	}

	public void validarTelaAnexo() {
		elementControlCssSelector("#form01 > div > div:nth-child(3) > div > div > div > span");
		element.click();

		String value = element.getText().toString();
		System.out.println(value);

		assertEquals("Contrato", value);

	}

	public void validarTelaPreviaDoContrato() {
		elementControlCssSelector(
				"#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font");
		element.click();

		String value = element.getText().toString();

		assertEquals("Prévia Reembolso - Por Contrato", value);

	}

	public void validarTelaPreviaPorFamilia() {
		elementControlCssSelector(
				"#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font");
		element.click();

		String value = element.getText().toString();

		assertEquals("Prévia Reembolso - Por Família", value);
	}

	public void validarTelaPreviaPorBeneficiario() {
		elementControlCssSelector(
				"#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font");
		element.click();

		String value = element.getText().toString();

		assertEquals("Prévia Reembolso - Por Beneficiário", value);

	}

	public void ConsultaPreviaPorFamilia() {
		elementControlXpath("//*[@id='imgPesquisaPreviaFamilia']");
		element.click();
	}

	public void ConsultaPreviaPorContrato() {
		elementControlXpath("//*[@id='imgPesquisaPreviaContrato']");
		element.click();
	}

	public void ConsultaPreviaPorBeneficiario() throws InterruptedException {
		Thread.sleep(1000);
		elementControlXpath("//*[@id='imgPesquisaPreviaBeneficiario']");
		element.click();
	}

	public void ConsultaHistoricoProcedimento() throws InterruptedException {
		Thread.sleep(1000);
		elementControlXpath("//*[@id='imgHistoricoProcedimento']");
		element.click();
	}

	public void ConsultaPesquisaDadosBeneficiarioContrato() throws InterruptedException {
		Thread.sleep(1000);
		elementControlXpath("//*[@id='imgPesquisaPadrao']");
		element.click();

	}

	public void validarTelaPesquisaPorBeneficiarioContratos() throws InterruptedException {
		Thread.sleep(2000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9530TelaHistoricoBeneficiario");
	}

	public void validarAberturaAlertasBeneficiario() {
		elementControlCssSelector(
				"#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font");
		element.click();

		String value = element.getText().toString();

		assertEquals("Pesquisa Alertas Beneficiário", value);
	}

	public void pesquisarReembolso(String codPrestador) throws InterruptedException {
		String numeroAssociado = "num_reembolso";
		String botao = "Pesquisa_Pedido";

		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);

		preencherCampoInput(numeroAssociado, codPrestador);
	}

	public void incluirAnexo(String numReembolso) throws Exception {
	}

	public void selecionarCPFInformado() throws InterruptedException {
		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(1));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);

		WebElement element = driver.findElement(By.linkText("AMAURI MONICA ROSALVÃO"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(300);
	}

	public void clicarDadosBeneficiarioContrato() {
		elementControlId("imgPesquisaPadrao");
		element.click();
	}

	public void Assumir() {
		elementControlId("btnAssumir");
		element.click();
	}

	public void clicarCancelar() {

		WebElement element = driver
				.findElement(By.cssSelector("#btn_ExecutarAcao\\(\\\"CA\\\"\\)\\; > .barimg:nth-child(1)"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void preencherCamposObrigatoriosCancelamentoAnalise() throws InterruptedException {

		elementControlId("txt_obs_emissao");
		element.sendKeys("dsada12121");

		elementControlId("txt_obs_operadora");
		element.sendKeys("casd12121");

		Thread.sleep(200);
		elementControlId("cod_motivo_canc");
		Select combo = new Select(driver.findElement(By.id("cod_motivo_canc")));
		combo.selectByIndex(1);

	}

	public void Submeter() {
		elementControlCssSelector("#btn_ExecutarAcao\\(\\\"SU\\\"\\)\\; > img");
		element.click();
	}

	public void CancelarPedido() throws InterruptedException {
		Thread.sleep(1000);
		elementControlXpath("//*[@id='btn_acao_executar();']/img");
		element.click();
	}

	public void preencherCamposObrigatoriosCancelamentoAguarDoc() throws InterruptedException {

		elementControlId("txt_obs_emissao");
		element.sendKeys("dsada12121");

		elementControlId("txt_obs_operadora");
		element.sendKeys("casd12121");

		Thread.sleep(200);
		elementControlId("cod_motivo_canc");
		Select combo = new Select(driver.findElement(By.id("cod_motivo_canc")));
		combo.selectByIndex(1);

	}

	public void preencherOsDadosProcedimentoSuspenso(String codProcedimento, int codDente, String dataRealizacao,
			String valorInformado) throws AWTException, InterruptedException {

		elementControlId("button2");
		element.click();

		elementControlId("item_medico_1");
		element.sendKeys(codProcedimento);
		teclarParaBaixo();

		elementControlId("data_realizacao_1");
		element.sendKeys(dataRealizacao);
		teclarParaBaixo();

		elementControlId("valor_informado_1");
		element.sendKeys(valorInformado);
		teclarParaBaixo();

		elementControlId("cod_dente_regiao_1");
		Select combo = new Select(driver.findElement(By.id("cod_dente_regiao_1")));
		combo.selectByIndex(1);
	}

	public void preencherCampoDataRealizacao(String dataRealizacao) throws AWTException {
		elementControlId("data_realizacao_1");
		element.sendKeys(dataRealizacao);
		teclarParaBaixo();

	}

	public void preencherValorInformado(String valorInformado) throws AWTException {
		elementControlId("valor_informado_1");
		element.sendKeys(valorInformado);
		teclarParaBaixo();
	}

	public String alertaAcept() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return null;
	}

	public void selecionarPrestadorParaEdicao(String cpfEdicao) {
		elementControlId("num_insc_fiscal_prestador");
		element.clear();
		element.sendKeys(cpfEdicao);
	}

	public void clicarAlterarAnalise() {
		// elementControlId("btn_ExecutarAcao(\"AN\")");
		elementControlXpath("/html/body/form/div/span[2]");
		element.click();
		mudarPrincipal();
	}

	public void preencherFormaPagamento() throws AWTException {
		Select combo2 = new Select(driver.findElement(By.id("ind_forma_pgto")));
		combo2.selectByIndex(1);
		teclarParaBaixo();
	}

	public void clicarSubmeter() {
		//elementControlCssSelector("#btn_ExecutarAcao\\(\\\"SU\\\"\\)\\; > .barimg:nth-child(1)");
		elementControlXpath("/html/body/form/div/span[3]");
		element.click();
		mudarPrincipal();
	}

	public void informarCodigoDente() throws AWTException {
		elementControlId("cod_dente_regiao_1");
		Select combo = new Select(driver.findElement(By.id("cod_dente_regiao_1")));
		combo.selectByIndex(1);
		teclarParaBaixo();
	}

	public void alertasBeneficiario() throws InterruptedException {
		Thread.sleep(1000);
		elementControlXpath("//*[@id=\"imgExibeAlertaBeneficiario\"]");
		element.click();

	}

	public void pesquisarPreviaBeneficiarioPorFamilia() throws InterruptedException {
		Thread.sleep(2000);
		elementControlXpath("//*[@id=\'imgExibeAlertaBeneficiario\']");
		element.click();
	}

	public void pesquisarContato() throws InterruptedException {
		Thread.sleep(2000);
		elementControlXpath("//*[@id=\'imgAbreContato\']");
		element.click();
	}

	public void validarTelaAlertaBeneficiario() throws InterruptedException {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9530TelaAlertaContato");
	}

	public void validarTelaContato() throws InterruptedException {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9530TelaContatos");
	}

	public void validarTelaPreviaPorFamiliaBeneficiario() throws InterruptedException {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9530TelaPorFamiliaBeneficiario");
	}

	public void fecharJanela() throws Exception {
		Thread.sleep(2000);
		String windowsHandler = driver.getWindowHandle();
		frame.fecharJanela();
		frame.trocarJanela(windowsHandler);
		frame.frame(2);
		frame.frame(2);
	}

	public void fecharContato() {
		elementControlId("btnFecharContato");
		element.click();
	}

	public void consultarReembolsoBeneficiario() throws InterruptedException {
		elementControlXpath("//*[@id='imgAutorizacaoPrevia']");
		element.click();
	}

	public void validarTelaHistoricoProcedimento() throws InterruptedException {
		Thread.sleep(1000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9530TelaHistoricoBeneficiario");
	}

	public void aprovarGlosa() throws Exception {
		frame.sairFrame();

		frame.frame("iframeasp");
		frame.frame("principal2");

		elementControlId("imgGlosaItem1");
		element.click();

		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");

		elementControlCssSelector("#ind_marcar_todos");
		element.click();

		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");

		elementControlXpath("//*[@id=\"btn_acao_executar();\"]/img");
		element.click();

	}

	public void clicarAprovarAnalise() {
		elementControlXpath("/html/body/form/div/span");
		element.click();
	}

	public void realizarAprovacaoGlosa() throws Throwable {
		//clicarNoBotãoAnáliseDeProcedimentos();
	
		elementControlCssSelector("#btn_LiberarGlosas\\(\\)\\; > img");
		element.click();
		
	}

	public void clicarNoBotãoAnáliseDeProcedimentos() throws Throwable {
		mudarPrincipal();

		List<WebElement> checkBoxMedic = driver.findElements(By.tagName("input"));

		assertTrue(!checkBoxMedic.isEmpty());

		for (WebElement inputs : checkBoxMedic) {
			if (inputs.getAttribute("name").contains("chk_item_medico_")) {
				inputs.click();
			}
		}

		//mudarToolbar();
		
		driver.findElement(By.id("btn_LiberarGlosas();")).click();

		janelaAtual = driver.getWindowHandle();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		driver.findElement(By.id("ind_marcar_todos_glosa")).click();

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_executar();")).click();

		frame.alertaObterConfirmar();

		//aguarde();

		frame.sairFrame();
		frame.frame("principal2");
		// String expected = "Operação realizada com sucesso".toLowerCase();
		// String actual = driver.findElement(By.id("txt_msg")).getText().toLowerCase();
		// assertEquals(expected, actual);

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_voltar")).click();

		frame.trocarJanela(janelaAtual);
	}

	private void aguarde() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("//*[@id=\"dvAguarde\"]/div/div")));
	}

	void mudarPrincipal() {
		mudar("principal2");
		try {
			aguarde();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void mudar(String target) {
		frame.sairFrame();
		try {
			frame.frame("iframeasp");
			frame.frame(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mudarToolbar() {
		mudar("toolbarMvcToAsp");
	}

}
