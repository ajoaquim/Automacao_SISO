#Auto generated Octane revision tag
@TID15144REV0.4.0 @autorizacao
Feature: Validar serviço do SAC 89381
Como usuário devo ter acesso a um celulare a URA

	Scenario: Validar envio de Rede via SMS
		Given que envie um número de CEP para o telefone 2656
		When o Zenvia receber a informação 
		Then é retornado para o número de telefone dados de 4 prestadores
