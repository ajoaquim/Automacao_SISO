package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1263ConsultaOcorrencia extends UtilsSteps{
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos,Consulta Prestador,Ocorrências$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosConsultaPrestadorOcorrências() throws Throwable {
		initiate();
	    frame.sairFrame();
	    frame.sairFrame();
	    alteracao.Menu_Gestão_Prestadores_odontologicos();
	    menugestao.ConsultaPrestador();
	    Thread.sleep(1000);
	    menugestao.MenuConsutaOcorrencias();
	}

	@When("^selecionar um Prestrador existente na tela de consulta de ocorrencias$")
	public void selecionarUmPrestradorExistenteNaTelaDeConsultaDeOcorrencias() throws Throwable {
	    alteracao.LimparConsulta();
	    frame.sairFrame();
	    Thread.sleep(2000);
		alteracao.Informa_prestador("011010");
	}

	@When("^clicar fora do campo na tela de consulta de ocorrencias$")
	public void clicarForaDoCampoNaTelaDeConsultaDeOcorrencias() throws Throwable {
	    alteracao.seleciona_fora();
	    Thread.sleep(2000);
	}

	@Then("^o sistema apresenta o resultado da busca na tela de consulta de ocorrencias$")
	public void oSistemaApresentaOResultadoDaBuscaNaTelaDeConsultaDeOcorrencias() throws Throwable {
	    alteracao.Confirmaotpocorrencia();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "Ocorrencia");
	}
}
