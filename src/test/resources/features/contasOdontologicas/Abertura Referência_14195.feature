#Auto generated Octane revision tag
@TID14195REV0.8.0 @14195 @contas-odontologicas
Feature:Manutenção Abertura Referência
Como um usuário, Devo possuir acesso para realizar inclusão de uma Abertura de Referência.  Abertura de um mês de referência para fazer as análises de contas. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Conta Odontológica, Abertura Referência
    
	Scenario: Validar a abertura de uma referência
		When selecinar abertura de referência
		Then a data da última referência fica com o valor da Próxima referência que passa a ter uma nova data
