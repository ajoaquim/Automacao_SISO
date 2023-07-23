#Auto generated Octane revision tag
@TID9219REV0.22.0 @9219
Feature: Manutenção Análise Remessa por Referência. Devo possuir acesso para realizar Análise nas Remessa por Referência. Para realizar o teste é necessário ter uma remessa já gerada no módulo Geração de Remessa.
                   Guias vindas do Portal Prestador cai direto nesse módulo, guias vinda do módulo de autorização é preciso inserir a data de realização do procedimento em confirmação de execução. 
                   É possível visualizar ou assumir pedidos novos ou que estejam com outro usuário. A remessa se refere apenas a um único prestador, dentro dela tem várias guias que pode conter um ou mais procedimentos.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When selecionar o menu Conta Odontológica,Análise Remessa por Referência
    #Remessa
    When optar por Conta Odontológica,Análise Remessa por Referência

  Scenario: Desbloquear uma remessa que esteja com outro usuário para análise
    Given que tenha uma remessa já gerada com outro usuário para análise
    When realizar o filtro para busca da remessa para análise
    And selecionar Atualizar para análise
    And selecionar a remessa desejada para análise
    And selecinar Desbloquear para análise
    And selecionar assumir para análise
    Then a remessa fica assumida para o usuário logado para análise

  Scenario: Excluir uma guia da remessa
    Given que tenha uma remessa já gerada guia
    When realizar o filtro para busca da remessa guia
    And selecionar Atualizar guia
    And selecionar a remessa desejada guia
    And selecionar a guia (Protocoloada/processada) guia
    And selecionar Excluir guia
    Then a guia é excluída da remessa guia

  Scenario: Validar ações próxima, anterior, ocorrências de remessas e fechar
    And optar por selecionar a guia Protocolada e ou processada guia
    And selecionar Excluir guia
    Then a guia é excluída da remessa guia

  Scenario: Validar ações próxima, anterior, ocorrências de remessas e fechar
    Given que tenha uma remessa já gerada ações
    When realizar o filtro para busca da remessa ações
    And selecionar Atualizar ações
    And selecionar a remessa desejada ações
    And selecionar Ocorrências da Remessa ações
    And o sistema apresenta um pop-up com ocorrências ações
    And selecinar Próxima ações
    And o sistema passa para a remessa seguinte da fila ações
    And selecinar Anterior ações
    And o sistema volta para a remessa anterior da fila ações
    And selecionar fechar ações
    Then o sistema fecha a remessa que estava em tela e volta para a página inicial do menu Análise Remessa por Referência ações

  #analisando os procedimentos dentro da guia que é dentro da remessa
  Scenario: Validar dados de uma análise de conta
    Given que tenha uma remessa já gerada Validar dados
    When realizar o filtro para busca da remessa Validar dados
    And selecionar Atualizar Validar dados
    And selecionar a remessa desejada Validar dados
    And selecionar a guia desejada Validar dados
    And selecionar Alterar Validar dados
    And validar dados da seção Encaminhamento Validar dados
    And validar dados da seção Informações Validar dados
    And incluir uma Observação Validar dados
    And incluir um Anexo Validar dados
    And validar as últimas Ocorrências realizadas Validar dados
    Then o sistema permite Submeter a remessa com sucesso Validar dados

  Scenario: Validar análise de uma conta com glosa em um ou mais procedimentos
    Given que tenha uma remessa já gerada validar análise
    When realizar o filtro para remessa validar análise
    And selecionar Atualizar validar análise
    And selecionar a remessa desejada validar análise
    And selecionar uma guia Processada c/ glosa validar análise
    And selecionar Alterar validar análise
    And selecinar o procedimento validar análise
    And selecionar Análise de Procedimentos validar análise
    And liberar a glosa validar análise
    And selecionar Executar validar análise
    Then o sistema permite Submeter a guia e a mesma fica com o status análisado validar análise

  Scenario: Validar retorno da situação de uma guia
    Given que tenha uma remessa já gerada Validar retorno
    When realizar o filtro para busca da remessa Validar retorno
    And selecionar Atualizar Validar retorno
    And selecionar a remessa desejada Validar retorno
    And selecionar uma guia Análisada  Validar retorno
    And selecionar Alterar Validar retorno
    And selecionar Voltar situação Validar retorno
    And o status da guia volta para Processada Validar retorno
    And selecionar um Procedimento Validar retorno
    And selecionar Reprocessar Validar retorno
    Then o procedimento Reprocessado fica editável para alteração Validar retorno

  Scenario: Validar desvincular procedimentos
    Given que tenha uma remessa já gerada validar desvincular
    When realizar o filtro para busca da remessa validar desvincular
    And selecionar Atualizar validar desvincular
    And selecionar a remessa desejada validar desvincular
    And selecionar uma guia validar desvincular
    And selecionar Alterar validar desvincular
    And selecionar um Procedimento validar desvincular
    And selecionar Desvincular Procedimentos validar desvincular
    Then o procedimento não fica mais visível na tela análise da conta validar desvincular
    When realizar o filtro para busca da remessa validar desvinculo
    And selecionar Atualizar validar desvinculo
    And selecionar a remessa desejada validar desvinculo
    And selecionar uma guia validar desvinculo
    And selecionar Alterar validar desvinculo
    And selecionar um Procedimento validar desvinculo
    And selecionar Desvincular Procedimentos validar desvinculo
    Then o procedimento não fica mais visível na tela análise da conta validar desvinculo
