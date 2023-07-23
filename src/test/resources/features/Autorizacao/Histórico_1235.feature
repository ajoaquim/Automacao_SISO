@TID1235REV0.4.0 @1235 @SISO @autorizacao
Feature:Manutenção Autorização 1235 - Histórico
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Histórico. 

 Background: 
  Given que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse Histórico

	
	Scenario: Validar consulta  
		When Informar número de Pedido existente 
    And seguir com o botão de continuar
		Then o sistema apresenta o Histórico
