package Java.LacoDeRepeticao;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
//        Questão 23 Faça um programa em Java que leia um número N, some todos os números múltiplos de 3 entre 1 e
//        N, e mostre o resultado obtido. Utilize o laço for.

        int num=0;
        int limite;
        int i=1;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();

        for (i=1;i<=limite;i++)
        {
            if (i%3==0)
                num+=i;
        }
        System.out.println(num);
    }
}
