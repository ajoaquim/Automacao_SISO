#Auto generated Octane revision tag
@TID1229REV3.4.0 @1229 @autorizacao
Feature:Manutenção Situação dos Pedidos
  Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Situação dos Pedidos.

  Background:
    Given que acesse o sistema Odonto
    And preencho usuário e senha
    And acesse a aba Autorização/Pedido de Autorização/Situação dos Pedidos


  @validado-1229
  Scenario Outline: Filtrando as situações
    When selecionar Situação dos Pedidos "<sitpedidos>"
    And  clicar no botão Continuar da situacao dos pedidos
    Then o sistema irá exibir o resultado da consulta

    Examples:
      | sitpedidos          |
      | Autorizado          |
      | Cancelado           |
      | Em análise          |
      | Pedido para análise |

  @validado-1229
  Scenario: Validar em análise/Desbloqueio
    Given que filtrei a situação por em análise
    When clicar o botão Desbloquear Pedido
    And clicar em Desbloquear
    Then o sistema apresenta a tela de alteração.

  @validado-1229
  Scenario: Validar em análise/alteração
    Given que filtrei a situação por em análise
    When clicar o botão Alteração
    Then o sistema apresenta a tela de Alteração

  @validado-1229
  Scenario: Validar em análise/cancelar
    Given que filtrei a situação por em análise
    When clicar o botão Cancelamento
    And preencher os dados de cancelamento
    And clicar no botão Confirmar
    Then o sisteme volta para a tela de pesquisa

  @validando-1229 @target-entenderPqNaoApareceHistoricoHabilitadoParaClique
  Scenario: Validar em análise/histórico
    Given que filtrei a situação por em análise
    When clicar o botão Histórico
    Then o sistema apresenta a tela de Histórico.

  ######Autorizado
  @validando-1229 @target-faltaMassaParaRodarOScriptJaEstaCriado
  Scenario: Validar Autorizado/Desbloqueio
    Given que filtrei a situação por Autorizado
    When clicar o botão Desbloquear Pedido
    And clicar em Desbloquear
    Then o sistema apresenta a tela de alteração.

  @validado-1229
  Scenario: Validar Autorizado/alteração
    Given que filtrei a situação por Autorizado
    When clicar o botão Alteração
    Then o sistema apresenta a tela de Alteração

  @validado-1229
  Scenario: Validar Autorizado/cancelar
    Given que filtrei a situação por Autorizado
    When clicar o botão Cancelamento
    And preencher os dados de cancelamento
    And clicar no botão Confirmar
    Then o sistema volta para a tela de pesquisa

  @validado-1229
  Scenario: Validar Autorizado/revalidar
    Given que filtrei a situação por Autorizado
    When clicar o botão Revalidação
    And preencher os dados de revalidação
    And clicar no botão Confirmar
    Then o sistema volta para a tela de pesquisa

  @validado-1229
  Scenario: Validar Autorizado/histórico
    Given que filtrei a situação por Autorizado
    When clicar o botão Histórico
    Then o sistema apresenta a tela de Histórico.

  ######Cancelado
  @validado-1229
  Scenario: Validar Cancelado/histórico
    Given que filtrei a situação por Cancelado
    When clicar o botão Histórico
    Then o sistema apresenta a tela de Histórico.

  @validando-1229 @target-faltaMassaParaRodarOScriptJaEstaCriado
  Scenario: Validar Para Análise/alteração
    Given que filtrei a situação por Para Análise
    When clicar o botão Alteração
    Then o sistema apresenta a tela de Alteração

  @validando-1229 @target-faltaMassaParaRodarOScriptJaEstaCriado
  Scenario: Validar Para Análise/cancelar
    Given que filtrei a situação por Para Análise
    When clicar o botão Cancelamento
    And preencher os dados de cancelamento
    And clicar no botão Confirmar
    Then o sistema volta para a tela de pesquisa

  @validando-1229 @1229-target
  Scenario: Validar Para Análise/revalidar
    Given que filtrei a situação por Para Análise
    When clicar o botão Revalidação
    And preencher os dados de revalidação
    And clicar no botão Confirmar
    Then o sistema volta para a tela de pesquisa


  @validando-1229 @target-faltaMassaParaRodarOScriptJaEstaCriado
  Scenario: Validar Para Análise/histórico
    Given que filtrei a situação por Para Análise
    When clicar o botão Histórico
    Then o sistema apresenta a tela de Histórico.
