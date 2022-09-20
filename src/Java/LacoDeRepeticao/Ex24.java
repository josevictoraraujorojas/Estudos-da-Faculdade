package Java.LacoDeRepeticao;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
//        Questão 24 Faca um programa em Java que leia um numero N, some todos os números múltiplos de 3 entre 1 e
//        N, e mostre o resultado obtido. Utilize o laço for o comando continue.

        int i=1;
        int limite;
        int soma=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("informe o ultimo numero");
        limite= ler.nextInt();
        for (i=i;i<=limite;i++)
        {
            System.out.println(i);
            if (i%3==0)
            {
                System.out.println("soma = "+i+"+"+soma);
                soma+=i;
                System.out.println("Resultado soma = "+soma);
                continue;
            }
        }
        System.out.println(soma);
    }
}
