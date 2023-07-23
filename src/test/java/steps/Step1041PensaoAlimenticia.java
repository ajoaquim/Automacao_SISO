package steps;




import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1041PensaoAlimenticia extends UtilsSteps {

	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Cadastro Prestador, Pensão Alimentícia$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosCadastroPrestadorPensãoAlimentícia() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.CadastroPrestador();
		menugestao.PensaoAlimenticia();
	}

	@When("^Informar os dados de inclusão de prestador ja existente$")
	public void informarOsDadosDeInclusãoDePrestadorJaExistente() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		
		
		gestao.LimparConsulta();
		
		Thread.sleep(2000);
		
		
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		gestao.PrestadorSemPensao();

		alteracao.seleciona_fora();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "antes_inclusaoPensaoAlimenticia1041"); 
	}
	
	@When("^clicar fora do campo$")
	public void clicarForaDoCampo() throws Throwable {
	 
	}

	@When("^preencher os dados de inclusão de Beneficiário$")
	public void preencherOsDadosDeInclusãoDeBeneficiário() throws Throwable {
		gestao.AdicionarBeneficiario();
		gestao.NomeBeneficiario();
		gestao.CpfBeneficiario();
		gestao.BancoBeneficiario();
		gestao.AgenciaBeneficiario();
		gestao.ContaBeneficiario();
		gestao.DescontoDeAteBeneficiario();
		gestao.IncidenciaBeneficiario();
		gestao.ValorDescontoBeneficiario();
		
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "apos_inclusaoPensaoAlimenticia1041"); 

	}

	@When("^clicar no botão “Incluir”$")
	public void clicarNoBotãoIncluir() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");

		gestao.Incluir();
	}

	@Then("^a aplicacao apresenta a mensagem Operação realizada com sucesso$")
	public void aAplicacaoApresentaAMensagemOperaçãoRealizadaComSucesso() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");

		Thread.sleep(4000);

		gestao.ValideOperacao();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "OperacaoRealizadaComSucesso1041"); 
	}

	@When("^Escrever um Prestador ja existente$")
	public void escreverUmPrestadorJaExistente() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");

		gestao.LimparConsulta();

		Thread.sleep(2000);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");

		gestao.PrestadorSemPensao();
		alteracao.seleciona_fora();
	}

	@Then("^a aplicacao mostra o resultado da busca$")
	public void aAplicacaoMostraOResultadoDaBusca() throws Throwable {
		gestao.ValideConsultaPensao();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "consulta_PensaoAlimenticia1041"); 
	}

	@When("^fazer uma alteração nos dados$")
	public void fazerUmaAlteraçãoNosDados() throws Throwable {
		gestao.AlterarIncidenciaBeneficiario();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "alteração_PensaoAlimentcio1041"); 
	}

	@When("^Clicar no Alterar$")
	public void ClicarNoAlterar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");

		gestao.Alterar();
	}

	@When("^Selecionar Prestador ja existente$")
	public void selecionarPrestadorJaExistente() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");

		gestao.LimparConsulta();

		Thread.sleep(2000);
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");

		gestao.PrestadorSemPensao();
		alteracao.seleciona_fora();
	}

	@When("^Selecionar Fleg Excluir$")
	public void selecionarFlegExcluir() throws Throwable {
		gestao.Excluir();
	}
	



	

	
	
	
}
