#Auto generated Octane revision tag
@TID9225REV0.10.0 @9225
Feature:Como um usuário, Devo possuir acesso para realizar o Fechamento Técnico. Nessa funcinalidade só será apresenta as remessas que estão com status análisdado ok ou análisado c/glosa.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Conta Odontológica,Fechamento Técnico odonto
    
	Scenario: Validar um fechamento técnico  
        Given que tenha remessa com o status análisado odonto
				When informar os dados da busca odonto
		    And selecionar uma ou mais remessas odonto
		    And selecionar executar odonto
				Then o sistema apresenta a tela do job que está sendo executado odonto
