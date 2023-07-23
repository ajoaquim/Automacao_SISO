package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ultils.UtilsSteps;
import br.com.portoseguro.data.textreader.TextReader;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9236AjusteRevisaoPorRemessa extends UtilsSteps {

	private WebDriverWait wait;
	private String janelaAtual;
	private String numPedido;
	private boolean userIndra = true;
	private String oldInfo;

	void mudar(String target) {
		frame.sairFrame();
		try {
			frame.frame("iframeasp");
			frame.frame(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void mudarPrincipal() {
		mudar("principal2");
		try {
			aguarde();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void mudarToolbar() {
		mudar("toolbarMvcToAsp");
	}

	private void mudarModalToolbar() throws Exception {
		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("toolbarModal");
	}

	private void mudarModalPrincipal() throws Exception {
		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("principal2");
	}

	private void aguarde() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("//*[@id=\"dvAguarde\"]/div/div")));
	}

	@When("^selecionar rr o menu Conta Odontológica,Análise Remessa por Referência$")
	public void selecionarRrOMenuContaOdontológicaAnáliseRemessaPorReferência() throws Throwable {
		initiate();
		wait = new WebDriverWait(driver, 10);
		frame.sairFrame();

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.sendKeys("Análise Remessa por Referência");
		driver.findElement(By.id("btn-filtro-menu")).click();
		driver.findElement(By.partialLinkText("Análise Remessa por Referência")).click();

		mudarPrincipal();
	}

	@Given("^que tenha uma remessa já gerada com outro usuário$")
	public void queTenhaUmaRemessaJáGeradaComOutroUsuário() throws Throwable {
		userIndra = false;
	}

	@When("^selecionar rr Atualizar rr$")
	public void selecionarRrAtualizarRr() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_Atualizar();")).click();
	}

	@When("^selecionar rr a remessa desejada rr$")
	public void selecionarRrARemessaDesejadaRr() throws Throwable {
		mudarPrincipal();
		WebElement tabelaRemessa = driver.findElement(By.id("grid_remessas"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("//tr[@class='ui-widget-content jqgrow ui-row-ltr']"));

		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			System.out.println(linha.getText());
			String assumidoPor = linha.getText();

			if (userIndra) {
				campos.get(0).click();
				break;
			} else if (!assumidoPor.contains("INDRA2") && !userIndra) {
				campos.get(0).click();
				break;
			}
		}

		mudarToolbar();
		driver.findElement(By.id("btn_acao_continuar")).click();
	}

	@When("^selecionar rr Desbloquear$")
	public void selecionarRrDesbloquear() throws Throwable {
		try {
			mudarPrincipal();
			mudarToolbar();
			driver.findElement(By.id("btn_AcaoDesbloquearRemessa();")).click();
			frame.alertaObterConfirmar();
		} catch (Exception e) {
		}
	}

	@When("^selecionar rr assumir$")
	public void selecionarRrAssumir() throws Throwable {
		try {
			mudarToolbar();
			driver.findElement(By.id("btn_AcaoAssumirRemessaBotao();")).click();
			frame.alertaObterConfirmar();
		} catch (Exception e) {
			try {
				driver.findElement(By.id("btn_acao_voltar_situacao();")).click();
				frame.alertaObterConfirmar();
			} catch (Exception ex) {

			}
		}
	}

	@Then("^a remessa fica assumida para o usuário logado$")
	public void aRemessaFicaAssumidaParaOUsuárioLogado() throws Throwable {
		mudarPrincipal();
		String remessaAssumida = driver.findElement(By.id("txt_msg")).getText();
		assertEquals("Remessa Assumida", remessaAssumida);
	}

	@When("^selecionar rr a guia \\(Protocoloada/processada\\)$")
	public void selecionarRrAGuiaProtocoloadaProcessada() throws Throwable {
		mudarPrincipal();
		List<WebElement> guias = driver.findElements(By.name("check_grid"));
		if (!guias.get(0).isSelected()) {
			guias.get(0).click();
		}
	}

	@When("^selecionar rr Excluir$")
	public void selecionarRrExcluir() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_acao_tela(\"E\");")).click();
		frame.alertaObterConfirmar();

	}

	@Then("^a guia é excluída da remessa rr$")
	public void aGuiaEexcuidaDaRemessaRr() throws Throwable {
		mudarPrincipal();
		String remessaAssumida = driver.findElement(By.id("txt_msg")).getText();
		assertEquals("Conta excluida", remessaAssumida);
	}

	@When("^selecionar rr Ocorrências da Remessa$")
	public void selecionarRrOcorrênciasDaRemessa() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_AbreOcorrenciasRemessa();")).click();
	}

	@When("^o sistema apresenta um pop-up com ocorrências$")
	public void oSistemaApresentaUmPopUpComOcorrências() throws Throwable {
		janelaAtual = driver.getWindowHandle();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
			System.out.println("Erro 404");
		}

		driver.close();
		frame.trocarJanela(janelaAtual);
	}

	@When("^selecinar Próxima rr$")
	public void selecinarPróxima() throws Throwable {
		mudarPrincipal();
		oldInfo = driver.findElement(By.name("num_grd")).getAttribute("value");
		mudarToolbar();
		driver.findElement(By.id("btn_acao_continuar();")).click();

	}

	@When("^o sistema passa para a remessa seguinte da fila$")
	public void oSistemaPassaParaARemessaSeguinteDaFila() throws Throwable {
		mudarPrincipal();
		assertNotEquals(oldInfo, driver.findElement(By.name("num_grd")).getAttribute("value"));
		oldInfo = driver.findElement(By.name("num_grd")).getAttribute("value");
	}

	@When("^selecinar Anterior$")
	public void selecinarAnterior() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_acao_voltar_remessa();")).click();
	}

	@When("^o sistema volta para a remessa anterior da fila$")
	public void oSistemaVoltaParaARemessaAnteriorDaFila() throws Throwable {
		oSistemaPassaParaARemessaSeguinteDaFila();
	}

	@When("^selecionar rr fechar$")
	public void selecionarRrFechar() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_acao_voltar(\"S\");")).click();
	}

	@When("^selecionar rr a guia desejada$")
	public void selecionarRrAGuiaDesejada() throws Throwable {
		mudarPrincipal();
		List<WebElement> guias = driver.findElements(By.name("check_grid"));
		if (!guias.get(0).isSelected()) {
			guias.get(0).click();
		}
	}

	@When("^selecionar rr Alterar$")
	public void selecionarRrAlterar() throws Throwable {
		mudarToolbar();
		try {
			driver.findElement(By.id("btn_acao_tela(\"A\");")).click();
		} catch (Exception e) {
			driver.findElement(By.id("btn_acao_tela(\"C\");")).click();
			selecionarRrAssumir();
		}
	}

	@When("^validar dados da seção Encaminhamento$")
	public void validarDadosDaSeçãoEncaminhamento() throws Throwable {
		mudarPrincipal();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Encaminhamento")));
	}

	@When("^validar dados da seção Informações$")
	public void validarDadosDaSeçãoInformações() throws Throwable {

		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Informações"))).click();
	}

	@When("^incluir um procedimento em Inclusão procedimento$")
	public void incluirUmProcedimentoEmInclusãoProcedimento() throws Throwable {
		List<WebElement> procedimentos = driver.findElement(By.id("tdProcedimento"))
				.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement proced : procedimentos) {
			if (proced.getAttribute("name").contains("ind_selecionado_")) {
				proced.sendKeys(Keys.SPACE);
//				proced.click();
				break;
			}
		}
	}

	@When("^validar se o novo procedimento consta em Procedimentos$")
	public void validarSeONovoProcedimentoConstaEmProcedimentos() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_acao_analise_glosa();")).click();

		try {
			janelaAtual = driver.getWindowHandle();

			Iterator<String> janelas = driver.getWindowHandles().iterator();
			while (janelas.hasNext()) {
				frame.trocarJanela(janelas.next());
			}

			frame.sairFrame();
			frame.frame("principal2");
			driver.findElement(By.id("ind_marcar_todos_glosa")).click();

			frame.sairFrame();
			frame.frame("toolbarModal");
			driver.findElement(By.id("btn_acao_executar();")).click();

			try {

				frame.alertaObterConfirmar();
			} catch (Exception e) {
			}

			aguarde();

			frame.sairFrame();
			frame.frame("principal2");
			String expected = "Operação realizada com sucesso".toLowerCase();
			String actual = driver.findElement(By.id("txt_msg")).getText().toLowerCase();
			assertEquals(expected, actual);

			frame.sairFrame();
			frame.frame("toolbarModal");
			driver.findElement(By.id("btn_acao_voltar")).click();

			frame.trocarJanela(janelaAtual);
		} catch (Exception e) {
//			frame.alertaObterConfirmar();
		}
	}

	@When("^incluir uma Observação$")
	public void incluirUmaObservação() throws Throwable {
		mudarPrincipal();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Observações"))).click();

		driver.findElement(By.id("txt_obs_operadora"))
				.sendKeys(String.format("Observação Automatizada %s", Calendar.getInstance().getTime().toString()));
		driver.findElement(By.id("txt_obs_emissao"))
				.sendKeys(String.format("Observação Automatizada %s", Calendar.getInstance().getTime().toString()));

	}

	@When("^incluir um Anexo$")
	public void incluirUmAnexo() throws Throwable {

	}

	@When("^validar as últimas Ocorrências realizadas$")
	public void validarAsÚltimasOcorrênciasRealizadas() throws Throwable {
		mudarPrincipal();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Ocorrências"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dvComboGridOcorrencia")));
	}

	@Then("^o sistema permite Submeter a remessa com sucesso$")
	public void oSistemaPermiteSubmeterARemessaComSucesso() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_acao_analisar();")).click();
		mudarPrincipal();
		mudarToolbar();
		driver.findElement(By.id("btn_acao_submeter();")).click();
		mudarPrincipal();
	}

	@When("^selecionar rr uma guia Processada c/ glosa$")
	public void selecionarRrUmaGuiaProcessadaCGlosa() throws Throwable {
		selecionarGuia("Processada c/ glosa");
	}

	public void selecionarGuia(String guia) throws Throwable {
		mudarToolbar();

		List<WebElement> botoesSuperiores = driver.findElements(By.className("coolButton"));

		System.out.println("Lista de Botões");

		for (WebElement botao : botoesSuperiores) {
			System.out.printf("Botão: %s\n", botao.getAttribute("title"));
		}

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_acao_voltar(\"S\");"))).click();
		mudarPrincipal();
		driver.findElement(By.xpath("//ul[@class='select2-choices']")).click();
		driver.findElement(By.xpath("//li[contains(., '" + guia + "')]")).click();
		selecionarRrAtualizarRr();
		mudarPrincipal();
		WebElement tabelaRemessa = driver.findElement(By.id("grid_remessas"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("//tr[@class='ui-widget-content jqgrow ui-row-ltr']"));

		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			System.out.println(linha.getText());
			String assumidoPor = linha.getText();

			if (assumidoPor.contains(guia)) {
				campos.get(0).click();
				break;
			}
		}

		mudarToolbar();
		driver.findElement(By.id("btn_acao_continuar")).click();
	}

	@When("^selecinar o procedimento$")
	public void selecinarOProcedimento() throws Throwable {
		mudarPrincipal();
		try {
			mudarToolbar();
			driver.findElement(By.id("btn_acao_voltar_situacao();")).click();
			frame.alertaObterConfirmar();
		} catch (Exception e) {
			mudarPrincipal();
		}
		incluirUmProcedimentoEmInclusãoProcedimento();
	}

	@When("^selecionar rr Análise de Procedimentos$")
	public void selecionarRrAnáliseDeProcedimentos() throws Throwable {
		validarSeONovoProcedimentoConstaEmProcedimentos();
	}

	@When("^liberar a glosa$")
	public void liberarAGlosa() throws Throwable {
	}

	@When("^selecionar rr Executar$")
	public void selecionarRrExecutar() throws Throwable {
	}

	@Then("^o sistema permite Submeter a guia e a mesma fica com o status análisado$")
	public void oSistemaPermiteSubmeterAGuiaEAMesmaFicaComOStatusAnálisado() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_acao_submeter();")).click();
		mudarPrincipal();
		try {
			validaMensagem("Analise");
		} catch (Exception e) {
		}
	}

	@When("^selecionar rr uma guia Análisada$")
	public void selecionarRrUmaGuiaAnálisada() throws Throwable {
		selecionarGuia("Analisada OK");
	}

	@When("^selecionar rr Voltar situação$")
	public void selecionarRrVoltarSituação() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_acao_voltar_situacao();")).click();
		try {
			frame.alertaObterConfirmar();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("^o status da guia volta para Processada$")
	public void oStatusDaGuiaVoltaParaProcessada() throws Throwable {
		mudarPrincipal();
		String situacao = driver.findElement(By.id("nome_situacao_conta")).getAttribute("value");
		assertTrue(situacao.contains("Processada"));
	}

	@When("^selecionar rr um Procedimento$")
	public void selecionarRrUmProcedimento() throws Throwable {
		mudarPrincipal();
		List<WebElement> procedimentos = driver.findElement(By.id("tdProcedimento"))
				.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement proced : procedimentos) {
			if (proced.getAttribute("name").contains("ind_selecionado_")) {
				proced.sendKeys(Keys.SPACE);
//				proced.click();
				break;
			}
		}
	}

	@When("^selecionar rr Reprocessar$")
	public void selecionarRrReprocessar() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_Reprocessar();")).click();
		frame.alertaObterConfirmar();
	}

	@Then("^o procedimento Reprocessado fica editável para alteração$")
	public void oProcedimentoReprocessadoFicaEditávelParaAlteração() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^selecionar rr uma guia$")
	public void selecionarRrUmaGuia() throws Throwable {
		// check_grid
	}

	@When("^selecionar rr Desvincular Procedimentos$")
	public void selecionarRrDesvincularProcedimentos() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_acao_desvincular_item();")).click();
		frame.alertaObterConfirmar();
	}

	@Then("^o procedimento não fica mais visível na tela análise da conta$")
	public void oProcedimentoNãoFicaMaisVisívelNaTelaAnáliseDaConta() throws Throwable {
		mudarPrincipal();
	}

	@Given("^que tenha uma remessa já gerada com o recurso de glosa já gerado$")
	public void queTenhaUmaRemessaJáGeradaComORecursoDeGlosaJáGerado() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^na coluna Crédito informar o valor a ser creditado$")
	public void naColunaCréditoInformarOValorASerCreditado() throws Throwable {
		mudarPrincipal();
		try {

			driver.findElement(By.id("val_aprovado_1"));
		} catch (Exception e) {
		}
	}

	@Then("^é possível finalizar a remessa com sucesso$")
	public void éPossívelFinalizarARemessaComSucesso() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_acao_avancar();")).click();
		frame.alertaObterConfirmar();
	}

	@When("^inseiri uma glosa para debitar o valor$")
	public void inseiriUmaGlosaParaDebitarOValor() throws Throwable {
		Thread.sleep(5000);
		éPossívelFinalizarARemessaComSucesso();
	}

	@When("^realizar o filtro para busca da remessa rr$")
	public void realizarOFiltroParaBuscaDaRemessaRr() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
	}

	@Given("^que tenha uma remessa já gerada rr$")
	public void queTenhaUmaRemessaJáGeradaRr() throws Throwable {
		userIndra = true;
		selecionarRrAtualizarRr();
	}

	public void validaMensagem(String mensagem) {
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".alert-info")));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println(element.getText());
		String sucess = element.getText();
		assertTrue(element.getText().toLowerCase().contains(mensagem.toLowerCase()));
		driver.findElement(By.className("close")).click();
		if (mensagem.contains("incluido")) {
			TextReader.saveText("PedidoAprodado", sucess.replace("×", ""));
		}
	}

	@Given("^que tenha uma remessa já gerada rr com o recurso de glosa já gerado$")
	public void queTenhaUmaRemessaJáGeradaRrComORecursoDeGlosaJáGerado() throws Throwable {

		String guia = "Analisada OK";
		guia = "Analisada c/ glosa";
		mudarPrincipal();
		driver.findElement(By.xpath("//ul[@class='select2-choices']")).click();
		driver.findElement(By.xpath("//li[contains(., '" + guia + "')]")).click();
		selecionarRrAtualizarRr();

//		mudarPrincipal();
//		driver.findElement(By.xpath("//ul[@class='select2-choices']")).sendKeys(guia);
//		driver.findElement(By.xpath("//li[contains(., '" + guia + "')]")).click();
//		selecionarRrAtualizarRr();

		mudarPrincipal();
		WebElement tabelaRemessa = driver.findElement(By.id("grid_remessas"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("//tr[@class='ui-widget-content jqgrow ui-row-ltr']"));

		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			System.out.println(linha.getText());
			String assumidoPor = linha.getText();

			if (assumidoPor.contains("Analisada")) {
				campos.get(0).click();
				break;
			}
		}

		mudarToolbar();
		driver.findElement(By.id("btn_acao_continuar")).click();
	}

}
