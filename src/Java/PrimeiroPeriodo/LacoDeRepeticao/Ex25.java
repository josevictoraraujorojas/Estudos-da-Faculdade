package Java.PrimeiroPeriodo.LacoDeRepeticao;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
//        Questão 25 Faça um programa em Java que leia um número N, imprima todos os números pares entre 1 e N.
//        Utilize o laco for e o comando continue.

        int i;
        int limite;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();
        System.out.println("sao esses os numeros inteiros de 1 a "+limite);
        for (i=1;i<=limite;i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
                continue;
            }
        }
    }
}
