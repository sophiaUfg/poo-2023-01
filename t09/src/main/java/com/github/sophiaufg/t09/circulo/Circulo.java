package com.github.sophiaufg.t09.circulo;

public class Circulo {
    double raio;
    Ponto centro;

    public Circulo(double r) {
        this.raio = r;
    }

    public void transladar(double a, double b) {
        this.centro.x = a;
        this.centro.y = b;
    }
}
