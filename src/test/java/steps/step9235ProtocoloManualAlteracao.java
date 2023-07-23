package steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.ContasOdontologicasi;

public class step9235ProtocoloManualAlteracao extends UtilsSteps {
	@When("^optar por selecionar o menu Conta Odontológica,Revisão,Protocolo Manual, Alteração$")
	public void optarPorSelecionarOMenuContaOdontológicaRevisãoProtocoloManualAlteração() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		contasodontologicasi.Menu_contas_odontologicas();
		contasodontologicasi.Menu_contas_Revisão();
		contasodontologicasi.Menu_contas_ProtManual();
		contasodontologicasi.Menu_contas_Alteracao();
	}

	@When("^informar uma remessa já criada na tela de alteracao contas odontologicas$")
	public void informarUmaRemessaJáCriadaNaTelaDeAlteracaoContasOdontologicas() throws Throwable {
	    contasodontologicasi.NumRemessa("38159");
	    contasodontologicasi.SelReferenciaAlt();
	    
	}

	@When("^selecionar executar na tela de alteracao contas odontologicas$")
	public void selecionarExecutarNaTelaDeAlteracaoContasOdontologicas() throws Throwable {
		//Thread.sleep(2000);
		contasodontologicasi.botexecutar();
		Thread.sleep(2000);
		contasodontologicasi.downremessa();
		//Thread.sleep(2000);
		//modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9235_remessa_selecionada");
	    Thread.sleep(5000);
		contasodontologicasi.Clicaremessa();
	}

	@When("^digitar o número da guia na tela de alteracao contas odontologicas$")
	public void digitarONúmeroDaGuiaNaTelaDeAlteracaoContasOdontologicas() throws Throwable {
	    contasodontologicasi.NumPedido("624");
	    modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9235_insere_pedido");
	}

	@When("^selecionar Protocolar na tela de alteracao contas odontologicas$")
	public void selecionarProtocolarNaTelaDeAlteracaoContasOdontologicas() throws Throwable {
	    contasodontologicasi.Protocolar();
		Thread.sleep(3000);
		contasodontologicasi.NumPedidobaixo();
		Thread.sleep(4000);
		contasodontologicasi.selecionarExcluirRemessa();
	    Thread.sleep(3000);
	    //contasodontologicasi.NumPedidobaixo();
	}

	@When("^selecionar o checkebox excluir da guia na tela de alteracao contas odontologicas$")
	public void selecionarOCheckeboxExcluirDaGuiaNaTelaDeAlteracaoContasOdontologicas() throws Throwable {
	    //contasodontologicasi.Selexlcuir();
	    modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9235_exclui_pedido");
	}

	@When("^selecionar salvar na tela de alteracao contas odontologicas$")
	public void selecionarSalvarNaTelaDeAlteracaoContasOdontologicas() throws Throwable {
		frame.sairFrame();
		//contasodontologicasi.focusElement("#form01 > div > div:nth-child(1) > div > div:nth-child(1) > div > span", "aaa");
		contasodontologicasi.NumPedidocima();
	    contasodontologicasi.Numremessacima();
		contasodontologicasi.BotSalvarremessa();
		Thread.sleep(2000);
		modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9235_salva_exclui_pedido");
	}

	@When("^selecionar Excluir na tela de alteracao contas odontologicas$")
	public void selecionarExcluirNaTelaDeAlteracaoContasOdontologicas() throws Throwable {
	    contasodontologicasi.BotExlcuirremessa();
	    Thread.sleep(2000);
	    alteracao.alerta();
	}

	@Then("^a remessa é excluída com sucesso na tela de alteracao contas odontologicas$")
	public void aRemessaÉExcluídaComSucessoNaTelaDeAlteracaoContasOdontologicas() throws Throwable {
	    contasodontologicasi.NumRemessavalida();
	    modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9235_final");
	    
	}
}