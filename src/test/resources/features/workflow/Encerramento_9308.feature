#Auto generated Octane revision tag
@TID9308REV0.11.0 @9308 @workflow
Feature:Como um usuário, devo possuir acesso para realizar um encerramento em Workflow > Encerramento. Apenas o primeiro e o último da fila poderão realizar um encerramento. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When acesse a aba "Workflow","Encerramento"

     Scenario: Encerrar uma solicitação
		When informar um "Nº da Solicitação" já existentes
        And clicar fora do campoo
        And "Alterar" a solicitação
        And o sistema informa "Encerramento da solictação realizado"
        Then a solicitação fica com status encerrado pelo solicitante
       
