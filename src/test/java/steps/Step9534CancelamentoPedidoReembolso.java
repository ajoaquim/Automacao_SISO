package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Ultils.UtilsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9534CancelamentoPedidoReembolso extends UtilsSteps {
	String windowHandle;
	
	@When("^optar por selecionar o menu Reembolso Odontológico,Cancelamento Pedido Reembolso$")
	public void optarPorSelecionarOMenuReembolsoOdontológicoCancelamentoPedidoReembolso() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menuReembolso.menuReembolsoOdontologicos();
		menuReembolso.acessarCancelamentoPedidoReembolso();
		frame.sairFrame();
	}

	@When("^informar um pedido existente$")
	public void informarUmPedidoExistente() throws Throwable {
		String numeroPedido = "762";
		menuReembolso.consultaPrestador(numeroPedido);
	}

	@When("^clicar fora do campo preenchido$")
	public void clicarForaDoCampo() throws Throwable {
		frame.clicar_fora("//*[@id='num_reembolso']");
	}

	@And("^clicar em Consultar Reembolsos do beneficiários$")
	public void clicarEmConsultaReembolsoDoBeneficiario() {
		WebElement element = driver.findElement(By.cssSelector("tr:nth-child(4) #imgAutorizacaoPrevia"));
		element.click();
	}

	@Then("^o sistema abre a tela de consulta de Reembolsos$")
	public void abrirTelaConsultaReembolsos() {
		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(1));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement elemento = driver.findElement(By.linkText("Critérios"));
		assertTrue(elemento.isDisplayed());
	}

	@When("^clicar em Histórico de Procedimento$")
	public void clicarEmHistóricoDeProcedimentos() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.ConsultaHistoricoProcedimento();
	}

	@Then("^o sistema abre a tela de Histórico de Procedimento$")
	public void oSistemaAbreATelaDeHistóricoDeProcedimentos() throws Throwable {
		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(1));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		menuReembolso.validarTelaHistoricoProcedimento();
	}

	@When("^clicar em Dados beneficiário/Contrato$")
	public void clicarEmDadosBeneficiárioContratos() throws Throwable {
		Thread.sleep(2000);
		windowHandle = driver.getWindowHandle();
		menuReembolso.ConsultaPesquisaDadosBeneficiarioContrato();
	}

	@Then("^o sistema abre a tela de Dados beneficiário/Contrato$")
	public void oSistemaAbreATelaDeDados() throws Throwable {
		sleep(2000);
		menuReembolso.validarTelaPesquisaPorBeneficiarioContratos();
	}

	@When("^clicar em Alerta Beneficiários$")
	public void clicarEmAlertasBeneficiário() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.alertasBeneficiario();
	}

	@Then("^o sistema abre a tela de Alertas Beneficiários$")
	public void oSistemaAbreATelaDeAlertasBeneficiário() throws Throwable {
		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(1));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		menuReembolso.validarTelaAlertaBeneficiario();
	}

	@When("^clicar em Contatos do Beneficiários$")
	public void clicarEmContatosDoBeneficiário() throws Throwable {
		windowHandle = driver.getWindowHandle();
		menuReembolso.pesquisarContato();
	}

	@Then("^o sistema abre a tela de Contatos do Beneficiários$")
	public void oSistemaAbreATelaDeContatosDoBeneficiário() throws Throwable {
		ArrayList<String> x = new ArrayList<String>();
		x.addAll(driver.getWindowHandles());
		driver.switchTo().window(x.get(1));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		menuReembolso.validarTelaContato();
	}

	// E
	@When("^informar um  Reembolso Em Análise$")
	public void informarUmReembolsoEmAnálise() throws Throwable {
		String reembolsoAnalise = "852";
		menuReembolso.consultaReembolsoAnalise(reembolsoAnalise);
	}

	@When("^clicar no Botão Continuar$")
	public void clicarNoBotãoContinuar() throws Throwable {
		String botao = "Pesquisa_Pedido";
		menuReembolso.clicarBotaoID(botao);
	}

	@When("^clicar no botão de cancelar$")
	public void clicarNoBotãoCancelar() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	    
		WebElement element = driver.findElement(By.cssSelector("#btn_ExecutarAcao\\(\\\"CA\\\"\\)\\; > .barimg:nth-child(1)"));
		element.click();
	}

	@When("^o sitema apresenta Tela de Cancelamento Pedido Reembolso$")
	public void oSitemaApresentaTelaDeCancelamentoPedidoReembolso() throws Throwable {
		Thread.sleep(3000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso",
				"9534 Validar Cancelamento de Pedido de Reembolso com Status de Em Análise Tela de Cancelamento Pedido Reembolso");
	}

	@When("^clicar no botão Cancelar Pedido$")
	public void clicarNoBotãoCancelarPedido() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id=\"iframemodal\"]");
		frame.framePaginaInicial("//*[@id=\"toolbarModal\"]");
		menuReembolso.CancelarPedido();
	}

	@Then("^o sistema apresenta a mensagem Cancelamento realizado$")
	public void oSistemaApresentaAMensagemCancelamentoRealizado() throws Throwable {
		Thread.sleep(3000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso",
				"9534 Validar Cancelamento de Pedido de Reembolso com Status de Em Análise Sucesso");
	}

	@When("^informar um  Reembolso Aguardando Documento$")
	public void informarUmReembolsoAguardandoDocumento() throws Throwable {
		String reembolsoAguardandoDocumento = "771";
		menuReembolso.pesquisarReembolso(reembolsoAguardandoDocumento);
	}

	@When("^informar um  Reembolso Cancelado$")
	public void informarUmReembolsoCancelado() throws Throwable {
		String reembolsoCancelado = "731";
		menuReembolso.pesquisarReembolso(reembolsoCancelado);
	}

	@When("^informar um  Reembolso enviado para pagamento$")
	public void informarUmReembolsoEnviadoParaPagamento() throws Throwable {
		String reembolsoEnviadoParaPagamento = "835";
		menuReembolso.pesquisarReembolso(reembolsoEnviadoParaPagamento);
	}

	@When("^informar um  Reembolso com status Pagamento Realizado$")
	public void informarUmReembolsoPagamentoRealizado() throws Throwable {
		String reembolsoPagamentoRealizado = "x";
		menuReembolso.pesquisarReembolso(reembolsoPagamentoRealizado);
	}

	@When("^informar um  Reembolso com status Negado$")
	public void informarUmReembolsoStatusNegado() throws Throwable {
		String reembolsoNegado = "850";
		menuReembolso.pesquisarReembolso(reembolsoNegado);
	}

	@Then("^o sistema apresenta a mensagem Pedido não pode ser cancelado pois está na situação Cancelado$")
	public void sistemaExibeMensagemPedidoNaoPodeSerCanceladoDevidoSituacaoCancelado() throws InterruptedException {
		sleep(600);
		WebElement element = driver.findElement(By.xpath(("/html/body/div[2]/span[3]")));
		element.click();

		String value = element.getText().toString();
		System.out.println(value);

		assertEquals("Pedido não pode ser cancelado pois está na situação Cancelado", value);

		Thread.sleep(6000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso",
				"9534Validar Cancelamento de Pedido de Reembolso com Status de Cancelado");
	}

	@Then("^o sistema apresenta a mensagem Pedido não pode ser cancelado pois está na situação Enviado para Pagamento$")
	public void sistemaExibeMensagemPedidoNaoPodeSerCanceladoDevidoEnviadoParaPagamento() throws InterruptedException {
		sleep(300);
		WebElement element = driver.findElement(By.xpath(("/html/body/div[2]/span[3]")));

		element.click();

		String value = element.getText().toString();
		System.out.println(value);

		assertEquals("Pedido não pode ser cancelado pois está na situação Enviado para Pagamento", value);

		Thread.sleep(6000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso",
				"9534Validar Cancelamento de Pedido de Reembolso com Status de Enviado para Pagamento");
	}

	@Then("^o sistema apresenta a mensagem Pedido não pode ser cancelado pois está na situação Pagamento Realizado$")
	public void sistemaExibeMensagemPedidoNaoPodeSerCanceladoDevidoASituacaoPagamentoRealizado()
			throws InterruptedException {
		sleep(300);
		WebElement element = driver.findElement(By.xpath(("/html/body/div[2]/span[3]")));
		element.click();

		String value = element.getText().toString();
		System.out.println(value);

		assertEquals("Pedido não pode ser cancelado pois está na situação Pagamento Realizado", value);

		Thread.sleep(6000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso",
				"9534Validar Cancelamento de Pedido de Reembolso com Status de Pagamento Realizado");
	}

	@Then("^o sistema apresenta a mensagem Pedido não pode ser cancelado pois está na situação Negado$")
	public void sistemaExibeMensagemPedidoNaoPodeSerCanceladoDevidoASituacaoNegado() throws InterruptedException {
		sleep(300);
		WebElement element = driver.findElement(By.xpath(("/html/body/div[2]/span[3]")));
		element.click();

		String value = element.getText().toString();
		System.out.println(value);

		assertEquals("Pedido não pode ser cancelado pois está na situação Negado", value);

		Thread.sleep(6000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso",
				"9534Validar Cancelamento de Pedido de Reembolso com Status de Negado");
	}

	
	@When("^Preencher campos obrigatórios no pedido com status em analise$")
	public void preencherCamposObrigatóriosNoPedidoComStatusEmAnalise() throws Throwable {
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(5);
		driver.switchTo().frame(1);
		
		menuReembolso.preencherCamposObrigatoriosCancelamentoAnalise();
	}
	
	@When("^Preencher campos obrigatórios no pedido com status de aguardando documento$")
	public void preencherCamposObrigatóriosNoPedidoComStatusAguardaDoc() throws Throwable {
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(5);
		driver.switchTo().frame(1);
		
		menuReembolso.preencherCamposObrigatoriosCancelamentoAguarDoc();
	}
}
