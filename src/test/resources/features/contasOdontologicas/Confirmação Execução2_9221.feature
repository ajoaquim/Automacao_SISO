#Auto generated Octane revision tag
@TID9221REV0.11.0 @9221 @contas-odontologicas
Feature:Como um usuário, Devo possuir acesso para realizar a inclusão de uma data de confirmação de um procedimento ainda sem data. Apenas pedidos em análise é possível fazer a inclusão de data. Em pedidos negado, cancelado e em análise não é possível fazer a confirmação.

  Background:
    Given que acesse o sistema Odonto
    And preencho usuário e senha
    And acesse a aba Confirmação Execução

  @9221a
  Scenario: Validar Confirmação Execução com Status autorizado
    When Informar um número de Pedido existente
    And clicar no botão continuar
    And selecionar a flag do procedimento
    And incluir a data
    And Clicar no botão em Confirmar Pedido de Autorização
    Then o sitema apresenta a mensagem Confirmação do pedido realizada.

  @9221b
  Scenario Outline: Validar Confirmação Execução
    When Informar um <Pedido>
    And clicar no botão continuar
    Then é exibida a mensage <Mensagem>

    Examples:
      | Pedido     | Mensagem                                                                   |
      | Em análise | Não é possível Confirmar o pedido pois o mesmo está na situação Em análise |
      | Cancelado  | Não é possível Confirmar o pedido pois o mesmo está na situação Cancelado  |
      | Negado     | Não é possível Confirmar o pedido pois o mesmo está na situação Negado     |



