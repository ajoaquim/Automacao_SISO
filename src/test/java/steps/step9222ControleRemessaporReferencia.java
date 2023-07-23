package steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.ContasOdontologicasi;

public class step9222ControleRemessaporReferencia extends UtilsSteps {
	@When("^selecionar o menu Conta Odontológica,Análise Remessa por Referênciaa$")
	public void selecionarOMenuContaOdontológicaAnáliseRemessaPorReferênciaa() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		contasodontologicasi.Menu_contas_odontologicas();
		contasodontologicasi.Menu_contas_AnaliseRemessaporReferncia();
		
	}

	@When("^realizar o filtro para busca da remessa para desbloqueio controle remessa por referencia$")
	public void realizarOFiltroParaBuscaDaRemessaParaDesbloqueioControleRemessaPorReferencia() throws Throwable {
//	    frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
//	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
//		contasodontologicasi.SelReferenciaAlt();
//	    contasodontologicasi.Situacao();
//	    contasodontologicasi.Nrremessa("38143");
//	    frame.sairFrame();
//	    frame.sairFrame();
	}

	@When("^selecionar Atualizar para desbloqueio controle remessa por referencia$")
	public void selecionarAtualizarParaDesbloqueioControleRemessaPorReferencia() throws Throwable {
//		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
//		frame.framePaginaInicial("//*[@id=\"toolbarMvcToAsp\"]");
//		contasodontologicasi.BotAtualizar();
	}

	@When("^selecionar a remessa desejada para desbloqueio controle remessa por referencia$")
	public void selecionarARemessaDesejadaParaDesbloqueioControleRemessaPorReferencia() throws Throwable {
//		Thread.sleep(2000);
//		contasodontologicasi.Botcontinuarnr();
	}

	@When("^selecionar Desbloquear para desbloqueio controle remessa por referencia$")
	public void selecionarDesbloquearParaDesbloqueioControleRemessaPorReferencia() throws Throwable {
//	    contasodontologicasi.Botdesbloquear();
//	    alteracao.alerta();
	    
	}

	@When("^selecionar assumir para desbloqueio controle remessa por referencia$")
	public void selecionarAssumirParaDesbloqueioControleRemessaPorReferencia() throws Throwable {
//		Thread.sleep(2000);
//		alteracao.alerta();
		
	}

	@Then("^a remessa fica assumida para o usuário logado para desbloqueio controle remessa por referencia$")
	public void aRemessaFicaAssumidaParaOUsuárioLogadoParaDesbloqueioControleRemessaPorReferencia() throws Throwable {
		//modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9222_remessa_assumida");
	}
//////////////
	@When("^realizar o filtro para busca da remessa para excluir menu controle remessa por referencia$")
	public void realizarOFiltroParaBuscaDaRemessaParaExcluirMenuControleRemessaPorReferencia() throws Throwable {
		frame.framePaginaInicial("//*[@id=\"iframeasp\"]");
	    frame.framePaginaInicial("//*[@id=\"principal2\"]");
		contasodontologicasi.SelReferenciaAlt();
		contasodontologicasi.SituacaoExluir();
	}

	@When("^selecionar Atualizar menu controle remessa por referencia$")
	public void selecionarAtualizarMenuControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^selecionar a remessa desejada menu controle remessa por referencia$")
	public void selecionarARemessaDesejadaMenuControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^selecionar a guia \\(Protocoloada/processada\\) menu controle remessa por referencia$")
	public void selecionarAGuiaProtocoloadaProcessadaMenuControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^selecionar Excluir menu controle remessa por referencia$")
	public void selecionarExcluirMenuControleRemessaPorReferencia() throws Throwable {
	    
	}

	@Then("^a guia é excluída da remessa menu controle remessa por referencia$")
	public void aGuiaÉExcluídaDaRemessaMenuControleRemessaPorReferencia() throws Throwable {
	    
	}
