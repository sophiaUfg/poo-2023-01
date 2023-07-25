package com.github.sophiaufg.t09.circulo;

public class Ponto {
    double x, y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void transladar(double a, double b) {
        this.x = a;
        this.y = b;
    }

}
