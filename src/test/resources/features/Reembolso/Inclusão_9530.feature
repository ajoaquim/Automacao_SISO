#Auto generated Octane revision tag
@TID9530REV0.48.0 @9530 @reembolso
Feature: Manutenção Inclusão
  Como um usuário, Devo possuir acesso para realizar inclusão de Reembolso Odontológico e Inclusão.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Reembolso Odontológico,Inclusão

  @9530A
  Scenario: Validar menus
    When informar um Beneficiário ativo na tela de reembolso inclusao
    And clicar fora do campo na tela de reembolso inclusao na hora da inclusao
    And Consultar Reembolsos do beneficiário na Inclusao
    And Pesquisar Prévia por Família na Inclusao
    And Pesquisar Prévia por Beneficiário na Inclusao
    And Consultar Histórico de Procedimentos na Inclusao
    And Pesquisar dados beneficiário/Contratos na Inclusao
    And Abrir alertas beneficiário na Inclusao
    And Abrir Contatos do Beneficiário na Inclusao
    And Incluir data Postagem na inclusao
    And incluir data Recebimento na inclusao
    And incluir Forma Pagamento na inclusao
    And preencher os dados de Procedimento
    And preencher os dados do Atendente
    And clicar no botão Analise/Inclusão na hora da inclusao
    And o sistema apresenta a mensagem Pedido Incluido para Situação em Análise com Sucesso
    And Aprovar a Glosa na tela de reembolso inclusao
    And Clicar no Botão Submeter na tela de inclusão
    And Clicar no Botão Aprovar Pedido na tela de reembolso inclusao
    Then o sistema apresenta a mensagem Numero pedido, senha e validade

  #Prestador livre Escollha
  @9530B
  Scenario: Validar Inclusão de Prestador Livre Escolha na hora da inclusao
    When informar um Beneficiário ativo na tela de reembolso inclusao
    And clicar fora do campo na tela de reembolso inclusao na hora da inclusao
    And clicar em Incluir Livre Escolha na hora da inclusao
    And informar um CPF no campo Inscrição na hora da inclusao
    And Preencher os campos Nome, Sigla, numero e UF na hora da inclusao
    And clicar no Botão Incluir na hora da inclusao
    And o sistema apresenta a mensagem Operação realizada na hora da inclusao
    And na seção Prestador/Livre Escolha na hora da inclusao
    And selecionar um prestador para edição na hora da inclusao
    And clicar em Alterar Livre Escolha na hora da inclusao
    And realizar uma alteração na hora da inclusao
    And clicar em Incluir na hora da inclusao
    And o sistema apresenta a mensagem Operação realizada na hora da inclusao
    And selecionar um prestador para edição na hora da inclusao
    And adicionar um procedimento na hora da inclusao
    And preencher o campo Dente/Região selecionando a opção que estiver em azul na hora da inclusao
    And flegar Laudo, Raio-x inicial e Raio-x final na hora da inclusao
    And inserir data em Realização na hora da inclusao
    And informar o Valor Informado na hora da inclusao
    And selecionar o botão Alteração/Análise na hora da inclusao
    And selecionar o botão submeter
    Then o sistema permite submeter o pedido com sucesso

  @9530C
  Scenario: Validar um Beneficiário Excluído
    When Informar um Beneficiário existente Excluído
    And clicar fora do campo na tela de reembolso inclusao na hora da inclusao
    And Preencher os Campos de Informações do Beneficiario Excluido
    And Preencher os campos de Atendimento do Beneficiario Excluido
    And Preencher os Campos de Procedimento do Beneficiario Excluido
    And Preencher os Campos de Observação do Beneficiario Excluido
    And informar um Anexo do Beneficiario Excluido
    And selecionar o botão Alteração/Análise na hora da inclusao
    And o sistema apresenta Glosa com crítica informando que o Beneficiário esta excluído

  @9530D
  Scenario: Validar um Beneficiário Suspenso
    When Informar um Beneficiário existente Suspenso
    And clicar fora do campo na tela de reembolso inclusao na hora da inclusao
    And Preencher os Campos de Informações do Beneficiario Suspenso
    And Preencher os campos de Atendimento do Beneficiario Suspenso
    And Preencher os Campos de Procedimento do Beneficiario Suspenso
    And Preencher os Campos de Observação do Beneficiario Suspenso
    And informar um Anexo do Beneficiario Suspenso
    And selecionar o botão Alteração/Análise na hora da inclusao
    Then o sistema apresenta Glosa com crítica informando que o Beneficiário esta suspenso
