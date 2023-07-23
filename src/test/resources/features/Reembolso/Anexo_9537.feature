#Auto generated Octane revision tag
@TID9537REV0.14.0 @9537 @reembolso
Feature:Manutenção Anexo
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Anexo. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reembolso Odontológico,Anexo

	Scenario: Efetuar a inclusão 
        When  informar um Nº de Reembolso existente na tela de reembolso anexo
        And clicar fora do campo na tela de reembolso anexo
        And selecionar o arquivo na tela de reembolso anexo
        And preencher a descrição do anexo na tela de reembolso anexo
        And selecionar Executar na tela de reembolso anexo  
        Then o sistema apresenta a mensagem Operação realizada na tela de reembolso anexo

	Scenario: Validar consulta 
        When  informar um Nº de Reembolso existente na tela de reembolso anexo
        And clicar fora do campo na tela de reembolso anexo
		Then o sistema apresenta o resultado da busca na tela de reembolso anexo

	Scenario: Validar Exclusão 
        When  informar um Nº de Reembolso existente na tela de reembolso anexo
        And clicar fora do campo na tela de reembolso anexo
        And verificar se existe anexo na tela de reembolso anexo
        And clicar no botão Excluir na tela de reembolso anexo
        And o sitema apresenta a mensagem Deseja excluir o anexo ? na tela de reembolso anexo
        And clicar no botão OK na tela de reembolso anexo
        Then o sistema apresenta a mensagem Operação realizada na tela de reembolso anexo
        
    Scenario: Validar o anexo na tela de historico 
 		Given que inclui um anexo na tela de reembolso anexo
		When quando acessar o menu Reembolso Odontológico -> Historico
        And informar o Nº de Reembolso que o anexo foi inserido
        And abrir a aba Anexos da tela
		Then o sistema apresenta o anexo inserido na tela de reembolso anexo

 #segundo Aline em 17/11/19 pop up para assumir é customização, verificar se é utilizada nesse Gherkin Test   
	Scenario: Validar Assumir Reembolso
		When informar um reembolso existente não vinculado ao usuario
        And o sistem mostrar o pop up com a mensagem Deseja assumir o pedido do reembolso?Assumindo o pedido do reembolso, a mesma ficará bloqueada para seu usuário até que seja finalizada sua alteração
        And clicar em Assumir na tela de reembolso anexo
		Then o sistema abre o pedido de reembolso na tela de reembolso anexo 