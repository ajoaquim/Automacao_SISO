#Auto generated Octane revision tag
@TID1262REV0.6.0 @1262 @gestao @SISO @gestao-prestador
Feature:Manutenção Gestao Prestador 1262 - Pensão Alimentícia
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Pensão Alimentícia. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Consulta Prestador, Pensão Alimentícia

	Scenario: Validar consulta de Prestador com Pensão Alimentícia 
		When Escrever um Prestador que tenha Pensão alimentícia
        And clicar fora do campo
		Then a aplicacao mostra a consulta da Pensao Alimenticia
       
    @15 
    Scenario: Validar consulta de Prestador que não tenha Pensão Alimentícia 
		When Escrever um Prestador que não tenha pensão Alimentícia 
        And clicar fora do campo
		Then a aplicacao mostra a consulta que não existe Pensao Alimenticia

	