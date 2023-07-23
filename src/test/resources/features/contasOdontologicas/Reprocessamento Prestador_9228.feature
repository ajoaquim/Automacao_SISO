#Auto generated Octane revision tag
@TID9228REV0.17.0 @9228
Feature:Como um usuário, Devo possuir acesso para realizar um Reprocessamento de Prestador. Essa funcinalidade é usada para fazer as aprovações de um prestador automáticamente, basta informar a remessa desejada e selecionar o botão executar o processo de análise será feito automáticamente. Para reprocessar uma remessa é necessário que a mesma esteja com o status Carregada e não críticada ou processada.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Conta Odontológica","Reprocessamento Prestador" reprocessamento

	Scenario: Validar reprocessamento
        When  informar um filtro desejado reprocessamento
        And selecionar buscar reprocessamento
        And selecionar uma remessa reprocessamento	 
        And selecionar executar reprocessamento
        Then o sistema análisa a remessa automáticamente e o status da mesma é alterado reprocessamento

	