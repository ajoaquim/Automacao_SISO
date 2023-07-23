#Auto generated Octane revision tag
@TID9523REV0.9.0 @9523
Feature: Como um usuário, Devo possuir acesso para gerar um relatório.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Itens Pagamento

	Scenario: Gerar Relatório Itens Pagamento
        When informar os dados necessários
        And selecionar Continuar
        Then o sistema apresenta em tela os dados buscados