package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1072CalendarioGeral extends UtilsSteps{
	
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos, Parametrizações, Calendário Geral de Pagamentos a Prestadores$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosParametrizaçõesCalendárioGeralDePagamentosAPrestadores() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		menugestao.MenuGestaoPrestadoresOdontologicos();
		menugestao.Parametrizacoes();
		menugestao.CalendarioGeral();
	}

	@When("^Informar um Ano$")
	public void informarUmAno() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
	     frame.framePaginaInicial("//*[@id='principal2']");
	     gestao.Ano();
	     
	}

	@When("^clicar Continuar$")
	public void clicarContinuar() throws Throwable {
		frame.clicar_fora("//*[@id='ano_calendario']");
	}

	@When("^preencher os dados solicitados$")
	public void preencherOsDadosSolicitados() throws Throwable {
	    gestao.AdicionarData();
		gestao.DiaLimite();
	    gestao.DiaFechamento();
	    gestao.DiaPagamento();
	}

	@When("^clicar no botão Alterar$")
	public void clicarNoBotãoAlterar() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");

		gestao.Alterar();
		driver.switchTo().alert().accept();
	}
	
	@Then("^apresenta a mensagem Operação realizada com sucesso$")
	public void apresentaAMensagemOperaçãoRealizadaComSucesso() throws Throwable {
		frame.sairFrame();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");

		Thread.sleep(4000);

		gestao.ValideOperacao();
	}

}
