#Auto generated Octane revision tag
@TID9309REV0.13.0  @workflow
Feature:Como Workflow 9309 um usuário, devo possuir acesso para realizar consulta em Workflow -> Histórico


Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When acesse a aba "Workflow","Histórico"

	Scenario: Consultar histórico
        When informar uma "solicitação" já existente
				And selecionar "Histórico"
		        And o dados for apresentado em telaa
				And selecionarr "Envio de acompanhamento de demandaa"
        And selecionarr a "forma de retorno"
        And selecionaarr "Executar" 
        Then o Acompanhamento de demanda é enviado para o canal informado
        
    Scenario: Geral Excel
			When informar uma "solicitação" já existentee
        And clicarr fora do campo
        And selecionaaar "Excel"
        And o Download do arquivo for realizadoo
			Then os dados da tela são extraídoss em XML