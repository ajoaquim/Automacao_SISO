package steps;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Ultils.UtilsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1227ReverteConfirmacaodeExecucao extends UtilsSteps {






	@And("^acesse a aba \"Autorização\"/\"Pedido de Autorização\"/\"Reverte Confirmação de Execução\"$")
	public void acesseaabaAutorizaçãoPedidodeAutorizaçãoReverteConfirmaçãodeExecução() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		auto.acessoAutorizacao();
		auto.autorizacaoReverteConfirmacaoDeExecucao();
	}


	//Scenario: Efetuar a Reversão da Confirmação de execução
	@When("^se tenha um pedido \"autorizado\" e com \"confirmação de execução\"$") 
	public void setenhaumpedidoautorizadoecomconfirmaçãodeexecução() throws Throwable {


		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);

		auto.preencherCampoPedProcedimento("512"); 

	}

	@And("^clicar fora do campo Confirmação de execução$") 
	public void clicarforadocampoConfirmaçãodeExecução() throws Throwable {

	}

	@And("^selecionar o procedimento para reversão Confirmação de execução$") 
	public void selecionaroprocedimentoparareversãoConfirmaçãodeExecução() throws Throwable {
		//WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		//driver.switchTo().frame(iframe2);
		//WebElement iframe1 = driver.findElement(By.id("principal2"));
		//driver.switchTo().frame(iframe1);

		auto.preencherClickProcediemnto(); 		
	}

	@And("^clicar no botão \"Reverte Confirmação de Execução\" Confirmação de execução$") 
	public void clicarnobotãoReverteConfirmaçãodeExecuçãoConfirmaçãodeexecução() throws Throwable {
		auto.buscarBotãoAçãoReverteConfirmacao();	
	}

	@And("^clicar no botão \"ok\" Confirmação de execução$") 
	public void clicarnobotãookConfirmaçãodeexecução() throws Throwable {

		auto.TextoalertaReverteConfirmacaoExecucao();
		auto.alertaReverteConfirmacaoExecucao();

	}

	@Then("^o sistema traz a mensagem Atenção: Reversão da confirmacão do pedido realizada.$") 
	public void osistemaapresentaamensagemAtençãoReversãodaconfirmacãodopedidorealizada() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		WebElement elemt = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(elemt);
		WebElement elemt2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(elemt2);

		//Thread.sleep(40000);

		WebElement text = driver.findElement(By.xpath("/html/body/div[2]/span[3]"));
		String texto = text.getText();

		assertEquals("Reversão da confirmacão do pedido 512 realizada.",texto);
		//System.out.println("Atenção(888): Reversão da confirmacão do pedido realizada. SAUDE");
		//Reversão da confirmacão do pedido 612 realizada.
	}

	//Scenario: Efetuar a Reversão da Confirmação de execução pelo portal
	@When("^informar um \"Número de pedido\" que tenha a confirmação realizada no Portal do Prestador$") 
	public void informarumNúmerodepedidoquetenhaaconfirmaçãorealizadanoPortaldoPrestador() throws Throwable {
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);

		auto.preencherCampoPedProcedimento("612"); 

	}
	@And("^clicar fora do campo execução pelo portal$") 
	public void clicarforadocampoexecuçãopeloportal() throws Throwable {

	}
	@And("^selecionar o procedimento para reversão execução pelo portal$") 
	public void selecionaroprocedimentoparareversãoexecuçãopeloportal() throws Throwable {
		this.selecionaroprocedimentoparareversãoConfirmaçãodeExecução();	
	}
	@And("^clicar no botão \"Reverte Confirmação de Execução\" execução pelo portal$") 
	public void clicarnobotãoReverteConfirmaçãodeExecuçãoexecuçãopeloportal() throws Throwable {
		this.clicarnobotãoReverteConfirmaçãodeExecuçãoConfirmaçãodeexecução();
	}
	@And("^clicar no botão \"ok\" execução pelo portal$") 
	public void clicarnobotãookexecuçãopeloportal() throws Throwable {

		this.clicarnobotãookConfirmaçãodeexecução();


	}
	@Then("^o sistema mostra a mensagem Atenção: Reversão da confirmacão do pedido realizada.$") 
	public void osistemamostraamensagemAtençãoReversãodaconfirmacãodopedidorealizada() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		WebElement elemt = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(elemt);
		WebElement elemt2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(elemt2);

		//Thread.sleep(40000);

		WebElement text = driver.findElement(By.xpath("/html/body/div[2]/span[3]")); 
		String texto = text.getText();

		assertEquals("Reversão da confirmacão do pedido 612 realizada.",texto);
		//System.out.println("Atenção(888): Reversão da confirmacão do pedido realizada. SAUDE");
		//Reversão da confirmacão do pedido 612 realizada.
		//System.out.println("Atenção: Reversão da confirmacão do pedido realizada.");
		//System.out.println("Atenção(999): Reversão da confirmacão do pedido realizada. PRESTADOR");
		//Reversão da confirmacão do pedido 612 realizada.
	}


}

