package com.poo2023.t08.Pais;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    String nome;
    List<Cidade> cidades;
    Cidade capital;

    public Pais(String nome, Cidade capital) {
        this.nome = nome;
        this.capital = capital;
        this.cidades = new ArrayList<>();
    }
}
