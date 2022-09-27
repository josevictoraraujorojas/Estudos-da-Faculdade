package Java.ManipulandoArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
public class Desafio {

    public static void main(String[] args) throws FileNotFoundException {
        String resposta="x";
        Scanner ler = new Scanner(System.in);
        while (!(resposta.equals("criptografia") || resposta.equals("descriptografia"))){
            System.out.println("escolha entre criptografia e descriptografia");
            resposta = ler.nextLine();
        }
        switch (resposta) {
            case "criptografia" -> criptoGrafia();
            case "descriptografia" -> descriptoGrafia();
        }

    }

    public static void criptoGrafia() throws FileNotFoundException {
        Scanner importar = new Scanner(new File("src/Java/ManipulandoArquivos/Criptografia.txt"));
        System.out.println("Seu texto esta sendo criptografado:");
        System.out.println("Criptografia pronta:");
        while (importar.hasNextLine()){
            StringBuilder palavra = new StringBuilder(importar.next().toUpperCase(Locale.ROOT));
            criptoGrafando(palavra);
            System.out.print("   ");
        }
    }

    public static void descriptoGrafia() throws FileNotFoundException {
        Scanner importar = new Scanner(new File("src/Java/ManipulandoArquivos/Descriptografia.txt"));
        System.out.println("Seu texto esta sendo descriptografado:");
        System.out.println("desCriptografia pronta:");
        while (importar.hasNextLine()){
            StringBuilder palavra = new StringBuilder(importar.next());
            descriptoGrafando(palavra);
            System.out.print("   ");
        }
    }

    public static void criptoGrafando(StringBuilder palavra){
        for (int i=0;i<palavra.length();i++) {
            int numero = palavra.codePointAt(i);
            System.out.print(numero);
        }
    }

    public static void descriptoGrafando(StringBuilder palavra){
        char letra;
        for (int i = 1; i < palavra.length() ; i+=2) {
            int numero= Integer.parseInt(palavra.substring(i-1,i+1));
            letra= (char) numero;
            System.out.print(letra);
        }
    }

}
