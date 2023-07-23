#Auto generated Octane revision tag
@TID1263REV0.6.0 @1263 @SISO @gestaoPrestador @gestao-prestador
Feature:Manutenção Gestão Prestador 1263 - Ocorrências
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Ocorrências. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos,Consulta Prestador,Ocorrências

	
	Scenario: Validar consulta de Ocorrências
		When selecionar um Prestrador existente na tela de consulta de ocorrencias
    And clicar fora do campo na tela de consulta de ocorrencias
		Then o sistema apresenta o resultado da busca na tela de consulta de ocorrencias

	