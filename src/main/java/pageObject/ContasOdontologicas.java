package pageObject;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;

public class ContasOdontologicas {


	WebDriver driver;
	WebElement element;
	String elementStr;

	UtilsModule modulo = new UtilsModule();
	UtilsFrames frame;

	public ContasOdontologicas(WebDriver driver) {
		this.driver = driver;
		frame = new UtilsFrames(driver);
	}
	

	public WebElement elementControl(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "xpath");
		element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		return element;
	}

	public void acessoContasOdontologicas() {
		elementControl("//div[2]/ul/li[9][@id='dropdown']");
		element.click();
	}

	public void acessoContasConfirmarExcucao() {
		elementControl("//*[@id=\"dropdown-lvl50\"]/div/ul/li[13]/a");
		element.click();
	}

	public void acessoFechamentoTecnico() {
		elementControl("//*[@id=\"dropdown-lvl50\"]/div/ul/li[9]/a");
		element.click();
	}


	public void informarUmNumeroDePedido(String num)
	{

		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);
		WebElement escprest = elementControl("//*[@id=\"num_pedido\"]");

		escprest.click();
		escprest.sendKeys(num);

	}

	public void clicarNoBotaoPesquisarPedido() {
		WebElement pesquisar = elementControl("//*[@id=\"Pesquisa_Pedido\"]");
		pesquisar.click();
	}

	public void queTenhaRemessaComOStatusAnálisado() {
		WebElement pesquisar = elementControl("//*[@id=\"h_MES_ANO_REF\"]/option[5]");
		pesquisar.click();
	}

	public void informarOsDadosDaBusca() {
		WebElement buscar = elementControl("//*[@id=\"btnavancar\"]");
		buscar.click();
	}

	public void selecionarUmaOuMaisRemessas() {
		WebElement remessa = this.driver.findElement(By.id("chkSelecionaTudo"));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].click()", remessa);
	}

	public void clicarEmExecutar() {
		WebElement executar = this.driver.findElement(By.id("btnexecutar"));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].click()", executar);
	}

	public void confirmarPopup() {
		this.driver.switchTo().alert().accept();
	}

	// -----------------------------cancelamento fechamento tecncico ----------//
	public void acessoCancelamentoFechamentoTecnico() {
		elementControl("//*[@id=\"dropdown-lvl50\"]/div/ul/li[10]/a");
		element.click();
	}


	public void queTenhaUmFechamentoTécnicoRealizado() {
		WebElement pesquisar = elementControl("//*[@id=\"COD_PRESTADOR\"]");
		pesquisar.sendKeys("011215");


		//tipo de Referencia
		Select  psqTipoPessoa = new Select(this.driver.findElement(By.xpath("//*[@id=\"MES_ANO_REF\"]")));
		psqTipoPessoa.selectByVisibleText("02/2020");

		//tipo de Operadora
		Select  pesquisar2 = new Select(this.driver.findElement(By.xpath("//*[@id=\"COD_OPERADORA\"]")));

		pesquisar2.selectByVisibleText("PORTO SEGURO SAÚDE");

	}

	public void informarOsDadosParaBusca() {
		// WebElement buscar = elementControl("//*[@id=\"btnavancar\"]");
		// buscar.click();
		// TODO Auto-generated method stub
		WebElement btnClick = this.driver.findElement(By.id("btnavancar"));

		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", btnClick); 

	}

	public void selecionarUmaOuMaisRemessasCancelamentoFechamentoTecnico() {
		// TODO Auto-generated method stub
		WebElement remessa = this.driver.findElement(By.id("chkSelecionaTudo"));

		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", remessa); 

	}	



	public void clicarEmExecutarFechamentoTecnico() {
		WebElement executar = this.driver.findElement(By.id("btnexecutar"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 



	}

	public void alertaExecutarCancelamentoFechamentoTecnico() {
		// TODO Auto-generated method stub
		this.driver.switchTo().alert().accept();

	}


	//-----------------------------------------------------------------------//
	//------------------------------------------------------------------------//
	//-------------------------Geracao de Remessas----------------------------//
	public void acessoGeracaoDeRemessas() {
		elementControl("//*[@id=\"dropdown-lvl50\"]/div/ul/li[8]/a");
		element.click();	
	}	


	public void queInformeoPrestadorComGuiasConfirmadas() throws Throwable {
		// cod prestador
		WebElement pesquisar = elementControl("//*[@id=\"COD_PRESTADOR\"]");

		pesquisar.sendKeys("011215");

		//tipo de pessoa
		Select  psqPessoa = new Select(this.driver.findElement(By.xpath("//*[@id=\"TIPO_PESSOA\"]")));
		psqPessoa.selectByVisibleText("Física");

		Thread.sleep(4000);

	//	Thread.sleep(4000);

	}

	public void selecionarGuiasConfirmadas() {
		WebElement buscar = elementControl("//*[@id=\"btnavancar\"]");
		buscar.click();
	}

	public void selecioneaRemessaDesejada() throws Throwable {
		// TODO Auto-generated method stub

		WebElement buscar = driver.findElement(By.id("jqg_grid_1"));
		Actions actions = new Actions(driver);
		actions.moveToElement(buscar).click().build().perform();

	}

	public void selecioneexecutargeracaoderemessas() {
		// TODO Auto-generated method stub

		WebElement executar = this.driver.findElement(By.id("btnexecutar"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 


	}

	public void alertaExecutarGeracaoDeRemessas() throws Throwable {
		// TODO Auto-generated method stub




        try {

			
			this.driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(1500);
		WebElement element = driver.findElement(By.cssSelector("#PROCESSO"));
		System.out.println(element.getAttribute("value"));
		assertEquals("Job para geração das remessas odontológica automatica", element.getAttribute("value"));


	}
	// ------------------------------------------------------------------------//



	
	
		//----------------------------------------------------------//
		//---------------Fechamento Referencia----------------------//

	// scenario exlcuir remessa
	// tem methodos comuns com o scenario desbloquear remessa e assumir
	public void selecionarRemessaDesejadaExcluir1() {
		// TODO Auto-generated method stub
		Select psqRemessa = new Select(this.driver.findElement(By.xpath("//*[@id=\"radio_grid_remessas\"]")));
		psqRemessa.selectByValue("1");
		// montar uma rotina para ler qual remessa será excluida ou sempre a 1
	}

	public void selecionarExcluirExcluir() {
		// TODO Auto-generated method stub
		// btn_acao_tela("E");
		WebElement executar = this.driver.findElement(By.id("btn_acao_tela(\"E\");"));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].click()", executar);

	}

	

	// ----------------------------------------------------------//
	// ---------------Fechamento Referencia----------------------//
	public void acessoFechamentoReferencia() {
		// TODO Auto-generated method stub

		elementControl("//*[@id=\"dropdown-lvl50\"]/div/ul/li[3]/a");
		element.click();
	}

	public void selecionarAreferenciavariosstatus() {
		// TODO Auto-generated method stub
		WebElement psqRemessa = this.driver.findElement(By.xpath("//*[@id=\"jqg_grid_1\"]"));
		psqRemessa.click();
		// montar uma rotina para ler qual remessa será excluida ou sempre a 1

	}

	public void selecionarobotãoexecutarvariosstatus() {
		// TODO Auto-generated method stub
		WebElement executar = this.driver.findElement(By.id("btnexecutar"));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].click()", executar);
	}

	public void selecionarAreferenciaStatusParaPagamento() {
		// TODO Auto-generated method stub
		// *[@id="jqg_grid_2"]
		WebElement psqRemessa = this.driver.findElement(By.xpath("//*[@id=\"jqg_grid_2\"]"));
		psqRemessa.click();
		// montar uma rotina para ler qual remessa será excluida ou sempre a 1

	}

	public void buscaElementoNãoFoiPossivelFecharAreferenciaPoisExisteRemessa() {

		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		// Now you are in the popup window, perform necessary actions here
		//
		WebElement buscaElemento = this.driver.findElement(By.xpath(
				"/html/body/div[4]/div[3]/div/div[2]/div[2]/form/div[2]/div/div/div[2]/div/div/div/div[3]/div[3]/div/table/tbody/tr[2]/td[3]"));
		String msgRetorno = buscaElemento.getAttribute("title");
		assertEquals("Não foi possível fechar a referência pois existe remessa em análise.", msgRetorno);
		// //
		driver.switchTo().window(parentWindowHandler); // switch back to parent window

	}

//-----------------------------------------------------------------------------------------
//--------------------------Reprocessamento Prestador------------------------------------------
//-----------------------------------------------------------------------------------------		


	public void selecionarCombo(String value, String element) {
		Select combo = new Select(driver.findElement(By.cssSelector(element)));
		combo.selectByValue(value);

	}

	public void botãoBuscar() {
		WebElement element = driver.findElement(By.cssSelector("#btnavancar"));

		element.click();
	}

	public void botãoBuscar2() {
		WebElement element = driver.findElement(By.cssSelector("#btnavancar > i"));

		element.click();
	}

	public void executarRemessa() {
		WebElement element = driver.findElement(By.cssSelector("#btnexecutar > i"));
		element.click(); 
	}
	public void btnExecutarFR(){
		WebElement element = driver.findElement(By.cssSelector("#btnexecutar"));
		element.click();
	}

	public void validarMensagemDinamico(String element, String txtEsperado, int ini, int fim) {
		WebElement campo = driver.findElement(By.cssSelector(element));
		String text = campo.getAttribute("value");
		System.out.println(text.substring(ini, fim));
		System.out.println(txtEsperado);
		assertEquals(txtEsperado, text.substring(ini, fim));
	}
	public void validarMensagemText(String element, String txtEsperado) {
		WebElement campo = driver.findElement(By.xpath(element));
		
		String text = campo.getAttribute("title");
		System.out.println(text);
		System.out.println(txtEsperado);
		assertEquals(txtEsperado, text);
	}

	public void selecionarRemessaFechamentoT() {
		WebElement table = driver.findElement(By.id("grid"));

		List<WebElement> linhas = table.findElements(By.tagName("tr"));
		Boolean bool = false;
		for (WebElement webElement : linhas) {

			List<WebElement> colunas = webElement.findElements(By.tagName("td"));
			for (WebElement webElement2 : colunas) {
				// System.out.println(webElement2.getAttribute("title"));

				if (webElement2.getAttribute("title").equals("Analisada OK")) {
					//System.out.println(webElement2.getAttribute("title"));

				if (webElement2.getAttribute("title").contains("Analisada")) {
					System.out.println(webElement2.getAttribute("title"));

					colunas.get(0).findElement(By.tagName("input")).click();
					bool = true;
					break;
				}

			}
			if (bool) {
				break;
			}

			}
		}
	}

	public void selecionarRemessa() {
		WebElement table = driver.findElement(By.id("grid"));

		List<WebElement> linhas = table.findElements(By.tagName("tr"));
		Boolean bool = false;
		for (WebElement webElement : linhas) {

			List<WebElement> colunas = webElement.findElements(By.tagName("td"));
			for (WebElement webElement2 : colunas) {
				// System.out.println(webElement2.getAttribute("title"));
				if (webElement2.getAttribute("title").equals("Protocolada")) {
					colunas.get(0).findElement(By.tagName("input")).click();
					bool = true;
					break;
				}

			}
			if (bool) {
				break;
			}

		}

	}

	public void selecionarFecharReferencia() {
		WebElement table = driver.findElement(By.cssSelector("#grid"));
		Boolean bool = false;
		List<WebElement> linhas = table.findElements(By.tagName("tr"));
		for (WebElement webElement : linhas) {

			List<WebElement> colunas = webElement.findElements(By.tagName("td"));
			for (WebElement webElement2 : colunas) {
				
				if (!webElement2.getAttribute("title").isEmpty()) {
					if (webElement2.getAttribute("aria-describedby").equals("grid_QTDE_REMESSA")) {
						if (Integer.parseInt(webElement2.getAttribute("title")) > 1) {
							System.out.println("Colunas: " + webElement2.getText());
							colunas.get(0).findElement(By.tagName("input")).click();
							bool = true;
							break;

						}

					}
				}
			}
			if (bool) {
				break;
			}}
		}

	/*
	 *-------------------------Analise Remessa Por Referencia-----------------*
	 */
	public void acessoAnaliseRemessaPorReferencia() {
		// TODO Auto-generated method stub

		elementControl("//*[@id=\"dropdown-lvl50\"]/div/ul/li[4]/a");
		element.click();


	}  			



	//scenario desbloquear remessa e assumir  
	public void realizarFiltroParaBuscaDaRemessa() throws Throwable {

		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);

		//tipo de ref mes ano
		Select  psqMesRef = new Select(this.driver.findElement(By.xpath("//*[@id=\"mes_ano_ref\"]")));
		psqMesRef.selectByVisibleText("02/2020");


		//tipo de situacao valor default clicar e limpar
		WebElement tipoPreenchido = elementControl("//*[@id=\"s2id_ind_situacao\"]/ul/li[1]/a");
		tipoPreenchido.click();
		//tipo de situacao campo em branco enter e liberar edição
		WebElement txtPreenchido = elementControl("//*[@id=\"s2id_autogen1\"]");
		txtPreenchido.sendKeys(Keys.ENTER);
		//tipo de situacao lançar valor para status necessario e enter	
		txtPreenchido.sendKeys("Processada OK");
		txtPreenchido.sendKeys(Keys.ENTER);


	}
	public void selec_Atualizar() {
		// TODO Auto-generated method stub
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe1);

		WebElement executar = this.driver.findElement(By.id("btn_Atualizar();"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 	
	}

	public void selec_RemessaDesejada() {
		// TODO Auto-generated method stub
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);
	}


			

	
	
	public void atualizarRF() {
		WebElement wb = driver.findElement(By.cssSelector("#btn_Atualizar\\(\\)\\; > img"));
		wb.click();
	}


	public void selecionarContinuarRemessaDesejada() {
		// TODO Auto-generated method stub
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe1);
		WebElement executar = this.driver.findElement(By.id("btn_acao_continuar"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 	



	}
	public void selecionarDesbloquearRemessaDesejada() throws Throwable {
		// TODO Auto-generated method stub
		//--  WebElement executar = this.driver.findElement(By.id("btn_AcaoDesbloquearRemessa();"));
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe1);



		WebElement executar = this.driver.findElement(By.id("btn_acao_tela(\"E\");")); 
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 		
	}

	public void alertaDesbloquearRemessaDesejada() throws Throwable {
		// TODO Auto-generated method stub
		Thread.sleep(1000);

		//this.driver.switchTo().alert().accept();
		this.driver.switchTo().alert().dismiss();


	}

	public void alertaSelecionarAssumirRemessaDesejada() throws Throwable {
		// TODO Auto-generated method stub

		this.driver.switchTo().alert().dismiss();	
		//troca para . accept() depois
	}

	//scenario exlcuir remessa
	// tem methodos comuns com o scenario desbloquear remessa e assumir




	public void realizar_ofiltroparabuscadaremessaguia() {
		// TODO Auto-generated method stub

		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);

		//tipo de ref mes ano
		Select  psqMesRef = new Select(this.driver.findElement(By.xpath("//*[@id=\"mes_ano_ref\"]")));
		psqMesRef.selectByVisibleText("02/2020");


		//tipo de situacao valor default clicar e limpar
		WebElement tipoPreenchido = elementControl("//*[@id=\"s2id_ind_situacao\"]/ul/li[1]/a");
		tipoPreenchido.click();
		//tipo de situacao campo em branco enter e liberar edição
		WebElement txtPreenchido = elementControl("//*[@id=\"s2id_autogen1\"]");
		txtPreenchido.sendKeys(Keys.ENTER);
		//tipo de situacao lançar valor para status necessario e enter	
		txtPreenchido.sendKeys("Processada OK");
		txtPreenchido.sendKeys(Keys.ENTER);
	}

	public void selecionarremessadesejadadaguia() {
		// TODO Auto-generated method stub
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);

		WebElement psqRemessa = driver.findElement(By.xpath("//*[@id=\"radio_grid_remessas\"]")); 
		psqRemessa.click();
	}

	public void selecionarguiaProtocoladaProcessadaGuia() throws Throwable {
		// TODO Auto-generated method stub


		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);
		Thread.sleep(4000);
		WebElement psqRemessa = driver.findElement(By.xpath("//*[@id=\"check_grid\"]")); 


		psqRemessa.click();	


	}

	public void selecionarExcluirGuia() {
		// TODO Auto-generated method stub
		//--  WebElement executar = this.driver.findElement(By.id("btn_AcaoDesbloquearRemessa();"));
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe1);



		WebElement executar = this.driver.findElement(By.id("btn_acao_tela(\"E\");")); 
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 	

	}


	public void alertaGuiaExcluida() throws InterruptedException  {
		// TODO Auto-generated method stub
		//this.driver.switchTo().alert().accept();

		Thread.sleep(4000);
		this.driver.switchTo().alert().dismiss();


	}

	public void selecionarOcorrenciasDaRemessa() {
		// TODO Auto-generated method stub
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe1);



		WebElement executar = this.driver.findElement(By.id("btn_AbreOcorrenciasRemessa();")); 
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 	

	}

	public void selecionarProximaAções() {
		// TODO Auto-generated method stub
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		// Now you are in the popup window, perform necessary actions here
		//
		//WebElement iframe1 = driver.findElement(By.id("principal2"));
		//driver.switchTo().frame(iframe1);
		//WebElement buscaElemento = this.driver.findElement(By.xpath("/html/body/fieldset/center/table/tbody/tr/td/table/tbody/tr/td/font")); 

		WebElement iframe1 = driver.findElement(By.id("toolbarModal"));
		driver.switchTo().frame(iframe1);
		WebElement buscaElemento = this.driver.findElement(By.xpath("/html/body/form/div/span")); 
		buscaElemento.click();


		//String msgRetorno = buscaElemento.getText();
		//assertEquals("Não foi possível fechar a referência pois existe remessa em análise.",msgRetorno);


		//			//
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window


	}

	public void selecionarFecharAções() {
		// TODO Auto-generated method stub
		//btn_acao_voltar("S");
		// TODO Auto-generated method stub
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe1);

		WebElement executar = this.driver.findElement(By.id("btn_acao_voltar(\"S\");")); 
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 	


	}

	public void realizarFiltroParaBuscaDaRemessaValidarAnalise() {
		// TODO Auto-generated method stub
		//Processada c/ glosa
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);

		//tipo de ref mes ano
		Select  psqMesRef = new Select(this.driver.findElement(By.xpath("//*[@id=\"mes_ano_ref\"]")));
		psqMesRef.selectByVisibleText("02/2020");


		//tipo de situacao valor default clicar e limpar
		WebElement tipoPreenchido = elementControl("//*[@id=\"s2id_ind_situacao\"]/ul/li[1]/a");
		tipoPreenchido.click();
		//tipo de situacao campo em branco enter e liberar edição
		WebElement txtPreenchido = elementControl("//*[@id=\"s2id_autogen1\"]");
		txtPreenchido.sendKeys(Keys.ENTER);
		//tipo de situacao lançar valor para status necessario e enter	
		txtPreenchido.sendKeys("Processada c/ glosa");
		txtPreenchido.sendKeys(Keys.ENTER);

	}

	public void selecionarAlterarGuia() {
		// TODO Auto-generated method stub
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe1);



		WebElement executar = this.driver.findElement(By.id("btn_acao_tela(\"A\");")); 
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 	


	}

	public void selecionarAnáliseDeProcedimentosValidarAnalise() {
		// TODO Auto-generated method stub

		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);



		WebElement executar = this.driver.findElement(By.xpath("/html/body/fieldset[2]/center/table/tbody/tr/td/table/tbody/tr/td/form/div/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/i[1]")); 
		//JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		//jse2.executeScript("arguments[0].click()", executar);
		executar.click();

	}	
	/*
	 * -------------------------------Revisão Controle Revisão Por Referencia
	 */

	public void acessoControlRevisaoPorReferencia() {
		// TODO Auto-generated method stub
		elementControl("//*[@id=\"dropdown-lvl50\"]/div/ul/li[17]/a");
		
		element.click();
		elementControl("//*[@id=\"dropdown-lvlODO_CTD20\"]/div/ul/li[6]");
		element.click();
		
	}

	public void mesReferencia() {
		// TODO Auto-generated method stub
		//tipo de Referencia
		Select  psqTipoRef = new Select(this.driver.findElement(By.xpath("//*[@id=\"mes_ano_ref_revisao\"]")));
		psqTipoRef.selectByVisibleText("02/2020");

				
	}
	public void operadora() {
		//tipo de Operadora
		Select  psqOperadora = new Select(this.driver.findElement(By.xpath("//*[@id=\"cod_operadora\"]")));
		psqOperadora.selectByVisibleText("1-PORTO SEGURO SAÚDE");	
		
	}

	public void Atualizar() {
		// TODO Auto-generated method stub
		
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe1);

		WebElement executar = this.driver.findElement(By.id("btn_Atualizar();"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 	
	}

	public void SelecionarRemessa() {
		// TODO Auto-generated method stub
					
		WebElement tabelaRemessa = driver.findElement(By.id("grid_remessas"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("/html/body/form[1]/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div[3]/div[3]/div/table/tbody/tr[5]"));
		
		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			campos.get(0).click();
			break;
		}

		
		
	}

	public void Continuar() {
		// TODO Auto-generated method stub
		WebElement executar = this.driver.findElement(By.id("btn_acao_continuar();"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 	

	}

	public void acaoBotaoAssumir() {
		// TODO Auto-generated method stub
		WebElement executar = this.driver.findElement(By.id("btn_AcaoAssumirRevisaoBotao();")); 
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 
		
	}

	public void alertBoataoAssumir() {
		// TODO Auto-generated method stub
		this.driver.switchTo().alert().dismiss();
	}

	public void selecionarRemessaDesejadaExcluir() {
		// TODO Auto-generated method stub
		WebElement tabelaRemessa = driver.findElement(By.id("grid_remessas"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("/html/body/form[1]/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div[3]/div[3]/div/table/tbody/tr[2]"));
		
		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			campos.get(0).click();
			break;	
		}
	}

	public void seleconarGuiaRemessaDesejadaExcluir() {
		// TODO Auto-generated method stub
		WebElement tabelaRemessa = driver.findElement(By.id("grid_remessas"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("/html/body/form[1]/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div[3]/div[3]/div/table/tbody/tr[2]"));
		
		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			campos.get(0).click();
			break;	
		}
	}

	public void selecionarRemessaDesejadaAções() {
		// TODO Auto-generated method stub
	
		WebElement tabelaRemessa = driver.findElement(By.id("grid_remessas"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("/html/body/form[1]/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div[3]/div[3]/div/table/tbody/tr[2]"));
		
		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			campos.get(0).click();
			break;	
		}
	}

	public void trabalhaPopup() {
		// TODO Auto-generated method stub
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		// Now you are in the popup window, perform necessary actions here
		//
		//WebElement iframe1 = driver.findElement(By.id("principal2"));
		//driver.switchTo().frame(iframe1);
		//WebElement buscaElemento = this.driver.findElement(By.xpath("/html/body/fieldset/center/table/tbody/tr/td/table/tbody/tr/td/font")); 

		WebElement iframe1 = driver.findElement(By.id("toolbarModal"));
		driver.switchTo().frame(iframe1);
		WebElement buscaElemento = this.driver.findElement(By.xpath("/html/body/form/div/span")); 
		buscaElemento.click();


		//String msgRetorno = buscaElemento.getText();
		//assertEquals("Não foi possível fechar a referência pois existe remessa em análise.",msgRetorno);


		//			//
		driver.switchTo().window(parentWindowHandler);  // switch back to parent window

	}

	public void selecionarProximaFila() {
		// TODO Auto-generated method stub
		WebElement executar = this.driver.findElement(By.id("btn_acao_continuar();")); 
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 
		
		
	}

	public void selecionarAnteriorFila() {
		// TODO Auto-generated method stub
		WebElement executar = this.driver.findElement(By.id("btn_acao_voltar();")); 
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 	
	}

	public void selecionarFecharFila() {
		// TODO Auto-generated method stub
		
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("toolbarMvcToAsp"));
		driver.switchTo().frame(iframe1);

		WebElement executar = this.driver.findElement(By.id("btn_acao_fechar();")); 
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", executar); 	
	}

	public void selecionarGuiaRemessaDesejada() {
		// TODO Auto-generated method stub
				
			WebElement tabelaRemessa = driver.findElement(By.xpath("//*[@id=\"gview_grid\"]/div[2]/div/table"));

			List<WebElement> linhasTabelaRemessa = tabelaRemessa
					.findElements(By.xpath("/html/body/font/b/div[2]/div/div[1]/div[3]/div[3]/div/table/tbody/tr[2]"));
			
			for (WebElement linha : linhasTabelaRemessa) {
				List<WebElement> campos = linha.findElements(By.tagName("td"));
				campos.get(0).click();
				break;	
			}
		}

	public void selecionarRemessaDesejadaAnaliseConta() {
		// TODO Auto-generated method stub
		// /html/body/form[1]/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div[3]/div[3]/div/table/tbody/tr[49]	
		WebElement tabelaRemessa = driver.findElement(By.id("grid_remessas"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("/html/body/form[1]/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div[3]/div[3]/div/table/tbody/tr[49]"));
		
		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			campos.get(0).click();
			break;	
		}
	}
	
	public void selecionarRemessaDesejadaGlosa() {
		// TODO Auto-generated method stub
		WebElement tabelaRemessa = driver.findElement(By.id("grid_remessas"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("/html/body/form[1]/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div[3]/div[3]/div/table/tbody/tr[47]"));
		
		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			campos.get(0).click();
			break;	
		}	
	}

	public void selecionarGuiaGlosa() {
		// TODO Auto-generated method stub

		
		
		WebElement tabelaRemessa = driver.findElement(By.xpath("//*[@id=\"gview_grid\"]/div[2]/div/table"));

		List<WebElement> linhasTabelaRemessa = tabelaRemessa
				.findElements(By.xpath("/html/body/font/b/div[2]/div/div[1]/div[3]/div[3]/div/table/tbody/tr[2]"));
		
		for (WebElement linha : linhasTabelaRemessa) {
			List<WebElement> campos = linha.findElements(By.tagName("td"));
			
			
			//campos.get(0).click();
			
			
			break;	
		}
	}

	public void selecionarAlterarGuiaGlosa() {
		// TODO Auto-generated method stub
		// btn_acao_tela("C");
		
		
				//WebElement executar = this.driver.findElement(By.id("btn_acao_tela(\"A\");")); 
				//sem massa para Alterar vou navegar com consultar
				WebElement executar = this.driver.findElement(By.id("btn_acao_tela(\"C\");")); 
				JavascriptExecutor jse2 = (JavascriptExecutor)driver;
				jse2.executeScript("arguments[0].click()", executar); 	
	}

	public void selecionarProcedimentoGlosa() throws Throwable {
		// TODO Auto-generated method stub
	
		frame.sairFrame();
		frame.sairFrame();
		WebElement iframe2 = driver.findElement(By.id("iframeasp"));
		driver.switchTo().frame(iframe2);
		WebElement iframe1 = driver.findElement(By.id("principal2"));
		driver.switchTo().frame(iframe1);



		WebElement executar = this.driver.findElement(By.xpath("/html/body/fieldset[2]/center/table/tbody/tr/td/table/tbody/tr/td/form/div/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/i[1]")); 
		
		executar.click();

		
	}

	
	}
	

		






