package Ultils;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilsFrames {

	WebDriver driver;
	private Scanner leitor;

	String masterSubMenu = "iframeaspsubmenu";

	public UtilsFrames(WebDriver driver) {
		this.driver = driver;
	}

	// Menu Inicial SISO
	public void framePaginaInicial(String frame) {
		WebElement iframe1 = driver.findElement(By.xpath(frame));
		driver.switchTo().frame(iframe1);
		System.out.println(driver.getTitle());

	}

	public void clicar_fora(String xpath) {
		WebElement escprest2 = driver.findElement(By.xpath(xpath));
		escprest2.sendKeys(Keys.TAB);

	}

	public void clicar_enter(String xpath) {
		WebElement escprest2 = driver.findElement(By.xpath(xpath));
		escprest2.sendKeys(Keys.ENTER);

	}

	public List<WebElement> busca(By by) {
		return driver.findElements(by);

	}

	public void sairFrame() {
		driver.switchTo().defaultContent();
	}

	public void trocarJanela(String id) {
		driver.switchTo().window(id);
	}

	public void frame(String nome_frame) throws Exception {
		try {
			driver.switchTo().frame(nome_frame);
		} catch (Exception e) {
			try {
				WebElement frameAlvo = driver.findElement(By.id(nome_frame));
				driver.switchTo().frame(frameAlvo);
			} catch (Exception e2) {
				// TODO: handle exception
				throw new Exception("FALHA AO TROCAR FOCO PARA FRAME");
			}
		}
	}

	public boolean frame(int index) throws Exception {
		try {
			driver.switchTo().frame(index);
			return true;
		} catch (Exception e) {
			throw new Exception("FALHA AO TROCAR FOCO PARA FRAME");
		}
	}

	public void contaFrame() {
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		for (int i = 1; i < frames.size(); i++) {
			System.out.println("\r\nFrame " + i + ": " + frames.get(i) + " id= " + frames.get(i).getAttribute("id"));
		}
	}

	public String alertaObterTexto() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void alertaObterConfirmar() {
		driver.switchTo().alert().accept();
	}

	public void fecharJanela() {
		driver.close();
	}

	public void mudarModalToolbarJanela() throws Exception {
		sairFrame();
		frame("iframemodal");
		frame("toolbarModal");
	}

	public void mudarModalPrincipalJanela() throws Exception {
		sairFrame();
		frame("iframemodal");
		frame("principal2");
	}

	public void mudarModalToolbarSISO() throws Exception {
		sairFrame();
		frame("iframeasp");
		frame("toolbarMvcToAsp");
	}

	public void mudarModalPrincipalSISO() throws Exception {
		sairFrame();
		frame("iframeasp");
		frame("principal2");
	}

	private void finalizarProcessoChrome() {
		try {
			Process process = Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
			leitor = new Scanner(process.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
