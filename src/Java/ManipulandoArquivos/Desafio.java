package Java.ManipulandoArquivos;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;


public class Desafio
{
    public static StringBuilder entrada = new StringBuilder();
    public static StringBuilder saida = new StringBuilder();
    public static void main(String[] args) throws IOException
    {
        byte resposta = 0;
        Scanner ler = new Scanner(System.in);
        while (resposta != 3)
        {
            saida.delete(0, saida.length());
            entrada.delete(0, entrada.length());
            System.out.println("escolha entre criptografar(1), descriptografar(2) ou sair(3)");
            resposta = ler.nextByte();
                switch (resposta) {
                    case 1 -> {
                        inserindoFraseNoArquivo();
                        criptoGrafia();
                        bancoDeDadosCriptografia();
                        System.out.println();
                    }

                    case 2 -> {
                        inserindoCodigoNoArquivo();
                        descriptoGrafia();
                        bancoDeDadosDescriptografia();
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
        System.out.println("escreva a entrada para ser criptografada");
        entrada = new StringBuilder(ler.nextLine());
        FileWriter arquivo = new FileWriter("src/Java/ManipulandoArquivos/Criptografia.txt",false);
        PrintWriter adiciona = new PrintWriter(arquivo);
        adiciona.println(entrada);
        adiciona.flush();
        adiciona.close();
    }

    public static void inserindoCodigoNoArquivo() throws IOException
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("escreva o codigo para ser descriptografado");
        entrada = new StringBuilder(ler.nextLine());
        FileWriter arquivo = new FileWriter("src/Java/ManipulandoArquivos/Descriptografia.txt",false);
        PrintWriter adiciona = new PrintWriter(arquivo);
        adiciona.println(entrada);
        adiciona.flush();
        adiciona.close();
    }

    public static void bancoDeDadosCriptografia() throws IOException {
        FileWriter arquivo = new FileWriter("src/Java/ManipulandoArquivos/BancoDeDados.txt",true);
        PrintWriter adiciona = new PrintWriter(arquivo);
        adiciona.printf("\nCriptografia: %s\nResultadoCriptografia: %s \n", entrada, saida);
        adiciona.flush();
        adiciona.close();
    }

    public static void bancoDeDadosDescriptografia() throws IOException {
        FileWriter arquivo = new FileWriter("src/Java/ManipulandoArquivos/BancoDeDados.txt",true);
        PrintWriter adiciona = new PrintWriter(arquivo);
        adiciona.printf("\nDescriptografia: %s\nResultadoDescriptografia: %s \n", entrada, saida);
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
            saida.append(" ");
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
            saida.append(" ");
            if (count%6==0){
                System.out.println();
            }
        }
        importar.close();
    }

    public static void criptoGrafando(StringBuilder palavra)
    {
        for (int i=0;i<palavra.length();i++)
        {
            int numero = palavra.codePointAt(i);
            System.out.print(numero);
            saida.append(numero);
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
            saida.append(letra);
        }
    }
}