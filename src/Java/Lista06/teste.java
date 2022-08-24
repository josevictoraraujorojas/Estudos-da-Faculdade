package Java.Lista06;

import java.util.Arrays;
import java.util.Random;

public class teste {
    public static void main(String[] args) {
        String[][] tabuleiro = criandoTabuleiro();

        Random aleatorio = new Random();

        int linha = aleatorio.nextInt(1, 4);


            int linha1= aleatorio.nextInt(0,5);

            if (linha == 1) {
                tabuleiro[linha1][0] = "/";
                tabuleiro[linha1][1] = "/";
                tabuleiro[linha1][2] = "/";
            }
             else if (linha == 2) {
                tabuleiro[linha1][1] = "/";
                tabuleiro[linha1][2] = "/";
                tabuleiro[linha1][3] = "/";
            }
            else if (linha == 3) {
                tabuleiro[linha1][2] = "/";
                tabuleiro[linha1][3] = "/";
                tabuleiro[linha1][4] = "/";
            }
        imprimi(tabuleiro);
    }

    public static boolean tresNavios (String[][] x){
        int count1=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i][j].equals("/")) {
                    count1++;
                }

            }
        }
        return count1 == 3;
    }
    public static String[][] criandoTabuleiro(){
        String[][] tabuleiro = new String[5][5];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(tabuleiro[i],"-");
        }
        return tabuleiro;
    }
    public static void imprimi(String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%s\t", x[i][j]);
            }
            System.out.println();
        }
    }
}
