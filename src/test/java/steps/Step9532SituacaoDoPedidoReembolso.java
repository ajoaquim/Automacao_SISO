package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9532SituacaoDoPedidoReembolso extends UtilsSteps{
	
	@When("^optar por selecionar o menu Reembolso Odontológico,Situação do Pedido de Reembolso$")
	public void optarPorSelecionarOMenuReembolsoOdontológicoSituaçãoDoPedidoDeReembolso() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		reembolsoR.ReembolsoOndotologico();
		reembolsoR.SituacaoPedidoReembolso();
	}

	@When("^Selecionar a fleg Em Análise na Situação Pedido Reembolso$")
	public void selecionarAFlegEmAnáliseNaSituaçãoPedidoReembolso() throws Throwable {
		reembolsoR.EmAnaliseFleg();
	}

	@When("^Clicar no Botão Pesquisar Situacao Pedido Reembolso$")
	public void clicarNoBotãoPesquisarSituacaoPedidoReembolso() throws Throwable {
	    reembolsoR.PesquisarSituacao();
	}

	@When("^Clicar no Botão Abrir Tela do Anexo de Pedido Reembolso$")
	public void clicarNoBotãoAbrirTelaDoAnexoDePedidoReembolso() throws Throwable {
	    reembolsoR.TelaAnexo();
	}

	@Then("^Sistema Apresenta Tela de Anexo do Pedido Reembolso$")
	public void sistemaApresentaTelaDeAnexoDoPedidoReembolso() throws Throwable {
	    frame.framePaginaInicial("//*[@id='iframemodal']");
		reembolsoR.ValidarTelaAnexo();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9532SituacaoPedidoCanceladoAnexo");
	}

	@When("^Clicar no Botão Abrir Tela de Alteração do Pedido Reembolso$")
	public void clicarNoBotãoAbrirTelaDeAlteraçãoDoPedidoReembolso() throws Throwable {
		reembolsoR.TelaAlteracao();
		Thread.sleep(2000);
	}

	@Then("^Sistema Apresenta Tela de Alteração do Pedido Reembolso$")
	public void sistemaApresentaTelaDeAlteraçãoDoPedidoReembolso() throws Throwable{
		String windowHandle = driver.getWindowHandle();
		
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.ValidarTelaAlteracao();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9532SituacaoPedidoCanceladoAlteracao");
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
	}

	@When("^Clicar no Botão Abrir Tela de Cancelamento de Pedido Reembolso$")
	public void clicarNoBotãoAbrirTelaDeCancelamentoDePedidoReembolso() throws Throwable {
	    reembolsoR.TelaCancelamento();
	}

	@Then("^Sistema Apresenta Tela de Consulta do Pedido Reembolso Cancelado$")
	public void sistemaApresentaTelaDeConsultaDoPedidoReembolsoCancelado() throws Throwable {
		String windowHandle = driver.getWindowHandle();
		
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.ValidarTelaCancelar();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9532SituacaoPedidoCanceladoCancelar");
		frame.fecharJanela();
		
		frame.trocarJanela(windowHandle);
	}

	@When("^Clicar no Botão Consulta Pedido de Pedido Reembolso$")
	public void clicarNoBotãoConsultaPedidoDePedidoReembolso() throws Throwable {
	    reembolsoR.TelaConsultaReembolso();
	}

	@Then("^Sistema Apresenta Tela de Consulta do Pedido Reembolso$")
	public void sistemaApresentaTelaDeConsultaDoPedidoReembolso() throws Throwable {
		String windowHandle = driver.getWindowHandle();
		
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9532SituacaoPedidoCanceladoConsulta");
		frame.fecharJanela();
		
		frame.trocarJanela(windowHandle);
	}

	@When("^Selecionar uma situação exceto Status Em Análise Pedido Reembolso$")
	public void selecionarUmaSituaçãoExcetoStatusEmAnálisePedidoReembolso() throws Throwable{
	   reembolsoR.CanceladoFleg();
	}
	
	@When("^Clicar no Botão Consulta Pedido de Reembolso Cancelado$")
	public void clicarNoBotãoConsultaPedidoDeReembolsoCancelado() throws Throwable{
		reembolsoR.TelaConsultaReembolso();
	}
	
	@Then("^Sistema Apresenta Tela de Consulta do Reembolso Cancelado$")
	public void sistemaApresentaTelaDeConsultaDoReembolsoCancelado() throws Throwable {
		String windowHandle = driver.getWindowHandle();
		
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.ValidarTelaConsulta();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9532SituacaoPedidoCanceladoConsultaComSituacaoCancelado");
		frame.fecharJanela();
		
		frame.trocarJanela(windowHandle);
	}
	
	@When("^informar um reembolso existente não vinculado ao usuario Situacao$")
	public void informarUmReembolsoExistenteNãoVinculadoAoUsuarioSituacao() throws Throwable {
		reembolsoR.ReverterPedidoCancelado();
		reembolsoR.CancelamentoPedidoReembolso();
		
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
	
		reembolsoR.ReembolsoSituacaoAssumir();
		
		frame.clicar_fora("//*[@id=\"num_reembolso\"]");
	}

	@When("^o sistem mostrar o pop up com a mensagem Deseja assumir o pedido do reembolso\\?Assumindo o pedido do reembolso, a mesma ficará bloqueada para seu usuário até que seja finalizada sua alteração Situacao$")
	public void oSistemMostrarOPopUpComAMensagemDesejaAssumirOPedidoDoReembolsoAssumindoOPedidoDoReembolsoAMesmaFicaráBloqueadaParaSeuUsuárioAtéQueSejaFinalizadaSuaAlteraçãoSituacao() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9535PopupAssumirpedido");
	}
	
	@When("^clicar em Assumir Situacao$")
	public void clicarEmAssumirSituacao() throws Throwable {
		reembolsoR.Assumir();
	}
	

	@Then("^o sistema abre o pedido de reembolso Situacao$")
	public void oSistemaAbreOPedidoDeReembolsoSituacao() throws Throwable {
		reembolsoR.ValidarHistorico();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9535ReembolsoAssumir");
	}

	


}

