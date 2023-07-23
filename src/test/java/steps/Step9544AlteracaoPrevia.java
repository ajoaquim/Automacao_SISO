package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9544AlteracaoPrevia extends UtilsSteps {
    String windowsHandler;
//Cenario A
@When("^optar por selecionar o menu \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" alteração$")
public void optarPorSelecionarOMenuAlteração(String arg1, String arg2, String arg3) throws Throwable {
	initiate();
	frame.sairFrame();
	frame.sairFrame();
//	reembolso.acessarReembolso("Prévia");
	reembolso.submenPrevia("Alteração");
}

@When("^informar um \"([^\"]*)\" existente com Status de \"([^\"]*)\" alteração$")
public void informarUmExistenteComStatusDeAlteração(String arg1, String arg2) throws Throwable {
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.inputPrevia("381");
	frame.clicar_fora("//*[@id=\"num_previa\"]");
}



@When("^realizar um alteração nos dados alteração$")
public void realizarUmAlteraçãoNosDadosAlteração() throws Throwable {
    frame.sairFrame();
    frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.editarObsEmissao("teste teste");
	modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario1_1");
	Thread.sleep(2000);
	
}

@When("^clicar no botão \"([^\"]*)\" alteração$")
public void clicarNoBotãoAlteração(String arg1) throws Throwable {
    frame.sairFrame();
    frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	reembolso.clicarAlteracaoAnalise();
}
@Then("^o sistema apresenta a mensagem \"([^\"]*)\" alteração$")
public void oSistemaApresentaAMensagemAlteração(String arg1) throws Throwable {
	frame.sairFrame();
    frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
					 
	work.validarMensagem(element,"Alteração/Análise pedido nº [0-9]* realizada.","seletor");
	modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario1_2");
}

//Cenário B


@When("^informar um número de prévia existente com Status de em Análise$")
public void informarUmNúmeroDePréviaExistenteComStatusDeEmAnálise() throws Throwable {
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.inputPrevia("843");
	
}

@When("^clicar no botão Continuar alteracao$")
public void clicarNoBotãoContinuarAlteracao() throws Throwable {
	frame.clicar_fora("//*[@id=\"num_previa\"]");
}

@When("^clicar no botão Submeter alteracao$")
public void clicarNoBotãoSubmeterAlteracao() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	reembolso.submeterAlteracao();
	Thread.sleep(2000);
}

@When("^o sistema apresenta a mensagem Deseja finalizar a prévia de Reembolso\\? alteracao$")
public void oSistemaApresentaAMensagemDesejaFinalizarAPréviaDeReembolsoAlteracao() throws Throwable {
	driver.switchTo().alert().accept();
}

@Then("^o sistema apresenta a mensagem Operação realizada com sucesso alteracao$")
public void oSistemaApresentaAMensagemOperaçãoRealizadaComSucessoAlteracao() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
	//work.validarMensagem(element, txtEsperado, tipo);
	modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario2_1");
	
}
//Cenário C
@When("^informar um \"([^\"]*)\"existente com Status de \"([^\"]*)\"$")
public void informarUmExistenteComStatusDe(String arg1, String arg2) throws Throwable {
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.inputPrevia("847");
	frame.clicar_fora("//*[@id=\"num_previa\"]");
}

@Then("^Sistema exibe a tela de Prévia sem a opção de alteração dos campos$")
public void sistemaExibeATelaDePréviaSemAOpçãoDeAlteraçãoDosCampos() throws Throwable {
	
	//modulo.screenshot(driver, System.currentTimeMillis(),"Reembolso","9540_Previa_Alteracao_Cenario3_1");
	modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario3_1");
	
	
}

//Cenário D

@When("^informar um \"([^\"]*)\" existente com Status de \"([^\"]*)\" previa$")
public void informarUmExistenteComStatusDePrevia(String arg1, String arg2) throws Throwable {
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.inputPrevia("581");
	
}

@When("^clicar no botão  Continuar previa$")
public void clicarNoBotãoContinuarPrevia() throws Throwable {
	frame.clicar_fora("//*[@id=\"num_previa\"]");
}

