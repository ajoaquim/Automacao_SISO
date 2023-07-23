package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Ultils.UtilsModule;

public class ReembolsoI  {
	UtilsModule modulo = new UtilsModule(); 
	
	WebDriver driver;
	String elementStr;
	WebElement element;
//	private WebDriverWait wait;

	
	public ReembolsoI(WebDriver driver) {				
		this.driver = driver;
//		this.wait = new WebDriverWait(driver, 10);
	}
	
	public void valide() {
		String element = "//*[@id=\"hplogo\"]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement textoElement;
		textoElement = driver.findElement(By.xpath(element));
		textoElement.getText();	
	}
	
/////////////MENUS///////////////////////////////////////////////////////
	
	
	public void Menu_Reembolso() throws InterruptedException
	{
		String elementStr = "//*[@id=\"dropdown\"][18]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement menu_gestao = driver.findElement(By.xpath(elementStr));
		modulo.highLight(menu_gestao, driver);
		menu_gestao.click();
	}
	
	public void Menu_Previa_reembolso() throws InterruptedException
	{
		
		String elementMenuCad = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[18]/div/div/ul/li[12]";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	public void Menu_Inclusao_reembolso() throws InterruptedException
	{
		String elementMenuCad = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[18]/div/div/ul/li[1]/a";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	public void Menu_anexo_reembolso() throws InterruptedException
	{
		String elementMenuCad = "//*[@id=\"dropdown\"][18]//li[8]";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
//	public void Menu_historico_reembolso() throws InterruptedException
//	{
//		String elementMenuCad = "//*[@id=\"dropdown\"][18]//li[4]";
//		modulo.waitingElement(driver, elementMenuCad, "xpath");
//		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
//		modulo.highLight(menu_cad_prest, driver);
//		menu_cad_prest.click();
//	}
	
	public void Menu_Situacao_previa() throws InterruptedException
	{
		String elementMenuCad = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[18]/div/div/ul/li[12]/div/div/ul/li[6]/a";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	public void Menu_Historico_reembolso() throws InterruptedException
	{
		String elementMenuCad = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[18]/div/div/ul/li[12]/div/div/ul/li[3]/a";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	
	
	public WebElement elementControlXpath(String elementStr2) {	
        elementStr = elementStr2;
        modulo.waitingElement(driver, elementStr, "xpath");
        element = driver.findElement(By.xpath(elementStr));
        modulo.highLight(element, driver);
        return element;
    }
	
	public WebElement elementControlCssSelector(String elementStr2) {
        elementStr = elementStr2;
        modulo.waitingElement(driver, elementStr, "cssSelector");
        element = driver.findElement(By.cssSelector(elementStr));
        modulo.highLight(element, driver);
        return element;
    }
  
	public WebElement elementControlId(String elementStr2) {
        elementStr = elementStr2;
        modulo.waitingElement(driver, elementStr, "id");
        element = driver.findElement(By.id(elementStr));
        modulo.highLight(element, driver);
        return element;
    }
	
	public void NumReembolsoAnexo(String num) {
		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		elementControlId("num_reembolso");
		element.sendKeys(num);
	}
	
	public void NumReembolsoAnexoTab() {
		elementControlId("num_reembolso");
		element.sendKeys(Keys.TAB);
	}
	
	public void BeneficiarioAnalise() {
		elementControlId("jqg_jqGridSituacao_3");
		element.click();
	}
	
	public void BeneficiarioAutorizado() {
		elementControlId("jqg_jqGridSituacao_1");
		element.click();
	}
	
	public void BeneficiarioCancelado() {
		elementControlId("jqg_jqGridSituacao_2");
		element.click();
	}
	
	public void SeltpAnexo() {
		elementControlCssSelector("#ind_tipo_anexo");
		Select combo = new Select(driver.findElement(By.cssSelector("#ind_tipo_anexo")));
		combo.selectByIndex(3);
	}
	
	public void DescAnexo(String desc) {
		elementControlId("txt_descricao");
		element.sendKeys(desc);
	}
	
	public void AnexaArq() {
		WebElement arq = driver.findElement(By.id("nom_arq_anexo"));
		arq.sendKeys("C:/notas.txt");
	}
	
	public void Btnexecutar() {
	WebElement iframe2 = driver.findElement(By.id("iframeasp"));
	driver.switchTo().frame(iframe2);
	WebElement iframe3 = driver.findElement(By.id("toolbarMvcToAsp"));
	driver.switchTo().frame(iframe3);
	WebElement botexe = driver.findElement(By.id("btn_acao_executar();"));
	botexe.click();
    }
	
	
	
	public void BotConsulta() {
		WebElement botcon = driver.findElement(By.id("btnexecutar"));
		botcon.click();
		botcon.sendKeys(Keys.PAGE_DOWN);
	}
	
	public void SelAbrirAnexo() {
		elementControlCssSelector("#btnAnexoPrevia");
		element.click();
	}
	
	public void SelAltPrevia() {
		elementControlCssSelector("#btnAlteracaoPrevia");
		element.click();
	}
	
	public void usubaixo() {
		elementControlCssSelector("#NUM_PROTOCOLO_ANS");
		element.click();
		element.sendKeys(Keys.PAGE_DOWN);
	}
	
	
	public void SelAbrirCancelamentoPrevia() {
		elementControlCssSelector("#btnCancelaPrevia");
		element.click();
	}
	
	public void SelConsultaPrevia() {
		elementControlCssSelector("#btnHistoricoPedido");
		element.click();
	}
	
//	public void result() throws InterruptedException {
//		WebElement res = driver.findElement(By.cssSelector("#grid_NUM_PREVIA"));
//		res.click();
//		Thread.sleep(2000);
//		res.sendKeys(Keys.PAGE_DOWN);
//	}
	
	
	public void Txtobs() {
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		elementControlId("txt_descricao");
		element.click();
	}
	
	public void AlertaInclusao() {
		WebElement iframe2 = driver.findElement(By.id("toolbarModal"));
		driver.switchTo().frame(iframe2);
		elementControlId("btn_acao_voltar");
		element.click();
	}
	
	
	public void previa() {
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		elementControlId("num_previa");
		element.click();
	}
	
	public void Informa_previa(String num) {
		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		elementControlId("num_previa");
		element.sendKeys(num);
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
	
	public void Benefi() {
		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		WebElement ben = driver.findElement(By.id("data_postagem"));
		ben.sendKeys("20/12/2020");
		//ben.sendKeys(Keys.ENTER);
	}
	
	public void NomeInscricao() {
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		WebElement ben = driver.findElement(By.id("nome_prestador"));
		ben.sendKeys("testettt");
	}
	
	public void BotIncluiNomeInscricao() {
		WebElement ben = driver.findElement(By.id("btn_acao_incluir();"));
		ben.click();
	}
	
	
	public void recebimento() {
		WebElement ben = driver.findElement(By.id("data_recebimento"));
		ben.sendKeys("25/12/2020");
		//ben.sendKeys(Keys.ENTER);
	}
	
	public void Banco() {
		WebElement ben = driver.findElement(By.id("cod_banco"));
		ben.sendKeys("001");
	}
	
	public void Agencia() {
		WebElement ben = driver.findElement(By.id("cod_agencia_bancaria"));
		ben.sendKeys("1234");
	}
	
	public void digAgencia() {
		WebElement ben = driver.findElement(By.id("num_dv_agencia"));
		ben.sendKeys("1");
	}
	
	
	public void Ccorrente() {
		WebElement ben = driver.findElement(By.id("num_conta_corrente"));
		ben.sendKeys("123456789111123");
	}
	
	public void Digccorrente() {
		WebElement ben = driver.findElement(By.id("num_dv_cc"));
		ben.sendKeys("12");
	}
	
	public void InscricaoAtendimento() {
		WebElement ben = driver.findElement(By.id("num_insc_fiscal_prestador"));
		ben.sendKeys("52362003779");
		//ben.sendKeys(Keys.TAB);
	}
	
	public void Titulo() {
		WebElement titu = driver.findElement(By.id("tdExecInscricao01"));
		titu.click();
	}
	
	public void Adprocedimento() {
		WebElement ben = driver.findElement(By.id("button2"));
		ben.click();
	}
	
	public void Cdprocedimento() {
		WebElement ben = driver.findElement(By.id("item_medico_1"));
		ben.sendKeys("85100242");
		ben.sendKeys(Keys.TAB);
	}
	
	
	public void Fmpag() throws InterruptedException
	{
		Select combo2 = new Select(driver.findElement(By.cssSelector("#ind_forma_pgto"))); 
		combo2.selectByIndex(2);
	}
	
	public void DenteProcedimento()  
	{
		Select combo2 = new Select(driver.findElement(By.cssSelector("#cod_dente_regiao_1"))); 
		combo2.selectByIndex(10);
	}
	
	public void LaudoProcedimento() {
		WebElement ben = driver.findElement(By.id("ind_laudo_1"));
		ben.click();
	}
	
	public void RaioxinicioProcedimento() {
		WebElement ben = driver.findElement(By.id("ind_raiox_ini_1"));
		ben.click();
	}
	
	public void RaioxfimProcedimento() {
		WebElement ben = driver.findElement(By.id("ind_raiox_fim_1"));
		ben.click();
	}
	
	public void Realizacaoprocedimento() {
		WebElement ben = driver.findElement(By.id("data_realizacao_1"));
		ben.sendKeys("20/12/2020");
		//ben.sendKeys(Keys.TAB);
	}
	
	public void Valorprocedimento() {
		WebElement ben = driver.findElement(By.id("valor_informado_1"));
		ben.sendKeys("10000");
		ben.sendKeys(Keys.TAB);
	}
	
	
	public void numprevia() {
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		elementControlId("num_previa");
		element.click();
	}
	
	public void ConsultaReembolso() {
		WebElement ben = driver.findElement(By.id("imgAutorizacaoPrevia"));
		ben.click();
	}
	
	
	
	
	}
	  
	  


	  
	

