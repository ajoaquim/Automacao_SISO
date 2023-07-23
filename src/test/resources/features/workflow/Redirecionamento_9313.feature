#Auto generated Octane revision tag
@TID9313REV0.13.0 @9313 @workflow
Feature:Como um usuário, devo possuir acesso para realizar um redirecionamento em Workflow -> Redirecioamento
O redirecionamento deve ser para o próximo da fila, seguindo o fluxo do motivo de abertura do Workflow.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When acesse a aba "Workflow","Redirecionamento"


	Scenario: Validar Redirecionamento
		When informar um "Nº da Solicitação" já existente 
        And clicar foraa do campoo
		And o sistema apresentar o resultado da buscaaa
        And informar "Nova área"
        And selecionar no botãoo "Alterar"
        And o sistema apresenta a mensagemmm "Operação realizada com sucesso"   
        Then a solicitação é encaminhada para a área informada
        
