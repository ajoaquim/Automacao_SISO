#Auto generated Octane revision tag
@TID9234REV0.14.0 @9234 @contas-odontologicas
Feature:Como um usuário, Devo possuir acesso para realizar um protocolo manual de inclusão. Essa funcionalidade serve para abrir um recurso de glosa dentro backoffice. É criado um lote que respeitar o calendário geral, limitando em 100 guias. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Conta Odontológica,Revisão,Protocolo Manual, Inclusão
    
  @9234a
	Scenario: Efetuar a inclusão
        When  informar os dados desejados Prestador, Postagem e Recebimento
        And selecionar Salvar
        And digitar o número da guia
        And selecionar Protocolar
        And selecionar submeter
        Then a remessa de recurso de glosa é criada com sucesso
        
    @9234b
    Scenario: Validar funcionalidades
        When informar os dados desejados Prestador, Postagem e Recebimento
        And selecionar Salvar
        And digitar o número da guia validar
        And selecionar Protocolar validar
        And selecionar o checkebox excluir da guia
        And selecionar salvar
        And a guia é excluída da remessa
        And selecionar Incluir uma nova remessa
        And informar os dados desejados Prestador, Postagem e Recebimento
        And selecionar Salvar
        And digitar o número da guia
        And selecionar Protocolar validar
        And selecionar Excluir
        Then a remessa que estaja sendo criada é excluída
