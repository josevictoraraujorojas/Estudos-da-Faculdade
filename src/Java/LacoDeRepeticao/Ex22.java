package Java.LacoDeRepeticao;

import java.util.Scanner;

public class Ex22 {
//    Quest�o 22 Fa�a um programa em Java que leia um n�mero N, some todos os n�meros inteiros de 1 a N, e mostre
//    o saida obtido. Utilize o la�o for.

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
