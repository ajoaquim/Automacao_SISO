package pageObject;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;

public class LoginSISOPage {

	UtilsModule modulo = new UtilsModule();

	WebDriver driver;
	UtilsFrames frame = new UtilsFrames(driver);

	//String url = "http://172.26.174.252/TSNMVC/Account/Login";
	String url = "http://10.140.174.252/TSNMVC/Account/Login";
		

	public LoginSISOPage(WebDriver driver) {

		this.driver = driver;
	}

	public void getUrl() {

		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("windows")) {
			url = "https://portoseguro.com.br/";
		} else {
			url = "https://portoseguro.com.br/";

		}
		driver.get(url);
		//driver.get("https://github.com/");
		//System.out.println(2);
	}

	public void loginUser() {
		String elementStr = "//input[@id ='usuario']";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.sendKeys("indra2");
		String elementStr2 = "//input[@id ='senha']";
		modulo.waitingElement(driver, elementStr2, "xpath");
		WebElement element2 = driver.findElement(By.xpath(elementStr2));
		modulo.highLight(element2, driver);
		element2.sendKeys("top2019");
		String elementStr3 = "//button[@type ='submit']";
		modulo.waitingElement(driver, elementStr3, "xpath");
		WebElement element3 = driver.findElement(By.xpath(elementStr3));
		modulo.highLight(element3, driver);
		element3.click();
	}

	public void cofirmAccesPAgeHome() {

		String elementStr = "//marquee[contains(text(), 'Bem vindo ao Sistema')]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		String value = element.getText().toString();
		System.out.println(value);
		assertEquals("Bem vindo ao Sistema", value);

	}

}


