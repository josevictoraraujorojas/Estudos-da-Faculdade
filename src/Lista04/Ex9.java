package Lista04;

import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
//        Questão 9Escreva um programa em Java que encontre o segundo menor valor em um vetor de 10 posilçoes.

        int[] numeros = new int[10];
        Random aleatorio = new Random();

        for (int i = 0; i < 10; i++)
        {
            numeros[i] = aleatorio.nextInt(1, 10);
        }

        System.out.println("este é o vetor: " + "{" + numeros[0] + "," + numeros[1] + "," + numeros[2] + "," + numeros[3] + "," + numeros[4] + "," + numeros[5] + "," + numeros[6] + "," + numeros[7] + "," + numeros[8] + "," + numeros[9] + "}");

        int menor = numeros[0];
        int segundoMenor = numeros[1];

        for (int i = 1; i < 10; i++)
        {
            if (menor > numeros[i])
            {
                menor = numeros[i];
            } else if (segundoMenor > numeros[i] && numeros[i] > menor)
            {
                segundoMenor = numeros[i];
            }
        }
    }
}
