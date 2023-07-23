#Auto generated Octane revision tag
@TID9504REV0.9.0 @9504 @pagamento
Feature:Manutenção Cancelamento de pagamento
Como um usuário, Devo possuir acesso para realizar um Cancelamento de pagamento. O pagamento para cancelamento não poderá estar com o status de liberado. Realizar testes com Reembolso e Credenciado.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Pagamento,Cancelamento de pagamento

	Scenario: Efetuar  Cancelamento de pagamento de Reembolso
         When informar os dados de pesquisa no menu cancelamento de pagamento
         And selecionar continuar no menu cancelamento de pagamento
         And flegar o pagamento para cancelamento no menu cancelamento de pagamento
         And selecionar Executar no menu cancelamento de pagamento
         And o sistema apresenta a mensagem Operação realizada com sucesso no menu cancelamento de pagamento
         Then o em Análise RB o pagamento é apresentado como cancelado no menu cancelamento de pagamento
        
    Scenario: Efetuar  Cancelamento de pagamento de Credenciado 
         When informar os dados de pesquisa de credenciado no menu cancelamento de pagamento
         And selecionar continuar no menu cancelamento de pagamento
         And flegar o pagamento para cancelamento no menu cancelamento de pagamento
         And selecionar Executar no menu cancelamento de pagamento
         And o sistema apresenta a mensagem Operação realizada com sucesso no menu cancelamento de pagamento
         Then o em Análise o pagamento é apresentado como cancelado no menu cancelamento de pagamento

        