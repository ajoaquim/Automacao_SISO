#Auto generated Octane revision tag
@TID15234REV0.3.0 @PortalCandidato @portal-candidato
Feature:Como usuário devo possuir acesso para realizar um primeiro  cadastro no Portal do Candidato e acesso ao e-mail cadastrado para validar o recebimento do login e senha por e-mail.

   Scenario: Inclusão Candidato
        Given quem clique em Primeiro acesso CADASTRE-SE
        When informar os dados de primeiro acesso
        And clicar no botão Iniciar Cadastro
        And preencher os dados do menu Dados Cadastrais
        And clicar no botão Próximo
        And preencher os dados do menu Tipo Serviço
        And clicar no botão Próximo
        And preencher os dados do menu Endereços e Especialidades
        And clicar no botão Próximo
        And preencher qualificação
        And clicar no botão Próximo
        And preencher os dados do menu Documentação necessária
        And clicar no botão Próximo
        And preencher o menu Questionário
        And clicar no botão Próximo
        And o sistema apresenta mensagem de finalização
        And aceitar a confirmação dos dados
        And clicar no botão Salvar
        Then o sistema apresenta o número de protocolo 

    Scenario: Validar envio de login e senha por e-mail
         Given que clique em Primeiro acesso? CADASTRE-SE
         When informar os dados de primeiro acessoo
         And clicar no botão Iniciar Cadastro
         And receber os dados de acesso no e-mail cadastrado
         And realizar o acesso em Portal Candidato com o login e senha recebido por e-mail
         Then o sistema realiza o login com sucesso

    Scenario: Consulta de status
         Given que faça o login no Portal do Candidato
         Then o sistema apresenta a situação atual solicitação 

    Scenario: alteração de informações
         Given que faça o login no Portal do Candidato
         And realize a alteração desejada
         And clicar no botão Salvar no menu que fez a alteração
         Then o sistema apresenta mensagem de cadastro atualizado