/////////////////////////
	@When("^realizar o filtro para busca da remessa para acoes menu validar controle remessa por referencia$")
	public void realizarOFiltroParaBuscaDaRemessaParaAcoesMenuValidarControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^selecionar Atualizar para acoes menu validar controle remessa por referencia$")
	public void selecionarAtualizarParaAcoesMenuValidarControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^selecionar a remessa desejada para acoes menu validar controle remessa por referencia$")
	public void selecionarARemessaDesejadaParaAcoesMenuValidarControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^selecionar Ocorrências da Remessa para acoes menu validar controle remessa por referencia$")
	public void selecionarOcorrênciasDaRemessaParaAcoesMenuValidarControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^o sistema apresenta um pop-up com ocorrências para acoes menu validar controle remessa por referencia$")
	public void oSistemaApresentaUmPopUpComOcorrênciasParaAcoesMenuValidarControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^selecinar Próxima para acoes menu validar controle remessa por referencia$")
	public void selecinarPróximaParaAcoesMenuValidarControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^o sistema passa para a remessa seguinte da fila para acoes menu validar controle remessa por referencia$")
	public void oSistemaPassaParaARemessaSeguinteDaFilaParaAcoesMenuValidarControleRemessaPorReferencia() throws Throwable {
	   
	}

	@When("^selecinar Anterior para acoes menu validar controle remessa por referencia$")
	public void selecinarAnteriorParaAcoesMenuValidarControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^o sistema volta para a remessa anterior da fila para acoes menu validar controle remessa por referencia$")
	public void oSistemaVoltaParaARemessaAnteriorDaFilaParaAcoesMenuValidarControleRemessaPorReferencia() throws Throwable {
	    
	}

	@When("^selecionar fechar para acoes menu validar controle remessa por referencia$")
	public void selecionarFecharParaAcoesMenuValidarControleRemessaPorReferencia() throws Throwable {
	    
	}

	@Then("^o sistema fecha a remessa que estava em tela e volta para a página inicial do menu Análise Remessa por Referência$")
	public void oSistemaFechaARemessaQueEstavaEmTelaEVoltaParaAPáginaInicialDoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}
/////////////////////////
	@When("^realizar o filtro para busca da remessa para validar dados menu Análise Remessa por Referência$")
	public void realizarOFiltroParaBuscaDaRemessaParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Atualizar para validar dados menu Análise Remessa por Referência$")
	public void selecionarAtualizarParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar a remessa desejada para validar dados menu Análise Remessa por Referência$")
	public void selecionarARemessaDesejadaParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar a guia desejada para validar dados menu Análise Remessa por Referência$")
	public void selecionarAGuiaDesejadaParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Alterar para validar dados menu Análise Remessa por Referência$")
	public void selecionarAlterarParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^validar dados da seção Encaminhamento para validar dados menu Análise Remessa por Referência$")
	public void validarDadosDaSeçãoEncaminhamentoParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^validar dados da seção Informações para validar dados menu Análise Remessa por Referência$")
	public void validarDadosDaSeçãoInformaçõesParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^incluir uma Observação para validar dados menu Análise Remessa por Referência$")
	public void incluirUmaObservaçãoParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^incluir um Anexo para validar dados menu Análise Remessa por Referência$")
	public void incluirUmAnexoParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^validar as últimas Ocorrências realizadas para validar dados menu Análise Remessa por Referência$")
	public void validarAsÚltimasOcorrênciasRealizadasParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@Then("^o sistema permite Submeter a remessa com sucesso para validar dados menu Análise Remessa por Referência$")
	public void oSistemaPermiteSubmeterARemessaComSucessoParaValidarDadosMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}
