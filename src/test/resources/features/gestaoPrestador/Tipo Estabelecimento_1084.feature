#Auto generated Octane revision tag
@TID1084REV0.16.0 @1084 @gestao-prestador
Feature:Manutenção Gestao Prestador 1084 - Tipo Estabelecimento
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Tipo Estabelecimento. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Parametrizações , Tipo Estabelecimento

	@10
	Scenario: Efetuar a inclusão 
		When  Informar um código não existente
        And clicar fora do campo
        And preencher os dados de inclusão
        And clicar no Incluir
		Then apresenta a mensagem Operação realizada com sucesso.

	Scenario: Validar consulta 
		When Informar um código existente
        And clicar fora do campo
		Then apresenta o resultado da busca 

	Scenario: Validar Alteração
		When Informar um código existente
        And And clicar fora do campo
        And realizar uma alteração nos dados
        And clicar no Alterar
		Then apresenta a mensagem Operação realizada com sucesso.       

	Scenario: Validar exclusão 
		When Informar um código existente
        And clicar fora do campo
        And clicar no botão Excluir
        And O sistema apresenta a mensagem Deseja Realmente excluir
        And clicar no botão Sim
		Then apresenta a mensagem Operação realizada com sucesso.
        
           