#Auto generated Octane revision tag

@TID15149REV0.12.0 @15149 @workflow
Feature: Workflow 15149 

  #Analise
  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When acesse a aba "Workflow","Análise"
 
  Scenario: Validar consulta de solicitação realizada do tipo "Agendada" analise
    When Informar o número da solicitação igual a "150" analise
    And clicar na lupa de pesquisa ou fora do campo analise
    Then o sistema apresenta o resultado da busca na tela "Análise" o campo "Situação" com a opção "Agendada" selecionada analise

  
  Scenario: Validar opção de situação do tipo "Agendada"
    When clicar na lupa de pesquisa do campo "Nº da Solicitação"
    And o sistema apresenta o resultado da busca na tela "Pesquisa Solicitações" o campo "Situação" com a opção "Agendada" para seleção
    And clicar na opção "Agendada"
    And clicar no botão "Continuar" analise
    Then o sistema apresenta o resultado da busca na tela "Pesquisa Solicitações" em um grid
  @15149C
  Scenario: Validar edição do campo tipo data/hora nas telas "Atividade/Registro Atividade"
    Given que opto por selecionar o menu Registro Atividade Analise
    When pesquisar uma Atividade clicando na lupa Analise
    And clicar em marcar todos do campo Situação Analise
    And clicar em continuar Analise
    And clicar em uma atividade com status igual a Aberta Analise
    Then o sistema apresenta campo data/hora aberto para edição Analise
	@15149D
  Scenario: Validar bloqueio de edição do campo tipo data/hora nas telas "Atividade/Registro Atividade"
    Given que opto por selecionar o menu "Workflow","Registro Atividade" Analise1
    When pesquisar uma "Atividade" clicando na lupa Analise1
    And clicar em "marcar todos" do campo "Situação" Analise1
    And clicar em "continuar" v
    And clicar em uma atividade com status diferente de "Aberta" Analise1
    Then o sistema apresenta campo data/hora bloqueado para edição Analise1
  @15149E
  Scenario: Validar retorno após finalização de alguma ação
    Given que realizo uma ação na Solicitação através da função Análise
    When finalizar a ação desejada
    Then o sistema devera retornar para a mesma função
  @15149F
  Scenario: Validar campo agendameto
    Given que acesso o "Workflow" e seleciono o módulo Histórico Analise2
    When entrar em "Histórico" as informações estarão preenchidas Analise2
    Then o campo "Data/Hora Agendamento" irá exibir as informações inseridas Analise2
  @15149G
  Scenario: Validar Envio de resposta por e-mail
    Given que acesso o "Registro de Atividade" Analise3
    When inserir um "Prestador" Analise3
    Then trará as informações do mesmo, exibindo na tela a opção de "Enviar resposta por e-mail" Analise3
    
    
     
	@15149H
  Scenario: Validar "Pesquisa de Solicitação" nos módulos
    Given que acesso algum módulo dentro de Worflow
    When realizar uma ação Registro de atividade
    And procurar um/ou inserir um Prestador
    Then irá exibir a tela de Pesquisa de Solitação

  @15149I
  Scenario: Validar grid (campo agendamento com data > hoje)
    Given que acesso Consulta Geral Analise5
    When exibir as informações na tela Analise5
    Then devera ser exibida no gride o campo Data Agendamento Analise5
  @15149J
  Scenario: Validar a remoção da ação (cancelar do grid)
    Given que acesso Consulta Geral Analisee6
    When exibir as informações na tela analisee6
    And mostrar os ícones no gride (ação) Analisee6
    Then a ação de (cancelar) não devera ser exibida Analisee6
  @15149K
  Scenario: Validar Envio de resposta por e-mail
    Given que acesso a função Registro de Atividade analise7
    When a interface exibir o grid abaixo de ocorrências da Solicitação analise7
    And exibir os botões de Salvar, Encerrar, Redirecionar e Voltar analise7
    Then o hiperlink Enviar resposta por e-mail devera estar ativo para realizar a ação analise7
	
	@15149L
  Scenario: Validar grid (campo agendamento com data > hoje)
    Given que acesso Consulta Geral analiseee
    When exibir as informações na tela analiseee
    Then devera ser exibida no gride o campo Data Agendamento analiseee
 @15149M
  Scenario: Validar Envio de resposta por e-mail
    Given que acesso a função Registro de Atividade ativdaddeee
    When a interface exibir o grid abaixo de ocorrências da Solicitação atividaddeee
    And exibir os botões de Salvar, Encerrar, Redirecionar e Voltar ativdaddeee
    Then o hiperlink Enviar resposta por e-mail devera estar ativo para realizar a ação ativdaddeee
 @15149N
  Scenario: Validar campo agendamento
    Given que acesso o modulo "Histórico" analisseeeee
    When inserir um solicitante analisseeeee
    Then o campo de "agendamento" devera ser exibido com a data/hora analisseeeee

  #Situação
  Scenario: Validar período informado no filtro registro entre/até
    Given que estou na função "Situação"
    When quando realizar uma pesquisa de solicitação
    Then a informação de "Registrada Entre" devera exibir as datas selecionadas
