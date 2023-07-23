package steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9531AlteracaoAnalise extends UtilsSteps {

	String windowHandle;

	@When("^optar por selecionar o menu Reembolso Odontológico,Alteração/Análise$")
	public void optarPorSelecionarOMenuReembolsoOdontológicoAlteraçãoAnálise() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.sendKeys("Alteração/Análise");
		driver.findElement(By.id("btn-filtro-menu")).click();
		List<WebElement> firstLevelMenu = driver.findElements(By.id("dropdown"));

		boolean result = false;
		for (WebElement first : firstLevelMenu) {
			if (first.getAttribute("style").contains("block") && first.getText().toLowerCase().contains("reembolso")) {
				result = true;
				first.findElement(By.partialLinkText("Alteração/Análise")).click();
				break;
			}
		}

		assertTrue(result);
	}

	@When("^informar um Beneficiário existente Alteracao$")
	public void informarUmBeneficiárioExistenteAlteracao() throws Throwable {
		// driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoAlteracao();
	}

	@When("^clicar fora do campo Alteracao$")
	public void clicarForaDoCampoAlteracao() throws Throwable {
		frame.clicar_fora("//*[@id=\"num_reembolso\"]");
	}

	@When("^clicar em Consultar Reembolsos do beneficiário Alteracao$")
	public void clicarEmConsultarReembolsosDoBeneficiárioAlteracao() throws Throwable {
		windowHandle = driver.getWindowHandle();
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		reembolsoR.ConsultaReembolsoBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		

	}

	@Then("^o sistema abre a tela de consulta de Reembolso Alteracao$")
	public void oSistemaAbreATelaDeConsultaDeReembolsoAlteracao() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoConsultaReembolsoAlteracao");
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);

	}

	@When("^clicar em Histórico de Procedimentos Alteracao$")
	public void clicarEmHistóricoDeProcedimentosAlteracao() throws Throwable {
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		windowHandle = driver.getWindowHandle();
		reembolsoR.HistoricoDeProcedimento();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		
		//reembolsoR.ValidarTelaHistoricoProcedimento();
	}

	@Then("^o sistema abre a tela de Histórico de Procedimentos Alteracao$")
	public void oSistemaAbreATelaDeHistóricoDeProcedimentosAlteracao() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoHistoricodeProcedimentos");
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
	}

	@When("^clicar em Dados beneficiário/Contratos Alteracao$")
	public void clicarEmDadosBeneficiárioContratosAlteracao() throws Throwable {
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		windowHandle = driver.getWindowHandle();
		Thread.sleep(2500);
		reembolsoR.DadosBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		//reembolsoR.ValidarTelaDadosBeneficiario();
	}

	@Then("^o sistema abre a tela de Dados beneficiário/Contratos Alteracao$")
	public void oSistemaAbreATelaDeDadosBeneficiárioContratosAlteracao() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoDadosBeneficiario");
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
	}

	@When("^clicar em Alertas Beneficiário Alteracao$")
	public void clicarEmAlertasBeneficiárioAlteracao() throws Throwable {
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		windowHandle = driver.getWindowHandle();
		reembolsoR.AlertasBeneficiario();
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
	//	reembolsoR.ValidarTelaAlertaBeneficiario();

	}

	@Then("^o sistema abre a tela de Alertas Beneficiário Alteracao$")
	public void oSistemaAbreATelaDeAlertasBeneficiárioAlteracao() throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoAlertaBeneficiario");
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
	}

	@When("^clicar em Contatos do Beneficiário Alteracao$")
	public void clicarEmContatosDoBeneficiárioAlteracao() throws Throwable {
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		reembolsoR.ContatoBeneficiario();

	}

	@Then("^o sistema abre a tela de Contatos do Beneficiário Alteracao$")
	public void oSistemaAbreATelaDeContatosDoBeneficiárioAlteracao() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoContatoBeneficiario");
	}

	@When("^informar um número de Reembolso existente com Status de Em Análise Alteracao$")
	public void informarUmNúmeroDeReembolsoExistenteComStatusDeEmAnáliseAlteracao() throws Throwable {
//		driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoAlteracao();
	}

	@When("^clicar no botão Continuar Alteracao$")
	public void clicarNoBotãoContinuarAlteracao() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		reembolsoR.ContinuarReembolso();
	}

	@When("^realizar um alteração nos dados Alteracao$")
	public void realizarUmAlteraçãoNosDadosAlteracao() throws Throwable {
//		Thread.sleep(10000);
//		driver.switchTo().alert().accept();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.AlteracaoReembolso();
		;
	}

	@When("^clicar no botão Análise/Alteração Alteracao$")
	public void clicarNoBotãoAnáliseAlteraçãoAlteracao() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		reembolsoR.AnaliseAlteracao();
	}

	@Then("^o sistema apresenta a mensagem Operação realizada com sucesso Alteracao$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucessoAlteracao() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		Thread.sleep(10000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoBotaoAnaliseAlteracao");
	}

	@When("^informar um número de Reembolso existente com Status de em Análise Alteracao Aprovacao$")
	public void informarUmNúmeroDeReembolsoExistenteComStatusDeEmAnáliseAlteracaoAprovacao() throws Throwable {
		// driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoAlteracao();

	}

	@When("^clicar no botão Submeter Alteracao$")
	public void clicarNoBotãoSubmeterAlteracao() throws Throwable {
//		Thread.sleep(10000);
//		driver.switchTo().alert().accept();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		reembolsoR.Submeter();
		System.out.println(driver.getWindowHandle());

	}

	@When("^Preencher dados Obrigatórios  Alteracao$")
	public void preencherDadosObrigatóriosAlteracao() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframemodal']");
		frame.framePaginaInicial("//*[@id='toolbarModal']");

	}

	@When("^Clicar no botão Aprovar Pedido Alteracao$")
	public void clicarNoBotãoAprovarPedidoAlteracao() throws Throwable {
		reembolsoR.AprovarPedido();
	}

	@Then("^o sistema apresenta a mensagem Operação realizada com sucesso Alteracao Aprovacao$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucessoAlteracaoAprovacao() throws Throwable {
		Thread.sleep(2000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoBotaoAnaliseAprovacao");
	}

	@When("^informar um número de Reembolso existente com Status de Aprovado Alteracao$")
	public void informarUmNúmeroDeReembolsoExistenteComStatusDeAprovadoAlteracao() throws Throwable {
		// driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoPagamento();
		frame.clicar_fora("//*[@id='num_reembolso']");
	}

	@Then("^O Sistema apresenta a mensagem Atenção: Pedido de reembolso nº já foi enviado para pagamento e não pode ser alterado Alteracao$")
	public void oSistemaApresentaAMensagemAtençãoPedidoDeReembolsoNºJáFoiEnviadoParaPagamentoENãoPodeSerAlteradoAlteracao()
			throws Throwable {
		Thread.sleep(2000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso",
				"9531AlteracaoBotaoAnaliseConsultaAprovacao");

	}

	@When("^informar um pedido de Reembolso Em Análise Alteracao$")
	public void informarUmPedidoDeReembolsoEmAnáliseAlteracao() throws Throwable {
		// driver.switchTo().alert().accept();
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoAlteracao();
	}

	@When("^clicar no botão Cancelar Alteracao$")
	public void clicarNoBotãoCancelarAlteracao() throws Throwable {
		reembolsoR.Cancelar();
	}

	@When("^informar um Motivo de cancelamento Alteracao$")
	public void informarUmMotivoDeCancelamentoAlteracao() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframemodal']");
		frame.framePaginaInicial("//*[@id='principal2']");
		Thread.sleep(2000);
		reembolsoR.MotivoCancelar();
	}

	@When("^clicar em Cancelar Alteracao$")
	public void clicarEmCancelarAlteracao() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframemodal']");
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		reembolsoR.CancelarPedido();

	}

	@Then("^o sistema apresenta mensagem de pedido cancelado Alteracao$")
	public void oSistemaApresentaMensagemDePedidoCanceladoAlteracao() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.ValidarCancelaPedido();
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoPedidoCancelado");

	}

	@When("^informar um pedido de Reembolso Em Análise Alteracao Glosar$")
	public void informarUmPedidoDeReembolsoEmAnáliseAlteracaoGlosar() throws Throwable {
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoGlosa();
	}

	@When("^Clicar no botão Continuar Alteracao Glosar$")
	public void clicarNoBotãoContinuarAlteracaoGlosar() throws Throwable {
		frame.mudarModalToolbarSISO();
		reembolsoR.ContinuarReembolso();
	}

	@When("^Selecionar um Procedimento Alteracao$")
	public void selecionarUmProcedimentoAlteracao() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.SelecionarProcedimento();

	}

	@When("^Clicar no Botão Glosar Procedimento Alteracao$")
	public void clicarNoBotãoGlosarProcedimentoAlteracao() throws Throwable {
		windowHandle = driver.getWindowHandle();
		reembolsoR.SelecionarGlosa();
	}

	@When("^Informar uma Glosa Alteracao$")
	public void informarUmaGlosaAlteracao() throws Throwable {
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.InformarGlosa();
	}

	@When("^Clicar no Botão Executar Alteracao$")
	public void clicarNoBotãoExecutarAlteracao() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		reembolsoR.ExecutarGlosa();

	}

	@When("^O sistema apresenta mensagem Confirma gravação das glosas manuais\\? Alteracao$")
	public void oSistemaApresentaMensagemConfirmaGravaçãoDasGlosasManuaisAlteracao() throws Throwable {

	}

	@When("^Clicar no botão OK Alteracao$")
	public void clicarNoBotãoOKAlteracao() throws Throwable {

	}

	@Then("^Glosa Inclusa com Sucesso em Procedimentos no campo Glosa Alteracao$")
	public void glosaInclusaComSucessoEmProcedimentosNoCampoGlosaAlteracao() throws Throwable {
		frame.trocarJanela(windowHandle);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoGlosa");
	}

	@When("^informar um pedido de Reembolso Em Análise Alteracao Aprovar$")
	public void informarUmPedidoDeReembolsoEmAnáliseAlteracaoAprovar() throws Throwable {
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoGlosa();
	}

	@When("^Clicar no botão Continuar Alteracao Aprovar$")
	public void clicarNoBotãoContinuarAlteracaoAprovar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		reembolsoR.ContinuarReembolso();
	}

	@When("^Clicar no Botão  Aprovar Procedimento Alteracao$")
	public void clicarNoBotãoAprovarProcedimentoAlteracao() throws Throwable {
		windowHandle = driver.getWindowHandle();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		reembolsoR.AprovarProcedimento();
	}

	@When("^Liberar Glosas Alteracao$")
	public void liberarGlosasAlteracao() throws Throwable {
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.LiberarGlosa();
	}

	@When("^Preencher campos Alteracao$")
	public void preencherCamposAlteracao() throws Throwable {

	}

	@When("^Clicar no Botão Executar Alteracao Aprovar$")
	public void clicarNoBotãoExecutarAlteracaoAprovar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		reembolsoR.ExecutarGlosa();
	}

	@When("^O sistema apresenta a mensagem Confirma as alterações realizadas\\? Alteracao$")
	public void oSistemaApresentaAMensagemConfirmaAsAlteraçõesRealizadasAlteracao() throws Throwable {
		driver.switchTo().alert().accept();
	}

	@When("^O sistema apresenta mensagem Liberação realizada com sucesso Alteracao$")
	public void oSistemaApresentaMensagemLiberaçãoRealizadaComSucessoAlteracao() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoLiberacaoComSucesso");
		frame.fecharJanela();
		frame.trocarJanela(windowHandle);
	}

	@When("^Clicar no Botão Colocar Reembolso na Situação Aguardando Documento  Alteracao$")
	public void clicarNoBotãoColocarReembolsoNaSituaçãoAguardandoDocumentoAlteracao() throws Throwable {
		windowHandle = driver.getWindowHandle();
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		reembolsoR.ReembolsoSituacaoDocumento();
	}

	@When("^O sistema apresenta a mensagem Deseja coloca o pedido de reembolso na situação 'Aguardando Documento\\? Alteracao$")
	public void oSistemaApresentaAMensagemDesejaColocaOPedidoDeReembolsoNaSituaçãoAguardandoDocumentoAlteracao()
			throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoAguardandoDocumento");

	}

	@When("^Clicar no Botão OK Alteracao Documento$")
	public void clicarNoBotãoOKAlteracaoDocumento() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		reembolsoR.ConfirmarAguardandoDocumento();

	}

	@Then("^O sistema apresenta a mensagem  Atenção: Pedido colocado na situação Aguardando Documento\\. Alteracao$")
	public void oSistemaApresentaAMensagemAtençãoPedidoColocadoNaSituaçãoAguardandoDocumentoAlteracao()
			throws Throwable {
		Thread.sleep(6000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoSituacaoAguardandoDocumento");

	}

	@When("^informar um pedido de Reembolso com Status de Aguardando Documento Alteracao$")
	public void informarUmPedidoDeReembolsoComStatusDeAguardandoDocumentoAlteracao() throws Throwable {
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
		frame.framePaginaInicial("//*[@id=\"principal2\"]");
		reembolsoR.ReembolsoGlosa();
	}

	@When("^Clicar no Botão Voltar Situação Alteracao$")
	public void clicarNoBotãoVoltarSituaçãoAlteracao() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		reembolsoR.VoltarSituacao();
	}

	@When("^O Sistema apresenta a mensagem Deseja voltar a situação do Reembolso para 'Em análise'\\? Alteracao$")
	public void oSistemaApresentaAMensagemDesejaVoltarASituaçãoDoReembolsoParaEmAnáliseAlteracao() throws Throwable {

	}

	@When("^Clicar no Botão Ok Alteracao Documento$")
	public void clicarNoBotãoOkAlteracaoDocumento() throws Throwable {
		driver.switchTo().alert().accept();
	}

	@Then("^O Sistema apresente a Mensagem Atenção: Situação do reembolso retornada com sucesso\\. Alteracao$")
	public void oSistemaApresenteAMensagemAtençãoSituaçãoDoReembolsoRetornadaComSucessoAlteracao() throws Throwable {
		Thread.sleep(6000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9531AlteracaoSituacaoRetornadaComSucesso");
	}

}
