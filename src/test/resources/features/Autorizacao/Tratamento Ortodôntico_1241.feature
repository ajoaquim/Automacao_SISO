#Auto generated Octane revision tag
@TID1241REV0.9.0 @autorizacao @1241 @SISO
Feature:Manutenção Tratamento Ortodôntico
Como um usuário, Devo possuir um tratamento ortodôntico já solicitado.
Background:
  Given que acesse o sistema Odonto
    And preencho usuário e senha
    And acesse a aba Autorização Pedido de Autorização e Tratamento Ortodôntico

  Scenario: Validar consulta de um pedido em analise
    When informar um Tratamento Ortodôntico
    Then o sistema apresenta a tela do Tratamento Ortodôntico informado
