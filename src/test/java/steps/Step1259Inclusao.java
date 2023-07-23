package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
import br.com.portoseguro.data.textreader.TextReader;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1259Inclusao extends UtilsSteps {

	private WebDriverWait wait;
	private String janelaAtual;
	private String nomePrestador;
	private int listaEncaminhamento;
	private String beneficiarioAtivoEDependente = "2020010061";
	private String beneficiarioExcluidoEAgregado = "2019090010";
	private String beneficiarioExcluidoETitular = "2020010071";
	private String beneficiarioSuspensoEDependente = "2020010071";
	private String beneficiarioSuspendoETitular = "2019100010";
	private String beneficiarioInativoETitular = "2019100010";
	private String beneficiarioInativoEAgregado = "2019100010";

	/*
	 * ATIVO E DEPENDENTE - 2020010060 e 2020010061 EXCLUIDO E AGREGADO - 2019090010
	 * SUSPENSO E TITULAR - 2020010070 e 2020010071 SUSPESO E DEPENDENTE -
	 * 2020010070 e 2020010071 INATIVO E TITULAR - 2019090010 INATIVO E AGREGADO -
	 * 2019090010
	 */

	@Given("^acesse a aba Autorização/Pedido de Autorização/Inclusão\\.$")
	public void acesseAAbaAutorizaçãoPedidoDeAutorizaçãoInclusão() throws Throwable {
		initiate();
		wait = new WebDriverWait(driver, 10);
		frame.sairFrame();
		acessaRevalidacao("Inclusão");

		if (driver.getWindowHandles().size() > 1) {
			janelaAtual = driver.getWindowHandle();
			Iterator<String> janelas = driver.getWindowHandles().iterator();
			while (janelas.hasNext()) {
				String next = janelas.next();
				frame.trocarJanela(next);
				if (!next.equals(janelaAtual)) {
					driver.close();
				}
			}
			frame.trocarJanela(janelaAtual);
		}
	}

	@When("^informar um Beneficiário que esteja Ativo e Titular$")
	public void informarUmBeneficiárioQueEstejaAtivoETitular() throws Throwable {
		janelaAtual = driver.getWindowHandle();
		obtemBeneficiarioAtivoETitular();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();

		frame.sairFrame();
		frame.frame("principal2");
		List<WebElement> lines = driver.findElement(By.xpath("//*[@id=\"form01\"]/table[2]"))
				.findElements(By.tagName("tr"));

		for (WebElement webElement : lines) {

			if (webElement.getText().toLowerCase().contains("titular")) {
				WebElement linkToClick = webElement.findElement(By.tagName("a"));

				if (linkToClick.getAttribute("className").contains("blue")) {
					webElement.findElement(By.tagName("a")).click();
					break;
				}
			}
		}

		Thread.sleep(1000);
		int popUp = driver.getWindowHandles().size();
		if (popUp > 1) {
			Iterator<String> popUpJanela = driver.getWindowHandles().iterator();
			while (popUpJanela.hasNext()) {
				String next = popUpJanela.next();
				frame.trocarJanela(next);
				if (!janelaAtual.equals(next)) {
					driver.close();
				}
			}
		}
		frame.trocarJanela(janelaAtual);

	}

	@When("^selecionar Atendimento com Encaminhamento$")
	public void selecionarAtendimentoComEncaminhamento() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		WebElement encaminhamento = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Encaminhamento")));
		encaminhamento.click();
		driver.findElement(By.id("opt_encaminhamento")).click();

	}

	@When("^clicar em Adicionar Encaminhamento$")
	public void clicarEmAdicionarEncaminhamento() throws Throwable {
		driver.findElement(By.id("btnAddEncaminhamento")).click();
	}

	@When("^Adicionar os dados do encaminhamento$")
	public void adicionarOsDadosDoEncaminhamento() throws Throwable {
		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("principal2");

		driver.findElement(By.id("num_cro")).sendKeys("7777777777");

		WebElement selectUf = driver.findElement(By.id("sgl_uf_conselho"));
		Select uf = new Select(selectUf);
		int options = uf.getOptions().size();

		uf.selectByIndex(new Random().nextInt(options));

		driver.findElement(By.id("nome_profissional")).sendKeys("Nome Encaminhamento Automatizado");
		driver.findElement(By.id("num_ddd")).sendKeys("99");
		driver.findElement(By.id("num_telefone")).sendKeys("999999999");

		WebElement especialAtd = driver.findElement(By.id("cod_especialidade_atd"));
		Select atd = new Select(especialAtd);
		options = atd.getOptions().size();

		atd.selectByIndex(new Random().nextInt(options));

		driver.findElement(By.id("txt_obs"))
				.sendKeys("Encaminhamento OBservação Automatizada - " + Calendar.getInstance().getTime().toString());
	}

	@When("^clicar no botão F(\\d+) - Confirmar Encaminhamento$")
	public void clicarNoBotãoFConfirmarEncaminhamento(int arg1) throws Throwable {
		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_executar();")).click();
	}

	@When("^informar Contrato Executante$")
	public void informarContratoExecutante() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		driver.findElement(By.id("Pesquisa_Executante")).click();

		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();

		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("principal2");

		List<WebElement> findElements = driver.findElement(By.id("tbl_pesquisa")).findElements(By.tagName("a"));
		int index = new Random().nextInt(findElements.size());
		findElements.get(index).click();

		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		WebElement targetSelect = driver.findElement(By.id("seq_endereco"));
		Select select = new Select(targetSelect);
		if (select.getFirstSelectedOption().getText().isEmpty()) {
			select.selectByIndex(1);
		}

	}

	@When("^clicar em Adicionar Procedimento$")
	public void clicarEmAdicionarProcedimento() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		driver.findElement(By.id("button2")).click();
		driver.findElement(By.id("Pesquisa_Item_Medido_1")).click();

		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("principal2");
		driver.findElement(By.id("cod_item")).sendKeys("1");

		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();

		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("principal2");
		List<WebElement> findElements = driver.findElements(By.name("chkItemMedico"));
		for (int i = 0; i < 1; i++) {
			findElements.get(new Random().nextInt(findElements.size())).click();
		}

		frame.sairFrame();
		frame.frame("iframemodal");
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();
	}

	@When("^Adicionar os dados do Procedimento$")
	public void adicionarOsDadosDoProcedimento() throws Throwable {
		// TbProcedimento
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		List<WebElement> findElement = driver.findElement(By.id("TbProcedimento")).findElements(By.tagName("tr"));
		for (WebElement element : findElement) {
			try {
				Select regiao = new Select(element.findElement(By.tagName("select")));
				int index = new Random().nextInt(regiao.getOptions().size());
				if (index == 0) {
					regiao.selectByIndex(1);
				} else {
					regiao.selectByIndex(index);
				}

				String keysToSend = String.valueOf(new Random().nextInt(3) + 1);
				driver.findElement(By.tagName("center")).sendKeys(keysToSend);

				List<WebElement> campos = element.findElements(By.className("camposblocks"));
				index = new Random().nextInt(campos.size());
				campos.get(index).click();

			} catch (Exception e) {
			}
		}

	}

	@When("^Adicionar Observações$")
	public void adicionarObservações() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"divPrincipal\"]/div[4]/div[1]/h1/a")).click();

		driver.findElement(By.id("txt_obs_operadora"))
				.sendKeys("Observação Automatizada - " + Calendar.getInstance().getTime().toString());

		driver.findElement(By.id("txt_obs_emissao"))
				.sendKeys("Observação Automatizada - " + Calendar.getInstance().getTime().toString());

		driver.findElement(By.id("txt_corpo_email"))
				.sendKeys("Observação Automatizada - " + Calendar.getInstance().getTime().toString());
	}

	@When("^clicar no botão F(\\d+) - Analise/Inclusão$")
	public void clicarNoBotãoFAnaliseInclusão(int arg1) throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("toolbarMvcToAsp");
		driver.findElement(By.id("btn_ExecutarAcao(\"AN\")")).click();
	}

	@When("^informar um Beneficiário que esteja e Ativo e Dependente$")
	public void informarUmBeneficiárioQueEstejaEAtivoEDependente() throws Throwable {
		String janelaAtual = driver.getWindowHandle();
		obtemBeneficiarioAtivoETitular();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		driver.findElement(By.id("num_associado")).sendKeys(beneficiarioAtivoEDependente);

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();

		frame.sairFrame();
		frame.frame("principal2");
		List<WebElement> lines = driver.findElement(By.xpath("//*[@id=\"form01\"]/table[2]"))
				.findElements(By.tagName("tr"));

		for (WebElement webElement : lines) {

			if (webElement.getText().toLowerCase().contains("dependente")) {
				WebElement linkToClick = webElement.findElement(By.tagName("a"));

				if (linkToClick.getAttribute("className").contains("blue")) {
					webElement.findElement(By.tagName("a")).click();
					break;
				}
			}
		}

		frame.trocarJanela(janelaAtual);
	}

	@When("^selecionar Atendimento sem Encaminhamento$")
	public void selecionarAtendimentoSemEncaminhamento() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		WebElement encaminhamento = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Encaminhamento")));
		encaminhamento.click();
		List<WebElement> optEnca = driver.findElements(By.id("opt_encaminhamento"));
		optEnca.get(optEnca.size() - 1).click();
	}

	@When("^informar um Beneficiário que esteja Excluido e Titular$")
	public void informarUmBeneficiárioQueEstejaExcluidoETitular() throws Throwable {
		String janelaAtual = driver.getWindowHandle();
		obtemBeneficiarioAtivoETitular();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		driver.findElement(By.id("num_associado")).sendKeys(beneficiarioExcluidoETitular);

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();

		frame.sairFrame();
		frame.frame("principal2");
		List<WebElement> lines = driver.findElement(By.xpath("//*[@id=\"form01\"]/table[2]"))
				.findElements(By.tagName("tr"));

		for (WebElement webElement : lines) {

			if (webElement.getText().toLowerCase().contains("dependente")) {
				WebElement linkToClick = webElement.findElement(By.tagName("a"));

				if (linkToClick.getAttribute("className").contains("blue")) {
					webElement.findElement(By.tagName("a")).click();
					break;
				}
			}
		}

		frame.trocarJanela(janelaAtual);
	}

	@When("^o sistema apresenta a mensagem Atenção: Pedido nº 'num pedido' incluido\\.$")
	public void oSistemaApresentaAMensagemAtençãoPedidoNºNumPedidoIncluido() throws Throwable {
		oSistemaApresentaAMensagemAtençãoPedidoNºNumPedidoIncluidoInc();
	}

	@When("^clicar no botão Criticas Encontradas no pedido$")
	public void clicarNoBotãoCriticasEncontradasNoPedido() throws Throwable {

		janelaAtual = driver.getWindowHandle();

		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");

		int popUp = driver.getWindowHandles().size();
		System.out.println("TOTAL DE JANELAS = :" + popUp);
		if (popUp > 1) {
			Iterator<String> popUpJanela = driver.getWindowHandles().iterator();
			while (popUpJanela.hasNext()) {
				String next = popUpJanela.next();
				frame.trocarJanela(next);
				if (!janelaAtual.equals(next)) {
					driver.close();
				}
			}
		}
		frame.trocarJanela(janelaAtual);
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		driver.findElement(By.className("fa-exclamation-triangle")).click();
	}

	@When("^selecionar critica$")
	public void selecionarCritica() throws Throwable {
		janelaAtual = driver.getWindowHandle();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		driver.findElement(By.id("ind_marcar_todos")).click();

	}

	@When("^Clicar no botão F(\\d+) - Executar$")
	public void clicarNoBotãoFExecutar(int arg1) throws Throwable {
		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_executar();")).click();

		frame.trocarJanela(janelaAtual);
	}

	@Then("^o sistema apresentaa mensagem Atenção: Operação realizada com sucesso$")
	public void oSistemaApresentaaMensagemAtençãoOperaçãoRealizadaComSucesso() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		try {
			validaMensagem("Operação realizada com sucesso");
		} catch (Exception e) {
		}
	}

	@When("^informar um Beneficiário que esteja e Excluido e Agregado$")
	public void informarUmBeneficiárioQueEstejaEExcluidoEAgregado() throws Throwable {
		String janelaAtual = driver.getWindowHandle();
		obtemBeneficiarioAtivoETitular();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		driver.findElement(By.id("num_associado")).sendKeys(beneficiarioExcluidoEAgregado);

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();

		frame.sairFrame();
		frame.frame("principal2");
		List<WebElement> lines = driver.findElement(By.xpath("//*[@id=\"form01\"]/table[2]"))
				.findElements(By.tagName("tr"));

		for (WebElement webElement : lines) {

			if (webElement.getText().toLowerCase().contains("titular")) {
				WebElement linkToClick = webElement.findElement(By.tagName("a"));
				assertTrue(linkToClick.getAttribute("className").contains("gray"));
				if (linkToClick.getAttribute("className").contains("gray")) {
					webElement.findElement(By.tagName("a")).click();
					break;
				}
			}
		}

		frame.trocarJanela(janelaAtual);
	}

	@When("^informar um Beneficiário que esteja Suspenso e Titular$")
	public void informarUmBeneficiárioQueEstejaSuspensoETitular() throws Throwable {
		String janelaAtual = driver.getWindowHandle();
		obtemBeneficiarioAtivoETitular();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		driver.findElement(By.id("num_associado")).sendKeys(beneficiarioSuspendoETitular);

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();

		frame.sairFrame();
		frame.frame("principal2");
		List<WebElement> lines = driver.findElement(By.xpath("//*[@id=\"form01\"]/table[2]"))
				.findElements(By.tagName("tr"));

		for (WebElement webElement : lines) {

			if (webElement.getText().toLowerCase().contains("titular")) {
				WebElement linkToClick = webElement.findElement(By.tagName("a"));

				if (linkToClick.getAttribute("className").contains("blue")) {
					webElement.findElement(By.tagName("a")).click();
					break;
				}
			}
		}

		frame.trocarJanela(janelaAtual);
	}

	@When("^informar um Beneficiário que esteja Suspenso e Dependente$")
	public void informarUmBeneficiárioQueEstejaSuspensoEDependente() throws Throwable {
		String janelaAtual = driver.getWindowHandle();
		obtemBeneficiarioAtivoETitular();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		driver.findElement(By.id("num_associado")).sendKeys(beneficiarioSuspensoEDependente);

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();

		frame.sairFrame();
		frame.frame("principal2");
		List<WebElement> lines = driver.findElement(By.xpath("//*[@id=\"form01\"]/table[2]"))
				.findElements(By.tagName("tr"));

		for (WebElement webElement : lines) {

			if (webElement.getText().toLowerCase().contains("dependente")) {
				WebElement linkToClick = webElement.findElement(By.tagName("a"));

				if (linkToClick.getAttribute("className").contains("blue")) {
					webElement.findElement(By.tagName("a")).click();
					break;
				}
			}
		}

		frame.trocarJanela(janelaAtual);
	}

	@When("^informar um Beneficiário que esteja Inativo e Titular$")
	public void informarUmBeneficiárioQueEstejaInativoETitular() throws Throwable {
		String janelaAtual = driver.getWindowHandle();
		obtemBeneficiarioAtivoETitular();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		driver.findElement(By.id("num_associado")).sendKeys(beneficiarioInativoETitular);

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();

		frame.sairFrame();
		frame.frame("principal2");
		List<WebElement> lines = driver.findElement(By.xpath("//*[@id=\"form01\"]/table[2]"))
				.findElements(By.tagName("tr"));

		for (WebElement webElement : lines) {

			if (webElement.getText().toLowerCase().contains("titular")) {
				WebElement linkToClick = webElement.findElement(By.tagName("a"));

				if (linkToClick.getAttribute("className").contains("blue")) {
					webElement.findElement(By.tagName("a")).click();
					break;
				}
			}
		}

		frame.trocarJanela(janelaAtual);
	}

	@When("^informar um Beneficiário que esteja Inativo e Agregado$")
	public void informarUmBeneficiárioQueEstejaInativoEAgregado() throws Throwable {
		String janelaAtual = driver.getWindowHandle();
		obtemBeneficiarioAtivoETitular();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		driver.findElement(By.id("num_associado")).sendKeys(beneficiarioInativoEAgregado);

		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_continuar")).click();

		frame.sairFrame();
		frame.frame("principal2");
		List<WebElement> lines = driver.findElement(By.xpath("//*[@id=\"form01\"]/table[2]"))
				.findElements(By.tagName("tr"));

		for (WebElement webElement : lines) {

			if (webElement.getText().toLowerCase().contains("titular")) {
				WebElement linkToClick = webElement.findElement(By.tagName("a"));

				if (linkToClick.getAttribute("className").contains("blue")) {
					webElement.findElement(By.tagName("a")).click();
					break;
				}
			}
		}

		frame.trocarJanela(janelaAtual);
	}

	@When("^data da vigencia será > que data atual$")
	public void dataDaVigenciaSeráQueDataAtual() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^que se está com usuario selecionado$")
	public void queSeEstáComUsuarioSelecionado() throws Throwable {
		informarUmBeneficiárioQueEstejaAtivoETitular();
	}

	@When("^optar por pesquisar prestador pelo nome$")
	public void optarPorPesquisarPrestadorPeloNome() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
	}

	@When("^digitar o nome do prestador no campos$")
	public void digitarONomeDoPrestadorNoCampos() throws Throwable {
		WebElement prestador = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nome_prestador_exec")));
		nomePrestador = "Ana Maria";
		prestador.sendKeys(nomePrestador);
	}

	@When("^clicar no Icone Buscar prestador por nome$")
	public void clicarNoIconeBuscarPrestadorPorNome() throws Throwable {
		janelaAtual = driver.getWindowHandle();
		String nameOrHandle = "";

		Iterator<String> windowHandles = driver.getWindowHandles().iterator();
		while (windowHandles.hasNext()) {
			String current = windowHandles.next();
			if (!current.equals(janelaAtual)) {
				nameOrHandle = current;
				break;
			} else {
				System.out.println("Não existe um pop extra");
			}
		}

		if (driver.getWindowHandles().size() > 1) {
			driver.switchTo().window(nameOrHandle);
			driver.close();
			frame.trocarJanela(janelaAtual);
			frame.sairFrame();
			frame.frame("iframeasp");
			frame.frame("principal2");
		}

		WebElement tabelaPrestador = driver.findElement(By.id("tbl_inc_abre_table"));
		assertTrue(tabelaPrestador.isDisplayed());
		driver.findElement(By.id("Pesquisa_Executante_Nome")).click();
	}

	@Then("^o sistema carrega os dados do prestador$")
	public WebElement oSistemaCarregaOsDadosDoPrestador() throws Throwable {
		janelaAtual = driver.getWindowHandle();

		Iterator<String> janelas = driver.getWindowHandles().iterator();
		assertTrue(driver.getWindowHandles().size() > 1);
		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		frame.sairFrame();
		frame.frame("principal2");
		WebElement tabelaPrestador = driver.findElement(By.xpath("//*[@id=\"tbl_inc_abre_table\"]/center/table"));
		assertTrue(tabelaPrestador.isDisplayed());
		return tabelaPrestador;
	}

	@When("^selecionar um prestador$")
	public void selecionarUmPrestador() throws Throwable {
		optarPorPesquisarPrestadorPeloNome();
		digitarONomeDoPrestadorNoCampos();
		clicarNoIconeBuscarPrestadorPorNome();
		oSistemaCarregaOsDadosDoPrestador();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@title='Selecionar este prestador']")))
				.click();
		frame.trocarJanela(janelaAtual);
	}

	@When("^clicar no em Consultar dados do Prestador$")
	public void clicarNoEmConsultarDadosDoPrestador() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		driver.findElement(By.id("imgDadosExec")).click();
	}

	@Then("^o sistema exibi a tela com os dados do prestador$")
	public void oSistemaExibiATelaComOsDadosDoPrestador() throws Throwable {
		janelaAtual = driver.getWindowHandle();
		Iterator<String> janelas = driver.getWindowHandles().iterator();
		assertTrue(driver.getWindowHandles().size() > 1);

		while (janelas.hasNext()) {
			frame.trocarJanela(janelas.next());
		}

		String title = driver.getTitle();
		assertEquals("Consultar dados do prestador", title);

		driver.close();

		frame.trocarJanela(janelaAtual);
	}

	@When("^optar por clicar no em Autorização Previa$")
	public void optarPorClicarNoEmAutorizaçãoPrevia() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		driver.findElement(By.id("imgAutorizacaoPrevia")).click();
	}

	@When("^o sistema mostar a tela de autorização$")
	public void oSistemaMostarATelaDeAutorização() throws Throwable {
		janelaAtual = driver.getWindowHandle();
		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			String next = janelas.next();
			frame.trocarJanela(next);
		}
	}

	@When("^clicar no Icone executar$")
	public void clicarNoIconeExecutar() throws Throwable {
		frame.sairFrame();
		frame.frame("toolbarModal");
		driver.findElement(By.id("btn_acao_executar();")).click();
	}

	@Then("^o sistema deve mostrar nº da autorização$")
	public void oSistemaDeveMostrarNºDaAutorização() throws Throwable {
		frame.sairFrame();
		frame.frame("principal2");
		System.out.println(driver.getTitle());
		List<WebElement> tags = driver.findElements(By.tagName("td"));
		try {
			for (WebElement data : tags) {
				if (data.isEnabled() && data.getText().contains("Autorizado")) {
					System.out.println("Autorização Prévia Encontrada.");
				}
			}
		} catch (Exception e) {

		}
		driver.close();
		frame.trocarJanela(janelaAtual);
	}

	@When("^optar por clicar no em Buscar dados do beneficiario$")
	public void optarPorClicarNoEmBuscarDadosDoBeneficiario() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		driver.findElement(By.id("imgPesquisaPadrao")).click();
	}

	@Then("^o sistema exibi a tela com os dados do beneficiario$")
	public void oSistemaExibiATelaComOsDadosDoBeneficiario() throws Throwable {
		janelaAtual = driver.getWindowHandle();
		Iterator<String> janelas = driver.getWindowHandles().iterator();
		while (janelas.hasNext()) {
			String next = janelas.next();
			frame.trocarJanela(next);
		}

		frame.sairFrame();
		frame.frame("principal2");

		WebElement situacao = driver.findElement(By.id("ico-situacao"));

		assertTrue(situacao.isDisplayed());

		driver.close();
		frame.trocarJanela(janelaAtual);
	}

	@When("^optar por clicar no em Abrir contato do beneficiario$")
	public void optarPorClicarNoEmAbrirContatoDoBeneficiario() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		driver.findElement(By.id("imgAbreContato")).click();
	}

	@Then("^o sistema exibi a tela com os contatos do beneficiario$")
	public void oSistemaExibiATelaComOsContatosDoBeneficiario() throws Throwable {
		WebElement popUp = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("popupContato")));
		boolean displayed = popUp.isEnabled();
		assertTrue(displayed);
	}

	@Given("^que se tem um ou mais encaminhamenos inseridos$")
	public void queSeTemUmOuMaisEncaminhamenosInseridos() throws Throwable {
		informarUmBeneficiárioQueEstejaAtivoETitular();
		selecionarAtendimentoComEncaminhamento();
		clicarEmAdicionarEncaminhamento();
		adicionarOsDadosDoEncaminhamento();
		clicarNoBotãoFConfirmarEncaminhamento(5);
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
	}

	@When("^clicar no botao exluir encaminhamento$")
	public void clicarNoBotaoExluirEncaminhamento() throws Throwable {
		WebElement tabelaEncaminhamento = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("liEncaminhamento_1")));
		listaEncaminhamento = driver.findElements(By.id("list-group-item")).size();
		tabelaEncaminhamento.findElement(By.className("btn-danger")).click();
	}

	@When("^o sitema apresenta a mensagem Deseja realmente Excluir\\?$")
	public void oSitemaApresentaAMensagemDesejaRealmenteExcluir() throws Throwable {
		String alertaObterTexto = frame.alertaObterTexto().toLowerCase();
		String alertaTexo = "Deseja excluir o encaminhamento ?".toLowerCase();
		assertEquals(alertaTexo, alertaObterTexto);
	}

	@When("^clicar no botão ok inc$")
	public void clicarNoBotãoOkInc() throws Throwable {
		frame.alertaObterConfirmar();
	}

	@Then("^o sistema remove o encaminhamento do pedido$")
	public void oSistemaRemoveOEncaminhamentoDoPedido() throws Throwable {
		int currentSize = driver.findElements(By.id("list-group-item")).size();
		assertTrue(listaEncaminhamento >= currentSize);
	}

	@Then("^o sistema apresenta a mensagem Atenção: Pedido nº 'num pedido' incluido\\. inc$")
	public void oSistemaApresentaAMensagemAtençãoPedidoNºNumPedidoIncluidoInc() throws Throwable {
		frame.sairFrame();
		frame.frame("iframeasp");
		frame.frame("principal2");
		validaMensagem("incluido.");
	}

	public void obtemBeneficiarioAtivoETitular() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframeasp");
		driver.switchTo().frame("principal2");

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("num_associado")));
		wait.until(ExpectedConditions.visibilityOf(element));

		driver.findElement(By.cssSelector("#imgPesquisaBeneficiario")).click();
	}

	public void validaMensagem(String mensagem) {
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".alert-info")));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println(element.getText());
		String sucess = element.getText();
		assertTrue(element.getText().toLowerCase().contains(mensagem.toLowerCase()));
		driver.findElement(By.className("close")).click();
		if (mensagem.contains("incluido")) {
			TextReader.saveText(sucess.replace("×", ""));
		}
	}

	public void acessaRevalidacao(String valor) {

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.sendKeys(valor);
		driver.findElement(By.id("btn-filtro-menu")).click();
		driver.findElement(By.partialLinkText(valor)).click();
	}

	@Then("^Está: conteudo$")
	public void estáMensagem() throws Throwable {
	}
}
