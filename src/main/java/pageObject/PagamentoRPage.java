package pageObject;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;

public class PagamentoRPage {
	
	WebDriver driver;
	WebElement element;
	String elementStr;

	UtilsModule modulo = new UtilsModule();
	UtilsFrames frame;
	
	public PagamentoRPage(WebDriver driver) {
		this.driver = driver;
		frame = new UtilsFrames(driver);
	}
	
	public void ListElements(String tagname, String partialLinkText) {
		List<WebElement> findselements = driver.findElements(By.tagName(tagname));
		for (WebElement webElement : findselements) {
			System.out.println(" -> " + webElement.getText());
		}

		driver.findElement(By.partialLinkText(partialLinkText)).click();

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
	
	
	// -----------------------------------------------------------------//
		// ----------------------Menu Pagamento-----------------------------------//
	
	public void MenuPagamento() {		
		List<WebElement> titulo = driver.findElements(By.tagName("li[16]/a"));
		for (WebElement webElement : titulo) {
			System.out.println("Coluna -> " + webElement.getText());
		}

		driver.findElement(By.partialLinkText("Pagamento")).click();
	}

	public void AnaliseRB() {
		List<WebElement> titulo = driver.findElements(By.tagName("li[2]/a"));
		for (WebElement webElement : titulo) {
			System.out.println("Coluna -> " + webElement.getText());
		}

		driver.findElement(By.partialLinkText("Análise RB")).click();

	}
	
	public void ConfirmaManual() {
		List<WebElement> titulo = driver.findElements(By.tagName("li[3]/a"));
		for (WebElement webElement : titulo) {
			System.out.println("Coluna -> " + webElement.getText());
		}

		driver.findElement(By.partialLinkText("Confirmação Manual de Pagamento")).click();

	}
	
	public void LiberacaoPagamento() {
		List<WebElement> titulo = driver.findElements(By.tagName("li[1]/a"));
		for (WebElement webElement : titulo) {
			System.out.println("Coluna -> " + webElement.getText());
		}

		driver.findElement(By.partialLinkText("Liberação de Pagamento RB")).click();

	}
	
	// -----------------------------------------------------------------//
			// ----------------------Analise RB-----------------------------------//
	public void MesAno() {
	   elementControlXpath("//*[@id='txt_referencia']");
		
		element.sendKeys("012020");
	}
	
	public void Continuar() {
		elementControlId("btn_acao_continuar");
		element.click();
	}
	
	public void ValidarAnaliseRB() {
		List<WebElement> titulo = driver.findElements(By.xpath("//*[@id='form01']/table[3]"));
		for (WebElement webElement : titulo) {
			System.out.println("Tabela -> " + webElement.getText());
		}		
		assertEquals("Pagamentos Gerados", titulo);
	}
	
	// -----------------------------------------------------------------//
				// ----------------------Liberacao de Pagamento RB-----------------------------------//
	
	public void PagamentoPrevistoInicial() {
		elementControlId("dt_ini");
		element.sendKeys("01012020");
	}
	
	public void PagamentoPrevistoFim() {
		elementControlId("dt_fim");
		element.sendKeys("01122020");
	}
	
	public void BeneficiarioLiberacao() {
		elementControlId("num_associado");
		element.sendKeys("2019090010");
	}
	
	public void DataDeProcessamento() {
		
		
		Actions actions = new Actions(driver);
		WebElement elementLocator = elementControlId("dt_processamento");
		actions.doubleClick(elementLocator).perform();
		
		element.sendKeys(Keys.BACK_SPACE);
		
	
		actions.doubleClick(elementLocator).perform();
		
		element.sendKeys(Keys.BACK_SPACE);
		
	
		actions.doubleClick(elementLocator).perform();
		
		element.sendKeys(Keys.BACK_SPACE);
		
		
		actions.doubleClick(elementLocator).perform();

		element.sendKeys(Keys.BACK_SPACE);
		

		actions.doubleClick(elementLocator).perform();

		element.sendKeys(Keys.BACK_SPACE);
		
		element.sendKeys("01122020");
		
	
	}
	
	
	public void SelecionarPagamento() {
		String css = "#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > table";
		WebElement table = driver.findElement(By.cssSelector(css));
		List<WebElement>list = table.findElements(By.tagName("a"));
		for (WebElement webElement : list) {
			String str = webElement.getText();
			System.out.println(str);
			if(!str.contains("-")) {
				System.out.println("Valor: "+webElement.getText());
				webElement.click();
				break;
			}}
	
	}
	
	public void FlegLiberar() {
		elementControlId("chkSel_1");
		element.click();
	}
	
	public void Gravar() {
		elementControlCssSelector("#btn_acao_alterar\\(\\\"S\\\"\\)\\; > img");
		element.click();
	}
	
	public void ProcessarPagamento() {
		elementControlCssSelector("#btn_acao_executar\\(\\) > img");
		element.click();
	}
	
	public void ValidarLiberacao() {
		List<WebElement> mensagem = driver.findElements(By.tagName("p/font"));
		for (WebElement webElement : mensagem) {
			System.out.println("Mensagem -> " + webElement.getText());
			webElement.click();
		}		
		assertEquals("Operação realizada com sucesso.", mensagem);
	}
	
	public void SelecionarTodos() {
		ListElements("td[1]/a", "Sel.");
	}
	
	// -----------------------------------------------------------------//
	// ---------------------Confirmacao Manual de Pagamento-----------------------------------//
	
	public void DataDePagamento() {
		elementControlId("dt_pagamento");
		element.sendKeys("04022020");
	}
	
	public void FlegPagamento() {
		String css = "#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > table";
		WebElement table = driver.findElement(By.cssSelector(css));
		List<WebElement>list = table.findElements(By.tagName("input"));
		for (WebElement webElement : list) {
			String str = webElement.getText();
			System.out.println(str);
			if(!str.contains("-")) {
				System.out.println("Valor: "+webElement.getText());
				webElement.click();
				break;
			}}
	}
	
	public void Executar() {
		elementControlId("btn_acao_executar");
		element.click();
	}
	
	public void Observacao() {
		List<WebElement> titulo = driver.findElements(By.tagName("textarea"));
		for (WebElement webElement : titulo) {
				webElement.sendKeys("teste");
		}
		
		
	}

	public void DataDePagamentoContas() {
		elementControlId("dt_pagamento");
		element.sendKeys("31012020");
		
	}
	
	public void BeneficiarioReembolso() {
		elementControlId("num_associado");
		element.sendKeys("2019090031");
	}

	public void PrestadorContasOdontologicas() {
		elementControlId("cod_prestador");
		element.sendKeys("011215");
		
	}
	

	}
