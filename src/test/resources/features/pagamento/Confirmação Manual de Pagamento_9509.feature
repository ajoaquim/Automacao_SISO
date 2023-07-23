#Auto generated Octane revision tag
@TID9509REV0.9.0 @9509
Feature:Manutenção Confirmação Manual de Pagamento
Como um usuário, Devo possuir acesso para realizar uma Confirmação Manual de Pagamento. Essa funcinalidade é utilizada quando a informação do SAP não é automática, então é necessário fazer a baixa manual. Testar pagamento vindo do módulo Contas Ondontológicas e do de Reembolso.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Pagamento, Confirmação Manual de Pagamento

	@9509a
	Scenario: Efetuar a confirmação Manual de Pagamento via Reembolso
          When informar o dados para busca Confirmacao
          And selecionar Continuar Confirmacao
          And flegar o pagamento para ser dado baixa Confirmacao
          And executar a ação Confirmacao
          Then o sistema exibe a mensagem Pagamento confirmado com sucesso. Confirmacao
     @9509b     
    Scenario: Efetuar a confirmação Manual de Pagamento via Contas Ondontológicas
          When informar o dados para busca Confirmacao Contas Ondontológicas
          And selecionar Continuar Confirmacao Contas Ondontológicas 
          And flegar o pagamento para ser dado baixa Confirmacao Contas Ondontológicas
          And executar a ação Confirmacao Contas Ondontológicas
          Then o sistema exibe a mensagem Pagamento confirmado com sucesso. Confirmacao Contas Ondontológicas
   
   

        