package com.empresa.di.service;

import com.empresa.di.modelo.Cliente;
import com.empresa.di.modelo.Produto;
import com.empresa.di.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {

    public void emitir(Cliente cliente, Produto produto) {
        //TODO emite a nota fiscal aqui...

        NotificadorEmail notificadorEmail = new NotificadorEmail();
        notificadorEmail.notificar(cliente,
                "Nota Fiscal do produto " + produto.getNome() + " foi emitida");
    }
}
