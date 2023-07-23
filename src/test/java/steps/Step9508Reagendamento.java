package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9508Reagendamento extends UtilsSteps {
	
	@When("^optar por selecionar o menu Reagendamento$")
	public void optarPorSelecionarOMenuReagendamento() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamento.acessoPagamento();
		pagamento.acessoReagndamento();
	}

	@When("^preencher os dados de busca de reembolso$")
	public void preencherOsDadosDeBuscaDeReembolso() throws Throwable {
		pagamento.buscarReemboso();
	}
	
	@When("^pesquisar reagendamento$")
	public void pesquisarReagendamento() throws Throwable {
		pagamento.pesquisarReagendamento();
	}
	
	@When("^preencher os dados de busca de contas ondontológicas$")
	public void preencherOsDadosDeBuscaDeContasOndontológicas() throws Throwable {
		pagamento.clicarContinuar();
	}

	@Then("^o sistema apresenta a todos os agendamentos$")
	public void oSistemaApresentaATodosOsAgendamentos() throws Throwable {
		Thread.sleep(2500);
	}

	@Then("^selecionar um pagamento$")
	public void selecionarUmPagamento() throws Throwable {
		pagamento.selecionarAgendamento();

	}

	@Then("^informar a Nova Data Prevista$")
	public void informarANovaDataPrevista() throws Throwable {
		pagamento.enviaDataDeAgendamento();
		pagamento.clicarExecutar();
	}

	@Then("^o sistema apresentar a mensagem operação realizada com sucesso$")
	public void oSistemaApresentarAMensagemOperaçãoRealizadaComSucesso() throws Throwable {
		pagamento.validarTexto(); 

	}

	@Then("^o pagamento fica uma nova data prevista$")
	public void oPagamentoFicaUmaNovaDataPrevista() throws Throwable {
		pagamento.buscarValidarData();
		pagamento.clicarContinuar();
		Thread.sleep(1500);
		pagamento.validarData();
	}
}
