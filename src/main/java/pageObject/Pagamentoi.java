package pageObject;



import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Ultils.UtilsModule;

public class Pagamentoi  {
	UtilsModule modulo = new UtilsModule(); 
	
	WebElement element;
	String elementStr;
	WebDriver driver;
	
	
	public Pagamentoi(WebDriver driver) {				
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
	public void Menu_Pagamento() throws InterruptedException
	{
		String elementStr = "//*[@id='dropdown'][16]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement menu_gestao = driver.findElement(By.xpath(elementStr));
		modulo.highLight(menu_gestao, driver);
		menu_gestao.click();

		//driver.findElement(By.linkText("Consulta Reembolsos")).click();
	}
	
	public void Menu_LancamentoManual() throws InterruptedException
	{
		String elementMenuCad = "//*[@id='dropdown'][16]//li[10]";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	public void Menu_CancelamentoOrdemPagamento() throws InterruptedException
	{
		String elementMenuCad = "//*[@id='dropdown'][16]//li[9]";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	public void Menu_Relatorios() throws InterruptedException
	{
		String elementMenuCad = "//*[@id='dropdown'][16]//li[12]";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	public void Menu_AcompanhaProcessamentoPagamento() throws InterruptedException
	{
		String elementMenuCad = "//*[@id='dropdown'][16]//li[12]//li[2]";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	public void Menu_Analiserb() throws InterruptedException
	{
		String elementMenuCad = "//*[@id='dropdown'][16]//li[2]";
		modulo.waitingElement(driver, elementMenuCad, "xpath");
		WebElement menu_cad_prest = driver.findElement(By.xpath(elementMenuCad));
		modulo.highLight(menu_cad_prest, driver);
		menu_cad_prest.click();
	}
	
	public void Menu_Analise() throws InterruptedException
	{
		String elementMenuCad = "//*[@id='dropdown'][16]//li[8]";
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
	
	public void InformaCodPrestador() {
		elementControlId("cod_prestador");
		element.sendKeys("010618");
		element.sendKeys(Keys.TAB);
		
	}
	
	public void Referencia() {
		elementControlId("mes_ano_ref");
		element.sendKeys("012020");
		
	}
	
	public void DtInipag() {
		elementControlId("dt_ini_periodo");
		element.sendKeys("01012020");
	}
	
	
	public void Dtfimpag() {
		elementControlId("dt_fim_periodo");
		element.sendKeys("01122020");
	}
	
	
	public void BotIncluirLancamento() {
		elementControlId("btn_acao_incluir");
		element.click();
	}
	
	public void Botcontinuar() {
		elementControlId("btn_acao_continuar");
		element.click();
	}
	
	public void Validabotcontinuar() {
		elementControlId("btn_acao_continuar");
		element.isDisplayed();
	}
	
	public void Botexecutar() {
		elementControlId("btn_acao_executar");
		element.click();
	}
	
	public void Botvoltar() {
		elementControlId("btn_acao_voltar");
		element.isDisplayed();
	}
	
	public void Rubrica() {
		elementControlId("cod_tipo_rubrica");
		element.sendKeys("50");
		element.sendKeys(Keys.TAB);
	}
	
	public void Valorbruto() {
		elementControlId("val_bruto");
		element.sendKeys("-100");
	}
	
	public void Dtpagprevis() {
		elementControlId("dt_pgto_prevista");
		element.sendKeys("01012020");
	}
	
	public void Dtdescprevis() {
		elementControlId("dt_prevista_desc");
		element.sendKeys("01122020");
	}
	
	public void Formpag() {
		elementControlXpath("/html/body/fieldset[2]/center/table/tbody/tr/td/table/tbody/tr/td/form[1]/table/tbody/tr[21]/td[2]/input[1]");
		element.click();
	}
	
	public void Nropag() {
		elementControlId("num_item_pagamento_ts");
		element.sendKeys("3325");
	}
	
	public void Nroitem() {
		elementControlXpath("//*[@id=\"form01\"]/table/tbody/tr[2]/td[1]/a");
		element.click();
	}
	
	public void Botexcluir() {
		elementControlId("btn_acao_excluir");
		element.click();
	}
	
	public void Nropagcancel(String num) {
		elementControlId("num_pagamento_ts");
		element.sendKeys(num);
	}
	
	public void ObsCancelamento() {
		elementControlCssSelector("#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td.label_left > textarea");
		element.sendKeys("teste");
	}
	
	public void Selcancelamento() {
		elementControlCssSelector("#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(1) > font > input[type=checkbox]");
		element.click();
	}
	
	public void Beneficiario(String benef) {
		elementControlId("num_associado");
		element.sendKeys(benef);
		element.sendKeys(Keys.TAB);
	}
	
	public void prestador(String prest) {
		elementControlId("cod_prestador");
		element.sendKeys(prest);
		element.sendKeys(Keys.TAB);
	}
	
	public void MesAnoPag(String dt) {
		elementControlId("txt_referencia");
		element.sendKeys(dt);
	}
	
	public void MesAnotab() {
		elementControlId("txt_referencia");
		element.sendKeys(Keys.PAGE_DOWN);
	}
	
	public void DtiniProcessamento(String dt) {
		elementControlId("dt_ini");
		element.sendKeys(dt);
	}
	
	public void DtfimProcessamento(String dt) {
		elementControlId("dt_fim");
		element.sendKeys(dt);
	}
	
	}
	  
	  
	
