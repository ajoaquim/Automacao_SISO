#Auto generated Octane revision tag
@TID9507REV0.8.0 @9507 @pagamento
Feature:Manutenção Reagenda Itens por Data
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Reagenda Itens por Data
Idem a reagendamento, porém é por data. Testar pagamento vindo do módulo Contas Ondontológicas e do de Reembolso.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Pagamento,Reagenda Itens por Data

	Scenario: Efetuar  Reagendamento via Reembolso
        When opto por informar uma Operadora via Reembolso
        And opto por informar uma Operadora Origem via Reembolso
        And opto por informar a Data Prevista Original via Reembolso
        And opto por informar a Nova Data Prevista via Reembolso
        And opto em clicar em Executar via Reembolso
        Then o sistema apresenta a mensagem Operação realizada com sucesso via Reembolso
   
   Scenario: Efetuar  Reagendamento via Contas Ondontologicas
        When opto por informar uma Operadora via Contas Ondontologicas
        And opto por informar uma Operadora Origem via Contas Ondontologicas
        And opto por informar a Data Prevista Original via Contas Ondontologicas
        And opto por informar a Nova Data Prevista via Contas Ondontologicas
        And opto em clicar em Executar via Contas Ondontologicas
        Then o sistema apresenta a mensagem Operação realizada com sucesso via Contas Ondontologicas
          


        