////////////////
	@When("^realizar o filtro para busca da remessa para analise menu Análise Remessa por Referência$")
	public void realizarOFiltroParaBuscaDaRemessaParaAnaliseMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Atualizar para analise menu Análise Remessa por Referência$")
	public void selecionarAtualizarParaAnaliseMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar a remessa desejada para analise menu Análise Remessa por Referência$")
	public void selecionarARemessaDesejadaParaAnaliseMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar uma guia Processada c/ glosa para analise menu Análise Remessa por Referência$")
	public void selecionarUmaGuiaProcessadaCGlosaParaAnaliseMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Alterar para analise menu Análise Remessa por Referência$")
	public void selecionarAlterarParaAnaliseMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecinar o procedimento para analise menu Análise Remessa por Referência$")
	public void selecinarOProcedimentoParaAnaliseMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Análise de Procedimentos para analise menu Análise Remessa por Referência$")
	public void selecionarAnáliseDeProcedimentosParaAnaliseMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^liberar a glosa para analise menu Análise Remessa por Referência$")
	public void liberarAGlosaParaAnaliseMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Executar para analise menu Análise Remessa por Referência$")
	public void selecionarExecutarParaAnaliseMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@Then("^o sistema permite Submeter a guia e a mesma fica com o status análisado para analise menu Análise Remessa por Referência$")
	public void oSistemaPermiteSubmeterAGuiaEAMesmaFicaComOStatusAnálisadoParaAnaliseMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}
///////////////////////////
	@When("^realizar o filtro para busca da remessa validar retorno menu Análise Remessa por Referência$")
	public void realizarOFiltroParaBuscaDaRemessaValidarRetornoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Atualizar validar retorno menu Análise Remessa por Referência$")
	public void selecionarAtualizarValidarRetornoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar a remessa desejada validar retorno menu Análise Remessa por Referência$")
	public void selecionarARemessaDesejadaValidarRetornoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar uma guia Análisada validar retorno menu Análise Remessa por Referência$")
	public void selecionarUmaGuiaAnálisadaValidarRetornoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Alterar validar retorno menu Análise Remessa por Referência$")
	public void selecionarAlterarValidarRetornoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Voltar situação validar retorno menu Análise Remessa por Referência$")
	public void selecionarVoltarSituaçãoValidarRetornoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^o status da guia volta para Processada validar retorno menu Análise Remessa por Referência$")
	public void oStatusDaGuiaVoltaParaProcessadaValidarRetornoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar um Procedimento validar retorno menu Análise Remessa por Referência$")
	public void selecionarUmProcedimentoValidarRetornoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Reprocessar validar retorno menu Análise Remessa por Referência$")
	public void selecionarReprocessarValidarRetornoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@Then("^o procedimento Reprocessado fica editável para alteração validar retorno menu Análise Remessa por Referência$")
	public void oProcedimentoReprocessadoFicaEditávelParaAlteraçãoValidarRetornoMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}
////////////
	@When("^realizar o filtro para busca da remessa validar desvincular menu Análise Remessa por Referência$")
	public void realizarOFiltroParaBuscaDaRemessaValidarDesvincularMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Atualizar validar desvincular menu Análise Remessa por Referência$")
	public void selecionarAtualizarValidarDesvincularMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar a remessa desejada validar desvincular menu Análise Remessa por Referência$")
	public void selecionarARemessaDesejadaValidarDesvincularMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar uma guia validar desvincular menu Análise Remessa por Referência$")
	public void selecionarUmaGuiaValidarDesvincularMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar Alterar validar desvincular menu Análise Remessa por Referência$")
	public void selecionarAlterarValidarDesvincularMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@When("^selecionar um Procedimento validar desvincular menu Análise Remessa por Referência$")
	public void selecionarUmProcedimentoValidarDesvincularMenuAnáliseRemessaPorReferência() throws Throwable {
	   
	}

	@When("^selecionar Desvincular Procedimentos validar desvincular menu Análise Remessa por Referência$")
	public void selecionarDesvincularProcedimentosValidarDesvincularMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}

	@Then("^o procedimento não fica mais visível na tela análise da conta validar desvincular menu Análise Remessa por Referência$")
	public void oProcedimentoNãoFicaMaisVisívelNaTelaAnáliseDaContaValidarDesvincularMenuAnáliseRemessaPorReferência() throws Throwable {
	    
	}
}