package pageObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;


public class ContasOdontologicasRPage {
	
	WebDriver driver;
	WebElement element;
	String elementStr;

	UtilsModule modulo = new UtilsModule();
	UtilsFrames frame;
	
	public ContasOdontologicasRPage(WebDriver driver) {
		this.driver = driver;
		frame = new UtilsFrames(driver);
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
			// ----------------------Menu Contas Odontologicas-----------------------------------//
	
	public void MenuContasOdontologicas() {
		elementControlXpath("//div[2]/ul/li[9][@id='dropdown']");
		element.click();
	}
	
	public void ConfiguracoesCriticas() {
		elementControlXpath("/html/body/div[4]/div[2]/nav/div[2]/ul/li[9]/div/div/ul/li[1]/a");
		element.click();
	}

	
	public void AberturaReferencia() {
		elementControlCssSelector("#dropdown-lvl50 > div > ul > li:nth-child(2) > a");
		element.click();
	}

	
	public void DemonstrativoDePagamento() {
		elementControlCssSelector("#dropdown-lvl50 > div > ul > li:nth-child(19) > a");
		element.click();
	}
	
	public void Observacoes() {
		elementControlCssSelector("#dropdown-lvl50 > div > ul > li:nth-child(12) > a");
		element.click();
	}
	
	public void Revisao() {
		elementControlXpath("/html/body/div[4]/div[2]/nav/div[2]/ul/li[9]/div/div/ul/li[18]/a");
		element.click();
	}
	
	public void ProtocoloManual() {
		elementControlXpath("/html/body/div[4]/div[2]/nav/div[2]/ul/li[9]/div/div/ul/li[18]/div/div/ul/li[1]/a");
		element.click();
		
	}
	
	public void ControleRevisao() {
		elementControlXpath("//*[@id=\"dropdown-lvlODO_CTD20\"]/div/ul/li[6]/a");
		element.click();
	}
	
	public void Inclusao() {
		elementControlCssSelector("#dropdown-lvlODO_CTD20_10 > div > ul > li:nth-child(1) > a");
		element.click();
	}
	
	public void AnaliseRemessa() {
		elementControlCssSelector("#dropdown-lvl50 > div > ul > li:nth-child(4) > a");
		element.click();
	}

	
	
	// -----------------------------------------------------------------//
			// ----------------------Demonstrativo de Pagamento Diferenciado-----------------------------------//
	
	public void ReferenciaInicial() {
		elementControlId("mes_ano_ref_ini");
		element.sendKeys("012019");
	}
	
	public void ReferenciaFinal() {
		elementControlId("mes_ano_ref_fim");
		element.sendKeys("022020");
	}
	
	public void Prestador() {
		elementControlId("cod_prestador");
		element.sendKeys("010618");
	}
	
	public void Continuar() {
		elementControlId("btn_acao_continuar");
		element.click();
	}
	
	public void ContinuarControle() {
		elementControlXpath("//*[@id=\"btn_acao_continuar();\"]/img");
		element.click();
	}
	
	public void Limpar() {
		elementControlXpath("//*[@id=\"btn_acao_limpar();\"]/img");
		element.click();
	}
	
	// -----------------------------------------------------------------//
				// ----------------------Abertura Referencia-----------------------------------//
	
	
	public void ExecutarAberturaReferencia() {
		elementControlId("btnexecutar");
		element.click();
	}
	
	// -----------------------------------------------------------------//
	// ----------------------Observacoes Pedido-----------------------------------//
	
	public void Pedido() {
		elementControlId("num_pedido");
		element.sendKeys("694");
	}
	
	public void SelecionaPrestador() {
		elementControlXpath("//*[@id='ind_origem_obs_operadora']");
		element.click();
	}
	
	public void ObservacaoTexto() {
		elementControlId("txt_obs_operadora");
		element.sendKeys("Teste");
	}
	
	public void Salvar() {
		elementControlCssSelector("#btn_acao_alterar\\(\\)\\; > img");
		element.click();
	}
	
	// -----------------------------------------------------------------//
		// -----------------------Protocolo Manual Inclusao----------------------------------//
	
	public void PrestadorInclusao() {
		elementControlId("COD_PRESTADOR");
		element.sendKeys("011215");
	}
	
	public void Postagem() {
		elementControlId("DT_POSTAGEM");
		element.click();
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
		element.sendKeys(timeStamp);
	}
	
	public void Recebimento() {
		elementControlId("DATA_RECEBIMENTO");
		element.click();
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
		element.sendKeys(timeStamp);
	}
	
	public void SalvarInclusao() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modalLoading")));
			Thread.sleep(1000);
			System.out.println("Modal Desapareceu");
		} catch (Exception e) {
		}
		elementControlId("btnsalvar");
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		element.click();
	}
	
	public void NumeroPedido() {
		elementControlId("NUM_PEDIDO");
		element.sendKeys("695");
	}
	
	public void NumeroPedidoB() {
		elementControlId("NUM_PEDIDO");
		element.sendKeys("1002");
	}

	public void Protocolar() {
		elementControlId("buscaPedidos");
		element.click();
	}
	
	public void Excluir() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modalLoading")));
			Thread.sleep(1000);
			System.out.println("Modal Desapareceu");
		} catch (Exception e) {
			
		}
		elementControlXpath("//*[@id=\"1\"]/td[1]/input");
		element.click();
		
	
	}
	
	
	
	public void Submeter() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("input-group")));
			Thread.sleep(1000);
			System.out.println("Modal Desapareceu");
		} catch (Exception e) {
			
		}
		elementControlId("btnsubmeter");
		element.click();
		
	}
	
	public void ExcluirProtocolo() {
		elementControlId("btnexcluir");
		element.click();
	}
	
	public void Novo() {
		elementControlId("btnnovo");
		element.click();
		driver.switchTo().alert().accept();
	}
	
	
	// -----------------------------------------------------------------//
			// -----------------------Controle Revisao po Referencia ----------------------------------//
	
	public void MesReferencia() {
		Select combo = new Select(elementControlCssSelector("#mes_ano_ref_revisao"));
		combo.selectByIndex(4);
	}
	
	
	public void Atualizar() {
		elementControlCssSelector("#btn_Atualizar\\(\\)\\; > img");
		element.click();
		
	}
	
	public void Situacao() {
		elementControlId("s2id_autogen1");
		element.sendKeys("Protocolada");
		element.sendKeys(Keys.TAB);
	}
	
	public void SituacaoEmRevisao() {
		elementControlId("s2id_autogen1");
		element.sendKeys("Em revisão");
		element.sendKeys(Keys.TAB);
	}
	
	public void SelecionarPedido() {
		elementControlXpath("//*[@id=\"1\"]/td[4]");
		element.click();
	}
	
	public void ExcluirGuia() {
		elementControlCssSelector("#btn_acao_tela\\(\\\"E\\\"\\)\\; > img");
		element.click();
	}
	
	public void NR() {
		elementControlId("cod_revisao_ts");
		element.sendKeys("38217");
	}
	
	public void Assumir() {
		elementControlCssSelector("#btn_AcaoAssumirRevisaoBotao\\(\\)\\; > img");
		element.click();
	}
	
	public void SelecionarRemessa() {
		elementControlCssSelector("#\\31  > td:nth-child(1)");
		element.click();
	}

}
