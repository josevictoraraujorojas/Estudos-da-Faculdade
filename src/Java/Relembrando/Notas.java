package Java.Relembrando;


import java.util.Arrays;

public class Notas {
    public static void main(String[] args) {
//        Dada as notas de 10 alunos: 3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0.

//        Declare um array para armazenar essas notas
        double[] notas = {3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0};

//        Imprimindo as notas
        Arrays.sort(notas);
        System.out.print("As notas s�o: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf(" %.2f ",notas[i]);
        }
        System.out.println();

//        Encontre a maior e a menor nota
        System.out.println("a nota maior �: "+notas[notas.length-1]+", a menor nota �: "+notas[0]);

//        Calcule a nota media
        System.out.print("medias das notas: ");
        media(notas);
        System.out.println();

//        Determine quantas notas est�o abaixo da m�dia
        notasAbaixo(notas);

//        O professor resolveu dar um ponto extra para todos.
//        Modifique o conte�do do array adicionando um ponto nas notas, sem exceder a nota maxima que � 10
        System.out.print("Essas s�o as notas com adi��o do ponto extra: ");
        pontoExtra(notas);

//        Determine quantas notas est�o abaixo da m�dia depois da adi��o da nota extra
        System.out.print("Notas abaixo da m�dia depois da adi��o da nota extra");
        notasAbaixo(notas);

//        Encontre a maior e a menor nota depois dos pontos extras
        System.out.println("notas com ponto extra, "+"a nota maior �: "+notas[notas.length-1]+", a menor nota �: "+notas[0]);
        System.out.print("media da notas depois do ponto extra: ");
        media(notas);
        System.out.println();
//        Encontre a media das nota depois dos pontos extras


    }

    public static void media (double[] x)
    {
        double media=0;
        for (int i=0;i<10;i++)
        {
            media+=x[i];
        }
        media/=x.length;

        System.out.printf(" %.2f ",media);
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

        System.out.println("notas abaixo: " + countAbaixo);
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
            System.out.printf(" %.2f ",x[i]);
        }
        System.out.println();
    }
}
