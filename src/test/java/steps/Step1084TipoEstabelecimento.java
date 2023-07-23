package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1084TipoEstabelecimento extends UtilsSteps {
	

	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Parametrizações , Tipo Estabelecimento$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosParametrizaçõesTipoEstabelecimento()
			throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.Parametrizacoes();
		menugestao.TipoEstabelecimento();

	}

	@When("^Informar um código não existente$")
	public void informarUmCódigoNãoExistente() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
	     frame.framePaginaInicial("//*[@id='principal2']");
	     gestao.Codigo();
	     frame.clicar_fora("//*[@id='cod_tipo_prestador']");
	}

	@When("^preencher os dados de inclusão$")
	public void preencherOsDadosDeInclusão() throws Throwable {
		
	}

	@When("^clicar no Incluir$")
	public void clicarNoIncluir() throws Throwable {

	}

	@Then("^apresenta a mensagem Operação realizada com sucesso\\.$")
	public void apresentaAMensagemOperaçãoRealizadaComSucesso() throws Throwable {

	}

	@When("^Informar um código existente$")
	public void informarUmCódigoExistente() throws Throwable {

	}

	@Then("^apresenta o resultado da busca$")
	public void apresentaOResultadoDaBusca() throws Throwable {

	}

	@When("^And clicar fora do campo$")
	public void andClicarForaDoCampo() throws Throwable {
	}

	@When("^realizar uma alteração nos dados$")
	public void realizarUmaAlteraçãoNosDados() throws Throwable {

	}

	@When("^clicar no Alterar$")
	public void clicarNoAlterar() throws Throwable {

	}

	@When("^clicar no botão Excluir$")
	public void clicarNoBotãoExcluir() throws Throwable {

	}

	@When("^O sistema apresenta a mensagem Deseja Realmente excluir$")
	public void oSistemaApresentaAMensagemDesejaRealmenteExcluir() throws Throwable {

	}

	@When("^clicar no botão Sim$")
	public void clicarNoBotãoSim() throws Throwable {
	}

}
