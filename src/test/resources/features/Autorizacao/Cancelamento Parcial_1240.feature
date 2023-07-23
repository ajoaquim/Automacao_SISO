#Auto generated Octane revision tag
@TID1240REV0.9.0 @1240 @SISO @autorizacao
Feature: Autorização 1240 - Manutenção Cancelamento Parcial
  Como um usuário, Devo possuir acesso para realizar consulta e exclusão de Cancelamento Parcial.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senhaw
    And o sistema apresenta a mensagem de boas vindas
    And acesse a aba Autorização Pedido de Autorização e Cancelamento Parcial

  Scenario: Validar exclusão Parcial
    When Informar um número de Pedido autorizado
    And Clicar no Botão Continuar Cancelamento Parcial
    And Flegar o Procedimento para cancelamento
    And Clicar no Botão Cancelamento Parcial
    And clicar no botão "Confirmar" da mensagem confirmação
    Then o sitema apresenta a mensagem xxx
