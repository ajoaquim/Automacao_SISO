package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9536ReverterPedidoNegado extends UtilsSteps {

	String windowHandle;

	@When("^optar por selecionar o menu Reembolso Odontológico, Reverter Pedido Negado$")
	public void optarPorSelecionarOMenuReembolsoOdontológicoReverterPedidoNegado() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		reembolsoR.ReembolsoOndotologico();
		reembolsoR.ReverterPedidoNegado();
	}

	@When("^informar um pedido existente Reverter Pedido Negado$")
	public void informarUmPedidoExistenteReverterPedidoNegado() throws Throwable {
		//driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoNegado();
	}

	@When("^clicar fora do campo Reverter Pedido Negado$")
	public void clicarForaDoCampoReverterPedidoNegado() throws Throwable {
		frame.clicar_fora("//*[@id='num_reembolso']");
	}

	@When("^clicar em Consultar Reembolsos do beneficiário Reverter Pedido Negado$")
	public void clicarEmConsultarReembolsosDoBeneficiárioReverterPedidoNegado() throws Throwable {
		windowHandle = driver.getWindowHandle();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		reembolsoR.ConsultaReembolsoBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.ValidarTelaConsultaReembolso();
	}

	@Then("^o sistema abre a tela de consulta de Reembolso Reverter Pedido Negado$")
	public void oSistemaAbreATelaDeConsultaDeReembolsoReverterPedidoNegado() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReverterPedidoNegadoConsulta");
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
	}

	@When("^clicar em Histórico de Procedimentos Reverter Pedido Negado$")
	public void clicarEmHistóricoDeProcedimentosReverterPedidoNegado() throws Throwable {
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		windowHandle = driver.getWindowHandle();
		reembolsoR.HistoricoDeProcedimento();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.ValidarTelaHistoricoProcedimento();
	}

	@Then("^o sistema abre a tela de Histórico de Procedimentos Reverter Pedido Negado$")
	public void oSistemaAbreATelaDeHistóricoDeProcedimentosReverterPedidoNegado() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReverterPedidoNegadoHistorico");
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);

	}

	@When("^clicar em Dados beneficiário/Contratos Reverter Pedido Negado$")
	public void clicarEmDadosBeneficiárioContratosReverterPedidoNegado() throws Throwable {
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		windowHandle = driver.getWindowHandle();
		reembolsoR.DadosBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.ValidarTelaDadosBeneficiario();	
	}

	@Then("^o sistema abre a tela de Dados beneficiário/Contratos Reverter Pedido Negado$")
	public void oSistemaAbreATelaDeDadosBeneficiárioContratosReverterPedidoNegado() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReverterPedidoNegadoDadosBeneficiario");
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
	}

	@When("^clicar em Alertas Beneficiário Reverter Pedido Negado$")
	public void clicarEmAlertasBeneficiárioReverterPedidoNegado() throws Throwable {
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		windowHandle = driver.getWindowHandle();
		reembolsoR.AlertasBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.ValidarTelaAlertaBeneficiario();
	}

	@Then("^o sistema abre a tela de Alertas Beneficiário Reverter Pedido Negado$")
	public void oSistemaAbreATelaDeAlertasBeneficiárioReverterPedidoNegado() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReverterPedidoNegadoAlertaBeneficiario");
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
	}

	@When("^clicar em Contatos do Beneficiário Reverter Pedido Negado$")
	public void clicarEmContatosDoBeneficiárioReverterPedidoNegado() throws Throwable {
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		reembolsoR.ContatoBeneficiario();
	}

	@Then("^o sistema abre a tela de Contatos do Beneficiário Reverter Pedido Negado$")
	public void oSistemaAbreATelaDeContatosDoBeneficiárioReverterPedidoNegado() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReverterPedidoNegadoContatosBeneficiario");
	}
	
	@When("^Informar um Reembolso Negado$")
	public void informarUmReembolsoNegado() throws Throwable {
		//driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoNegado();
	}

	@When("^Clicar no Botão Continuar$")
	public void clicarNoBotãoContinuar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		reembolsoR.ContinuarReembolso();
	}

	@When("^Clicar no Botão Reverter$")
	public void clicarNoBotãoReverter() throws Throwable {
		reembolsoR.Reverter();
	}

	@When("^Sistema Apresenta a mensagem Confirma reverter negativa do pedido de reembolso\\?$")
	public void sistemaApresentaAMensagemConfirmaReverterNegativaDoPedidoDeReembolso() throws Throwable {
		Thread.sleep(5000);
		
	}

	@When("^Clicar no Botão OK$")
	public void clicarNoBotãoOK() throws Throwable {
		driver.switchTo().alert().accept();
	}

	@When("^O Sistema apresenta a mensagem  Atenção: Negativa do pedido revertida com sucesso\\.$")
	public void oSistemaApresentaAMensagemAtençãoNegativaDoPedidoRevertidaComSucesso() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReverterPedidoNegadoComSucesso");
	}
	
	@When("^Clicar no Menu Histórico Reverter Pedido Negado$")
	public void clicarNoMenuHistóricoReverterPedidoNegado() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		reembolsoR.Historico();
	}

	@When("^Informar o número de Reembolso Reverter Pedido Negado$")
	public void informarONúmeroDeReembolsoReverterPedidoNegado() throws Throwable {
		//driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
	
		
		reembolsoR.ReembolsoNegado();
		frame.clicar_fora("//*[@id='num_reembolso']");
	}

	@Then("^O Sistema Apresenta o Status Em Análise Reverter Pedido Negado$")
	public void oSistemaApresentaOStatusEmAnáliseReverterPedidoNegado() throws Throwable {
		reembolsoR.ValidarHistorico();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReverterPedidoNegadoAnalise");
	}
	
	@When("^Informar um Reembolso Em Análise Reverter Pedido Negado$")
	public void informarUmReembolsoEmAnáliseReverterPedidoNegado() throws Throwable {
		//driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoNegado();
		
	}

	@Then("^O Sistema apresenta a mensagem Atenção: Não é possível Reverter Negativa pois pedido está na situação Em análise$")
	public void oSistemaApresentaAMensagemAtençãoNãoÉPossívelReverterNegativaPoisPedidoEstáNaSituaçãoEmAnálise() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReverterPedidoNegadoAnaliseNaoReverter");
	}

	@When("^Informar um Reembolso Cancelado Reverter Pedido Negado$")
	public void informarUmReembolsoCanceladoReverterPedidoNegado() throws Throwable {
		//driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoCancelaReverter(); 
		frame.clicar_fora("//*[@id='num_reembolso']");
	}

	@Then("^O Sistema apresenta a mensagem Atenção: Não é possível Reverter Negativa pois pedido está na situação Cancelado$")
	public void oSistemaApresentaAMensagemAtençãoNãoÉPossívelReverterNegativaPoisPedidoEstáNaSituaçãoCancelado() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReverterPedidoNegadoCancelado");
	}

	@When("^Informar um Reembolso Enviado Para Pagamento Reverter Pedido Negado$")
	public void informarUmReembolsoEnviadoParaPagamentoReverterPedidoNegado() throws Throwable {
		//driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoPagamento();
		frame.clicar_fora("//*[@id='num_reembolso']");
	}

	@Then("^O Sistema apresenta a mensagem  Atenção: Pedido de reembolso  já foi enviado para pagamento e não pode ser alterado$")
	public void oSistemaApresentaAMensagemAtençãoPedidoDeReembolsoJáFoiEnviadoParaPagamentoENãoPodeSerAlterado() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReverterPedidoNegadoPagamento");
	}
	

	@When("^informar um reembolso existente não vinculado ao usuario Reverter Pedido Negado$")
	public void informarUmReembolsoExistenteNãoVinculadoAoUsuarioReverterPedidoNegado() throws Throwable {
		reembolsoR.AlteracaoAnalise();
		//driver.switchTo().alert().accept();
		
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
	
		reembolsoR.ReembolsoNegado();
		
		frame.clicar_fora("//*[@id=\"num_reembolso\"]");
	}

	@When("^o sistem mostrar o pop up com a mensagem Deseja assumir o pedido do reembolso\\?Assumindo o pedido do reembolso, a mesma ficará bloqueada para seu usuário até que seja finalizada sua alteração Reverter Pedido Negado$")
	public void oSistemMostrarOPopUpComAMensagemDesejaAssumirOPedidoDoReembolsoAssumindoOPedidoDoReembolsoAMesmaFicaráBloqueadaParaSeuUsuárioAtéQueSejaFinalizadaSuaAlteraçãoReverterPedidoNegado()
			throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536PopupAssumirpedido");
	}

	@When("^clicar em Assumir Reverter Pedido Negado$")
	public void clicarEmAssumirReverterPedidoNegado() throws Throwable {
		reembolsoR.Assumir();
	}

	@Then("^o sistema abre o pedido de reembolso Reverter Pedido Negado$")
	public void oSistemaAbreOPedidoDeReembolsoReverterPedidoNegado() throws Throwable {
		reembolsoR.ValidarHistorico();
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9536ReembolsoAssumir");
	}	
	

	
	
	
	
	

}
