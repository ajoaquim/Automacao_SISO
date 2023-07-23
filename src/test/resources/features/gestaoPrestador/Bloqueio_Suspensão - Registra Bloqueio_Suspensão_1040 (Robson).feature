#Auto generated Octane revision tag
@TID1040REV0.10.0 @1040 @gestao-prestador

Feature:Manutenção Gestao Prestador 1040 - Bloqueio/Suspensão de Prestador
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Bloqueio/Suspensão de Prestador. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos,Cadastro Prestador,BloqueioSuspensão de Prestador,Registra BloqueioSuspensão

	Scenario: Efetuar a inclusão 
		When  Informar um Prestador já existente na tela de registro e suspensão
        And clicar fora do campo na tela de registro e suspensão
        And preencher os dados de inclusão na tela de RegistroSuspensão
        And clicar no botão Incluir da tela de registro e suspensão
		Then o sistema apresenta a mensagem Operação realizada com sucesso

	Scenario: Validar consulta 
		When Informar um Prestador existente na tela de registro e suspensão
        And  clicar fora do campo na tela de registro e suspensão
		Then o sistema apresenta o resultado da busca da tela de registro e suspensão
    