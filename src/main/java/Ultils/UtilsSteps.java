package Ultils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import factory.FactorySingletonBrowserClass;
import pageObject.AlteracaoPage;
import pageObject.Autorizacao;
import pageObject.AutorizacaoM;
import pageObject.ContasOdontologicas;
import pageObject.ContasOdontologicasRPage;
import pageObject.ContasOdontologicasi;
import pageObject.GestaoPrestadoresOdontologicosPage;
import pageObject.LoginPortalCandidatoPage;
import pageObject.LoginSISOPage;
import pageObject.MenuGestaoPrestadoresOdontologicosPage;
import pageObject.MenuGestaoReembolsoOdontologicosPage;
import pageObject.Pagamento;
import pageObject.PagamentoRPage;
import pageObject.Pagamentoi;
import pageObject.PortalPrestador;
import pageObject.Reembolso;
import pageObject.ReembolsoI;
import pageObject.ReembolsoPageR;
import pageObject.WorkflowPage;


public class UtilsSteps {

	protected WebDriver driver;
	protected Scenario scenario;
	protected long ms;

	protected WebDriverWait wait;
	private JavascriptExecutor jsExec;
	
	protected static FactorySingletonBrowserClass singleton = FactorySingletonBrowserClass
			.getInstanceOfSingletonBrowserClass();
	protected UtilsModule modulo = new UtilsModule();
	protected Reembolso reembolso; 
	protected AutorizacaoM autoM;
	protected PortalPrestador pPrestador;
	protected AlteracaoPage alteracao = new AlteracaoPage(driver);
	protected ReembolsoI reembolsoi = new ReembolsoI(driver);
	protected ContasOdontologicasi contasodontologicasi = new ContasOdontologicasi(driver);
	protected Pagamentoi pagamentoi = new Pagamentoi(driver);
	protected GestaoPrestadoresOdontologicosPage gestao = new GestaoPrestadoresOdontologicosPage(driver);
	protected MenuGestaoPrestadoresOdontologicosPage menugestao = new MenuGestaoPrestadoresOdontologicosPage(driver);
	protected ReembolsoPageR reembolsoR = new ReembolsoPageR(driver);
	protected Pagamento pagamento;

	protected PagamentoRPage pagamentoR = new PagamentoRPage(driver);

	protected LoginSISOPage loginSISO;
	protected AlteracaoPage step1036;
	protected UtilsFrames frame = new UtilsFrames(driver);
	protected LoginPortalCandidatoPage loginP;
	protected ContasOdontologicasRPage contasR = new ContasOdontologicasRPage(driver);
	//protected CadastroCandidatoPage cadastroP;
	protected WorkflowPage work = new WorkflowPage(driver);
	protected Autorizacao auto;
	protected ContasOdontologicas contas;
	protected MenuGestaoReembolsoOdontologicosPage menuReembolso = new MenuGestaoReembolsoOdontologicosPage(driver);


	public void initiate() {
		
		singleton = FactorySingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		
		this.driver = FactorySingletonBrowserClass.getDriver();
		
		reembolso = new Reembolso(this.driver);
		loginSISO = new LoginSISOPage(this.driver);
		alteracao = new AlteracaoPage(this.driver);	
		reembolsoR = new ReembolsoPageR(this.driver);	
		step1036 = new AlteracaoPage(this.driver);
		pagamento = new Pagamento(this.driver);
		reembolsoi = new ReembolsoI(this.driver);

		contasodontologicasi = new ContasOdontologicasi(this.driver);
		pagamentoi = new Pagamentoi(this.driver);

		pagamentoR = new PagamentoRPage(this.driver);
		gestao = new GestaoPrestadoresOdontologicosPage(this.driver);
		menugestao = new MenuGestaoPrestadoresOdontologicosPage(this.driver);
		frame = new UtilsFrames(this.driver);
		work = new WorkflowPage(this.driver);
		pPrestador = new PortalPrestador(this.driver);
		autoM = new AutorizacaoM(this.driver);
		auto = new Autorizacao(this.driver);
		contasR = new ContasOdontologicasRPage(this.driver);
		//loginP = new LoginPortalCandidatoPage(this.driver);
		this.wait = new WebDriverWait(this.driver, 60);
		//cadastroP = new CadastroCandidatoPage(this.driver);
		jsExec = (JavascriptExecutor) driver;
		singleton.managerDriver();
		contas = new ContasOdontologicas(this.driver);
		menuReembolso = new MenuGestaoReembolsoOdontologicosPage(this.driver);
		pagamento = new Pagamento(this.driver);

	}

	public void killDriver() {
		if (driver != null) {
			driver.quit();

		}
	}

	// Variações de clicks

	public void clickPadrao(By by) {

		WebElement campo = wait.until(ExpectedConditions.elementToBeClickable(by));
		campo.click();
	}

	public void clickJS(By by) {
		WebElement campo = wait.until(ExpectedConditions.elementToBeClickable(by));
		this.jsExec.executeScript("arguments[0].click", campo);
	}

	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebElement waitVisibility(By by) {

		return this.wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
