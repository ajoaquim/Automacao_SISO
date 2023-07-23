package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1230Revalidacao extends UtilsSteps {	
	
	@When("acesse a aba de Pedido de Autorização e Revalidação")
	public void acesseAAbaDePedidodeAutorizaçãoeRevalidação() throws InterruptedException{
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		auto.acessoAutorizacao();
		auto.autorizacaoRevalidacao();
	}

	@When("^informar um pedido que foi autorizado$")
	public void informarUmAutorizado() {
		auto.preencherCampoPedidoHistorico("744");
	}

	@When("^alterar o \"([^\"]*)\"$")
	public void alterarO(String arg1) {
	}
	
	@When("^clicar no botão Validar$")
	public void clicarNoBotãoValidar() throws InterruptedException {
		auto.realizaRevalidacao();
	}

	@When("^clicar em \"([^\"]*)\" na mensagem de confirmação$")
	public void clicarEmNaMensagemDeConfirmação(String arg1) throws Throwable {
		driver.switchTo().alert().accept();
	}

	@Then("^o sistema apresenta a mensagem de revalidação do pedido realizada$")
	public void oSistemaApresentaAMensagemDeRevalidaçãoDoPedidoRealizada() throws Throwable {
		auto.validaMensagemDeRevalidaçãoDoPedidoRealizada();
	}

}
