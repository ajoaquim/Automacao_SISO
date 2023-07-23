package steps;

	import static org.junit.Assert.assertEquals;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	import Ultils.UtilsSteps;
	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class Step1233RecalcularValoresAutorizadosAutorizacao  extends UtilsSteps {
		@Then("^Recalcular Valores Autorizados$")
		public void recalcularValoresAutorizados() throws Throwable {
			Thread.sleep(4000);
			modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "Recalculo_Valor");

		}
		
		
		
		@Given("^acesse a aba Autorização Recalcular Valores Autorizados$")
		public void acesseaabaAutorizaçãoRecalcularValoresAutorizados() throws Throwable {
			initiate();
			frame.sairFrame();
			frame.sairFrame();
			auto.acessoAutorizacao();
			auto.menuRecalcularValoresAutorizados();
		
		}

		
		
		
		@When("^informar um Prestador já existente$")
		public void informar_um_Prestador_já_existente() throws Throwable {
			
			WebElement iframe2 = driver.findElement(By.id("iframeasp"));
			driver.switchTo().frame(iframe2);
			WebElement iframe1 = driver.findElement(By.id("principal2"));
			driver.switchTo().frame(iframe1);
			
			auto.preencherCampoPrest("017060");
			
	Thread.sleep(1000);
			
		}

		
		
		@And("^então clicar no botão \"F2 - Executar\"$")
		public void então_clicar_no_botão_F2_Executar() throws Throwable {

				
			auto.buscar();
			
					
		}
		
		
		@Then("^o sistema mostrará \"Atenção: Recalculo realizado com sucesso\"$")
		public void o_sistema_apresenta_a_mensagem_Atenção_Recalculo_realizado_com_sucesso() throws Throwable {
			
					
			frame.sairFrame();
			frame.sairFrame();
			WebElement elemt = driver.findElement(By.id("iframeasp"));
			driver.switchTo().frame(elemt);
			WebElement elemt2 = driver.findElement(By.id("principal2"));
			driver.switchTo().frame(elemt2);
			WebElement text = driver.findElement(By.xpath("/html/body/div[2]/span[3]"));
			
			String texto = text.getText();
			
			assertEquals("Recalculo realizado com sucesso",texto);
			
				
			
			
		}
		


	}
	
	
