package com.poo2023.t08.Escola;

public class Escola {
    String nome;
    int capacidadeDeAlunos;
    Endereco endereco;

    public Escola(String n, int c, Endereco e) {
        this.capacidadeDeAlunos = c;
        this.endereco = e;
        this.nome = n;
    }

}
