package com.github.sophiaufg.t18;

public class Jogada {
    private Competidor competidorAtual;
    private Peca pecaMovida;
    private Posicao posicaoInicial;
    private Posicao posicaoFinal;

    public Jogada(Competidor competidorAtual, Peca pecaMexida, Posicao posicaoInicial, Posicao posicaoFinal) {
        this.competidorAtual = competidorAtual;
        this.pecaMovida = pecaMexida;
        this.posicaoInicial = posicaoInicial;
        this.posicaoFinal = posicaoFinal;
    }

    public Competidor getCompetiorAtual() {
        return competidorAtual;
    }

    public Peca getPecaMovida() {
        return pecaMovida;
    }

    public Posicao getPosicaoInicial() {
        return posicaoInicial;
    }

    public Posicao getPosicaoFinal() {
        return posicaoFinal;
    }

    @Override
    public String toString() {
        return competidorAtual.getNome() + " moveu " + pecaMovida.getNome() + " de " +
                posicaoInicial + " para " + posicaoFinal;
    }
}
