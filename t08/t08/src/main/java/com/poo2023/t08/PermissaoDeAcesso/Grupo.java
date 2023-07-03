package com.poo2023.t08.PermissaoDeAcesso;

import java.util.List;
import java.util.ArrayList;

public class Grupo {
    List<Usuario> usuarios;
    List<Permissao> permissoes;

    public Grupo() {
        this.usuarios = new ArrayList<>();
        this.permissoes = new ArrayList<>();
    }
}
