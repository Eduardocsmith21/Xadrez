package aplication;

import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;

public class UI {

    public static void printTabuleiro(PecaXadrez[][] pecas){

        for (int i = 0; i < pecas.length; i++){
            System.out.print(8 - i + " ");
            for (int j = 0; j < pecas.length; j++){
                printPeca(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println(" a b c d e f g h");
    }

    //Imprimindo uma única peça
    private static  void printPeca(PecaXadrez peca){
        if(peca == null){
            System.out.print("-");
        }
        else {
            System.out.print(peca);
        }
        System.out.print(" ");
    }
}
