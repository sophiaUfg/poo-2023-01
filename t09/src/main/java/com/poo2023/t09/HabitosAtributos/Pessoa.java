package com.poo2023.t09.HabitosAtributos;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    String nome;
    int idade;
    List<Habito> habitos;

    public Pessoa(String n, int i) {
        this.habitos = new ArrayList<>();
        this.idade = i;
        this.nome = n;
    }
}
