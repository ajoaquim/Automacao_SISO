package pageObject;



import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Ultils.UtilsModule;

public class AlteracaoPage  {
	UtilsModule modulo = new UtilsModule(); 
	
	WebDriver driver;
	
	public AlteracaoPage(WebDriver driver) {				
		this.driver = driver;
	}
	
	public void valide() {
		String element = "//*[@id=\"hplogo\"]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement textoElement;
		textoElement = driver.findElement(By.xpath(element));
		textoElement.getText();	
	}
	
/////////////MENUS///////////////////////////////////////////////////////
	public void Menu_Gestão_Prestadores_odontologicos() throws InterruptedException
	{
		String elementStr = "//*[@id='dropdown'][11]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement menu_gestao = driver.findElement(By.xpath(elementStr));
		modulo.highLight(menu_gestao, driver);
		menu_gestao.click();
	}
	
	public void Menu_Cadastro_prestador() throws InterruptedException
	{
		String elementMenuCad = "//*[@id='dropdown'][11]//li[1]";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	public void Menu_Alteracao() throws InterruptedException
	{
		String elementMenuCad = "//*[@id='dropdown'][11]//li[1]//li[1]";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	public void Menu_ocorrencias() 
	{
		String elementMenuOco = "//*[@id='dropdown'][11]//li[1]//li[2]";
		modulo.waitingElement(driver, elementMenuOco, "xpath");
		WebElement menu_oco = driver.findElement(By.xpath(elementMenuOco));
		modulo.highLight(menu_oco, driver);
		menu_oco.click();
	}
	
	public void Menu_ResgistroSuspensao() {									
		String elementMenuRegSus = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[11]/div/div/ul/li[1]/div/div/ul/li[6]/a";
		modulo.waitingElement(driver, elementMenuRegSus, "xpath");
		WebElement menu_reg_sus = driver.findElement(By.xpath(elementMenuRegSus));
		modulo.highLight(menu_reg_sus, driver);
		menu_reg_sus.click();
	}
	
	public void Menu_interirorBloqueio() {
		String elementMenuRegSus = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[11]/div/div/ul/li[1]/div/div/ul/li[6]/div/div/ul/li[1]/a";
		modulo.waitingElement(driver, elementMenuRegSus, "xpath");
		WebElement menu_reg_sus = driver.findElement(By.xpath(elementMenuRegSus));
		modulo.highLight(menu_reg_sus, driver);
		menu_reg_sus.click();
	}
	
	public void Menu_Qualificação() {
		String elementQuali = "//*[@id='dropdown'][11]//li[1]//li[4]";
		modulo.waitingElement(driver, elementQuali, "xpath");
		WebElement menu_Quali = driver.findElement(By.xpath(elementQuali));
		modulo.highLight(menu_Quali, driver);
		menu_Quali.click();
	}
	
	public void Menu_interiorCancelaBloqueio() {
		String elementMenucanSus = "//*[@id=\"dropdown-lvlODO_PRS0183\"]//li[2]";
		modulo.waitingElement(driver, elementMenucanSus, "xpath");
		WebElement menu_can_sus = driver.findElement(By.xpath(elementMenucanSus));
		modulo.highLight(menu_can_sus, driver);
		menu_can_sus.click();
	}
	
	public void Menu_ConsultaPrestador() throws InterruptedException
	{
		String elementMenuCon = "//*[@id='dropdown'][11]//li[4]";
		modulo.waitingElement(driver, elementMenuCon, "xpath");
		WebElement menu_con_prest = driver.findElement(By.xpath(elementMenuCon));
		modulo.highLight(menu_con_prest, driver);
		menu_con_prest.click();
	}
	
	
////////////////////FIM MENU////////////////////////////////
	
	public void Informa_prestador(String prest)
	{
		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		WebElement escprest = driver.findElement(By.id("cod_prestador"));
		escprest.click();

		//escprest.sendKeys("011444");
		escprest.sendKeys(prest);
	}
	
	public void testerede() {
		WebElement iframe1 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("submenu"));
		driver.switchTo().frame(iframe2);
		System.out.println("Buscando o botão Rede Atendimento");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[5]"));
		System.out.println(element.getTagName());
		element.click();
		
	} 

    public void waitPrest() {
	  String element = "//*[@id=\"cod_prestador\"]";
	  modulo.waitingElement(driver, element, "xpath");
	  WebElement clica = driver.findElement(By.xpath("//*[@id=\"cod_prestador\"]"));
	  clica.click();

	}
	
	public void PrestadorAlteracao(String prest)
	{
		WebElement iframe2 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("pesquisa"));
		driver.switchTo().frame(iframe1);
		//waitPrest();
		WebElement escprest = driver.findElement(By.id("cod_prestador"));
		escprest.click();

		//escprest.sendKeys("011444");
		escprest.sendKeys(prest);
	}
	
	
	public void PrestadorExclusao(String prest)
	{
		WebElement iframe2 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("pesquisa"));
		driver.switchTo().frame(iframe1);
		WebElement escprest = driver.findElement(By.id("cod_prestador"));
		escprest.click();

