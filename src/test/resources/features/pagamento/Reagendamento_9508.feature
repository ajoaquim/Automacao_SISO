#Auto generated Octane revision tag
@TID9508REV0.10.0 @9508
Feature:Manutenção Reagendamento
Como um usuário, Devo possuir acesso para realizar um reagendamento. Para realizar um reagendamento é necessário ter um pagamento não liberado. Só será possível fazer uma reagendamento com data futura. Testar pagamento vindo do módulo Contas Ondontológicas e do de Reembolso.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reagendamento

	Scenario: Efetuar  Reagendamento via Reembolso
        When preencher os dados de busca de reembolso
        And pesquisar reagendamento
        Then o sistema apresenta a todos os agendamentos
        And selecionar um pagamento
        And informar a Nova Data Prevista
        And o sistema apresentar a mensagem operação realizada com sucesso
        Then o pagamento fica uma nova data prevista
        
    Scenario: Efetuar  Reagendamento via Contas Ondontológicas
        When preencher os dados de busca de contas ondontológicas
        And pesquisar reagendamento
        Then o sistema apresenta a todos os agendamentos
        And selecionar um pagamento
        And informar a Nova Data Prevista
        And o sistema apresentar a mensagem operação realizada com sucesso
        Then o pagamento fica uma nova data prevista

	
        

        