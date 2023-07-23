#Auto generated Octane revision tag
@TID1050REV0.7.0 @1050 @gestao @SISO @gestao-prestador
Feature:Manutenção Gestao Prestador 1050 - Cancela Negociação Prestador
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Cancela Negociação Prestador. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Negociação, Cancela Negociação de Prestador

	Scenario: Validar Cancelamento 
		When informar um Prestador existente
        And clicar fora do campo
        And Alterar
		Then Operação realizada com sucesso
        

        