		//escprest.sendKeys("011444");
		escprest.sendKeys(prest);
	}
	
	public void tabela() {
		WebElement iframe3 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe3);
		//WebElement iframe2 = driver.findElement(By.id("pesquisa"));
		//driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("I1"));
		driver.switchTo().frame(iframe1);
		String element = "//*[@id='TBSocio']/tbody/tr[2]/td[1]/input[2]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement clica = driver.findElement(By.xpath("//*[@id='TBSocio']/tbody/tr[2]/td[1]/input[2]"));
		clica.click();
		
	}
	
	public void numero(String num) {
		WebElement clica = driver.findElement(By.xpath("//*[@id=\"num_endereco_1\"]"));
		String element2 = "//*[@id=\"num_endereco_1\"]";
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath(element2));
		actions.doubleClick(elementLocator).perform();
		clica.sendKeys(Keys.BACK_SPACE);
		clica.sendKeys(num);
		
	}
	
	public void numeroAtendimento(String num) {
		WebElement clica = driver.findElement(By.xpath("//*[@id=\"num_endereco_1\"]"));
		String element2 = "//*[@id=\"num_endereco_1\"]";
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath(element2));
		actions.doubleClick(elementLocator).perform();
		clica.sendKeys(Keys.BACK_SPACE);
		clica.sendKeys(num);
		
	}
	
	public void Dtfimpagamento() {
		Select combo2 = new Select(driver.findElement(By.cssSelector("#ind_forma_pgto"))); 
		combo2.selectByIndex(3); 
	}
	
	public void Divulga() {
		String element = "//*[@id=\"grid_tipo_prestador_1\"]/tbody/tr[1]/td[5]/input";
		modulo.waitingElement(driver, element, "xpath");
		WebElement clica = driver.findElement(By.xpath("//*[@id=\"grid_tipo_prestador_1\"]/tbody/tr[1]/td[5]/input"));
		clica.click();
		
	}
	
	public void ValidaCancelamento() {
		String element = "#Table1 > tbody > tr:nth-child(1) > td:nth-child(1)";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement clica = driver.findElement(By.cssSelector("#Table1 > tbody > tr:nth-child(1) > td:nth-child(1)"));
		clica.click();
		
	}
	

	public void Seltipoatendimento() {
		String element = "/html/body/form[1]/fieldset/center/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]/input[1]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement clica = driver.findElement(By.xpath("/html/body/form[1]/fieldset/center/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]/input[1]"));
		clica.click();
		
	}
	
	public void Pesquisa() {
		String element = "#form01 > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=button]:nth-child(2)";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement adicionar = driver.findElement(By.cssSelector(element));
		adicionar.click();
	}
	
	public void MarcaTodos() {
		String element = "#marcarTodos";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement adicionar = driver.findElement(By.cssSelector(element));
		adicionar.click();
	}
	
	public void Continuar() {
		String element = "//*[@id=\"btn_acao_continuar\"]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement adicionar = driver.findElement(By.xpath(element));
		adicionar.click();
	}
	
	public void AlteraDoc() {
		String element = "#grid_documentacao > tbody > tr:nth-child(6) > td:nth-child(1) > input";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement adicionar = driver.findElement(By.cssSelector(element));
		adicionar.click();
	}
	
	public void AdEspecialidades() { 
		String element = "//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/center/input";
		modulo.waitingElement(driver, element, "xpath");
		WebElement clica = driver.findElement(By.xpath("/html/body/form[1]/fieldset/center/table/tbody/tr/td/center/input"));
		clica.click();
		
	}
	
	public void Adicionar() {
		String element = "/html/body/form[1]/fieldset/center/table/tbody/tr/td/center/input";
		modulo.waitingElement(driver, element, "xpath");
		WebElement adicionar = driver.findElement(By.xpath(element));
		adicionar.sendKeys(Keys.PAGE_DOWN);
	}
	
	
	public void baixo () {
		String element = "/html/body/form[1]/fieldset/center/table/tbody/tr/td/center/input";
		modulo.waitingElement(driver, element, "xpath");
		WebElement adicionar = driver.findElement(By.xpath(element));
		adicionar.sendKeys(Keys.PAGE_DOWN);
		adicionar.click();
		//adicionar.sendKeys(Keys.PAGE_DOWN);
	}
	
		
	public void alteraemail(String email) {
		WebElement altemai = driver.findElement(By.cssSelector("#TBSocio > tbody > tr:nth-child(2) > td:nth-child(5) > input[type=text]"));
		altemai.sendKeys(email);
	}
	
	public void EnderecoRelacionamento() {
		WebElement iframe1 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("submenu"));
		driver.switchTo().frame(iframe2);
		WebElement endrela = driver.findElement(By.id("15"));
		endrela.click();
	}
	
	public void Documentos() {
		WebElement iframe1 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("submenu"));
		driver.switchTo().frame(iframe2);
		WebElement endrela = driver.findElement(By.id("60"));
		endrela.click();
	}
	
	public void TipoAtendimento() {
		WebElement iframe1 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("submenu"));
		driver.switchTo().frame(iframe2);
		WebElement endrela = driver.findElement(By.id("47"));
		endrela.click();
	}
	
	public void DadosPagamento() {
		WebElement iframe1 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("submenu"));
		driver.switchTo().frame(iframe2);
		WebElement endrela = driver.findElement(By.id("55"));
		endrela.click();
	}
	
	
	public void EnderecoAtendimento() {
		WebElement iframe1 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("submenu"));
		driver.switchTo().frame(iframe2);
		WebElement endrela = driver.findElement(By.id("10"));
		endrela.click();
	}
	
	public void RedeAtendimento() {
		WebElement iframe1 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("submenu"));
		driver.switchTo().frame(iframe2);		
		System.out.println("Buscando o botão Rede Credenciada.");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[5]/a"));
		System.out.println(element.getTagName());
		element.click();
	}
	
	public void Documentacao() {
		WebElement iframe1 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("submenu"));
		driver.switchTo().frame(iframe2);
		System.out.println("Buscando o botão Documentacao");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[13]/a"));
		System.out.println(element.getTagName());
		element.click();
	}
	
	
	public void TpEstabelecimento() {
		WebElement iframe1 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("submenu"));
		driver.switchTo().frame(iframe2);
		WebElement endrela = driver.findElement(By.id("25"));
		endrela.click();
	}
	
	public void HabilitacaoEspecialidades() {
		WebElement iframe1 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("submenu"));
		driver.switchTo().frame(iframe2);
		WebElement endrela = driver.findElement(By.id("30"));
		endrela.click();
	}
	
	public void table() {
		String element = "#grid_rede > tbody > tr:nth-child(1) > td:nth-child(6) > input";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement adicionar = driver.findElement(By.cssSelector(element));
		adicionar.click();
		
	}
	

	
	
	public void DtRegistroBloq(String dt) {
		WebElement elemento = driver.findElement(By.id("dt_licenca_ini"));
		if(elemento.isDisplayed()) {
			System.out.println("Elemento encontrado");
			}
			else{
			System.out.println("Elemento não encontrado");	
			}
		elemento.click();
		elemento.sendKeys(dt);
	}
	
	public void Situacao() {
		Select combo2 = new Select(driver.findElement(By.cssSelector("#cod_situacao"))); 
		combo2.selectByIndex(2);
	}
	
	
	public void ConfirmaConsultaAlteracao() {
		WebElement elemento = driver.findElement(By.id("tbl_inc_abre_table"));
		if(elemento.isDisplayed()) {
			System.out.println("Elemento encontrado");
			}
			else{
			System.out.println("Elemento não encontrado");	
			}
	}
	
	public void seleciona_fora()
	{
		WebElement escprest2 = driver.findElement(By.id("cod_prestador"));
		escprest2.sendKeys(Keys.TAB);
		
	}
	
	public void teclado() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		
	}
	
	public void TeclaEnter() throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	public void Ate() {
		String element = "//*[@id='dt_licenca_fim']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement ate = driver.findElement(By.xpath(element));
		ate.sendKeys("14/12/2020");
	}
	
	public void ValidaExcluiBloq() {
		String element = "//*[@id=\"txt_obs\"]";
		modulo.waitingElement(driver, element, "xpath");
		//WebElement ate = driver.findElement(By.xpath(element));
	}
	
	
	
	
	public void cofirmaConsulta() throws InterruptedException 
	{
		WebElement elementDat = driver.findElement(By.id("txt_obs_ocorrencia"));
		if(elementDat.isDisplayed()) {
		System.out.println("Elemento encontrado");
		}
		else{
		System.out.println("Elemento não encontrado");	
		}
	}
	
	public void Confirmaobs () {
		WebElement elementDat = driver.findElement(By.id("txt_obs"));
		if(elementDat.isDisplayed()) {
		System.out.println("Elemento encontrado");
		}
		else{
		System.out.println("Elemento não encontrado");	
		}
	}
	
	public void Confirmaotpocorrencia () {
		WebElement elementDat = driver.findElement(By.id("Table1"));
		if(elementDat.isDisplayed()) {
		System.out.println("Elemento encontrado");
		}
		else{
		System.out.println("Elemento não encontrado");	
		}
	}
	
	public void Confirmatela () {
		WebElement elementDat = driver.findElement(By.id("btn_EnviaEmailSMS()"));
		if(elementDat.isDisplayed()) {
		System.out.println("Elemento encontrado");
		}
		else{
		System.out.println("Elemento não encontrado");	
		}
	}
	
	public void Confirmavoltar () {
		WebElement elementDat = driver.findElement(By.id("btn_acao_voltar"));
		if(elementDat.isDisplayed()) {
		System.out.println("Elemento encontrado");
		}
		else{
		System.out.println("Elemento não encontrado");	
		}
	}
	
	public void ConfirmaAlteracao() {
		WebElement elemento = driver.findElement(By.xpath("/html/body/center/font"));
		//assertEquals("Operação realizada com sucesso", elemento);
		if(elemento.isDisplayed()) {
			System.out.println("Elemento encontrado");
			}
			else{
			System.out.println("Elemento não encontrado");	
			}
		//String elementStr = "//font[contains(text(), 'Operação realizada com sucesso')]";
		//modulo.waitingElemnt(driver, elementStr);
		//WebElement element = driver.findElement(By.xpath(elementStr));
		//String value = element.getText().toString();
		//System.out.println(value);
		//assertEquals("Operação realizada com sucesso", value);
		
	}

	public void AlterarConsulta() throws InterruptedException
	{
		WebElement elementobs = driver.findElement(By.id("txt_obs_ocorrencia"));
		elementobs.click();
		elementobs.sendKeys("teste1");
	}
	
	public void Alterarlista() throws InterruptedException
	{
		Select combo2 = new Select(driver.findElement(By.cssSelector("#cod_tipo_ocorrencia"))); 
		combo2.selectByIndex(12); 
	}
	
	public void AlterarMotivo() {
		Select combo = new Select(driver.findElement(By.cssSelector("#cod_motivo")));
		combo.selectByIndex(5);
	}
	
	public void Tpestabelecimento() {
		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		Select combo = new Select(driver.findElement(By.cssSelector("#cod_tipo_prestador")));
		combo.selectByIndex(1);
	}
	
	public void Operadora() {
		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe2);
		Select combo = new Select(driver.findElement(By.cssSelector("#cod_operadora")));
		combo.selectByIndex(1);
	}
	
	public void TipoEstabelecimento() throws InterruptedException {
		  WebElement tpestab = driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]"));
		  tpestab.sendKeys("Consultorio e clinica");
	  }
	
	public void TipoEstabelecimentoEnter() throws InterruptedException {
		  WebElement tpestab = driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]"));
		  tpestab.sendKeys("Consultorio e clinica");
		  
	  }
	
	public void tpenter() throws InterruptedException
	{
		WebElement digestab = driver.findElement(By.xpath("//*[@id=\"s2id_cod_tipo_prestador\"]/a/span[1]"));
		digestab.click();
		WebElement selestab = driver.findElement(By.xpath("/html/body/div[3]/ul/li/div"));
		selestab.click();
	}
	
	public void Qualificação() {
		WebElement qual = driver.findElement(By.xpath("//*[@id=\"cod_item_qualificacao\"]"));
		qual.sendKeys("M - Mestrado");
	}
	
	public void dtInicioQualif() {
		WebElement dtinicio = driver.findElement(By.id("data_inicio"));
		dtinicio.sendKeys("01122019");
	}
	
	public void Beneficiario(String benefi) {
//		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
//		driver.switchTo().frame(iframe1);
//		WebElement iframe2 = driver.findElement(By.id("principal2"));
//		driver.switchTo().frame(iframe2);
		WebElement benef = driver.findElement(By.id("num_associado"));
		benef.click();
		benef.sendKeys(benefi);
	}
	
	public void SaidaTela() {
		WebElement elementotela = driver.findElement(By.xpath("/html/body/font/b/form[1]/fieldset/center/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[20]/td[2]/input[1]"));
		elementotela.click();		
	}
	
	public void SaidaArq() {
		WebElement elementoarq = driver.findElement(By.xpath("/html/body/font/b/form[1]/fieldset/center/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[20]/td[2]/input[2]"));
		elementoarq.click();		
	}
	
	public void SaidaEmail() {
		WebElement elementoarq = driver.findElement(By.xpath("/html/body/font/b/form[1]/fieldset/center/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[20]/td[2]/input[3]"));
		elementoarq.click();		
	}
	
	
	public void Seldef() {
		WebElement elementoarq = driver.findElement(By.cssSelector("#Table1 > tbody > tr:nth-child(2) > td:nth-child(1)"));
		elementoarq.click();
	}
	
	
	public void Email(String txtemail) {
		WebElement elementoemail = driver.findElement(By.id("txt_email"));
		elementoemail.click();
		elementoemail.sendKeys(txtemail);
	}
	
	
	public void TpArq() {
		WebElement elementoarq = driver.findElement(By.xpath("/html/body/font/b/form[1]/fieldset/center/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[21]/td[2]/input[1]"));
		elementoarq.click();		
	}
	
	public void TpArqtexto() { 
		WebElement elementoarqtex = driver.findElement(By.xpath("/html/body/font/b/form[1]/fieldset/center/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[21]/td[2]/input[2]"));
		elementoarqtex.click();		
	}
	
	
	
