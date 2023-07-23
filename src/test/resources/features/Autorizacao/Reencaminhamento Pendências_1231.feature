#Auto generated Octane revision tag
@TID1231REV0.6.0 @autorizacao
Feature:Manutenção Reencaminhamento Pendências
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Reencaminhamento Pendências. 

Context:
  Given que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse a aba "Autorização"/"Pedido de Autorização"/"Reencaminhamento Pendências"

	Scenario: Efetuar o reencaminhamento de pendencias total 
    	When selecionar "Grupo a ser reencaminhado"
        And clicar no botão "Continuar"
		And selecionar o grupo de destino para todas as ocorrências
        And clicar no botão "Executar"
        Then o sistema apresenta a mensagem "Reencaminhamento realizado"

    Scenario: Efetuar o reencaminhamento de pendencias por pedido
    	When selecionar "Grupo a ser reencaminhado"
        And clicar no botão "Continuar"
		And selecionar o grupo de destino para o pedido desejado
        And clicar no botão "Executar"
        Then o sistema apresenta a mensagem "Reencaminhamento realizado"
	