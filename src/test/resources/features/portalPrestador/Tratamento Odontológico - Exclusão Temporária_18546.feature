#Auto generated Octane revision tag
@TID18546REV0.6.0
Feature: Validar regra de negócio Exclusão Temporaria. De acordo com o procedimento é necessário um período mínimo para realizar outro procedimento para a mesma região. 
Será necessário incluir uma guia com os procedimentos que gere uma exclusão temporária e os procedimentos deverão ter data de realização para que a guia fique atreladas a contas.  Planilha em anexo para validação. Para inclusão de um tratamento é necessário ter um beneficiário ativo com cobertura para o procedimento a ser realizado.


Retratamento Endodontico Multirradicular - o beneficiário deverá ter no histório de atendimento um ou mais do procedimentos contido na planilha.
Radiografia Periapical - o beneficiário deverá ter no histório de atendimento um ou mais do procedimentos contido na planilha.
Exodontia Simples de Permanente - o beneficiário deverá ter no histório de atendimento um ou mais do procedimentos contido na planilha.

Context:
  Given que acesse o Portal Prestador
  And preencho usuário e senha
  And acesse o menu "Tratamento Odontológico"

Scenario: Tratamento Retratamento Endodontico Multirradicular
        When informar um "beneficiário"
	    And adicionar um "novo tratamento"
        And preencher os "Dados do Profissional"
        And informar "Retratamento Endodontico Multirradicular"
        And escolher o mesmo dente ou região dos procedimentos anteriores
        Then o procedimento solicitado será glosado
        
Scenario: Tratamento Radiografia Periapical 
        When informar um "beneficiário"
	    And adicionar um "novo tratamento"
        And preencher os "Dados do Profissional"
        And informar "Radiografia Periapical"
        And escolher o mesmo dente ou região dos procedimentos anteriores
        Then o procedimento solicitado será glosado   
        
Scenario: Tratamento Exodontia Simples de Permanente
        When informar um "beneficiário"
	    And adicionar um "novo tratamento"
        And preencher os "Dados do Profissional"
        And informar "Exodontia Simples de Permanente" 
        And escolher o mesmo dente ou região dos procedimentos anteriores
        Then o procedimento solicitado será glosado    