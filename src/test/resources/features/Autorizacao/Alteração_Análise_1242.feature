#Auto generated Octane revision tag
@TID1242REV0.33.0 @1242 @autorizacao
Feature:Manutenção Alteração/Análise
  Como um usuário, Devo possuir acesso para realizar consulta,  alteração de Alteração/Análise.
  Ao entrar nessa tela, e por acaso, na “seção – Procedimentos” não tiver a opção de selecionar a prioridade; 
   flegar o campo “procedimento”, logo irá habilitar na “seção – Glosar Procedimentos” o campo glosa, inserir o número "3040", e clicar em executar, logo o procedimento irá retornar com as opções e dentro do mesmo será possível selecionar a “prioridade”. alt

  Background:
    Given que acesso o sistema SISO
    And preencho usuário e senha
    And acesse a aba Autorização->Pedido de Autorização-> Alteração/Análise

  @autorizacao
  Scenario: Validar consulta com Status Negado/Autorizado
    When Informar um número de pedido existente com Status Negado/Autorizado
    And clicar no botão Continuar alt
    Then o sistema apresenta o resultado da busca alt

  @autorizacao
  Scenario: Validar Alteração com Pedido de Status em Análise
    When informar um número de pedido existente com Status de Em Análise
    And clicar no botão Continuar alt
    And realizar alteração nos dados
    And liberar glosa caso exista algum impeditivo
    And clicar no botão Submeter alt
    And clicar no botão Aprovar Pedido alt
    Then o sistema apresenta a mensagem Pedido aprovado

  @autorizacao
  Scenario: Validar Aprovação de Pedido
    When informar um número de pedido existente com Status de Em Análise
    And clicar no botão Continuar alt
    And liberar glosa caso exista algum impeditivo
    And clicar no botão Submeter alt
    And clicar no botão Aprovar pedido alt
    Then sistema apresenta mensagem de aprovação com número do pedido, senha e validade

  @autorizacao
  Scenario: Validar alteração de um pedido Cancelado para Aprovado
    Given que informe um pedido Cancelado
    And clicar no botão Continuar alt
    When clicar no botão Voltar Situação alt
    And Confirmar a mensagem de mudança de situação alt
    And incluir procedimento que gere glosa
    And clicar em Análise/Alteração
    And clicar no ícone glosado
    And flegar liberar
    And clicar em Executar alt
    And consultar dados procedimento
    And incluir observação
    And incluir anexo
    And consultar ocorrências
    And exista mais de um procedimento com glosa
    And clicar em Análise/Alteração
    And selecionar os procedimentos que estão com glosa
    And clicar no botão Análise de Procedimentos
    And selecionar o procedimento desejado e flegar
    And clicar em Executar alt
    And o sistema exibe a mensagem Operação realizada com sucesso alt
    And clicar no botão Submeter alt
    And clicar no botão Aprovar pedido alt
    Then sistema apresenta mensagem de aprovação com número do pedido, senha e validade

  @autorizacao
  Scenario: Validar alteração de um pedido Negado para Aprovado
    Given informe um pedido Negado
    And clicar no botão Continuar alt
    When clicar no botão Voltar Situação alt
    And Confirmar a mensagem de mudança de situação alt
    And incluir procedimento alt
    And clicar em Análise/Alteração
    And consultar dados procedimento
    And incluir observação
    And incluir anexo
    And Consultar ocorrência
    And clicar em Análise/Alteração
    And clicar no botão Submeter alt
    And clicar no botão Aprovar pedido alt
    Then sistema apresenta mensagem de aprovação com número do pedido, senha e validade

  @autorizacao
  Scenario: Cancelamento total dos procedimentos já autorizados de uma Guia em Análise
    Given que informe um pedido Em Análise
    And clicar no botão Continuar alt
    When clicar no botão Cancelar alt
    And informar um Motivo de cancelamento
    And clicar em Cancelar alt
    Then o sistema apresenta mensagem de pedido cancelado


  @autorizacao
  Scenario: Validar analise de procedimentos de um pedido
    Given que informe um pedido Em Análise
    And clicar no botão Continuar alt
    When clicar no botão Análise de Procedimentos
    And liberar as glosas dos procedimentos Manuaiscaso haja
    And clicar no botão Executar alt
    And clicar em Ok na confirmação de mensagem
    And o sistema apresenta a mensagem Operação realizada com sucesso alt
    And clicar no botão Submeter alt
    And clicar no botão Aprovar pedido alt
    Then sistema apresenta mensagem de aprovação com número do pedido, senha e validade

  @autorizacao
  Scenario: Validar o encaminhamento de um pedido para análise
    Given que informe um pedido Em Análise
    And clicar no botão Continuar alt
    When clicar no botão Encaminhar Análise
    And selecionar o Grupo de análise
    And clicar no botão Encaminhar Análise novamente
    Then o sistema apresenta a mensagem de pedido encaminhado

  @autorizacao
  Scenario: Validar alteração pelo reprocessamento de um procedimento quando um procedimento autorizado não estiver ativo deve reprocessar o procedimento
    Given que informe um pedido Em Análise
    And clicar no botão Continuar alt
    When selcionar o Procedimento Autorizado
    And clicar no botão Reprocessar
    And clicar em Ok na mensagem de confirmação
    And alterar a Situação do procedimento
    And clicar no botão Submeter alt
    And clicar no botão Aprovar pedido alt
    Then sistema apresenta mensagem de aprovação com número do pedido, senha e validade

  @doing
  Scenario: Validar desbloqueio de um pedido em Autorizado
    Given que informe um pedido Autorizado que esteja assumido por outro usuário
    And clicar no botão Continuar alt
    When clicar em Assumir pedido alt
    When clicar no botão Desbloquear Pedido
    And clicar em Ok na confirmação da mensagem de desbloqueio
    Then o sistema apresenta a mensagem com o número de pedido e mudança do status com validade
    Then o sistema apresenta a mensagem pedido assumido