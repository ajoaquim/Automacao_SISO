#Auto generated Octane revision tag
@TID9536REV1.7.0 @9536 @reembolso
Feature:Manutenção Reverter Pedido Negado
Como um usuário, Devo possuir acesso para realizar o reverter Pedido Negado de Reverter Pedido Negado. 


Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reembolso Odontológico, Reverter Pedido Negado
    
    @9536a
    Scenario: Validar menu Consultar Reembolsos
        When informar um pedido existente Reverter Pedido Negado
        And clicar fora do campo Reverter Pedido Negado
        And clicar em Consultar Reembolsos do beneficiário Reverter Pedido Negado
        Then o sistema abre a tela de consulta de Reembolso Reverter Pedido Negado
   @9536b
   Scenario: Validar menu Histórico de Procedimentos 
        When informar um pedido existente Reverter Pedido Negado
        And clicar fora do campo Reverter Pedido Negado
        And clicar em Histórico de Procedimentos Reverter Pedido Negado
        Then o sistema abre a tela de Histórico de Procedimentos Reverter Pedido Negado      
   @9536c 
   Scenario: Validar menu Dados beneficiário/Contratos 
        When informar um pedido existente Reverter Pedido Negado
        And clicar fora do campo Reverter Pedido Negado
        And clicar em Dados beneficiário/Contratos Reverter Pedido Negado
        Then o sistema abre a tela de Dados beneficiário/Contratos Reverter Pedido Negado 
   @9536d       
   Scenario: Validar menu Alertas Beneficiário
        When informar um pedido existente Reverter Pedido Negado
        And clicar fora do campo Reverter Pedido Negado
        And clicar em Alertas Beneficiário Reverter Pedido Negado
        Then o sistema abre a tela de Alertas Beneficiário Reverter Pedido Negado 
   @9536e
   Scenario: Validar menu Contatos do Beneficiário
        When informar um pedido existente Reverter Pedido Negado
        And clicar fora do campo Reverter Pedido Negado
        And clicar em Contatos do Beneficiário Reverter Pedido Negado
        Then o sistema abre a tela de Contatos do Beneficiário Reverter Pedido Negado     
    
  @9536f
  Scenario: Reverter Pedido "Negado"  
		When Informar um Reembolso Negado
        And Clicar no Botão Continuar
        And Clicar no Botão Reverter
        And Sistema Apresenta a mensagem Confirma reverter negativa do pedido de reembolso?
        And Clicar no Botão OK
		And O Sistema apresenta a mensagem  Atenção: Negativa do pedido revertida com sucesso.
        And Clicar no Menu Histórico Reverter Pedido Negado
        And Informar o número de Reembolso Reverter Pedido Negado
        Then O Sistema Apresenta o Status Em Análise Reverter Pedido Negado
        
    @9536g
    Scenario: Reverter Pedido "Em Análise"  
		When Informar um Reembolso Em Análise Reverter Pedido Negado
        And Clicar no Botão Continuar 
        Then O Sistema apresenta a mensagem Atenção: Não é possível Reverter Negativa pois pedido está na situação Em análise
      @9536h  
     Scenario: Reverter Pedido "Cancelado"  
		When Informar um Reembolso Cancelado Reverter Pedido Negado
        And Clicar no Botão Continuar
        Then O Sistema apresenta a mensagem Atenção: Não é possível Reverter Negativa pois pedido está na situação Cancelado
     @9536i
     Scenario: Reverter Pedido "Enviado para Pagamento"  
		When Informar um Reembolso Enviado Para Pagamento Reverter Pedido Negado
        And Clicar no Botão Continuar
        Then O Sistema apresenta a mensagem  Atenção: Pedido de reembolso  já foi enviado para pagamento e não pode ser alterado 
        
 
   
        

        
        

        