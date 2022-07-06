package Java.Lista05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int respostaLinha;
        int respostaColuna;
        String resposta;

        System.out.println("informe quantas linhas e colunas tem sua matriz,o numero de coluna tem que ser igual a o de linhas");
        respostaLinha= ler.nextInt();
        respostaColuna= ler.nextInt();
        while (respostaColuna!=respostaLinha){
            System.out.println("resposta invalida informe o mesmo tanto de coluna e linha");
            respostaLinha= ler.nextInt();
            respostaColuna= ler.nextInt();
        }

        String[][] imagem = new String[respostaLinha][respostaColuna];
        for (int i=0;i<imagem.length;i++){
            Arrays.fill(imagem[i]," ");
        }
        while (true) {

            System.out.println("O que voce quer desenhar na sua matriz");
            System.out.println("a) linha ");
            System.out.println("b) coluna");
            System.out.println("c) diagonal principal");
            System.out.println("d) diagonal secundaria");
            System.out.println("e) losango");
            System.out.println("f) sair do programa");
            System.out.println("informe sua resposta");
            resposta= ler.next();

            switch (resposta) {
                case "a" -> {
                    int linhaInicial;
                    int linhaFinal;
                    System.out.println("informe quantidade de linhas iniciais e a quantidades de linhas finais ira ocupar com '#' no seu vetor");
                    linhaInicial = ler.nextInt();
                    linhaFinal = ler.nextInt();
                    linha("#", linhaInicial, linhaFinal, imagem);
                    imprimiMatriz(imagem);
                }
                case "b" -> {
                    int colunaInicial;
                    int colunaFinal;
                    System.out.println("informe quantidade de colunas iniciais e a quantidades de colunas finais ira ser ocupar com '#' no seu vetor");
                    colunaInicial = ler.nextInt();
                    colunaFinal = ler.nextInt();
                    coluna("#", colunaInicial, colunaFinal, imagem);
                    imprimiMatriz(imagem);
                }
                case "c" -> {
                    int cordenadaDiagonalPrincipal;
                    System.out.println("informe a cordenada da sua diagonal principal que ira ser ocupada com '#' ");
                    System.out.println("para ela ficar centralizada na matriz inici com o valor 0");
                    System.out.println("aumentando o valor a diagonal vai para a direita");
                    System.out.println("diminuindo o valor ela vai para a esquerda");
                    System.out.println("informe:");
                    cordenadaDiagonalPrincipal = ler.nextInt();
                    diagonalprincipal("#", cordenadaDiagonalPrincipal, imagem);
                    imprimiMatriz(imagem);
                }
                case "d" -> {
                    int cordenadaDiagonalSecundaria;
                    System.out.println("informe a cordenada da sua diagonal secundaria que ira ser ocupada com '#' ");
                    System.out.println("para ela ficar centralizada na matriz inici com o valor 1");
                    System.out.println("aumentando o valor a diagonal vai para a esquerda");
                    System.out.println("diminuindo o valor ela vai para a direita");
                    System.out.println("informe:");
                    cordenadaDiagonalSecundaria = ler.nextInt();
                    diagonalsecundaria("#", cordenadaDiagonalSecundaria, imagem);
                    imprimiMatriz(imagem);
                }
                case "e" -> {
                    System.out.println("faremos uma losango perfeito com '#' ");
                    if (imagem.length % 2 == 0) {
                        losangoMatrizPar("#", imagem);
                        imprimiMatriz(imagem);
                    } else {
                        losangoMatrizPrimo("#", imagem);
                        imprimiMatriz(imagem);
                    }
                }
                case "f" -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }

        }




        //linha("#",4,4,imagem);
        //coluna("#",4,4,imagem);
        //aumentando o valor modifica a diagonal para a esquerda
        //diminuindo o valor modifica a diagonal para a direita
        // a do centro ela esta em 1
        //diagonalsecundaria("#",1,imagem);
        //aumentrando o valor a diagonal vai para a direita
        //diminuindo o valor a diagonal vai para a esquerda
        //a do centreo esta em 0
        //diagonalprincipal("#",0,imagem);
        //losangoMatrizPar("#",imagem);
        //losangoMatrizPrimo("#",imagem);






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
    public static void losangoMatrizPar(String valor ,String[][] w) {
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
    public static void losangoMatrizPrimo(String valor ,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {
                //primeiro quadrante
                if (i<= (w.length/2) && j<=(w.length/2) && i+j==(w.length/2)){
                    w[i][j] = valor;
                }
                //segundo quadrante
                if (i<= (w.length/2) && j>=(w.length/2) && i+(w.length/2)==j) {
                    w[i][j] = valor;
                }
                //terceiro quadrante
                if (i>= (w.length/2) && j<=(w.length/2) && j+(w.length/2)==i) {
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

