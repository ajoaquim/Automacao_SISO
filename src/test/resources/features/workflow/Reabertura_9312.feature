#Auto generated Octane revision tag
@TID9312REV0.9.0 @9312 @workflow
Feature:Workflow Reabertura
Como um usuário, Devo possuir acesso para realizar uma abertura Workflow ->  Reabertura

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When acesse a aba "Workflow","Reabertura"

	Scenario: Validar Reabertura com solicitação 
		When informar um "Nº da Solicitação" já encerrada
        And clicar fora do campo reabertura
		And o sistema apresentar o resultado da busca
        And clicar no botão "Reabrir"
        And o sistema apresenta a mensagemm "Operação realizada com sucesso"  
        Then a solicitação volta para fila de análise.
        

        