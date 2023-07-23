#Auto generated Octane revision tag
@TID16097REV0.8.0
Feature: Validar funcionalidade Chatna área logada e deslogada, para executar essa funcionalidade será necessário que o serviço já esteja funcionando.


	Scenario: Validar funcionalidade Chat logado
        Given dados que esteja logado no Portal do Prestador
		When iniciar uma conversa pelo Chat
		Then o sistema permite troca de mesnagen até a finalização da conversa
        
    Scenario: Validar funcionalidade Chat deslogado
        Given dados que esteja no Portal do Prestador
        When informar os dados solicitados
		And iniciar uma conversa pelo Chat
		Then o sistema permite troca de mesnagen até a finalização da conversa
       
       
       