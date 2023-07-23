#Auto generated Octane revision tag
@TID11147REV0.7.0
Feature: Como usuário devo ter acesso para gerar um demonstrativo Analítico.

Context:
  Given que acesse o Portal Prestador
  And preencho usuário e senha
  And acesse o menu "Pagamento"-> "Demonstrativo Analítico"
  
	Scenario: Gerar demonstrativo
		Given que tenha tratamento liberado para pagamento
		When informar o período desejado
		Then o sistema apresenta em tela o demonstrativo buscado


