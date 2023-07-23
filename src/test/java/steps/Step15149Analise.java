package steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step15149Analise extends UtilsSteps  {
	String windowsHandler;
	//Cenário A
	@When("^Informar o número da solicitação igual a \"([^\"]*)\" analise$")
	public void informarONúmeroDaSolicitaçãoIgualAAnalise(String arg1) throws Throwable {
	  initiate();
	  frame.framePaginaInicial("//*[@id='iframeasp']");
	  frame.framePaginaInicial("//*[@id='principal2']");
	   work.preencherSolicitacao("401");
	}

	@When("^clicar na lupa de pesquisa ou fora do campo analise$")
	public void clicarNaLupaDePesquisaOuForaDoCampoAnalise() throws Throwable {
	   frame.clicar_fora("//*[@id='num_sac']");
	}
	@Then("^o sistema apresenta o resultado da busca na tela \"([^\"]*)\" o campo \"([^\"]*)\" com a opção \"([^\"]*)\" selecionada analise$")
	public void oSistemaApresentaOResultadoDaBuscaNaTelaOCampoComAOpçãoSelecionadaAnalise(String arg1, String arg2, String arg3) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.validarMensagemVariavel("//*[@id=\"nom_situacao\"]", "Agendada", "xpath");
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn1_1");
	}
	//Cenpario B
	
	@When("^clicar na lupa de pesquisa do campo \"([^\"]*)\"$")
	public void clicarNaLupaDePesquisaDoCampo(String arg1) throws Throwable {
		initiate();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.clickLupa();

		
	  
	}

	@When("^o sistema apresenta o resultado da busca na tela \"([^\"]*)\" o campo \"([^\"]*)\" com a opção \"([^\"]*)\" para seleção$")
	public void oSistemaApresentaOResultadoDaBuscaNaTelaOCampoComAOpçãoParaSeleção(String arg1, String arg2, String arg3) throws Throwable {

		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
	
		frame.framePaginaInicial("//*[@id='principal2']");
		String xpath = "//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/table/tbody/tr/td/font";
		work.validarMensagem(xpath, "Pesquisa Solicitações", "xpath");
	   
	}

	@When("^clicar na opção \"([^\"]*)\"$")
	public void clicarNaOpção(String arg1) throws Throwable {
		
		work.selecionarAgendada();

		    
	}
	
	@When("^clicar no botão \"([^\"]*)\" analise$")
	public void clicarNoBotãoAnalise(String arg1) throws Throwable {
		 frame.sairFrame();
		 frame.framePaginaInicial("//*[@id='toolbarModal']");
		 work.clickContinuar();

		 		
	}

	@Then("^o sistema apresenta o resultado da busca na tela \"([^\"]*)\" em um grid$")
	public void oSistemaApresentaOResultadoDaBuscaNaTelaEmUmGrid(String arg1) throws Throwable {
	   // modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149Validaropçãoagendada"); 
			
	}
	
	//Cenario C
	@Given("^que opto por selecionar o menu Registro Atividade Analise$")
	public void queOptoPorSelecionarOMenuRegistroAtividadeAnalise() throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Registro Atividade");
	}

	@When("^pesquisar uma Atividade clicando na lupa Analise$")
	public void pesquisarUmaAtividadeClicandoNaLupaAnalise() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		windowsHandler = driver.getWindowHandle();
		work.clickLupa();
	}

	@When("^clicar em marcar todos do campo Situação Analise$")
	public void clicarEmMarcarTodosDoCampoSituaçãoAnalise() throws Throwable {
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		work.clickMarcarTodos();
		
		
	}

	@When("^clicar em continuar Analise$")
	public void clicarEmContinuarAnalise() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		work.clickContinuar();
	}

	@When("^clicar em uma atividade com status igual a Aberta Analise$")
	public void clicarEmUmaAtividadeComStatusIgualAAbertaAnalise() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		work.selecionarDadoTable("Abertura");
	}

	@Then("^o sistema apresenta campo data/hora aberto para edição Analise$")
	public void oSistemaApresentaCampoDataHoraAbertoParaEdiçãoAnalise() throws Throwable {
		frame.trocarJanela(windowsHandler);
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		assertTrue(work.validaCampoEnabled(By.cssSelector("#dt_agendamento")));
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn3_1");
		
	}
	//Cenario D
	
	@Given("^que opto por selecionar o menu \"([^\"]*)\",\"([^\"]*)\" Analise(\\d+)$")
	public void queOptoPorSelecionarOMenuAnalise(String arg1, String arg2, int arg3) throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Registro Atividade");
	}

	@When("^pesquisar uma \"([^\"]*)\" clicando na lupa Analise(\\d+)$")
	public void pesquisarUmaClicandoNaLupaAnalise(String arg1, int arg2) throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		windowsHandler = driver.getWindowHandle();
		work.clickLupa();
	}

	@When("^clicar em \"([^\"]*)\" do campo \"([^\"]*)\" Analise(\\d+)$")
	public void clicarEmDoCampoAnalise(String arg1, String arg2, int arg3) throws Throwable {
		frame.trocarJanela((String) driver.getWindowHandles().toArray()[1]);
		frame.framePaginaInicial("//*[@id='principal2']");
		work.clickMarcarTodos();
	} 

	@When("^clicar em \"([^\"]*)\" v$")
	public void clicarEmV(String arg1) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='toolbarModal']");
		work.clickContinuar();
	}

	@When("^clicar em uma atividade com status diferente de \"([^\"]*)\" Analise(\\d+)$")
	public void clicarEmUmaAtividadeComStatusDiferenteDeAnalise(String arg1, int arg2) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='principal2']");
		work.selecionarDadoTable("Transferência");
	}

	@Then("^o sistema apresenta campo data/hora bloqueado para edição Analise(\\d+)$")
	public void oSistemaApresentaCampoDataHoraBloqueadoParaEdiçãoAnalise(int arg1) throws Throwable {
		frame.trocarJanela(windowsHandler);
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		assertFalse(work.validaCampoEnabled(By.cssSelector("#dt_agendamento")));
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn4_1");
	}
	//Cenario E
	
	
	@Given("que realizo uma ação na Solicitação através da função Análise")
	public void queRealizoUmaAçãoNaAtravésDaFunçãoAnálise() throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Analise");
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("629");
		 frame.clicar_fora("//*[@id='num_sac']");
		
		
	}

	@When("^finalizar a ação desejada$")
	public void finalizarAAçãoDesejada() throws Throwable {
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		//modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn5_1");
		work.atividadeAnalise();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.incluirAtividadeAnalise();
	}

	@Then("^o sistema devera retornar para a mesma função$")
	public void oSistemaDeveraRetornarParaAMesmaFunção() throws Throwable {
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn5_2");
	}
	
	//Cenario F
	
	@Given("^que acesso o \"([^\"]*)\" e seleciono o módulo Histórico Analise(\\d+)$")
	public void queAcessoOESelecionoOMóduloHistóricoAnalise(String arg1, int arg2) throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Historico");
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("630");
		frame.clicar_fora("//*[@id='num_sac']");

	
	}

	@When("^entrar em \"([^\"]*)\" as informações estarão preenchidas Analise(\\d+)$")
	public void entrarEmAsInformaçõesEstarãoPreenchidasAnalise(String arg1, int arg2) throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.validaCampoPreenchido(By.cssSelector("#num_sac"));
		
		
	}

	@Then("^o campo \"([^\"]*)\" irá exibir as informações inseridas Analise(\\d+)$")
	public void oCampoIráExibirAsInformaçõesInseridasAnalise(String arg1, int arg2) throws Throwable {
		work.validaCampoPreenchido(By.cssSelector("#dt_agendamento"));
		work.validaCampoPreenchido(By.cssSelector("#hora_agendamento"));
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn6_1");
		
	}
	//Cenario G
	@Given("^que acesso o \"([^\"]*)\" Analise(\\d+)$")
	public void queAcessoOAnalise(String arg1, int arg2) throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Registro Atividade");
	}

	@When("^inserir um \"([^\"]*)\" Analise(\\d+)$")
	public void inserirUmAnalise(String arg1, int arg2) throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("630");
		frame.clicar_fora("//*[@id='num_sac']");

	}

	@Then("^trará as informações do mesmo, exibindo na tela a opção de \"([^\"]*)\" Analise(\\d+)$")
	public void traráAsInformaçõesDoMesmoExibindoNaTelaAOpçãoDeAnalise(String arg1, int arg2) throws Throwable {
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.validaCampoPreenchido(By.cssSelector("#num_sac"));
		work.focusElement("#form01 > font > a", "a");
		assertTrue(work.validaCampoEnabled(By.cssSelector("#form01 > font > a")));
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn7_1");
		
	}
	//Cenario H
	@Given("^que acesso algum módulo dentro de Worflow$")
	public void queAcessoAlgumMóduloDentroDeWorflow() throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Analise");
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("631");
		frame.clicar_fora("//*[@id='num_sac']");
		
	}

	@When("^realizar uma ação Registro de atividade$")
	public void realizarUmaAçãoRegistroDeAtividade() throws Throwable {
		frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.atividadeAnalise();
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.incluirAtividadeAnalise();
	}
	
	@When("^procurar um/ou inserir um Prestador$")
	public void procurarUmOuInserirUmPrestador() throws Throwable {
	    
	}

	@Then("^irá exibir a tela de Pesquisa de Solitação$")
	public void iráExibirATelaDePesquisaDeSolitação() throws Throwable {
	   
	}

	//Cenario I
	@Given("^que acesso Consulta Geral Analise(\\d+)$")
	public void queAcessoConsultaGeralAnalise(int arg1) throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Consulta Geral");
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("630");
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^exibir as informações na tela Analise(\\d+)$")
	public void exibirAsInformaçõesNaTelaAnalise(int arg1) throws Throwable {
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.validaCampoPreenchido(By.cssSelector("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(6)"));
		
	}

	@Then("^devera ser exibida no gride o campo Data Agendamento Analise(\\d+)$")
	public void deveraSerExibidaNoGrideOCampoDataAgendamentoAnalise(int arg1) throws Throwable {
		work.validaCampoPreenchido(By.cssSelector("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(18)"));
		work.focusElement("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(18)", "a");
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn9_1");
	}
	//Cenario J
	@Given("^que acesso Consulta Geral Analisee(\\d+)$")
	public void queAcessoConsultaGeralAnalisee(int arg1) throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Consulta Geral");
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("630");
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^exibir as informações na tela analisee(\\d+)$")
	public void exibirAsInformaçõesNaTelaAnalisee(int arg1) throws Throwable {
		 frame.sairFrame();
		    frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='principal2']");
			work.validaCampoPreenchido(By.cssSelector("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(6)"));
	}

	@When("^mostrar os ícones no gride \\(ação\\) Analisee(\\d+)$")
	public void mostrarOsÍconesNoGrideAçãoAnalisee(int arg1) throws Throwable {
		 frame.sairFrame();
		    frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='principal2']");
			assertTrue(work.validarVisibilidade(By.cssSelector("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(1) > img:nth-child(1)")));
			assertTrue(work.validarVisibilidade(By.cssSelector("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(1) > img:nth-child(2)")));
			assertTrue(work.validarVisibilidade(By.cssSelector("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(1) > img:nth-child(3)")));
			assertTrue(work.validarVisibilidade(By.cssSelector("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(1) > a > img")));
	}

	@Then("^a ação de \\(cancelar\\) não devera ser exibida Analisee(\\d+)$")
	public void aAçãoDeCancelarNãoDeveraSerExibidaAnalisee(int arg1) throws Throwable {
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn10_1");
	}
	//Cenario K
	@Given("^que acesso a função Registro de Atividade analise(\\d+)$")
	public void queAcessoAFunçãoRegistroDeAtividadeAnalise(int arg1) throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Registro Atividade");
	}

	@When("^a interface exibir o grid abaixo de ocorrências da Solicitação analise(\\d+)$")
	public void aInterfaceExibirOGridAbaixoDeOcorrênciasDaSolicitaçãoAnalise(int arg1) throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("630");
		frame.clicar_fora("//*[@id='num_sac']");
		
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.validarVisibilidade(By.cssSelector("#tbl_ocorrencias"));
		work.focusElement("#tbl_ocorrencias", "a");
		Thread.sleep(1500);
		
	}

	@When("^exibir os botões de Salvar, Encerrar, Redirecionar e Voltar analise(\\d+)$")
	public void exibirOsBotõesDeSalvarEncerrarRedirecionarEVoltarAnalise(int arg1) throws Throwable {
	    work.validarVisibilidade(By.cssSelector("#bt_redirecionar > img"));
	    work.validarVisibilidade(By.cssSelector("#bt_encerrar > img"));
	    frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
		work.validarVisibilidade(By.cssSelector("#btn_acao_incluir > img"));
		work.validarVisibilidade(By.cssSelector("#btn_acao_voltar > img"));
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn11_1");
		
	}

	@Then("^o hiperlink Enviar resposta por e-mail devera estar ativo para realizar a ação analise(\\d+)$")
	public void oHiperlinkEnviarRespostaPorEMailDeveraEstarAtivoParaRealizarAAçãoAnalise(int arg1) throws Throwable {
		 frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		assertTrue(work.validaCampoEnabled(By.cssSelector("#form01 > font > a")));
		work.focusElement("#form01 > font > a", "sa");
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn11_2");
			
	}
	
	//Cenario L
	@Given("^que acesso Consulta Geral analiseee$")
	public void queAcessoConsultaGeralAnaliseee() throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Consulta Geral");
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("630");
		frame.clicar_fora("//*[@id='num_sac']");
	}

	@When("^exibir as informações na tela analiseee$")
	public void exibirAsInformaçõesNaTelaAnaliseee() throws Throwable {
		  frame.sairFrame();
		    frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='principal2']");
			work.validaCampoPreenchido(By.cssSelector("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(6)"));
			
	}

	@Then("^devera ser exibida no gride o campo Data Agendamento analiseee$")
	public void deveraSerExibidaNoGrideOCampoDataAgendamentoAnaliseee() throws Throwable {
		work.validaCampoPreenchido(By.cssSelector("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(18)"));
		work.focusElement("#dvresultado > table > tbody > tr:nth-child(2) > td:nth-child(18)", "a");
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn12_1");
	}
	//Cenario M
	@Given("^que acesso a função Registro de Atividade ativdaddeee$")
	public void queAcessoAFunçãoAtivdaddeee() throws Throwable {
		initiate();
		work.selecionarSubmenuWorkflow("Registro Atividade");
	}

	@When("^a interface exibir o grid abaixo de ocorrências da Solicitação atividaddeee$")
	public void aInterfaceExibirOGridAbaixoDeOcorrênciasDaSolicitaçãoAtivdaddeee() throws Throwable {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.preencherSolicitacao("630");
		frame.clicar_fora("//*[@id='num_sac']");
		
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		work.validarVisibilidade(By.cssSelector("#tbl_ocorrencias"));
		work.focusElement("#tbl_ocorrencias", "a");
		Thread.sleep(1500);
	}

	@When("^exibir os botões de Salvar, Encerrar, Redirecionar e Voltar ativdaddeee$")
	public void exibirOsBotõesDeAtivdaddeee() throws Throwable {
		 work.validarVisibilidade(By.cssSelector("#bt_redirecionar > img"));
		    work.validarVisibilidade(By.cssSelector("#bt_encerrar > img"));
		    frame.sairFrame();
			frame.framePaginaInicial("//*[@id='iframeasp']");
			frame.framePaginaInicial("//*[@id='toolbarMvcToAsp']");
			work.validarVisibilidade(By.cssSelector("#btn_acao_incluir > img"));
			work.validarVisibilidade(By.cssSelector("#btn_acao_voltar > img"));
			modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn13_1");
	}

	@Then("^o hiperlink Enviar resposta por e-mail devera estar ativo para realizar a ação ativdaddeee$")
	public void oHiperlinkDeveraEstarAtivoParaRealizarAAçãoAtivdaddeee() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		assertTrue(work.validaCampoEnabled(By.cssSelector("#form01 > font > a")));
		work.focusElement("#form01 > font > a", "sa");
		Thread.sleep(1500);
		modulo.screenshot(driver, System.currentTimeMillis(), "Workflow", "15149_AnaliseCn13_2");
	}
	//cenario N
	@Given("^que acesso o modulo \"([^\"]*)\" analisseeeee$")
	public void queAcessoOModuloAnalisseeeee(String arg1) throws Throwable {
	    
	}

	@When("^inserir um solicitante analisseeeee$")
	public void inserirUmSolicitanteAnalisseeeee() throws Throwable {
	   
	}

	@Then("^o campo de \"([^\"]*)\" devera ser exibido com a data/hora analisseeeee$")
	public void oCampoDeDeveraSerExibidoComADataHoraAnalisseeeee(String arg1) throws Throwable {
	    
	}


}
