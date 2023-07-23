#Auto generated Octane revision tag
@TID12005REV0.14.0
Feature: Manutenção Análise Remessa por Referência. Como um usuário, Devo possuir acesso para realizar Análise nas Remessa por Referência. Para realizar o teste é necessário ter uma remessa já gerada no módulo Geração de Remessa. Guias vindas do Portal Prestador cai direto nesse módulo, guias vinda do módulo de autorização é preciso inserir a data de realização do procedimento em confirmação de execução. É possível visualizar ou assumir pedidos novos ou que esteja com outro usuário. A remessa se refere apenas a um único prestador, dentro dela tem várias guias que pode conter um ou mais procedimentos. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When selecionar o menu "Conta Odontológica","Análise Remessa por Referência"
    And selecionar "Inicia Análise"
    
#Consulta 
   Scenario: Validar consulta de remessa 
		When selecionar "Consultar remessa" da remessa desejada
        And selecionar uma "guia" 
        And selecionar Ocorrências da Remessa
        And o sistema apresenta um pop-up com ocorrências
        And selecionar "Consultar"
        Then o sistema abre a "guia" para consulta 
   

#analisando os procedimentos dentro da guia que é dentro da remessa   
Scenario: Validar ações próxima, anterior, ocorrências de remessas e fechar
		Given que tenha uma remessa já gerada
		When selecionar "Assumir Remessa" da remessa desejada
        And selecionar a "guia" 
        And selecionar "alterar"
        And selecionar Ocorrências da Remessa
        And o sistema apresenta um pop-up com ocorrências
        And selecinar "Próxima" 
        And o sistema passa para a remessa seguinte da fila
        And selecinar "Anterior" 
        And o sistema volta para a remessa anterior da fila
        And selecionar "fechar"
        Then o sistema fecha a remessa que estava em tela e volta para a página inicial do menu "Análise Remessa por Referência"
   
     Scenario: Validar dados de uma análise de conta
        Given que tenha uma remessa já gerada
		When selecionar "Assumir Remessa" da remessa desejada
        And selecionar a "guia" 
        And selecionar "alterar"
        And selecionar a "guia" desejada
        And selecionar "Alterar"
        And validar dados da seção "Encaminhamento"
        And validar dados da seção "Informações"
        And incluir uma "Observação"
        And incluir um "Anexo"
        And validar as últimas "Ocorrências" realizadas
        Then o sistema permite Submeter a remessa com sucesso
        
    Scenario: Validar análise de uma conta com glosa em um ou mais procedimentos
        Given que tenha uma remessa já gerada
		When selecionar "Assumir Remessa" da remessa desejada
        And selecionar a "guia" processada c/ glosa
        And selecionar "Alterar"
        And selecinar o procedimento
        And selecionar "Análise de Procedimentos"
        And liberar a glosa
        And selecionar "Executar"
        Then o sistema permite "Submeter" a guia e a mesma fica com o status análisado       
        
	Scenario: Validar desvincular procedimentos
		Given que tenha uma remessa já gerada
		When realizar o filtro para busca da remessa
        And selecionar "Atualizar"
        And selecionar a "remessa" desejada
        And selecionar uma "guia"  
        And selecionar "Alterar"
        And selecionar um "Procedimento"
        And selecionar "Desvincular Procedimentos"
        Then o procedimento não fica mais visível na tela análise da conta
