package steps;


import Ultils.UtilsSteps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class LoginBackground extends UtilsSteps{
	
	@After
	public void after(Scenario scenario) throws InterruptedException{
		Thread.sleep(2000);
	    //modulo.takeScreenshot(scenario, driver);
	    
	    if (scenario.isFailed()) try {
	    	modulo.screenshot(driver, System.currentTimeMillis(), "ErroDeCenario", "ErroResultado");
	    } catch (ClassCastException cce) {
	        cce.printStackTrace();
	    }
	}
	
	@Given("que acesso o sistema SISO")
	public void que_acesso_o_sistema_SISO() {
		initiate();
		singleton.managerDriver();
		loginSISO.getUrl();
	}

	
	@Given("preencho o login e senha")
	public void preencho_o_login_e_senha() {
		loginSISO.loginUser();
	}
	

	@Given("o sistema apresenta a mensagem de boas vindas")
	public void o_sistema_apresenta_a_mensagem_de_boas_vindas() {
		frame.framePaginaInicial("//*[@id='iframeasp']");
		frame.framePaginaInicial("//*[@id='principal2']");
		modulo.screenshot(driver, System.currentTimeMillis(), "Login", "ConfirmarLogin");
		
	}
	
}

