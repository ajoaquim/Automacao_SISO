#Auto generated Octane revision tag
@TID9511REV0.7.0 @9511
Feature: Liberação de Pagamento RB. Como um usuário, Devo possuir acesso para realizar Liberação de Pagamento RB. A data de processamento precisa ser igual ou maior a data de pagamento. Para realizar essa operação é necessário ter um reembolso solicitado.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Pagamento,Liberação de Pagamento RB

	Scenario: Efetuar a Liberação de Pagamento RB
        When preencher os dados de pesquisa.
        And selecionar Continuar
        And selecionar um pagamento  para liberação
        And flegar o Reembolso a ser liberado
        And Gravar as alterações
        And o valor selecionado fica na coluna Liberado
        And selecionar Processar pagamento
        Then sistema apresenta a mensagem Operação realizada com sucesso assim como o valor na coluna liberado fica zerado

  
        

        