//////////BOTOES LIMPAR-ADICIONAR-EXCLUIR-CONTINUAR/////////////////////////////////////	
	public void LimparConsulta() {
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe3 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe3);
		WebElement botlimpar = driver.findElement(By.id("idAcaoLimpar"));
		botlimpar.click();
	}
	
	public void BotAlterar() {
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe3 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe3);
		WebElement botalter = driver.findElement(By.id("btn_acao_alterar"));
		botalter.click();
	}
	
	public void BotIncluir() {
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe3 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe3);
		
		String elementMenuRegSus = "//*[@id='btn_acao_incluir']";
		modulo.waitingElement(driver, elementMenuRegSus, "xpath");
		WebElement menu_reg_sus = driver.findElement(By.xpath(elementMenuRegSus));
		modulo.highLight(menu_reg_sus, driver);
		menu_reg_sus.click();
	}
	
	public void BotIncluirQuali() {
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe3 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe3);
		WebElement botalter = driver.findElement(By.id("btn_acao_incluir()"));
		botalter.click();
	}
	
	public void BotExcluirQuali() {
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe3 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe3);
		WebElement elemento = driver.findElement(By.id("btn_acao_excluir"));
		elemento.click();
	}
	
	public void BotExcluirPrest() {
		WebElement iframe2 = driver.findElement(By.id("iframeaspsubmenu"));
		driver.switchTo().frame(iframe2);
		WebElement iframe3 = driver.findElement(By.id("toolbarsubmenu"));
		driver.switchTo().frame(iframe3);
		WebElement elemento = driver.findElement(By.id("btn_acao_excluir"));
		elemento.click();
	}
	
	
	
	public void BotContinuar() {
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe3 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe3);
		WebElement elemento = driver.findElement(By.id("btn_acao_continuar"));
		elemento.click();
	}
	
