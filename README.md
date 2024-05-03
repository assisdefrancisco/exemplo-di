## Projeto aprendendo injeção de dependência(DI)

### Relatando o problema: 
Ao criar um classe que faz a Ativação do Cliente e também nessa mesma classe tem
a responsabilidade de notificar por email o cliente. E foi adicionado um nova classe
Emissao de nota fiscal do cliente onde também notificar o cliente quando a nota foi
é emitida. Temos aqui um problema que a classe AtivacaoClienteService e EmissaoNotaFiscalService
possui mais de uma responsabilidade e mesmo que separamos a Notificação de Email em
um classe como NotificadorEmail e suamos ela dentro do AtivacaoClienteService e EmissaoNotaFiscalService
ainda temos um problema de acoplamento, isso intensifica quando se recebemos uma solicitação mudando
o tipo de notificação de email para whatsapp, porque teremos que substituir onde é utilizado a 
notificação de email para whatsapp.

## Solução:
