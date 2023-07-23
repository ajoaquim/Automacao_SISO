package Ultils;



import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import factory.FactorySingletonBrowserClass;

public class UtilsModule {

	protected FactorySingletonBrowserClass singleton = FactorySingletonBrowserClass
			.getInstanceOfSingletonBrowserClass();

	
	static String browser = "Google";

	WebDriver driver;
	Scenario scenario;
	String hubUrl;

	DesiredCapabilities capabilities = new DesiredCapabilities();

	public WebDriver getDriver(WebDriver driver) {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}

	public void highLight(WebElement element, WebDriver driver) {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		// Objeto que permite alteracao de cor entre labels na estrutura selecionada
		//js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid green;');", element);

	}

	public void waitingElement(WebDriver driver, String findex, String tipo) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);

//			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(findex)));

			switch(tipo) {
			case "id": 
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(findex)));
			case "xpath":
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(findex)));
			}

		} catch (NullPointerException ex) {
			System.out.println("FALHA AO BUSCAR ELEMENTO");
		} catch (WebDriverException web) {
			System.out.println("Elemento não encontrado");
		}
	}
	
	public void validarMensagem(String element, String txtEsperado, String tipo) {
		if(tipo== "id") {
			waitingElement(driver, element, "id");
			WebElement label = driver.findElement(By.id(element));
			label.click();
			String value = label.getText().toString();
			System.out.println(txtEsperado);
			System.out.println(label.getText().toString());
			assertEquals(value.matches(txtEsperado), true);
		}else if(tipo=="seletor") {
			waitingElement(driver, element, "seletor");
			WebElement label = driver.findElement(By.cssSelector(element));
			label.click();
			String value = label.getText().toString();
			System.out.println(txtEsperado);
			System.out.println(label.getText().toString());
		assertEquals(value.matches(txtEsperado), true);
		}else if(tipo=="xpath") {
			waitingElement(driver, element, "path");
			WebElement label = driver.findElement(By.xpath(element));
		    label.click();
		    String value = label.getText().toString();
		    System.out.println(txtEsperado);
		    System.out.println(label.getText().toString());
		    assertEquals(value.matches(txtEsperado), true);
		}}
		//Mensagens com REGEX
		//Acompanhamento de demanda enviado com sucesso para o email [a-z]+.
		//"Encerramento da Solicitação [0-9]* realizado."​

	
	
		public boolean esperaValor(By by, String valor) {

				return new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElementValue(by, valor));
			
		}

			public void aguardaCarregamentoPagina() {

				new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {

					public Boolean apply(WebDriver wdriver) {

						return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");

					}
				});
			}  			

			public void teclado() throws AWTException {
				Robot rb = new Robot();
				rb.keyPress(KeyEvent.VK_TAB);

			}	
			
		
	

	public void takeScreenshot(Scenario scenario, WebDriver driver) {
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
	}
	
	public void screenshot(WebDriver driver, long ms, String ScreenFeature ,String ScreenName)
	{

	try {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Evidencias/"+ ScreenFeature +"/"+ ScreenName +"Porto.png"));
	    System.out.println("ScreenShot Taken");
	} 
	catch (Exception e) 
	{
	    System.out.println("Exception while taking ScreenShot "+e.getMessage());
	}


	}
	
}
