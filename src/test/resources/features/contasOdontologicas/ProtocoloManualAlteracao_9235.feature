#Auto generated Octane revision tag
@TID9235REV0.10.0 @9235 @contasodontologicas
Feature:Como um usuário, Devo possuir acesso para realizar Alteração de remessas já criadas. Para realziar esse teste será necessário ter uma remessa inclusa.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Conta Odontológica,Revisão,Protocolo Manual, Alteração

	Scenario: Efetuar alteração
        When informar uma remessa já criada na tela de alteracao contas odontologicas
        And selecionar executar na tela de alteracao contas odontologicas
        And digitar o número da guia na tela de alteracao contas odontologicas
        And selecionar Protocolar na tela de alteracao contas odontologicas
        And selecionar o checkebox excluir da guia na tela de alteracao contas odontologicas
        And selecionar salvar na tela de alteracao contas odontologicas
        And selecionar Excluir na tela de alteracao contas odontologicas
        Then a remessa é excluída com sucesso na tela de alteracao contas odontologicas
        
        
 