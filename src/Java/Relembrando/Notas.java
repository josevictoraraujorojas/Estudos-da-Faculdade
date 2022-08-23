package Java.Relembrando;
import java.util.Arrays;
public class Notas {
    public static void main(String[] args) {
//        Declare um array para armazenar essas notas {3.5, 9.2, 5.5, 10.0, 6.1, 6.6, 8.2, 9.5, 5.0, 7.0}.
        System.out.println("*Informações das notas sem o ponto extra* ");

//        Cria o vetor para guardar as notas dentro do main
        double[] notas = notas();

        impressaoNota(notas);

        maiorMenorNota(notas);
//
        notasAbaixo(notas);

        media(notas);

//        O professor resolveu dar um ponto extra para todos.
        System.out.println("\n*Informações das notas com ponto extra* ");

        pontoExtra(notas);

        impressaoNota(notas);


        maiorMenorNota(notas);

        notasAbaixo(notas);

        media(notas);

    }

    //Cria o vetor para guardar as notas
    public static  double[]  notas ()
    {
        double[] notas = {3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0};
        Arrays.sort(notas);
        return  notas;
    }

    //    Imprimi as notas
    public static void impressaoNota (double[] x)
    {
        System.out.print("As notas são: ");
        for (int i = 0; i < notas().length; i++)
        {
            System.out.printf(" %.2f ",x[i]);
        }
        System.out.println();
    }

    //    Encontra a maior e a menor nota
    public static void maiorMenorNota (double[] x)
    {
        System.out.println("A nota maior é: "+x[x.length-1]+", a menor nota é: "+x[0]);
    }

    //    Determina quantas notas estão abaixo da média
    public static void notasAbaixo (double[] x)
    {
        int quantidadeAbaixo = 0;
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] < 6)
            {
                quantidadeAbaixo++;
            }
        }
        System.out.println("Notas abaixo: " + quantidadeAbaixo);
    }

    //        Calcule a media das notas
    public static void media (double[] x)
    {
        double media=0;

        for (int i=0;i< x.length;i++)
        {
            media+=x[i];
        }
        media/=notas().length;

        System.out.printf("Medias das notas: %.2f\n",media);
    }

    // Adiciona os Pontos extra
    public static void pontoExtra (double[] x)
    {
        for (int i = 0; i < x.length; i++)
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
    }
}