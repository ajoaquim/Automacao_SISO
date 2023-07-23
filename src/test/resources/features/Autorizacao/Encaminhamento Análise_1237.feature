#Auto generated Octane revision tag
@TID1237REV0.9.0 @SISO @1237 @autorizacao
Feature: Manutenção Encaminhamento Análise
  Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Encaminhamento Análise.

  Background: 
    Given que acesse o sistema Odonto
    And preencho usuário e senha
    And acesse a aba Encaminhamento Análise

  @1237A
  Scenario: Validar consulta de Situação
    When Informar número de Pedido com Status
    And clicar no o botão de continuar
    Then o sistema apresenta o resultado buscado
  @1237B
  Scenario: Validar Encaminhamento para Grupo Análise
    When Informar  analise número de Pedido com Status
    And clicar analise  no o botão de continuar
    And Informar analise grupo de análise
    Then é apresentada uma mensagem ""

  @1237C
  Scenario: Validar Encaminhamento para Grupo Análise com Status de Cancelado
    When Informar número de Pedido existente com Status de "Cancelado " encaminhamento analise
    And analise clicar no o botão de continuar analisee
    Then o sitema apresenta a mensagem "Atenção: Pedido não pode ser Encaminhado pois está na situação Cancelado" encaminhamento analise
