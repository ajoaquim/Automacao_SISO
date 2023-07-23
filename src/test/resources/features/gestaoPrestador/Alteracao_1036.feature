#Auto generated Octane revision tag
@TID1036REV0.31.0 @1036 @gestao-prestador

Feature:Manutenção Alteração
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Alteração. Em dados para pagamento utilizar a opção débito em conta.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos,Cadastro Prestador,Alteração
  
	Scenario: Validar consulta
		When Informar um Prestador existente na tela de alteração
        And clicar fora do campo na tela de alteração
		Then o sistema apresenta o resultado da busca na tela de alteração

@siso @gestaoprestador @cadastroprestador @alteracao @alteracaoprestador
	Scenario: Validar Alteração 
		When Informar um Prestador existente para alteração na tela de alteração
        And alterar os dados do menu Dados Cadastrais
        And alterar os dados do menu Endereço de Relacionamento
        And alterar os dados do menu Rede Atendimento
        And alterar os dados do menu Tipo de Estabelecimento
        And alterar os dados do menu Habilitação - Especialidades
        And alterar os dados do menu Endereço Atendimento
        And alterar os dados do menu Tipo de atendimento  
        And alterar os dados do menu Dados para pagamento
        And alterar os dados do menu Documentação
        And clicar no botão Alterar na tela de alteração
		Then o sistema apresenta a mensagem Operação Realizada com Sucesso na tela de alteração    
  
	Scenario: Validar exclusão 
		When Informar um Prestador existente para exclusão na tela de alteração
        And clicar no botão Excluir na tela de alteração
		And o sitema apresenta a mensagem O prestador será excluído fisicamente do Banco de Dados, isto é, todas as suas informações serão deletadas. Confirma a exclusão
        And clicar no botão Sim no alerta da tela de alteração
        Then o sistema apresenta a mensagem Operação Realizada com Sucesso na tela de alteração
             


        
        


