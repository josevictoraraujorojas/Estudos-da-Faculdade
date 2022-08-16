package Java.Relembrando;



public class Notas {
    public static void main(String[] args) {
//        Dada as notas de 10 alunos: 3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0.

//        Declare um array para armazenar essas notas
        double[] notas = {3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0};

//        Encontre a maior e a menor nota

        menorMaior(notas);

//        Calcule a nota media

       media(notas);

//        Determine quantas notas estão abaixo da média

        notasAbaixo(notas);

//        O professor resolveu dar um ponto extra para todos.
//        Modifique o conteúdo do array adicionando um ponto nas notas, sem exceder a nota maxima que é 10

        pontoExtra(notas);

    }

    public static void menorMaior (double[] x)
    {
        double menorValor= Double.MAX_VALUE;
        double maiorValor=0;

        for (int i=0;i<10;i++)
        {
            if (menorValor>x[i])
            {
                menorValor=x[i];
            }
            else if (maiorValor<x[i])
            {
                maiorValor=x[i];
            }
        }
        System.out.println("menor nota: "+menorValor+", maior nota: "+maiorValor);
    }

    public static void media (double[] x)
    {
        double media=0;
        for (int i=0;i<10;i++)
        {
            media+=x[i];
        }
        media/=x.length;

        System.out.println("media das notas: "+media);
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
    }
}
