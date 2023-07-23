#Auto generated Octane revision tag
@TID9260REV0.5.0 @9260 @contas-odontologicas
Feature:Como um usuário, Devo possuir acesso para realizar consulta do demonstrativo de pagamento diferenciado. Nessa funcionalidade é possível verificar as remessas enviadas para pagamento e pagas.

Background:
  Given que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse a aba Conta Odontológica, Demonstrativo de Pagamento Diferenciado

	Scenario: Validar consulta
        When informar o filtro desejado
        And selecionar continuar
        Then o sistema apresenta em tela as remessas buscadas
