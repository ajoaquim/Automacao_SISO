#Auto generated Octane revision tag
@TID9531REV2.9.0 @9531 @reembolso
Feature:Manutenção Alteração Análise
Como um usuário, Devo possuir acesso para realizar consulta de Alteração Análise


Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reembolso Odontológico,Alteração/Análise
    
   @9531a
   Scenario: Validar menu Consultar Reembolsos
        When informar um Beneficiário existente Alteracao
        And clicar fora do campo Alteracao
        And clicar em Consultar Reembolsos do beneficiário Alteracao
        Then o sistema abre a tela de consulta de Reembolso Alteracao
    
   @9531b  
   Scenario: Validar menu Histórico de Procedimentos 
        When informar um Beneficiário existente Alteracao
        And clicar fora do campo Alteracao
        And clicar em Histórico de Procedimentos Alteracao
        Then o sistema abre a tela de Histórico de Procedimentos Alteracao        
   
   @9531c
   Scenario: Validar menu Dados beneficiário/Contratos 
        When informar um Beneficiário existente Alteracao
        And clicar fora do campo Alteracao
        And clicar em Dados beneficiário/Contratos Alteracao 
        Then o sistema abre a tela de Dados beneficiário/Contratos Alteracao    
                
   @9531d
   Scenario: Validar menu Alertas Beneficiário
        When informar um Beneficiário existente Alteracao
        And clicar fora do campo Alteracao
        And clicar em Alertas Beneficiário Alteracao
        Then o sistema abre a tela de Alertas Beneficiário Alteracao    
   @9531e   
   Scenario: Validar menu Contatos do Beneficiário
        When informar um Beneficiário existente Alteracao
        And clicar fora do campo Alteracao
        And clicar em Contatos do Beneficiário Alteracao
        Then o sistema abre a tela de Contatos do Beneficiário Alteracao  
                   
   @9531f
    Scenario: Validar Alteração com Pedido de Status em Análise
		When informar um número de Reembolso existente com Status de Em Análise Alteracao
        And clicar no botão Continuar Alteracao
        And realizar um alteração nos dados Alteracao
        And clicar no botão Análise/Alteração Alteracao
		Then o sistema apresenta a mensagem Operação realizada com sucesso Alteracao
        
    @9531g
    Scenario: Validar Aprovação de Pedido
		When informar um número de Reembolso existente com Status de em Análise Alteracao Aprovacao
        And clicar no botão Continuar Alteracao
        And clicar no botão Submeter Alteracao
        And Preencher dados Obrigatórios  Alteracao
        And Clicar no botão Aprovar Pedido Alteracao
		Then o sistema apresenta a mensagem Operação realizada com sucesso Alteracao Aprovacao

	@9531h
	Scenario: Validar Consulta de Pedido Aprovado
		When informar um número de Reembolso existente com Status de Aprovado Alteracao
		Then O Sistema apresenta a mensagem Atenção: Pedido de reembolso nº já foi enviado para pagamento e não pode ser alterado Alteracao
  
   @9531j      
   Scenario: Cancelamento total dos procedimentos em Análise
		When informar um pedido de Reembolso Em Análise Alteracao
        And clicar no botão Continuar Alteracao
	    And clicar no botão Cancelar Alteracao
        And informar um Motivo de cancelamento Alteracao
        And clicar em Cancelar Alteracao
		Then o sistema apresenta mensagem de pedido cancelado Alteracao
 
 	@9531k
	Scenario: Validar Botão "Glosar Procedimento"  
		When informar um pedido de Reembolso Em Análise Alteracao Glosar
        And Clicar no botão Continuar Alteracao Glosar
        And Selecionar um Procedimento Alteracao
        And Clicar no Botão Glosar Procedimento Alteracao
        And Informar uma Glosa Alteracao
        And Clicar no Botão Executar Alteracao
        And O sistema apresenta mensagem Confirma gravação das glosas manuais? Alteracao
        And Clicar no botão OK Alteracao
		Then Glosa Inclusa com Sucesso em Procedimentos no campo Glosa Alteracao
	@9531l
	Scenario: Validar Botão "Aprovar Procedimento"
		When informar um pedido de Reembolso Em Análise Alteracao Aprovar
        And Clicar no botão Continuar Alteracao Aprovar
        And Selecionar um Procedimento Alteracao
        And Clicar no Botão  Aprovar Procedimento Alteracao
        And Liberar Glosas Alteracao
        And Preencher campos Alteracao
        And Clicar no Botão Executar Alteracao Aprovar
        And O sistema apresenta a mensagem Confirma as alterações realizadas? Alteracao
        And O sistema apresenta mensagem Liberação realizada com sucesso Alteracao

	@9531m
	Scenario: Validar Botão "Colocar Reembolso na Situação Aguardando Documento "
		When informar um pedido de Reembolso Em Análise Alteracao Aprovar
        And Clicar no botão Continuar Alteracao Aprovar
        And Clicar no Botão Colocar Reembolso na Situação Aguardando Documento  Alteracao
        And O sistema apresenta a mensagem Deseja coloca o pedido de reembolso na situação 'Aguardando Documento? Alteracao
        And Clicar no Botão OK Alteracao Documento
        Then O sistema apresenta a mensagem  Atenção: Pedido colocado na situação Aguardando Documento. Alteracao
	@9531n
	Scenario: Validar Botão "Reverter Situação" quando o Reembolso estiver com Status de "Aguardando Documento".
		When informar um pedido de Reembolso com Status de Aguardando Documento Alteracao
        And Clicar no botão Continuar Alteracao Aprovar
        And Clicar no Botão Voltar Situação Alteracao
        And O Sistema apresenta a mensagem Deseja voltar a situação do Reembolso para 'Em análise'? Alteracao
        And Clicar no Botão Ok Alteracao Documento
		Then O Sistema apresente a Mensagem Atenção: Situação do reembolso retornada com sucesso. Alteracao
        
