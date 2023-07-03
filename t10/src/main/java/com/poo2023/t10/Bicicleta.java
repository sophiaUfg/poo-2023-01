package com.poo2023.t10;

public class Bicicleta {
    private String marca;
    private int ano;
    private double preco;
    private Ciclista dono;

    public Bicicleta(String m, int a, double p, Ciclista d) {
        this.marca = m;
        this.ano = a;
        this.preco = p;
        this.dono = d;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Ciclista getDono() {
        return this.dono;
    }

    public void setDono(Ciclista dono) {
        this.dono = dono;
    }

}
