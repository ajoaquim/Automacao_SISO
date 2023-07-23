#Auto generated Octane revision tag
@TID9534REV0.14.0 @9534 @reembolso
Feature: Manutenção Cancelamento Pedido Reembolso
  Como um usuário, Devo possuir acesso para realizar Cancelamento de Cancelamento Pedido Reembolso.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reembolso Odontológico,Cancelamento Pedido Reembolso

  @9534A
  Scenario: Validar menu Consultar Reembolsos
    When informar um pedido existente
    And clicar fora do campo preenchido
    And clicar em Consultar Reembolsos do beneficiários
    Then o sistema abre a tela de consulta de Reembolsos

  @9534B
  Scenario: Validar menu Alertas Beneficiário
    When informar um pedido existente
    And clicar fora do campo preenchido
    And clicar em Alerta Beneficiários
    Then o sistema abre a tela de Alertas Beneficiários

  @9534C
  Scenario: Validar menu Contatos do Beneficiário
    When informar um pedido existente
    And clicar fora do campo preenchido
    And clicar em Contatos do Beneficiários
    Then o sistema abre a tela de Contatos do Beneficiários

  @9534D
  Scenario: Validar menu Histórico de Procedimentos
    When informar um pedido existente
    And clicar fora do campo preenchido
    And clicar em Histórico de Procedimento
    Then o sistema abre a tela de Histórico de Procedimento

  @9534E
  Scenario: Validar menu Dados beneficiário/Contratos
    When informar um pedido existente
    And clicar fora do campo preenchido
    And clicar em Dados beneficiário/Contrato
    Then o sistema abre a tela de Dados beneficiário/Contrato

  @9534F
  Scenario: Validar Cancelamento de Pedido de Reembolso com Status de Em Análise
    When informar um  Reembolso Em Análise
    And clicar no Botão Continuar
    And clicar no botão de cancelar
    And o sitema apresenta Tela de Cancelamento Pedido Reembolso
    And Preencher campos obrigatórios no pedido com status em analise
    And clicar no botão Cancelar Pedido
    Then o sistema apresenta a mensagem Cancelamento realizado

  @9534G
  Scenario: Validar Cancelamento de Pedido de Reembolso com Status de Aguardando Documento
    When informar um  Reembolso Aguardando Documento
    And clicar no Botão Continuar
    And clicar no botão de cancelar
    And o sitema apresenta Tela de Cancelamento Pedido Reembolso
    And Preencher campos obrigatórios no pedido com status de aguardando documento
    And clicar no botão Cancelar Pedido
    Then o sistema apresenta a mensagem Cancelamento realizado

  @9534H
  Scenario: Validar Cancelamento de Pedido de Reembolso com Status de Cancelado
    When informar um  Reembolso Cancelado
    And clicar fora do campo preenchido
    Then o sistema apresenta a mensagem Pedido não pode ser cancelado pois está na situação Cancelado

  @9534I
  Scenario: Validar Cancelamento de Pedido de Reembolso com Status de Enviado para pagamento
    When informar um  Reembolso enviado para pagamento
    And clicar fora do campo preenchido
    Then o sistema apresenta a mensagem Pedido não pode ser cancelado pois está na situação Enviado para Pagamento

  @9534K
  Scenario: Validar Cancelamento de Pedido de Reembolso com Status de Negado
    When informar um  Reembolso com status Negado
    And clicar fora do campo preenchido
    Then o sistema apresenta a mensagem Pedido não pode ser cancelado pois está na situação Negado
