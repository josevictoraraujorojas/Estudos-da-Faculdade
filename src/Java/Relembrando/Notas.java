package Java.Relembrando;


import java.util.Arrays;

public class Notas {
    public static void main(String[] args) {
//        Dada as notas de 10 alunos: 3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0.

//        Declare um array para armazenar essas notas
        double[] notas = {3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0};

//        Imprimindo as notas
        System.out.println("*Informações das notas sem o ponto extra* ");
        impressaoNota(notas);

//        Encontre a maior e a menor nota
        maioreMenorNota(notas);
//
//        Determine quantas notas estão abaixo da média
        notasAbaixo(notas);

//        Calcule a nota media
        media(notas);

//        O professor resolveu dar um ponto extra para todos.
        System.out.println("\n*Informações das notas com ponto extra* ");

//        Modifique o conteúdo do array adicionando um ponto nas notas, sem exceder a nota maxima que é 10
        pontoExtra(notas);

//        Encontre a maior e a menor nota depois dos pontos extras
        maioreMenorNota(notas);

//        Determine quantas notas estão abaixo da média depois da adição da nota extra
        notasAbaixo(notas);

//        Encontre a media das nota depois dos pontos extras
        media(notas);


    }

    public static void media (double[] x)
    {
        double media=0;

        for (int i=0;i<10;i++)
        {
            media+=x[i];
        }
        media/=x.length;

        System.out.printf("Medias das notas: %.2f\n",media);
    }

    public static void maioreMenorNota (double[] x)
    {
        System.out.println("A nota maior é: "+x[x.length-1]+", a menor nota é: "+x[0]);
    }

    public static void notasAbaixo (double[] x)
    {
        int countAbaixo = 0;
        for (int i = 0; i < 10; i++)
        {
            if (x[i] < 6)
            {
                countAbaixo++;
            }
        }

        System.out.println("Notas abaixo: " + countAbaixo);
    }

    public static void impressaoNota (double[] x)
    {
        Arrays.sort(x);
        System.out.print("As notas são: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf(" %.2f ",x[i]);
        }
        System.out.println();
    }

    public static void pontoExtra (double[] x)
    {
        for (int i = 0; i < 10; i++)
        {
            if (x[i] <= 9)
            {
                x[i]+=1.0;
            }
            else
            {
                x[i]=10.0;
            }
        }
        impressaoNota(x);
    }
}

