package steps;
import Ultils.UtilsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1235Historico extends UtilsSteps {
	
	@Given("^acesse Histórico$")
	public void acesse_Histórico() throws Throwable {
		initiate();
		frame.sairFrame();
	    frame.sairFrame();  
	    auto.menuAutorizacao();
	    auto.menuPedidosDeAutorizacao();
	    auto.menuHistorico();
	}
		
	@When("^Informar número de Pedido existente$")
	public void informar_número_de_pedido_existente() throws Throwable {
		auto.preencherCampoPedidoHistorico("655");
	}

	@And("^seguir com o botão de continuar")
	public void seguir_com_o_botão_de_continuar() throws Throwable {
		auto.clicarEmPesquisar();
	}
	
	@Then("^o sistema apresenta o Histórico$")
	public void o_sistema_apresenta_o_Histórico() throws Throwable {
		auto.validarHistorico();
		modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "Historico_1235");
		
	}
	
}
