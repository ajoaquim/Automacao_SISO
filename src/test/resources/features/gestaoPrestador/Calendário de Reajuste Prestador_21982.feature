#Auto generated Octane revision tag
@TID21982REV0.4.0 @21982
Feature: Calendário de Reajsute Prestador

Background: 
    	Given que acesso o sistema SISO
    	And preencho o login e senha
    	And o sistema apresenta a mensagem de boas vindas
		And acesso o módulo Gestão Prestador, Reajuste Prestador, Calendário de Reajuste Prestador

 @21982a
	Scenario: Efetuar a inclusão de uma referência
		Given que insiro uma referência nova 
		And clicar fora do campo Calendário
        And preencher os campos
        And clicar em Salvar
		Then o sistema exibe Operação Realizada com Sucesso
      
  @21982b      
	Scenario: Alterar referencia existente
		Given que informo uma referência existente
		When realizar alteração da informação que desejo
		Then o sistema irá retornar Operação Realizada com Sucesso
    
     @21982c     
	Scenario: Excluir referencia existente
		Given que informo uma referência existente
		When clicar no botão Excluir Calendário
		Then o sistema retorna Operação Realizada com Sucesso
        
  @21982d
	Scenario: Validar Prestadores
		Given que estou em uma referência existente
		When quando clicar no botão Prestadores
        And inserir as datas de referência contrato
        And clicar executar 
		Then o sistema deve retornar os prestadores existentes de acordo com as datas referência contratos

		
		