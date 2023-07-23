#Auto generated Octane revision tag
@TID9306REV0.16.0 @9306 @workflow
Feature: Como um usuário, devo possuir acesso para realizar uma consulta em Workflow > Consulta Geral.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When acesse a aba "Workflow","Consulta Geral"


	
  Scenario: Consultar histórico
    When informar uma "Solicitação" de consulta geral já existente
    And selecionar Histórico consulta geral
    And o dados for apresentado em tela consultar historico consulta geral
    And selecionar Envio de acompanhamento de demanda consulta geral
    And selecionar a forma de retorno consulta geral
    And selecionar Executar consulta geral 
    Then o Acompanhamento de demanda é enviado para o canal informado consulta historico consulta geral

  