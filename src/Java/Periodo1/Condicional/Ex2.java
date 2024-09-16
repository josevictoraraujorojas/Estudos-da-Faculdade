package Java.Periodo1.Condicional;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//        Questão 2 Dado um numero, verifique se esse é par ou ímpar.

        int numero;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite um numero");
        numero = ler.nextInt();
        if (numero%2==0)
        {
            System.out.println("Esse numero e par");
        }
        else
        {
            System.out.println("Esse numero e impar");
        }
    }
}
