#Auto generated Octane revision tag
@TID9535REV2.5.0 @9535 @reembolso
Feature:Manutenção Reverter Pedido Cancelado
Como um usuário, Devo possuir acesso para realizar Reverter o Pedido Cancelado de Reverter Pedido Cancelado. 


Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reembolso Odontológico, Reverter Pedido Cancelado
  
  @9535a
	Scenario: Reverter Pedido "Cancelado"  
				When Informar um Reembolso Cancelado
And Clicar no Botão Continuar Cancelado
        And Clicar no Botão Reverter Cancelado
        And Sistema Apresenta a mensagem Confirma reverter cancelamento do pedido de reembolso?
        And Clicar no Botão OK Cancelado
		And O Sistema apresenta a mensagem Atenção: Cancelamento do pedido revertido com sucesso.
        And Clicar no Menu Histórico
        And Informar o número de Reembolso 
        Then O Sistema Apresenta o Status Em Análise
        
    Scenario: Reverter Pedido "Em Análise"  
		When Informar um Reembolso Em Análise
        And Clicar no Botão Continuar Análise
        Then O Sistema apresenta a mensagem  Atenção: Não é possível Reverter Cancelamento pois pedido está na situação Em análise
      
        
 #segundo Aline em 17/11/19 pop up para assumir é customização, verificar se é utilizada nesse Gherkin Test   
 @9535c
	Scenario: Validar Assumir Reembolso
		When informar um reembolso existente não vinculado ao usuario assumir
        And o sistem mostrar o pop up com a mensagem Deseja assumir o pedido do reembolso?Assumindo o pedido do reembolso, a mesma ficará bloqueada para seu usuário até que seja finalizada sua alteração assumir
        And clicar em Assumir Reembolso
		Then o sistema abre o pedido de reembolso assumir
