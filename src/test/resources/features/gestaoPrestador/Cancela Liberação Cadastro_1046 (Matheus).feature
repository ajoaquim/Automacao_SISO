#Auto generated Octane revision tag
@TID1046REV0.9.0 @1046 @gestao @SISO @gestao-prestador
Feature:Manutenção Gestao Prestador 1046 - Liberação
		Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Liberação. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Gestão Prestadores Odontológicos, Cadastro Prestador , Cancela Liberação Cadastro

	
	Scenario: Validar consulta quando Prestador já tem a liberação Cancelada 
		When Informar um(a) Prestador existente com a liberação já Cancelada 
        And clicar fora do campo
		Then o sistema apresenta o resultado da busca e a mensagem Prestador está em implantação em todas as operadoras.
	
	Scenario: Validar Cancelamento de Liberação 
		When Seleciono Prestador existente
        And clicar fora do campo
        And Selecionar a fleg Cancela 
        And clicar no Executar
		Then aplicacao apresenta a mensagem Operação realizada com sucesso
        
   