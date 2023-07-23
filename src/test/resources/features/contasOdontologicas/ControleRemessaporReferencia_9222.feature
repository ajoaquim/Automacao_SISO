#Auto generated Octane revision tag
@TID9222REV0.20.0 @9222 @contasodontologicas
Feature: Manutenção Análise Remessa por Referência. Como um usuário, Devo possuir acesso para realizar Análise nas Remessa por Referência. É possível visualizar ou assumir pedidos novos ou que esteja com outro usuário. A remessa se refere apenas a um único prestador, dentro dela tem várias guias que pode conter um ou mais procedimentos. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When selecionar o menu Conta Odontológica,Análise Remessa por Referênciaa

#Remessa
	Scenario: Desbloquear uma remessa que esteja com outro usuário para análise 
		When realizar o filtro para busca da remessa para desbloqueio controle remessa por referencia
        And selecionar Atualizar para desbloqueio controle remessa por referencia
        And selecionar a remessa desejada para desbloqueio controle remessa por referencia
        And selecionar Desbloquear para desbloqueio controle remessa por referencia
        And selecionar assumir para desbloqueio controle remessa por referencia
		Then a remessa fica assumida para o usuário logado para desbloqueio controle remessa por referencia
        
    Scenario: Excluir uma guia da remessa
		When realizar o filtro para busca da remessa para excluir menu controle remessa por referencia
        And selecionar Atualizar menu controle remessa por referencia
        And selecionar a remessa desejada menu controle remessa por referencia
        And selecionar a guia (Protocoloada/processada) menu controle remessa por referencia
        And selecionar Excluir menu controle remessa por referencia
        Then a guia é excluída da remessa menu controle remessa por referencia
 
	Scenario: Validar ações próxima, anterior, ocorrências de remessas e fechar
		When realizar o filtro para busca da remessa para acoes menu validar controle remessa por referencia
        And selecionar Atualizar para acoes menu validar controle remessa por referencia
        And selecionar a remessa desejada para acoes menu validar controle remessa por referencia
        And selecionar Ocorrências da Remessa para acoes menu validar controle remessa por referencia
        And o sistema apresenta um pop-up com ocorrências para acoes menu validar controle remessa por referencia
        And selecinar Próxima para acoes menu validar controle remessa por referencia
        And o sistema passa para a remessa seguinte da fila para acoes menu validar controle remessa por referencia
        And selecinar Anterior para acoes menu validar controle remessa por referencia
        And o sistema volta para a remessa anterior da fila para acoes menu validar controle remessa por referencia
        And selecionar fechar para acoes menu validar controle remessa por referencia
        Then o sistema fecha a remessa que estava em tela e volta para a página inicial do menu Análise Remessa por Referência
   
#analisando os procedimentos dentro da guia que é dentro da remessa  
     Scenario: Validar dados de uma análise de conta
		When realizar o filtro para busca da remessa para validar dados menu Análise Remessa por Referência
        And selecionar Atualizar para validar dados menu Análise Remessa por Referência
        And selecionar a remessa desejada para validar dados menu Análise Remessa por Referência
        And selecionar a guia desejada para validar dados menu Análise Remessa por Referência
        And selecionar Alterar para validar dados menu Análise Remessa por Referência
        And validar dados da seção Encaminhamento para validar dados menu Análise Remessa por Referência
        And validar dados da seção Informações para validar dados menu Análise Remessa por Referência
        And incluir uma Observação para validar dados menu Análise Remessa por Referência
        And incluir um Anexo para validar dados menu Análise Remessa por Referência
        And validar as últimas Ocorrências realizadas para validar dados menu Análise Remessa por Referência
        Then o sistema permite Submeter a remessa com sucesso para validar dados menu Análise Remessa por Referência
            
    Scenario: Validar análise de uma conta com glosa em um ou mais procedimentos
		When realizar o filtro para busca da remessa para analise menu Análise Remessa por Referência
        And selecionar Atualizar para analise menu Análise Remessa por Referência
        And selecionar a remessa desejada para analise menu Análise Remessa por Referência
        And selecionar uma guia Processada c/ glosa para analise menu Análise Remessa por Referência
        And selecionar Alterar para analise menu Análise Remessa por Referência
        And selecinar o procedimento para analise menu Análise Remessa por Referência
        And selecionar Análise de Procedimentos para analise menu Análise Remessa por Referência
        And liberar a glosa para analise menu Análise Remessa por Referência
        And selecionar Executar para analise menu Análise Remessa por Referência
        Then o sistema permite Submeter a guia e a mesma fica com o status análisado para analise menu Análise Remessa por Referência     
        
	Scenario: Validar retorno da situação de uma guia
		When realizar o filtro para busca da remessa validar retorno menu Análise Remessa por Referência
        And selecionar Atualizar validar retorno menu Análise Remessa por Referência
        And selecionar a remessa desejada validar retorno menu Análise Remessa por Referência
        And selecionar uma guia Análisada validar retorno menu Análise Remessa por Referência
        And selecionar Alterar validar retorno menu Análise Remessa por Referência
        And selecionar Voltar situação validar retorno menu Análise Remessa por Referência
        And o status da guia volta para Processada validar retorno menu Análise Remessa por Referência
        And selecionar um Procedimento validar retorno menu Análise Remessa por Referência
        And selecionar Reprocessar validar retorno menu Análise Remessa por Referência
        Then o procedimento Reprocessado fica editável para alteração validar retorno menu Análise Remessa por Referência

	Scenario: Validar desvincular procedimentos
		When realizar o filtro para busca da remessa validar desvincular menu Análise Remessa por Referência
        And selecionar Atualizar validar desvincular menu Análise Remessa por Referência
        And selecionar a remessa desejada validar desvincular menu Análise Remessa por Referência
        And selecionar uma guia validar desvincular menu Análise Remessa por Referência
        And selecionar Alterar validar desvincular menu Análise Remessa por Referência
        And selecionar um Procedimento validar desvincular menu Análise Remessa por Referência
        And selecionar Desvincular Procedimentos validar desvincular menu Análise Remessa por Referência
        Then o procedimento não fica mais visível na tela análise da conta validar desvincular menu Análise Remessa por Referência



