#Auto generated Octane revision tag
@TID9227REV0.7.0 @9227 @contas-odontologicas
Feature: Como um usuário, Devo possuir acesso para realizar inclusão de Observações. 

Background: 
  Given que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse a aba Contas Odontológicas,  Observações

	Scenario: Efetuar a observação
		When  informar um Nº Pedido já existente
        And clicar fora do campo
        And selecionar Tipo de Observacao
        And preeencher o campo Observação
        And clicar no botão Salvar
		Then o sistema apresenta a mensagem  Atenção: Alteração da observacão do pedido realizada.
  
        
        