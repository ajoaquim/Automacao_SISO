package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9221ConfirmacaoExecucao extends UtilsSteps {
	@Given("^acesse a aba Confirmação Execução$")
	public void acesseAAbaConfirmaçãoExecução() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		contas.acessoContasOdontologicas();
		contas.acessoContasConfirmarExcucao();
	}

	@When("^Informar um número de Pedido existente$")
	public void informarUmNúmeroDePedidoExistente() throws Throwable {
		contas.informarUmNumeroDePedido("1023");
	}

	@When("^clicar no botão continuar$")
	public void clicarNoBotãoContinuar() throws Throwable {
		contas.clicarNoBotaoPesquisarPedido();
	}

	@When("^selecionar a flag do procedimento$")
	public void selecionarAFlagDoProcedimento() throws Throwable {
		auto.selecionarUmoProcedimentoDesejado();
	}

	@When("^Clicar no botão em Confirmar Pedido de Autorização$")
	public void clicarNoBotãoEmConfirmarPedidoDeAutorização() throws Throwable {  
		auto.clicarNoBotãoConfirmarPedidoDeAutorização();
	}

	@Then("^o sitema apresenta a mensagem Confirmação do pedido realizada\\.$")
	public void oSitemaApresentaAMensagemConfirmaçãoDoPedidoRealizada() throws Throwable {
		Thread.sleep(12000);
		auto.oSitemaApresentaAMensagemConfirmaçãoDoPedidoRealizada("Confirmação do pedido ([0-9])* realizada.");
	}

	@When("^incluir a data$")
	public void incluirAData() throws Throwable {  
		auto.incluirADataDoProcedimento();
	}

	@When("^Informar um Em análise$")
	public void informarUmEmAnálise() throws Throwable {
		contas.informarUmNumeroDePedido("683");
	}

	@When("^Informar um Cancelado$")
	public void informarUmCancelado() throws Throwable {
		contas.informarUmNumeroDePedido("622");
	}

	@When("^Informar um Negado$")
	public void informarUmNegado() throws Throwable {
		contas.informarUmNumeroDePedido("740");
	}
	
	@Then("^é exibida a mensage Não é possível Confirmar o pedido pois o mesmo está na situação Em análise$")
	public void éExibidaAMensageNãoÉPossívelConfirmarOPedidoPoisOMesmoEstáNaSituaçãoEmAnálise() throws Throwable {  
		auto.oSitemaConfirmarAMensagem("Atenção: Não é possível Confirmar o pedido pois o mesmo está na situação Em análise");
	}
	
	@Then("^é exibida a mensage Não é possível Confirmar o pedido pois o mesmo está na situação Cancelado$")
	public void éExibidaAMensageNãoÉPossívelConfirmarOPedidoPoisOMesmoEstáNaSituaçãoCancelado() throws Throwable {  
		auto.oSitemaConfirmarAMensagem("Atenção: Não é possível Confirmar o pedido pois o mesmo está na situação Cancelado");
	}
	
	@Then("^é exibida a mensage Não é possível Confirmar o pedido pois o mesmo está na situação Negado$")
	public void éExibidaAMensageNãoÉPossívelConfirmarOPedidoPoisOMesmoEstáNaSituaçãoNegado() throws Throwable { 
		auto.oSitemaConfirmarAMensagem("Atenção: Não é possível Confirmar o pedido pois o mesmo está na situação Negado");
	}
}
