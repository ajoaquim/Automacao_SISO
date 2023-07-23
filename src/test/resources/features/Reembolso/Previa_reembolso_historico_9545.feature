#Auto generated Octane revision tag
@TID9545REV0.12.0 @9545 @reembolso
Feature:Manutenção Prévia Reembolso -Histórico
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Prévia Reembolso -Histórico
 
 *** validar se todas as informações no Historico condiz com a tela de alteração ***

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reembolso Odontológico,Prévia Reembolso,Histórico


   Scenario: Validar consulta de Procedimento 
		When informar um número de prévia existente na tela de previa reembolso historico
        And clicar no Botão Continuar  na tela de previa reembolso historico
        Then informações Corretas em tela de Histórico.