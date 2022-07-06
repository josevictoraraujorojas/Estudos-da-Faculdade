package Java.Lista05;

import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        String[][] imagem = new String[6][6];

        for (int i=0;i<imagem.length;i++){
            Arrays.fill(imagem[i],".");
        }
        // +2,-2 ; +2,-2


        //linha("#",4,4,imagem);
        //coluna("#",4,4,imagem);
        //aumentando o valor modifica a diagonal para a esquerda
        //diminuindo o valor modifica a diagonal para a direita
        // a do centro ela esta em 1
        //diagonalsecundaria("#",1,imagem);
        //aumentrando o valor a diagonal vai para a direita
        //diminuindo o valor a diagonal vai para a esquerda
        //a do centreo esta em 0
       // diagonalprincipal("#",0,imagem);
        losanguloMatrizPar("#",imagem);




        imprimiMatriz(imagem);


    }

    public static void linha(String valor ,int linhasInicial,int linhaFinal,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {

                if (i<linhasInicial || i>= w.length-linhaFinal) {
                    w[i][j] = valor;
                }
            }
        }
    }
    public static void coluna(String valor ,int colunaInicial,int colunaFinal,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {

                if (j<colunaInicial || j>= w[0].length-colunaFinal) {
                    w[i][j] = valor;
                }
            }
        }
    }
    public static void diagonalsecundaria(String valor ,int coluna,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {

                if (i+j == w.length-coluna){
                    w[i][j] = valor;
                }
            }
        }
    }
    public static void diagonalprincipal(String valor ,int coluna,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {

                if (i+coluna == j) {
                    w[i][j] = valor;
                }
            }
        }
    }
    public static void losanguloMatrizPar(String valor ,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {
                //primeiro quadrante
                if (i< (w.length/2) && j<(w.length/2) && i+j==(w.length/2)-1){
                    w[i][j] = valor;
                }
                //segundo quadrante
                if (i< (w.length/2) && j>=(w.length/2) && i+(w.length/2)==j) {
                    w[i][j] = valor;
                }
                //terceiro quadrante
                if (i>= (w.length/2) && j<(w.length/2) && j+(w.length/2)==i) {
                    w[i][j] = valor;
                }
                //quarto quadrante
                if (i>=(w.length/2) && j>=(w.length/2) && i+j == (w.length/2)+w.length-1){
                    w[i][j] = valor;
                }

            }
        }
    }

    public static void imprimiMatriz(String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {

                System.out.printf("%s", x[i][j]);
            }
            System.out.println();
        }

    }

}

