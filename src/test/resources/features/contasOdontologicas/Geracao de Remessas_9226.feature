#Auto generated Octane revision tag
@TID9226REV0.12.0 @9226 
Feature:Como um usuário, Devo possuir acesso para realizar Geração de Remessas. Essa funcinalidade será utilizada como excessão quando o processo não estiver funcinando automáticamente ou quando for necessário fazer geração de remessas de guias que chegar via correio.É necessário escolher o prestador e a origem da remessa para que a mesma seja gerada. 
   

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When selecionar o menu Conta Odontológica,Geração de Remessas
    
	Scenario:  Validar Confirmação Execução com Status autorizado 
		Given que informe o Prestador com guias confirmadas Geração de Remessas
		When selecionar continuar Geração de Remessas
        And selecione a Remessa desejada Geração de Remessas
        And selecione executar Geração de Remessas 
		Then sistema apresenta em tela a fila de execução e o status fica "Ok" quando a remessa for gerada por completo Geração de Remessas
