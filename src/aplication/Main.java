package aplication;

import bordGame.Posicao;
import bordGame.Tabuleiro;
import xadrez.PartidaXadrez;
import aplication. *;

public class Main {
    public static void main(String[] args) {

        Posicao position = new Posicao(3, 5);
        Tabuleiro tabuleiro = new Tabuleiro(8,8);

        PartidaXadrez partida = new PartidaXadrez();
        UI.printTabuleiro(partida.getPecaXadrez());
    }
}