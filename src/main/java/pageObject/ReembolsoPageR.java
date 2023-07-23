package pageObject;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;


public class ReembolsoPageR {
	
UtilsModule modulo = new UtilsModule(); 
	
	WebDriver driver;
	String elementStr;
	WebElement element;
	
	UtilsFrames frame = new UtilsFrames(driver);

	//private WebDriverWait wait;

	public ReembolsoPageR(WebDriver driver) {
		this.driver = driver;
		//this.wait = new WebDriverWait(driver, 10);
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
		// ----------------------Menu Reembolso-----------------------------------//
	public void ReembolsoOndotologico() {
		elementControlXpath("//*[@id=\"dropdown\"][18]");
		element.click();
	}
	
	public void AlteracaoAnalise() {
		elementControlCssSelector("#dropdown-lvl85 > div > ul > li:nth-child(2) > a");
		element.click();
	}
	
	public void ConsultaReembolso() {
		elementControlCssSelector("#dropdown-lvl85 > div > ul > li:nth-child(11)");
		element.click();
	}
	
	public void ReverterPedidoCancelado() {
		elementControlCssSelector("#dropdown-lvl85 > div > ul > li:nth-child(6)");
		element.click();
	}
	
	public void Historico() {
		elementControlCssSelector("#dropdown-lvl85 > div > ul > li:nth-child(4) > a");
		element.click();
	}
	
	public void CancelamentoPedidoReembolso() {
		elementControlXpath("//*[@id=\"dropdown-lvl85\"]/div/ul/li[5]/a");
		element.click();
	}
	
	public void SituacaoPedidoReembolso() {
		elementControlCssSelector("#dropdown-lvl85 > div > ul > li:nth-child(3) > a");
		element.click();
	}
	
	public void ReverterPedidoNegado() {
		elementControlCssSelector("#dropdown-lvl85 > div > ul > li:nth-child(7) > a");
		element.click();
		
	}
	
	// -----------------------------------------------------------------//
		// ----------------------Consulta Reembolso-----------------------------------//
	
	
	public void BeneficiarioConsulta() {
		elementControlId("NUM_ASSOCIADO");
		element.sendKeys("2019120033");
	}
	
	public void ExecutarReembolso() {
		elementControlId("btnexecutar");
		element.click();
	}
	
	// -----------------------------------------------------------------//
		// ----------------------Reverter Pedido Cancela-----------------------------------//
	
	public void ReembolsoCancelado() {
		elementControlId("num_reembolso");
		element.sendKeys("723");
	}
	
	public void ContinuarReverter() {
		elementControlId("btn_acao_continuar");
		element.click();
	}
	
	public void ReverterClick() {
		elementControlXpath("//*[@id=\"btn_AcaoReverterCancelamento();\"]/img");
		element.click();
	}

	// -----------------------------------------------------------------//
			// ----------------------Historico-----------------------------------//
	
	public void ReembolsoHistorico() {
		elementControlId("num_reembolso");
		element.sendKeys("723");
	}
	
	
	public void ValidarHistorico() {
		elementControlXpath("//*[@id=\"divPrincipal\"]/div[1]/div[1]/h1/a");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Informações", value);
	}
	
	
	// -----------------------------------------------------------------//
				// ----------------------Cancelamento o Pedido Reembolso-----------------------------------//
	
	public void Assumir() {
		elementControlId("btnAssumir");
		element.click();
	}
	
	
	// -----------------------------------------------------------------//
			// ----------------------Situacao do Pedido de Reembolso-----------------------------------//
	
	public void EmAnaliseFleg() {

		WebElement element = elementControlId("chksituacao_2");
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", element);

	}
	
	public void CanceladoFleg() {
		WebElement element = elementControlId("chksituacao_0");
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", element);
	}
	
	public void PesquisarSituacao() {
		elementControlId("btnexecutar");
		element.click();
	}
	
	public void TelaAnexo() {
		elementControlId("btnAnexoReembolso");
		element.click();
	}
	
	
	public void ValidarTelaAnexo() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modalLoading")));
			Thread.sleep(1000);
			System.out.println("Modal Desapareceu");
		} catch (Exception e) {
			
		}
		elementControlCssSelector("#form01 > div > div:nth-child(3) > div > div > div > span");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Contrato", value);
	}
	
	
	
	

	public void TelaAlteracao() {
		//#btnAlteracaoReembolso
		List<WebElement> findElements = driver.findElements(By.id("btnAlteracaoReembolso"));
		System.out.println(findElements.size());
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getAttribute("title"));
			ex.executeScript("arguments[0].click()", webElement);
			break;
		}
		
	}
	
	
	public void ValidarTelaAlteracao() {
		elementControlCssSelector("#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Alterar Reembolso", value);
	}
	
	
	public void TelaCancelamento() {
		elementControlId("btnCancelaReembolso");
		element.click();
	}
	
	
	public void ValidarTelaCancelar() {
		elementControlCssSelector("#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Cancelar Reembolso", value);
	}
	
	
	public void TelaConsultaReembolso() {
		elementControlId("btnHistoricoPedido");
		element.click();
	}
	
	
	public void ValidarTelaConsulta() {
		elementControlCssSelector("#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Histórico Reembolso", value);
	}
	
	public void ReembolsoSituacaoAssumir() {
		elementControlId("num_reembolso");
		element.sendKeys("824");
	}
	
	
	// -----------------------------------------------------------------//
			// ----------------------Alteracao Analise-----------------------------------//
	public void ReembolsoAlteracao() {
		elementControlId("num_reembolso");
		element.sendKeys("791");
	}
	
	public void ReembolsoPagamento() {
		elementControlId("num_reembolso");
		element.sendKeys("781");
	}
	
	
	
	public void Submeter() {
		elementControlCssSelector("#btn_ExecutarAcao\\(\\\"SU\\\"\\)\\; > img");
		element.click();
	}
	

	
	
	public void ConsultaReembolsoBeneficiario() {	
		elementControlXpath("/html/body/fieldset[2]/center/table/tbody/tr/td/table/tbody/tr/td/form[1]/table/tbody/tr[3]/td[2]/i[1]");
		element.click();
	}
	
	public void HistoricoDeProcedimento() {	
		elementControlXpath("//*[@id=\"imgHistoricoProcedimento\"]");
		element.click();
	}
	
	public void DadosBeneficiario() {	
		elementControlXpath("//*[@id='imgPesquisaPadrao']");
		element.click();
	}
	
	public void AlertasBeneficiario() {	
		elementControlXpath("//*[@id=\"imgExibeAlertaBeneficiario\"]");
		element.click();
	}
	
	
	public void ContatoBeneficiario() {	
		elementControlXpath("//*[@id=\"imgAbreContato\"]");
		element.click();
	}
	
	public void ValidarTelaConsultaReembolso() {
		elementControlCssSelector("#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Consulta Reembolso", value);
	}
	
	
	public void ValidarTelaHistoricoProcedimento() {
		elementControlCssSelector("#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font > div");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Histórico de Procedimentos", value);
	}
	
	
	public void ValidarTelaDadosBeneficiario() {
		elementControlCssSelector("#tpContratacao");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Tipo Contratação:", value);
	}
	
	public void ValidarTelaAlertaBeneficiario() {
		elementControlCssSelector("#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Mensagens Beneficiário", value);
	}
	
	public void ValidarTelaContatoBeneficiario() {
		elementControlCssSelector("#popupContato > div > div > div.modal-body > div:nth-child(1) > div.col-sm-3l");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Tel. Residencial", value);
	}
	
	public void ContinuarReembolso() {
		elementControlId("btn_acao_continuar");
		element.click();
	}
	
	public void AlteracaoReembolso() {
		elementControlId("num_comprovante");
		element.sendKeys("1");
	}
	
	public void AnaliseAlteracao() {
		elementControlCssSelector("#btn_ExecutarAcao\\(\\\"AN\\\"\\)\\; > img");
		element.click();
	}
	
	
	public void ValidarAnalise() {
		elementControlCssSelector("#divPrincipal > div:nth-child(1) > div.panel-heading > h1 > a");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Informações", value);
	}
	
	public void ObservacaoEmissao() {
		elementControlId("/html/body/fieldset[2]/center/table/tbody/tr/td/table/tbody/tr/td/form/table[3]/tbody/tr[3]/td/fieldset/textarea");
		element.sendKeys("teste");
	}
	
	public void ObservacaoOperadora() {
		elementControlId("txt_obs_operadora");
		element.sendKeys("teste");
	}
	
	public void Motivo() {
		Select combo = new Select(elementControlCssSelector("#cod_motivo"));
		combo.selectByIndex(1);
	}
	
	public void Cancelar() {
		elementControlCssSelector("#btn_ExecutarAcao\\(\\\"CA\\\"\\)\\; > img");
		element.click();
	}
	
	public void MotivoCancelar() {
		Select combo = new Select(elementControlCssSelector("#cod_motivo_canc"));
		combo.selectByIndex(2);
	}
	
	
	public void NegarPedido() {
		elementControlCssSelector("#btn_acao_executar\\(\\)\\; > img");
		element.click();
	}
	
	public void AprovarPedido() {
		elementControlCssSelector("#btn_acao_executar\\(\\)\\; > img");
		element.click();
	}
	
	public void CancelarPedido() {
		elementControlCssSelector("#btn_acao_executar\\(\\)\\; > img");
		element.click();
	}
	
	public void ValidarCancelaPedido() {
		elementControlId("num_reembolso");
		element.click();
	}
	
	public void SelecionarProcedimento() {
		elementControlXpath("//*[@id=\"chk_item_medico_1\"]");
		element.click();
	}
	
	public void ReembolsoGlosa() {
		elementControlId("num_reembolso");
		element.sendKeys("762");
	}
	
	public void SelecionarGlosa() {
		elementControlId("imgGlosaItem1");
		element.click();
	}
	
	public void InformarGlosa() {
		elementControlCssSelector("#ind_marcar_todos");
		element.click();
	}
	
	public void ExecutarGlosa() {
		elementControlXpath("//*[@id=\"btn_acao_executar();\"]/img");
		element.click();
	}
	
	
	public void AprovarProcedimento() {
		elementControlXpath("//*[@id=\"btn_LiberarGlosas();\"]/img");
		element.click();
	}
	
	public void LiberarGlosa() {
		elementControlCssSelector("#ind_marcar_lib_item_1");
		element.click();
	}

	public void ReembolsoSituacaoDocumento() {
		elementControlCssSelector("#btn_ColocaAguardandoDocumento\\(\\)\\; > img");
		element.click();
	}
	
	
	public void ConfirmarAguardandoDocumento() {
		elementControlId("btnConfAG");
		element.click();
	}
	
	public void ValidarAguardarDocumento() {
		elementControlCssSelector("body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Pedido colocado na situação Aguardando Documento.", value);
	}
	
	public void VoltarSituacao() {
		elementControlCssSelector("#btn_VoltarSituacao\\(\\)\\; > img");
		element.click();
	}
	
	
	public void ValidarLiberacaoComSucesso() {
		elementControlCssSelector("#txt_msg");
		element.click();
		
		String value = element.getText().toString();
		System.out.println(value);
		
		assertEquals("Liberação realizada com sucesso", value);
	}
	
	
	
	
	// -----------------------------------------------------------------//
			// ----------------------Reverter Pedido Negado-----------------------------------//
	public void ReembolsoNegado() {
		elementControlId("num_reembolso");
		element.sendKeys("861");
		
	}
	
	public void ReembolsoCancelaReverter() {
		elementControlId("num_reembolso");
		element.sendKeys("731");
		
	}
		
	public void Reverter() {
		elementControlCssSelector("#btn_AcaoReverterNegativa\\(\\)\\; > img");
		element.click();
	}
	
}
