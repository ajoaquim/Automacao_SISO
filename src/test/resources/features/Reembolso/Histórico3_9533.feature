#Auto generated Octane revision tag
@TID9533REV0.14.0 @9533 @reembolso
Feature: Manutenção Histórico
  Como um usuário, Devo possuir acesso para realizar consulta de Histórico.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Reembolso Odontológico","Histórico"
		
		  Scenario: Validar consulta de Procedimento
		    When informar um "Reembolso" existente historico
		    And clicar no Botão "Continuar" historico
		    Then o sistema apresenta o resultado da busca historico 
	
		  Scenario: Validar Botão Voltar Situação de Reembolso em Status de Enviado para Pagamento
		    When informar um Reembolso Enviado para Pagamento historico 
		    And clicar no Botão Continuar historico2
 		    And Clicar no Botão Voltar Situação historico
		    And o sistema apresenta a mensagem Deseja voltar a situação do Reembolso para Em análise? historico
		    And Clicar no Botão OK historico2
		    Then O Sistema apresente a mensagem Situação do reembolso retornada com sucesso. historico
