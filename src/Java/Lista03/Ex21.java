package Java.Lista03;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
//        Questão 21 Faça um programa em Java que imprima todos os números inteiros de 1 a N. N  ?e um numero que
//        deve ser digitado pelo usuário. Utilize o laço for.

        int i;
        int limite;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();
        System.out.println("sao esses os numeros inteiros de 1 a "+limite);
        for (i=1;i<=limite;i++)
        {
            System.out.println(i);
        }
    }
}
