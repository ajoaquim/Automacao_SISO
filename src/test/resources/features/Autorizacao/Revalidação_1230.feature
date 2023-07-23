#Auto generated Octane revision tag
@TID1230REV0.10.0 @1230 @SISO @autorizacao
Feature:Manutenção Revalidação
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Revalidação. 

Background:
  Given que acesse o sistema Odonto
  And preencho usuário e senha
  And acesse a aba de Pedido de Autorização e Revalidação

	Scenario: Efetuar a revalidação de uma Guia Autorizada
        When  informar um pedido que foi autorizado
        And alterar o "Periodo de Validade"
        And clicar no botão Validar
        And clicar em "ok" na mensagem de confirmação
        Then o sistema apresenta a mensagem de revalidação do pedido realizada
        
  
    

        