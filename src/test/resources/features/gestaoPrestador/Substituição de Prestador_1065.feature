#Auto generated Octane revision tag
@TID1065REV0.13.0 @1065 @gestao-prestador
Feature:Manutenção Substituição de Prestador
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Substituição de Prestador. Para substituir não preencher o campo, motivo exceção, pois caso contrário não será obrigatório a substituição do prestador.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Exclusão Operadora, Substituição de Prestador


@siso @gestaoprestador @exclusaooperadora @substituicaoprestador @incluirsubstituicaoprestador @1065a
	Scenario: Efetuar a inclusão de Substituição de Prestador 
		When  Selecionar um Prestador Ativo
        And selecionar operadora e motivo exclusão
        And selecionar flag emitir carta
        And informar observacao
        And clicar no Salvar
		And o sistema apresenta a mensagem Exclusão realizada com sucesso. Indique um prestador substituto.
        And clicar em Pesquisa Geral
        And Escolher um Prestador clicar na Fleg Substituto
        Then Automáticamente o sistema apresenta a mensagem Operação realizada com sucesso
 
   
@siso @gestaoprestador @exclusaooperadora @substituicaoprestador @alteracaosubstituicao @1065b
	Scenario: Validar Inclução de novo Substituto 
		When  Selecionar um Prestador  Ativo já Substituido 
        And Selecionar a operadora
        And clicar no Salvar
        And Escolher Outro Prestador para substituir e clicar na Fleg Substituto
        Then Automáticamente o sistema apresenta a mensagem Operação realizada com sucesso
   
        
@siso @gestaoprestador @exclusaooperadora @substituicaoprestador @alteracaorecusado @1065c      
	Scenario: Validar Alteração de Recusado
		When  Selecionar um Prestador  Ativo já Substituido 
        And Selecionar a operadora
        And clicar no Salvar
        And escolher um Prestador que é substituto e clicar na Fleg Recusado
        Then Automáticamente o sistema apresenta a mensagem Operação realizada com sucesso e a fleg marcada como substituto será desflegada automaticamente.
  
               

        

        

        