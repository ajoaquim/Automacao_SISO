#Auto generated Octane revision tag
@TID9236REV0.15.0 @9236 @contas
Feature:Como um usuário, Devo possuir acesso para realizar ajuste Revisão por Referência. Revisão é quando o prestador entra com um recurso de Glosa, então o valor a ser pago precisa ser revisto, ou a glosa precisa ser reanalisada. Para que seja aberto um recurso de glosa é necessário que a remessa já esta com o status em enviado para pagamento ou pago. O recurso de glosa é criado em protocolo manual. Nessa funcionalidade é possível creditar e debitar valores anteriores, para realizar essas funções é preciso que uma remessa já tenha sido paga e não tenha glosa.
    É possível visualizar ou assumir pedidos novos ou que esteja com outro usuário. A remessa se refere apenas a um único prestador, dentro dela tem várias guias que pode conter um ou mais procedimentos.

    Background:
        Given que acesso o sistema SISO
        And preencho o login e senha
        And o sistema apresenta a mensagem de boas vindas
        When selecionar rr o menu Conta Odontológica,Análise Remessa por Referência

    #Remessa
    @validado
    Scenario: Desbloquear uma remessa que esteja com outro usuário para análise
        Given que tenha uma remessa já gerada com outro usuário
        When realizar o filtro para busca da remessa rr
        And selecionar rr Atualizar rr
        And selecionar rr a remessa desejada rr
        And selecionar rr Desbloquear
        And selecionar rr assumir
        Then a remessa fica assumida para o usuário logado

    @validado
    Scenario: Excluir uma guia da remessa
        Given que tenha uma remessa já gerada rr
        When realizar o filtro para busca da remessa rr
        And selecionar rr Atualizar rr
        And selecionar rr a remessa desejada rr
        And selecionar rr a guia (Protocoloada/processada)
        And selecionar rr Excluir
        Then a guia é excluída da remessa rr

    @validado
    Scenario: Validar ações próxima, anterior, ocorrências de remessas e fechar
        Given que tenha uma remessa já gerada rr
        When realizar o filtro para busca da remessa rr
        And selecionar rr Atualizar rr
        And selecionar rr a remessa desejada rr
        And selecionar rr Ocorrências da Remessa
        And o sistema apresenta um pop-up com ocorrências
        And selecinar Próxima rr
        And o sistema passa para a remessa seguinte da fila
        And selecinar Anterior
        And o sistema volta para a remessa anterior da fila
        And selecionar rr fechar
        Then o sistema fecha a remessa que estava em tela e volta para a página inicial do menu Análise Remessa por Referência

    #analisando os procedimentos dentro da guia que é dentro da remessa
    @validado
    Scenario: Validar dados de uma análise de conta
        Given que tenha uma remessa já gerada rr
        When realizar o filtro para busca da remessa rr
        And selecionar rr Atualizar rr
        And selecionar rr a remessa desejada rr
        And selecionar rr a guia desejada
        And selecionar rr Alterar
        And validar dados da seção Encaminhamento
        And validar dados da seção Informações
        And incluir um procedimento em Inclusão procedimento
        And validar se o novo procedimento consta em Procedimentos
        And incluir uma Observação
        And incluir um Anexo
        And validar as últimas Ocorrências realizadas
        Then o sistema permite Submeter a remessa com sucesso

    @validado
    Scenario: Validar análise de uma conta com glosa em um ou mais procedimentos
        Given que tenha uma remessa já gerada rr
        When realizar o filtro para busca da remessa rr
        And selecionar rr Atualizar rr
        And selecionar rr a remessa desejada rr
        And selecionar rr uma guia Processada c/ glosa
        And selecionar rr Alterar
        And selecinar o procedimento
        And selecionar rr Análise de Procedimentos
        And liberar a glosa
        And selecionar rr Executar
        Then o sistema permite Submeter a guia e a mesma fica com o status análisado

    
    Scenario: Validar retorno da situação de uma guia
        Given que tenha uma remessa já gerada rr
        When realizar o filtro para busca da remessa rr
        And selecionar rr Atualizar rr
        And selecionar rr a remessa desejada rr
        And selecionar rr uma guia Análisada
        And selecionar rr Alterar
        And selecionar rr Voltar situação
        And o status da guia volta para Processada
        And selecionar rr um Procedimento
        And selecionar rr Reprocessar
        Then o procedimento Reprocessado fica editável para alteração

    @validado
    Scenario: Validar desvincular procedimentos
        Given que tenha uma remessa já gerada rr
        When realizar o filtro para busca da remessa rr
        And selecionar rr Atualizar rr
        And selecionar rr a remessa desejada rr
        And selecionar rr uma guia
        And selecionar rr Alterar
        And selecionar rr um Procedimento
        And selecionar rr Desvincular Procedimentos
        Then o procedimento não fica mais visível na tela análise da conta

    #movimento de acerto
    @validado
    Scenario: Creditar um valor em uma remessa (Revisar cenários ao testar no momento da escrita essa funcionalidade não estava funcionando)
        Given que tenha uma remessa já gerada rr com o recurso de glosa já gerado
        When realizar o filtro para busca da remessa rr
        And selecionar rr Atualizar rr
        And selecionar rr uma guia
        And selecionar rr Alterar
        And selecionar rr um Procedimento
        And na coluna Crédito informar o valor a ser creditado
        Then é possível finalizar a remessa com sucesso


    @doing9236
    Scenario: Debitar um valor de uma remessa (Revisar cenários ao testar no momento da escrita essa funcionalidade não estava funcionando)
        Given que tenha uma remessa já gerada rr com o recurso de glosa já gerado
        When realizar o filtro para busca da remessa rr
        And selecionar rr Atualizar rr
        And selecionar rr uma guia
        And selecionar rr Alterar
        And selecionar rr um Procedimento
        And inseiri uma glosa para debitar o valor
        Then é possível finalizar a remessa com sucesso

