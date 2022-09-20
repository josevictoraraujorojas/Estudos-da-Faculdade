package Java.LacoDeRepeticao;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
//        Questão 10 Faça um programa em Java que imprima todos os números inteiros de 1 a N. N  ?e um número que
//        deve ser digitado pelo usuário.

        int num;
        int limite;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();
        System.out.println("sao esses os numeros inteiros de 1 a "+limite);
        for (num=1;num<=limite;num++)
        {
            System.out.println(num);
        }
    }
}
