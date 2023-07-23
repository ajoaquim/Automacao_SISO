#Auto generated Octane revision tag
@TID1064REV0.15.0 @1064 @gestao @SISO @gestao-prestador
Feature:Manutenção Gestao Prestador 1064 - Substituição de Prestador
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Substituição de Prestador. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas	
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Exclusão Operadora , Cancela

@siso @gestaoprestador @exclusaooperadora @cancela @consultarprestadornaoexcluido @1064a
	Scenario: Validar consulta de Prestador não excluído 
		When Informou um Prestador existente não excluído
        And clicar fora do campo
        Then o sitema apresenta a mensagem Prestador não está excluído em nenhuma operadora.
 

@siso @gestaoprestador @exclusaooperadora @cancela @cancelamentodaexclusao 
	Scenario:  Validar realização do Cancelamento da exclusao
		When Informou um Prestador existente e Cancelado 
        And Selecionar a fleg Cancelar Exclusão 
        And Clicar no Botão Alterar
		Then o sitema apresenta a mensagem Operação realizada com sucesso
         
   