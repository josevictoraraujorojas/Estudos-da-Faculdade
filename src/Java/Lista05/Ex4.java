package Java.Lista05;

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        int[][]matriz = new int[3][10];
        int[] soma = new int[3];
        Random aleatorio = new Random();

        for (int i=0;i<3;i++){
            for (int j=0;j<10;j++){
                matriz[i][j]=aleatorio.nextInt(10);
                soma[i]+=matriz[i][j];
                System.out.printf("%d\t ", matriz[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(soma));

    }

}
