package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ultils.UtilsSteps;
import br.com.portoseguro.data.textreader.TextReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1242AlteracaoAnalise extends UtilsSteps {

	private WebDriverWait wait;
	private String janelaAtual;
	private String numPedido;

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

	@Given("^acesse a aba Autorização->Pedido de Autorização-> Alteração/Análise$")
	public void acesseAAbaAutorizaçãoPedidoDeAutorizaçãoAlteraçãoAnálise() throws Throwable {
		initiate();
		wait = new WebDriverWait(driver, 10);
		frame.sairFrame();

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.sendKeys("Alteração/Análise");
		driver.findElement(By.id("btn-filtro-menu")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown-lvlODO_ATD22\"]/div/ul/li[1]/a")).click();

		mudarPrincipal();
	}

	@When("^Informar um número de pedido existente com Status Negado/Autorizado$")
	public void informarUmNúmeroDePedidoExistenteComStatusNegadoAutorizado() throws Throwable {
		informaPedido("Autorizado");
	}

	private void informaPedido(String string) throws Exception {
		driver.findElement(By.id("Pesquisa_Pedido")).click();
		mudarModalToolbar();

		mudarModalPrincipal();
		String keysToSend = "23012020";
		driver.findElement(By.id("data_solicitacao_ini")).click();
		driver.findElement(By.id("data_solicitacao_ini")).sendKeys(keysToSend);
		driver.findElement(By.id("data_solicitacao_ini")).sendKeys(Keys.TAB);

		mudarModalToolbar();

		driver.findElement(By.id("btn_acao_continuar")).click();

		mudarModalPrincipal();

		String linkTable = "//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr";
		List<WebElement> listaPedidos = driver.findElements(By.xpath(linkTable));
		assertTrue(listaPedidos.size() > 0);

		for (WebElement webElement : listaPedidos) {
			System.out.println(webElement.getText());
			if (webElement.getText().toLowerCase().contains(string.toLowerCase())) {
				String textMatch = webElement.getText();
				System.out.println(textMatch);
				String[] columns = textMatch.split("  ");
				numPedido = columns[0].trim();
				break;
			}
		}

		mudarModalToolbar();
		driver.findElement(By.id("btn_acao_voltar")).click();

		mudarModalToolbar();
		driver.findElement(By.id("btn_acao_voltar")).click();
	}

	@Then("^o sistema apresenta o resultado da busca alt$")
	public void oSistemaApresentaOResultadoDaBuscaAlt() throws Throwable {
		mudarToolbar();
		mudarPrincipal();
		WebElement wnumPedido = driver.findElement(By.id("num_pedido"));
		assertEquals(wnumPedido.getAttribute("value").toLowerCase(), numPedido.toLowerCase());
	}

	@When("^informar um número de pedido existente com Status de Em Análise$")
	public void informarUmNúmeroDePedidoExistenteComStatusDeEmAnálise() throws Throwable {
		numPedido = TextReader.getLine().replace("Atenção: Pedido nº ", "").replace(" incluido.", "")
				.replace(" incluido.", "");
	}

	@When("^realizar alteração nos dados$")
	public void realizarAlteraçãoNosDados() throws Throwable {
		mudarPrincipal();
		WebElement campoTipoTratamento = driver.findElement(By.id("cod_tratamento"));
		Select tipoTratamento = new Select(campoTipoTratamento);
		String opcaoSelecionada = tipoTratamento.getFirstSelectedOption().getText().toLowerCase();
		List<WebElement> options = tipoTratamento.getOptions();
		for (WebElement webElement : options) {
			if (!webElement.getText().toLowerCase().equals(opcaoSelecionada)
					&& !webElement.getText().toLowerCase().isEmpty()) {
				tipoTratamento.selectByVisibleText(webElement.getText());
				break;
			}
		}

		mudarToolbar();
		driver.findElement(By.id("btn_AlteracaoAnalise();")).click();

		aguarde();

		mudarPrincipal();

		WebElement campoTipoTratamentoAgain = driver.findElement(By.id("cod_tratamento"));
		tipoTratamento = new Select(campoTipoTratamentoAgain);
		String opcaoAlterada = tipoTratamento.getFirstSelectedOption().getText().toLowerCase();

		assertNotEquals(opcaoSelecionada, opcaoAlterada);
	}

	@Then("^o sistema apresenta a mensagem Pedido aprovado$")
	public void oSistemaApresentaAMensagemPedidoAprovado() throws Throwable {
		try {
			mudarPrincipal();
			validaMensagem("aprovado");
		} catch (Exception e) {

		}
	}

	@Given("^que informe um pedido Cancelado$")
	public void queInformeUmPedidoCancelado() throws Throwable {
		queInformeUmPedidoEmAnálise();
		clicarNoBotãoContinuarAlt();
		clicarNoBotãoCancelar();
		informarUmMotivoDeCancelamento();
		clicarEmCancelar();
		oSistemaApresentaMensagemDePedidoCancelado();
		mudarToolbar();
		driver.findElement(By.id("btn_acao_voltar")).click();
		aguarde();
	}

	@When("^clicar no botão Continuar alt$")
	public void clicarNoBotãoContinuarAlt() throws Throwable {

		mudarPrincipal();
		driver.findElement(By.id("num_pedido")).sendKeys(numPedido);

		mudarToolbar();
		driver.findElement(By.id("btn_acao_continuar")).click();

		mudarPrincipal();
		aguarde();

		try {

			mudarPrincipal();
			driver.findElement(By.id("divAssumir")).click();

		} catch (Exception e) {

		}

	}

	private void aguarde() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("//*[@id=\"dvAguarde\"]/div/div")));
	}

	@Given("^clicar no botão Voltar Situação alt$")
	public void clicarNoBotãoVoltarSituação() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_VoltarSituacao();")).click();

	}

	@Given("^Confirmar a mensagem de mudança de situação alt$")
	public void confirmarAMensagemDeMudancaDeSituacaoAlt() {
		mudarPrincipal();
		driver.findElement(By.id("btnOKVoltarSituacao")).click();
		aguarde();
	}

	@When("^incluir procedimento que gere glosa$")
	public void incluirProcedimentoQueGereGlosa() throws Throwable {
		mudarPrincipal();

		String index = "";

		driver.findElement(By.id("tb_adiciona_procedimento")).findElement(By.id("button2")).click();

		Thread.sleep(1500);

		List<WebElement> procedimentos = driver.findElement(By.id("TbProcedimento")).findElements(By.tagName("input"));

		for (int i = 0; i < procedimentos.size(); i++) {
			if (procedimentos.get(i).getAttribute("name").contains("item_medico_")) {
				index = procedimentos.get(i).getAttribute("name").replace("item_medico_", "");
			}
		}

		assertTrue(!procedimentos.isEmpty());

		String coidProcesso = "85100030";
		driver.findElement(By.name(String.format("item_medico_%s", index))).sendKeys(coidProcesso);

		String style = "#99CCFF";

		WebElement regiao = driver.findElement(By.id(String.format("cod_dente_regiao_%s", index)));

		regiao.click();

		mudarPrincipal();
		regiao = driver.findElement(By.id(String.format("cod_dente_regiao_%s", index)));

		Select regiaoDente = new Select(regiao);

		regiaoDente.selectByIndex(regiaoDente.getOptions().size() - 1);

		List<WebElement> options = regiaoDente.getOptions();

		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getAttribute("style").contains(style)) {
				regiaoDente.selectByIndex(i);
				break;
			} else {
				System.out.println(options.get(i).getAttribute("style"));
			}

		}

		driver.findElement(By.id(String.format("ind_laudo_%s", index))).click();
		driver.findElement(By.id(String.format("ind_raiox_ini_%s", index))).click();
		driver.findElement(By.id(String.format("ind_foto_%s", index))).click();

	}

	@When("^liberar glosa caso exista algum impeditivo$")
	public void liberarGlosaCasoExistaAlgumImpeditivo() throws Throwable {

		mudarPrincipal();

		List<WebElement> checkBoxMedic = driver.findElements(By.tagName("input"));

		if (!checkBoxMedic.isEmpty()) {
			for (WebElement inputs : checkBoxMedic) {
				if (inputs.getAttribute("name").contains("chk_item_medico_")) {
					inputs.click();
				}
			}

			mudarToolbar();

			driver.findElement(By.id("btn_LiberarGlosas();")).click();

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

			frame.alertaObterConfirmar();

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
		}

	}

	@When("^incluir observação$")
	public void incluirObservação() throws Throwable {
		mudarPrincipal();

		driver.findElement(By.xpath("//*[@id=\"divPrincipal\"]/div[4]/div[1]/h1/a")).click();

		driver.findElement(By.id("txt_obs_operadora"))
				.sendKeys("Observação Automatizada - " + Calendar.getInstance().getTime().toString());

		driver.findElement(By.id("txt_obs_emissao"))
				.sendKeys("Observação Automatizada - " + Calendar.getInstance().getTime().toString());

		driver.findElement(By.id("txt_corpo_email"))
				.sendKeys("Observação Automatizada - " + Calendar.getInstance().getTime().toString());
	}

	@When("^incluir anexo$")
	public void incluirAnexo() throws Throwable {
//		mudarPrincipal();
//
//		driver.findElement(By.xpath("//*[@id=\"divPrincipal\"]/div[5]/div[1]/h1/a")).click();
//
//		driver.findElement(By.id("btnAnexo")).click();
//
//		mudarModalPrincipal();
//		driver.findElement(By.id("txt_descricao")).sendKeys("Anexo Automatizado");
//
//		String docPDFFile = "";
//		driver.findElement(By.id("nom_arq_anexo")).sendKeys(docPDFFile);
//
//		WebElement motivo = driver.findElement(By.id("ind_situacao"));
//		Select selectMotivo = new Select(motivo);
//		selectMotivo.selectByIndex(selectMotivo.getOptions().size() - 1);
//
//		motivo = driver.findElement(By.id("ind_fase"));
//		Select selectFase = new Select(motivo);
//		selectFase.selectByIndex(selectFase.getOptions().size() - 1);
//
//		motivo = driver.findElement(By.id("ind_tipo_anexo"));
//		Select selecTipoAnexo = new Select(motivo);
//		selecTipoAnexo.selectByIndex(selecTipoAnexo.getOptions().size() - 1);
//
//		driver.findElement(By.id("ind_periapical")).click();
//		driver.findElement(By.id("ind_Bite_Wing")).click();
//		driver.findElement(By.id("ind_Panoramica")).click();
//		driver.findElement(By.id("ind_Telerradiografia")).click();
//
//		driver.findElement(By.id("ind_sel_procedimento_1")).click();
//
//		mudarModalToolbar();
//		driver.findElement(By.id("btn_acao_executar();")).click();
//
//		mudarModalPrincipal();
//		aguarde();

	}

	@When("^consultar ocorrência$")
	public void consultarOcorrência() throws Throwable {
		mudarPrincipal();
		driver.findElement(By.xpath("//*[@id=\"divPrincipal\"]/div[6]/div[1]/h1/a")).click();
	}

	@Then("^sistema apresenta mensagem de aprovação com número do pedido, senha e validade$")
	public void sistemaApresentaMensagemDeAprovaçãoComNúmeroDoPedidoSenhaEValidade() throws Throwable {
		oSistemaApresentaAMensagemPedidoAprovado();
	}

	@Given("^que informe um pedido Negado$")
	public void queInformeUmPedidoNegado() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new NullPointerException();
	}

	@When("^cliar no botão Voltar Situação$")
	public void cliarNoBotãoVoltarSituação() throws Throwable {
		clicarNoBotãoVoltarSituação();
	}

	@Given("^que informe um pedido Autorizado$")
	public void queInformeUmPedidoAutorizado() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new NullPointerException();
	}

	@When("^clicar em Confirmar alt$")
	public void clicarEmConfirmarAlt2() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new NullPointerException();
	}

	@Given("^confirmar em Procedimento se a guia não está autorizada$")
	public void confirmarEmProcedimentoSeAGuiaNãoEstáAutorizada() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new NullPointerException();
	}

	@When("^clicar no botão Submeter alt$")
	public void clicarNoBotãoSubmeterAlt() throws Throwable {
		try {
			aguarde();
			mudarPrincipal();
			mudarToolbar();
			driver.findElement(By.id("btn_Submeter();")).click();

		} catch (Exception e) {

		}
	}

	@When("^clicar no botão Aprovar Pedido alt$")
	public void clicarNoBotãoAprovarPedidoAlt() throws Throwable {
		try {
			mudarModalPrincipal();

			driver.findElement(By.id("ind_tipo_emissao")).click();

			mudarModalToolbar();

			driver.findElement(By.id("btn_acao_executar();")).click();

			mudarPrincipal();
			aguarde();
		} catch (Exception e) {

		}
	}

	@When("^clicar no botão Aprovar pedido alt$")
	public void clicarNoBotãoAprovarPedidoAlt2() throws Throwable {
		clicarNoBotãoAprovarPedidoAlt();
	}

	@Given("^que informe um pedido Em Análise$")
	public void queInformeUmPedidoEmAnálise() throws Throwable {
		informarUmNúmeroDePedidoExistenteComStatusDeEmAnálise();
	}

	@When("^clicar no botão Cancelar alt$")
	public void clicarNoBotãoCancelar() throws Throwable {

		mudarPrincipal();
		List<WebElement> situacaoProcedimentos = driver.findElement(By.id("DvProcedimento"))
				.findElements(By.tagName("select"));

		assertTrue(!situacaoProcedimentos.isEmpty());

		for (WebElement webElement : situacaoProcedimentos) {

			if (webElement.getAttribute("name").contains("ind_situacao_")) {
				Select situacao = new Select(webElement);
				situacao.selectByIndex(0);
			}
		}

		List<WebElement> situacaoProcedimento = driver.findElement(By.id("DvProcedimento"))
				.findElements(By.tagName("input"));

		assertTrue(!situacaoProcedimento.isEmpty());

		for (WebElement webElement : situacaoProcedimento) {

			if (webElement.getAttribute("name").contains("chk_item_medico_")) {
				webElement.click();
			}
		}

		clicarNoBotãoReprocessar();
		clicarEmOkNaMensagemDeConfirmação();
		mudarPrincipal();

		mudarToolbar();
		driver.findElement(By.id("btn_CancelarPedido();")).click();

	}

	@When("^informar um Motivo de cancelamento$")
	public void informarUmMotivoDeCancelamento() throws Throwable {
		mudarModalPrincipal();
		WebElement motivo = driver.findElement(By.id("cod_motivo_canc"));

		Select selectMotivo = new Select(motivo);
		selectMotivo.selectByIndex(2);
	}

	@When("^clicar em Cancelar alt$")
	public void clicarEmCancelar() throws Throwable {
		mudarModalToolbar();
		driver.findElement(By.id("btn_acao_executar();")).click();
	}

	@Then("^o sistema apresenta mensagem de pedido cancelado$")
	public void oSistemaApresentaMensagemDePedidoCancelado() throws Throwable {
		mudarPrincipal();
		String situacao = driver.findElement(By.id("nom_situacao")).getAttribute("value");
		assertEquals("cancelado", situacao.toLowerCase());
	}

	@When("^clicar no botão Análise de Procedimentos$")
	public void clicarNoBotãoAnáliseDeProcedimentos() throws Throwable {
		mudarPrincipal();

		List<WebElement> checkBoxMedic = driver.findElements(By.tagName("input"));

		assertTrue(!checkBoxMedic.isEmpty());

		for (WebElement inputs : checkBoxMedic) {
			if (inputs.getAttribute("name").contains("chk_item_medico_")) {
				inputs.click();
			}
		}

		mudarToolbar();

		driver.findElement(By.id("btn_LiberarGlosas();")).click();
	}

	@When("^liberar as glosas dos procedimentos Manuaiscaso haja$")
	public void liberarAsGlosasDosProcedimentosManuaiscasoHaja() throws Throwable {
		janelaAtual = driver.getWindowHandle();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		driver.findElement(By.id("ind_marcar_todos_glosa")).click();

	}

	@When("^clicar no botão Executar alt$")
	public void clicarNoBotãoExecutarAlt() throws Throwable {
		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_executar();")).click();
	}

	@When("^clicar em Ok na confirmação de mensagem$")
	public void clicarEmOkNaConfirmaçãoDeMensagem() throws Throwable {
		frame.alertaObterConfirmar();

		aguarde();

	}

	@When("^o sistema apresenta a mensagem Operação realizada com sucesso alt$")
	public void oSistemaApresentaAMensagemOperacaoRealizadaComSucessoAlt() throws Throwable {
		frame.sairFrame();
		frame.frame("principal2");
		String expected = "Operação realizada com sucesso".toLowerCase();
		String actual = driver.findElement(By.id("txt_msg")).getText().toLowerCase();
		assertEquals(expected, actual);

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_voltar")).click();

		frame.trocarJanela(janelaAtual);
	}

	@When("^clicar no botão Encaminhar Análise$")
	public void clicarNoBotãoEncaminharAnálise() throws Throwable {
		try {
			mudarToolbar();
			driver.findElement(By.id("btn_EncaminharAnalise();")).click();
		} catch (Exception e) {
		}
	}

	@When("^selecionar o Grupo de análise$")
	public void selecionarOGrupoDeAnálise() throws Throwable {
		try {
			mudarModalPrincipal();

			WebElement grupo = driver.findElement(By.id("cod_grupo_encaminhamento"));

			Select grupoEnc = new Select(grupo);

			grupoEnc.selectByIndex(1);
		} catch (Exception e) {
		}
	}

	@When("^clicar no botão Encaminhar Análise novamente$")
	public void clicarNoBotãoEncaminharAnáliseNovamente() throws Throwable {
		try {
			mudarModalToolbar();
			driver.findElement(By.id("btn_acao_executar();")).click();
		} catch (Exception e) {
		}
	}

	@Then("^o sistema apresenta a mensagem de pedido encaminhado$")
	public void oSistemaApresentaAMensagemDePedidoEncaminhado() throws Throwable {
		try {
			WebElement success = driver.findElement(By.id("popupMensagemOK"));
			success.findElement(By.id("btnFechar")).click();
			mudarPrincipal();
		} catch (Exception e) {
		}
	}

	@When("^selcionar o Procedimento Autorizado$")
	public void selcionarOProcedimentoAutorizado() throws Throwable {
		liberarGlosaCasoExistaAlgumImpeditivo();
		mudarPrincipal();
		aguarde();
		List<WebElement> checkBoxMedic = driver.findElements(By.tagName("input"));

		for (WebElement inputs : checkBoxMedic) {
			if (inputs.getAttribute("name").contains("chk_item_medico_")) {
				inputs.click();
			}
		}
	}

	@When("^clicar no botão Reprocessar$")
	public void clicarNoBotãoReprocessar() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_Reprocessar();")).click();
	}

	@When("^clicar em Ok na mensagem de confirmação$")
	public void clicarEmOkNaMensagemDeConfirmação() throws Throwable {
		frame.alertaObterConfirmar();
	}

	@When("^alterar a Situação do procedimento$")
	public void alterarASituaçãoDoProcedimento() throws Throwable {
		mudarPrincipal();
		List<WebElement> situacaoProcedimento = driver.findElements(By.tagName("select"));

		assertTrue(!situacaoProcedimento.isEmpty());

		for (int i = 0; i < situacaoProcedimento.size(); i++) {
			if (!situacaoProcedimento.get(i).getAttribute("name").contains("ind_situacao_")) {
				situacaoProcedimento.remove(situacaoProcedimento.get(i));
			} else {
				Select select = new Select(situacaoProcedimento.get(i));
				if (!select.getFirstSelectedOption().getText().contains("Autorizado")) {
					select.selectByVisibleText("Autorizado");
				}
			}
		}

	}

	@Given("^que informe um pedido Em analise que esteja bloqueado$")
	public void queInformeUmPedidoEmAnaliseQueEstejaBloqueado() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
	}

	@When("^clicar no botão Desbloquear Pedido$")
	public void clicarNoBotãoDesbloquearPedido() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_AcaoDesbloquearAlteracao();")).click();

	}

	@When("^clicar em Ok na confirmação da mensagem de desbloqueio$")
	public void clicarEmOkNaConfirmaçãoDaMensagemDeDesbloqueio() throws Throwable {
		frame.alertaObterConfirmar();
		mudarPrincipal();
	}

	@Then("^o sistema apresenta a mensagem com o número de pedido e mudança do status com validade$")
	public void oSistemaApresentaAMensagemComONúmeroDePedidoEMudançaDoStatusComValidade() throws Throwable {
		try {
			validaMensagem("encontra-se em análise com");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Given("^selecionar o procedimento$")
	public void selecionarOProcedimento() throws Throwable {
		mudarPrincipal();
		driver.findElement(By.id("tb_adiciona_procedimento")).findElement(By.id("button2")).click();
	}

	@When("^incluir uma Glosa Manual$")
	public void incluirUmaGlosaManual() throws Throwable {

	}

	@When("^selecionar a Nova Glosa como prioridade$")
	public void selecionarANovaGlosaComoPrioridade() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
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

	@When("^clicar em Análise/Alteração$")
	public void clicarEmAnáliseAlteração() throws Throwable {
		mudarToolbar();
		driver.findElement(By.id("btn_AlteracaoAnalise();")).click();
		aguarde();
	}

	@When("^clicar no ícone glosado$")
	public void clicarNoÍconeGlosado() throws Throwable {
	}

	@When("^flegar liberar$")
	public void flegarLiberar() throws Throwable {
		liberarGlosaCasoExistaAlgumImpeditivo();
	}

	@When("^clicar em Executar alt$")
	public void clicarEmExecutar() throws Throwable {
	}

	@When("^consultar dados procedimento$")
	public void consultarDadosProcedimento() throws Throwable {

		mudarPrincipal();

		driver.findElement(By.id("imgConsultaItem_1")).click();

		janelaAtual = driver.getWindowHandle();
		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		aguarde();

		frame.sairFrame();
		frame.frame("toolbarModal");

		driver.findElement(By.id("btn_acao_voltar")).click();

		frame.trocarJanela(janelaAtual);
	}

	@When("^consultar ocorrências$")
	public void consultarOcorrências() throws Throwable {
		consultarOcorrência();
	}

	@When("^exista mais de um procedimento com glosa$")
	public void existaMaisDeUmProcedimentoComGlosa() throws Throwable {
		liberarGlosaCasoExistaAlgumImpeditivo();
	}

	@When("^selecionar os procedimentos que estão com glosa$")
	public void selecionarOsProcedimentosQueEstãoComGlosa() throws Throwable {
	}

	@When("^selecionar o procedimento desejado e flegar$")
	public void selecionarOProcedimentoDesejadoEFlegar() throws Throwable {
	}

	@When("^o sistema exibe a mensagem Operação realizada com sucesso alt$")
	public void oSistemaExibeAMensagemOperaçãoRealizadaComSucesso() throws Throwable {
	}

	@Given("^informe um pedido Negado$")
	public void informeUmPedidoNegado() throws Throwable {
		queInformeUmPedidoEmAnálise();
		clicarNoBotãoContinuarAlt();

		clicarNoBotãoSubmeterAlt();
		clicarNoBotãoAprovarPedidoAlt();

		mudarToolbar();
		driver.findElement(By.id("btn_acao_voltar")).click();
		aguarde();
	}

	@When("^incluir procedimento alt$")
	public void incluirProcedimentoAlt() throws Throwable {
		incluirProcedimentoQueGereGlosa();
	}

	@When("^Consultar ocorrência$")
	public void consultarOcorrência2() throws Throwable {
		consultarOcorrência();
	}

	@Given("^que informe um pedido Autorizado que esteja assumido por outro usuário$")
	public void queInformeUmPedidoAutorizadoQueEstejaAssumidoPorOutroUsuário() throws Throwable {
		driver.findElement(By.id("Pesquisa_Pedido")).click();
		mudarModalToolbar();

		mudarModalPrincipal();

		WebElement situacao = driver.findElement(By.id("cod_situacao"));

		Select situacaoSelect = new Select(situacao);

		situacaoSelect.selectByVisibleText("EM ANÁLISE");

		mudarModalToolbar();

		driver.findElement(By.id("btn_acao_continuar")).click();

		mudarModalPrincipal();

		String linkTable = "//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr";
		List<WebElement> listaPedidos = driver.findElements(By.xpath(linkTable));
		listaPedidos.remove(0);
		assertTrue(!listaPedidos.isEmpty());

		for (WebElement webElement : listaPedidos) {
			List<WebElement> colunas = webElement.findElements(By.tagName("td"));
			System.out.println(">>>> " + colunas.get(7).getText());
			if (!colunas.get(7).getText().toLowerCase().contains("indra") && !colunas.get(7).getText().isEmpty()) {
				numPedido = colunas.get(0).getText();
				break;
			}

		}

		mudarModalToolbar();
		driver.findElement(By.id("btn_acao_voltar")).click();

		mudarModalToolbar();
		driver.findElement(By.id("btn_acao_voltar")).click();

		mudarPrincipal();

	}

	@When("^clicar em Assumir pedido alt$")
	public void clicarEmAssumirPedidoAlt() throws Throwable {
		try {

			mudarPrincipal();
			driver.findElement(By.id("divAssumir")).click();

		} catch (Exception e) {

		}
	}

	@Then("^o sistema apresenta a mensagem pedido assumido$")
	public void oSistemaApresentaAMensagemPedidoAssumido() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
	}
}
