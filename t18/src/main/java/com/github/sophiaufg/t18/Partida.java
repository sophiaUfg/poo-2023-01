package com.github.sophiaufg.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private List<Jogada> jogadas;

    public Partida() {
        this.jogadas = new ArrayList<>();
    }

    public void registrarJogada(Jogada jogada) {
        jogadas.add(jogada);
    }

    public List<Jogada> getJogadas() {
        return jogadas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Jogada jogada : jogadas) {
            sb.append(jogada).append("\n");
        }
        return sb.toString();
    }
}
