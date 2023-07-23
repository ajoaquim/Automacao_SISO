#Auto generated Octane revision tag
@TID16094REV0.7.0 @16094 @gestao @SISO @gestao-prestador
Feature:Gestao Prestador 16094 - Como um usuário, devo possuir acesso para realizar o Desbloqueio de usuário. Será possível realizar desloquei de usuários com o tipo Prestador Serviço Odonto, Prestador Equipe Odonto e Candidato à Credenciamento, o acesso deverá ser validado posteriormente no Portal do Prestador e do Candidato de acordo com o usuário desbloqueado.
#Cenários validados no Gherkin 15005- Complementar SAC 87623

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos e Desbloqueio usuário


	Scenario: Desbloquear usuário Portal Candidato
		When Informar um login de usuário bloqueado do portal Candidato
        And clicar fora do campo
        And clicar no botão Alterar do desbloqueio
		And o sistema apresenta a mensagem Usuário desbloqueado
        Then o sistema desbloqueia o login no Portal do Candidato

		@16094b
    Scenario: Desbloquear usuário Portal Prestador
		When Informar um login de usuário bloqueado do portal Prestador
        And clicar fora do campo
        And clicar no botão Alterar do desbloqueio
		And o sistema apresenta a mensagem Usuário desbloqueado
        Then o sistema desbloqueia o login no Portal do Prestador
        
        
