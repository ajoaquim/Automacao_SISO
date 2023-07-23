#Auto generated Octane revision tag
@TID18814REV0.2.0 @18814 @gestao-prestador
Feature:Bloqueio de Usuário
Como um usuário, devo possuir um usuário cadastrado no Portal Candidato e Portal do Prestador ativo. Essa função pode ser realizada em "Cadastro de usuário".

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Bloqueio de usuário
    
    
	Scenario: Bloqueio de usuário Portal Candidato
		Given que tenho um login Candidato cadastrado
		When informar o candidato desejado e clicar em Alterar
		Then o sistema irá exibir Usuário Bloqueado
        
    Scenario: Bloqueio de usuário Portal Prestador
		Given que tenho um login Prestador cadastrado
		When informar o prestador desejado e clicar em Alterar
		Then o sistema irá exibir Usuário Bloqueado
