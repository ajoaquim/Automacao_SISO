#Auto generated Octane revision tag

@TID18886REV0.1.0 @9302 @workflow




Feature: Workflow Abertura 
  Como um usuário, devo possuir acesso para realizar a abertura de uma solictação no Workflow, após a abertura da solicitação a mesma é enviada para uma fila de serviços que deve seguir o fluxo de acordo com o tipo de solicitação que foi aberto.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senhaw
    And o sistema apresenta a mensagem de boas vindas
    When acesse a aba "Workflow","Aberta"

  Scenario: Abertura de solicitação
    When informar um tipo de "usuário"
    And clicar fora do campo Abertura
    And informar os dados de inclusão
    And clicar em "Executar"
    And o sistema apresenta a mensagem "Operação realizada com sucesso"
    Then a solicitação é enviada para fila de análise
