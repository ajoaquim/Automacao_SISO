#Auto generated Octane revision tag

@TID1037REV0.17.0 @1037 @gestao-prestador

Feature:Manutenção Gestao Prestador 1037 - Ocorrências
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Ocorrências. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos,Cadastro Prestador,Ocorrências


	Scenario: Validar consulta  
		When Informar Prestador na tela de ocorrencias
        And clicar fora do campo selecionado anteriormente na tela de ocorrencias
		Then o sistema apresenta o resultado da busca feita pelo sistema na tela de ocorrencias
 
          
    Scenario: Validar alteração
    When informar prestador existente na tela de ocorrencias
    And clicar fora na tela de ocorrencias
    And realizar alteração nos dados na tela de ocorrencias
    And clicar no botão alterar na tela de ocorrencias
    Then o sistema apresenta a mensagem Operação realizada com sucesso pelo sistema na tela de ocorrencia
    