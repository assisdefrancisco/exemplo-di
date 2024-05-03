package com.empresa.di.notificacao;

import com.empresa.di.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
}
