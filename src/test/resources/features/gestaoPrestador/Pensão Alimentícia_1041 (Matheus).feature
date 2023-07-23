#Auto generated Octane revision tag
@TID1041REV0.18.0 @1041 @SISO @gestao @gestao-prestador
Feature:Manutenção Gestao Prestador 1041 - Pensão Alimentícia
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Pensão Alimentícia. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Cadastro Prestador, Pensão Alimentícia

	Scenario: Efetuar a inclusão
		When  Informar os dados de inclusão de prestador ja existente
         And clicar fora do campo
         And preencher os dados de inclusão de Beneficiário
         And clicar no botão “Incluir”
		Then a aplicacao apresenta a mensagem Operação realizada com sucesso

	Scenario: Validar consulta 
		When Escrever um Prestador ja existente
        And clicar fora do campo
		Then a aplicacao mostra o resultado da busca

	Scenario: Validar Alteração
		When Escrever um Prestador ja existente
        And clicar fora do campo
        And fazer uma alteração nos dados
        And Clicar no Alterar
		Then a aplicacao apresenta a mensagem Operação realizada com sucesso

	Scenario: Validar exclusão 
        When Selecionar Prestador ja existente
        And clicar fora do campo
        And Selecionar Fleg Excluir 
        And Clicar no Alterar
		Then a aplicacao apresenta a mensagem Operação realizada com sucesso
        
   
        
        