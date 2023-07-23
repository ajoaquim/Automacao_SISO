package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;

public class ContratosBeneficiarios {
	
	WebDriver driver;
	WebElement element;
	String elementStr;

	UtilsModule modulo = new UtilsModule();
	UtilsFrames frame = new UtilsFrames(driver);

	public ContratosBeneficiarios(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement elementControl(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "xpath");
		element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		return element;
	}
	
	public void acessoContratoBeneficiario() {
		elementControl("//div[2]/ul/li[5][@id='dropdown']");
		element.click();
		elementControl("/html/body/div[4]/div[2]/nav/div[2]/ul/li[5]/div/div/ul/li[1]/a");
		element.click();
	}


}
