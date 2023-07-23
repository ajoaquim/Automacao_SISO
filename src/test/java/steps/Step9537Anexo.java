package steps;
import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9537Anexo extends UtilsSteps {
	@When("^optar por selecionar o menu Reembolso Odontológico,Anexo$")
	public void optarPorSelecionarOMenuReembolsoOdontológicoAnexo() throws Throwable {
		initiate();
		frame.sairFrame();
	    frame.sairFrame();
	    reembolsoi.Menu_Reembolso();
	    reembolsoi.Menu_anexo_reembolso();
	}

	@When("^informar um Nº de Reembolso existente na tela de reembolso anexo$")
	public void informarUmNºDeReembolsoExistenteNaTelaDeReembolsoAnexo() throws Throwable {
	    reembolsoi.NumReembolsoAnexo("781");
	}

	@When("^clicar fora do campo na tela de reembolso anexo$")
	public void clicarForaDoCampoNaTelaDeReembolsoAnexo() throws Throwable {
	    reembolsoi.NumReembolsoAnexoTab();
	}

	@When("^selecionar o arquivo na tela de reembolso anexo$")
	public void selecionarOArquivoNaTelaDeReembolsoAnexo() throws Throwable {
	    reembolsoi.SeltpAnexo();
	}

	@When("^preencher a descrição do anexo na tela de reembolso anexo$")
	public void preencherADescriçãoDoAnexoNaTelaDeReembolsoAnexo() throws Throwable {
	    reembolsoi.DescAnexo("teste");
	    reembolsoi.AnexaArq();
	}

	@When("^selecionar Executar na tela de reembolso anexo$")
	public void selecionarExecutarNaTelaDeReembolsoAnexo() throws Throwable {
	    frame.sairFrame();
	    reembolsoi.Btnexecutar();
	    Thread.sleep(8000);
	}

	@Then("^o sistema apresenta a mensagem Operação realizada na tela de reembolso anexo$")
	public void oSistemaApresentaAMensagemOperaçãoRealizadaNaTelaDeReembolsoAnexo() throws Throwable {
	    
	}

	@Then("^o sistema apresenta o resultado da busca na tela de reembolso anexo$")
	public void oSistemaApresentaOResultadoDaBuscaNaTelaDeReembolsoAnexo() throws Throwable {
	    
	}

	@When("^verificar se existe anexo na tela de reembolso anexo$")
	public void verificarSeExisteAnexoNaTelaDeReembolsoAnexo() throws Throwable {
	    
	}

	@When("^clicar no botão Excluir na tela de reembolso anexo$")
	public void clicarNoBotãoExcluirNaTelaDeReembolsoAnexo() throws Throwable {
	    
	}

	@When("^o sitema apresenta a mensagem Deseja excluir o anexo \\? na tela de reembolso anexo$")
	public void oSitemaApresentaAMensagemDesejaExcluirOAnexoNaTelaDeReembolsoAnexo() throws Throwable {
	    
	}

	@When("^clicar no botão OK na tela de reembolso anexo$")
	public void clicarNoBotãoOKNaTelaDeReembolsoAnexo() throws Throwable {
	    
	}

//	@Given("^que inclui um anexo na tela de reembolso anexo$")
//	public void queIncluiUmAnexoNaTelaDeReembolsoAnexo() throws Throwable {
//	    
//	}

	@When("^quando acessar o menu Reembolso Odontológico -> Historico$")
	public void quandoAcessarOMenuReembolsoOdontológicoHistorico() throws Throwable {
	   
	}

	@When("^informar o Nº de Reembolso que o anexo foi inserido$")
	public void informarONºDeReembolsoQueOAnexoFoiInserido() throws Throwable {
	    
	}

	@When("^abrir a aba Anexos da tela$")
	public void abrirAAbaAnexosDaTela() throws Throwable {
	    
	}

	@Then("^o sistema apresenta o anexo inserido na tela de reembolso anexo$")
	public void oSistemaApresentaOAnexoInseridoNaTelaDeReembolsoAnexo() throws Throwable {
	    
	}

	@When("^clicar em Assumir na tela de reembolso anexo$")
	public void clicarEmAssumirNaTelaDeReembolsoAnexo() throws Throwable {
	    
	}

	@Then("^o sistema abre o pedido de reembolso na tela de reembolso anexo$")
	public void oSistemaAbreOPedidoDeReembolsoNaTelaDeReembolsoAnexo() throws Throwable {
	    
	}
}
