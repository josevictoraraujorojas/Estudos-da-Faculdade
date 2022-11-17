package Java.PrimeiroPeriodo.ArrayBidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

//        Questão 11 Você sabia que uma imagem é uma matriz de zeros e uns?  Assista o vídeo https://www.youtube.com/watch?v= para entender o conceito.
//        Crie um programa que a partir de uma função matemática preencha com 0 e 1 uma matriz para  formar  uma  imagem.
//        Verifique  qual  o  tamanho  máximo  que é  possível  imprimir  na  tela  do  seu  computador (faça  testes).
//        A  sugestão é  tentar  o  básico:  esfera,  contador,  quadrado,  donut,  função  seno,  cosseno,  tangente...  Utilize  o Youtube a seu favor.
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
            Arrays.fill(imagem[i],".");
        }

        while (true) {

            System.out.println("O que voce quer desenhar na sua matriz");
            System.out.println("1) linha ");
            System.out.println("2) coluna");
            System.out.println("3) diagonal principal");
            System.out.println("4) diagonal secundaria");
            System.out.println("5) losango");
            System.out.println("6) linha centro");
            System.out.println("7) coluna centro");
            System.out.println("8) reinicia matriz");
            System.out.println("9) fecha programa");

            System.out.println("informe sua resposta");
            resposta= ler.next();

            switch (resposta) {
                case "1" -> {
                    int linhaInicial;
                    int linhaFinal;
                    System.out.println("informe quantidade de linhas iniciais e a quantidades de linhas finais ira ocupar com '#' no seu vetor");
                    linhaInicial = ler.nextInt();
                    linhaFinal = ler.nextInt();
                    linha("#", linhaInicial, linhaFinal, imagem);
                    imprimiMatriz(imagem);
                }
                case "2" -> {
                    int colunaInicial;
                    int colunaFinal;
                    System.out.println("informe quantidade de colunas iniciais e a quantidades de colunas finais ira ser ocupar com '#' no seu vetor");
                    colunaInicial = ler.nextInt();
                    colunaFinal = ler.nextInt();
                    coluna("#", colunaInicial, colunaFinal, imagem);
                    imprimiMatriz(imagem);
                }
                case "3" -> {
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
                case "4" -> {
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
                case "5" -> {
                    System.out.println("faremos uma losango perfeito com '#' ");
                    if (imagem.length % 2 == 0) {
                        losangoMatrizPar("#", imagem);
                        imprimiMatriz(imagem);
                    } else {
                        losangoMatrizImpar("#", imagem);
                        imprimiMatriz(imagem);
                    }
                }
                case "6" ->{
                    System.out.println("faremos uma linha dividindo a matriz no meio '#' ");
                    if (imagem.length % 2 == 0) {
                        linhaCentroPar("#", imagem);
                        imprimiMatriz(imagem);
                    } else {
                        linhaCentroImpar("#", imagem);
                        imprimiMatriz(imagem);
                    }

                }
                case "7" ->{
                    System.out.println("faremos uma coluna dividindo a matriz no meio '#' ");
                    if (imagem.length % 2 == 0) {
                        colunaCentroPar("#", imagem);
                        imprimiMatriz(imagem);
                    } else {
                        colunaCentroImpar("#", imagem);
                        imprimiMatriz(imagem);
                    }

                }
                case "8" -> {
                    System.out.println("desenho apagado");
                    for (int i=0;i<imagem.length;i++){
                        Arrays.fill(imagem[i],".");
                    }
                    imprimiMatriz(imagem);
                }
                case "9" -> {
                    System.out.println("Fechando programa");
                    System.exit(0);
                }

                default -> System.out.println("Op��o inv�lida!");
            }

        }
    }

    public static void linhaCentroImpar(String valor ,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {

                if (i==w.length/2 && j>=0) {
                    w[i][j] = valor;
                }
            }
        }
    }
    public static void linhaCentroPar(String valor ,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {

                if (i==w.length/2 && j>=0) {
                    w[i][j] = valor;
                }
                else if (i==w.length/2-1 && j>=0) {
                    w[i][j] = valor;
                }
            }
        }
    }
    public static void colunaCentroImpar(String valor ,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {

                if (j==w.length/2 && i>=0) {
                    w[i][j] = valor;
                }
            }
        }
    }
    public static void colunaCentroPar(String valor ,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {

                if (j==w.length/2 && i>=0) {
                    w[i][j] = valor;
                }
                else if (j==w.length/2-1 && i>=0) {
                    w[i][j] = valor;
                }
            }
        }
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
                else if (i< (w.length/2) && j>=(w.length/2) && i+(w.length/2)==j) {
                    w[i][j] = valor;
                }
                //terceiro quadrante
                else if (i>= (w.length/2) && j<(w.length/2) && j+(w.length/2)==i) {
                    w[i][j] = valor;
                }
                //quarto quadrante
                else if (i>=(w.length/2) && j>=(w.length/2) && i+j == (w.length/2)+w.length-1){
                    w[i][j] = valor;
                }

            }
        }
    }

    public static void losangoMatrizImpar(String valor ,String[][] w) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[0].length; j++) {
                //primeiro quadrante
                if (i<= (w.length/2) && j<=(w.length/2) && i+j==(w.length/2)){
                    w[i][j] = valor;
                }
                //segundo quadrante
                else if (i<=(w.length/2) && j>=(w.length/2) && i+(w.length/2)==j) {
                    w[i][j] = valor;
                }
                //terceiro quadrante
                else if (i>= (w.length/2) && j<=(w.length/2) && j+(w.length/2)==i) {
                    w[i][j] = valor;
                }
                //quarto quadrante
                else if (i>=(w.length/2) && j>=(w.length/2) && i+j == (w.length/2)+w.length-1){
                    w[i][j] = valor;
                }
            }
        }
    }

    public static void imprimiMatriz(String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {

                System.out.printf("%s\t", x[i][j]);
            }
            System.out.println();
        }

    }



}

