#Auto generated Octane revision tag
@TID9229REV0.11.0 @9229 @contasodontologicas
Feature:Como um usuário, Devo possuir acesso para realizar uma Reversão da confirmação de execução. Apenas em pedidos Autorizados e com a confirmação de execução preenchida serão possíveis reverter. Para reverter uma confirmação vinda do Portal é necessário ter um pedido com a confirmação preenchida no Portal e apenas a reversão será efetuada nessa funcionalidade.
Só será possivel reverter guias que não estão atreladas a pagamento ou remessas.

Background:
  When que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse a aba Autorização/Pedido de Autorização/Reverte Confirmação de Execução

	Scenario: Efetuar a Reversão da Confirmação de execução de um pedido vindo backoffice
        When informar um pedido autorizado e com confirmação de execução reverter pedido menu contas odontologicos
        And clicar fora do campo reverter pedido menu contas odontologicos
        And selecionar o procedimento para reversão
        And clicar no botão Reverte Confirmação de Execução reverter pedido menu contas odontologicos
        And clicar no botão ok reverter pedido menu contas odontologicos
		Then o sistema apresenta a mensagem Atenção: Reversão da confirmacão do pedido realizada.
        
    Scenario: Efetuar a Reversão da Confirmação de execução de um pedido vindo pelo portal
       When informar um pedido autorizado vindo do portal e com confirmação de execução
       And clicar fora do campo reverter pedido menu contas odontologicos
       And selecionar o procedimento para reversão
       And clicar no botão Reverte Confirmação de Execução reverter pedido menu contas odontologicos
       And clicar no botão ok reverter pedido menu contas odontologicos
	   Then o sistema apresenta a mensagem Atenção: Reversão da confirmacão do pedido realizada.
        
       
        
    