//////////////////FIM BOTOES////////////////////////////////////////////////////	
	
	public void FlegaExcluir() {
		WebElement elemento = driver.findElement(By.cssSelector("#tblQualificacoesPrestador > thead > tr > th:nth-child(1) > a"));
		elemento.click();
	}
	
	public void BloqOperadora() {
		WebElement elemento = driver.findElement(By.id("ind_excluir_1"));
		elemento.click();
		
	}
	
//	public void confirmaprest() throws InterruptedException 
//	{
//		WebElement iframe1 = driver.findElement(By.id("iframeasp"));
//		driver.switchTo().frame(iframe1);
//		Thread.sleep(3000);
//		WebElement iframe2 = driver.findElement(By.id("principal2"));
//		driver.switchTo().frame(iframe2);
//		WebElement teste = driver.findElement(By.id("cod_prestador"));
//		teste.click();
//		teste.sendKeys("010618");
//	}
	
	
	
	  public void print() { 
	  try {
		Robot robot = new Robot();
		BufferedImage bi=robot.createScreenCapture(new Rectangle(1400,700));
		ImageIO.write(bi, "jpg", new File ("C:\\Users\\iduarteb\\Desktop\\print\\teste.jpg"));
	  } catch (AWTException e) {
		  // TODO: handle exception
		  e.printStackTrace();
	  } catch (IOException e) {
		  e.printStackTrace();
	  }
	  	}
	  
	  
	  public void LiberacaoEfetuada() {
			String elementStr = "/html/body/div[1]/font/b/p/font";
			modulo.waitingElement(driver, elementStr, "xpath");
			WebElement liberacao = driver.findElement(By.xpath(elementStr));
			modulo.highLight(liberacao, driver);
			liberacao.click();
			
			
			String value = liberacao.getText().toString();
			System.out.println(value);
			
			assertEquals("Operação realizada com sucesso", value);
		}
	  
