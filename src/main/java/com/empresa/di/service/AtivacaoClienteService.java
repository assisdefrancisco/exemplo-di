package com.empresa.di.service;

import com.empresa.di.modelo.Cliente;
import com.empresa.di.notificacao.NotificadorEmail;
import com.empresa.di.notificacao.NotificadorSMS;

public class AtivacaoClienteService {

    public void ativar(Cliente cliente) {
        cliente.ativar();

//        NotificadorEmail notificadorEmail = new NotificadorEmail();
//        notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo");

        NotificadorSMS notificadorSMS = new NotificadorSMS();
        notificadorSMS.notificar(cliente, "Seu cadastro no sistema está ativo");

    }
}
