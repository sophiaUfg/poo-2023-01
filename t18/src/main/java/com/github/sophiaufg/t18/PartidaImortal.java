package com.github.sophiaufg.t18;

public class PartidaImortal {
    public static Partida partidaImortal() {
        Partida partida = new Partida();
        Competidor sophia = new Competidor("Sophia Fernandes"); // brancas
        Competidor gabriel = new Competidor("Gabriel Nery"); // pretas

        Peca peao = new Peca("Peão");
        Peca bispo = new Peca("Bispo");
        Peca rainha = new Peca("Rainha");
        Peca rei = new Peca("Rei");
        Peca cavalo = new Peca("Cavalo");
        Peca torre = new Peca("Torre");

        Posicao pos1I = new Posicao(5, 2);
        Posicao pos1F = new Posicao(5, 4);
        Jogada jogada1 = new Jogada(sophia, peao, pos1I, pos1F);
        partida.registrarJogada(jogada1);

        Posicao pos2I = new Posicao(5, 7);
        Posicao pos2F = new Posicao(5, 5);
        Jogada jogada2 = new Jogada(gabriel, peao, pos2I, pos2F);
        partida.registrarJogada(jogada2);

        Posicao pos3I = new Posicao(6, 2);
        Posicao pos3F = new Posicao(6, 4);
        Jogada jogada3 = new Jogada(sophia, peao, pos3I, pos3F);
        partida.registrarJogada(jogada3);

        Posicao pos4I = new Posicao(5, 5);
        Posicao pos4F = new Posicao(6, 4);
        Jogada jogada4 = new Jogada(gabriel, peao, pos4I, pos4F);
        partida.registrarJogada(jogada4);

        Posicao pos5I = new Posicao(6, 1);
        Posicao pos5F = new Posicao(3, 4);
        Jogada jogada5 = new Jogada(sophia, bispo, pos5I, pos5F);
        partida.registrarJogada(jogada5);

        Posicao pos6I = new Posicao(4, 8);
        Posicao pos6F = new Posicao(8, 4);
        Jogada jogada6 = new Jogada(gabriel, rainha, pos6I, pos6F);
        partida.registrarJogada(jogada6);

        Posicao pos7I = new Posicao(5, 1);
        Posicao pos7F = new Posicao(6, 1);
        Jogada jogada7 = new Jogada(sophia, rei, pos7I, pos7F);
        partida.registrarJogada(jogada7);

        Posicao pos8I = new Posicao(2, 7);
        Posicao pos8F = new Posicao(2, 5);
        Jogada jogada8 = new Jogada(gabriel, peao, pos8I, pos8F);
        partida.registrarJogada(jogada8);

        Posicao pos9I = new Posicao(3, 4);
        Posicao pos9F = new Posicao(2, 5);
        Jogada jogada9 = new Jogada(sophia, bispo, pos9I, pos9F);
        partida.registrarJogada(jogada9);

        Posicao pos10I = new Posicao(7, 8);
        Posicao pos10F = new Posicao(6, 6);
        Jogada jogada10 = new Jogada(gabriel, cavalo, pos10I, pos10F);
        partida.registrarJogada(jogada10);

        Posicao pos11I = new Posicao(7, 1);
        Posicao pos11F = new Posicao(6, 3);
        Jogada jogada11 = new Jogada(sophia, cavalo, pos11I, pos11F);
        partida.registrarJogada(jogada11);

        Posicao pos12I = new Posicao(8, 4);
        Posicao pos12F = new Posicao(8, 6);
        Jogada jogada12 = new Jogada(gabriel, rainha, pos12I, pos12F);
        partida.registrarJogada(jogada12);

        Posicao pos13I = new Posicao(4, 2);
        Posicao pos13F = new Posicao(4, 3);
        Jogada jogada13 = new Jogada(sophia, peao, pos13I, pos13F);
        partida.registrarJogada(jogada13);

        Posicao pos14I = new Posicao(6, 6);
        Posicao pos14F = new Posicao(8, 5);
        Jogada jogada14 = new Jogada(gabriel, cavalo, pos14I, pos14F);
        partida.registrarJogada(jogada14);

        Posicao pos15I = new Posicao(6, 3);
        Posicao pos15F = new Posicao(8, 4);
        Jogada jogada15 = new Jogada(sophia, cavalo, pos15I, pos15F);
        partida.registrarJogada(jogada15);

        Posicao pos16I = new Posicao(8, 6);
        Posicao pos16F = new Posicao(7, 5);
        Jogada jogada16 = new Jogada(gabriel, rainha, pos16I, pos16F);
        partida.registrarJogada(jogada16);

        Posicao pos17I = new Posicao(8, 4);
        Posicao pos17F = new Posicao(6, 5);
        Jogada jogada17 = new Jogada(sophia, cavalo, pos17I, pos17F);
        partida.registrarJogada(jogada17);

        Posicao pos18I = new Posicao(3, 7);
        Posicao pos18F = new Posicao(3, 6);
        Jogada jogada18 = new Jogada(gabriel, peao, pos18I, pos18F);
        partida.registrarJogada(jogada18);

        Posicao pos19I = new Posicao(7, 2);
        Posicao pos19F = new Posicao(7, 4);
        Jogada jogada19 = new Jogada(sophia, peao, pos19I, pos19F);
        partida.registrarJogada(jogada19);

        Posicao pos20I = new Posicao(8, 5);
        Posicao pos20F = new Posicao(6, 6);
        Jogada jogada20 = new Jogada(gabriel, cavalo, pos20I, pos20F);
        partida.registrarJogada(jogada20);

        Posicao pos21I = new Posicao(8, 1);
        Posicao pos21F = new Posicao(7, 1);
        Jogada jogada21 = new Jogada(sophia, torre, pos21I, pos21F);
        partida.registrarJogada(jogada21);

        Posicao pos22I = new Posicao(3, 6);
        Posicao pos22F = new Posicao(2, 5);
        Jogada jogada22 = new Jogada(gabriel, peao, pos22I, pos22F);
        partida.registrarJogada(jogada22);

        Posicao pos23I = new Posicao(8, 2);
        Posicao pos23F = new Posicao(8, 4);
        Jogada jogada23 = new Jogada(sophia, peao, pos23I, pos23F);
        partida.registrarJogada(jogada23);

        Posicao pos24I = new Posicao(6, 5);
        Posicao pos24F = new Posicao(6, 6);
        Jogada jogada24 = new Jogada(gabriel, rainha, pos24I, pos24F);
        partida.registrarJogada(jogada24);

        Posicao pos25I = new Posicao(8, 4);
        Posicao pos25F = new Posicao(8, 5);
        Jogada jogada25 = new Jogada(sophia, peao, pos25I, pos25F);
        partida.registrarJogada(jogada25);

        Posicao pos26I = new Posicao(6, 6);
        Posicao pos26F = new Posicao(6, 5);
        Jogada jogada26 = new Jogada(gabriel, rainha, pos26I, pos26F);
        partida.registrarJogada(jogada26);

        Posicao pos27I = new Posicao(4, 1);
        Posicao pos27F = new Posicao(6, 3);
        Jogada jogada27 = new Jogada(sophia, rainha, pos27I, pos27F);
        partida.registrarJogada(jogada27);

        Posicao pos28I = new Posicao(6, 6);
        Posicao pos28F = new Posicao(7, 8);
        Jogada jogada28 = new Jogada(gabriel, cavalo, pos28I, pos28F);
        partida.registrarJogada(jogada28);

        Posicao pos29I = new Posicao(3, 1);
        Posicao pos29F = new Posicao(6, 4);
        Jogada jogada29 = new Jogada(sophia, bispo, pos29I, pos29F);
        partida.registrarJogada(jogada29);

        Posicao pos30I = new Posicao(7, 5);
        Posicao pos30F = new Posicao(6, 6);
        Jogada jogada30 = new Jogada(gabriel, rainha, pos30I, pos30F);
        partida.registrarJogada(jogada30);

        Posicao pos31I = new Posicao(2, 1);
        Posicao pos31F = new Posicao(3, 3);
        Jogada jogada31 = new Jogada(sophia, cavalo, pos31I, pos31F);
        partida.registrarJogada(jogada31);

        Posicao pos32I = new Posicao(6, 8);
        Posicao pos32F = new Posicao(3, 5);
        Jogada jogada32 = new Jogada(gabriel, bispo, pos32I, pos32F);
        partida.registrarJogada(jogada32);

        Posicao pos33I = new Posicao(3, 3);
        Posicao pos33F = new Posicao(4, 5);
        Jogada jogada33 = new Jogada(sophia, cavalo, pos33I, pos33F);
        partida.registrarJogada(jogada33);

        Posicao pos34I = new Posicao(6, 6);
        Posicao pos34F = new Posicao(2, 2);
        Jogada jogada34 = new Jogada(gabriel, rainha, pos34I, pos34F);
        partida.registrarJogada(jogada34);

        Posicao pos35I = new Posicao(6, 4);
        Posicao pos35F = new Posicao(4, 6);
        Jogada jogada35 = new Jogada(sophia, bispo, pos35I, pos35F);
        partida.registrarJogada(jogada35);

        Posicao pos36I = new Posicao(3, 5);
        Posicao pos36F = new Posicao(7, 1);
        Jogada jogada36 = new Jogada(gabriel, bispo, pos36I, pos36F);
        partida.registrarJogada(jogada36);

        Posicao pos37I = new Posicao(5, 4);
        Posicao pos37F = new Posicao(5, 5);
        Jogada jogada37 = new Jogada(sophia, peao, pos37I, pos37F);
        partida.registrarJogada(jogada37);

        Posicao pos38I = new Posicao(2, 2);
        Posicao pos38F = new Posicao(1, 1);
        Jogada jogada38 = new Jogada(gabriel, rainha, pos38I, pos38F);
        partida.registrarJogada(jogada38);

        Posicao pos39I = new Posicao(6, 1);
        Posicao pos39F = new Posicao(5, 2);
        Jogada jogada39 = new Jogada(sophia, rei, pos39I, pos39F);
        partida.registrarJogada(jogada39);

        Posicao pos40I = new Posicao(2, 8);
        Posicao pos40F = new Posicao(1, 6);
        Jogada jogada40 = new Jogada(gabriel, cavalo, pos40I, pos40F);
        partida.registrarJogada(jogada40);

        Posicao pos41I = new Posicao(6, 5);
        Posicao pos41F = new Posicao(7, 7);
        Jogada jogada41 = new Jogada(sophia, cavalo, pos41I, pos41F);
        partida.registrarJogada(jogada41);

        Posicao pos42I = new Posicao(5, 8);
        Posicao pos42F = new Posicao(4, 8);
        Jogada jogada42 = new Jogada(gabriel, rei, pos42I, pos42F);
        partida.registrarJogada(jogada42);

        Posicao pos43I = new Posicao(6, 3);
        Posicao pos43F = new Posicao(6, 6);
        Jogada jogada43 = new Jogada(sophia, rainha, pos43I, pos43F);
        partida.registrarJogada(jogada43);
        Posicao pos44I = new Posicao(7, 8);
        Posicao pos44F = new Posicao(6, 6);
        Jogada jogada44 = new Jogada(gabriel, cavalo, pos44I, pos44F);
        partida.registrarJogada(jogada44);

        Posicao pos45I = new Posicao(4, 6);
        Posicao pos45F = new Posicao(5, 7);
        Jogada jogada45 = new Jogada(sophia, bispo, pos45I, pos45F);
        partida.registrarJogada(jogada45);

        return partida;
    }
}