//	  public void MsgAlteracaoOcorrencia() {
//			String elementStr = "/html/body/center/font";
//			modulo.waitingElement(driver, elementStr, "xpath");
//			WebElement liberacao = driver.findElement(By.xpath(elementStr));
//			modulo.highLight(liberacao, driver);
//			liberacao.click();
//			
//			
//			String value = liberacao.getText().toString();
//			System.out.println(value);
//			
//			assertEquals("Operação realizada com sucesso", value);
//		}
	  
	  public void UsuarioAlterado() {
			String elementStr = "/html/body/div[1]/font/b/p/font";
			modulo.waitingElement(driver, elementStr, "xpath");
			WebElement liberacao = driver.findElement(By.xpath(elementStr));
			modulo.highLight(liberacao, driver);
			liberacao.click();
			
			
			String value = liberacao.getText().toString();
			System.out.println(value);
			
			assertEquals("Operação realizada com sucesso", value);
		}
	  
	  public void UsuariocadastroAlterado() {
		  String elementStr = "//*[@id='txt_msg']";
			modulo.waitingElement(driver, elementStr, "xpath");
			WebElement liberacao = driver.findElement(By.xpath(elementStr));
			modulo.highLight(liberacao, driver);
			liberacao.click();
			
			
			String value = liberacao.getText().toString();
			System.out.println(value);
			
			assertEquals("Usuário alterado", value);
		}
	  
	  public void ExlcuiBloqmsg() {
		  String elementStr = "//*[@id='txt_msg']";
			modulo.waitingElement(driver, elementStr, "xpath");
			WebElement liberacao = driver.findElement(By.xpath(elementStr));
			modulo.highLight(liberacao, driver);
			liberacao.click();
			
			
			String value = liberacao.getText().toString();
			System.out.println(value);
			
			assertEquals("Cancelamento realizado", value);
		}
	  
	  public void Exlcuibloqcanceladomsg() {
		  String elementStr = "//*[@id='txt_msg']";
			modulo.waitingElement(driver, elementStr, "xpath");
			WebElement liberacao = driver.findElement(By.xpath(elementStr));
			modulo.highLight(liberacao, driver);
			liberacao.click();
			
			
			String value = liberacao.getText().toString();
			System.out.println(value);
			
			assertEquals("A Suspensão / Bloqueio informada está cancelada.", value);
		}
	  
	  public void clickelemento() {
		WebElement clickelement = driver.findElement(By.id("txt_obs_ocorrencia"));
		clickelement.click();
	  }
	  
	  
