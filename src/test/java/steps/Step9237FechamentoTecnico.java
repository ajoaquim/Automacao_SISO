//package steps;
//
//import Ultils.UtilsSteps;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Step9237FechamentoTecnico extends UtilsSteps {
//	
//	@When("^optar por selecionar o menu fechamento Técnico$")
//	public void optarPorSelecionarOMenuFechamentoTécnico() throws Throwable { 
//		initiate();
//		frame.sairFrame();
//		frame.sairFrame();
//		contas.acessoContasOdontologicas();
//		contas.acessoFechamentoTecnico();
//	}
//
//	@Given("^que tenha remessa com o status análisado$")
//	public void queTenhaRemessaComOStatusAnálisado() throws Throwable {
//		contas.queTenhaRemessaComOStatusAnálisado();
//	}
//
//	@When("^informar os dados da busca$")
//	public void informarOsDadosDaBusca() throws Throwable {
//		contas.informarOsDadosDaBusca();
//	}
//
//	@When("^selecionar uma ou mais remessas$")
//	public void selecionarUmaOuMaisRemessas() throws Throwable {
//		contas.selecionarUmaOuMaisRemessas();
//	}
//
//	@When("^clicar em executar$")
//	public void clicarEmExecutar() throws Throwable {
//		contas.clicarEmExecutar();
//		Thread.sleep(2000);
//		contas.confirmarPopup();
//	}
//
//	@Then("^o sistema apresenta a tela do job que está sendo executado$")
//	public void oSistemaApresentaATelaDoJobQueEstáSendoExecutado() throws Throwable {    
//		Thread.sleep(100000);
//	}
//
//}
