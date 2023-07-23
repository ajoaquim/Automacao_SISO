package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;


public class MenuGestaoPrestadoresOdontologicosPage {
	
UtilsModule modulo = new UtilsModule(); 
	
	WebDriver driver;
	
	UtilsFrames frame = new UtilsFrames(driver);
	
	public MenuGestaoPrestadoresOdontologicosPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// -----------------------------------------------------------------//
	// ----------------------Menu Gestao Prestadores Odontologicos-----------------------------------//


	public void MenuGestaoPrestadoresOdontologicos() { 
			String elementStr = "//*[@id='dropdown'][11]";
			modulo.waitingElement(driver, elementStr, "xpath");
			WebElement menuGestao = driver.findElement(By.xpath(elementStr));
			modulo.highLight(menuGestao, driver);
			menuGestao.click();
	}
	
	
	public void CadastroPrestador() {
			String element = "//*[@id='dropdown'][11]//li[1]";
			modulo.waitingElement(driver, element, "xpath");
			WebElement menuCadastro = driver.findElement(By.xpath(element));
			modulo.highLight(menuCadastro, driver);
			menuCadastro.click();	
			
	}
	

	public void DesbloqueioUsuario() {
		String element = "#dropdown-lvl76 > div > ul > li:nth-child(7) > a";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement desbloqueio = driver.findElement(By.cssSelector(element));
		desbloqueio.click();	
		
}
	
	
	public void BloqueioUsuario() {
		String element = "#dropdown-lvl76 > div > ul > li:nth-child(8) > a";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement bloqueio = driver.findElement(By.cssSelector(element));
		bloqueio.click();	
		
}
	

	public void CadastroUsuario() {
		String element = "#dropdown-lvl76 > div > ul > li:nth-child(6) > a";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement menuCadastro = driver.findElement(By.cssSelector(element));
		modulo.highLight(menuCadastro, driver);
		menuCadastro.click();
		
	}

	
	public void ExclusaoOperadora() {
		String element = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[11]/div/div/ul/li[4]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement menuexclusao = driver.findElement(By.xpath(element));
		modulo.highLight(menuexclusao, driver);
		menuexclusao.click();
		
	}
	
	public void Cancela() {
		String element = "//*[@id=\"dropdown-lvlODO_PRS0116\"]/div/ul/li[2]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement cancela = driver.findElement(By.xpath(element));
		modulo.highLight(cancela, driver);
		cancela.click();
	}

	
	public void ConsultaPrestador() {
			String element = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[11]/div/div/ul/li[4]";
			modulo.waitingElement(driver, element, "xpath");
			WebElement menuConsulta = driver.findElement(By.xpath(element));
			modulo.highLight(menuConsulta, driver);
			menuConsulta.click();
	}
	
	/***public void Parametrizacoes() {
		String element = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[11]/div/div/ul/li[5]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement parametrizacao = driver.findElement(By.xpath(element));
		parametrizacao.click();
	}***/
	
	
	public void SituacaoEspceial() {
		String element = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[11]/div/div/ul/li[5]/div/div/ul/li[10]/a";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement calendario = driver.findElement(By.xpath(element));
		calendario.click();
	}

	
	
	
	public void SuspensaoBloqueioEncerrar() {
			String element = "//*[@id=\"dropdown-lvlODO_PRS0153\"]/div/ul/li[7]/a";
			modulo.waitingElement(driver, element, "xpath");
			WebElement suspensao = driver.findElement(By.xpath(element));
			modulo.highLight(suspensao, driver);
			suspensao.click();
	}
	
	public void Negociacao() {
			String element = "//*[@id=\"dropdown-lvlODO_PRS0153\"]/div/ul/li[6]/a";
			modulo.waitingElement(driver, element, "xpath");
			WebElement negociacao = driver.findElement(By.xpath(element));
			modulo.highLight(negociacao, driver);
			negociacao.click();
	}
	
	public void MenuConsutaPensãoAlimenticia() {
		String element = "//*[@id=\"dropdown-lvlODO_PRS0153\"]/div/ul/li[4]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement pensao = driver.findElement(By.xpath(element));
		modulo.highLight(pensao, driver);
		pensao.click();
	}
	
	public void MenuConsutaPesquisaredeatendimento() {
		String element = "//*[@id=\"dropdown-lvlODO_PRS0153\"]/div/ul/li[3]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement rede = driver.findElement(By.xpath(element));
		modulo.highLight(rede, driver);
		rede.click();
	}
	
