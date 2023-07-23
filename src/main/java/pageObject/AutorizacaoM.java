package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutorizacaoM {
	WebDriver driver;
	public AutorizacaoM(WebDriver driver) {
		this.driver = driver;
	}
	
	public void pesquisarPedido(String pedido) {
		WebElement campo = driver.findElement(By.cssSelector("#num_pedido"));
		campo.sendKeys(pedido);
	}
}
