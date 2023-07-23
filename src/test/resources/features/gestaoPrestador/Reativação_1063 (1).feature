#Auto generated Octane revision tag
@TID1063REV0.18.0 @1063 @gestao-prestador
Feature:Manutenção Reativação
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Reativação. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Exclusão Operadora, Reativação

@siso @gestaoprestador @exclusaooperadora @reativacao @consultarprestadorativo @11
	Scenario: Validar consulta de Prestador Ativo 
		When Escrever um Prestador existente e Ativo
        And clicar fora do campo
        Then A aplicacao apresenta que o Prestador não está excluído em nenhuma operadora.
  


@siso @gestaoprestador @exclusaooperadora @reativacao @reativaropradoraespecifica
	Scenario: Validar Reativação do Cancelamento 
		When Informar um Prestador existente e Cancelado 
        And Selecionar a fleg Reativar e informar dataReativação 
        And Selecionar o botao Alterar
		Then A aplicacao apresenta Operação realizada com sucesso


