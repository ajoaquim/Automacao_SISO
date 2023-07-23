#Auto generated Octane revision tag
@TID11161REV1.1.0
Feature:Como um usuário, Devo possuir acesso para realizar consulta de Manuais. 

Context:
  Given que acesse o Portal Prestador
  And preencho usuário e senha
  And acesse o menu "Comunicação"

	Scenario: Validar Consulta
		When selecionar "Manuais"
		Then o sistema apresenta em tela o manuais disponíveis 