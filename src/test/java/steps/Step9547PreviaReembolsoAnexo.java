package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9547PreviaReembolsoAnexo extends UtilsSteps {
	@When("^optar por selecionar o menu \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void optarPorSelecionarOMenu(String arg1, String arg2, String arg3) throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		reembolso.acessarReembolso("Anexo");
	}

	@When("^informar um Nº de Prévia existente anexo$")
	public void informarUmNºDePréviaExistenteAnexo() throws Throwable {
	    frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolso.inputProtocolo("812");
	}

	@When("^clicar fora do campo anexo$")
	public void clicarForaDoCampoAnexo() throws Throwable {
		frame.clicar_fora("//*[@id=\"num_reembolso\"]");
		
	}

	@When("^preencher a descrição do anexo anexo$")
	public void preencherADescriçãoDoAnexoAnexo() throws Throwable {
		 frame.sairFrame();
		 frame.framePaginaInicial("//*[@id='iframeasp']");
	     frame.framePaginaInicial("//*[@id='principal2']");
	     
	     WebElement desc = driver.findElement(By.cssSelector("#txt_descricao"));
	     desc.sendKeys("Teste");
	}

	@When("^selecionar Incluir anexo anexo$")
	public void selecionarIncluirAnexoAnexo() throws Throwable {
		
	}

	@When("^selecionar o arquivo anexo$")
	public void selecionarOArquivoAnexo() throws Throwable {
	
	}

	@Then("^o sistema apresenta a mensagem Operação realizada anexo$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaAnexo() throws Throwable {
	 
	}

}
