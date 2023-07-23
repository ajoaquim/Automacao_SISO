package steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9239AlteracaoDataPrevista extends UtilsSteps {

	private WebDriverWait wait;
	private String janelaAtual;
	private String numPedido;

	void mudar(String target) {
		frame.sairFrame();
		try {
			frame.frame("iframeasp");
			frame.frame(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void mudarPrincipal() {
		mudar("principal2");
		try {
			aguarde();
		} catch (Exception e) {

		}
	}

	void mudarToolbar() {
		mudar("toolbarMvcToAsp");
	}

	private void mudarModalToolbar() throws Exception {
		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("toolbarModal");
	}

	private void mudarModalPrincipal() throws Exception {
		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("principal2");
	}

	private void aguarde() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("//*[@id=\"dvAguarde\"]/div/div")));
	}

	@When("^realizar o filtro para busca da remessa alt data$")
	public void realizarOFiltroParaBuscaDaRemessaAltData() throws Throwable {
		initiate();
		wait = new WebDriverWait(driver, 10);

		Select ref = new Select(driver.findElement(By.id("h_MES_ANO_REF")));
		ref.selectByIndex(3);

		Select op = new Select(driver.findElement(By.id("COD_OPERADORA")));
		op.selectByIndex(1);
	}

	@When("^selecinar continuar alt data$")
	public void selecinarContinuarAltData() throws Throwable {
		frame.sairFrame();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modalLoading")));
			System.out.println("Load is gone...");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(By.id("btnavancar")).click();
	}

	@When("^selecionar uma Remessa alt data$")
	public void selecionarUmaRemessaAltData() throws Throwable {
		
		Thread.sleep(2500);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("cbox")));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("cbox")));

		List<WebElement> remessas = driver.findElements(By.className("cbox"));
		remessas.get(remessas.size() - 1).click();
	}

	@When("^realizar a alteração das datas alt$")
	public void realizarAAlteraçãoDasDatasAlt() throws Throwable {

		driver.findElement(By.id("DATA_PREV_PGTO")).click();

		List<WebElement> dias = driver.findElement(By.className("ui-datepicker-calendar"))
				.findElement(By.tagName("tbody")).findElements(By.tagName("td"));

		dias.get(dias.size() - 1).click();
	}

	@When("^selecionar executar alt data$")
	public void selecionarExecutarAltData() throws Throwable {

		driver.findElement(By.id("btnexecutar")).click();
		frame.alertaObterConfirmar();
	}

	@Then("^o sistema apresenta um pop-up com as alterações realizadas alt data$")
	public void oSistemaApresentaUmPopUpComAsAlteraçõesRealizadasAltData() throws Throwable {

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gview_gridRemessasAtualizadas")));
		wait.until(ExpectedConditions.visibilityOf(element));
		assertTrue(element.isDisplayed());
	}

}
