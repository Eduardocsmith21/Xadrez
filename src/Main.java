import bordGame.Posicao;
import bordGame.Tabuleiro;

public class Main {
    public static void main(String[] args) {

        Posicao position = new Posicao(3, 5);
        Tabuleiro tabuleiro = new Tabuleiro(8,8);

        System.out.println(tabuleiro);
    }
}