package Java.Lista05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
    int[][] produtos = new int[10][50];
    int[] frequencia = new int[10];
    int[] media = new int[10];
    Scanner ler =new Scanner(System.in);


        Random aleatorio = new Random();

        for (int i=0;i<10;i++){
            for (int j=0;j<50;j++){
                produtos[i][j]= aleatorio.nextInt(10)+1;

            }

        }

        imprimiMatriz(produtos);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("o que voce quer saber sobre os produtos");
        System.out.println("'a' Mostrar a media de avaliação de todos os produtos");






    }
    public static void imprimiMatriz (int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.printf("%d\t", x[i][j]);
            }
            System.out.println();
        }
    }
    public static void media(int[] y,int[][] x){
        int i;
        int j;
        for ( i=0;i<10;i++) {
            for (j = 0; j < 50; j++) {
                y[i] += x[i][j];
            }
            y[i] /= j;
        }
        System.out.println("media de cada produto"+Arrays.toString(y));
    }
    public static void mediaTotal9(int[] y,int[][] x){
        int i;
        int j;
        int l=0;
        for ( i=0;i<10;i++) {
            for (j = 0; j < 50; j++) {
                y[i] += x[i][j];
            }
            y[i] /= j;
            l+=y[i];
        }
        l/=i;
        System.out.println("media total: "+l);
    }
}
