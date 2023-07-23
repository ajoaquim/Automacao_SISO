#Auto generated Octane revision tag
@TID9506REV0.8.0 @pagamento @9506
Feature:Manutenção Análise
Como um usuário, Devo possuir acesso para realizar consulta de Análise. É necessário possuir um prestador que tenha um pagamento enviado para pagamento. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Pagamento,Análise
    
	Scenario: Validar consulta de análise 
         When informar os dados de pesquisa de analise
         And selecionar continuar de analise
         Then o sistema apresenta em tela os pagamentos enviados durante o período informado.
