package Java.Relembrando;
import java.util.Arrays;
public class Notas {
    public static void main(String[] args) {
//        criando o objeto da minha classe "notas" onde estão todos os meus métodos
        Notas valores = new Notas();

//        Dada as notas de 10 alunos: 3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0.
        System.out.println("*Informações das notas sem o ponto extra* ");

//        Declare um array para armazenar essas notas

//        Imprimindo as notas
        valores.impressaoNota(notas);

//        Encontre a maior e a menor nota
        valores.maiorMenorNota(notas);
//
//        Determine quantas notas estão abaixo da média
        valores.notasAbaixo(notas);

//        Calcule a nota media
        valores.media(notas);

//        O professor resolveu dar um ponto extra para todos.
        System.out.println("\n*Informações das notas com ponto extra* ");

//        Modifique o conteúdo do array adicionando um ponto nas notas, sem exceder a nota maxima que é 10
        valores.pontoExtra(notas);

//        Encontre a maior e a menor nota depois dos pontos extras
        valores.maiorMenorNota(notas);

//        Determine quantas notas estão abaixo da média depois da adição da nota extra
        valores.notasAbaixo(notas);

//        Encontre a media das nota depois dos pontos extras
        valores.media(notas);

    }

    //Criando o vetor para guardar as notas
     public static double[] notas = {3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0};

    public  void media (double[] x)
    {
        double media=0;

        for (int i=0;i<10;i++)
        {
            media+=x[i];
        }
        media/=x.length;

        System.out.printf("Medias das notas: %.2f\n",media);
    }

    public void maiorMenorNota (double[] x)
    {
        System.out.println("A nota maior é: "+x[x.length-1]+", a menor nota é: "+x[0]);
    }

    public void notasAbaixo (double[] x)
    {
        int quantidadeAbaixo = 0;
        for (int i = 0; i < 10; i++)
        {
            if (x[i] < 6)
            {
                quantidadeAbaixo++;
            }
        }
        System.out.println("Notas abaixo: " + quantidadeAbaixo);
    }

    public void impressaoNota (double[] x)
    {
        Arrays.sort(x);
        System.out.print("As notas são: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf(" %.2f ",x[i]);
        }
        System.out.println();
    }

    public void pontoExtra (double[] x)
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