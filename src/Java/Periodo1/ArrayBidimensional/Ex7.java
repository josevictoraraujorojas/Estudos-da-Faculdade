package Java.Periodo1.ArrayBidimensional;

import java.util.Arrays;
import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
//        Questão 7 Escreva um programa Java para adicionar duas matrizes do mesmo tamanho (3x3).
//        Preencha a matriz com números aleatórios e mostre para o usuário às duas matrizes e o saida da soma.

        int[][] primeiraMatriz = new int[3][3];
        int[][] segundaMatriz = new int[3][3];
        int[] soma = new int[3];
        int somaTotal=0;
        Random aleatorio = new Random();


        for (int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++){
                primeiraMatriz[i][j]= aleatorio.nextInt(10);
                segundaMatriz[i][j]= aleatorio.nextInt(10);
                soma[i]+=primeiraMatriz[i][j];
                soma[i]+=segundaMatriz[i][j];
            }
            somaTotal+=soma[i];
        }
        imprimiMatriz(primeiraMatriz);
        System.out.println("-------------------------------");
        imprimiMatriz(segundaMatriz);
        System.out.println("-------------------------------");
        System.out.println("soma das linhas das duas matrizes: "+Arrays.toString(soma));
        System.out.println("soma total: "+somaTotal);

    }
    public static void imprimiMatriz (int[][] x){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.printf("%d\t",x[i][j]);
            }
            System.out.println();
        }
    }
}
