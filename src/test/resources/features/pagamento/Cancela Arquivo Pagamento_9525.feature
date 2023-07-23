#Auto generated Octane revision tag
@TID9525REV0.7.0 @pagmento @9525
Feature: Manutenção Cancela Arquivo Pagamento
  Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Cancela Arquivo Pagamento.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Cancela Arquivo Pagamento

  Scenario: Efetuar Gera Arquivo Pagamento
    When opto por informar um banco
    And opto por informar duas datas em data de pagamento
    And clicar no botão para continuar
    Then o sistema apresenta o arquivo gerado
