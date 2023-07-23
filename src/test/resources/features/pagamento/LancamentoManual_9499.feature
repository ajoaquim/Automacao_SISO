#Auto generated Octane revision tag
@TID9499REV0.7.0 @9499 @pagamento
Feature:Manutenção Lançamento Manual
Como um usuário, Devo possuir acesso para realizar inclusão, consulta, e exclusão de Lançamento Manual.


Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas 
    When selecionar o menu Pagamento,Lançamento Manual

	Scenario: Efetuar inclusão de um Lançamento Manual
        When incluir um novo lançamento informando Adiantamento Prestador de Serviços no menu de lancamento manual
        And informar os dados do lançanmento no menu de lancamento manual
        And clicar no botão Incluir no menu de lancamento manual
        Then o sistema apresenta a mensagem Operação realizada com sucesso no menu de lancamento manual
        
    Scenario: Efetuar a consulta de um Lançamento Manual
        When informar um número de Item de Pagamento já existente no menu de lancamento manual
        Then o sistema apresenta em tela os dados da consulta no menu de lancamento manual
        
    Scenario: Efetuar a exclusão de um Lançamento Manual
        When informar um número de Item de Pagamento já existente no menu de lancamento manual
        And selecionar Excluir no menu de lancamento manual
        Then o sistema apresentar a mensagem Operação realizada com sucesso no menu de lancamento manual
        
        
        
   
        
   