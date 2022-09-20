package Java.LacoDeRepeticao;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
//        Questão 11 Faça um programa em Java que leia um número N, some todos os números inteiros de 1 a N, e mostre
//        o resultado obtido.

        int limite;
        int i=1;
        int num=0;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();
        for (i=1;i<=limite;i++)
        {
            num+=i;
            System.out.println(num);
        }
    }
}
