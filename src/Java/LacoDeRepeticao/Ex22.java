package Java.LacoDeRepeticao;

import java.util.Scanner;

public class Ex22 {
//    Questão 22 Faça um programa em Java que leia um número N, some todos os números inteiros de 1 a N, e mostre
//    o saida obtido. Utilize o laço for.

    public static void main(String[] args) {
        int limite;
        int i=1;
        int soma = 0;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();
        for (i=0;i<=limite;i++)
        {
            soma+=i;
            System.out.println(soma);
        }
    }
}
