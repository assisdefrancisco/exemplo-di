package com.empresa.di.notificacao;

import com.empresa.di.modelo.Cliente;

public class NotificadorSMS {

    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: \n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
