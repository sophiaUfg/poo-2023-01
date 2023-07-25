package com.github.sophiaufg.t10;

import java.util.ArrayList;
import java.util.List;

public class Ciclista {
    private String nome;
    private String cpf;
    private String telefone;
    private int idade;
    List<Bicicleta> bicicletas;
    List<Equipamentos> equipamentos;

    public Ciclista(String n, String cpf, String tel) {
        this.nome = n;
        this.cpf = cpf;
        this.telefone = tel;
        this.bicicletas = new ArrayList<Bicicleta>();
        this.equipamentos = new ArrayList<Equipamentos>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String tel) {
        this.telefone = tel;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

}
