#Auto generated Octane revision tag
@TID1234REV0.4.0 @autorizacao
Feature: Manutenção Impressão
  Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Impressão. 
  
  Context:
  Given que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse a aba Contratos e Beneficiário, Movimentação Operadora e Impressão

  Scenario Outline: Efetuar a Impressão de um pedido
    When informar o numero de um pedido já existente
    And clicar fora do campo
    And escolher Formato da Saída "<saida>"
    And clicar no botão Continuar impressao
    Then o sistema deve encaminhar para impressão no modo esolhido

    Examples: 
      | saida      |
      | Impressora |
      | E-mail     |

  Scenario: Impressão do pedido via impressora
    Given que selecionou o Formato da Saída "Impressora"
    And clicar no botão "Continuar"
    Then o sistema deve imprimir

  Scenario: Impressão do pedido e-mail
    Given que selecionou o Formato da Saída " E-mail"
    And preencher o endereço de e-mail
    And clicar no botão "Continuar"
    Then o sistema deve encaminhar o e-mail
