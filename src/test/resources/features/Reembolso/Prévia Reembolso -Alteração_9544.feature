#Auto generated Octane revision tag
@TID9544REV0.35.0 @9544 @reembolso
Feature:Manutenção Prévia Reembolso -Alteração
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Prévia Reembolso -Alteração

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Reembolso Odontológico","Prévia Reembolso","Alteração" alteração
	 
	 Scenario: Validar Alteração com Pedido de Status em Análise
		When informar um "número de prévia" existente com Status de "Em Análise" alteração
        And clicar no botão "Continuar" alteração
        And realizar um alteração nos dados alteração
        And clicar no botão "Análise/Alteração" alteração
		Then o sistema apresenta a mensagem "Atenção: Alteração/Análise pedido nº realizada." alteração

    Scenario: Validar Aprovação de Pedido
		When informar um número de prévia existente com Status de em Análise 
        And clicar no botão Continuar alteracao
        And clicar no botão Submeter alteracao
        And o sistema apresenta a mensagem Deseja finalizar a prévia de Reembolso? alteracao
		Then o sistema apresenta a mensagem Operação realizada com sucesso alteracao 
		
		Scenario: Validar Consulta de Pedido Aprovado
			When informar um "número de prévia"existente com Status de "Aprovado"
			Then Sistema exibe a tela de Prévia sem a opção de alteração dos campos
     
   Scenario: Validar Botão Cancelar 
		When informar um "número de prévia" existente com Status de "Em Análise" previa
        And clicar no botão  Continuar previa 
	    And clicar no botão Cancelar previa 
        And O sistema apresenta mensagem Deseja cancelar a prévia de Reembolso? previa 
        And Clicar no Botão "OK" previa 
		Then o sistema apresenta mensagem Atenção: Cancelamento da prévia realizado. previa

	Scenario: Validar Botão Glosar Procedimento
		When informar um número de prévia existente com Status de Em Análise previaaa
        And Clicar no botão Continuar previaaa
        And Selecionar um Procedimento previaaa
        And Clicar no Botão Glosar Procedimento previaaa
        And Informar uma Glosa  previaaa
        And Clicar no Botão Incluir Glosa Manual previaaa
        And Clicar no Botão Executar previaaa
        And O sistema apresenta mensagem Confirma gravação das glosas manuais? previaaa
        And Clicar no botão Ok previaaa
		Then Glosa Inclusa com Sucesso em Procedimentos no campo Glosa previaaa

    Scenario: Validar Botão Excluir Procedimento
		When informar um "número de prévia" existente com Status de "Em Análise" previaa
        And Clicar no botão Continuar previaa
        And Selecionar um Procedimento previa 
        And Clicar no Botão  Excluir Procedimento previa 
        And O sistema apresenta mensagem Deseja excluir todos os procedimentos selecionados? previa 
        And Clicar no Botão OK previa 
        Then O sistema apresenta a mensagem Atenção: Gravação realizada com sucesso previa 
      
	Scenario: Validar Botão Aprovar Procedimento
		When informar um número de prévia existente com Status de Em Análise previaaapreviaaa
        And Clicar no botão Continuar previaaapreviaaa
        And Selecionar um Procedimento previaaapreviaaa
        And Clicar no Botão  Aprovar Procedimento previaaapreviaaa
        And Liberar Glosas previaaapreviaa
        And O sistema apresenta a mensagem Confirma as alterações realizadas? previaaapreviaaa
        And Clicar no Botão OK previaaapreviaaaa
        And O sistema apresenta mensagem Atenção: Gravação realizada com sucesso previaaapreviaa

	Scenario: Validar Botão Colocar Prévia na Situação Aguardando Documento
		When informar um "número de prévia" existente com Status de "Em Análise" previaaaa
        And Clicar no botão Continuar previaaaa
        And Clicar no Botão Colocar Prévia na Situação Aguardando Documento previaaaa 
        And O sistema apresenta a mensagem "Deseja coloca o pedido de Prévia na situação 'Aguardando Documento' ?" previaaaa
        And Clicar no Botão OK previaaaa
        Then O sistema apresenta a mensagem Atenção: Prévia colocada na situação Aguardando Documento. previaaaa

	Scenario: Validar Botão Reverter Situação quando o Reembolso estiver com Status de Aguardando Documento
		When informar um "número de prévia com Status de "Aguardando Documento previa previa
        And Clicar no botão Continuar previa previa
        And Clicar no Botão Reverter Situação previa previa 
        And O Sistema apresenta a mensagem Deseja voltar a situação da prévia para Em Análise? previa previa
        And Clicar no Botão Ok previa previa
		Then O Sistema apresente a Mensagem " Atenção: Situação da prévia retornada com sucesso." previa previa

  	Scenario: Validar Botão Reverter Situação quando o Reembolso estiver com Status de Cancelado 
		When informar um número de prévia com Status de Cancelado previaaprevia
        And Clicar no botão Continuar previaaprevia
        And Clicar no Botão Reverter Situação previaaprevia
        And O Sistema apresenta a mensagem Deseja voltar a situação da prévia para Em Análise ? previaaprevia
        And Clicar no Botão Ok previaaprevia
		Then O Sistema apresente a Mensagem Atenção: Situação da prévia retornada com sucesso. previaaprevia
  