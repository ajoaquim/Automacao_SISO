#Auto generated Octane revision tag
@TID1238REV0.5.0 @1238 @autorizacao 
Feature:Manutenção Desbloquear Pedido
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Desbloquear Pedido. 

Background:
  Given que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse a aba "Autorização"/"Pedido de Autorização"/"Desbloquear Pedido"


	Scenario: Validar consulta de Pedido Bloqueado 
		When Informar número de Pedido existente Bloqueado
        And clicar no botão "Continuar" Validar Pedido Bloqueado
		Then o sistema demonstra o resultado da busca
        
    Scenario: Validar consulta de Pedido não Bloqueado 
		When Informar número de Pedido existente não Bloqueado 
        And clicar no botão "Continuar" Pedido não Bloqueado
		Then o sistema apresenta a mensagem "Atenção: Pedido não encontra-se bloqueado".
        
  
	Scenario: Validar Desbloqueio de Pedido 
		When fornecer numero de Pedido existente Bloqueado validar desbloqueio
        And clicar no botão Continuar validar desbloqueio
        And Clicar no botão Desbloquear Pedido Desbloqueio de Pedido
        And O Sistema mostra a mensagem "Confirme desbloqueio do pedido" validar desbloqueio
        And Clicar no Botão OK desbloqueio do pedido
		Then o sitema apresenta a mensagem Operação realizada com sucesso desbloqueio do pedido
        