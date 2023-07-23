package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1068PesquisaRedeAtendimento extends UtilsSteps{
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos,Consulta Prestador,Pesquisa Rede Atendimento$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosConsultaPrestadorPesquisaRedeAtendimento() throws Throwable {
		initiate();
	    frame.sairFrame();
	    frame.sairFrame();
	    alteracao.Menu_Gestão_Prestadores_odontologicos();
	    menugestao.ConsultaPrestador();
	    Thread.sleep(1000);
	    menugestao.MenuConsutaPesquisaredeatendimento();
	}

	@When("^informar um ou mais filtros na tela consulta rede atendimento$")
	public void informarUmOuMaisFiltrosNaTelaConsultaRedeAtendimento() throws Throwable {
		alteracao.Tpestabelecimento();
	}

	@When("^selecionar Tela em Formato de Saída$")
	public void selecionarTelaEmFormatoDeSaída() throws Throwable {
		alteracao.SaidaTela();
	}

	@When("^clicar em Continuar na tela consulta rede atendimento$")
	public void clicarEmContinuarNaTelaConsultaRedeAtendimento() throws Throwable {
	    frame.sairFrame();
		alteracao.BotContinuar();
	}

	@Then("^o sistema exibe na tela o resultado da pesquisa na tela consulta rede atendimento$")
	public void oSistemaExibeNaTelaOResultadoDaPesquisaNaTelaConsultaRedeAtendimento() throws Throwable {
	    alteracao.Confirmatela();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "Pesquisa_de_atendimentos");
	}

	@When("^informar um ou mais filtros$")
	public void informarUmOuMaisFiltros() throws Throwable {
		alteracao.Tpestabelecimento();
	}

	@When("^selecionar Arquivo em Formato de Saída$")
	public void selecionarArquivoEmFormatoDeSaída() throws Throwable {
	    alteracao.SaidaArq();
	}

	@When("^selecionar Grafica em Tipo Arquivo$")
	public void selecionarGraficaEmTipoArquivo() throws Throwable {
	    alteracao.TpArq();
	}

	@Then("^o sistema gera arquivo do resultado da pesquisa na tela consulta rede atendimento$")
	public void oSistemaGeraArquivoDoResultadoDaPesquisaNaTelaConsultaRedeAtendimento() throws Throwable {
		Thread.sleep(4000);
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "Pesquisa_de_atendimentos_arquivo");
	}

	@When("^selecionar Arquivo Texto em Tipo Arquivo$")
	public void selecionarArquivoTextoEmTipoArquivo() throws Throwable {
	    alteracao.TpArqtexto();
	}

	@When("^selecionar Email em Formato de Saída$")
	public void selecionarEmailEmFormatoDeSaída() throws Throwable {
	    alteracao.SaidaEmail();
	}

	@When("^informar Email$")
	public void informarEmail() throws Throwable {
	    alteracao.Email("teste2@teste.com");
	}

	@When("^selecionar Texto em Tipo Arquivo$")
	public void selecionarTextoEmTipoArquivo() throws Throwable {
	    alteracao.TpArqtexto();
	}
}
