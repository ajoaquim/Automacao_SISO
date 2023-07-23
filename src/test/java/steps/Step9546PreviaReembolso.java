package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Step9546PreviaReembolso extends UtilsSteps {
	@When("^optar por selecionar o menu \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" previa$")
	public void optarPorSelecionarOMenuPrevia(String arg1, String arg2, String arg3) throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
//		reembolso.acessarReembolso("Prévia");
		reembolso.submenPrevia("Cancelamento");
	}
	@When("^informar um  \"([^\"]*)\" com \"([^\"]*)\" previa$")
	public void informarUmComPrevia(String arg1, String arg2) throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolso.inputPrevia("604");
		frame.clicar_fora("//*[@id=\"num_previa\"]");
		
	}

	@When("^clicar no Botão Cancelar previa$")
	public void clicarNoBotãoContinuarPrevia() throws Throwable {
		 frame.sairFrame();
		 frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	     frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	     reembolso.cancelarPrevia();
	}

	@When("^o sitema apresenta a mensagem \"([^\"]*)\" previa$")
	public void oSitemaApresentaAMensagemPrevia(String arg1) throws Throwable {
	    
	}

	@When("^clicar no botão ok previa$")
	public void clicarNoBotãoOkPrevia() throws Throwable {
		driver.switchTo().alert().accept();
	}

	@Then("^o sistema apresenta a mensagem \"([^\"]*)\" previa$")
	public void oSistemaApresentaAMensagemPrevia(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
		work.validarMensagem(element,"Cancelamento da prévia [0-9]* realizado." , "seletor");
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9533_Previa_1");
	}
	
	
}
