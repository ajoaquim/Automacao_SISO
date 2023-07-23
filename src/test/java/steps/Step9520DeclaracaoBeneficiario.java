package steps;

import Ultils.UtilsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step9520DeclaracaoBeneficiario  extends UtilsSteps{
	@When("^optar por selecionar o menu Pagamento,Relatrios ,Declaração para IR de Beneficiário declaracao pagamento$")
	public void optarPorSelecionarOMenuPagamentoRelatriosDeclaraçãoParaIRDeBeneficiárioDeclaracaoPagamento() throws Throwable {
		initiate();
		frame.sairFrame();
		frame.sairFrame();
		pagamento.acessarTelas("Pagamento", "Declaração para IR de Beneficiário");
		
		
	}

	@When("^informar os dados necessários declaracao$")
	public void informarOsDadosNecessáriosDeclaracao() throws Throwable {
		frame.sairFrame();
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		pagamento.preencherAno("2019");
		pagamento.preencherBeneficiario("2019120033");
	}

	@When("^selecionar \"([^\"]*)\" declaracao$")
	public void selecionarDeclaracao(String arg1) throws Throwable {
	   
	}

	@Then("^o sistema apresenta em tela os dados buscados declaracao$")
	public void oSistemaApresentaEmTelaOsDadosBuscadosDeclaracao() throws Throwable {
	   
	}
}
