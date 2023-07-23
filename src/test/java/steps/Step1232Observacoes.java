package steps;

import java.util.concurrent.TimeUnit;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1232Observacoes extends UtilsSteps {

	@Given("^acesse a aba Autorização/Pedido de Autorização/Observações$")
	public void acesseAAbaAutorizaçãoPedidoDeAutorizaçãoObservações() throws Throwable {

		initiate();
		frame.sairFrame();
		frame.sairFrame();
		auto.menuAutorizacao();
		auto.menuPedidosDeAutorizacao();
		auto.menuObservacoes();
	}

	@When("^informar um numero de Pedido já existente$")
	public void informarUmNumeroDePedidoJáExistente() throws Throwable {
		String numeroPedido = "602";
		auto.preencherCampoNumeroPedido(numeroPedido);
	}

	@When("^clicar fora do campo selecionado$")
	public void clicarForaDoCampoSelecionado() throws Throwable {
		auto.teclado();
	}

	@When("^selecionar o Tipo de Observacao$")
	public void selecionarOTipoDeObservacao() throws Throwable {
		auto.selecionarTipoObservacao();
	}

	@When("^preeencher o campo ObservaçãoR$")
	public void preeencherOCampoObservação() throws Throwable {
		String texto = "Testando o campo Observacão Exclusiva Prestadora";
		frame.mudarModalPrincipalSISO();
		auto.preencherCampoObservacao(texto, "txt_obs_operadora");
	}

	@When("^clicar no botão SalvarR$")
	public void clicarNoBotãoSalvar() throws Throwable {
		auto.salvarObservacao("btn_acao_alterar();");
	}

	@Then("^o sistema apresenta a mensagem Atenção: Alteração da observacão do pedido numero do pedido realizada\\.SalvarRC$")
	public void oSistemaApresentaAMensagemAtençãoAlteraçãoDaObservacãoDoPedidoNumeroDoPedidoRealizadaSalvar() {
				
		String element = "/html/body/div[2]/span[3]";
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//auto.validaMensagemDeObservacao(element, "Atenção: Alteração da observacão do pedido 602 realizada");
		
		modulo.screenshot(driver, System.currentTimeMillis(), "autorizacao", "inserir_observacao_1232");
	}
}
