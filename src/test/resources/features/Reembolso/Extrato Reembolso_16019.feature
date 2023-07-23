#Auto generated Octane revision tag
@TID16019REV0.4.0 @16019 @reembolso
Feature:Estrato de Reembolso
Como um usuário, Devo possuir acesso para realizar impressão de Extrato Reembolso. 
	
Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Reembolso Odontológico","Extrato Reembolso" Extrato
  
	Scenario Outline: Validar Geração de Extrato por Beneficiario
		When selecionar "Beneficiario"
        And informar um "<parametro>" de pesquisa
        And selecionar "<Tipo Relatório>"
        And informar um peeriodo de inicio e fim
        And clicar no botão "Gerar Relatório"
		Then o sistema exibe o relatório para impressão

	Examples:
		| Paramametro   | Tipo Relatório          |
		| Beneficiario  | Reembolsos Solicitados  |
		| Contrato      | Reembolsos Solicitados  |
		| Beneficiario  | Reembolsos Pagos        |
		| Contrato      | Reembolsos Pagos        |        
	 @16019A
		Scenario: Validar Geração de Extrato por Nº Protocolo/Reembolso
			When selecionar Nº Protocolo/Reembolso Extrato
	        And informar um  Nº Protocolo/Reembolso Extrato
	        And clicar no botão Gerar Relatório Extrato
			Then o sistema exibe o relatório para impressão Extrato
 

 #segundo Aline em 17/11/19 pop up para assumir é customização, verificar se é utilizada nesse Gherkin Test   
	Scenario: Validar Assumir Reembolso
		When informar um reembolso existente não vinculado ao usuario
        And o sistem mostrar o pop up com a mensagem "Deseja assumir o pedido do reembolso?Assumindo o pedido do reembolso, a mesma ficará bloqueada para seu usuário até que seja finalizada sua alteração"
        And clicar em "Assumir"
		Then o sistema abre o pedido de reembolso    