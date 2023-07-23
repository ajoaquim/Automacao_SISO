#Auto generated Octane revision tag
@TID9532REV1.13.0 @9532 @reembolso
Feature:Manutenção Situação do Pedido de Reembolso
Como um usuário, Devo possuir acesso para realizar consulta de "Reembolso Odontológico > Situação do Pedido de Reembolso". 


Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reembolso Odontológico,Situação do Pedido de Reembolso

@9532a
	Scenario:Validar Botão de Abrir Tela do Anexo de Reembolso com Situação de Reembolso Em Análise
		When Selecionar a fleg Em Análise na Situação Pedido Reembolso
        And Clicar no Botão Pesquisar Situacao Pedido Reembolso
        And Clicar no Botão Abrir Tela do Anexo de Pedido Reembolso
		Then Sistema Apresenta Tela de Anexo do Pedido Reembolso
@9532b
	Scenario:Validar Botão de Abrir Tela de Alteração do Reembolso com Situação de Reembolso Em Análise  
		When Selecionar a fleg Em Análise na Situação Pedido Reembolso
        And Clicar no Botão Pesquisar Situacao Pedido Reembolso
        And Clicar no Botão Abrir Tela de Alteração do Pedido Reembolso
		Then Sistema Apresenta Tela de Alteração do Pedido Reembolso 
    @9532c
    Scenario:Validar Botão de Abrir Tela de Cancelamento de Reembolso com Situação de Reembolso Em Análise
		When Selecionar a fleg Em Análise na Situação Pedido Reembolso
        And Clicar no Botão Pesquisar Situacao Pedido Reembolso
        And Clicar no Botão Abrir Tela de Cancelamento de Pedido Reembolso
		Then Sistema Apresenta Tela de Consulta do Pedido Reembolso Cancelado 
    @9532d
    Scenario:Validar Botão de Consulta Pedido de Reembolso com Situação de Reembolso Em Análise  
		When Selecionar a fleg Em Análise na Situação Pedido Reembolso
        And Clicar no Botão Pesquisar Situacao Pedido Reembolso
        And Clicar no Botão Consulta Pedido de Pedido Reembolso
		Then Sistema Apresenta Tela de Consulta do Pedido Reembolso
  @9532e
	Scenario: Validar Botão de Consulta Pedido de Reembolso com Situação Negado,Pagamento Realizado,enviado para Pagamento,Aguardando Documento ou cancelado.
		When Selecionar uma situação exceto Status Em Análise Pedido Reembolso
        And Clicar no Botão Pesquisar Situacao Pedido Reembolso
        And Clicar no Botão Consulta Pedido de Reembolso Cancelado
		Then Sistema Apresenta Tela de Consulta do Reembolso Cancelado
   
       
      
 
        
        
