package Java.LacoDeRepeticao;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
//        Quest�o 11 Fa�a um programa em Java que leia um n�mero N, some todos os n�meros inteiros de 1 a N, e mostre
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
