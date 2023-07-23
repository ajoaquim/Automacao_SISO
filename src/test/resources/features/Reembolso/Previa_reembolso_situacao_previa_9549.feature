#Auto generated Octane revision tag
@TID9549REV0.16.0 @9549 @reembolso
Feature:Prévia Reembolso-Situação Prévia
Como um usuário, devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Prévia de Reembolso.
Se data da prévia form menor que data atual, algumas ações não podem ser realizadas.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reembolso Odontológico,Prévia Reembolso,Situação Prévia

	Scenario:Validar Botão de Abrir Tela do Anexo de Reembolso com Situação de Previa Em Análise
		When Selecionar a fleg Em Análise na Situação Previa Reembolso
        And Clicar no Botão Pesquisar na tela de previa reembolso
        And Clicar no Botão Abrir Tela do Anexo de Reembolso
		Then Sistema Apresenta Tela de Anexo da Previa Reembolso 

	Scenario:Validar Botão de Abrir Tela de Alteração do Reembolso com Situação de Previa Em Análise  
		When Selecionar a fleg Em Análise na Situação Previa Reembolso
        And Clicar no Botão Pesquisar na tela de previa reembolso
        And Clicar no Botão Abrir Tela de Alteração do Reembolso
		Then Sistema Apresenta Tela de Alteração da Previa Reembolso. 
        
    Scenario:Validar Botão de Abrir Tela de Cancelamento de Reembolso com Situação de Previa Em Análise
		When Selecionar a fleg Em Análise na Situação Previa Reembolso
        And Clicar no Botão Pesquisar na tela de previa reembolso
        And Clicar no Botão Abrir Tela de Cancelamento de Reembolso
		Then Sistema Apresenta Tela de Cancelamento da Previa Reembolso. 
        
    Scenario:Validar Botão de Consulta Pedido de Reembolso com Situação de Previa Em Análise  
		When Selecionar a fleg Em Análise na Situação Previa Reembolso
        And Clicar no Botão Pesquisar na tela de previa reembolso
        And Clicar no Botão Consulta Pedido de Reembolso
		Then Sistema Apresenta Tela de Consulta da Previa Reembolso. 
        
	Scenario:Validar Botão de Abrir Tela do Anexo de Reembolso com Situação de Previa Autorizado
		When Selecionar a fleg Autorizado na Situação Previa Reembolso
        And Clicar no Botão Pesquisar na tela de previa reembolso
        And Clicar no Botão Abrir Tela do Anexo da Previa do Reembolso 
		Then Sistema Apresenta Tela de Anexo da Previa Reembolso         
    
    Scenario:Validar Botão de Consulta Pedido de Reembolso com Situação de Previa Autorizado 
		When Selecionar a fleg Autorizado na Situação Previa Reembolso
        And Clicar no Botão Pesquisar na tela de previa reembolso
        And Clicar no Botão Consulta Pedido de Previa de Reembolso
		Then Sistema Apresenta Tela de Consulta da Previa Reembolso.     
        
	Scenario: Validar Botão de Consulta Pedido de Reembolso com Situação Negado,Cancelado,Aguardando Documento.
		When Selecionar uma situação exceto Status Em Análise 
        And Clicar no Botão Pesquisar na tela de previa reembolso
        And Clicar no Botão Consulta Pedido de Reembolso
		Then Sistema Apresenta Tela de Consulta do Reembolso.          
        
        