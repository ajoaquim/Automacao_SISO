#Auto generated Octane revision tag
@TID18815REV0.2.0 
Feature: Manutenção Cancelamento de pagamento
Como um usuário, Devo possuir acesso para realizar uma liberação de pagamento. Realizar testes com Reembolso e Credenciado.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Pagamento,Liberação Pagamentos por data pagamento

  
	Scenario: Efetuar liberação de pagamento de Reembolso
         When informar os dados de pesquisa pagamento
         And selecionar continuar pagamento
         And selecionar o pagamento para liberação pagamento
         And selecionar Executar pagamento 
         And o sistema apresenta a mensagem Operação realizada com sucesso pagamento
         Then em Análise o pagamento é apresentado como calculado pagamento
     @18815   
    Scenario: Efetuar liberação de pagamento de Credenciado 
         When informar os dados de pesquisa pagamentooo
         And selecionar continuar pagamentooo
         And selecionar o pagamento para liberação pagamentooo
         And selecionar "Executar" pagamentooo
         And o sistema apresenta a mensagem "Operação realizada com sucesso" pagamentooo
         Then em "Análise" o pagamento é apresentado como calculado pagamentooo

        
