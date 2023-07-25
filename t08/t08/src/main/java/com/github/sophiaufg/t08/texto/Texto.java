package com.github.sophiaufg.t08.texto;

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
