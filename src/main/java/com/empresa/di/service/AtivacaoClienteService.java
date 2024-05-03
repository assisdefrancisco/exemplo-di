package com.empresa.di.service;

import com.empresa.di.modelo.Cliente;
import com.empresa.di.notificacao.Notificador;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

//        NotificadorEmail notificadorEmail = new NotificadorEmail();
//        notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo");

//        NotificadorSMS notificadorSMS = new NotificadorSMS();
//        notificadorSMS.notificar(cliente, "Seu cadastro no sistema está ativo");

        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
