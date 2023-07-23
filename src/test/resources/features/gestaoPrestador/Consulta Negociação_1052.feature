#Auto generated Octane revision tag
@TID1052REV0.7.0 @1052 @gestao @SISO @gestao-prestador
Feature:Manutenção Gestao Prestador 1052 - Consulta Negociação
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Consulta Negociação

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Negociação, Consulta Negociação

	Scenario: Validar consulta
		When selecionar um Prestador existente para consulta de negociacao
        And clicar fora do campo
		Then apresenta o resultado da busca consulta negociacao
