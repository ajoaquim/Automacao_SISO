#Auto generated Octane revision tag
@TID1265REV0.6.0 @1265 @gestao-prestador

Feature:Manutenção Gestao Prestador 1265 - Situação Especial
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Situação Especial. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos,Parametrizações,Situação Especial

	Scenario: Efetuar a inclusão 
		When Informar um código ainda não existente na tela de parametrização situação especial
        And clicar fora do campo na tela de parametrização situação especial
        And preencher os dados de inclusão na tela de parametrização situação especial
        And clicar no botão Incluir na tela de parametrização situação especial
		Then o sistema apresenta a mensagem peração realizada com sucesso na tela de parametrização situação especial

	Scenario: Validar consulta 
		When Informar um código existente na tela de parametrização situação especial
        And clicar fora do campo na tela de parametrização situação especial
		Then o sistema apresenta o resultado da busca na tela de parametrização situação especial

	Scenario: Validar Alteração 
		When Informar um código existente na tela de parametrização situação especial
        And clicar fora do campo na tela de parametrização situação especial
        And realizar uma alteração nos dados na tela de parametrização situação especial
        And clicar no botão Alterar na tela de parametrização situação especial
		Then o sistema apresenta a mensagem Operação realizada com sucesso na tela de parametrização situação especial    

	Scenario: Validar exclusão 
		When Informar um código existente na tela de parametrização situação especial
        And clicar fora do campo na tela de parametrização situação especial
        And clicar no botão Excluir na tela de parametrização situação especial
		And O sistema apresenta a mensagem Deseja Realmente excluir na tela de parametrização situação especial
        And clicar no botão Sim na tela de parametrização situação especial
        Then o sistema apresenta a mensagem Operação realizada com sucesso na tela de parametrização situação especial
        