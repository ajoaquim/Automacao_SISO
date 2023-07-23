package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9540ConsultaReembolso extends UtilsSteps{
	
	@When("^optar por selecionar o menu Reembolso Odontológico, Consulta Reembolsos$")
	public void optarPorSelecionarOMenuReembolsoOdontológicoConsultaReembolsos() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		reembolsoR.ReembolsoOndotologico();
		reembolsoR.ConsultaReembolso();
	}

	@When("^informar um Beneficiário já existente$")
	public void informarUmBeneficiárioJáExistente() throws Throwable {
	   reembolsoR.BeneficiarioConsulta();
	}

	@When("^clicar fora do campo do consulta reembolso$")
	public void clicarForaDoCampoDoConsultaReembolso() throws Throwable {
	   frame.clicar_fora("//*[@id=\"NUM_ASSOCIADO\"]");
	}

	@When("^clicar no botão Executar do consulta reembolso$")
	public void clicarNoBotãoExecutarDoConsultaReembolso() throws Throwable {
	   reembolsoR.ExecutarReembolso();
	}

	@Then("^o sistema apresenta o resultado da busca do consulta reembolso$")
	public void oSistemaApresentaOResultadoDaBuscaDoConsultaReembolso() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9540ConsultaReembolso");
	}

	@Given("^que ja consultei o reembolso$")
	public void queJaConsulteiOReembolso() throws Throwable {
	   
	}

	@Given("^escolher um reembolso na lista apresentada$")
	public void escolherUmReembolsoNaListaApresentada() throws Throwable {
	   
	}

	@When("^quando acessar o menu Reembolso Odontológico -> alteração/analise$")
	public void quandoAcessarOMenuReembolsoOdontológicoAlteraçãoAnalise() throws Throwable {
	   
	}

	@When("^informar o Nº de Reembolso existente$")
	public void informarONºDeReembolsoExistente() throws Throwable {
	    
	}

	@When("^ir até a aba Atendimento$")
	public void irAtéAAbaAtendimento() throws Throwable {
	    
	}

	@Then("^o Executante da Lista de consulta é o mesmo apresentado nesta aba$")
	public void oExecutanteDaListaDeConsultaÉOMesmoApresentadoNestaAba() throws Throwable {
	    
	}

	@When("^informar um reembolso existente não vinculado ao usuario$")
	public void informarUmReembolsoExistenteNãoVinculadoAoUsuario() throws Throwable {
	    
	}

	@When("^o sistem mostrar o pop up com a mensagem Deseja assumir o pedido do reembolso\\?Assumindo o pedido do reembolso, a mesma ficará bloqueada para seu usuário até que seja finalizada sua alteração$")
	public void oSistemMostrarOPopUpComAMensagemDesejaAssumirOPedidoDoReembolsoAssumindoOPedidoDoReembolsoAMesmaFicaráBloqueadaParaSeuUsuárioAtéQueSejaFinalizadaSuaAlteração() throws Throwable {
	    
	}

	@When("^clicar em Assumir$")
	public void clicarEmAssumir() throws Throwable {
	   ;
	}

	@Then("^o sistema abre o pedido de reembolso$")
	public void oSistemaAbreOPedidoDeReembolso() throws Throwable {
	  
	}


}
