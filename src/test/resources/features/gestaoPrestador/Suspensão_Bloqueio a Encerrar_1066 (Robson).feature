#Auto generated Octane revision tag
@TID1066REV0.8.0 @1066 @gestao-prestador
Feature:Manutenção Gestao Prestador 1066 - Suspensão/Bloqueio a Encerrar
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Suspensão/Bloqueio a Encerrar. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Consulta Prestador, Suspensão/Bloqueio a Encerrar

	
	Scenario: Validar consulta de Suspensão / Bloqueio a Encerrar
		When digitar um período para pesquisa
        And clicar no Continuar
		Then a aplicacao apresenta o resultado da busca

	