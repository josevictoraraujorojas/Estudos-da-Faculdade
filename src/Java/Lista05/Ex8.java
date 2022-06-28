package Java.Lista05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){


        Random rand = new Random();
        int[][] notas = new int[10][50];
        String[] produtos = {"Coxinha", "Pastel", "Quibe", "Maia", "Pão de queijo",
                "Rosca", "Empada", "Enroladinho de queijo", "Misto quente", "Brigadeiro"};

        for(int i=0; i<10; i++)
            for(int j=0; j<50;  j++)
                notas[i][j] = rand.nextInt(10)+1;
        System.out.println("As notas dos seguintes produtos foram atribuídas!\n" + Arrays.toString(produtos));

        imprimiMatriz(notas);
        while (true)
        {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite a opcao desejada:");
            System.out.println("[a] Mostrar a media de avaliacao de todos os produtos");
            System.out.println("[b] Mostrar a media e a frequencia de notas de um produto especifico.");
            System.out.println("[c] Mostrar um grafico com as medias das avaliacoes.");
            System.out.println("[d] Mostrar um grafico com a frequencia das avaliacoes para um determinado produto.");
            System.out.println("[e] Sair do programa.");
            String resposta = ler.next();

            switch (resposta.toLowerCase())
            {
                case "a" ->
                        {
                    for (int i = 0; i < 10; i++)
                    {
                        System.out.printf("%s: %.1f\n", produtos[i], calculaMediaVetor(notas[i]));
                    }
                    System.out.println("------------------------------");
                }
                case "b" ->
                        {
                    int[] frequencia = new int[10];
                    System.out.println("Qual produto voce quer saber a media e a frequencia");
                    int respostaFrequencia = ler.nextInt();
                    respostaFrequencia -= 1;
                    System.out.printf("%s: %.1f\n", produtos[respostaFrequencia], calculaMediaVetor(notas[respostaFrequencia]));
                    frequencia = frequencia(notas[respostaFrequencia]);
                    for (int i = 0; i < 10; i++)
                    {
                        System.out.printf("quantidade de vezes que a nota %d: foi repetida: %d\n", i + 1, frequencia[i]);
                    }
                    System.out.println("------------------------------");
                }
                case "c" ->
                        {
                    int[] medias = new int[10];
                    for (int i = 0; i < 10; i++)
                        medias[i] = (int) calculaMediaVetor(notas[i]);
                    imprimeGrafico(medias, produtos);
                }
                case "d" ->
                        {
                    System.out.println("opcao d");
                    int[] frequenciaGrafico = new int[10];
                    System.out.println("Qual produto voce quer saber a media e a frequencia");
                    int respostaGrafico = ler.nextInt();
                    respostaGrafico--;
                    frequenciaGrafico = frequencia(notas[respostaGrafico]);
                    imprimeGraficoFrequencia(frequenciaGrafico);
                }
                case "e" ->
                        {
                    System.out.println("Finalizando o programa!");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    public static float calculaMediaVetor(int[] vetor){
        int soma = 0;
        for(int i = 0; i< vetor.length; i++)
            soma += vetor[i];
        return (float) (soma / vetor.length); //retorna a média
    }

    public static int[] frequencia (int[] vetor) {
        int[] frequencia = new int[10];
        for (int i=0;i<vetor.length;i++)
        {

            ++frequencia[vetor[i]-1];

        }
        return (int[]) (frequencia);

    }

    public static void imprimeGrafico(int[] vetor, String[] produto){
        char[][] grafico = new char[10][10];
        for(int i=0; i<10; i++)
        {
            System.out.print("|");
            for(int j =0; j<10;j++)
            {
                if(j< vetor[i])
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println("|" + produto[i]);
        }

    }

    public static void imprimeGraficoFrequencia(int[] vetor){
        char[][] grafico = new char[10][10];
        for(int i=0; i<10; i++)
        {
            System.out.print("|");
            for(int j =0; j<10;j++)
            {
                if(j< vetor[i])
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println((i+1)+"|");
        }


    }

    public static void imprimiMatriz (int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++)
            {
                System.out.printf("%d\t", x[i][j]);
            }
            System.out.println();
        }
    }
}


