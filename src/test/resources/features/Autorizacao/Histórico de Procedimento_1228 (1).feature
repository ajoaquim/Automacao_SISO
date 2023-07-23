#Auto generated Octane revision tag
@TID1228REV0.10.0 @1228 @autorizacao
Feature: Autorização 1228 - Manutenção Histórico de Procedimento
  Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Histórico de Procedimento.

    Background: 
    Given que acesso o sistema SISO
    And preencho o login e senhaw
    And o sistema apresenta a mensagem de boas vindas
    And acesse a aba Autorização Pedido de Autorização e Histórico de Procedimento

  Scenario: Efetuar a consulta do Histórico de Procedimento
    When informar um "pedido" já existente no historico de procedimento
    And clicar no botão F2 - Executar
    Then o sistema apresenta a tela de Histórico de Procedimento
