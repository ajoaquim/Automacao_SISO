#Auto generated Octane revision tag
@TID1043REV0.32.0 @1043 @gestao-prestador
Feature:Manutenção Inclusão
Como um usuário, Devo possuir acesso para realizar inclusão de um prestador. Em dados para pagamento utilizar a opção débito em conta.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos, Cadastro Prestador, Inclusão 

@siso @gestaoprestador @cadastroprestador @inclusao @inclusaonovoprestador @1043a
	Scenario: Efetuar a inclusão de um prestador
		When  Informar o tipo de Pessoa
        And preencher os dados do menu Dados Cadastrais
        And preencher os dados do menu Informações Complementares
        And preencher os dados do menu Endereços de antendimento
        And preencher os dados do menu Rede Atendimento
        And preencher os dados do menu Tipo Estabelecimento
        And preencher os dados do menu Habilitação - Especialidades
        And preencher os dados do menu Dados de pagamento
        And preencher os dados do menu Documentação
        And Incluir		
		Then o sistema apresenta a mensagem Operação realizada com sucesso na tela de inclusao
        
@siso @gestaoprestador @cadastroprestador @inclusao @inclusaoprestadorjacadastro @1043b  
    Scenario: Efetuar a inclusão de Prestador já cadastrado  
		When Informar o tipo de Pessoa alteracao
        And preencher os dados do menu Dados Cadastrais com informações já cadastradas
        And preencher os dados do menu Informações Complementares
        And preencher os dados do menu Endereços de antendimento
        And preencher os dados do menu Rede Atendimento
        And preencher os dados do menu Tipo Estabelecimento Alteracao
        And preencher os dados do menu Habilitação - Especialidades
        And preencher os dados do menu Dados de pagamento
        And preencher os dados do menu Documentação
        And Incluir
		Then o sistema apresenta a mensagem O prestador já está cadastrado com o CPF/CNPJ informado.
        
@siso @gestaoprestador @cadastroprestador @inclusao @inclusaonaoobrigatoriedade @1043c  
   Scenario: Validar obrigatoriedade de não preenchimento de campos 
		When Informar o tipo de Pessoa alteracao
        And preencher os dados do menu Dados Cadastrais com informações já cadastradas
        And preencher os dados do menu Informações Complementares
        And preencher os dados do menu Endereços de antendimento
        And preencher os dados do menu Endereços de Relacionamento
        And preencher os dados do menu Rede Atendimento
        And preencher os dados do menu Tipo Estabelecimento Validar
        And preencher os dados do menu Habilitação - Especialidades
        And preencher os dados do menu Dados para Pagamento
        And preencher os dados do menu Documentação
        And preencher os dados do menu Entrega
        And preencher os dados do menu Tipo de Atendimento
        And Incluir
		Then o sistema apresenta sinal de alerta informando o campo que ficou faltando o preenchimento
        
 
        
        

