package Java.Lista04;

import java.util.Arrays;
import java.util.Random;

public class Desafio {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random aleatorio = new Random();

        for (int i = 0; i < 10; i++)
        {
//            numeros[i] = aleatorio.nextInt(1,10);
        }

        System.out.println("vetor original:  "+Arrays.toString(numeros));

        int auxiliar=0;
        for (int i=0;i<10;i++){
            for (int j=1;j<(10-i);j++){
                if (numeros[j-1]>numeros[j]){
                    auxiliar=numeros[j-1];
                    numeros[j-1]=numeros[j];
                    numeros[j]=auxiliar;
                }
            }
        }
        System.out.println("vetor organizado:  "+Arrays.toString(numeros));
    }
}
