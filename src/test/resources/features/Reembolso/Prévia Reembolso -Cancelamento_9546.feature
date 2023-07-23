#Auto generated Octane revision tag
@TID9546REV0.12.0 @9546 @reembolso
Feature:Manutenção 00000
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de 00000. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Reembolso Odontológico","Prévia Reembolso","Cancelamento" previa

   Scenario: Validar Cancelamento de Pedido de Prévia 
		    When informar um  "<codReembolso>" com "<status>" previa
        And clicar no Botão Cancelar previa 
        And o sitema apresenta a mensagem "Deseja cancelar a prévia de Reembolso? " previa
        And clicar no botão ok previa 
        Then o sistema apresenta a mensagem " Atenção: Cancelamento da prévia realizado." previa 


  
        
        
        
        