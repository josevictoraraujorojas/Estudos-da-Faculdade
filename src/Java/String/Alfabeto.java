package Java.String;

import java.util.Scanner;

public class Alfabeto {
    public static Scanner ler = new Scanner(System.in);
    public static String resposta="x";
    public static void main(String[] args) {
        pergunta();
        switch (resposta) {
            case "maiusculo" -> imprimiAlfabeto('A', 'Z');
            case "minusculo" -> imprimiAlfabeto('a', 'z');
        }
    }

    public static void pergunta(){
        while (!(resposta.equals("maiusculo") || resposta.equals("minusculo"))) {
            System.out.println("você quer que seja impresso o alfabeto em maiusculo ou minusculo");
            resposta=ler.nextLine();
        }
    }

    public static void imprimiAlfabeto(char inicio,char fim){
            for (char letra = inicio; letra <=fim; letra++)
                System.out.println(letra);
    }
}
