package pageObject;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reembolso {
	WebDriver driver;

	public Reembolso(WebDriver driver) {
		this.driver = driver;
	}

	public void acessarReembolso(String submenu) {

		String targetContent = submenu.toLowerCase();

//		switch (submenu) {
//		case "Histórico":
//			WebElement sub = driver.findElement(By.cssSelector("#dropdown-lvl85 > div > ul > li:nth-child(4) > a"));
//			sub.click();
//			break;
//
//		case "Extrato":
//			WebElement sub2 = driver.findElement(By.cssSelector("#dropdown-lvl85 > div > ul > li:nth-child(14) > a"));
//			sub2.click();
//			break;
//		case "Anexo":
//			WebElement sub3 = driver.findElement(By.cssSelector("#dropdown-lvl85 > div > ul > li:nth-child(8) > a"));
//			sub3.click();
//			break;
//
//		case "Previa":
//			WebElement sub4 = driver.findElement(By.xpath("//*[@id=\"dropdown\"][18]//li[12]"));
//			sub4.click();
//			break;
//		}

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.clear();
		element.sendKeys(targetContent);
		driver.findElement(By.id("btn-filtro-menu")).click();
		List<WebElement> firstLevelMenu = driver.findElements(By.id("dropdown"));

		boolean result = false;
		for (WebElement first : firstLevelMenu) {
			if (first.getAttribute("style").contains("block")
					&& first.getText().toLowerCase().contains("reembolso odontológico")) {
				result = true;
				first.findElement(By.partialLinkText(submenu)).click();
				break;
			}
		}

		assertTrue(result);

	}

	public void marcarTodasrGlosas() {
		WebElement check = driver.findElement(By.cssSelector("#ind_marcar_todos"));
		check.click();
	}

	public void clickGlosarProcedimentos() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_GlosarProcedimentos\\(\\)\\; > img"));
		bt.click();
	}

	public void executarGlosa() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_acao_executar\\(\\)\\; > img"));
		bt.click();
	}

	public void executarLiberacaoGlosas() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_acao_executar\\(\\)\\; > img"));
		bt.click();
	}

	public void colocarAguardandoDocoumento() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_ColocaAguardandoDocumento\\(\\)\\; > img"));
		bt.click();
	}

	public void aprovarProcedimentos() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_LiberarGlosas\\(\\)\\; > img"));
		bt.click();
	}

	public void voltarSituacao() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_ExecutarAcao\\(\\\"VS\\\"\\)\\; > img"));
		bt.click();
	}

	public void codigoGlosarProcedimentos(String str) {
		WebElement campo = driver.findElement(By.cssSelector("#cod_motivo_glosa"));
		campo.sendKeys(str);
	}

	public void incluirGosa() {
		WebElement bt = driver.findElement(By.cssSelector("#btnIncluir"));
		bt.click();
	}

	public void inputPrevia(String previa) {
		WebElement element = driver.findElement(By.cssSelector("#num_previa"));
		element.sendKeys(previa);
	}

	public void cancelarPrevia() {
		WebElement element = driver.findElement(By.cssSelector("#btn_ExecutarAcao\\(\\\"CA\\\"\\)\\; > img"));
		element.click();
	}

	public void clicarAlteracaoAnalise() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_ExecutarAcao\\(\\\"AN\\\"\\)\\; > img"));
		bt.click();
	}

	public void editarObsEmissao(String text) {
		WebElement cObs = driver.findElement(By.cssSelector("#txt_obs_emissao"));
		cObs.sendKeys(text);
	}

	public void submeterAlteracao() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_ExecutarAcao\\(\\\"AP\\\"\\)\\; > img"));
		bt.click();
	}

	public void cancelarAlteracao() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_ExecutarAcao\\(\\\"CA\\\"\\)\\; > img"));
		bt.click();
	}

	public void submenPrevia(String var) {

		String submenu = var;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.clear();
		element.sendKeys(submenu);
		driver.findElement(By.id("btn-filtro-menu")).click();
		List<WebElement> firstLevelMenu = driver.findElements(By.id("dropdown"));

		boolean result = false;
		for (WebElement first : firstLevelMenu) {
			if (first.getAttribute("style").contains("block")
					&& first.getText().toLowerCase().contains("reembolso odontológico")) {

				List<WebElement> previa = first.findElements(By.id("dropdown"));

				for (WebElement p : previa) {
					if (p.getAttribute("style").contains("block") && first.getText().toLowerCase().contains("prévia")) {
						result = true;
						p.findElement(By.partialLinkText(submenu)).click();
						break;
					}
				}

			}
		}

		assertTrue(result);
	}

	public void selecionarBoxProcedimento() {
		WebElement box = driver.findElement(By.cssSelector("#chk_item_medico_1"));
		box.click();
	}

	public void excluirProcedimentos() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_ExcluirProcedimentos\\(\\)\\; > img"));
		bt.click();
	}

	public void inputReembolso(String reembolso) {
		WebElement campo = driver.findElement(By.cssSelector("#num_reembolso"));
		campo.sendKeys(reembolso);

	}

	public void voltarSituação() {
		WebElement btVoltar = driver.findElement(By.cssSelector("#btn_VoltarSituacao\\(\\)\\; > img"));
		btVoltar.click();

	}

	public void inputProtocolo(String protocolo) {
		WebElement bt = driver.findElement(By.cssSelector("#COD_PROTOCOLO"));
		bt.sendKeys(protocolo);
	}
}
