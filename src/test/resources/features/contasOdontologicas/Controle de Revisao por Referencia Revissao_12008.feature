#Auto generated Octane revision tag
@TID12008REV0.7.0 @12008 
Feature:Como um usuário, Devo possuir acesso para realizar Controle de Revisão por Referência. Revisão é quando o prestador entra com um recurso de Glosa, então o valor a ser pago precisa ser revisto, ou a glosa precisa ser reanalisada. Para que seja aberto um recurso de glosa é necessário que a remessa já esta com o status em enviado para pagamento ou pago. O recurso de glosa é criado em protocolo manual. 
É possível visualizar ou assumir pedidos novos ou que esteja com outro usuário. A remessa se refere apenas a um único prestador, dentro dela tem várias guias que pode conter um ou mais procedimentos. 

Background: 
    Given que acesso o sistema SISO
    When preencho o login 
    And preencho a senha
    Then o sistema apresenta a mensagem de boas vindas
    



  #Remessa
  	Scenario: Desbloquear uma remessa que esteja com outro usuário para análise 
        Given que tenha uma remessa já gerada com outro usuário Controle
		When realizar o filtro para busca da remessa Controle
        And selecionar Atualizar Controle
        And selecionar a remessa desejada Controle
        And selecinar Desbloquear Controle
        And selecionar assumir Controle
		Then a remessa fica assumida para o usuário logado Controle

    
       
    Scenario: Excluir uma guia da remessa
        Given para exclusão que tenha uma remessa já gerada
		When realizar o filtro para busca da remessa
        And selecionar Atualizar
        And selecionar a remessa desejada
        And selecionar a guia Protocoloada processada
        And EXCLUSÃO selecionar Excluir
        Then EXCLUSÃO a guia é excluída da remessa


 @12008c
	Scenario: Validar ações próxima, anterior, ocorrências de remessas e fechar

		Given 12008que tenha uma remessa já gerada
		When 12008realizar o filtro para busca da remessa
        And 12008selecionar Atualizar
        And 12008selecionar a remessa desejada 
        And 12008selecionar Ocorrências da Remessa
        And 12008o sistema apresenta um pop-up com ocorrências
        And 12008selecinar Próxima 
        And 12008o sistema passa para a remessa seguinte da fila
        And 12008selecinar Anterior 
        And 12008o sistema volta para a remessa anterior da fila
        And 12008selecionar fechar
        Then 12008o sistema fecha a remessa que estava em tela e volta para a página inicial do menu Análise Remessa por Referência

   
#analisando os procedimentos dentro da guia que é dentro da remessa  
     Scenario: Validar dados de uma análise de conta
        Given a12008que tenha uma remessa já gerada
		When a12008realizar o filtro para busca da remessa
        And a12008selecionar Atualizar
        And a12008selecionar a remessa desejada
        And a12008selecionar a guia desejada
        And a12008selecionar Alterar
        And a12008validar dados da seção Encaminhamento
        And a12008validar dados da seção Informações
        And a12008incluir um procedimento em Inclusão procedimento
        And a12008validar se o novo procedimento consta em Procedimentos
        And a12008incluir uma Observação
        And a12008incluir um Anexo
        And a12008validar as últimas Ocorrências realizadas
        Then a12008o sistema permite Submeter a remessa com sucesso
    
           
    Scenario: Validar análise de uma conta com glosa em um ou mais procedimentos
        Given b12008que tenha uma remessa já gerada
		When b12008realizar o filtro para busca da remessa
        And b12008selecionar Atualizar
        And b12008selecionar a remessa desejada
        And b12008s12008elecionar uma guia Processada c/ glosa
        And b12008 selecionar Alterar
        And b12008selecinar o procedimento
        And b12008s12008elecionar Análise de Procedimentos
        And b12008liberar a glosa
        And b12008selecionar Executar
        Then b12008o sistema permite Submeter a guia e a mesma fica com o status análisado       
        
	Scenario: Validar retorno da situação de uma guia
        Given c12008que tenha uma remessa já gerada
		When c12008realizar o filtro para busca da remessa
        And c12008selecionar Atualizar
        And c12008selecionar a remessa desejada
        And c12008selecionar uma guia Análisada 
        And c12008selecionar Alterar
        And c12008s12008elecionar Voltar situação
        And c12008o status da guia volta para Processada
        And c12008selecionar um Procedimento
        And c12008selecionar Reprocessar
        Then c12008o procedimento Reprocessado fica editável para alteração

	Scenario: Validar desvincular procedimentos
		Given d12008que tenha uma remessa já gerada
		When d12008realizar o filtro para busca da remessa
        And d12008selecionar Atualizar
        And d12008selecionar a remessa desejada
        And d12008selecionar uma guia  
        And d12008selecionar Alterar
        And d12008selecionar um Procedimento
        And d12008selecionar Desvincular Procedimentos
        Then d12008o procedimento não fica mais visível na tela análise da conta




