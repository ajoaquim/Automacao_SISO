package pageObject;

public class CadastroCandidatoPage {
	/***WebDriver driver;
	Robo robo;
	UtilsSteps uSteps;
	WebDriverWait wait;
	public CadastroCandidatoPage (WebDriver driver) {
		this.driver = driver;
		uSteps = new UtilsSteps();
		wait = new WebDriverWait(this.driver, 60);
		try {
			this.robo = new Robo();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	}
		public void dadosPrimeiroAcesso(String cpf, String nome, String email) {
	
		//WebElement campCpf = driver.findElement(By.xpath("//*[@id=\"TXT_CNPJ_CPF\"]"));
		WebElement campCpf = driver.findElement(By.cssSelector("#TXT_CNPJ_CPF"));
		campCpf.sendKeys(cpf);
		WebElement campNom = driver.findElement(By.xpath("//*[@id=\"NOM_USUARIO\"]"));
		campNom.sendKeys(nome);
		WebElement campEmail = driver.findElement(By.id("TXT_EMAIL"));
		campEmail.sendKeys(email);
		WebElement campConfEmail = driver.findElement(By.id("TXT_CONFIRMA_EMAIL"));
		campConfEmail.sendKeys(email);
		
	}
	public void clicarAcessarCadastro() {
		WebElement button = driver.findElement(By.id("btnCadastrar"));
		button.click();
	}
	public void preencherDadosCadastrais() {
		String rg = "123";
		WebElement campRg = driver.findElement(By.id("rg"));
		campRg.sendKeys(rg);
		//Selecionar combo Orgão Emissor
		Select combo = new Select(driver.findElement(By.id("orgao_emissor")));
		combo.selectByIndex(5);
		//Data Nascimento
		WebElement cNasc = driver.findElement(By.id("data_nascimento"));
		cNasc.sendKeys("10/10/1999");
		robo.pressEnter(1);
		//Selecionar UF
		String path = "//*[@id=\"dados-cadastrais-form\"]/div/div[2]/div[2]/div/div[3]/div[3]/div/div";
		WebElement campoUF = driver.findElement(By.xpath(path));
		campoUF.click();
		String path2 = "//*[@id=\"dados-cadastrais-form\"]/div/div[2]/div[2]/div/div[3]/div[3]/div/div/div[2]/div/div[25]";
		WebElement campoUF2 = driver.findElement(By.xpath(path2));
		campoUF2.click();
		
		//Selecionar Cidade Nascimento
		
		String inputNasc = "//*[@id=\"dados-cadastrais-form\"]/div/div[2]/div[2]/div/div[3]/div[4]/div/div/div[1]/input";
		
		WebElement elementInputNasc = driver.findElement(By.xpath(inputNasc));
		elementInputNasc.sendKeys("Votorantim");
		robo.pressEnter(1);
	
		//selecionar sexo
		Select sexo = new Select(driver.findElement(By.id("sexo")));
		sexo.selectByIndex(2);
		//Estado Civil
		String pathCivil = "//*[@id=\"dados-cadastrais-form\"]/div/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/input";
		WebElement inputCivil = driver.findElement(By.xpath(pathCivil));
		inputCivil.sendKeys("Casado");
		robo.pressEnter(1);
		//Nº INSS
		WebElement nInss = driver.findElement(By.id("inss"));
		nInss.sendKeys("12345678912");
		//classe INSS
		WebElement cInss = driver.findElement(By.id("classe_inss"));
		cInss.sendKeys("12345678912");
		//PIS
		WebElement cPis = driver.findElement(By.id("pis_pasep"));
		cPis.sendKeys("12345678912");
		//nit
		WebElement cNit = driver.findElement(By.id("nit"));
		cNit.sendKeys("12345678912");
		//Inscrição Municipal
		WebElement cInscricao = driver.findElement(By.id("inscricao_municipal"));
		cInscricao.sendKeys("111");
		//Indicado Por
		WebElement cIndicacao = driver.findElement(By.id("indicacao"));
		cIndicacao.sendKeys("aaaa");
		
		
		//GRADUAÇÃO
		String pathInst = "//*[@id=\"dados-cadastrais-form\"]/div/div[3]/div[2]/div/div/div[1]/div/div/div[1]/input";
		WebElement cInstituicao = driver.findElement(By.xpath(pathInst));
		cInstituicao.sendKeys("FATEC");
		robo.pressEnter(1);
		//Ano formacao
		WebElement anoForm = driver.findElement(By.id("ano_formacao"));
		anoForm.sendKeys("2019");
		robo.pressEnter(1);
		
		/////Contatos
		
		WebElement cSite = driver.findElement(By.id("site"));
		cSite.sendKeys("www.aaaa.com.br");
		WebElement cTel = driver.findElement(By.id("telefone"));
		cTel.sendKeys("1121933818");

		WebElement cCel = driver.findElement(By.id("celular"));
		cCel.sendKeys("91192928381");

		WebElement cRedeSocial = driver.findElement(By.id("redesocial"));
		cRedeSocial.sendKeys("aaaaa");
		
		//WebElement buttonAdicionarRede = driver.findElement(By.id("adicionarRedeSocial"));
		//buttonAdicionarRede.click();
		
		/////Endereço

		WebElement cCep = driver.findElement(By.cssSelector("input#cep"));
		cCep.clear();
		cCep.sendKeys("00906039");
		uSteps.sleep(5000);
		WebElement bPesquisa = driver.findElement(By.xpath("//*[@id=\"btnCep\"]/button"));
		bPesquisa.click();
		uSteps.sleep(4000);
		this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modalBuscaCep\"]/div/div/div[3]/button[1]")));
		WebElement btFechar = driver.findElement(By.xpath("//*[@id=\"modalBuscaCep\"]/div/div/div[3]/button[1]"));
		btFechar.click();
		
		WebElement cNum = driver.findElement(By.id("numero_logradouro"));
		robo.pressTab(1);
		uSteps.sleep(2000);
		cNum.sendKeys("300");
		
		
		////Pagamento
		String pathBanco = "//*[@id=\"divDadosPagamento\"]/div[1]/div/div/div[1]/input";
		WebElement cBanco = driver.findElement(By.xpath(pathBanco));
		cBanco.sendKeys("Santander");
		robo.pressEnter(1);
		
		WebElement cAgencia = driver.findElement(By.id("txt_agencia"));
		cAgencia.sendKeys("4112");
		WebElement cAgencia2 = driver.findElement(By.id("txt_dv_agencia"));
		cAgencia2.sendKeys("1");
		WebElement cConta = driver.findElement(By.id("txt_conta"));
		cConta.sendKeys("4444444");
		WebElement cConta2 = driver.findElement(By.id("txt_dv_conta"));
		cConta2.sendKeys("11");
		
		
	}
	public void botãoNext() {
		
		WebElement btnNext = driver.findElement(By.id("btnWizardNext"));
		uSteps.sleep(2000);
		
		btnNext.click();
	}
	
	public void preencherTipoServico(String radio) {
		if(radio=="Clinica de Urgencia") {
		
				String path = "//*[@id=\"divTiposAtendimento\"]/div[1]/label";
				WebElement element = driver.findElement(By.xpath(path));
				element.click();
		}else if(radio == "Clinicas Radiológicas"){
			
				String path2 = "//*[@id=\"divTiposAtendimento\"]/div[2]/label";
				WebElement element2 = driver.findElement(By.xpath(path2));
				element2.click();
				
		}else if(radio =="Consultorio e Clinica") {
				String path3 = "//*[@id=\"divTiposAtendimento\"]/div[3]/label";
				WebElement element3 = driver.findElement(By.xpath(path3));
				element3.click();
		}
				
		
		
		
		//Num CRM
		WebElement cCrm = driver.findElement(By.id("num_crm"));
		cCrm.sendKeys("1111111111");
		String pathEstado = "//*[@id=\"tipo-servico-form\"]/div[1]/div[2]/div/div[2]/div/div/div[3]/div/div/div[1]/input";
		WebElement cEstado = driver.findElement(By.xpath(pathEstado));
		cEstado.sendKeys("SP");
		robo.pressEnter(1);
		
	}
	
	public void preencherEndereco() {
		WebElement btNovoEndereco = driver.findElement(By.id("novoEndereco"));
		btNovoEndereco.click();
		uSteps.sleep(2000);
		
		WebElement cCep = driver.findElement(By.id("cep_especialidade"));
		cCep.clear();
		cCep.sendKeys("00906039");
		robo.pressTab(1);
		uSteps.sleep(2000);
		
		WebElement cNum = driver.findElement(By.id("numero_logradouro_especialidade"));
		robo.pressTab(1);
		uSteps.sleep(2000);
		cNum.sendKeys("300");
		
		uSteps.sleep(3500);
		WebElement btConfirm = driver.findElement(By.id("adicionarEndereco"));
		btConfirm.click();
			
	}
	public void preencherDocNecessaria() {
	
		WebElement upCnes = driver.findElement((By.id("input-file-grid_9")));
		upCnes.sendKeys("C:/teste.txt");
		WebElement upComprovante = driver.findElement(By.id("input-file-grid_7"));
		upComprovante.sendKeys("C:/teste.txt");
		WebElement upCpf = driver.findElement((By.id("input-file-grid_2")));
		upCpf.sendKeys("C:/teste.txt");
		WebElement upCro = driver.findElement(By.id("input-file-grid_1"));
		upCro.sendKeys("C:/teste.txt");
	}
	public void preencherQuestionario() {
		WebElement txtArea = driver.findElement(By.id("resposta_1_0"));
		txtArea.sendKeys("funcinouu");
	}
	
	public void finalizar() {
		WebElement lblFinal = driver.findElement(By.xpath("//*[@id=\"finalizacao\"]/div/div/div/label"));
		lblFinal.click();
		
	}
	public void aceitarConfirmacao() {
		WebElement bFinal = driver.findElement(By.id("btnWizardNext"));
		bFinal.click();
	}
	public void clicarBotaoSalvar() {
		uSteps.sleep(2000);
		WebElement btFinal = driver.findElement(By.xpath("//*[@id=\"FinalizacaoModal\"]/div/div/div[3]/p/a[2]"));
		btFinal.click();
		robo.pressEnter(1);
	}
	public void validarProtocolo() {
		WebElement numSac = driver.findElement(By.id("num_sac"));
		int tNumSac = Integer.parseInt(numSac.getAttribute("textContent"));
		assertTrue(tNumSac > 0);
		
		uSteps.sleep(5000);
		driver.quit();
		
	}***/
}
