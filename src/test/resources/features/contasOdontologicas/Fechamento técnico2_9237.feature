#Auto generated Octane revision tag
@TID9237REV0.7.0 @9237 @contas-odontologicas
Feature: Como um usuário, Devo possuir acesso para realizar o Fechamento Técnico. Nessa funcinalidade só será apresenta as remessas que estão com status revisão.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu fechamento Técnico
    
	Scenario: Validar um fechamento técnico 
        Given que tenha remessa com o status análisado tec
		When informar os dados da busca tec
        And selecionar uma ou mais remessas
        And clicar em executar
		Then o sistema apresenta a tela do job que está sendo executado tec


