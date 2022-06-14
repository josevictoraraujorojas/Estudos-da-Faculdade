package Java.Lista04;


import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
//        Questão 8 Escreva um programa em Java que leia dois vetores de números inteiros.
//        Verifique se existem númerosem comum nos dois vetores.

        Scanner ler =new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[9];

        System.out.println("Escreva 4 numeros para o vetor x");
        for (int i=0;i<4;i++)
        {
            System.out.println("numero "+(i+1)+" do vetor x:");
            x[i]= ler.nextInt();
        }

        System.out.println("Escreva 9 numeros para o vetor y");
        for (int j=0;j<9;j++)
        {
            System.out.println("numero "+(j+1)+" do vetor y:");
            y[j]= ler.nextInt();
        }

        for (int j=0;j<9;j++)
        {
            for (int i=0;i<4;i++)
            {
                if (y[j]==x[i])
                {
                    System.out.println("O numero "+y[j]+" é comum nos dois vetores");
                }
            }
        }
    }
}


