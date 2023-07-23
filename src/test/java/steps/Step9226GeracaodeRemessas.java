package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9226GeracaodeRemessas extends UtilsSteps{
	
	
	@When("^selecionar o menu Conta Odontológica,Geração de Remessas$") 
	public void fazeraopcaoporcontaodontologicageracaoderemessas() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		contas.acessoContasOdontologicas();
		contas.acessoGeracaoDeRemessas();
	}

//Scenario: 
	@Given("^que informe o Prestador com guias confirmadas Geração de Remessas$") 
	public void queinformeoPrestadorcomguiasconfirmadas() throws Throwable {
		contas.queInformeoPrestadorComGuiasConfirmadas();
	}
	@When("^selecionar continuar Geração de Remessas$") 
	public void selecionarcontinuarguiasconfirmadas() throws Throwable {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contas.selecionarGuiasConfirmadas();
	}
	@And("^selecione a Remessa desejada Geração de Remessas$") 
	public void selecioneaRemessadesejada() throws Throwable {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contas.selecioneaRemessaDesejada();
	}
	@And("^selecione executar Geração de Remessas$") 
	public void selecioneexecutargeracaoderemessas() throws Throwable {
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		contas.selecioneexecutargeracaoderemessas();
		
		
	}
	@Then("^sistema apresenta em tela a fila de execução e o status fica \"Ok\" quando a remessa for gerada por completo Geração de Remessas$") 
	public void osistemaapresentaemtelaafiladeexecuçãoeostatusficaOkquandoaremessaforgeradaporcompleto() throws Throwable {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contas.alertaExecutarGeracaoDeRemessas();
	}

}
