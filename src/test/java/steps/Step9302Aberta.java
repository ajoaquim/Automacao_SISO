package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9302Aberta extends UtilsSteps {

	@When("^acesse a aba \"([^\"]*)\",\"([^\"]*)\"$")
	public void acesseAAba(String arg1, String funcao) throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		work.acessoWorkflow();
		switch (funcao) {
		case "Aberta":
			work.workflowAbertura();
			break;
		case "Análise":
			work.workflowAnalise();
			break;
		case "Registro Atividade":
			work.workflowRegistroAtividade();
			break;
		case "Consulta Geral":
			work.workflowConsultaGeral();
			break;
		case "Consulta Própria":
			work.workflowConsultaPropria();
			break;
		case "Encerramento":
			 work.workflowEncerramento();
			break;
		case "Histórico":
			work.workflowHistorico();
			break;
		case "Reabertura":
			work.workflowReabertura();
			break;
		
		case "Redirecionamento":
			work.workflowRedirecionamento();
			break;

		case "Situação":
			work.workflowSituacao();
			
			frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
			WebElement btContinuar = driver.findElement(By.cssSelector("#btn_acao_continuar > img"));
			btContinuar.click(); 
			break;		
			
		}
	}
	

	@When("^informar um tipo de \"([^\"]*)\"$")
	public void informarUmTipoDe(String arg1) throws Throwable {

		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.aberturaUsuarioPrestador();

	}

	@When("^clicar fora do campo Abertura$")
	public void clicarForaDoCampoAbertura() throws Throwable {
		work.aberturaUsuarioContrato();

	}

	@When("^informar os dados de inclusão$")
	public void informarOsDadosDeInclusão() throws Throwable {

		work.aberturaUsuarioDadosInclusao();

	}

	@When("^clicar em \"([^\"]*)\"$")
	public void clicarEm(String arg1) throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		modulo.screenshot(driver, System.currentTimeMillis(), "workflow", "WorkflowAbertoFormulario");
		work.worflowExecutar();

	}

	@When("^o sistema na tela workflow apresenta a mensagem \"([^\"]*)\"$")
	public void oSistemaNaTelaWorkflowApresentaAMensagem(String arg1) throws Throwable {

		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.aberturaAccertConfirm();

	}

	@Then("^a solicitação é enviada para fila de análise$")
	public void aSolicitaçãoÉEnviadaParaFilaDeAnálise() throws Throwable {
		Thread.sleep(3000);
		modulo.screenshot(driver, System.currentTimeMillis(), "workflow", "WorkFlowResultado");

	}

	@When("^o sistema apresenta a mensagem \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagem(String arg1) throws Throwable {

	}

}
