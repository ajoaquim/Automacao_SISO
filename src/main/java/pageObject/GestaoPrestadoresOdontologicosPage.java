package pageObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Ultils.UtilsFrames;
import Ultils.UtilsModule;

public class GestaoPrestadoresOdontologicosPage {

	UtilsModule modulo = new UtilsModule();

	WebDriver driver;
	String elementStr;
	WebElement element;

	UtilsFrames frame = new UtilsFrames(driver);

	public GestaoPrestadoresOdontologicosPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement elementControlXpath(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "xpath");
		element = driver.findElement(By.xpath(elementStr));
		modulo.highLight(element, driver);
		return element;
	}

	public WebElement elementControlCssSelector(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "cssSelector");
		element = driver.findElement(By.cssSelector(elementStr));
		modulo.highLight(element, driver);
		return element;
	}

	public WebElement elementControlId(String elementStr2) {
		elementStr = elementStr2;
		modulo.waitingElement(driver, elementStr, "id");
		element = driver.findElement(By.id(elementStr));
		modulo.highLight(element, driver);
		return element;
	}

	public void LimparConsulta() {
		String element = "//*[@id='idAcaoLimpar']/img";
		modulo.waitingElement(driver, element, "xpath");
		WebElement botlimpar = driver.findElement(By.xpath(element));
		botlimpar.click();
	}

	public void CadastroPrestador() {
		String element = "//*[@id='dropdown'][11]//li[1]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement menuCadastro = driver.findElement(By.xpath(element));
		menuCadastro.click();
	}

	public void Anexos() {
		String element = "//*[@id='dropdown-lvlODO_PRS0030']/div/ul/li[3]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement menuAnexos = driver.findElement(By.xpath(element));
		menuAnexos.click();

	}

	// -----------------------------------------------------------------//
	// ----------------------Anexos-----------------------------------//

	public void Prestador() {
		String element = "//*[@id='cod_prestador']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement prestador = driver.findElement(By.xpath(element));
		prestador.sendKeys("1111");

	}

	public void Lupa() {
		String element = "//*[@id='Pesq_Prestador']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement lupa = driver.findElement(By.xpath(element));
		lupa.click();
	}

	public void TipoPessoaFisica() {
		String element = "//*[@id='ind_tipo_pessoa']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement fisica = driver.findElement(By.xpath(element));
		fisica.click();
	}

	public void EmImplantacao() {
		String element = "//*[@id='ind_situacao'][3]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement implantacao = driver.findElement(By.xpath(element));
		implantacao.click();
	}

	public void Continuar() {
		String element = "//*[@id='btn_acao_continuar']/img";
		modulo.waitingElement(driver, element, "xpath");
		WebElement continuar = driver.findElement(By.xpath(element));
		continuar.click();
	}

	public void PrestadorAnexo() {
		String element = "//*[@id=\"tbl_pesquisa\"]/tbody/tr[9]/td[1]/a";
		modulo.waitingElement(driver, element, "xpath");
		WebElement prestador = driver.findElement(By.xpath(element));
		prestador.click();
	}

	public void Gravar() {
		String element = "//*[@id='btn_acao_alterar()']/img";
		modulo.waitingElement(driver, element, "xpath");
		WebElement gravar = driver.findElement(By.xpath(element));
		gravar.click();

	}

	// -----------------------------------------------------------------//
	// ----------------------Liberacao-----------------------------------//

	public void PrestadorLiberado() {
		String element = "//*[@id=\"cod_prestador\"]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement prestadorliberado = driver.findElement(By.xpath(element));
		prestadorliberado.sendKeys("014818");
	}

	public void PrestadorExistente() {
		String element = "//*[@id='cod_prestador']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement prestadorliberado = driver.findElement(By.xpath(element));
		prestadorliberado.sendKeys("010618");
	}

	public void ValideLiberacao() {

		String elementStr = "//*[@id='txt_msg']";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		element.click();

		String value = element.getText().toString();
		System.out.println(value);

		assertEquals("Prestador já está liberado em todas as operadoras.", value);

	}

	public void FlegLiberar() {
		String element = "//*[@id='tbl_inc_abre_table']/center/table/tbody/tr/td/table/tbody/tr[3]/td/fieldset/table/tbody/tr[3]/td[2]/input";
		modulo.waitingElement(driver, element, "xpath");
		WebElement flagliberacao = driver.findElement(By.xpath(element));
		flagliberacao.click();

	}

	public void Executar() {
		String element = "//*[@id=\"btn_acao_executar()\"]/img";
		modulo.waitingElement(driver, element, "xpath");
		WebElement executar = driver.findElement(By.xpath(element));
		executar.click();
	}

	public void AcaoExecutar() {
		String element = "//*[@id=\"btn_acao_executar\"]/img";
		modulo.waitingElement(driver, element, "xpath");
		WebElement acaoexecutar = driver.findElement(By.xpath(element));
		acaoexecutar.click();
	}

	public void LiberacaoEfetuada() {
		String elementStr = "//*[@id='txt_msg']";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement liberacao = driver.findElement(By.xpath(elementStr));
		liberacao.click();

		String value = liberacao.getText().toString();
		System.out.println(value);

		assertEquals("Alteração realizada com sucesso!", value);
	}

	// -----------------------------------------------------------------//
	// ----------------------Negociacao-----------------------------------//

	public void PrestadorNegociacao() {
		String element = "//*[@id=\"cod_prestador\"]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement negociacao = driver.findElement(By.xpath(element));
		negociacao.sendKeys("011444");
	}

	public void PrestadorSemNegociacao() {
		String element = "//*[@id=\"cod_prestador\"]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement negociacao = driver.findElement(By.xpath(element));
		negociacao.sendKeys("011010");
	}

	public void SemRegistroEncontardo() {
		String elementStr = "//*[@id='tbl_inc_abre_table']/center/table/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr[3]/td";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		String value = element.getText().toString();
		System.out.println(value);
		assertEquals("Nenhum registro encontrado", value);

	}

	public void RegistroEncontrado() {
		String element = "//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr[3]/td[1]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement elementStr = driver.findElement(By.xpath(element));
		String value = elementStr.getText().toString();
		System.out.println(value);
		assertEquals("Para um único prestador", value);
	}

	public void RegistroEncontardo() {
		String elementStr = "//*[@id='tbl_inc_abre_table']/center/table/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr[3]/td";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement element = driver.findElement(By.xpath(elementStr));
		String value = element.getText().toString();
		System.out.println(value);
		assertEquals("Para um único prestador", value);

	}

	// -----------------------------------------------------------------//
	// -------------------Consulta-Negociacao-----------------------------------//

	public void CodigoNegociacao() {
		String element = "//*[@id='cod_negociacao']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement consulta = driver.findElement(By.xpath(element));
		consulta.sendKeys("81");

	}

	public void ValidarConsultaNegociacao() {
		String element = "body > table > tbody > tr:nth-child(2) > td:nth-child(2)";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement validarConsulta = driver.findElement(By.cssSelector(element));
		validarConsulta.click();

		String value = validarConsulta.getText().toString();
		System.out.println(value);

		assertEquals("Descrição", value);

	}

	// -----------------------------------------------------------------//
	// ----------------------Cancela-----------------------------------//

	public void PrestadorNaoExcluido() {
		String element = "//*[@id='cod_prestador']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement prestadorNaoExcluido = driver.findElement(By.xpath(element));
		prestadorNaoExcluido.sendKeys("011010");
	}

	public void PrestadorCancelado() {
		String element = "//*[@id='cod_prestador']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement prestadorNaoExcluido = driver.findElement(By.xpath(element));
		prestadorNaoExcluido.sendKeys("010618");
	}

	public void FlegCancelar() {
		String element = "//*[@id='ind_cancelar_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement fleg = driver.findElement(By.xpath(element));
		fleg.click();
	}

	public void ValideOperacao() {
		String element = "//*[@id='txt_msg']";

		modulo.waitingElement(driver, element, "xpath");
		WebElement liberacao = driver.findElement(By.xpath(element));
		liberacao.click();

		String value = liberacao.getText().toString();
		System.out.println(value);

		assertEquals("Operação realizada com sucesso", value);
	}

	public void NaoExcluido() {
		String elementStr = "//*[@id='txt_msg']";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement liberacao = driver.findElement(By.xpath(elementStr));
		liberacao.click();

		String value = liberacao.getText().toString();
		System.out.println(value);

		assertEquals("Prestador não está excluído em nenhuma operadora.", value);
	}

	public void Alterar() {
		String element = "//*[@id='btn_acao_alterar']/img";
		modulo.waitingElement(driver, element, "xpath");
		WebElement alterar = driver.findElement(By.xpath(element));
		alterar.click();
	}

	// -----------------------------------------------------------------//
	// ----------------------Suspensao Bloqueio
	// Encerrar-----------------------------------//

	public void TempoPesquisa() {
		String element = "//*[@id='qtd_dias']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement tempo = driver.findElement(By.xpath(element));
		tempo.sendKeys("55");
	}

	public void ValideBusca() {
		String element = "//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr[1]/td/b";
		modulo.waitingElement(driver, element, "xpath");
		WebElement busca = driver.findElement(By.xpath(element));
		busca.click();

		String value = busca.getText().toString();
		System.out.println(value);

		assertEquals("Suspensões Temporárias a Encerrar em 555 Dias", value);

	}

	// -----------------------------------------------------------------//
	// ----------------------Pensao Alimenticia-----------------------------------//

	public void AdicionarBeneficiario() {
		String element = "//*[@id='Button1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement adicionar = driver.findElement(By.xpath(element));
		adicionar.click();

	}

	public void PrestadorComPensao() {
		String element = "//*[@id='cod_prestador']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement prestadorNaoExcluido = driver.findElement(By.xpath(element));
		prestadorNaoExcluido.sendKeys("015415");

	}

	public void PrestadorSemPensao() {
		String element = "//*[@id='cod_prestador']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement prestadorNaoExcluido = driver.findElement(By.xpath(element));
		prestadorNaoExcluido.sendKeys("011444");

	}

	public void ValidarNovoBeneficiario() {
		String element = "//*[@id='TbBeneficiario']/tbody/tr[3]/td[2]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement novo = driver.findElement(By.xpath(element));
		novo.click();

		String value = novo.getText().toString();
		System.out.println(value);

		assertEquals("Novo Beneficiário", value);

	}
	// ----------------------Pensao Alimenticia--Consulta
	// Prestador---------------------------------//

	public void ValidarConsultaPensaoNaoExiste() {
		String element = "//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/table/tbody/tr/td/p";
		modulo.waitingElement(driver, element, "xpath");
		WebElement consulta = driver.findElement(By.xpath(element));
		consulta.click();

		String value = consulta.getText().toString();
		System.out.println(value);

		assertEquals("Não existe pensão alimentícia", value);

	}

	public void NovoBeneficiario() {
		String element = "//*[@id='opt_beneficiario']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement novo = driver.findElement(By.xpath(element));
		novo.click();
	}

	public void NomeBeneficiario() {
		String element = "//*[@id='nom_beneficiario_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement nome = driver.findElement(By.xpath(element));
		nome.sendKeys("Teste");

	}

	public void CpfBeneficiario() {
		String element = "//*[@id='num_cpf_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement cpf = driver.findElement(By.xpath(element));
		cpf.sendKeys("14978499003");
	}

	public void BancoBeneficiario() {
		Select combo = new Select(driver.findElement(By.cssSelector("#cod_banco_pIndice")));
		combo.selectByIndex(3);
	}

	public void AgenciaBeneficiario() {
		String element = "//*[@id='num_agencia_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement agencia = driver.findElement(By.xpath(element));
		agencia.sendKeys("1111");

		WebElement agencia2 = driver.findElement(By.xpath("//*[@id='num_dv_agencia_1']"));
		agencia2.sendKeys("1");
	}

	public void ContaBeneficiario() {
		String element = "//*[@id='num_conta_corrente_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement conta = driver.findElement(By.xpath(element));
		conta.sendKeys("111111111111111");

		WebElement conta2 = driver.findElement(By.xpath("//*[@id='num_dv_cc_1']"));
		conta2.sendKeys("1");
	}

	public void DescontoDeAteBeneficiario() {
		String element = "//*[@id='mes_ano_ini_desconto_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement descontoDe = driver.findElement(By.xpath(element));
		descontoDe.sendKeys("20102010");

		WebElement descontoAte = driver.findElement(By.xpath("//*[@id='mes_ano_fim_desconto_1']"));
		descontoAte.sendKeys("20112019");

	}

	public void IncidenciaBeneficiario() {
		Select combo = new Select(driver.findElement(By.cssSelector("#ind_incidencia_1")));
		combo.selectByIndex(3);
	}

	public void ValorDescontoBeneficiario() {
		String element = "//*[@id='val_desconto_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement valordesconto = driver.findElement(By.xpath(element));
		valordesconto.sendKeys("2000");
	}

	public void SalarioMinimoBeneficiario() {
		String element = "//*[@id='qtd_desconto_sal_min_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement salario = driver.findElement(By.xpath(element));
		salario.sendKeys("1000");

	}

	public void PercentualBeneficiario() {
		String element = "//*[@id='perc_desconto_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement percentual = driver.findElement(By.xpath(element));
		percentual.sendKeys("10");
	}

	public void Incluir() {
		String element = "//*[@id='btn_acao_incluir']/img";
		modulo.waitingElement(driver, element, "xpath");
		WebElement incluir = driver.findElement(By.xpath(element));
		incluir.click();
	}

	public void Excluir() {
		String element = "//*[@id='ind_exclusao_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement excluir = driver.findElement(By.xpath(element));
		excluir.click();
	}

	public void ValideConsultaPensao() {
		String element = "//*[@id='TbBeneficiario']/tbody/tr[1]/td[2]";
		modulo.waitingElement(driver, element, "xpath");
		WebElement busca = driver.findElement(By.xpath(element));
		busca.click();

		String value = busca.getText().toString();
		System.out.println(value);

		assertEquals("Nome", value);

	}

	public void AlterarIncidenciaBeneficiario() {
		Select combo = new Select(driver.findElement(By.cssSelector("#ind_incidencia_1")));
		combo.selectByIndex(4);
	}

	// -----------------------------------------------------------------//
	// ----------------------Cancela Liberacao
	// Cadastro-----------------------------------//

	public void ValidarPrestadorImplantacao() {
		String elementStr = "/html/body/center/font";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement liberacao = driver.findElement(By.xpath(elementStr));

		liberacao.click();

		String value = liberacao.getText().toString();
		System.out.println(value);

		assertEquals("Prestador está em implantação em todas as operadoras.", value);
	}

	public void FlegCancelarLiberacao() {
		String element = "//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/table/tbody/tr[3]/td/fieldset/table/tbody/tr[3]/td[2]/input";
		modulo.waitingElement(driver, element, "xpath");
		WebElement cancelar = driver.findElement(By.xpath(element));
		cancelar.click();
	}

	public void OperacaoRealizado() {
		String element = "/html/body/center/font";
		modulo.waitingElement(driver, element, "xpath");
		WebElement operacao = driver.findElement(By.xpath(element));
		operacao.click();
	}

	// -----------------------------------------------------------------//
	// ----------------------Substituicao de
	// Prestador-----------------------------------//

	public void PrestadorSubstituto() {
		elementControlXpath("//*[@id='cod_prestador']");
		element.sendKeys("015415");


	}

	public void PrestadorSubstituto2() {
		String element = "//*[@id='cod_prestador']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement prestadorSubstituto = driver.findElement(By.xpath(element));
		prestadorSubstituto.sendKeys("013420");

	}

	public void FlegSubstituicao() {
		String element = "#cb_gridCandidatos";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement flegSubstituto = driver.findElement(By.cssSelector(element));
		flegSubstituto.click();

	}

	public void SubstitutoInicial() {
		String element = "#ind_substituto";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement substituto = driver.findElement(By.cssSelector(element));
		substituto.click();

	}

	public void Candidato() {
		String element = "#\\31  > td:nth-child(10) > input[type=checkbox]";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement candidato = driver.findElement(By.cssSelector(element));
		candidato.click();

	}

	public void Recusado() {
		String element = "#\\31  > td:nth-child(13) > input[type=checkbox]";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement recusado = driver.findElement(By.cssSelector(element));
		recusado.click();

	}

	public void Substituto() {
		String element = "#\\31  > td:nth-child(16) > input[type=checkbox]";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement Substituto = driver.findElement(By.cssSelector(element));
		Substituto.click();

	}

	public void Operadora() {
		Select combo = new Select(driver.findElement(By.cssSelector("#cod_operadora")));
		combo.selectByIndex(1);

	}

	public void Exclusao() {
		Select combo = new Select(driver.findElement(By.cssSelector("#cod_motivo_exclusao")));
		combo.selectByIndex(4);
	}

	public void LimparSubstituicao() {
		String element = "#btnlimpar";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement emitir = driver.findElement(By.cssSelector(element));
		emitir.click();

	}

	public void Emitir() {
		String element = "#ind_carta_desc";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement emitir = driver.findElement(By.cssSelector(element));
		emitir.click();
	}

	public void Observacao() {
		String element = "#txt_observacao";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement observacao = driver.findElement(By.cssSelector(element));
		observacao.sendKeys("TESTE");
	}

	public void SalvarSubstituicao() {
		String element = "//*[@id='btnsalvar']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement salvar = driver.findElement(By.xpath(element));
		salvar.click();
	}

	public void PesquisaGeral() {
		String element = "#btnvisualizar";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement pesquisa = driver.findElement(By.cssSelector(element));
		pesquisa.click();
	}

	// -----------------------------------------------------------------//
	// ----------------------Reativacao
	// Prestador-----------------------------------//

	public void PrestadorCanceladoReativacao() {
		String elementStr = "//*[@id='cod_prestador']";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement prestadorCancelado = driver.findElement(By.xpath(elementStr));
		prestadorCancelado.sendKeys("011444");

	}

	public void ValidarPrestadorNaoExcluido() {
		String elementStr = "//*[@id=\"tbl_inc_abre_table\"]/center/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td/fieldset/table/tbody/tr[2]/td/center/font";
		modulo.waitingElement(driver, elementStr, "xpath");
		WebElement naoexcluido = driver.findElement(By.xpath(elementStr));
		naoexcluido.click();

		String value = naoexcluido.getText().toString();
		System.out.println(value);

		assertEquals("Prestador não está excluído em nenhuma operadora.", value);
	}

	public void FlegReativar() {
		String element = "//*[@id='ind_reativar_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement reativar = driver.findElement(By.xpath(element));
		reativar.click();
	}

	public void FlegReativarParaTodasOperadoras() {
		String element = "//*[@id='ind_mesma_reativacao']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement reativartodas = driver.findElement(By.xpath(element));
		reativartodas.click();
	}

	public void DataReativacao() {
		String element = "//*[@id='dt_reativacao_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement datareativacao = driver.findElement(By.xpath(element));
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
		datareativacao.sendKeys(timeStamp);
	}

	// -----------------------------------------------------------------//
	// ----------------------Calendário Geral de Pagamentos a
	// Prestadores-----------------------------------//
	public void Ano() {
		String element = "#ano_calendario";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement ano = driver.findElement(By.cssSelector(element));
		ano.sendKeys("2020");
	}

	public void AdicionarData() {
		String element = "#Button2";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement adicionarData = driver.findElement(By.cssSelector(element));
		adicionarData.click();
	}

	public void DiaLimite() {
		String element = "//*[@id='dia_lmt_ent_0_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement dialimite = driver.findElement(By.xpath(element));
		dialimite.sendKeys("10");
	}

	public void DiaFechamento() {
		String element = "//*[@id='dia_fecha_0_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement diafechamento = driver.findElement(By.xpath(element));
		diafechamento.sendKeys("12");
	}

	public void DiaPagamento() {
		String element = "//*[@id='dia_pag_0_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement diafechamento = driver.findElement(By.xpath(element));
		diafechamento.sendKeys("11");
	}

	// -----------------------------------------------------------------//
	// ----------------------Tipo
	// Estabelecimento-----------------------------------//

	public void Codigo() {
		String element = "//*[@id='cod_tipo_prestador']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement codigo = driver.findElement(By.xpath(element));
		codigo.sendKeys("111");

	}

	public void Tipo() {
		String element = "//*[@id='nome_tipo_prestador']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement tipo = driver.findElement(By.xpath(element));
		tipo.sendKeys("TESTE");
	}

	public void GrupoClassificacao() {
		Select combo = new Select(driver.findElement(By.cssSelector("#cod_grupo")));
		combo.selectByIndex(1);
	}

	public void TipoServico() {
		Select combo = new Select(driver.findElement(By.cssSelector("#cod_tipo_servico")));
		combo.selectByIndex(3);
	}

	// -----------------------------------------------------------------//
	// ----------------------
	// Inclusao-----------------------------------//

	public void FlegFisica() {
		String element = "#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr:nth-child(1) > td:nth-child(4) > input[type=radio]:nth-child(1)";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement fisica = driver.findElement(By.cssSelector(element));
		fisica.click();

	}

	public void InformacoesComplementares() {
		System.out.println("Buscando o botão InformacoesComplementares.");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[2]/a"));
		System.out.println(element.getTagName());
		element.click();
	}

	public void EnderecoRelacionamento() {
		System.out.println("Buscando o botão Endereco Relaciomento.");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[4]/a"));
		System.out.println(element.getTagName());
		element.click();
	}

	public void Entrega() {
		System.out.println("Buscando o botão Entrega.");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[14]/a"));
		System.out.println(element.getTagName());
		element.click();
	}

	public void TipoAtendimento() {
		System.out.println("Buscando o botão Tipo Atendimento.");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[11]/a"));
		System.out.println(element.getTagName());
		element.click();
	}

	public void Documentacao() {
		System.out.println("Buscando o botão Documentacao");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[14]/a"));
		System.out.println(element.getTagName());
		element.click();
	}

	public void DadosPagamento() {
		System.out.println("Buscando o botão Dados de Pagamento.");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[13]/a"));
		System.out.println(element.getTagName());
		element.click();
	}

	public void EnderecoAntendimento() {
		System.out.println("Buscando o botão Endereco Antendimento");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[3]/a"));
		System.out.println(element.getTagName());
		element.click();

	}

	public void Habilitacao() {
		System.out.println("Buscando o botão Habilitacao.");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[7]/a"));
		System.out.println(element.getTagName());
		element.click();
	}

	public void TipoEstabelecimento() {
		System.out.println("Buscando o botão Tipo Estabelecimento.");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[6]/a"));
		System.out.println(element.getTagName());
		element.click();
	}

	public void Tarja() {
		elementControlXpath("//*[@id='tarja']");
		element.click();
	}

	public void RedeAtendimento() {
		// elementControlId("20");
		// "/html/body/form/h1[5]/a"
		// "#\32 0 > a"
		System.out.println("Buscando o botão Rede Credenciada.");
		WebElement element = driver.findElement(By.xpath("/html/body/form/h1[5]/a"));
		System.out.println(element.getTagName());
		element.click();

	}

	public void Residencia() {
		elementControlId("ind_residencia_1");
		element.click();
	}

	public void Cpf() {
		String element = "#num_cpf";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement cpf = driver.findElement(By.cssSelector(element));
		cpf.sendKeys("54968189079");

	}

	public void NomeInclusao() {
		String element = "#nome_entidade";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement nome = driver.findElement(By.cssSelector(element));
		nome.sendKeys("Teste2");
	}

	public void Classe() {
		Select combo = new Select(elementControlCssSelector("#cod_classe_rede"));
		combo.selectByIndex(2);
	}

	public void DataCredenciamento() {
		String element = "#dat_credenciamento";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement dataCredenciamento = driver.findElement(By.cssSelector(element));
		dataCredenciamento.sendKeys("02012020");
	}

	public void DataContratualizacao() {
		String element = "#dt_contratualizacao";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement dataContratualizacao = driver.findElement(By.cssSelector(element));
		dataContratualizacao.sendKeys("04012020");
	}

	public void AdicionarEndereco() {
		String element = "//*[@id=\"Form1\"]/center/input";
		modulo.waitingElement(driver, element, "xpath");
		WebElement endereco = driver.findElement(By.xpath(element));
		endereco.click();
	}

	public void Cep() {
		String element = "//*[@id='num_cep_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement cep = driver.findElement(By.xpath(element));
		cep.sendKeys("09560-070");
	}

	public void Numero() {
		String element = "//*[@id='num_endereco_1']";
		modulo.waitingElement(driver, element, "xpath");
		WebElement numero = driver.findElement(By.xpath(element));
		numero.sendKeys("45");
	}

	public void Manha() {
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(
				By.cssSelector("#dv_horarios_1 > fieldset > table > tbody > tr:nth-child(1) > td:nth-child(2)"));
		actions.doubleClick(elementLocator).perform();
	}

	public void Tarde() {
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(
				By.cssSelector("#dv_horarios_1 > fieldset > table > tbody > tr:nth-child(1) > td:nth-child(3)"));
		actions.doubleClick(elementLocator).perform();
	}

	public void Noite() {
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(
				By.cssSelector("#dv_horarios_1 > fieldset > table > tbody > tr:nth-child(1) > td:nth-child(4)"));
		actions.doubleClick(elementLocator).perform();
	}

	public void Inserir() {
		List<WebElement> titulo = driver.findElements(By.tagName("th"));
		for (WebElement webElement : titulo) {
			System.out.println("Coluna -> " + webElement.getText());
		}

		driver.findElement(By.partialLinkText("Inserir")).click();
//		elementControlXpath("/html/body/fieldset/center/table/tbody/tr/td/table/tbody/tr/td/form/center/center/div/div[1]/a");
//		element.click();
	}

	public void PesquisaRede() {
		WebElement tabela = driver.findElement(By.id("grid_rede"));
		List<WebElement> celulasdaTabela = tabela.findElements(By.xpath("//td[@role='gridcell']"));
		assertTrue(!celulasdaTabela.isEmpty());
		celulasdaTabela.get(1).click();

		// elementControlXpath("/html/body/fieldset/center/table/tbody/tr/td/table/tbody/tr/td/form/center/center/div/div[3]/table/tbody/tr[1]/td[2]/img");
//		element.click();

	}

	public void Clinica14() {
		String element = "#grid_tipo_prestador_1 > tbody > tr:nth-child(1) > td:nth-child(1) > input";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement clinica = driver.findElement(By.cssSelector(element));
		clinica.click();
	}

	public void Clinica13() {
		String element = "#grid_tipo_prestador_1 > tbody > tr.k-alt > td:nth-child(1) > input";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement clinica = driver.findElement(By.cssSelector(element));
		clinica.click();
	}

	public void Clinica4() {
		String element = "#grid_tipo_prestador_1 > tbody > tr:nth-child(3) > td:nth-child(1) > input";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement clinica = driver.findElement(By.cssSelector(element));
		clinica.click();
	}

	public void Principal() {
		String element = "#grid_tipo_prestador_1 > tbody > tr:nth-child(1) > td:nth-child(4) > input";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement principal = driver.findElement(By.cssSelector(element));
		principal.click();
	}

	public void Divulga2() {
		String element = "#grid_tipo_prestador_1 > tbody > tr.k-alt > td:nth-child(5) > input";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement divulga = driver.findElement(By.cssSelector(element));
		divulga.click();
	}

	public void Divulga() {
		String element = "#grid_tipo_prestador_1 > tbody > tr:nth-child(1) > td:nth-child(5) > input";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement divulga = driver.findElement(By.cssSelector(element));
		divulga.click();
	}

	public void Divulga3() {
		String element = "#grid_tipo_prestador_1 > tbody > tr:nth-child(3) > td:nth-child(5) > input";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement divulga = driver.findElement(By.cssSelector(element));
		divulga.click();
	}

	public void Adicionar() {
		List<WebElement> botoes = driver.findElements(By.tagName("input"));
		
		for (WebElement botao : botoes) {
			System.out.println("Botao -> " + botao.getText().toLowerCase());
			if(botao.getAttribute("value").toLowerCase().contains("adicionar")) {
				botao.click();
				
				break;
			}
				
				
		}
		
		
	}

	public void Pesquisa() {
		String element = "#form01 > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=button]:nth-child(2)";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement adicionar = driver.findElement(By.cssSelector(element));
		adicionar.click();
	}

	public void MarcarTodas() {
		String element = "#marcarTodos";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement marcar = driver.findElement(By.cssSelector(element));
		marcar.click();
	}

	public void ContinuarInclusao() {
		String element = "#btn_acao_continuar > img";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement continuar = driver.findElement(By.cssSelector(element));
		continuar.click();
	}

	public void PrincipalHabilitacao() {
		String element = "#\\32 0 > td:nth-child(2) > input[type=checkbox]";
		modulo.waitingElement(driver, element, "cssSelector");
		WebElement principal = driver.findElement(By.cssSelector(element));
		principal.click();
	}

	public void Vigente() {
		elementControlCssSelector("#dt_vigencia_pgto");
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
		element.sendKeys(timeStamp);

	}

	public void FormaPagamento() {
		Select combo = new Select(driver.findElement(By.cssSelector("#ind_forma_pgto")));
		combo.selectByIndex(3);

	}

	public void AdicionarConta() {
		elementControlCssSelector("#div_cc > fieldset > table:nth-child(2) > tbody > tr > td > input");
		element.click();

	}

	public void IncluirNome() {
		elementControlCssSelector("#form01 > table > tbody > tr:nth-child(1) > td > a");
		element.click();

	}

	public void Sigla() {
		Select combo = new Select(driver.findElement(By.cssSelector("#sigla_conselho")));
		combo.selectByIndex(1);

	}

	public void NumeroInclusao() {
		elementControlId("Text4");
		element.sendKeys("454545454545454");
	}

	public void Uf() {
		Select combo = new Select(driver.findElement(By.cssSelector("#sgl_uf_conselho")));
		combo.selectByIndex(27);

	}

	public void BancoItau() {
		elementControlXpath("//*[@id='cod_banco_1']");
		element.sendKeys("341");
		;

	}

	public void AgenciaItau() {
		elementControlXpath("//*[@id='num_agencia_1']");
		element.sendKeys("0207");

	}

	public void ContaItau() {
		elementControlXpath("//*[@id='num_conta_corrente_1']");
		element.sendKeys("01205");

		elementControlXpath("//*[@id='num_dv_conta_1']");
		element.sendKeys("5");
	}

	public void PrincipalItau() {
		elementControlXpath("//*[@id='ind_principal1']");
		element.click();

	}

	public void Diploma() {
		elementControlXpath("//*[@id='grid_documentacao']/tbody/tr[5]/td[1]/input");
		element.click();

	}

	public void SelecionaOdonto() {
		elementControlId("header-chb");
		element.click();

	}

	public void SelecionaDivulga() {
		elementControlCssSelector("#grid_rede > tbody > tr:nth-child(1) > td:nth-child(6) > input");
		element.click();

	}

	public void BotaoIncluir() {
		elementControlCssSelector("#btn_acao_incluir > img");
		element.click();

	}

	// -----------------------------------------------------------------//
	// ----------------------
	// Desbloqueio e Bloqueio Usuario-----------------------------------//

	public void LoginPrestador() {
		elementControlId("cod_usuario");
		element.sendKeys("016128");
	}

	public void LoginCandidato() {
		elementControlId("cod_usuario");
		element.sendKeys("1313");
	}

	public void ValideDesbloqueio() {
		elementControlCssSelector(
				"#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > p > font");
		element.click();
		String value = element.getText().toString();
		System.out.println(value);

		assertEquals("Usuário desbloqueado", value);

	}

	public void ValideBloqueio() {
		elementControlCssSelector(
				"#tbl_inc_abre_table > center > table > tbody > tr > td > table > tbody > tr > td > p > font");
		element.click();
		String value = element.getText().toString();
		System.out.println(value);

		assertEquals("Usuário bloqueado", value);

	}
	
	// -----------------------------------------------------------------//
		// ----------------------
		// ------------Calendario de Reajuste Prestador-----------------------//
	
	public void Referencia() {
		elementControlId("mes_ano_ref");
		element.click();
		element.sendKeys("09/2020");
	}
	
	public void ReferenciaPrestador() {
		elementControlId("mes_ano_ref");
		element.click();
		element.sendKeys("02/2020");
	}
	
	
	public void IndiceEconomico() {
		Select combo = new Select(driver.findElement(By.cssSelector("#cod_indice")));
		combo.selectByIndex(1);
	}
	
	public void Reajuste() {
		elementControlId("dia_reajuste");
		element.click();
		element.sendKeys("5");
	}
	
	public void Processamento() {
		elementControlId("dia_processamento");
		element.click();
		element.sendKeys("4");
	}
	
	public void Salvar() {
		elementControlId("btnsalvar");
		element.click();
	}
	
	public void ProcessamentoAlteracao() {
		elementControlId("dia_processamento");
		element.sendKeys(Keys.BACK_SPACE);
		element.sendKeys("8");
	}
	
	public void ExcluirCalendario() {
		elementControlId("btnexcluir");
		element.click();
	}
	
	public void BotaoPrestador() {
		elementControlId("btnprestadores");
		element.click();
	}
	
	public void ReferenciaContratoDe() {
		elementControlId("ref_contrato_de");
		element.click();
		element.sendKeys("01012020");
	}
	
	public void ReferenciaContratoAte() {
		elementControlId("ref_contrato_ate");
		element.click();
		element.sendKeys("10022020");
	}
	
	public void ExecutarCalendario() {
		elementControlId("btBuscar");
		element.click();
	}
	

}
