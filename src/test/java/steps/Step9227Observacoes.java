package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9227Observacoes extends UtilsSteps{
	
	@Given("^acesse a aba Contas Odontológicas,  Observações$")
	public void acesseAAbaContasOdontológicasObservações() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		contasR.MenuContasOdontologicas();
		contasR.Observacoes();
		
	
	}

	@When("^informar um Nº Pedido já existente$")
	public void informarUmNºPedidoJáExistente() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		contasR.Pedido();
		
		frame.clicar_fora("//*[@id='num_pedido']");
	}

	@When("^selecionar Tipo de Observacao$")
	public void selecionarTipoDeObservacao() throws Throwable {
		contasR.SelecionaPrestador();
		
	}

	@When("^preeencher o campo Observação$")
	public void preeencherOCampoObservação() throws Throwable {
		contasR.ObservacaoTexto();
	}

	@When("^clicar no botão Salvar$")
	public void clicarNoBotãoSalvar() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		contasR.Salvar();
	}

	@Then("^o sistema apresenta a mensagem  Atenção: Alteração da observacão do pedido realizada\\.$")
	public void oSistemaApresentaAMensagemAtençãoAlteraçãoDaObservacãoDoPedidoRealizada() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9227AlteracaoDaObservacao");
		
	}


}
