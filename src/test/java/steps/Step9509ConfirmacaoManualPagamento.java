package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9509ConfirmacaoManualPagamento extends UtilsSteps {
	
	@When("^optar por selecionar o menu Pagamento, Confirmação Manual de Pagamento$")
	public void optarPorSelecionarOMenuPagamentoConfirmaçãoManualDePagamento() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamentoR.MenuPagamento();
		pagamentoR.ConfirmaManual();
	}

	@When("^informar o dados para busca Confirmacao$")
	public void informarODadosParaBuscaConfirmacao() throws Throwable {
		frame.mudarModalPrincipalSISO();
		pagamentoR.DataDePagamento();
		pagamentoR.BeneficiarioReembolso();
	}

	@When("^selecionar Continuar Confirmacao$")
	public void selecionarContinuarConfirmacao() throws Throwable {
		frame.mudarModalToolbarSISO();
		pagamentoR.Continuar();
	}

	@When("^flegar o pagamento para ser dado baixa Confirmacao$")
	public void flegarOPagamentoParaSerDadoBaixaConfirmacao() throws Throwable {
		frame.mudarModalPrincipalSISO();
		pagamentoR.FlegPagamento();
		pagamentoR.Observacao();
		
	}

	@When("^executar a ação Confirmacao$")
	public void executarAAçãoConfirmacao() throws Throwable {
		frame.mudarModalToolbarSISO();
		pagamentoR.Executar();
		
	}

	@Then("^o sistema exibe a mensagem Pagamento confirmado com sucesso\\. Confirmacao$")
	public void oSistemaExibeAMensagemPagamentoConfirmadoComSucessoConfirmacao() throws Throwable {
		frame.mudarModalPrincipalSISO();
		work.validarMensagem("txt_msg", "Pagamento confirmado com sucesso." , "id");
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9509ConfirmacaoManualPagamento");
	}

	@When("^informar o dados para busca Confirmacao Contas Ondontológicas$")
	public void informarODadosParaBuscaConfirmacaoContasOndontológicas() throws Throwable {
		frame.mudarModalPrincipalSISO();
		pagamentoR.DataDePagamentoContas();
		pagamentoR.PrestadorContasOdontologicas();	
	}

	@When("^selecionar Continuar Confirmacao Contas Ondontológicas$")
	public void selecionarContinuarConfirmacaoContasOndontológicas() throws Throwable {
		frame.mudarModalToolbarSISO();
		pagamentoR.Continuar();
	}

	@When("^flegar o pagamento para ser dado baixa Confirmacao Contas Ondontológicas$")
	public void flegarOPagamentoParaSerDadoBaixaConfirmacaoContasOndontológicas() throws Throwable {
		frame.mudarModalPrincipalSISO();
		pagamentoR.FlegPagamento();
		pagamentoR.Observacao();
	}

	@When("^executar a ação Confirmacao Contas Ondontológicas$")
	public void executarAAçãoConfirmacaoContasOndontológicas() throws Throwable {
		frame.mudarModalToolbarSISO();
		pagamentoR.Executar();
	}

	@Then("^o sistema exibe a mensagem Pagamento confirmado com sucesso\\. Confirmacao Contas Ondontológicas$")
	public void oSistemaExibeAMensagemPagamentoConfirmadoComSucessoConfirmacaoContasOndontológicas() throws Throwable {
		frame.mudarModalPrincipalSISO();
		work.validarMensagem("txt_msg", "Pagamento confirmado com sucesso." , "id");
		modulo.screenshot(driver, System.currentTimeMillis(), "Pagamento", "9509ConfirmacaoManualPagamentoContasOdontologicas");
	}
	


}
