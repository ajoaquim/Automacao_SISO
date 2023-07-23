#Auto generated Octane revision tag
@TID9239REV0.8.0 @9239
Feature:Alterar data prevista para pagamento de uma remessa que já tenha data. É possivel fazer alteração com uma data futura ou posterior da que já esteja na remessa Os valores são alterados no ato. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Conta Odontológica,Alteração Data Prevista Pagto   

	Scenario: Efetuar alteração da data prevista para pagamento
        When realizar o filtro para busca da remessa alt data
        And selecinar continuar alt data
        And selecionar uma Remessa alt data
        And realizar a alteração das datas alt
        And selecionar executar alt data
        Then o sistema apresenta um pop-up com as alterações realizadas alt data