package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1229SituacaoDosPedidos extends UtilsSteps {

	private WebDriverWait wait;
	private String situacaoPedido;
	private String numPedido;
	private String janelaAtual;

	@Given("^acesse a aba Autorização/Pedido de Autorização/Situação dos Pedidos$")
	public void acesseAAbaAutorizaçãoPedidoDeAutorizaçãoSituaçãoDosPedidos() throws Throwable {
		initiate();
		wait = new WebDriverWait(driver, 10);
		frame.sairFrame();

		acessaRevalidacao("Situação dos Pedidos");
	}

	@When("^selecionar Situação dos Pedidos \"([^\"]*)\"$")
	public void selecionarSituaçãoDosPedidos(String arg1) throws Throwable {
		situacaoPedido = arg1;
		mudarPrincipal();

		List<WebElement> situacoes = driver.findElements(By.id("cod_situacao"));
		for (WebElement webElement : situacoes) {
			if (webElement.getAttribute("name").toLowerCase().contains(situacaoPedido.toLowerCase())) {
				webElement.click();
				break;
			}
		}
	}

	@When("^clicar no botão Continuar da situacao dos pedidos$")
	public void clicarNoBotãoContinuarDaSituacaoDosPedidos() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_acao_continuar")).click();

	}

	@Then("^o sistema irá exibir o resultado da consulta$")
	public void oSistemaIráExibirOResultadoDaConsulta() throws Throwable {
		mudarPrincipal();
		WebElement tablePedidos = driver.findElement(By.id("tbGrid"));
		wait.until(ExpectedConditions.visibilityOf(tablePedidos));
		String xpathExpression = "//td[contains(., '%s')]";
		List<WebElement> resultado = tablePedidos
				.findElements(By.xpath(String.format(xpathExpression, situacaoPedido)));

		for (WebElement webElement : resultado) {
			if (!webElement.getText().isEmpty()) {
				assertEquals(situacaoPedido.toLowerCase().trim(), webElement.getText().toLowerCase().trim());
			}
		}

	}

	@Given("^que filtrei a situação por em análise$")
	public void queFiltreiASituaçãoPorEmAnálise() throws Throwable {
		selecionarSituaçãoDosPedidos("em análise");
		clicarNoBotãoContinuarDaSituacaoDosPedidos();
	}

	@When("^clicar o botão Anexo$")
	public void clicarOBotãoAnexo() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new NullPointerException();
	}

	@Then("^o sistema apresenta a tela para anexar um documento\\.$")
	public void oSistemaApresentaATelaParaAnexarUmDocumento() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new NullPointerException();
	}

	@When("^clicar o botão Desbloquear Pedido$")
	public void clicarOBotãoDesbloquearPedido() throws Throwable {
		mudarPrincipal();
		clicarBotaoSituacao("fa-lock");
	}

	@When("^clicar em Desbloquear$")
	public void clicarEmDesbloquear() throws Throwable {
		mudarPrincipal();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnDesbloqAssumir")));
		driver.findElement(By.id("btnDesbloqAssumir")).click();
	}

	@Then("^o sistema apresenta a tela de alteração\\.$")
	public void oSistemaApresentaATelaDeAlteração() throws Throwable {
		mudarToolbar();
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_LiberarGlosas();")));
		} catch (Exception e) {
			// TODO: handle exception
		}

		mudarPrincipal();
		String lowerCase = driver.findElement(By.className("subtitulos")).getText().toLowerCase().trim();
		assertEquals("alteração pedido", lowerCase);
	}

	@When("^clicar o botão Alteração$")
	public void clicarOBotãoAlteração() throws Throwable {
		mudarPrincipal();
		clicarBotaoSituacao("fa-pencil-square-o");
	}

	@Then("^o sistema apresenta a tela de Alteração$")
	public void oSistemaApresentaATelaDeAlteração2() throws Throwable {
		oSistemaApresentaATelaDeAlteração();
	}

	@When("^clicar o botão Cancelamento$")
	public void clicarOBotãoCancelamento() throws Throwable {
		mudarPrincipal();
		clicarBotaoSituacao("fa-times-circle");
	}

	private void clicarBotaoSituacao(String botao) {
		WebElement tbGrid = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tbGrid")));
		wait.until(ExpectedConditions.visibilityOf(tbGrid));
		List<WebElement> bloqueados = driver.findElements(By.className(botao));

		assertTrue(!bloqueados.isEmpty());

		List<WebElement> options = new ArrayList<WebElement>();
		for (WebElement webElement : bloqueados) {
			if (webElement.isEnabled() && !webElement.getAttribute("style").contains("color: rgb(189, 189, 189)")) {
				options.add(webElement);
			}
		}

		assertTrue(!options.isEmpty());

		options.get(new Random().nextInt(options.size())).click();
	}

	@When("^preencher os dados de cancelamento$")
	public void preencherOsDadosDeCancelamento() throws Throwable {
		mudarPrincipal();
		numPedido = driver.findElement(By.id("num_pedido_canc")).getAttribute("value");
		if (numPedido.isEmpty()) {
			numPedido = driver.findElement(By.id("num_pedido_canc")).getText();
		}
		driver.findElement(By.id("data_cancelamento")).click();
		driver.findElement(By.className("today")).click();

		WebElement options = driver.findElement(By.id("cod_motivo_canc"));
		Select motivo = new Select(options);
		motivo.selectByIndex(motivo.getOptions().size() - 1);

		WebElement optObs = driver.findElement(By.id("cod_tipo_obs_canc"));
		Select obs = new Select(optObs);
		obs.selectByIndex(obs.getOptions().size() - 1);

		driver.findElement(By.id("txt_obs_operadora_canc"))
				.sendKeys(String.format("Observação Automatizada - %s", Calendar.getInstance().getTime().toString()));
	}

	@When("^clicar no botão Confirmar$")
	public void clicarNoBotãoConfirmar() throws Throwable {
		try {
			driver.findElement(By.id("btnConfirmarCancelamento")).click();
		} catch (Exception e) {
		}
	}

	@Then("^o sisteme volta para a tela de pesquisa$")
	public void oSistemeVoltaParaATelaDePesquisa() throws Throwable {
		mudarPrincipal();
		String lowerCase = driver.findElement(By.className("subtitulos")).getText().toLowerCase().trim();
		List<WebElement> tdExcluido = driver
				.findElements(By.xpath(String.format("//td[contains(., '%s')]", numPedido)));
		for (WebElement tds : tdExcluido) {
			assertTrue(!numPedido.contains(tds.getText()));
		}

		assertEquals("situação pedidos", lowerCase);

	}

	@When("^clicar o botão Histórico$")
	public void clicarOBotãoHistórico() throws Throwable {
		mudarPrincipal();
		clicarBotaoSituacao("fa-list-alt");
	}

	@Then("^o sistema apresenta a tela de Histórico\\.$")
	public void oSistemaApresentaATelaDeHistórico() throws Throwable {
		janelaAtual = driver.getWindowHandle();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		String lowerCase = driver.findElement(By.className("subtitulos")).getText().toLowerCase().trim();
		assertEquals("histórico pedido", lowerCase);

		driver.close();

		frame.trocarJanela(janelaAtual);
	}

	@Given("^que filtrei a situação por Autorizado$")
	public void queFiltreiASituaçãoPorAutorizado() throws Throwable {
		selecionarSituaçãoDosPedidos("Autorizado");
		clicarNoBotãoContinuarDaSituacaoDosPedidos();
	}

	@Then("^o sistema volta para a tela de pesquisa$")
	public void oSistemaVoltaParaATelaDePesquisa() throws Throwable {
		System.out.println(numPedido);
		mudarPrincipal();
		String lowerCase = driver.findElement(By.className("subtitulos")).getText().toLowerCase().trim();
		assertEquals("situação pedidos", lowerCase);
	}

	@When("^clicar o botão Revalidação$")
	public void clicarOBotãoRevalidação() throws Throwable {
		mudarPrincipal();
		clicarBotaoSituacao("fa-clock-o");
	}

	@When("^preencher os dados de revalidação$")
	public void preencherOsDadosDeRevalidação() throws Throwable {
		mudarPrincipal();
		WebElement optObs = driver.findElement(By.id("cod_tipo_obs_rev"));

		Select obs = new Select(optObs);
		obs.selectByIndex(obs.getOptions().size() - 1);

		driver.findElement(By.id("txt_obs_operadora_rev"))
				.sendKeys(String.format("Observação Automatizada - %s", Calendar.getInstance().getTime().toString()));

		driver.findElement(By.id("txt_obs_emissao_rev"))
				.sendKeys(String.format("Observação Automatizada - %s", Calendar.getInstance().getTime().toString()));

		driver.findElement(By.id("btnConfirmarRevalidacao")).click();
	}

	@When("^clicar o botão Imprimir Guia$")
	public void clicarOBotãoImprimirGuia() throws Throwable {
		mudarPrincipal();
		clicarBotaoSituacao("fa-print-alt");
	}

	@Then("^o sistema apresenta a tela de Impressão\\.$")
	public void oSistemaApresentaATelaDeImpressão() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new NullPointerException();
	}

	@Given("^que filtrei a situação por Cancelado$")
	public void queFiltreiASituaçãoPorCancelado() throws Throwable {
		selecionarSituaçãoDosPedidos("cancelado");
		clicarNoBotãoContinuarDaSituacaoDosPedidos();
	}

	@Given("^que filtrei a situação por Para Análise$")
	public void queFiltreiASituaçãoPorParaAnálise() throws Throwable {
		selecionarSituaçãoDosPedidos("pedido para análise");
		selecionarSituaçãoDosPedidos("em análise");
		clicarNoBotãoContinuarDaSituacaoDosPedidos();
	}

	public void validaMensagem(String mensagem) {
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".alert-info")));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println(element.getText());
		assertTrue(element.getText().toLowerCase().contains(mensagem.toLowerCase()));
		driver.findElement(By.className("close")).click();
	}

	public void acessaRevalidacao(String valor) {

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.sendKeys(valor);
		driver.findElement(By.id("btn-filtro-menu")).click();
		driver.findElement(By.partialLinkText(valor)).click();
	}

	public void mudarPrincipal() throws Exception {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
	}

	public void mudarToolbar() throws Exception {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("toolbarMvcToAsp");
	}
}
