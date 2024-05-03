package com.empresa.di;

import com.empresa.di.modelo.Cliente;
import com.empresa.di.notificacao.NotificadorEmail;
import com.empresa.di.notificacao.NotificadorSMS;
import com.empresa.di.service.AtivacaoClienteService;

public class Principal {

    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joao@xyz.com", "34999998888");
        Cliente maria = new Cliente("Maria", "mariao@xyz.com", "11777772222");

        NotificadorEmail notificadorEmail = new NotificadorEmail();
        NotificadorSMS notificadorSMS = new NotificadorSMS();

        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificadorEmail);
        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);

    }
}
