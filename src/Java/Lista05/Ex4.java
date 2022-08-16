package Java.Lista05;

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        //Questão  4  Escreva  um  programa  em  java  que  armazene  números  aleatórios  entre  1  e  10  em  uma  matriz  3x10.
        // Calcule  a  soma  das  linhas  da  matriz  e  armazene  o  resultado  em  um  vetor.
        // Mostre  para  o  usuário  a  matriz  de números impressa, e abaixo dela uma linha simbolizando o traço feito quando vamos somar algo, e logo abaixo os valores das somas.

        int[][]matriz = new int[3][10];
        int[] soma = new int[3];
        Random aleatorio = new Random();

        for (int i=0;i<3;i++){
            for (int j=0;j<10;j++){
                matriz[i][j]=aleatorio.nextInt(10);
                soma[i]+=matriz[i][j];
                System.out.printf("%d\t ", matriz[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(soma));

    }

}
