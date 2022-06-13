package Lista04;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
//        Questão 6 Escreva um programa em Java que armazene 10 números aleatórios em um vetor.
//        Informe ao usuárioque os números estão sendo atribuídos ao vetor e diga quais são esses números.
//        Em seguida, informe as seguintes opções para o usuário escolher o que quer ver:

        Random aleatorio= new Random();
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] duplicado = new int[10];
        String resposta;
        String novamente;
        int multiplo;

        for (int i = 0; i < 10; i++)
        {
            numeros[i] = aleatorio.nextInt(-10,10);
        }
        do {
            System.out.println("este é o vetor: " + "{" + numeros[0] + "," + numeros[1] + "," + numeros[2] + "," + numeros[3] + "," + numeros[4] + "," + numeros[5] + "," + numeros[6] + "," + numeros[7] + "," + numeros[8] + "," + numeros[9] + "}");
            System.out.println("o que voce quer saber sobre o vetor");
            System.out.println("se voce quiser saber a quantidade dos numeros primos escreva 'primo'");
            System.out.println("se voce quiser saber a quantidade de numeros positivo e negativos do vetor ecreva 'positivonegativo'");
            System.out.println("se voce quiser saber a quantidade de numeros multiplos ecreva 'multiplo'");
            System.out.println("se voce quiser saber o maior e o menor numero do vetor ecreva 'maiormenor'");
            System.out.println("se voce quiser saber a quantidade de numeros pares e impares do vetor ecreva 'parimpar'");
            System.out.println("se voce quiser saber os numeros duplicados do vetor ecreva 'duplicado'");
            System.out.println("informe aqui:");
            resposta = ler.next();
            while (!(resposta.equals("primo") || resposta.equals("positivonegativo") || resposta.equals("multiplo") || resposta.equals("maiormenor") ||  resposta.equals("parimpar") || resposta.equals("duplicado"))) {
                System.out.println("resposta invalida");
                System.out.println("responda novamente");
                resposta = ler.next();
            }

            switch (resposta) {
                case "primo" -> verificaPrimo(numeros);
                case "positivonegativo" -> verificaPositivoNegativo(numeros);
                case "parimpar" -> verificaParImpar(numeros);
                case "multiplo" -> {
                    System.out.println("informe os multiplos que você deseja encontrar");
                    multiplo = ler.nextInt();
                    verificaMultiplo(numeros, multiplo);
                }
                case "maiormenor" -> verificaMaiorMenor(numeros);
                case "duplicado" -> verificaDuplicado(numeros,duplicado);

            }

            System.out.println("voce quer saber mais cosisas sobre o vetor");
            System.out.println("Voce quer saber mais sobre o vetor se sim digite 'sim'");
            novamente= ler.next();

        }while (novamente.equals("sim"));
    }
    public static void verificaParImpar(int[] x){
        int countPar=0;
        int countImpar=0;
        for (int i=0;i<10;i++)
        {
            if (x[i] % 2 == 0)
            {
                countPar++;
            } else
            {
                countImpar++;
            }
        }
        System.out.println("quantidade de numeros impares do vetor: "+countImpar);
        System.out.println("quantidade de numeros pares do vetor: "+countPar);
    }
    public static void verificaPositivoNegativo(int[] x){
        int countPositivo=0;
        int countNegativo=0;

        for (int i=0;i<10;i++)
        {
            if (x[i] > 0)
            {
                countPositivo++;
            } else
            {
                countNegativo++;
            }
        }
        System.out.println("quantidade de numeros positivos do vetor: "+countPositivo);
        System.out.println("quantidade de numeros negativos do vetor: "+countNegativo);
    }
    public static void verificaMaiorMenor(int[] x){
        int maior= x[0], menor= x[0];

        for (int i=1;i<9;i++){
            if (x[i]>maior)
            {
                maior=x[i];
            }
            if (x[i]<menor)
            {
                menor=x[i];
            }
        }
        System.out.println("este é o maior numero do vetor: "+maior);
        System.out.println("este é o menore numero do vetor: "+menor);
    }
    public static void verificaMultiplo(int[] x,int y){
        int countMultiplo=0;
        for (int i=0;i<10;i++)
        {
            if (x[i] % y == 0)
            {
                countMultiplo++;
            }
        }
        System.out.println("qauntidade de multiplos do numero "+y+" : "+countMultiplo);
    }
    public static void verificaPrimo(int[] x){

        int countPrimo=0;
        for (int i=0;i<10;i++)
        {
            int count=0;
            for (int j = x[i]; j>=1; j--)
            {
                if (x[i]%j==0)
                {
                    count++;
                }
            }
            if (count == 2)
            {
                countPrimo++;
            }
        }
        System.out.println("quantidade de numeros primos no vetor: "+countPrimo);
    }
    public static void verificaDuplicado(int[] x,int[] y){
        for (int i=0;i<10;i++)
        {
            ++y[x[i]];
            System.out.println("numero "+x[i]+" foi repetido "+y[i]);
        }
    }
}
