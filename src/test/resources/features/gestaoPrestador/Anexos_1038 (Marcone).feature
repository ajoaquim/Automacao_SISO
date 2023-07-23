#Auto generated Octane revision tag
@TID1038REV0.15.0 @1038 @gestao-prestador
Feature:Manutenção Anexos
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Anexos. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Cadastro Prestador, Anexos
   
    Scenario: Efetuar a inclusão 
         When informar um prestador ainda não cadastrado
         And clicar fora do campo
         And preencher os dados de inclusão 
         And clicar no botão “Gravar”
         Then o sistema apresenta a mensagem Operação realizada com sucesso
         
	 Scenario: Validar consulta 
		When Informar um(a) Prestador existente
        And clicar fora do campo
		Then o sistema apresenta o resultado da busca

	Scenario: Validar Alteração 
		When Informar um(a) Prestador existente
        And clicar fora do campo
        And realizar uma alteração nos dados
        And clicar no botão "Gravar"
		Then o sistema apresenta a mensagem Operação realizada com sucesso        
        
        
   Scenario: Validar  sequência de seleção de campos (tecla TAB)
		Given que esteja logado no sistema Odonto na aba Cadastro Prestador e Anexos
        When Informar um(a) Prestador existente
        And clicar fora do campo
        When apertar a tecla Tab do teclado
		Then o sistema permite passar por todos os campos até chegar o último
        

        