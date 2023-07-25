package com.github.sophiaufg.t08.texto;

import java.util.ArrayList;
import java.util.List;

public class Paragrafo {
    String paragrafo;
    List<Sentenca> sentencas;

    public Paragrafo(String paragrafo) {
        this.sentencas = new ArrayList<>();
    }

    public void formarParagrafo(Sentenca sentenca) {
        this.sentencas.add(sentenca);
    }
}
