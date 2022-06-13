package Lista04;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
//        Questão 7 Escreva um programa em java que leia dois vetores de String.
//        Verifique se existem strings em comumnos dois vetores.

        Scanner ler = new Scanner(System.in);
        String[] x = new String[4];
        String[] y = new String[9];

        System.out.println("Escreva 4 Strings para o vetor x");
        for (int i = 0; i < 4; i++) {
            System.out.println("String " + (i + 1) + " do vetor x:");
            x[i] = ler.next();
        }

        System.out.println("Escreva 9 Strinds para o vetor y");
        for (int j = 0; j < 9; j++) {
            System.out.println("String " + (j + 1) + " do vetor y:");
            y[j] = ler.next();
        }

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 4; i++) {
                if (y[j].toLowerCase(Locale.ROOT).equals(x[i].toLowerCase(Locale.ROOT))) {
                    System.out.println("A strings " + y[j].toLowerCase(Locale.ROOT) + " é comumnos nos dois vetores");
                }
            }
        }
    }
}

