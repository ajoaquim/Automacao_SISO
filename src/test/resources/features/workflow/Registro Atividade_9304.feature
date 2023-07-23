#Auto generated Octane revision tag
@TID9304REV0.15.0 @9304 @workflow
Feature: Como um usuário, devo possuir acesso para realizar um redirecionamento, encerramento e registrar uma atividade em Workflow > Registro Atividade. A solicitação não poderá ser redirecionada antes da última sequência. Apenas primeiro e o último da fila poderão realizar um encerramento.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When acesse a aba "Workflow","Registro Atividade"
	

  Scenario: Registrar uma atividade
    When informar um Nº da Solicitação já existente rAtividadeee
    And clicar fora do campo rAtividadeee
    And registrar uma Atividade em registro rAtividadeee
    And Incluir o registro rAtividadeee
    Then a nova atividade é registrada no grid rAtividadeee

  Scenario: Redirecionar uma solicitação
    When informar um Nº da Solicitação já existente rAtividade
    And clicar fora do campo rAtividade
    And Redirecionar uma Solicitação rAtividade
    And Selecionar a área rAtividade
    And Alterar a solicitação rAtividade
    And o sistema informa Redirecionamento da solictação realizado rAtividade
    Then a solicitação é enviada para a área informada rAtividade

  Scenario: Encerrar uma solicitação
    When informar um Nº da Solicitação já existente rAtividadee
    And clicar fora do campo rAtividadee
    And Encerrar uma atividade  rAtividadee
    And Alterar a solicitaçãorAtividade  rAtividadee
    And o sistema informa Encerramento da solictação realizado rAtividadee
    Then a solicitação fica com status encerrado pelo solicitante  rAtividadee
