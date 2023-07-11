package com.poo2023.t11.casa;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    List<Quarto> quartos;
    List<Banheiro> banheiros;
    List<Garagem> garagens;
    List<Sala> salas;
    List<Area> areas;

    public Casa() {
        this.quartos = new ArrayList<>();
        this.banheiros = new ArrayList<>();
        this.garagens = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.areas = new ArrayList<>();
    }

}
