#Auto generated Octane revision tag
@TID9307REV0.19.0 @9307 
Feature: Como um usuário, devo possuir acesso para realizar um redirecionamento, encerramento e registrar uma atividade em Workflow > Consulta Própria. A solicitação não poderá ser redirecionada antes da última sequência. Apenas primeiro e o último da fila poderão realizar um encerramento. As solicitações apresentadas será apenas as solicitações do próprio usuário.

  Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When acesse a aba "Workflow","Consulta Própria"
 		
 	
  Scenario: Redirecionar uma solicitação
    When informar um "Nº da Solicitação" já existenteee
    And clicar fora do campooo
    And "Redirecionar" uma Solicitaçãoo
    And "Selecionar" a áreaa
    And "Alterar" a solicitaçãooo
    And o sistema informaa "Redirecionamento da solictação realizado"
    Then a solicitação fica com status encerrado pelo solicitante
  
  Scenario: Registrar uma atividade
    When informar um Nº da Solicitação já existente consultaP
    And clicar fora do campo consultaP
    And registrar uma "Atividade" consultaP
    And "Incluir" o registro consultaP
    Then a nova atividade é registrada no grid consultaP
  
  Scenario: Encerrar uma solicitação
    When informar um Nº da Solicitação já existente consultaPP
    And clicar fora do campo consultaPP
    And "Encerrar" uma atividade consultaPP
    And "Alterar" a solicitação consultaPP
    And o sistema informa Encerramento da solictação realizado consultaPP
    Then a solicitação fica com status encerrado pelo solicitante consultaPP

  Scenario: Consultar histórico
    When informar um Nº da Solicitação já existente ccPropria
    And selecionar Histórico ccPropria
    And o dados for apresentado em tela ccPropria
    And selecionar Envio de acompanhamento de demanda ccPropria
    And selecionar a forma de retorno , <canal> e <Complemento> ccPropria
    And selecionar Executar ccPropria
    Then o Acompanhamento de demanda é enviado para o canal informado ccPropria

   
  Scenario: Geral Excel
    When informar uma solicitação já existente
    And clicar fora do campo
    And selecionar Excel
    And o Download do arquivo for realizado
    Then os dados da tela são extraídos em XML
 