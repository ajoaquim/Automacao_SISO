#Auto generated Octane revision tag
@TID1232REV0.5.0 @1232 @autorizacao
Feature: Manutenção Observações
  Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Observações.

  Background:
    Given que acesse o sistema Odonto
    And preencho usuário e senha
    And acesse a aba Autorização/Pedido de Autorização/Observações

	@1232A
  Scenario: Efetuar a observação
    When informar um numero de Pedido já existente
    And clicar fora do campo selecionado
    And selecionar o Tipo de Observacao
    And preeencher o campo ObservaçãoR
    And clicar no botão SalvarR
    Then o sistema apresenta a mensagem Atenção: Alteração da observacão do pedido numero do pedido realizada.SalvarRC
