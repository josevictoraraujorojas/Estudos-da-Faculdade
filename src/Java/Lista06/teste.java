package Java.Lista06;

import java.util.Arrays;
import java.util.Random;

public class teste {
    public static void main(String[] args) {
        String[][] tabuleiro = criandoTabuleiro();
        int[] verificacao = new int[1];


        //
        do {
            //zera o tabuleiro caso ele passe de 9 "/"
            tabuleiro = criandoTabuleiro();

            for (int i = 0; i < 3; i++) {
                criaBarcos(tabuleiro);
            }
            tresNavios(tabuleiro,verificacao);

        }while (verificacao[0]!=1);
        imprimi(tabuleiro);


    }
    public static void tresNavios (String[][] x,int[] y){
        int count1=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i][j].equals("/")) {
                    count1++;
                }
            }
        }
        if (count1 == 9){
            y[0]=1;
        }
        }

        //cria os navios com 3 indicies de distância, fiz isso analizando as combinações possiveis
    public static void criaBarcos (String[][] x){
        Random r = new Random();
        int posssibilidadeLinha = r.nextInt( 1,7);
        int linharandom= r.nextInt(5);
        int colunarandom= r.nextInt(5);

        for (int i = 0; i < 3; i++) {
            //linha possibilidade 1
            if (posssibilidadeLinha == 1 ) {
                x[linharandom][i] = "/";
            }
            //coluna possibilidade 2
            if (posssibilidadeLinha == 2) {
                x[i][colunarandom] = "/";
            }
        }
        for (int i = 1; i < 4; i++) {
            //linha possibilidade 3
            if (posssibilidadeLinha == 3) {
                x[linharandom][i] = "/";
            }
            //coluna possibilidade 4
            if (posssibilidadeLinha == 4) {
                x[i][colunarandom] = "/";
            }
        }
        for (int i = 2; i < 5; i++) {
            //linha possibilidade 5
            if (posssibilidadeLinha == 5) {
                x[linharandom][i] = "/";
            }
            //coluna possibilidade 6
            if (posssibilidadeLinha == 6) {
                x[i][colunarandom] = "/";
            }

        }
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
