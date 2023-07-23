package steps;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Ultils.UtilsSteps;
import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1238DesbloquearPedido extends UtilsSteps {



	@And("^acesse a aba \"Autorização\"/\"Pedido de Autorização\"/\"Desbloquear Pedido\"$")
	public void acesseabaAutorizaçãoPedidodeAutorizaçãoDesbloquearPedido() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		auto.acessoAutorizacao();
		auto.autorizacaoDesbloquearPedido();
	}
	
	/*Scenario: Validar consulta de Pedido Bloqueado*/ 
	
	@When("^Informar número de Pedido existente Bloqueado$")
	//@When("^clicar no botão \"Continuar\" Validar Pedido Bloqueado$")
	public void InformarnúmerodePedidoexistenteBloqueado() throws Throwable {

	
			WebElement iframe2 = driver.findElement(By.id("iframeasp"));
			driver.switchTo().frame(iframe2);
			WebElement iframe1 = driver.findElement(By.id("principal2"));
			driver.switchTo().frame(iframe1);
			
			auto.preencherCampoPed("623");
		
	
		
		
	}

	@And("^clicar no botão \"Continuar\" Validar Pedido Bloqueado$")
	public void clicarnobotãoContinuarPedidoBloqueado() throws Throwable {
		//auto.buscar();
	}
	
	@Then("^o sistema demonstra o resultado da busca$")
	public void osistemaapresentaoresultadodabuscapedidobloqueado() throws Throwable {
		
		
		
		frame.sairFrame();
		frame.sairFrame();
		WebElement elemt = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(elemt);
		WebElement elemt2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(elemt2);
		
		//Thread.sleep(10000);
		
		auto.ValidarTelaPedidoBloqueado();
		
		//WebElement text = driver.findElement(By.xpath("//*[@id=\"form01\"]/table/tbody/tr[1]/td[2]/i[1]"));
			
		
		//assertEquals("fa fa-lock fa-2x",text.getAttribute("class"));
		
	}
	
	//*Scenario: Validar consulta de Pedido não Bloqueado$") 
	@When("^Informar número de Pedido existente não Bloqueado$") 
		public void InformarnúmerodePedidoexistentenãoBloqueado() throws Throwable {
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);
		
		auto.preencherCampoPed("622");
	}

	@And("^clicar no botão \"Continuar\" Pedido não Bloqueado$")
	public void clickarnobotãoContinuar() throws Throwable {

		//auto.buscarDesbloqueio();
	}
	
	@Then("^o sistema apresenta a mensagem \"Atenção: Pedido não encontra-se bloqueado\".$")
	public void osistemaapresentaamensagemAtençãoPedidonãoencontrasebloqueado() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		WebElement elemt = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(elemt);
		WebElement elemt2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(elemt2);
		WebElement text = driver.findElement(By.xpath("/html/body/div[2]/span[3]"));
		
		String texto = text.getText();
		
		assertEquals("Pedido não encontra-se bloqueado.",texto);
		
		
		
	} 

	//*Scenario: Validar Desbloqueio de Pedido 
	@When("^fornecer numero de Pedido existente Bloqueado validar desbloqueio$")
	public void informarnúmerodePedidoexistentebloqueadovalidardesbloqueio() throws Throwable {
		
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);
		
		auto.preencherCampoPed("692");
		
		
	}
	
	@And("^clicar no botão Continuar validar desbloqueio$")
	public void clicarnobotãoContinuarvalidardesbloqueio() throws Throwable {
		
	}
	
	@And("^Clicar no botão Desbloquear Pedido Desbloqueio de Pedido$")
	public void ClicarnobotãoDesbloquearPedido() throws Throwable {
		auto.buscarBotãoAçãoDesbloquear();
		
	}
	
	
	@And("^O Sistema mostra a mensagem \"Confirme desbloqueio do pedido\" validar desbloqueio$")
	public void OSistemaapresentaamensagemConfirmedesbloqueiodopedidovalidardesbloqueio() throws Throwable {
		
		auto.TextoalertaDesbloqueioPedido();
		//auto.alertaDesbloqueioPedido();
		//modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "alerta_excluir_qualificação");
				
	}
	

	@And("^Clicar no Botão OK desbloqueio do pedido$")
	public void ClicarnoBotãoOKdesbloqueiodopedido() throws Throwable {
		auto.alertaDesbloqueioPedido();
	}
	
	@Then("^o sitema apresenta a mensagem Operação realizada com sucesso desbloqueio do pedido$")	
	public void osistemaapresentaamensagemOperaçãorealizadacomsucesso() throws Throwable {
		
		frame.sairFrame();
		frame.sairFrame();
		WebElement elemt = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(elemt);
		WebElement elemt2 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(elemt2);
		
		Thread.sleep(10000);
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\"btnAssumir\"]"));
		//String texto = text.getText();
		
		//assertEquals("Operação realizada com sucesso.",texto);
		text.click();
		
		
	}


}


        