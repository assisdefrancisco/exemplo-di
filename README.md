## Projeto aprendendo injeção de dependência(DI)

### Relatando o problema: 
Ao criar um classe que faz a Ativação do Cliente e também nessa mesma classe tem
a responsabilidade de notificar por email o cliente. E foi adicionado um nova classe
Emissao de nota fiscal do cliente onde também notificar o cliente quando a nota foi emitida. 

Temos aqui um problema que a classe AtivacaoClienteService e EmissaoNotaFiscalService
possui mais de uma responsabilidade e mesmo que separamos a Notificação de Email em
um classe como NotificadorEmail e usamos ela dentro do AtivacaoClienteService e EmissaoNotaFiscalService
ainda temos um problema de acoplamento, isso intensifica quando se recebemos uma solicitação mudando
o tipo de notificação de email para whatsapp, porque teremos que substituir onde é utilizado a 
notificação de email para whatsapp, aqui temos apenas duas funcionalidades Ativação do Cliente e Emissão
nota fiscal do cliente, mas em um sistema onde pode a ver centenas de funcionalidade para a substuição e 
detalhe se ocorre de retornar novamente para notificação por email.

Percebe os vários problemas que estão ocorrendo e o que pode a vim ocorrer.

## Solução:

Primeiro precisamos aproveita do polimorfismo com interface, criamos a interface Notificador que 
possui um método notificar com parametros cliente e mensagem.
E nas classes AtivacaoClienteService e EmissaoNotaFiscalService criamos um propriedade do tipo Notificador
que é nossa interface e criamos um construtor que tenha como parametro o tipo Notificador
Assim podemos receber as instâncias de NotificadorEmail oU NotificadorSMS. Nisso temos um baixo acoplamento e
tiramos a resposabilidade das classe AtivacaoClienteService e EmissaoNotaFiscalService de notificar o cliente
seja por email ou SMS.
