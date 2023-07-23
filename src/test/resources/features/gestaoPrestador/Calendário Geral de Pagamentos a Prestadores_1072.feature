#Auto generated Octane revision tag
@TID1072REV0.8.0 @1072 @gestao-prestador
Feature:Manutenção Gestao Prestador 1072 Calendário Geral de Pagamentos a Prestadores
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Calendário Geral de Pagamentos a Prestadores. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Parametrizações, Calendário Geral de Pagamentos a Prestadores

	Scenario: Efetuar a inclusão
		When Informar um Ano
        And clicar Continuar
        And preencher os dados solicitados
        And clicar no botão Alterar
		Then apresenta a mensagem Operação realizada com sucesso


  
        