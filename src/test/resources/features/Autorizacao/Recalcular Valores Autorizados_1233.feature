#Auto generated Octane revision tag
@TID1233REV1.3.0 @1233 @autorizacao
Feature:Manutenção Recalcular Valores Autorizados
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Recalcular Valores Autorizados. 

Background:
  Given que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse a aba Autorização Recalcular Valores Autorizados
	
	Scenario: Efetuar o Recalculo Valores Autorizados
		When  informar um Prestador já existente
        	
        	And então clicar no botão "F2 - Executar"
		Then o sistema mostrará "Atenção: Recalculo realizado com sucesso"

        
 


        