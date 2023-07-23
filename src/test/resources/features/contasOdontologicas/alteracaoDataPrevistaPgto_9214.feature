#Auto generated Octane revision tag
@TID9214REV0.10.0 @9214 @contasodontologicas
Feature: Alterar data prevista para pagamento de uma remessa que já tenha data. É possivel fazer alteração com uma data futura ou posterior da que já esteja na remessa Os valores são alterados no ato. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Conta Odontológica,Alteração Data Prevista Pagto  

	Scenario: Efetuar alteração da data prevista para pagamento
        When realizar o filtro para busca da remessa na tela de alteracao data prevista pgto
        And selecinar continuar na tela de alteracao data prevista pgto
        And selecionar uma Remessa na tela de alteracao data prevista pgto
        And realizar a alteração das datas na tela de alteracao data prevista pgto
        And selecionar executar na tela de alteracao data prevista pgto
        Then o sistema apresenta um pop-up com as alterações realizadas na tela de alteracao data prevista pgto

	

