#Auto generated Octane revision tag
@TID16036REV0.6.0 @16036 @workflow
Feature: Como um usuário, devo possuir acesso para realizar consulta em Workflow -> Situação

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    And acesse a aba "Workflow","Situação"

  Scenario: Redirecionar uma solicitação
    When Redirecionar uma Solicitação situacao
    And Selecionar a área situacao
    And Alterar a solicitação situacao
    And o sistema informa Redirecionamento da solictação realizado situacao
    Then a solicitação é enviada para a área informada situacao

  @16036B
  Scenario: Registrar uma atividade
    When registrar uma Atividade situacao
    And "Incluir" o registro situacao
    Then a nova atividade é registrada no grid situacao

  @16036C
  Scenario: Encerrar uma solicitação
    When "Encerrar" uma atividade situacao2
    And "Alterar" a solicitação situacao2
    And o sistema informa "Encerramento da solictação realizado" situacao2
    Then a solicitação fica com status encerrado pelo solicitante situacao2
  @16036D
  Scenario: Consultar histórico
    When selecionar Histórico situacaoo
    And o dados for apresentado em tela situacaoo
    And selecionar Envio de acompanhamento de demanda situacaoo
    And selecionar a forma de retorno situacaoo
    And selecionar Executar situacaoo
    Then o Acompanhamento de demanda é enviado para o canal informado situacaoo

  Scenario: Geral Excel
    When informar uma "solicitação" já existente
    And clicar fora do campo
    And selecionar "Excel"
    And o Download do arquivo for realizado
    Then os dados da tela são extraídos em XML
