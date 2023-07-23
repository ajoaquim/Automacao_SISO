#Auto generated Octane revision tag
@TID1282REV0.11.0 @1282 @autorizacao
Feature: Manutenção Cancelamento Parcial
  Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Cancelamento Parcial.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senhaw
    And o sistema apresenta a mensagem de boas vindas
    And acesse a aba Autorização->Pedido de Autorização-> Cancelamento Parcial

  Scenario: Validar consulta
    When Informar um número de pedido existente na tela cancelar
    And Clicar no Botão Continuar na tela cancelar
    Then o sistema apresenta o resultado da busca na tela cancelar

  Scenario: Validar Cancelamento de Pedido com status Autorizado
    When Informar um número de pedido Autorizado
    And Clicar no Botão Continuar na tela cancelar
    And Clicar no Botão Cancelar na tela cancelar
    And Preencher campos na tela cancelar
    And Clicar no Botão Cancelar Pedido Autorizado
    Then o sitema apresenta a mensagem Cancelamento realizado

  Scenario: Validar Cancelamento de Pedido com status Em análise
    When Informar um número de pedido em análise
    And Clicar no Botão Continuar na tela cancelar
    And Clicar no Botão Cancelar na tela cancelar
    And  Preencher campos na tela cancelar
    And Clicar no Botão Cancelar Pedido em Analise
    Then o sitema apresenta a mensagem Cancelamento realizado

  Scenario: Validar Cancelamento de Pedido com status de Negado
    When Informar um número de pedido Negado
    And Clicar no Botão Continuar na tela cancelar Autorização
    Then o sitema apresenta a mensagem " Atenção: Pedido não pode ser cancelado pois está na situação Negado"
