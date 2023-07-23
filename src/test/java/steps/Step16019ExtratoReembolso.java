package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step16019ExtratoReembolso extends UtilsSteps{
	
	@When("^optar por selecionar o menu \"([^\"]*)\",\"([^\"]*)\" Extrato$")
	public void optarPorSelecionarOMenuExtrato(String arg1, String arg2) throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		reembolso.acessarReembolso("Extrato");
	}
	
	
	
	@When("^selecionar Nº Protocolo/Reembolso Extrato$")
	public void selecionarNºProtocoloReembolsoExtrato() throws Throwable {
	
		String css = "#idTipoProtolo";
		frame.sairFrame();
		WebElement bt = driver.findElement(By.cssSelector(css));
		bt.click();
	}

	@When("^informar um  Nº Protocolo/Reembolso Extrato$")
	public void informarUmNºProtocoloReembolsoExtrato() throws Throwable {
		reembolso.inputProtocolo("801");
	}

	@When("^clicar no botão Gerar Relatório Extrato$")
	public void clicarNoBotãoGerarRelatórioExtrato() throws Throwable {

	}

	@Then("^o sistema exibe o relatório para impressão Extrato$")
	public void oSistemaExibeORelatórioParaImpressãoExtrato() throws Throwable {
	   
	}
}
