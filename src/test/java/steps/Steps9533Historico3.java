
package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//public class Steps9533Historico3 extends UtilsSteps{
//	@When("^optar por selecionar o menu \"([^\"]*)\",\"([^\"]*)\"$")
//	public void optarPorSelecionarOMenu(String arg1, String arg2) throws Throwable {
//		initiate();
//		frame.sairFrame();
//		frame.sairFrame();
//		reembolso.acessarReembolso("Histórico");
//	}
//	   
//	@When("^informar um \"([^\"]*)\" existente historico$")
//	public void informarUmExistenteHistorico(String arg1) throws Throwable {
//		frame.framePaginaInicial("//*[@id='iframeasp']");
//		 frame.framePaginaInicial("//*[@id='principal2']");
//		 reembolso.inputReembolso("823");
//	}
//
//	@When("^clicar no Botão \"([^\"]*)\" historico$")
//	public void clicarNoBotãoHistorico(String arg1) throws Throwable {
//		frame.clicar_fora("//*[@id=\"num_reembolso\"]"); 
//	}
//
//	@Then("^o sistema apresenta o resultado da busca historico$")
//	public void oSistemaApresentaOResultadoDaBuscaHistorico() throws Throwable {
//		frame.sairFrame(); // frame.framePaginaInicial("//*[@id='iframeasp']");=
//		frame.framePaginaInicial("//*[@id='iframeasp']");
//		frame.framePaginaInicial("//*[@id='principal2']"); 
//		String element = "#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > font";
//		Thread.sleep(4000);
//		work.validarMensagem(element, "Historico", "seletor");
//		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9533_Historico_1");
//	}
//	
//	//Cenario B
//	
//	@When("^informar um Reembolso Enviado para Pagamento historico$")
//	public void informarUmReembolsoEnviadoParaPagamentoHistorico() throws Throwable {
//		frame.framePaginaInicial("//*[@id='iframeasp']");
//		frame.framePaginaInicial("//*[@id='principal2']");
//		reembolso.inputReembolso("813");
//	}
//
//	@When("^clicar no Botão Continuar historico(\\d+)$")
//	public void clicarNoBotãoContinuarHistorico(int arg1) throws Throwable {
//		frame.clicar_fora("//*[@id=\"num_reembolso\"]"); 
//	}
//
//	@When("^Clicar no Botão Voltar Situação historico$")
//	public void clicarNoBotãoVoltarSituaçãoHistorico() throws Throwable {
//		 frame.sairFrame();
//		 frame.framePaginaInicial("//*[@id='iframeasp']");
//		 frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
//		 reembolso.voltarSituação();
//	}
//
//	@When("^o sistema apresenta a mensagem Deseja voltar a situação do Reembolso para Em análise\\? historico$")
//	public void oSistemaApresentaAMensagemDesejaVoltarASituaçãoDoReembolsoParaEmAnáliseHistorico() throws Throwable {
//		//modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9533_Historico_1");
//	}
//
//	@When("^Clicar no Botão OK historico(\\d+)$")
//	public void clicarNoBotãoOKHistorico(int arg1) throws Throwable {
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//	}
//
//	@Then("^O Sistema apresente a mensagem Situação do reembolso retornada com sucesso\\. historico$")
//	public void oSistemaApresenteAMensagemSituaçãoDoReembolsoRetornadaComSucessoHistorico() throws Throwable {
//		frame.sairFrame();
//		frame.framePaginaInicial("//*[@id='iframeasp']");
//		frame.framePaginaInicial("//*[@id='principal2']");
//		String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
//		String txtEsperado = "Situação do reembolso [0-9]* retornada com sucesso.";
//		Thread.sleep(4000);
//		work.validarMensagem(element, txtEsperado, "seletor");
//		modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9533_Historico_2");
//	}

