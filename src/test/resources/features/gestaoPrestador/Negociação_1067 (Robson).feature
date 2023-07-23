#Auto generated Octane revision tag
@TID1067REV0.9.0 @1067 @gestao @SISO @gestao-prestador
Feature:Manutenção Gestao Prestador 1067 - Negociação
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Negociação. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Consulta Prestador, Negociação

	Scenario: Validar consulta de Negociação 
		When selecionar um Prestador existente com Negociação
        And clicar fora do campo
		Then o sistema apresenta o resultado da busca
        
        
    Scenario: Validar consulta de Prestador sem Negociação
		When selecionar um Prestador existente sem Negociação
        And clicar fora do campo
		Then o sistema apresenta o resultado da busca Nenhum registro encontrado
        

	