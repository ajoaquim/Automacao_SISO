package pageObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;

public class WorkflowPage {

	WebDriver driver;
	WebElement element;
	String elementStr;

	UtilsModule modulo = new UtilsModule();
	UtilsFrames frame = new UtilsFrames(driver);

	public WorkflowPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement elementControl(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "xpath");
		element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		return element;
	}

	public void acessoWorkflow() {
		elementControl("//*[@id='dropdown'][19]");
		element.click();
	}

	public void worflowEnviar() {
		elementControl("//*[@id='btn_acao_continuar']");
		element.click();
	}

	public void worflowLimpar() {
		elementControl("//*[@id='idAcaoLimpar']");
		element.click();
	}

	public void worflowExecutar() {
		elementControl("//*[@id='btn_acao_executar']");
		element.click();
	}

	public void worflowAlterar() {
		elementControl("//*[@id='btn_acao_alterar']");
		element.click();
	}

	public void worflowIncluir() {
		elementControl("//*[@id='btn_acao_incluir']");
		element.click();
	}

	public void worflowClicarEnter() {
		elementControl("//*[@id='num_sac']");
		element.sendKeys(Keys.ENTER);
	}

	// -----------------------------------------------------------------//
	// ----------------------ABERTURA-----------------------------------//
	
	public void workflowAnaliseRedirecionar() {
		elementControl("//*[@id='bt_redirecionar']");
		// element.click();

	}
	public void workflowAnaliseEncerrar() {
		elementControl("//*[@id='bt_encerrar']");
		// element.click();

	}


	public void workflowAnalisePrenchersolicitação() {
		elementControl("//*[@id='num_sac']");
		element.sendKeys("401");
	}

	
	public void workflowAbertura() {
		elementControl("//*[@id='dropdown'][19]//li");
		element.click();
	}

	public void aberturaUsuarioPrestador() {
		elementControl("//*[@id='cod_prestador']");
		element.sendKeys("010618");
	}

	public void aberturaUsuarioDadosInclusao() {
		elementControl("//*[@id='cod_origem_sac']");
		element.click();

		elementControl("//*[@id='cod_origem_sac']/option[2]");
		element.click();

		elementControl("//*[@id='cod_grupo_tipo_sac']");
		element.click();

		elementControl("//*[@id='cod_grupo_tipo_sac']/option[2]");
		element.click();

		elementControl("//*[@id='cod_tipo_solicitacao']");
		element.click();

		elementControl("//*[@id='cod_tipo_solicitacao']/option[2]");
		element.click();

		elementControl("//*[@id='txt_descricao']");
		element.sendKeys("Sentinela de teste QA execução de teste");

	}

	public void aberturaUsuarioContrato() {
		elementControl("//*[@id='num_contrato']");
		element.click();
	}

	public void aberturaAccertConfirm() {
		elementControl("//*[contains(text(), 'Abertura realizada.')]");
		String value = element.getText().toString();
		System.out.println(value);
		// assertEquals("Bem vindo ao Sistema", value);
	}

	// -----------------------------------------------------------------//
	// ----------------------ANALISE-----------------------------------//
	
	public void incluirAtividadeAnalise() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_acao_incluir > img"));
		bt.click();
	}
	public boolean validaCampoEnabled(By by) {
		WebElement campo = driver.findElement(by);	
		return 	campo.isEnabled();
	}
	public void atividadeAnalise() {
		WebElement bt = driver.findElement(By.cssSelector("#bt_ocorrencia > img"));
		bt.click();
	}
	public void selecionarDadoTable(String campo) {
			
			boolean achei = false;
			
			WebElement tabelaDeAtividades = driver.findElement(By.cssSelector("#dvresultado > table"));
	
			List<WebElement> linhasDaTabelaDeAtividade = tabelaDeAtividades.findElements(By.tagName("tr"));
			
			for (WebElement linha : linhasDaTabelaDeAtividade) {
				
				if(linha.getText().toLowerCase().contains(campo.toLowerCase())) {
					
					linha.findElement(By.tagName("a")).click();
					achei = true;
					break;
					
				}
			
				
			}
			
			assertTrue(achei);
				
	}
	
	
	public void clickMarcarTodos() {
		WebElement link = driver.findElement(By.cssSelector("#span_marca_lst_todos > a"));
		link.click();
	}

	public void selecionarSubmenuWorkflow(String opcao) {
		switch (opcao) {
		case "Registro Atividade":
			WebElement element3 = driver
					.findElement(By.cssSelector("#dropdown-lvl45 > div > ul > li:nth-child(3) > a"));
			element3.click();
			break;
		case "Historico":
				WebElement element4 = driver.findElement(By.cssSelector("#dropdown-lvl45 > div > ul > li:nth-child(7) > a"));
				element4.click();
				break;
		
		case "Consulta Geral":
				WebElement element5 = driver.findElement(By.cssSelector("#dropdown-lvl45 > div > ul > li:nth-child(4) > a"));
				element5.click();
				break;
		}
	}
	public void validaCampoPreenchido(By by) {
		WebElement campo = driver.findElement(by);
		if(campo.equals("")) {
			assertTrue(false);
		}else {
			assertTrue(true);
		}
	}
	public boolean validarVisibilidade(By by) {
		WebElement campo = driver.findElement(by);
		return campo.isDisplayed();
	}

	public void workflowAnalise() {
		elementControl("//*[@id='dropdown'][19]//li[2]");
		element.click();
	}

	public void selecionarAgendada() {
		String select = "#form01 > table > tbody > tr:nth-child(6) > td:nth-child(2) > select > option:nth-child(1)";
		WebElement agendada = driver.findElement(By.cssSelector(select));
		agendada.click();
	}

	public void clickLupa() {
		WebElement lupa = driver.findElement(By.cssSelector("#lupa_pesq_solicitacoes"));
		lupa.click();
	}

	public void clickContinuar() {
		WebElement continuar = driver.findElement(By.cssSelector("#btn_acao_continuar > img"));
		continuar.click();
	}

	public void workflowAnaliseNSolicitacao() throws InterruptedException {

		elementControl("//*[@id='cod_prestador']");
		element.sendKeys("010618");

		elementControl("//*[@id='cod_prestador']");
		element.click();

		elementControl("//*[@id='num_contrato']");
		element.click();

		frame.sairFrame();

		frame.framePaginaInicial("//*[@id='toolbarModal']");

		elementControl("//*[@id='btn_acao_continuar']");
		element.click();

		frame.sairFrame();

		frame.framePaginaInicial("//*[@id='principal2']");

		elementControl("//tbody//tr[2]//a");
		element.click();

		Thread.sleep(2000);

	}

	public void workflowAnaliseLupa() {
		elementControl("//*[@id='lupa_pesq_solicitacoes']");

		element.click();
	}

	public void workflowAnaliseAtividade() {
		elementControl("//*[@id='bt_ocorrencia']");
		element.click();

	}

	public void workflowAnaliseRegistrarAtividade() {
		elementControl("//*[@id='dt_agendamento']");
		element.sendKeys("12122020");
		elementControl("//*[@id='hora_agendamento']");
		element.sendKeys("430");

	}

	public void workflowAnaliseAccertRegistrar() {
		elementControl("//*[contains(text(), 'Ocorrência da Solicitação ')]");
		String value = element.getText().toString();
		System.out.println(value);
		assertEquals("Ocorrência da Solicitação 401 gerada.", value);
	}

	public void workflowAnaliseAccertConfirmar() {
		elementControl("//*[contains(text(), 'Redirecionamento da Solicitação ')]");
		String value = element.getText().toString();
		System.out.println(value);
		assertEquals("Redirecionamento da Solicitação ", value);
	}

	public void workflowAnaliseAccertEncerrar() {
		elementControl("//*[contains(text(), 'Encerramento da Solicitação ')]");
		String value = element.getText().toString();
		System.out.println(value);
		assertEquals("Encerramento da Solicitação ", value);
	}

	// -----------------------------------------------------------------//
	// ----------------------CONSULTA GERAL-----------------------------//

	public void workflowConsultaGeral() {
		elementControl("//*[@id='dropdown'][19]//li[4]");
		element.click();
	}

	public void workflowConsultaGeralHistorico() {
		elementControl("//*[@id=\"dvresultado\"]//a/img");
		element.click();
	}

	public void workflowConsultaGerallupaPrestador() {
		elementControl("//*[@id='pesq_prestador'][19]//li[4]");
		element.click();
	}

	// -----------------------------------------------------------------//
	// ----------------------CONSULTA PROPRIA---------------------------//
	public void executarCP() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_acao_executar\\(\\)\\; > img"));
		bt.click();
	}

	public void envioAcompanhamentoCP() {
		String element = "#btn_AbrirHistorico\\(\\) > img";
		WebElement bt = driver.findElement(By.cssSelector(element));
		bt.click();
	}

	public void encerrarAtividadeCP() {
		String element = "#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(1) > a:nth-child(3) > img";
		WebElement bt = driver.findElement(By.cssSelector(element));
		bt.click();
	}

	public void alterarAtividadeCP() {
		WebElement element = driver.findElement(By.cssSelector("#btn_acao_alterar > img"));
		element.click();
	}

	public void workflowConsultaPropria() {
		String elementStr = "//*[@id='dropdown'][19]//li[5]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.click();
	}

	public void redirecionar() {
		String cssSeletor = "#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(1) > a:nth-child(1) > img";

		WebElement bt = driver.findElement(By.cssSelector(cssSeletor));
		bt.click();
	}

	public void atividadeCP() {
		String id = "#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(1) > a:nth-child(2) > img";

		WebElement bt = driver.findElement(By.cssSelector(id));
		bt.click();

	}

	public void incluirAtividadeCP() {
		String id = "#btn_acao_incluir > img";
		WebElement bt = driver.findElement(By.cssSelector(id));
		bt.click();
	}

	public void historicoCP() {
		String css = "#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(1) > a:nth-child(4) > img";
		WebElement bt = driver.findElement(By.cssSelector(css));
		bt.click();
	}

	// -----------------------------------------------------------------//
	// ----------------------ENCERRAMENTO-------------------------------//

	public void workflowEncerramento() {
		String elementStr = "//*[@id='dropdown'][19]//li[6]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.click();
	}

	public void preencherSolicitacao(String numSolic) {

		WebElement element = driver.findElement(By.id("num_sac"));
		String id = "num_sac";
		modulo.waitingElement(driver, id, "id");
		element.sendKeys(numSolic);

	}

	public void alterarSolicitacao() {

		WebElement btTool = driver.findElement(By.xpath("//*[@id=\"btn_acao_alterar\"]"));
		btTool.click();
	}

	public void validarMensagem(String element, String txtEsperado, String tipo) {
		if (tipo == "id") {

			modulo.waitingElement(driver, element, "id");

			WebElement label = driver.findElement(By.id(element));
			label.click();
			String value = label.getText().toString();
			System.out.println(txtEsperado);
			System.out.println(label.getText().toString());
			assertEquals(value.matches(txtEsperado), true);
		} else if (tipo == "seletor") {
			modulo.waitingElement(driver, element, "seletor");
			WebElement label = driver.findElement(By.cssSelector(element));
			label.click();
			String value = label.getText().toString();
			System.out.println(txtEsperado);
			System.out.println(label.getText().toString());
			assertEquals(value.matches(txtEsperado), true);
		} else if (tipo == "xpath") {
			modulo.waitingElement(driver, element, "path");
			WebElement label = driver.findElement(By.xpath(element));
			label.click();
			String value = label.getText().toString();
			System.out.println(txtEsperado);
			System.out.println(label.getText().toString());
			assertEquals(value.matches(txtEsperado), true);
		}
		// Mensagens com REGEX

		// Acompanhamento de demanda enviado com sucesso para o email
		// Reabertura da solicitação [0-9]* realizada.
		// "Redirecionamento da Solicitação [0-9]* realizado."

	}

	public void validarMensagemStatico(String element, String txtEsperado) {

		modulo.waitingElement(driver, element, "seletor");
		WebElement label = driver.findElement(By.cssSelector(element));
		label.click();
		String value = label.getText().toString();

		assertEquals(txtEsperado, value.substring(0, 58));

	}

	public void validarMensagemVariavel(String element, String txtEsperado, String tipo) {
		if (tipo == "id") {

			modulo.waitingElement(driver, element, "id");

			WebElement label = driver.findElement(By.id(element));
			label.click();
			String value = label.getAttribute("value");
			assertEquals(value.matches(txtEsperado), true);

		} else if (tipo == "seletor") {
			modulo.waitingElement(driver, element, "seletor");
			WebElement label = driver.findElement(By.cssSelector(element));
			label.click();
			String value = label.getAttribute("value");
			assertEquals(value.matches(txtEsperado), true);

		} else if (tipo == "xpath") {
			modulo.waitingElement(driver, element, "path");
			WebElement label = driver.findElement(By.xpath(element));
			label.click();
			String value = label.getAttribute("value");
			assertEquals(value.matches(txtEsperado), true);
		}
	}

	// -----------------------------------------------------------------//
	// ----------------------HISTORICO----------------------------------//

	public void workflowHistorico() {
		String elementStr = "//*[@id='dropdown'][19]//li[7]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.click();
	}

	public void executar() {
		WebElement button = driver.findElement(By.xpath("//*[@id=\"btn_AbrirHistorico()\"]/img"));
		button.click();
	}

	public void abrirHistorico() {
		String css = "#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(1) > a > img";

		WebElement historico = driver.findElement(By.cssSelector(css));
		historico.click();
	}

	public void digitarEmail(String email) {
		WebElement txtEmail = driver.findElement(By.id("txt_email"));
		txtEmail.sendKeys(email);
	}

	public void enviar() {
		WebElement btEnviar = driver.findElement(By.xpath("//*[@id=\"btn_acao_executar();\"]/img"));
		btEnviar.click();
	}

	// -----------------------------------------------------------------//
	// ----------------------REABERTURA---------------------------------//

	public void workflowReabertura() {
		String elementStr = "//*[@id='dropdown'][19]//li[8]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.click();
	}

	public void alterar() {
		WebElement bt = driver.findElement(By.cssSelector("#btn_acao_alterar > img"));
		bt.click();
	}
	// -----------------------------------------------------------------//
	// ----------------------REDIRECIONAMENTO---------------------------//

	public void workflowRedirecionamento() {
		String elementStr = "//*[@id='dropdown'][19]//li[9]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.click();
	}

	public void executarRedirecionamento() {
		WebElement element = driver.findElement(By.cssSelector("#btn_acao_alterar > img"));
		element.click();
	}

	// -----------------------------------------------------------------//
	// ----------------------REGISTRO ATIVIDADE-------------------------//

	public void workflowRegistroAtividade() {
		elementControl("//*[@id='dropdown'][19]//li[3]");
		element.click();
	}

	public void workflowRegistroLupa() {
		elementControl("//*[@id='lupa_pesq_solicitacoes']");
		element.sendKeys("358");
	}

	public void incluirAtividade() {
		WebElement btIncluir = driver.findElement(By.cssSelector("#btn_acao_incluir > img"));
		btIncluir.click();
	}

	public void redirecionarAtividade() {
		WebElement btRedirecionar = driver.findElement(By.cssSelector("#bt_redirecionar > img"));
		btRedirecionar.click();
	}

	public void alterarAtividade() {
		WebElement btAlterar = driver.findElement(By.cssSelector("#btn_acao_alterar > img"));
		btAlterar.click();
	}

	public void encerrarAtividadeRA() {
		WebElement bt = driver.findElement(By.cssSelector("#bt_encerrar > img"));
		bt.click();
	}

	// -----------------------------------------------------------------//
	// ----------------------SITUACAO-----------------------------------//
	public void focusElement(String element, String tipo) {
		WebElement campo = driver.findElement(By.cssSelector(element));

		if (tipo.equals("input")) {
			campo.sendKeys("");

		} else {
			new Actions(driver).moveToElement(campo).perform();

		}

	}

	public void execuarSituacao() {
		WebElement executar = driver.findElement(By.cssSelector("#btn_acao_executar\\(\\)\\; > img"));
		executar.click();
	}

	public void envioAcompanhamentoSituacao() {
		WebElement envio = driver.findElement(By.cssSelector("#btn_AbrirHistorico\\(\\) > img"));
		envio.click();
	}

	public void workflowSituacao() {
		String elementStr = "//*[@id='dropdown'][19]//li[10]";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		element.click();
	}

	public void clicarHistoricoSituacao(String css) {
		WebElement btHistorico = driver.findElement(By.cssSelector(css));
		btHistorico.click();
	}

	public void redirecionarSituacao() {
		String css = "#dvresultado > table > tbody > tr:nth-child(26) > td:nth-child(1) > a:nth-child(1) > img";

		WebElement bt = driver.findElement(By.cssSelector(css));
		bt.click();

	}

	public void registrarAtividadeSituacao(String css) {

		WebElement btAtividade = driver.findElement(By.cssSelector(css));
		modulo.waitingElement(driver, css, "seletor");
		btAtividade.click();
	}

	public void encerrarAtividadeSituacao(String css) {
		WebElement btAtividade = driver.findElement(By.cssSelector(css));
		btAtividade.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
		
		
		
		
		
		
		
		
		
		
		
		
		

}
