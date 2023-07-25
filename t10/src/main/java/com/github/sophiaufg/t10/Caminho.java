package com.github.sophiaufg.t10;

public class Caminho {
    private double distancia;
    private String bairroInicial;
    private String bairroFinal;

    public Caminho(double d, String i, String f) {
        this.distancia = d;
        this.bairroInicial = i;
        this.bairroFinal = f;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double d) {
        this.distancia = d;
    }

    public String getBairroInicial() {
        return this.bairroInicial;
    }

    public void setBairroInicial(String bi) {
        this.bairroInicial = bi;
    }

    public String getBairroFinal() {
        return this.bairroFinal;
    }

    public void setBairroFinal(String bf) {
        this.bairroFinal = bf;
    }

}
