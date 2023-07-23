package pageObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ultils.UtilsFrames;
import Ultils.UtilsModule; 

public class Pagamento {

	WebDriver driver;
	WebElement element;
	String elementStr;
	WebDriverWait wait;
	String dataReagendamento;
	String codigoPagamento;
	
	
		public Pagamento(WebDriver driver) {
			this.driver = driver;
			this.wait = new WebDriverWait(driver, 10);
			this.frame = new UtilsFrames(driver);
		}

	UtilsModule modulo = new UtilsModule();
	UtilsFrames frame;
	
	private void getDate() {
		Date dt = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DATE, 1);
		Date currentDatePlusOne = c.getTime();
		dataReagendamento = dateFormat.format(currentDatePlusOne);
	}

	public WebElement elementControl(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "xpath");
		element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		return element;
	}
	
	public void acessoPagamento() {
		elementControl("//div[2]/ul/li[16][@id='dropdown']");
		element.click();
	}
	
	
	public void acessoCancelaArquivaPagamento() {
		elementControl("/html/body/div[4]/div[2]/nav/div[2]/ul/li[16]/div/div/ul/li[13]");
		element.click();
		elementControl("//*[@id=\"dropdown-lvlPAG20-0\"]");
		element.click();
	}
	
	public void acessoItensPagamento() {
		elementControl("/html/body/div[4]/div[2]/nav/div[2]/ul/li[16]/div/div/ul/li[12]");
		element.click();
		elementControl("//*[@id=\"dropdown-lvlPAG7\"]/div/ul/li[1]/a");
		element.click();
	}
	
	public void acessoMenuPagamento() {
		elementControl("/html/body/div[4]/div[2]/nav/div[2]/ul/li[16]/div/div/ul/li[12]");
		element.click();
		elementControl("//*[@id=\"dropdown-lvlPAG7\"]/div/ul/li[3]/a");
		element.click();
	}
	
	public void acessoReagndamento() {
		elementControl("/html/body/div[4]/div[2]/nav/div[2]/ul/li[16]/div/div/ul/li[6]");
		element.click();
	}
	
	
	public void clicarContinuar()
	{
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe1);
		WebElement escprest = elementControl("//*[@id=\"btn_acao_continuar\"]");
		
		escprest.click();

	
	}
	
	public void acessarPagamento() {
		List<WebElement> findElements = driver.findElements(By.tagName("li[16]/a"));
		for (WebElement webElement : findElements) {
			System.out.println("Coluna -> " + webElement.getText());
		}

		driver.findElement(By.partialLinkText("Pagamento")).click();
		
	} 
	
	public void acessarTelas(String modulo, String subMenuLevel) {
		//String subMenuLevel = "Declaração para IR de Beneficiário";
		//String modulo = "Reembolso Odontológico";
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.sendKeys(subMenuLevel);
		driver.findElement(By.id("btn-filtro-menu")).click();

		
		WebElement firstLevelMenu = driver.findElement(By.xpath(
				"//li[@id='dropdown' and @style = 'overflow-wrap: break-word; display: block;' and contains(.,'"+modulo+"')]"));
		assertNotNull(firstLevelMenu); 
		firstLevelMenu.findElement(By.partialLinkText(subMenuLevel)).click();
		
	}
	
	
	
	
	public void selecionarOrigem(String a) {
		WebElement table = driver.findElement(By.cssSelector("#form01 > table")); 
		List<WebElement> list = table.findElements(By.tagName("input"));
		for (WebElement webElement : list) {
			
			//System.out.println("Coluna -> " + webElement.getAttribute("value"));
			if(webElement.getAttribute("value").equals(a)) {
				System.out.println("Coluna -> " + webElement.getAttribute("value"));
				webElement.click();
				break;
				
			}
		}
	}
	
	public void preencherBeneficiario(String beneficiario) {
		WebElement element = driver.findElement(By.cssSelector("#num_associado"));
		element.sendKeys(beneficiario);
	}
	public void preencherAno(String ano) {
		WebElement element = driver.findElement(By.cssSelector("#ano_calendario"));
		element.sendKeys(ano);
	}
	public void selecionarPagamento() {
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
			}
		}
	}
	public void clickOpcaoPagamento() {
		WebElement element = driver.findElement(By.cssSelector("#chkSel_1"));
		element.click();
	}
	public void gravarPagamento() {
		WebElement element = driver.findElement(By.cssSelector("#btn_acao_alterar\\(\\\"S\\\"\\)\\; > img"));
		element.click();
	}
	public void subMenuPagamento(String sub) {
		switch (sub) {
			case "Liberação Pagamento Por Data":
				WebElement element = driver.findElement(By.cssSelector("#dropdown-lvl7 > div > ul > li:nth-child(9) > a"));
				element.click();
				
				break;
			case "Análise":
				WebElement element2 = driver.findElement(By.cssSelector("#dropdown-lvl7 > div > ul > li:nth-child(8) > a"));
				element2.click();
				break;
			
		
		}
		
	}
	public void preencherPrestador(String str) {
		 WebElement campo = driver.findElement(By.cssSelector("#cod_prestador"));
		 campo.sendKeys(str);
	}
	public void preencherReferencia(String str) {
		WebElement campo = driver.findElement(By.cssSelector("#txt_referencia"));
		campo.sendKeys(str);
	}
	public void preencherDatas(String dataInicial, String dataFinal) {
		WebElement data1 = driver.findElement(By.cssSelector("#dt_ini"));
		data1.sendKeys(dataInicial);
		WebElement data2 = driver.findElement(By.cssSelector("#dt_fim"));
		data2.sendKeys(dataFinal);
		///html/body/fieldset[2]/center/table/tbody/tr/td/table/tbody/tr/td/form[1]/table/tbody/tr[9]/td[2]/input
	}
	public void clickContinuar() {
		WebElement element = driver.findElement(By.cssSelector("#btn_acao_continuar > img"));
		element.click();
	}
	public void processarPagamento() {
		WebElement element = driver.findElement(By.cssSelector("#btn_acao_executar\\(\\) > img"));
		element.click();
	}
	
	public void buscarReemboso() {
	frame.sairFrame();
	frame.sairFrame();
	WebElement elemt = driver.findElement(By.id("iframeasp"));
	driver.switchTo().frame(elemt);
	WebElement elemt2 = driver.findElement(By.id("principal2"));
	driver.switchTo().frame(elemt2);
	WebElement pesquisa = driver.findElement(By.id("ind_origem"));
	
	List<WebElement> elements = pesquisa.findElements(By.tagName("option"));
	for (WebElement webElement : elements) {
		if(webElement.getText().equals("Reembolso")) {
			webElement.click();
			break;
		}
	}
}
	
	
	public void pesquisarReagendamento() {
	frame.sairFrame();
	frame.sairFrame();
	WebElement elemt = driver.findElement(By.id("iframeasp"));
	driver.switchTo().frame(elemt);
	WebElement elemt2 = driver.findElement(By.id("toolbarMvcToAsp"));
	driver.switchTo().frame(elemt2);
	WebElement pesquisa = driver.findElement(By.id("btn_acao_continuar"));
	pesquisa.click();
	
	}
	
	public void selecionarAgendamento() {
	frame.sairFrame();
	frame.sairFrame();
	WebElement elemt = driver.findElement(By.id("iframeasp"));
	driver.switchTo().frame(elemt);
	WebElement elemt2 = driver.findElement(By.id("principal2"));
	driver.switchTo().frame(elemt2);
	WebElement pesquisa = driver.findElement(By.xpath("/html/body/form[2]/fieldset/center/table/tbody/tr/td/table/tbody/tr/td/table"));
	 List<WebElement> elements = pesquisa.findElements(By.tagName("tr"));
	 for (WebElement webElement : elements) {
		List<WebElement> elements2 = webElement.findElements(By.tagName("td"));
		for (WebElement webElement2 : elements2) {
			webElement2.click();
			break;
		}
	 }
	
	}
	
	
	public void enviaDataDeAgendamento() {
		
	frame.sairFrame();
	frame.sairFrame();
	WebElement elemt = driver.findElement(By.id("iframeasp"));
	driver.switchTo().frame(elemt);
	WebElement elemt2 = driver.findElement(By.id("principal2"));
	driver.switchTo().frame(elemt2);
	WebElement num = driver.findElement(By.xpath("//*[@id=\"num_item_pagamento_ts\"]"));
	codigoPagamento =  num.getAttribute("value");
	WebElement data = driver.findElement(By.xpath("//*[@id=\"dt_pgto_prevista_nova\"]"));
	this.getDate();
	data.sendKeys(this.dataReagendamento);
	
	}
	
	public void clicarExecutar() {
		
		frame.sairFrame();
		frame.sairFrame();
		WebElement elemt = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(elemt);
		WebElement elemt2 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(elemt2);
		
		WebElement enviar = driver.findElement(By.id("btn_acao_executar"));
		enviar.click();
	}
	
	public void validarTexto() {
		
	frame.sairFrame();
	frame.sairFrame();
	WebElement elemt = driver.findElement(By.id("iframeasp"));
	driver.switchTo().frame(elemt);
	WebElement elemt2 = driver.findElement(By.id("principal2"));
	driver.switchTo().frame(elemt2);
	WebElement pesquisa = driver.findElement(By.xpath("/html/body/p/font"));
	if(!pesquisa.getText().equals("operação realizada com sucesso.")) {
		throw new NullPointerException();
	}
}
	
	public void buscarValidarData() {
	frame.sairFrame();
	frame.sairFrame();
	WebElement elemt = driver.findElement(By.id("iframeasp"));
	driver.switchTo().frame(elemt);
	WebElement elemt2 = driver.findElement(By.id("principal2"));
	driver.switchTo().frame(elemt2);
	WebElement pesquisa = driver.findElement(By.id("num_item_pagamento_ts"));
	pesquisa.click();
	pesquisa.sendKeys(codigoPagamento);

}
	public void validarData() {
	frame.sairFrame();
	frame.sairFrame();
	WebElement elemt = driver.findElement(By.id("iframeasp"));
	driver.switchTo().frame(elemt);
	WebElement elemt2 = driver.findElement(By.id("principal2"));
	driver.switchTo().frame(elemt2);
	WebElement pesquisa = driver.findElement(By.xpath("//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]"));
	assertEquals(pesquisa.getText().trim(),dataReagendamento);

}
	
}

