package pageObject;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;

public class ContasOdontologicasi {
	

	WebDriver driver;
	WebElement element;
	String elementStr;

	UtilsModule modulo = new UtilsModule();
	UtilsFrames frame;

	public ContasOdontologicasi(WebDriver driver) {
		this.driver = driver;
		frame = new UtilsFrames(driver);
	}

	public void Menu_contas_odontologicas() {
		String elementStr = "//*[@id='dropdown'][9]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement menu_contas = driver.findElement(By.xpath(elementStr));
		modulo.highLight(menu_contas, driver);
		menu_contas.click();
	}
	
	public void Menu_contas_Alteradtpag() {
		String elementStr = "//*[@id='dropdown'][9]//li[7]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement menu_contas = driver.findElement(By.xpath(elementStr));
		modulo.highLight(menu_contas, driver);
		menu_contas.click();
	}
	
	public void Menu_contas_ReverterPedido() {
		String elementStr = "//*[@id='dropdown'][9]//li[14]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement menu_contas = driver.findElement(By.xpath(elementStr));
		modulo.highLight(menu_contas, driver);
		menu_contas.click();
	}
	
	public void Menu_contas_AnaliseRemessaporReferncia() {
		String elementStr = "//*[@id='dropdown'][9]//li[4]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement menu_contas = driver.findElement(By.xpath(elementStr));
		modulo.highLight(menu_contas, driver);
		menu_contas.click();
	}
	
	public void Menu_contas_Revisão() {
		String elementStr = "//*[@id='dropdown'][9]//li[18]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement menu_contas = driver.findElement(By.xpath(elementStr));
		modulo.highLight(menu_contas, driver);
		menu_contas.click();
	}
	
	public void Menu_contas_ProtManual() {
		String elementStr = "//*[@id='dropdown'][9]//li[18]//li[1]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement menu_contas = driver.findElement(By.xpath(elementStr));
		modulo.highLight(menu_contas, driver);
		menu_contas.click();
	}
	