@When("^clicar no botão Cancelar previa$")
public void clicarNoBotãoCancelarPrevia() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	reembolso.cancelarAlteracao();
}

@When("^O sistema apresenta mensagem Deseja cancelar a prévia de Reembolso\\? previa$")
public void oSistemaApresentaMensagemDesejaCancelarAPréviaDeReembolsoPrevia() throws Throwable {
	
}

@When("^Clicar no Botão \"([^\"]*)\" previa$")
public void clicarNoBotãoPrevia(String arg1) throws Throwable {
	driver.switchTo().alert().accept();
}

@Then("^o sistema apresenta mensagem Atenção: Cancelamento da prévia realizado\\. previa$")
public void oSistemaApresentaMensagemAtençãoCancelamentoDaPréviaRealizadoPrevia() throws Throwable {
	String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
					 
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
    work.validarMensagem(element, "Cancelamento da prévia [0-9]* realizado.", "seletor");
    modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario4_1");
	
}
//Cenário E
@When("^informar um número de prévia existente com Status de Em Análise previaaa$")
public void informarUmNúmeroDePréviaExistenteComStatusDeEmAnálisePreviaaa() throws Throwable {
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.inputPrevia("641");
}

@When("^Clicar no botão Continuar previaaa$")
public void clicarNoBotãoContinuarPreviaaa() throws Throwable {
	frame.clicar_fora("//*[@id=\"num_previa\"]");

}

@When("^Selecionar um Procedimento previaaa$")
public void selecionarUmProcedimentoPreviaaa() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.selecionarBoxProcedimento();
} 

@When("^Clicar no Botão Glosar Procedimento previaaa$")
public void clicarNoBotãoGlosarProcedimentoPreviaaa() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	reembolso.clickGlosarProcedimentos();
	windowsHandler = driver.getWindowHandle();
}

@When("^Informar uma Glosa  previaaa$")
public void informarUmaGlosaPreviaaa() throws Throwable {
	
	frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.codigoGlosarProcedimentos("1003");
}

@When("^Clicar no Botão Incluir Glosa Manual previaaa$")
public void clicarNoBotãoIncluirGlosaManualPreviaaa() throws Throwable {
	Thread.sleep(2000);
	reembolso.incluirGosa();
	reembolso.incluirGosa();
	
}

@When("^Clicar no Botão Executar previaaa$")
public void clicarNoBotãoExecutarPreviaaa() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='toolbarModal']");
	reembolso.executarGlosa();
}

@When("^O sistema apresenta mensagem Confirma gravação das glosas manuais\\? previaaa$")
public void oSistemaApresentaMensagemConfirmaGravaçãoDasGlosasManuaisPreviaaa() throws Throwable {
	//modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario5_1");
	Thread.sleep(2000);
}

@When("^Clicar no botão Ok previaaa$")
public void clicarNoBotãoOkPreviaaa() throws Throwable {
	driver.switchTo().alert().accept();
}

@Then("^Glosa Inclusa com Sucesso em Procedimentos no campo Glosa previaaa$")
public void glosaInclusaComSucessoEmProcedimentosNoCampoGlosaPreviaaa() throws Throwable {
	
	frame.trocarJanela(windowsHandler);
	//frame.sairFrame();
	///frame.framePaginaInicial("//*[@id='iframeasp']");
	//frame.framePaginaInicial("//*[@id='principal2']");
	//String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
	
	//work.validarMensagem(element, "Gravação realizada com sucesso", "seletor");
	modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario5_1");
	
}



//Cenário F
@When("^informar um \"([^\"]*)\" existente com Status de \"([^\"]*)\" previaa$")
public void informarUmExistenteComStatusDePreviaa(String arg1, String arg2) throws Throwable {
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.inputPrevia("851");
	

}

@When("^Clicar no botão Continuar previaa$")
public void clicarNoBotãoContinuarPreviaa() throws Throwable {
	frame.clicar_fora("//*[@id=\"num_previa\"]");
}

@When("^Selecionar um Procedimento previa$")
public void selecionarUmProcedimentoPrevia() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.selecionarBoxProcedimento();
}

