#Auto generated Octane revision tag
@TID1259REV0.35.0 @1259 @autorizacao
Feature: Manutenção Inclusão
	Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Inclusão.

	Background:
		Given  que acesse o sistema Odonto
		And  preencho usuário e senha
		And  acesse a aba Autorização/Pedido de Autorização/Inclusão.

	#Ativo
	@inclusao @validado-1259 @massa-de-dados
	Scenario: Efetuar a inclusão Titular com encaminhamento
		When   informar um Beneficiário que esteja Ativo e Titular
		And  selecionar Atendimento com Encaminhamento
		And  clicar em Adicionar Encaminhamento
		And  Adicionar os dados do encaminhamento
		And  clicar no botão F5 - Confirmar Encaminhamento
		And  informar Contrato Executante
		And  clicar em Adicionar Procedimento
		And  Adicionar os dados do Procedimento
		And  Adicionar Observações
		And  clicar no botão F2 - Analise/Inclusão
		Then  o sistema apresenta a mensagem Atenção: Pedido nº 'num pedido' incluido. inc
		


	@inclusao @validado-1259
	Scenario: Efetuar a inclusão Dependente sem encaminhamento
		When   informar um Beneficiário que esteja e Ativo e Dependente
		And  selecionar Atendimento sem Encaminhamento
		And  informar Contrato Executante
		And  clicar em Adicionar Procedimento
		And  Adicionar os dados do Procedimento
		And  Adicionar Observações
		And  clicar no botão F2 - Analise/Inclusão
		Then  o sistema apresenta a mensagem Atenção: Pedido nº 'num pedido' incluido. inc

	#Excluido
	@inclusao @validado-1259
	Scenario: Efetuar a inclusão Titular com encaminhamento
		When   informar um Beneficiário que esteja Excluido e Titular
		And  selecionar Atendimento com Encaminhamento
		And  clicar em Adicionar Encaminhamento
		And  Adicionar os dados do encaminhamento
		And  clicar no botão F5 - Confirmar Encaminhamento
		And  informar Contrato Executante
		And  clicar em Adicionar Procedimento
		And  Adicionar os dados do Procedimento
		And  Adicionar Observações
		And  clicar no botão F2 - Analise/Inclusão
		And  o sistema apresenta a mensagem Atenção: Pedido nº 'num pedido' incluido.
		And  clicar no botão Criticas Encontradas no pedido
		And  selecionar critica
		And  Clicar no botão F5 - Executar
		Then  o sistema apresentaa mensagem Atenção: Operação realizada com sucesso

	@inclusao @validado-1259
	Scenario: Efetuar a inclusão Agregado sem encaminhamento
		When   informar um Beneficiário que esteja e Excluido e Agregado
		And  selecionar Atendimento sem Encaminhamento
		And  informar Contrato Executante
		And  clicar em Adicionar Procedimento
		And  Adicionar os dados do Procedimento
		And  Adicionar Observações
		And  clicar no botão F2 - Analise/Inclusão
		And  o sistema apresenta a mensagem Atenção: Pedido nº 'num pedido' incluido.
		And  clicar no botão Criticas Encontradas no pedido
		And  selecionar critica
		And  Clicar no botão F5 - Executar
		Then  o sistema apresentaa mensagem Atenção: Operação realizada com sucesso

	#Suspenso
	@inclusao @validado-1259
	Scenario: Efetuar a inclusão Titular com encaminhamento
		When    informar um Beneficiário que esteja Suspenso e Titular
		And   selecionar Atendimento com Encaminhamento
		And   clicar em Adicionar Encaminhamento
		And   Adicionar os dados do encaminhamento
		And   clicar no botão F5 - Confirmar Encaminhamento
		And   informar Contrato Executante
		And   clicar em Adicionar Procedimento
		And   Adicionar os dados do Procedimento
		And   Adicionar Observações
		And   clicar no botão F2 - Analise/Inclusão
		And   o sistema apresenta a mensagem Atenção: Pedido nº 'num pedido' incluido.
		And   clicar no botão Criticas Encontradas no pedido
		And   selecionar critica
		And   Clicar no botão F5 - Executar
		Then   o sistema apresentaa mensagem Atenção: Operação realizada com sucesso

	@inclusao @validado-1259
	Scenario: Efetuar a inclusão Dependente com encaminhamento
		When    informar um Beneficiário que esteja Suspenso e Dependente
		And   selecionar Atendimento sem Encaminhamento
		And   informar Contrato Executante
		And   clicar em Adicionar Procedimento
		And   Adicionar os dados do Procedimento
		And   Adicionar Observações
		And   clicar no botão F2 - Analise/Inclusão
		And   o sistema apresenta a mensagem Atenção: Pedido nº 'num pedido' incluido.
		And   clicar no botão Criticas Encontradas no pedido
		And   selecionar critica
		And   Clicar no botão F5 - Executar
		Then   o sistema apresentaa mensagem Atenção: Operação realizada com sucesso

	#Inativo
	@inclusao @validado-1259
	Scenario: Efetuar a inclusão Titular com encaminhamento
		When    informar um Beneficiário que esteja Inativo e Titular
		And   selecionar Atendimento com Encaminhamento
		And   clicar em Adicionar Encaminhamento
		And   Adicionar os dados do encaminhamento
		And   clicar no botão F5 - Confirmar Encaminhamento
		And   informar Contrato Executante
		And   clicar em Adicionar Procedimento
		And   Adicionar os dados do Procedimento
		And   Adicionar Observações
		And   clicar no botão F2 - Analise/Inclusão
		Then   o sistema apresenta a mensagem Atenção: Pedido nº 'num pedido' incluido. inc

	@inclusao @validado-1259
	Scenario: Efetuar a inclusão Agregado com encaminhamento
		When     informar um Beneficiário que esteja Inativo e Agregado
		And    selecionar Atendimento sem Encaminhamento
		And    informar Contrato Executante
		And    clicar em Adicionar Procedimento
		And    Adicionar os dados do Procedimento
		And    Adicionar Observações
		And    clicar no botão F2 - Analise/Inclusão
		Then    o sistema apresenta a mensagem Atenção: Pedido nº 'num pedido' incluido. inc

	#Demais funcionalidade da tela
	@outras @validado-1259
	Scenario: Buscar prestador por nome
		Given    que se está com usuario selecionado
		When    optar por pesquisar prestador pelo nome
		And    digitar o nome do prestador no campos
		And    clicar no Icone Buscar prestador por nome
		Then    o sistema carrega os dados do prestador
	@outras @validado-1259
	Scenario: Buscar dados do prestador
		Given    que se está com usuario selecionado
		When    selecionar um prestador
		And    clicar no em Consultar dados do Prestador
		Then    o sistema exibi a tela com os dados do prestador

	@outras @validado-1259
	Scenario: Abrir autorização previa
		Given    que se está com usuario selecionado
		When    optar por clicar no em Autorização Previa
		And    o sistema mostar a tela de autorização
		And    clicar no Icone executar
		Then    o sistema deve mostrar nº da autorização

	@outras @validado-1259
	Scenario: Buscar dados do beneficiario
		Given    que se está com usuario selecionado
		When    optar por clicar no em Buscar dados do beneficiario
		Then    o sistema exibi a tela com os dados do beneficiario

	@outras @validado-1259
	Scenario: Abrir contatos do beneficiario
		Given    que se está com usuario selecionado
		When    optar por clicar no em Abrir contato do beneficiario
		Then    o sistema exibi a tela com os contatos do beneficiario

	@outras @validado-1259
	Scenario: Excluir Encaminhamento
		Given    que se tem um ou mais encaminhamenos inseridos
		When    clicar no botao exluir encaminhamento
		And    o sitema apresenta a mensagem Deseja realmente Excluir?
		And    clicar no botão ok inc
		Then    o sistema remove o encaminhamento do pedido