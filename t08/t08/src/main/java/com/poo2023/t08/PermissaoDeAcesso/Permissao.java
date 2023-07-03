package com.poo2023.t08.PermissaoDeAcesso;

public class Permissao {
    Grupo grupo;
    Arquivo arquivo;

    public Permissao(Grupo g, Arquivo a) {
        this.grupo = g;
        this.arquivo = a;
    }
}