////////////////ALERTA//////////////////	  
	  public String alerta() throws InterruptedException {
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		return null;
		}
	  
	  public String alertaExlcuiPrest() throws InterruptedException {
		  Alert alert = driver.switchTo().alert();
		  Thread.sleep(1000);
		  alert.dismiss();
		return null;
		}
	  
	  public String Textoalerta() {
		  String alert = driver.switchTo().alert().getText();
		  assertEquals("Deseja excluir os registros selecionados?", alert);
		  return null;
		}
	  
	  public String Textoalertaexcluirprest() {
		  String alert = driver.switchTo().alert().getText();
		  assertEquals("O prestador será excluído fisicamente do Banco de Dados, isto é, todas as suas informações serão deletadas. Confirma a exclusão?", alert);
		  return null;
		}
	  
	  public String TextoalertaExcluiBloq() {
		  String alert = driver.switchTo().alert().getText();
		  assertEquals("Deseja realmente excluir?", alert);
		  return null;
		}
	  
/////////////////FIM ALERTA//////////////////////	  

	  public void AlteraQuali() {
			WebElement element = driver.findElement(By.xpath("/html/body/font/b/form/fieldset[2]/center/table/tbody/tr/td/table/tbody/tr/td/fieldset/div/table/tbody/tr/td[3]/a"));
			element.click();
		}
	  
	  public void ObsQuali(String obs) {
			WebElement obsquali = driver.findElement(By.id("txt_observacao"));
			obsquali.click();
			obsquali.sendKeys(obs);
	
	  }
	  
	  public void antesobs() {
		  WebElement clica = driver.findElement(By.id("txt_observacao"));
		  clica.click();
	  }
	  
	  
	  public void InformaCodigo(String cod) {
		  WebElement iframe1 = driver.findElement(By.id("iframeasp"));
			driver.switchTo().frame(iframe1);
			WebElement iframe2 = driver.findElement(By.id("principal2"));
			driver.switchTo().frame(iframe2);
			WebElement esccod = driver.findElement(By.id("cod_situacao_esp"));
			esccod.click();
			esccod.sendKeys(cod);
	  } 
	
	 public void TabCodigo() {
		 WebElement tabcod = driver.findElement(By.id("cod_situacao_esp"));
		 tabcod.sendKeys(Keys.TAB);
	 }  
	  
	 public void Nomecodigo(String nmcodigo) {
		 WebElement nmcod = driver.findElement(By.id("nome_situacao_esp"));
		 nmcod.click();
		 nmcod.sendKeys(nmcodigo);
	 }
	 
	 public void NmImagemCod(String nomeimagem) {
		 WebElement nmimag = driver.findElement(By.id("nom_imagem"));
		 nmimag.click();
		 nmimag.sendKeys(nomeimagem);
		 
	 }
	 
	 public void OrdemRemessa(String ordem) {
		 WebElement ordemremes = driver.findElement(By.id("ordenacao_remessa"));
		 ordemremes.click();
		 ordemremes.sendKeys(ordem);
	 }
	 
	 public void LoginUsuario(String login) {
		 WebElement iframe1 = driver.findElement(By.id("iframeasp"));
		 driver.switchTo().frame(iframe1);
		 WebElement iframe2 = driver.findElement(By.id("principal2"));
		 driver.switchTo().frame(iframe2);
		 WebElement usulog = driver.findElement(By.id("cod_usuario"));
		 usulog.click();
		 usulog.sendKeys(login);
	 }
	 
	 public void TabLoginUsuario() {
		 WebElement usulog = driver.findElement(By.id("cod_usuario"));
		 usulog.sendKeys(Keys.TAB);
	 }
	 
	 public void consultalogin(String login) {
		 WebElement usulog = driver.findElement(By.id("cod_usuario"));
		 usulog.click();
		 usulog.sendKeys(login);
	 }
	 
	 public void NomeUsuario(String nome) {
		 WebElement usunm = driver.findElement(By.id("nom_usuario"));
		 usunm.click();
		 usunm.sendKeys(nome);
	 }
	 
	 public void ListaTipoUsuario() {
		 //WebElement tpususario = driver.findElement(By.id("cod_tipo_usuario"));
		 //tpususario.click();
		 Select combo = new Select(driver.findElement(By.cssSelector("#cod_tipo_usuario")));
		 combo.selectByIndex(3);
	 }
	 
	 public void UsuarioIncluido() {
			String elementStr = "//*[@id='txt_msg']";
			modulo.waitingElement(driver, elementStr, "xpath");
			WebElement liberacao = driver.findElement(By.xpath(elementStr));
			modulo.highLight(liberacao, driver);
			liberacao.click();
			
			
			String value = liberacao.getText().toString();
			System.out.println(value);
			
			assertEquals("Usuário incluído", value);
		}
	 
	 public void BloqueioIncluido() {
			String elementStr = "//*[@id='txt_msg']";
			modulo.waitingElement(driver, elementStr, "xpath");
			WebElement liberacao = driver.findElement(By.xpath(elementStr));
			modulo.highLight(liberacao, driver);
			liberacao.click();
			
			
			String value = liberacao.getText().toString();
			System.out.println(value);
			
			assertEquals("Operação realizada com sucesso", value);
		}
	 
	 public void OcorrenciaAlterada() {
			String elementStr = "/html/body/center/font";
			modulo.waitingElement(driver, elementStr, "xpath");
			WebElement liberacao = driver.findElement(By.xpath(elementStr));
			modulo.highLight(liberacao, driver);
			liberacao.click();
			
			
			String value = liberacao.getText().toString();
			System.out.println(value);
			
			assertEquals("Operação realizada com sucesso", value);
		}
	}
	  
	  
	
