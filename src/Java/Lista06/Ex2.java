package Java.Lista06;


import java.util.Arrays;
import java.util.Random;

public class Ex2 {

    public static void main(String[] args) {
        String[][] tabuleiro = criandoTabuleiro();
        String[] navio = new String[3];

        String[][] o = criandoTabuleiro();

        posicionandoNavios(tabuleiro,navio);

        imprimi(tabuleiro);
        System.out.println();
        imprimi(o);




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
    public static boolean tresNavios (String[][] x){
        int count1=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i][j].equals("/")) {
                    count1++;
                }

            }
        }
        return count1 == 9;
    }
    public static void posicionandoNavios(String[][] x,String[] y){
        Random aleatorio = new Random();
        while (!tresNavios(x)) {
            x[aleatorio.nextInt(5)][aleatorio.nextInt(5)]="/";
        }
    }
}
