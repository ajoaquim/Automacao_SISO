#Auto generated Octane revision tag

@TID18888REV0.3.0 @9303 @workflow


Feature: Como um usuário, devo possuir acesso para realizar um redirecionamento, encerramento e registrar uma atividade em Workflow > Análise. A solicitação não poderá ser redirecionada antes da última sequência. Apenas primeiro e o último da fila poderão realizar um encerramento.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When acesse a aba "Workflow","Análise"

  Scenario: Redirecionar uma solicitação
    When informar um "Nº da Solicitação" já existente analise
    And clicar fora do campo workflow
    And "Redirecionar" uma Solicitação
    And "Selecionar" a área
    And "Alterar" a solicitação analise
    And o sistema informa "Redirecionamento da solictação realizado" analise
    Then a solicitação é enviada para a área informada

  Scenario: Encerrar uma solicitação
    When informar um "Nº da Solicitação" já existente analise
    And clicar fora do campo workflow
    And "Encerrar" uma atividade
    And "Alterar" a solicitação analise
    And o sistema informa "Encerramento da solictação realizado" analise
    Then a solicitação fica com status encerrado pelo solicitante analise

  Scenario: Registrar uma atividade
    When informar um "Nº da Solicitação" já existente analise
    And clicar fora do campo workflow
    And registrar uma "Atividade"
    And "Incluir" o registro
    Then a nova atividade é registrada no grid

  Scenario Outline: Enviar acompanhamento de demanda
    When selecionar "Envio de acompanhamento de demanda"
    And selecionar a "forma de retorno"
    And selecionar "Executar" analise
    Then o Acompanhamento de demanda é enviado para o canal informado de analise

    #Examples: 
     # | Canal           | Complemento     |
      #| Fax             | Número telefone |
      #| E-mail          | e-mail          |
      #| Correspondência |                 |
