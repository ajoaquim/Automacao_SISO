#Auto generated Octane revision tag
@TID18890REV0.3.0 @18890
Feature: Cadastro Usuário
Gestao Prestador 16093 - Como um usuário, devo possuir acesso para realizar alteração de um cadastro já existente e cadastrar um novo usuário, para o Protal do Candidato e para o Portal do Prestador. O acesso deverá ser validado posteriormente no Portal do Prestador e do Candidato.
#Cenários validados no Gherkin 15005- Complementar SAC 87623

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos e Cadastro Usuário cUser

	Scenario: Alterar o cadastro de um usuário
		When Informar um login já existente na tela de cadastro usuario
        And realizar a alteração do Dado desejado na tela de cadastro usuario
		Then o sistema apresenta a mensagem Usuário Alterado na tela de cadastro usuario
	@18890A 
	Scenario: Criar um novo usuário 
		When Informar um login ainda não cadastrado na tela de cadastro usuario cUser
        And clicar fora do campo na tela de cadastro usuario  cUser
        And escolher o Tipo de usuário na tela de cadastro usuario  cUser
        And preencher os dados de inclusão na tela de cadastro usuario  cUser
        And clicar no botão Incluir na tela de cadastro usuario  cUser
		And o sistema apresenta a mensagem Usuário Alterado na tela de cadastro do usuario cUser
        Then o login é criado para o Portal Desejado na tela de cadastro usuario cUser