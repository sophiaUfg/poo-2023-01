package com.poo2023.t08.Texto;

import java.util.ArrayList;
import java.util.List;

public class Texto {
    String texto;
    List<Paragrafo> paragrafos;

    public Texto(String texto) {
        this.texto = texto;
        this.paragrafos = new ArrayList<>();
    }

    public void formarParagrafo(Paragrafo paragrafo) {
        this.paragrafos.add(paragrafo);
    }
}