	public void Menu_contas_Alteracao() {
		String elementStr = "//*[@id='dropdown'][9]//li[18]//li[1]//li[2]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement menu_contas = driver.findElement(By.xpath(elementStr));
		modulo.highLight(menu_contas, driver);
		menu_contas.click();
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
	
	public void ValidaReferencia() {
		elementControlId("h_MES_ANO_REF");
		element.click();
	}
	
	public void TabPedido() {
		elementControlId("NUM_PEDIDO");
		element.sendKeys(Keys.TAB);
	}
	
	public void Procedimentos() {
		elementControlId("ind_conf_1");
		//element.sendKeys(Keys.PAGE_DOWN);
		element.click();
	}
	
	public void botcontinuar() {
		WebElement ben = driver.findElement(By.id("btnavancar"));
		ben.click();
	}
	
	public void botreverter() {
		WebElement ben = driver.findElement(By.id("btn_AcaoReverteConfirmacao();"));
		ben.click();
	}
	
	public void botAcaoContinuar() {
		elementControlId("btn_acao_continuar");
		element.isDisplayed();
	}
	
	public void botexecutar() {
		elementControlId("btnexecutar");
		element.click();
		//WebElement ben = driver.findElement(By.id("btnexecutar"));
		//ben.click();
	}
	
	public void botfechar() {
		elementControlId("fechar");
		element.click();
	}
	
	public void validabotfechar() {
		elementControlId("fechar");
		element.isDisplayed();
	}
	
	public void NumRemessa(String remessa) {
		elementControlId("COD_REVISAO_TS");
		element.sendKeys(remessa);
	}
	
	public void NumRemessavalida() {
		elementControlId("COD_REVISAO_TS");
		element.isDisplayed();
	}
	
	public void NumPedido(String pedido) {
		elementControlId("NUM_PEDIDO");
		element.sendKeys(pedido);
	}
	
	public void NumPedidobaixo() {
		elementControlId("NUM_PEDIDO");
		element.sendKeys(Keys.PAGE_DOWN);
	}
	
	public void NumPedidocima() {
//		elementControlId("NUM_ARQUIVAMENTO");
//		element.sendKeys(Keys.PAGE_UP);
		String css = "#NUM_ARQUIVAMENTO";
		WebElement table = driver.findElement(By.cssSelector(css));
		java.util.List<WebElement> list  = table.findElements(By.tagName("div"));
		for (WebElement webElement : list) {
			String str = webElement.getText();
			System.out.println(str);
			if(!str.contains("-")) {
				System.out.println("Valor: "+webElement.getText());
				webElement.click();
				break;
			}}
		
		
	}
	
	public void focusElement(String element, String tipo) {
		WebElement campo = driver.findElement(By.cssSelector(element));

		if (tipo.equals("input")) {
			campo.sendKeys("");

		} else {
			new Actions(driver).moveToElement(campo).perform();

		}

	}
	
	public void Numremessacima() {
		elementControlId("COD_PRESTADOR");
		element.sendKeys(Keys.PAGE_UP);
	}
	
	public void Clicknremessa() {
		elementControlCssSelector("#\\31  > td:nth-child(3) > a");
		element.click();
	}
	
	public void Protocolar() {
		elementControlCssSelector("#buscaPedidos");
		element.click();
		//ListElements("table/tbody/tr[2]/td[2]", "Protocolar");
	}
	
	public void ListElements(String tagname, String partialLinkText) {
		boolean clicou = false ;
		driver.findElement(By.tagName(tagname)).click();
		
		//WebElement element = driver.findElement(By.id("gridProtocolos"));
		List<WebElement> findselements = element.findElements(By.tagName(tagname));
		for (WebElement webElement : findselements) {
			System.out.println(" -> " + webElement.getText());
			if(webElement.getText().toLowerCase().contains(partialLinkText.toLowerCase())) {
				clicou=true;
				webElement.click();
				break;
			}
		}
			assertTrue(clicou);
		driver.findElement(By.partialLinkText(partialLinkText)).click();

	}
	
	public void BotSalvarremessa() {
		WebElement ben = driver.findElement(By.id("btnsalvar"));
		ben.click();
	}
	
	public void Botcontinuarnr() {
		WebElement ben = driver.findElement(By.cssSelector("#btn_acao_continuar"));
		ben.click();
	}
	
	public void Botdesbloquear() {
		WebElement ben = driver.findElement(By.cssSelector("#btn_AcaoDesbloquearRemessa\\(\\)\\;"));
		ben.click();
//		elementControlCssSelector("#btn_AcaoDesbloquearRemessa\\\\(\\\\)\\\\;");
//		element.click();
		
	}
	
	
	public void BotExlcuirremessa() {
		WebElement ben = driver.findElement(By.id("btnexcluir"));
		ben.click();
	}
	
	public void BotAtualizar() {
		WebElement ben = driver.findElement(By.cssSelector("#btn_Atualizar\\(\\)\\;"));
		ben.click();
	}
	
	public void Selexlcuir() {
		//elementControlCssSelector("#\\31  > td:nth-child(1) > input[type=checkbox]");
		//element.click();
		String css = "#\\31  > td:nth-child(1)";
		WebElement table = driver.findElement(By.cssSelector(css));
		java.util.List<WebElement> list  = table.findElements(By.tagName("td"));
		for (WebElement webElement : list) {
			String str = webElement.getText();
			System.out.println(str);
			if(!str.contains("-")) {
				System.out.println("Valor: "+webElement.getText());
				webElement.click();
				break;
			}}
	}
	
	public void Selremessa() {
		WebElement ben = driver.findElement(By.id("jqg_grid_1"));
		ben.click();
	}
	
	
	public void Clicaremessa() {
		//WebElement ben = driver.findElement(By.id("1"));
		//ben.click();
//		String css = "#\\31  > td:nth-child(2)";
//		WebElement table = driver.findElement(By.cssSelector(css));
//		java.util.List<WebElement> list  = table.findElements(By.tagName("td"));
//		for (WebElement webElement : list) {
//			String str = webElement.getText();
//			System.out.println(str);
//			if(!str.contains("-")) {
//				System.out.println("Valor: "+webElement.getText());
//				webElement.click();
//				break;
//			}}
		Boolean bool = false;
		String tb = "#gview_gridProtocolos";
		WebElement table = driver.findElement(By.cssSelector(tb));

		List<WebElement> linhas = table.findElements(By.tagName("tr"));
		
		for (WebElement webElement : linhas) {
			
			List<WebElement> colunas = webElement.findElements(By.tagName("td"));
			for (WebElement webElement2 : colunas) {
				if(colunas.get(1).getAttribute("title").equals("Protocolada") ||
						 colunas.get(1).getAttribute("title").contains("Análise")) {
						 colunas.get(1).click();
						 bool = true;
						 break;
				}
			}
			if(bool) {
				break;
			}
			
		}
		
	}
	
	
	public void downremessa () {
		WebElement ben = driver.findElement(By.id("COD_PRESTADOR"));
		ben.click();
		ben.sendKeys(Keys.PAGE_DOWN);
	}
	
	
	
	public void Altdtpag() {
		WebElement ben = driver.findElement(By.id("DATA_PREV_PGTO"));
		ben.click();
		ben.sendKeys("06022020");
	}
	
	public void SelAltReferencia() throws InterruptedException
	{
		Select combo2 = new Select(driver.findElement(By.cssSelector("#MES_ANO_REF_CORTE"))); 
		combo2.selectByIndex(4);
	}
	
	public void SelReferencia() throws InterruptedException
	{
		Select combo2 = new Select(driver.findElement(By.cssSelector("#h_MES_ANO_REF"))); 
		combo2.selectByIndex(4);
	}
	
	public void SelReferenciaAlt() throws InterruptedException
	{
		Select combo2 = new Select(driver.findElement(By.cssSelector("#MES_ANO_REF"))); 
		combo2.selectByIndex(4);
	}
	
	
	public void SelOperadora() throws InterruptedException
	{
		Select combo2 = new Select(driver.findElement(By.cssSelector("#COD_OPERADORA"))); 
		combo2.selectByIndex(1);
	}
	
	public void Situacao() {
		WebElement ben = driver.findElement(By.id("s2id_autogen1"));
		ben.click();
		ben.sendKeys("protocolada");
		ben.sendKeys(Keys.TAB);		
	}
	
	public void SituacaoExluir() {
		WebElement ben = driver.findElement(By.id("s2id_autogen1"));
		ben.click();
		ben.sendKeys("processada ok");
		ben.sendKeys(Keys.TAB);		
	}
	
	public void Nrremessa(String nr) {
		WebElement ben = driver.findElement(By.id("num_grd"));
		ben.sendKeys(nr);
	}
	
	public void selecionarExcluirRemessa() {
//		String tb = "#gview_gridItensProtocolo";
//		WebElement table = driver.findElement(By.cssSelector(tb));
//		
//		List<WebElement> linhas = table.findElements(By.tagName("tr"));
//		Boolean bool = false;
//		
//		for (WebElement webElement : linhas) {
//		System.out.println("Titutlo:"+webElement.getText());	
//			List<WebElement> colunas = webElement.findElements(By.tagName("td"));
//			
//			
//			for (WebElement webElement2 : colunas) {
//				System.out.println("Subbb"+webElement2.getText());
//				if(webElement2.getAttribute("title").matches("[0-9]*")) {
//					//colunas.get(0).findElement(By.tagName("input")).click();
//					System.out.println(webElement2.getText());
//					bool = true;
//					break;
//					
//				 }
//		     }			
//			if(bool) {
//				break;
//			}
//			
//	     }
//	
//	
		WebElement ben = driver.findElement(By.xpath("//*[@id=\"1\"]/td[1]/input"));
		ben.click();
		
		
	}
}
