package steps;
import static org.junit.Assert.assertTrue;

import Ultils.UtilsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1237EncaminhamentoAnalise extends UtilsSteps {
	
	@Given("^acesse a aba Encaminhamento Análise$")
	public void acesseAAbaEncaminhamentoAnálise() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamento.acessarTelas("Autorização Odontológica", "Encaminhamento");;
	}
	//Cenário A	
	@When("^Informar número de Pedido com Status")
	public void informarNúmeroDePedidoComStatus() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	 	autoM.pesquisarPedido("682");
	}

	@And("^clicar no o botão de continuar")
	public void seguir_com_o_botão_de_continuar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
		frame.clicar_fora("//*[@id='num_pedido']");
	}					   
	
	@Then("^o sistema apresenta o resultado buscado$")
	public void o_sistema_apresenta_o_Histórico() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
		String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
		String txtEsperado = "Pedido 682 encontra-se em análise com P0643873 desde 10/02/2020.";
		work.validarMensagem(element, txtEsperado, "seletor");
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "1237_EncaminhamentoAnálise_CN1");
	}
	//Cenário B
	@When("^Informar  analise número de Pedido com Status$")
	public void informarAnaliseNúmeroDePedidoComStatus() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	 	autoM.pesquisarPedido("697");
	}

	@When("^clicar analise  no o botão de continuar$")
	public void clicarAnaliseNoOBotãoDeContinuar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
		frame.clicar_fora("//*[@id='num_pedido']");
	}

	@When("^Informar analise grupo de análise$")
	public void informarAnaliseGrupoDeAnálise() throws Throwable {
		
	}

	@Then("^é apresentada uma mensagem \"([^\"]*)\"$")
	public void éApresentadaUmaMensagem(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
		String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
		String txtEsperado = "Pedido não pode ser Encaminhado pois está na situação Autorizado";
		work.validarMensagem(element, txtEsperado, "seletor");
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "1237_EncaminhamentoAnálise_CN2");
	}
	
	//Cenário C
	
	@When("^Informar número de Pedido existente com Status de \"([^\"]*)\" encaminhamento analise$")
	public void informarNúmeroDePedidoExistenteComStatusDeEncaminhamentoAnalise(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
	 	autoM.pesquisarPedido("687");
	   
	}

	@When("^analise clicar no o botão de continuar analisee$")
	public void analiseClicarNoOBotãoDeContinuarAnalisee() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
		frame.clicar_fora("//*[@id='num_pedido']");
	  
	}

	@Then("^o sitema apresenta a mensagem \"([^\"]*)\" encaminhamento analise$")
	public void oSitemaApresentaAMensagemEncaminhamentoAnalise(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
	 	frame.framePaginaInicial("//*[@id='principal2']");
		String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
		String txtEsperado = "Pedido não pode ser Encaminhado pois está na situação Cancelado";
		work.validarMensagem(element, txtEsperado, "seletor");
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Autorizacao", "1237_EncaminhamentoAnálise_CN3");
	   
	}
	

	
}
