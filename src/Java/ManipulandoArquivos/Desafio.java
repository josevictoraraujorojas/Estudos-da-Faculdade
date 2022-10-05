package Java.ManipulandoArquivos;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;


public class Desafio
{
    public static void main(String[] args) throws IOException
    {
        byte resposta = 0;
        Scanner ler = new Scanner(System.in);
        while (resposta != 3)
        {
            System.out.println("escolha entre criptografar(1), descriptografar(2) ou sair(3)");
            resposta = ler.nextByte();
                switch (resposta) {
                    case 1 -> {
                        inserindoFraseNoArquivo();
                        criptoGrafia();
                        System.out.println();
                    }

                    case 2 -> {
                        inserindoCodigoNoArquivo();
                        descriptoGrafia();
                        System.out.println();
                    }

                    case 3 -> System.out.println("saindo");

                    default -> System.out.println("resposta invalida");
                }
        }
    }

    public static void inserindoFraseNoArquivo() throws IOException
    {
        Scanner ler = new Scanner(System.in);
        StringBuilder frase = new StringBuilder();
        System.out.println("escreva a frase para ser criptografada");
        frase = new StringBuilder(ler.nextLine());
        FileWriter arquivo = new FileWriter("src/Java/ManipulandoArquivos/Criptografia.txt",false);
        PrintWriter adiciona = new PrintWriter(arquivo);
        adiciona.println(frase);
        adiciona.flush();
        adiciona.close();
    }

    public static void inserindoCodigoNoArquivo() throws IOException
    {
        Scanner ler = new Scanner(System.in);
        StringBuilder frase = new StringBuilder();
        System.out.println("escreva o codigo para ser descriptografado");
        frase = new StringBuilder(ler.nextLine());
        FileWriter arquivo = new FileWriter("src/Java/ManipulandoArquivos/Descriptografia.txt",false);
        PrintWriter adiciona = new PrintWriter(arquivo);
        adiciona.println(frase);
        adiciona.flush();
        adiciona.close();
    }
    public static void criptoGrafia() throws FileNotFoundException
    {
        Scanner importar = new Scanner(new File("src/Java/ManipulandoArquivos/Criptografia.txt"));
        System.out.println("Seu texto esta sendo criptografado:");
        System.out.println("Criptografia pronta:");
        while (importar.hasNext())
        {
            StringBuilder palavra = new StringBuilder(importar.next().toUpperCase(Locale.ROOT));
            criptoGrafando(palavra);
            System.out.print(" ");
        }
        importar.close();
    }

    public static void descriptoGrafia() throws FileNotFoundException
    {
        Scanner importar = new Scanner(new File("src/Java/ManipulandoArquivos/Descriptografia.txt"));
        System.out.println("Seu texto esta sendo descriptografado:");
        System.out.println("desCriptografia pronta:");
        int count = 0;
        while (importar.hasNext())
        {
            count++;
            StringBuilder palavra = new StringBuilder(importar.next());
            descriptoGrafando(palavra);
            System.out.print(" ");
            if (count%6==0) System.out.println();
        }
        importar.close();
    }

    public static void criptoGrafando(StringBuilder palavra)
    {
        for (int i=0;i<palavra.length();i++)
        {
            int numero = palavra.codePointAt(i);
            System.out.print(numero);
        }
    }

    public static void descriptoGrafando(StringBuilder palavra)
    {
        char letra;
        for (int i = 1; i < palavra.length() ; i+=2)
        {
            int numero= Integer.parseInt(palavra.substring(i-1,i+1));
            letra= (char) numero;
            System.out.print(letra);
        }
    }
}