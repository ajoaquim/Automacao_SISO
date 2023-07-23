#Auto generated Octane revision tag
@TID9547REV0.8.0 @reembolso
Feature:Manutenção 00000
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de 00000. 

     ***Incluir anexo 
        
        Validar o anexo na tela de historico *********

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Reembolso Odontológico","Prévia Reembolso","Anexo"
  @9547A
	Scenario: Efetuar a inclusão 
        When  informar um Nº de Prévia existente anexo
        And clicar fora do campo anexo
        And preencher a descrição do anexo anexo
        And selecionar Incluir anexo anexo
        And selecionar o arquivo anexo 
        Then o sistema apresenta a mensagem Operação realizada anexo

	Scenario: Validar consulta 
        When  informar um "Nº de Prévia" existente
        And clicar fora do campo
		Then o sistema apresenta o resultado da busca

	Scenario: Validar Exclusão 
        When  informar um "Nº de Prévia" existente
        And clicar fora do campo
        And verificar se existe anexo
        And clicar no botão "Excluir"
        And o sitema apresenta a mensagem "Deseja excluir o anexo ?"
        And clicar no botão "OK"
        Then o sistema apresenta a mensagem "Operação realizada"      
        
    Scenario: Validar o anexo na tela de historico 
 		Given que inclui um anexo
		When quando acessar o menu "N de Prévia" -> "Historico"
        And informar o "Nº de Reembolso" que o anexo foi inserido
        And abrir a aba "Anexos" da tela
		Then o sistema apresenta o anexo inserido.


 #segundo Aline em 17/11/19 pop up para assumir é customização, verificar se é utilizada nesse Gherkin Test   
	Scenario: Validar Assumir Reembolso
		When informar um reembolso existente não vinculado ao usuario
        And o sistem mostrar o pop up com a mensagem "Deseja assumir o pedido do reembolso?Assumindo o pedido do reembolso, a mesma ficará bloqueada para seu usuário até que seja finalizada sua alteração"
        And clicar em "Assumir"
		Then o sistema abre o pedido de reembolso    