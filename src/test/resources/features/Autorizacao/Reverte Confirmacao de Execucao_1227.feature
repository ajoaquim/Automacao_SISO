#Auto generated Octane revision tag
@TID1227REV0.12.0 @1227 @autorizacao
Feature:Manutenção Reverte Confirmação de Execução
Como um usuário, Devo possuir acesso para realizar uma Reversão da confirmação de execução. Apenas em pedidos Autorizados e com a confirmação de execução preenchida serão possíveis reverter. Para reverter uma confirmação vinda do Portal é necessário ter um pedido com a confirmação preenchida no Portal e apenas a reversão será efetuada nessa funcionalidade.
Só será possivel reverter guias que não estão atreladas a pagamento ou remessas.

Background:
  Given que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse a aba "Autorização"/"Pedido de Autorização"/"Reverte Confirmação de Execução"

	Scenario: Efetuar a Reversão da Confirmação de execução
        When se tenha um pedido "autorizado" e com "confirmação de execução"
        And clicar fora do campo Confirmação de execução
        And selecionar o procedimento para reversão Confirmação de execução
        And clicar no botão "Reverte Confirmação de Execução" Confirmação de execução
        And clicar no botão "ok" Confirmação de execução
		Then o sistema traz a mensagem Atenção: Reversão da confirmacão do pedido realizada.
    
    Scenario: Efetuar a Reversão da Confirmação de execução pelo portal
       When informar um "Número de pedido" que tenha a confirmação realizada no Portal do Prestador
       And clicar fora do campo execução pelo portal
       And selecionar o procedimento para reversão execução pelo portal
       And clicar no botão "Reverte Confirmação de Execução" execução pelo portal
       And clicar no botão "ok" execução pelo portal
	   Then o sistema mostra a mensagem Atenção: Reversão da confirmacão do pedido realizada.
        
     