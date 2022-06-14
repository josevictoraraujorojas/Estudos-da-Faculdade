package Java.Lista02;

import java.util.Scanner;

public class Ex6 {
//    Questão 6 Escreva um programa Java que leia dois números de ponto flutuante e teste se eles são iguais até três
//    casas decimais.

    public static void main(String[] args) {
        float num1,num2;
        Scanner ler =new Scanner(System.in);

        System.out.println("informe o primeiro numero");
        num1= ler.nextFloat();
        System.out.println("informe o segundo numero");
        num2= ler.nextFloat();
        num1*= 100;
        num2*= 100;
        num1 = (float) Math.floor(num1);
        num2 = (float) Math.floor(num2);

        if(num1==num2)
        {
            System.out.println("os numero sao iguais "+num1+" "+num2);
        }
        else
        {
            System.out.println("os numero nao sao iguais "+num1+" "+num2);
        }
    }
}
