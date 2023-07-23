package steps;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ultils.UtilsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9219AnaliseRemessaPorReferencia extends UtilsSteps {

	@When("^optar por Conta Odontológica,Análise Remessa por Referência$")
	public void selecionaromenuContaOdontológicaAnáliseRemessaporReferência() throws Throwable {

		initiate();
		frame.sairFrame();
		frame.sairFrame();
		contas.acessoContasOdontologicas();
		contas.acessoAnaliseRemessaPorReferencia();

	}

	// #Remessa

	// Scenario: Desbloquear uma remessa que esteja com outro usuário para análise
	@Given("^que tenha uma remessa já gerada com outro usuário para análise$")
	public void quetenhaumaremessajágeradacomoutrousuário() throws Throwable {

	}

	@When("^realizar o filtro para busca da remessa para análise$")
	public void _realizarofiltroparabuscadaremessaparaanalise() throws Throwable {
		contas.realizarFiltroParaBuscaDaRemessa();

	}

	@And("^selecionar Atualizar para análise$")
	public void selecionaAtualizarParaAnalise() throws Throwable {
		contas.selec_Atualizar();

	}

	@And("^selecionar a remessa desejada para análise$")
	public void selecionarRemessaDesejadaParaAnalise() throws Throwable {
		contas.selec_RemessaDesejada();
		contas.selecionarContinuarRemessaDesejada();

	}

	@And("^selecinar Desbloquear para análise$")
	public void selecionarDesbloquearRemessaDesejadaParaAnalise() throws Throwable {
		contas.selecionarDesbloquearRemessaDesejada();
		contas.alertaDesbloquearRemessaDesejada();
	}

	@And("^selecionar assumir para análise$")
	public void selecionarassumirparaanalise() throws Throwable {
		// contas.alertaSelecionarAssumirRemessaDesejada();remessa de outro usuario
		// não tem massa
	}

	@Then("^a remessa fica assumida para o usuário logado para análise$")
	public void aremessaficaassumidaparaousuáriologadoparaanalise() throws Throwable {
		System.out.println("Remessa desbloqueada para o usuario logado...");
		// verificar se será suficiente
	}

	// Scenario: Excluir uma guia da remessa
	@Given("^que tenha uma remessa já gerada guia$")
	public void quetenhaumaremessajágeradaguia() throws Throwable {

	}

	@When("^realizar o filtro para busca da remessa guia$")
	public void realizar_ofiltroparabuscadaremessaguia() throws Throwable {

		contas.realizar_ofiltroparabuscadaremessaguia();

	}

	@And("^selecionar Atualizar guia$")
	public void selecionarAtualizarguia() throws Throwable {

		this.selecionaAtualizarParaAnalise();

	}

	@And("^selecionar a remessa desejada guia$")
	public void selecionararemessadesejadaguia() throws Throwable {
		contas.selecionarremessadesejadadaguia();
		contas.selecionarContinuarRemessaDesejada();

	}

	@And("^optar por selecionar a guia Protocolada e ou processada guia$")
	public void selecionaraguiaProtocoloadaprocessadaguia() throws Throwable {
		// metodo de selecao guia do grid
		// contas.selecionarguiaProtocoladaProcessadaGuia();

	}

	@And("^selecionar Excluir guia$")
	public void selecionarExcluirguia() throws Throwable {
		contas.selecionarExcluirGuia();
	}

	@Then("^a guia é excluída da remessa guia$")
	public void aguiaéexcluídadaremessaguia() throws Throwable {

		contas.alertaGuiaExcluida();

	}

	// Scenario: Validar ações próxima, anterior, ocorrências de remessas e fechar
	@Given("^que tenha uma remessa já gerada ações$")
	public void quetenhaumaremessajágeradaações() throws Throwable {

	}

	@When("^realizar o filtro para busca da remessa ações$")
	public void realizarofiltroparabuscadaremessaações() throws Throwable {
		contas.realizar_ofiltroparabuscadaremessaguia();

	}

	@And("^selecionar Atualizar ações$")
	public void selecionarAtualizarações() throws Throwable {
		this.selecionaAtualizarParaAnalise();
	}

	@And("^selecionar a remessa desejada ações$")
	public void selecionararemessadesejadaações() throws Throwable {
		contas.selecionarremessadesejadadaguia();
		contas.selecionarContinuarRemessaDesejada();

	}

	@And("^selecionar Ocorrências da Remessa ações$")
	public void selecionarOcorrênciasdaRemessaações() throws Throwable {

		contas.selecionarOcorrenciasDaRemessa();
	}

	@And("^o sistema apresenta um pop-up com ocorrências ações$")
	public void osistemaapresentaumpopupcomocorrênciasações() throws Throwable {

	}

	@And("^selecinar Próxima ações$")
	public void selecinarPróximaações() throws Throwable {
		contas.selecionarProximaAções();
	}

	@And("^o sistema passa para a remessa seguinte da fila ações$")
	public void osistemapassaparaaremessaseguintedafilaações() throws Throwable {

	}

	@And("^selecinar Anterior ações$")
	public void selecinarAnteriorações() throws Throwable {

	}

	@And("^o sistema volta para a remessa anterior da fila ações$")
	public void osistemavoltapararemessaanteriordafilaações() throws Throwable {

	}

	@And("^selecionar fechar ações$")
	public void selecionarfecharações() throws Throwable {
		contas.selecionarFecharAções();

	}

	@Then("^o sistema fecha a remessa que estava em tela e volta para a página inicial do menu Análise Remessa por Referência ações$")
	public void osistemafechaaremessaqueestavaemtelaevoltaparaapáginainicialdomenuAnáliseRemessaporReferênciaAções()
			throws Throwable {

	}

	// #analisando os procedimentos dentro da guia que é dentro da remessa
	// Scenario: Validar dados de uma análise de conta
	

	

	

	

	

	

	
	

	
	
	
	

	// Scenario: Validar análise de uma conta com glosa em um ou mais procedimentos
	@Given("^que tenha uma remessa já gerada validar análise$")
	public void quetenhaumaremessajágeradavalidaranalise() throws Throwable {

	}

	@When("^realizar o filtro para busca da remessa validar análise$")
	public void realizarofiltroparabuscadaremessavalidaranalise() throws Throwable {
		contas.realizarFiltroParaBuscaDaRemessaValidarAnalise();

	}

	@And("^selecionar Atualizar validar análise$")
	public void selecionarAtualizarvalidaranalise() throws Throwable {
		contas.selec_Atualizar();

	}

	@And("^selecionar a remessa desejada validar análise$")
	public void selecionararemessadesejadavalidaranalise() throws Throwable {
		contas.selecionarremessadesejadadaguia();

	}

	@And("^selecionar uma guia Processada c/ glosa validar análise$")
	public void selecionarumaguiaProcessadacglosavalidaranalise() throws Throwable {
		contas.selecionarguiaProtocoladaProcessadaGuia();

	}

	@And("^selecionar Alterar validar análise$")
	public void selecionarAlterarvalidaranalise() throws Throwable {
		// contas.selecionarExcluirGuia();
		//contas.selecionarAlterarGuia();

	}

	@And("^selecinar o procedimento validar análise$")
	public void selecinaroprocedimentovalidaranalise() throws Throwable {

	}

	@And("^selecionar Análise de Procedimentos validar análise$")
	public void selecionarAnálisedeProcedimentosvalidaranalise() throws Throwable {
		 //contas.selecionarAnáliseDeProcedimentosValidarAnalise();

	}

	@And("^liberar a glosa validar análise$")
	public void liberaraglosavalidaranalise() throws Throwable {
	}

	@And("^selecionar Executar validar análise$")
	public void selecionarExecutarvalidaranalise() throws Throwable {
	}

	@Then("^o sistema permite Submeter a guia e a mesma fica com o status análisado validar análise$")
	public void osistemapermiteSubmeteraguiaeamesmaficacomostatusanálisadovalidaranalise() throws Throwable {
	}

	// Scenario: Validar retorno da situação de uma guia
	@Given("^que tenha uma remessa já gerada Validar retorno$")
	public void quetenhaumaremessajágeradavalidarretorno() throws Throwable {
	}

	@When("^realizar o filtro para busca da remessa Validar retorn$")
	public void realizarofiltroparabuscadaremessavalidarretorno() throws Throwable {
	}

	@And("^selecionar Atualizar Validar retorno$")
	public void selecionarAtualizavalidarretorno() throws Throwable {
	}

	@And("^selecionar a remessa desejada Validar retorno$")
	public void selecionararemessadesejadavalidarretorno() throws Throwable {
	}

	@And("^selecionar uma guia Análisada  Validar retorno$")
	public void selecionarumaguiaAnálisadavalidarretorno() throws Throwable {
	}

	@And("^selecionar Alterar Validar retorno$")
	public void selecionarAlterarvalidarretorno() throws Throwable {
	}

	@And("^selecionar Voltar situação Validar retorno$")
	public void selecionarVoltarsituaçãovalidarretorno() throws Throwable {
	}

	@And("^o status da guia volta para Processada Validar retorno$")
	public void ostatusdaguiavoltaparaProcessadavalidarretorno() throws Throwable {
	}

	@And("^selecionar um Procedimento Validar retorno$")
	public void selecionarumProcedimentovalidarretorno() throws Throwable {
	}

	@And("^elecionar Reprocessar Validar retorno$")
	public void selecionarReprocessarvalidarretorno() throws Throwable {
	}

	@Then("^o procedimento Reprocessado fica editável para alteração Validar retorno$")
	public void oprocedimentoReprocessadoficaeditávelparaalteraçãovalidarretorno() throws Throwable {
	}

	// Scenario: Validar desvincular procedimentos
	@Given("^que tenha uma remessa já gerada validar desvinculo$")
	public void quetenhaumaremessajágeradavalidardesvincular() throws Throwable {
	}

	@When("^realizar o filtro para busca da remessa vslifsr desvinculo$")
	public void realizarofiltroparabuscadaremessavalidardesvinculo() throws Throwable {
	}

	@And("^selecionar Atualizar validar desvinculo$")
	public void selecionarAtualizarvalidardesvinculo() throws Throwable {
	}

	@And("^selecionar a remessa desejada validar desvinculo$")
	public void selecionararemessadesejadavalidardesvinculo() throws Throwable {
	}

	@And("^selecionar uma guia validar desvinculo$")
	public void selecionarumaguiavalidardesvinculo() throws Throwable {
	}

	@And("^selecionar Alterar validar desvinculo$")
	public void selecionarAlterarvalidardesvinculo() throws Throwable {
	}

	@And("^selecionar um Procedimento validar desvinculo$")
	public void selecionarumProcedimentovalidardesvinculo() throws Throwable {
	}

	@And("^selecionar Desvincular Procedimentos validar desvinculo$")
	public void selecionarDesvincularProcedimentosvalidardesvinculo() throws Throwable {
	}

	@Then("^o procedimento não fica mais visível na tela análise da conta validar desvinculo$")
	public void oprocedimentonãoficamaisvisívelnatelaanálisedacontavalidardesvinculo() throws Throwable {
	}

	/*
	 
	

	@When("^selecionar o menu Conta Odontológica,Análise Remessa por Referência$")
	public void selecionarOMenuContaOdontológicaAnáliseRemessaPorReferência() throws Throwable {
		initiate();
		wait = new WebDriverWait(driver, 10);
		frame.sairFrame();

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("filtro_menu")));
		element.sendKeys("Análise Remessa por Referência");
		driver.findElement(By.id("btn-filtro-menu")).click();
		driver.findElement(By.partialLinkText("Análise Remessa por Referência")).click();

		mudarPrincipal();
	}
 */
	@Given("^que tenha uma remessa já gerada Validar dados$")
	public void queTenhaUmaRemessaJáGeradaValidarDados() throws Throwable {
		mudarToolbar();

	}

	@When("^realizar o filtro para busca da remessa Validar dados$")
	public void realizarOFiltroParaBuscaDaRemessaValidarDados() throws Throwable {
		driver.findElement(By.id("btn_Atualizar();")).click();
	}

	@When("^selecionar Atualizar Validar dados$")
	public void selecionarAtualizarValidarDados() throws Throwable {
	}

	@When("^selecionar a remessa desejada Validar dados$")
	public void selecionarARemessaDesejadaValidarDados() throws Throwable {
		mudarPrincipal();
		WebElement tabelaRemessa = driver.findElement(By.id("grid_remessas"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("//tr[@class='ui-widget-content jqgrow ui-row-ltr']"));

		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			campos.get(0).click();
			break;
		}

		mudarToolbar();
		driver.findElement(By.id("btn_acao_continuar")).click();
	}

	@When("^selecionar a guia desejada Validar dados$")
	public void selecionarAGuiaDesejadaValidarDados() throws Throwable {
		mudarPrincipal();
		List<WebElement> guias = driver.findElements(By.name("check_grid"));
		if (!guias.get(0).isSelected()) {
			guias.get(0).click();
		}
	}

	@When("^selecionar Alterar Validar dados$")
	public void selecionarAlterarValidarDados() throws Throwable {

		mudarToolbar();
		try {
			driver.findElement(By.id("btn_AcaoDesbloquearRemessa();")).click();
			frame.alertaObterConfirmar();
		} catch (Exception e) {
			System.out.println("Não precisa Desbloquear");
		}
		try {
			driver.findElement(By.id("btn_acao_tela(\"C\");")).click();
			frame.alertaObterConfirmar();
		} catch (Exception e) {
			try {
				mudarToolbar();
				driver.findElement(By.id("btn_AcaoAssumirRemessaBotao();")).click();
				frame.alertaObterConfirmar();
			} catch (Exception e1) {
				try {
					driver.findElement(By.id("btn_acao_voltar_situacao();")).click();
					frame.alertaObterConfirmar();
				} catch (Exception ex) {
					System.out.println("Não foi preciso assumiri a remessa");
				}
			}
		}

		driver.findElement(By.id("btn_acao_tela(\"A\");")).click();

		mudarPrincipal();
	}

	@When("^validar dados da seção Encaminhamento Validar dados$")
	public void validarDadosDaSeçãoEncaminhamentoValidarDados() throws Throwable {
		mudarPrincipal();
		driver.findElement(By.linkText("Encaminhamento")).click();
		WebElement encaminhamento = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("opt_encaminhamento")));
		assertTrue(encaminhamento.isDisplayed());
	}

	@When("^validar dados da seção Informações Validar dados$")
	public void validarDadosDaSeçãoInformaçõesValidarDados() throws Throwable {
		driver.findElement(By.linkText("Informações")).click();
		WebElement encaminhamento = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("cod_prestador_exec")));
		assertTrue(encaminhamento.isDisplayed());
	}

	@When("^incluir uma Observação Validar dados$")
	public void incluirUmaObservaçãoValidarDados() throws Throwable {

		driver.findElement(By.linkText("Observações")).click();
		WebElement obs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_obs_operadora")));
		obs.sendKeys(String.format("Comentário Automatizado %s", Calendar.getInstance().getTime()));

		obs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_obs_emissao")));
		obs.sendKeys(String.format("Comentário Automatizado %s", Calendar.getInstance().getTime()));
	}

	@When("^incluir um Anexo Validar dados$")
	public void incluirUmAnexoValidarDados() throws Throwable {
		System.out.println("Módulo de Anexo não está funcionando");
	}

	@When("^validar as últimas Ocorrências realizadas Validar dados$")
	public void validarAsÚltimasOcorrênciasRealizadasValidarDados() throws Throwable {
		driver.findElement(By.linkText("Ocorrências")).click();
		WebElement encaminhamento = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("dvComboGridOcorrencia")));
		assertTrue(encaminhamento.isDisplayed());
	}

	@Then("^o sistema permite Submeter a remessa com sucesso Validar dados$")
	public void oSistemaPermiteSubmeterARemessaComSucessoValidarDados() throws Throwable {
		try {
			mudarToolbar();
			driver.findElement(By.id("btn_acao_analisar();")).click();
			mudarPrincipal();
			mudarToolbar();
			driver.findElement(By.id("btn_acao_submeter();")).click();
			mudarPrincipal();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private WebDriverWait wait;

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

}
