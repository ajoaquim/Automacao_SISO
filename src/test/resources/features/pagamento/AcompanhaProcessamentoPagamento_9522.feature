#Auto generated Octane revision tag
@TID9522REV0.8.0 @9522 @pagamento 
Feature:Como um usuário, Devo possuir acesso para gerar um relatório.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Pagamento,Relatórios,Relatório Acompanha Processamento do Pagamento

	Scenario: Gerar Relatório Acompanha Processamento do Pagamento
        When informar os dados necessários no menu acompanha processo pagamento
        And selecionar Continuar no menu acompanha processo pagamento
        Then o sistema realiza o download de um arquivo txt no menu acompanha processo pagamento