package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9234ProtocoloManualInclusao extends UtilsSteps{
	
	@When("^optar por selecionar o menu Conta Odontológica,Revisão,Protocolo Manual, Inclusão$")
	public void optar_por_selecionar_o_menu_Conta_Odontológica_Revisão_Protocolo_Manual_Inclusão() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		contasR.MenuContasOdontologicas();
		contasR.Revisao();
		contasR.ProtocoloManual();
		contasR.Inclusao();
	}

	@When("^informar os dados desejados Prestador, Postagem e Recebimento$")
	public void informar_os_dados_desejados_Prestador_Postagem_e_Recebimento() throws Throwable {
		contasR.PrestadorInclusao();
		contasR.Postagem();
		contasR.Recebimento();
	}

	@When("^selecionar Salvar$")
	public void selecionar_Salvar() throws Throwable {
		contasR.SalvarInclusao();
	}

	@When("^digitar o número da guia$")
	public void digitar_o_número_da_guia() throws Throwable {
		contasR.NumeroPedido();
	}

	@When("^selecionar Protocolar$")
	public void selecionar_Protocolar() throws Throwable {
		contasR.Protocolar();
		
	}

	@When("^selecionar submeter$")
	public void selecionar_submeter() throws Throwable {
		contasR.NumeroPedido();
		contasR.Protocolar();

		Thread.sleep(4500);
		contasR.Submeter();
		
	}

	@Then("^a remessa de recurso de glosa é criada com sucesso$")
	public void a_remessa_de_recurso_de_glosa_é_criada_com_sucesso() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9234ProtocoloManualInclusaoRemessaGlosa");
	}
	
	@When("^digitar o número da guia validar$")
	public void digitarONúmeroDaGuiaValidar() throws Throwable {
		contasR.NumeroPedidoB();
	
	}
	@When("^selecionar Protocolar validar$")
	public void selecionarProtocolarValidar() throws Throwable {
		contasR.Protocolar();
		
		contasR.NumeroPedidoB();
		contasR.Protocolar();

	}


	@When("^selecionar o checkebox excluir da guia$")
	public void selecionar_o_checkebox_excluir_da_guia() throws Throwable {
		contasR.Excluir();
	
	}

	@When("^selecionar salvar$")
	public void selecionar_salvar() throws Throwable {
		contasR.SalvarInclusao();
	}

	@When("^a guia é excluída da remessa$")
	public void a_guia_é_excluída_da_remessa() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9234ProtocoloManualInclusaoExcluidaRemessa");
	}

	@When("^selecionar Incluir uma nova remessa$")
	public void selecionar_Incluir_uma_nova_remessa() throws Throwable {
		contasR.Novo();
	}

	@When("^selecionar Excluir$")
	public void selecionar_Excluir() throws Throwable {
		contasR.ExcluirProtocolo();
		driver.switchTo().alert().accept();
	}

	@Then("^a remessa que estaja sendo criada é excluída$")
	public void a_remessa_que_estaja_sendo_criada_é_excluída() throws Throwable {
		Thread.sleep(4500);
		modulo.screenshot(driver, System.currentTimeMillis(), "ContasOdontologicas", "9234ProtocoloManualInclusaoRemessaCriadaExcluida");
	}


}