	public void MenuConsutaOcorrencias() {
		String element = "//*[@id=\"dropdown-lvlODO_PRS0153\"]/div/ul/li[2]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement oco = driver.findElement(By.xpath(element));
		modulo.highLight(oco, driver);
		oco.click();
	}
	
	
	public void Anexos()  {
			String element = "//*[@id='dropdown-lvlODO_PRS0030']/div/ul/li[3]/a";
			modulo.waitingElement(driver, element, "xpath");
			WebElement menuAnexos = driver.findElement(By.xpath(element));
			modulo.highLight(menuAnexos, driver);
			menuAnexos.click();	
	}
	
	public void Liberacao() {
			String element = "//*[@id=\"dropdown-lvlODO_PRS0030\"]/div/ul/li[8]/a";
			modulo.waitingElement(driver, element, "xpath");
			WebElement menuLiberacao = driver.findElement(By.xpath(element));
			modulo.highLight(menuLiberacao, driver);
			menuLiberacao.click();
	}
	
	public void LiberacaoEspecial() {
			String element = "//*[@id=\"dropdown-lvlODO_PRS0030\"]/div/ul/li[9]/a";
			modulo.waitingElement(driver, element, "xpath");
			WebElement menuLiberacaoEspecial = driver.findElement(By.xpath(element));
			modulo.highLight(menuLiberacaoEspecial, driver);
			menuLiberacaoEspecial.click();
	}
	
	public void PensaoAlimenticia() {
			String element = "//*[@id=\"dropdown-lvlODO_PRS0030\"]/div/ul/li[6]/a";
			modulo.waitingElement(driver, element, "xpath");
			WebElement pensao = driver.findElement(By.xpath(element));
			modulo.highLight(pensao, driver);
			pensao.click();
	}
	
	public void ConsultaPensaoAlimenticia() {
			String element = "#dropdown-lvlODO_PRS0153 > div > ul > li:nth-child(4) > a";
			modulo.waitingElement(driver, element, "cssSelector");
			WebElement alimenticia = driver.findElement(By.cssSelector(element));
			alimenticia.click();
	}
	
	public void CancelaLiberacao() {
			String element = "//*[@id=\"dropdown-lvlODO_PRS0030\"]/div/ul/li[10]/a";
			modulo.waitingElement(driver, element, "xpath");
			WebElement cancela = driver.findElement(By.xpath(element));
			modulo.highLight(cancela, driver);
			cancela.click();
	}
	
	public void SubstituicaoPrestador() {
			String element = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[11]/div/div/ul/li[4]/div/div/ul/li[1]/a";
			modulo.waitingElement(driver, element, "xpath");
			WebElement substituicao = driver.findElement(By.xpath(element));
			substituicao.click();
	}
	
	public void Reativacao() {
		String element = "#dropdown-lvlODO_PRS0116 > div > ul > li:nth-child(3) > a";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement reativacao = driver.findElement(By.cssSelector(element));
		reativacao.click();
	}
	
	public void Parametrizacoes() {
		String element = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[11]/div/div/ul/li[5]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement parametrizacao = driver.findElement(By.xpath(element));
		parametrizacao.click();
	}
	
	
	public void CalendarioGeral() {
		String element = "#dropdown-lvlODO_PRS0510 > div > ul > li:nth-child(12) > a";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement calendario = driver.findElement(By.cssSelector(element));
		calendario.click();
	}
	
	
	public void TipoEstabelecimento() {
		String element = "#dropdown-lvlODO_PRS0510 > div > ul > li:nth-child(1) > a";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement calendario = driver.findElement(By.cssSelector(element));
		calendario.click();
	}
	
	
	public void Inclusao() {
		
		List<WebElement> titulo = driver.findElements(By.tagName("li[8]/a"));
		for (WebElement webElement : titulo) {
			System.out.println("Coluna -> " + webElement.getText());
		}

		driver.findElement(By.partialLinkText("Inclusão")).click();

		
		
	}
	
	public void MenuNegociacao() {
		String element = "/html/body/div[4]/div[2]/nav/div[2]/ul/li[11]/div/div/ul/li[2]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement menunegociacao = driver.findElement(By.xpath(element));
		menunegociacao.click();
	}
		 
	
	public void ConsultaNegociacao() {
		String element = "#dropdown-lvlODO_PRS0100 > div > ul > li:nth-child(4) > a";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement consultaNegociacao = driver.findElement(By.cssSelector(element));
		consultaNegociacao.click();
	}
	
	
	public void PesquisaRedeAtendimento() {
		String element = "#dropdown-lvlODO_PRS0153 > div > ul > li:nth-child(3) > a";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement pesquisaRedeAtendimento = driver.findElement(By.cssSelector(element));
		pesquisaRedeAtendimento.click();
	}


}
