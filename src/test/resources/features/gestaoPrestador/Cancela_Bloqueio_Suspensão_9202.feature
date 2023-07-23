#Auto generated Octane revision tag
@TID9202REV0.7.0 @9202 @gestao @gestao-prestador

Feature:Manutenção Gestao Prestador 9202 - Bloqueio/Suspensão de Prestador
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Bloqueio/Suspensão de Prestador. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos,Cadastro Prestador,Bloqueio Suspensão de Prestador,Cancela Bloqueio Suspensão


	Scenario: Validar consulta de Prestador Cancelado 
		When Informar um Prestador existente Cancelado na tela de cancela bloqueio suspensão
        And clicar fora do campo na tela de cancela bloqueio suspensão
		Then o sistema apresenta o resultado da busca na tela cancelamento bloqueio suspensão

	Scenario: Validar Cancelamento de Bloqueio Suspensão 
		When selecionar um Prestador existente Cancelado na tela de cancela bloqueio suspensão
        And clicar fora do campo na tela de cancela bloqueio suspensão
        And clicar no campo Solicitação na operador escolhida para o cancelamento
        And Clicar no Botão Excluir no menu de cancelamento bloqueio e suspensão
		Then o sitema apresenta a mensagem Cancelamento Realizado
        
    Scenario: Validar Cancelamento de Bloqueio Suspensão já cancelado 
		When selecionar um Prestador existente Cancelado na tela de cancela bloqueio suspensão
        And clicar fora do campo na tela de cancela bloqueio suspensão
        And clicar no campo Solicitação na operador escolhida para o cancelamento
        And Clicar no Botão Excluir no menu de cancelamento bloqueio e suspensão
		Then o sitema apresenta a mensagem A Suspensão  Bloqueio informada está cancelada.
        
        
           
   
        
   