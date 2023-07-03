package com.poo2023.t09.Cliente;

public class Transacao {
    Cliente cliente;
    Fornecedor fornecedor;

    public Transacao(Cliente cliente, Fornecedor fornecedor) {
        this.cliente = cliente;
        this.fornecedor = fornecedor;
    }
}
