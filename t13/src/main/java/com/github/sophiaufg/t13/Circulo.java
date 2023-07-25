package com.github.sophiaufg.t13;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double calculaArea() {
        return Math.PI * raio * raio;
    }

    public double calculaCircunferencia() {
        return 2 * Math.PI * raio;
    }
}
