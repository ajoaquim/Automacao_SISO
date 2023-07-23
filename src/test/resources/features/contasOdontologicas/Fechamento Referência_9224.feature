#Auto generated Octane revision tag
@TID9224REV0.13.0 @9224
Feature:Como um usuário, Devo possuir acesso para realizar um Fechamento Referência. Para realizar o teste é necessario ter uma referência aberta e remessa dentro dela.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Conta Odontológica,Fechamento Referência odonto
  
	Scenario: Fechar uma referência com remessas com vários status
		Given que tenha uma referência onde nem todas as remessas estejam com o status enviado para pagamento
		When selecionar a referência varios status 
    And selecionar o botão Executar varios status
		Then o sistema apresenta a mensagem Não foi possível fechar a referência pois existe remessa em análise
    
       
    Scenario: Fechar uma referência com remessas com o status enviado para pagamento
		Given que tenha uma referência onde todas as remessas estejam com o status enviado para pagamento
		When selecionar a referência para pagamento 
        And selecionar o botão Executar para pagamento
		Then o sistema apresenta a mensagem Fechamento OK para pagamento
        
        
