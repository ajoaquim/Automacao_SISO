package steps;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.junit.After;

import Ultils.UtilsSteps;

public class step9202CancelaBloqueioSuspensão extends UtilsSteps {
	@When("^optar por selecionar o menu Gestão Prestadores Odontológicos,Cadastro Prestador,Bloqueio Suspensão de Prestador,Cancela Bloqueio Suspensão$")
	public void optarPorSelecionarOMenuGestãoPrestadoresOdontológicosCadastroPrestadorBloqueioSuspensãoDePrestadorCancelaBloqueioSuspensão() throws Throwable {
		initiate();
		 frame.sairFrame();
		 frame.sairFrame();
		 alteracao.Menu_Gestão_Prestadores_odontologicos();
		 alteracao.Menu_Cadastro_prestador();
		 alteracao.Menu_ResgistroSuspensao();
		 Thread.sleep(1000);
		 alteracao.Menu_interiorCancelaBloqueio();
	}

	@When("^Informar um Prestador existente Cancelado na tela de cancela bloqueio suspensão$")
	public void informarUmPrestadorExistenteCanceladoNaTelaDeCancelaBloqueioSuspensão() throws Throwable {
		Thread.sleep(2000);
	    alteracao.LimparConsulta();
	    frame.sairFrame();
	    Thread.sleep(3000);
		alteracao.Informa_prestador("011614");
		 
	}

	@When("^clicar fora do campo na tela de cancela bloqueio suspensão$")
	public void clicarForaDoCampoNaTelaDeCancelaBloqueioSuspensão() throws Throwable {
		frame.clicar_fora("//*[@id=\"cod_prestador\"]");
	}

	@Then("^o sistema apresenta o resultado da busca na tela cancelamento bloqueio suspensão$")
	public void oSistemaApresentaOResultadoDaBuscaNaTelaCancelamentoBloqueioSuspensão() throws Throwable {
		alteracao.ValidaCancelamento();
		modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "9202_consulta_cancelamento");
	}

	@When("^selecionar um Prestador existente Cancelado na tela de cancela bloqueio suspensão$")
	public void selecionarUmPrestadorExistenteCanceladoNaTelaDeCancelaBloqueioSuspensão() throws Throwable {
		Thread.sleep(2000);
	    alteracao.LimparConsulta();
	    frame.sairFrame();
	    Thread.sleep(3000);
		alteracao.Informa_prestador("011614");
	}

	@When("^clicar no campo Solicitação na operador escolhida para o cancelamento$")
	public void clicarNoCampoSolicitaçãoNaOperadorEscolhidaParaOCancelamento() throws Throwable {
	    alteracao.Seldef();
	    alteracao.ValidaExcluiBloq();
	    
	    
	}

	@When("^Clicar no Botão Excluir no menu de cancelamento bloqueio e suspensão$")
	public void clicarNoBotãoExcluirNoMenuDeCancelamentoBloqueioESuspensão() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    alteracao.BotExcluirQuali();
	    alteracao.alerta();
	}

	@Then("^o sitema apresenta a mensagem Cancelamento Realizado$")
	public void oSitemaApresentaAMensagemCancelamentoRealizado() throws Throwable {
	    Thread.sleep(2000);
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "9202_Bloqueio_cancelado_sucesso");
	}

	@Then("^o sitema apresenta a mensagem A Suspensão  Bloqueio informada está cancelada\\.$")
	public void oSitemaApresentaAMensagemASuspensãoBloqueioInformadaEstáCancelada() throws Throwable {
		frame.sairFrame();
	    frame.sairFrame();
	    frame.framePaginaInicial("//*[@id='iframeasp']");
	    frame.framePaginaInicial("//*[@id='principal2']");
	    Thread.sleep(2000);
	    alteracao.Exlcuibloqcanceladomsg();
	    modulo.screenshot(driver, System.currentTimeMillis(), "Gestão_Prestador", "9202_Bloqueio_ja_cancelado_");
	}
}