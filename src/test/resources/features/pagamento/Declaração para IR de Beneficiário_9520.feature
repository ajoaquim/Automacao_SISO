#Auto generated Octane revision tag
@TID9520REV0.7.0 @9520
Feature: Como um usuário, Devo possuir acesso para gerar um relatório.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Pagamento,Relatrios ,Declaração para IR de Beneficiário declaracao pagamento
	
	Scenario: Gerar relatório de Declaração para IR de Beneficiário
        When informar os dados necessários declaracao
        And selecionar "Continuar" declaracao
        Then o sistema apresenta em tela os dados buscados declaracao

