package Lista02;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
//        Quest�o 4 Dado 3 n�meros, verifique a exist�ncia de um numero negativo.

        int primeiro_numero;
        int segundo_numero;
        int terceiro_numero;

        Scanner ler = new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        primeiro_numero = ler.nextInt();
        System.out.println("informe o segundo numero");
        segundo_numero = ler.nextInt();
        System.out.println("informe o terceiro numero");
        terceiro_numero = ler.nextInt();
        if (primeiro_numero > 0) {
            System.out.println("o numero " + primeiro_numero + " e negativo");
        } else if (segundo_numero > 0) {
            System.out.println("o numero " + segundo_numero + " e negativo");
        } else if (terceiro_numero > 0) {
            System.out.println("o numero " + terceiro_numero + " e negativo");
        }
    }
}
