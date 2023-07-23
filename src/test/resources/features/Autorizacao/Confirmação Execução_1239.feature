#Auto generated Octane revision tag
@TID1239REV0.14.0 @1239 @SISO @autorizacao
Feature:Manutenção Confirmação Execução. Como um usuário, Devo possuir acesso para realizar a inclusão de uma data de confirmação de um procedimento ainda sem data. Apenas pedidos em análise é possível fazer a inclusão de data. Em pedidos negado, cancelado e em análise não é possível fazer a confirmação.

Background:
  Given que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse a aba confirmação execução
   
	Scenario: Validar Confirmação Execução com Status autorizado  
		 When Informar um número de pedido que seja existente e esteja disponivel
         And clicar no botão de pesquisar pedido
         And Selecionar um Procedimento desejado
         And incluir a data do procedimento
         And Clicar no botão confirmar Pedido de autorização
		 Then o sitema apresenta a mensagem confirmação do pedido realizada.        
 
	Scenario Outline: Validar Confirmação Execução
		When Informar um pedido <Pedido> 
        And clicar no botão de pesquisar pedido
        Then o sitema apresenta a <Mensagem>

	Examples:
		| Pedido | Mensagem |
		| Em Análise | Não é possível Confirmar o pedido pois o mesmo está na situação Em análise   |
		| Cancelado  | Não é possível Confirmar o pedido pois o mesmo está na situação Cancelado   |
    | Negado  | Não é possível Confirmar o pedido pois o mesmo está na situação Negado   |
        
