#Auto generated Octane revision tag
@TID1045REV0.9.0 @1045 @gestao @SISO @gestao-prestador
Feature:Manutenção Gestao Prestador 1045 - Liberação
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Liberação. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Cadastro Prestador , Liberação Especial

	Scenario: Validar consulta de Prestador liberado
		When Passar um Prestador existente e Liberado
        And clicar fora do campo
		Then a aplicacao apresenta a mensagem Prestador já está liberado em todas as operadoras

	Scenario: Validar Liberação
		When Passar um Prestador existente
        And clicar fora do campo
        And Clicar o fleg para Liberar  
        And Acessar o botão Executar
		Then a aplicacao apresenta a mensagem Alteração realizada com sucesso!