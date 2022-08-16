package Java.Lista05;

public class Ex5 {
    public static void main(String[] args) {
//        Questão  5  Imagine o seguinte jogo da velha como uma matriz:
//
//        Qual o tamanho da matriz que pode representar esse jogo?
//
//        String[][] jogoVelha = new String[3][3];
//
//        qual o tipo de dado que essa matriz deve armazenar?
//
//        String  O ou X
//
//        FormaFormaO que está armazenado na posição jogo  velha[1][0] e jogo  velha[2][2]?
//
//        espaço vazio
//
//        Faça um programa que crie essa matriz, preencha os elementos da matriz como mostra na figura (elemento por elemento acessando o índice) e imprima a matriz com o comando System.out.print().

        int [][] identidade = new int[5][5];

        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                identidade[i][j]=0;
                if (i==j){
                    identidade[i][j]=1;
                }
                System.out.printf("%d\t ", identidade[i][j]);
            }
            System.out.print("\n");
        }
    }
}
