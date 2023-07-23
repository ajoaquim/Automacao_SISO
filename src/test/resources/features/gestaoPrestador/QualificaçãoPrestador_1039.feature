#Auto generated Octane revision tag
@TID1039REV0.20.0 @1039 @gestao-prestador

Feature:Manutenção Gestao Prestador 1039 - Qualificação Prestador
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Qualificação Prestador. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos,Cadastro Prestador,Qualificação Prestador
  
     Scenario: Efetuar a inclusão
       When informar um Prestador na tela qualificação
       And clicar fora do campo qualificacao Prestador
       And preencher os dados de inclusão na tela de qualificação
       And clicar no botão Incluir na tela de qualificação
       Then o sistema apresenta a mensagem Operação realizada com Sucesso na tela de qualificação

	Scenario: Validar consulta 
		When selecionar um Prestador existente na tela qualificação
        And clicar fora do campo qualificacao Prestador
		Then o sistema apresenta o resultado da busca na tela de qualificação

	Scenario: Validar Alteração 
		When selecionar um Prestador existente na tela de qualificação
        And clicar fora do campo qualificacao Prestador
        And realizar uma alteração nos dados na tela de qualificação
        And clicar no botão Alterar na tela de qualificação
		Then o sistema apresenta a mensagem Gravado com Sucesso        

	Scenario: Validar exclusão 
		When selecionar um Prestador existente na tela de qualificação
        And clicar fora do campo qualificacao Prestador
        And Flegar  a qualificação que deseja excluir
        And Clicar no botão Excluir na tela de qualificação
        And O sistema apresenta a mensagem Deseja excluir a qualificação selecionada?
        And clicar no botão Sim na tela de qualificação
        Then Sistema Exclui as qualificações do Prestador

 