@When("^Clicar no Botão  Excluir Procedimento previa$")
public void clicarNoBotãoExcluirProcedimentoPrevia() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	reembolso.excluirProcedimentos();
	
}

@When("^O sistema apresenta mensagem Deseja excluir todos os procedimentos selecionados\\? previa$")
public void oSistemaApresentaMensagemDesejaExcluirTodosOsProcedimentosSelecionadosPrevia() throws Throwable {
	
}

@When("^Clicar no Botão OK previa$")
public void clicarNoBotãoOKPrevia() throws Throwable {
	driver.switchTo().alert().accept();
}

@Then("^O sistema apresenta a mensagem Atenção: Gravação realizada com sucesso previa$")
public void oSistemaApresentaAMensagemAtençãoGravaçãoRealizadaComSucessoPrevia() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
	work.validarMensagem(element, "Gravação realizada com sucesso", "seletor");
	modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario6_1");
}

//Cenario G

@When("^informar um número de prévia existente com Status de Em Análise previaaapreviaaa$")
public void informarUmNúmeroDePréviaExistenteComStatusDeEmAnálisePreviaaapreviaaa() throws Throwable {
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.inputPrevia("836");
}

@When("^Clicar no botão Continuar previaaapreviaaa$")
public void clicarNoBotãoContinuarPreviaaapreviaaa() throws Throwable {
	frame.clicar_fora("//*[@id=\"num_previa\"]");
}

@When("^Selecionar um Procedimento previaaapreviaaa$")
public void selecionarUmProcedimentoPreviaaapreviaaa() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.selecionarBoxProcedimento();
}

@When("^Clicar no Botão  Aprovar Procedimento previaaapreviaaa$")
public void clicarNoBotãoAprovarProcedimentoPreviaaapreviaaa() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	windowsHandler = driver.getWindowHandle();
	reembolso.aprovarProcedimentos();
	
}

@When("^Liberar Glosas previaaapreviaa$")
public void liberarGlosasPreviaaapreviaa() throws Throwable {
	frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.marcarTodasrGlosas();
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='toolbarModal']");
	reembolso.executarLiberacaoGlosas();
}

@When("^O sistema apresenta a mensagem Confirma as alterações realizadas\\? previaaapreviaaa$")
public void oSistemaApresentaAMensagemConfirmaAsAlteraçõesRealizadasPreviaaapreviaaa() throws Throwable {
	
}

@When("^Clicar no Botão OK previaaapreviaaaa$")
public void clicarNoBotãoOKPreviaaapreviaaaa() throws Throwable {
	driver.switchTo().alert().accept();
}

@When("^O sistema apresenta mensagem Atenção: Gravação realizada com sucesso previaaapreviaa$")
public void oSistemaApresentaMensagemAtençãoGravaçãoRealizadaComSucessoPreviaaapreviaa() throws Throwable {
	
	frame.trocarJanela(windowsHandler);
	
	//frame.sairFrame();
	//frame.framePaginaInicial("//*[@id='iframeasp']");
	//frame.framePaginaInicial("//*[@id='principal2']");
	
	//String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
	//work.validarMensagem(element, "Gravação realizada com sucesso", "seletor");
	modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario7_1");
}

//Cenário H
@When("^informar um \"([^\"]*)\" existente com Status de \"([^\"]*)\" previaaaa$")
public void informarUmExistenteComStatusDePreviaaaa(String arg1, String arg2) throws Throwable {
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.inputPrevia("454");
	
}

@When("^Clicar no botão Continuar previaaaa$")
public void clicarNoBotãoContinuarPreviaaaa() throws Throwable {
	frame.clicar_fora("//*[@id=\"num_previa\"]");
}

@When("^Clicar no Botão Colocar Prévia na Situação Aguardando Documento previaaaa$")
public void clicarNoBotãoColocarPréviaNaSituaçãoAguardandoDocumentoPreviaaaa() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	reembolso.colocarAguardandoDocoumento();
}

@When("^O sistema apresenta a mensagem \"([^\"]*)\" previaaaa$")
public void oSistemaApresentaAMensagemPreviaaaa(String arg1) throws Throwable {
	
}

