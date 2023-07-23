#Auto generated Octane revision tag
@TID9220REV0.14.0 @9220 @contas-odontologicas
Feature:Como um usuário, Devo possuir acesso para realizar o Cancelamento Fechamento Técnico. Nessa funcinalidade só será apresenta as remessas que estão com status enviado para pagamento (antes do pagamento ser enviado para o SAP) e o status voltará para análisado.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar pelo menu Conta Odontológica Cancelamento Fechamento Técnico

Scenario: Validar cancelamento do fechamento técnico 
        Given que tenha um fechamento técnico realizado
		When informar os dados para busca
        And selecionar uma ou mais "remessas"
        And selecionar executar fechamento técnico
		Then o sistema apresenta a tela com o job que está sendo executado
   
        
     
        