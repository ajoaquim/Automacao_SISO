#Auto generated Octane revision tag
@TID9510REV0.7.0 @9510
Feature:Manutenção Análise RB
Como um usuário, Devo possuir acesso para realizar consulta de Análise RB. É necessário possuir um beneficiário que tenha um reembolso enviado para pagamento. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Pagamento,Análise RB
    
	Scenario: Validar consulta de análise RB
         When informar os dados de pesquisa RB
         And selecionar continuar RB
         Then o sistema apresenta em tela os reembolso enviados para pagamento durante o período informado.
        

        