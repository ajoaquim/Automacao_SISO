package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1239ConfirmacaoExecucao extends UtilsSteps {
	
	
	@Given("^acesse a aba confirmação execução$")
	public void acesseAAbaAutorizaçãoPedidoDeAutorizaçãoConfirmaçãoExecução() throws Throwable {
		initiate();
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		auto.acessoAutorizacao();
		auto.autorizacaoConfirmaçãoExecucao();
	}
	
	@When("^Informar um número de pedido que seja existente e esteja disponivel$")
	public void informarUmNumeroDePedidoQueSejaExistenteEEstejaDisponivel() throws Throwable {
		auto.informarUmNumeroDePedido("522");		
	}
	
	@When("^clicar no botão de pesquisar pedido$")
	public void clicarNoBotãoDePesquisarPedido() throws Throwable {
		auto.clicarNoBotaoPesquisarPedido();
	}
	
	@When("^Selecionar um Procedimento desejado$")
	public void selecionarUmoProcedimentoDesejado() throws Throwable{
		auto.selecionarUmoProcedimentoDesejado();
	}
	
	@When("^incluir a data do procedimento$")
	public void incluirADataDoProcedimento() throws Throwable {
		auto.incluirADataDoProcedimento();
	}

	@When("^Clicar no botão confirmar Pedido de autorização$")
	public void clicarNoBotãoConfirmarPedidoDeAutorização() throws Throwable {
		auto.clicarNoBotãoConfirmarPedidoDeAutorização();
	}

	@Then("^o sitema apresenta a mensagem confirmação do pedido realizada\\.$")
	public void oSitemaApresentaAMensagemConfirmaçãoDoPedidoRealizada() throws Throwable {
		Thread.sleep(12000);
		auto.oSitemaApresentaAMensagemConfirmaçãoDoPedidoRealizada("Confirmação do pedido ([0-9])* realizada.");
	}
	
	
	@When("^Informar um pedido Em Análise$")
	public void informarUmPedidoEmAnálise() throws Throwable {
		auto.informarUmNumeroDePedido("744");
	    
	}
	
	@Then("^o sitema apresenta a Não é possível Confirmar o pedido pois o mesmo está na situação Em análise$")
	public void oSitemaApresentaANãoÉPossívelConfirmarOPedidoPoisOMesmoEstáNaSituaçãoEmAnálise() throws Throwable {
		auto.oSitemaConfirmarAMensagem("Atenção: Não é possível Confirmar o pedido pois o mesmo está na situação Em análise");
	}


	@When("^Informar um pedido Cancelado$")
	public void informarUmPedidoCancelado() throws Throwable {
		auto.informarUmNumeroDePedido("683");
	}
	
	@Then("^o sitema apresenta a Não é possível Confirmar o pedido pois o mesmo está na situação Cancelado$")
	public void oSitemaApresentaANãoÉPossívelConfirmarOPedidoPoisOMesmoEstáNaSituaçãoCancelado()  throws Throwable {
		auto.oSitemaConfirmarAMensagem("Atenção: Não é possível Confirmar o pedido pois o mesmo está na situação Cancelado");
	}

	@When("^Informar um pedido Negado$")
	public void informarUmPedidoNegado() throws Throwable {
		auto.informarUmNumeroDePedido("740");
	    
	}
	
	@Then("^o sitema apresenta a Não é possível Confirmar o pedido pois o mesmo está na situação Negado$")
	public void oSitemaApresentaANãoÉPossívelConfirmarOPedidoPoisOMesmoEstáNaSituaçãoNegado()  throws Throwable {
		auto.oSitemaConfirmarAMensagem("Atenção: Não é possível Confirmar o pedido pois o mesmo está na situação Negado");
	}

}
