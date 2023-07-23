package steps;


import Ultils.UtilsSteps;
import cucumber.api.java.en.Given;

public class OdontoBackground extends UtilsSteps{
	
	@Given("^que acesse o sistema Odonto$")
	public void que_acesse_o_sistema_Odonto() throws InterruptedException {
		
		initiate();
		
		singleton.managerDriver();
		System.out.println("Sistema Odonto");
		loginSISO.getUrl();
	}
	
	@Given("^preencho usuário e senha$")
	public void preencho_usuário_e_senha() throws Throwable {
		loginSISO.loginUser();
	}
}

