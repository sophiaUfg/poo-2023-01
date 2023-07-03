package com.poo2023.t09.ExemplosSimplesHeranca.Conteiners;

import java.util.ArrayList;
import java.util.List;

public class Conteiner extends Elemento {
    List<Elemento> elementos;

    public Conteiner() {
        this.elementos = new ArrayList<>();
    }
}
