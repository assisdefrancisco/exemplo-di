package com.empresa.di.service;

import com.empresa.di.modelo.Cliente;
import com.empresa.di.modelo.Produto;
import com.empresa.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        //TODO emite a nota fiscal aqui...

//        NotificadorEmail notificadorEmail = new NotificadorEmail();
//        notificadorEmail.notificar(cliente,
//                "Nota Fiscal do produto " + produto.getNome() + " foi emitida");

//        NotificadorSMS notificadorSMS = new NotificadorSMS();
//        notificadorSMS.notificar(cliente,
//                "Nota Fiscal do produto " + produto.getNome() + " foi emitida");

        this.notificador.notificar(cliente,
                "Nota Fiscal do produto " + produto.getNome() + " foi emitida");

    }
}