@When("^Clicar no Botão OK previaaaa$")
public void clicarNoBotãoOKPreviaaaa() throws Throwable {
	driver.switchTo().alert().accept();
}

@Then("^O sistema apresenta a mensagem Atenção: Prévia colocada na situação Aguardando Documento\\. previaaaa$")
public void oSistemaApresentaAMensagemAtençãoPréviaColocadaNaSituaçãoAguardandoDocumentoPreviaaaa() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
	work.validarMensagem(element, "Prévia colocada na situação Aguardando Documento.", "seletor");
	modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario7_1");
	
}
//Cenario I
@When("^informar um \"([^\"]*)\"Aguardando Documento previa previa$")
public void informarUmAguardandoDocumentoPreviaPrevia(String arg1) throws Throwable {
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.inputPrevia("521");
}

@When("^Clicar no botão Continuar previa previa$")
public void clicarNoBotãoContinuarPreviaPrevia() throws Throwable {
	frame.clicar_fora("//*[@id=\"num_previa\"]");
	Thread.sleep(2000);
	modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario9_1");
}

@When("^Clicar no Botão Reverter Situação previa previa$")
public void clicarNoBotãoReverterSituaçãoPreviaPrevia() throws Throwable {
	frame.sairFrame();
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
	reembolso.voltarSituacao();
}

@When("^O Sistema apresenta a mensagem Deseja voltar a situação da prévia para Em Análise\\? previa previa$")
public void oSistemaApresentaAMensagemDesejaVoltarASituaçãoDaPréviaParaEmAnálisePreviaPrevia() throws Throwable {
	Thread.sleep(1500);
}

@When("^Clicar no Botão Ok previa previa$")
public void clicarNoBotãoOkPreviaPrevia() throws Throwable {
	driver.switchTo().alert().accept();
}

@Then("^O Sistema apresente a Mensagem \"([^\"]*)\" previa previa$")
public void oSistemaApresenteAMensagemPreviaPrevia(String arg1) throws Throwable {
    frame.sairFrame();
    frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
    work.validarMensagem(element, "Situação da prévia [0-9]* retornada com sucesso.", "seletor");
}

//Cenario J


@When("^informar um número de prévia com Status de Cancelado previaaprevia$")
public void informarUmNúmeroDePréviaComStatusDeCanceladoPreviaaprevia() throws Throwable {
	frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	reembolso.inputPrevia("418");
}

@When("^Clicar no botão Continuar previaaprevia$")
public void clicarNoBotãoContinuarPreviaaprevia() throws Throwable {
	frame.clicar_fora("//*[@id=\"num_previa\"]");
	Thread.sleep(2000);
	modulo.screenshot(driver, System.currentTimeMillis(), "Reembolso", "9544_PreviaAlteracaoCenario10_1");
}

@When("^Clicar no Botão Reverter Situação previaaprevia$")
public void clicarNoBotãoReverterSituaçãoPreviaaprevia() throws Throwable {
	    
	    
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		reembolso.voltarSituacao();
	
}

@When("^O Sistema apresenta a mensagem Deseja voltar a situação da prévia para Em Análise \\? previaaprevia$")
public void oSistemaApresentaAMensagemDesejaVoltarASituaçãoDaPréviaParaEmAnálisePreviaaprevia() throws Throwable {
	Thread.sleep(1500);
}

@When("^Clicar no Botão Ok previaaprevia$")
public void clicarNoBotãoOkPreviaaprevia() throws Throwable {
	driver.switchTo().alert().accept();
}

@Then("^O Sistema apresente a Mensagem Atenção: Situação da prévia retornada com sucesso\\. previaaprevia$")
public void oSistemaApresenteAMensagemAtençãoSituaçãoDaPréviaRetornadaComSucessoPreviaaprevia() throws Throwable {
	frame.sairFrame();
    frame.framePaginaInicial("//*[@id='iframeasp']");
	frame.framePaginaInicial("//*[@id='principal2']");
	String element = "body > div.col-xs-11.col-sm-4.alert.alert-info.animated.fadeInDown > span:nth-child(4)";
    work.validarMensagem(element, "Situação da prévia [0-9]* retornada com sucesso.", "seletor");
}



}
