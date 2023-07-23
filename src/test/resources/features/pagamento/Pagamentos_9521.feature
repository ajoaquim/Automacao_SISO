#Auto generated Octane revision tag
@TID9521REV0.6.0 @9521
Feature:Como um usuário, Devo possuir acesso para gerar um relatório.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu pagamentos

	Scenario: Gerar relatório de Pagamentos
        When informar os dados
        And selecionar Continuar"
        Then o sistema apresenta em tela os pagamentos buscados

                                                