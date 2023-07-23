#Auto generated Octane revision tag
@TID9540REV0.9.0 @9540 @reembolso
Feature:Manutenção Consulta Reembolsos
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Consulta Reembolsos. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reembolso Odontológico, Consulta Reembolsos

	@9540a
	Scenario: Validar consulta 
        When  informar um Beneficiário já existente
        And clicar fora do campo do consulta reembolso
        And clicar no botão Executar do consulta reembolso
		Then o sistema apresenta o resultado da busca do consulta reembolso
        
#Validar o executante na funcionalidade de cunsulta reembolso de acordo com o cadastrado na inclusão do reembolso 
            
	Scenario: Validar o executante
		Given que ja consultei o reembolso 
        And escolher um reembolso na lista apresentada
        When quando acessar o menu Reembolso Odontológico -> alteração/analise
        And informar o Nº de Reembolso existente
        And ir até a aba Atendimento
		Then o Executante da Lista de consulta é o mesmo apresentado nesta aba


 #segundo Aline em 17/11/19 pop up para assumir é customização, verificar se é utilizada nesse Gherkin Test   
	Scenario: Validar Assumir Reembolso
		When informar um reembolso existente não vinculado ao usuario
        And o sistem mostrar o pop up com a mensagem Deseja assumir o pedido do reembolso?Assumindo o pedido do reembolso, a mesma ficará bloqueada para seu usuário até que seja finalizada sua alteração
        And clicar em Assumir
		Then o sistema abre o pedido de reembolso    