package Java.Lista03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
//        Quest�o 13 Fa�a um programa em Java que leia dois n�meros inteiros, que presentam o in�cio de uma sequencia
//        de n�meros e o final da mesma sequencia. O programa deve somar todos os n�meros m�ltiplos de 7 existentes entre
//        os dois n�meros digitados. Considere apenas uma sequencia crescente de n�meros, ou seja, se o usu�rio digitar 35
//        e 3, o programa deve somar os n�meros m�ltiplos de 7 entre 3 e 37, logo  ?e preciso verificar qual dos dois n�meros
//        digitados  ?e maior e qual o menor.

        int i=0;
        int num2;
        int auxiliar;
        int soma=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        i = ler.nextInt();
        System.out.println("informe o segundo numero");
        num2 = ler.nextInt();
        System.out.println("essa � a soma dos numeros multilos de 7 entre "+i+" e "+num2);
        if (i > num2)
        {
            auxiliar = i;
            i = num2;
            num2 = auxiliar;
        }
        for (i=i;i <= num2;i++)
        {
            System.out.println(i);
            if (i % 7 == 0)
            {
                System.out.println(i+"+"+soma);
                soma+=i;
                System.out.println("resultado da soma: "+soma);
            }
        }
        System.out.println("resultado final da soma: "+soma);
    }
}
