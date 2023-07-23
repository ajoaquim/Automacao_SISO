#Auto generated Octane revision tag
@TID1044REV0.10.0 @1044 @gestao @SISO @gestao-prestador
Feature:Manutenção Gestao Prestador 1044 - Liberação
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Liberação. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Cadastro Prestador, Liberação

	Scenario: Validar consulta de Prestador liberado
		When Selecionar um Prestador existente Liberado
        And clicar fora do campo
		Then o sistema apresenta a mensagem Prestador já está liberado em todas as operadoras

  @1044a
	Scenario: Validar Liberação 
		When selecionar um Prestador existente
        And clicar fora do campo
        And Selecionar o fleg de liberação  
        And clicar no botão Executar
		Then o sistema apresenta a mensagem Alteração realizada com sucesso!        
        
        
 
        
   