#Auto generated Octane revision tag
@TID1261REV0.4.0 @1261 @autorizacao
Feature: Manutenção Anexos
  Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Anexos.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senhaw
    And o sistema apresenta a mensagem de boas vindas
    And acesse a aba Autorização->Pedido de Autorização-> Anexos

  Scenario: Efetuar a inclusão de Anexo
    When Informar um número de pedido existente
    And Clicar no Botão "Continuar" em autorização
    And Anexar documentos
    And Clucar no botão "Executar" em autorização
    Then o sistema apresenta a mensagem "Operação Realizada com sucesso "

  Scenario: Validar consulta de Anexo
    When Informar um número de pedido existente
    And Clicar no Botão "Continuar" em autorização
    Then o sistema apresenta o resultado da busca

  Scenario: Validar Alteração
    When Informar um número de pedido existente
    And Clicar no Botão "Continuar" em autorização
    And realizar uma alteração nos dados
    And clicar no botão "Executar"
    Then o sistema apresenta a mensagem "Operação Realizada com sucesso "
