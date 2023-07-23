#Auto generated Octane revision tag
@TID15095REV0.7.0
Feature:Autorização SAC - 86107

	
	#Alteração/Análise
	Scenario: Validar Botão Estorno Procedimento  - SAC 86107
		Given 
		When 
		Then 
        

	Scenario: Validar  coluna de prévia de pagamento  - SAC 86107
		Given 
		When 
		Then 
		
	#Cancelamento Parcial	
	Scenario: Validar  coluna de prévia de pagamento - SAC 86107
		Given 
		When 
		Then 
	
	#Encaminhamento Análise
	Scenario: Validar  coluna de prévia de pagamento  - SAC 86107
		Given 
		When 
		Then 


        
    #Histórico de Procedimento
	Scenario: Validar  coluna de prévia de pagamento  - SAC 86107
		Given 
		When 
		Then 
        

	Scenario: Validar Busca de Beneficiário com CPF  - SAC 86107
		Given 
		When 
		Then 
        

	Scenario: Validar beneficiário com Histórico Anterior - SAC 86107
		Given 
		When 
		Then 

    Scenario: Validar Grid procedimento  - SAC 86107 
		Given 
		When 
		Then 

    #Inclusão
	Scenario: Validar coluna de prévia de pagamento - SAC 86107
		Given 
		When 
		Then 


    #Tratamento Ortodôntico
	Scenario: Validar Alteração de "O - Ortopédica" para "O Contenção” -  SAC 86107
		Given 
		When 
		Then 
        

	Scenario: Validar Novo Campo TRATAMENTO_COMPLEMENTAR - SAC 86107
		Given 
		When 
		Then 
        
	Scenario: Validar Item Médico  -  SAC 86107
		Given 
		When 
		Then 

	Scenario:  Validar Criação de um novo campo Ordem Tipo atendimento Contas Ondontologicas 
		Given 
        And 
		When 
		Then 
        
        
 #PORTAL PRESTADOR
 
	Scenario: Validar Alteração de O-Ortopédica” para O-Contenção
		Given 
		When 
		Then 


	Scenario: Validar Novo Campo TRATAMENTO_COMPLEMENTAR
Deverá ter opções de escolha 
1 - Cirurgia Ortognática
2 - Fonoaudiologia
3 - Tratamento Periodontal
4 - Outros (Habilita um campo para digitação de texto e habilita tmb o campo Procedimento para incluir código  )
		When 
		Then 


	Scenario: Validar Item Médico 
	onde deverá ser gravado o código do procedimento que será liberado no tratamento ortodôntico
		When 
		Then 
        
        

