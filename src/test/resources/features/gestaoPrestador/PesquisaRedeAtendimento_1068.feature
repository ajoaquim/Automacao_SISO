#Auto generated Octane revision tag
@TID18889REV0.1.0 @1068 @SISO @gestaoPrestador @gestao-prestador
Feature:Manutenção Gestao Prestador 1068 - Pesquisa Rede Atendimento
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Pesquisa Rede Atendimento. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu Gestão Prestadores Odontológicos,Consulta Prestador,Pesquisa Rede Atendimento


	Scenario: Pesquisa Rede Atendimento na Tela
		When  informar um ou mais filtros na tela consulta rede atendimento
        And selecionar Tela em Formato de Saída
        And clicar em Continuar na tela consulta rede atendimento
		Then o sistema exibe na tela o resultado da pesquisa na tela consulta rede atendimento


	Scenario: Pesquisa Rede Atendimento no  Arquivo Gráfica 
		When  informar um ou mais filtros
        And selecionar Arquivo em Formato de Saída 
        And selecionar Grafica em Tipo Arquivo
        And clicar em Continuar na tela consulta rede atendimento
		Then o sistema gera arquivo do resultado da pesquisa na tela consulta rede atendimento


	Scenario: Pesquisa Rede Atendimento no Arquivo Texto
		When  informar um ou mais filtros
        And selecionar Arquivo em Formato de Saída 
        And selecionar Arquivo Texto em Tipo Arquivo
        And clicar em Continuar na tela consulta rede atendimento
		Then o sistema gera arquivo do resultado da pesquisa na tela consulta rede atendimento


	Scenario: Pesquisa Rede Atendimento no Email Gráfica 
		When  informar um ou mais filtros
        And selecionar Email em Formato de Saída 
        And selecionar Grafica em Tipo Arquivo
        And informar Email
        And clicar em Continuar na tela consulta rede atendimento
		Then o sistema gera arquivo do resultado da pesquisa na tela consulta rede atendimento


	Scenario: Pesquisa Rede Atendimento no Arquivo Texto
		When  informar um ou mais filtros
        And selecionar Email em Formato de Saída 
        And selecionar Texto em Tipo Arquivo
        And informar Email
        And clicar em Continuar na tela consulta rede atendimento
		Then o sistema gera arquivo do resultado da pesquisa na tela consulta rede atendimento