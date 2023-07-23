#Auto generated Octane revision tag
@TID16118REV0.7.0 
Feature: Validar regra de negócio Parametrização Procedimentos. Cada procedimento segue uma regra de parametrização determinada pelo cliente.

Background:
  Given que acesse o Portal Prestador
  And preencho usuário e senha
  And acesse o menu Tratamento Odontológico tratamento
 
  @16118A
	Scenario: Tratameto Restauração de Amalgama 
        When informar um beneficiário tratamento
	   		 And adicionar um novo tratamento tratamento
        And preencher os Dados do Profissional tratamento
        And informar 85100102 tratamento
				And o sistema permite finalizar a autorização com sucesso tratamento
        And repetir os passos anterior novamente  tratamento
				Then o sistema apresenta glosa, pois o procedimento só poderá ser solicitado novamente após 24 meses tratamento


	Scenario: Tratamento Supra Gengival 
		When informar um "beneficiário"
	    And adicionar um "novo tratamento"
        And preencher os "Dados do Profissional"
        And informar "90070064"
		And o sistema permite finalizar a autorização com sucesso
        And repetir os passos anterior novamente 
		Then o sistema apresenta glosa, pois o procedimento só poderá ser solicitado novamente após 6 meses

	Scenario: Tratamento Supra Gengival para um beneficiário com menos de 15 anos
		When informar um "beneficiário"
	    And adicionar um "novo tratamento"
        And preencher os "Dados do Profissional"
        And informar "90070064"
		Then o procedimento será glosado
   
   
    Scenario: Tratamento Radiografia Interproximal  
		When informar um "beneficiário"
	    And adicionar um "novo tratamento"
        And preencher os "Dados do Profissional"
        And informar "81000375"
		And o sistema permite finalizar a autorização com sucesso
        And repetir os passos anterior novamente 
		Then o sistema apresenta glosa, pois o procedimento só poderá ser solicitado novamente após 6 meses

	Scenario: Tratamento Radiografia Interproximal para um beneficiário com menos de 5 anos
		When informar um "beneficiário"
	    And adicionar um "novo tratamento"
        And preencher os "Dados do Profissional"
        And informar "81000375"
		Then o procedimento será glosado
