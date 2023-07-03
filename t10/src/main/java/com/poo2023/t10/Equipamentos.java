package com.poo2023.t10;

public class Equipamentos {
    private boolean mochila;
    private boolean sinalizacao;
    private boolean tenisEspecifico;
    private boolean trajeEspecifico;
    private boolean capacete;

    public boolean getMochila() {
        return mochila;
    }

    public void setMochila(Boolean m) {
        this.mochila = m;
    }

    public boolean getSinal() {
        return sinalizacao;
    }

    public void setSinal(Boolean s) {
        this.sinalizacao = s;
    }

    public boolean getTenis() {
        return tenisEspecifico;
    }

    public void setTenis(Boolean t) {
        this.tenisEspecifico = t;
    }

    public boolean getTrajes() {
        return trajeEspecifico;
    }

    public void setTrajes(Boolean r) {
        this.trajeEspecifico = r;
    }

    public boolean getCapacete() {
        return capacete;
    }

    public void setCapacete(Boolean c) {
        this.capacete = c;
    }
}
