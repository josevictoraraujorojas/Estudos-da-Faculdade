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
        valores.impressaoNota();

//        Encontre a maior e a menor nota
        valores.maiorMenorNota();
//
//        Determine quantas notas estão abaixo da média
        valores.notasAbaixo();

//        Calcule a nota media
        valores.media();

//        O professor resolveu dar um ponto extra para todos.
        System.out.println("\n*Informações das notas com ponto extra* ");

//        Modifique o conteúdo do array adicionando um ponto nas notas, sem exceder a nota maxima que é 10
        valores.pontoExtra();

//        Encontre a maior e a menor nota depois dos pontos extras
        valores.maiorMenorNota();

//        Determine quantas notas estão abaixo da média depois da adição da nota extra
        valores.notasAbaixo();

//        Encontre a media das nota depois dos pontos extras
        valores.media();

    }

    //Criando o vetor para guardar as notas
    public static  double[]  notas (){
        double[] notas = {3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0};
        Arrays.sort(notas);
        return  notas;

    }

    public void impressaoNota ()
    {
        Arrays.sort(notas());
        System.out.print("As notas são: ");
        for (int i = 0; i < notas().length; i++)
        {
            System.out.printf(" %.2f ",notas()[i]);
        }
        System.out.println();
    }

    public void maiorMenorNota ()
    {
        System.out.println("A nota maior é: "+notas()[notas().length-1]+", a menor nota é: "+notas()[0]);
    }

    public void notasAbaixo ()
    {
        int quantidadeAbaixo = 0;
        for (int i = 0; i < notas().length; i++)
        {
            if (notas()[i] < 6)
            {
                quantidadeAbaixo++;
            }
        }
        System.out.println("Notas abaixo: " + quantidadeAbaixo);
    }

    public  void media ()
    {
        double media=0;

        for (int i=0;i<10;i++)
        {
            media+=notas()[i];
        }
        media/=notas().length;

        System.out.printf("Medias das notas: %.2f\n",media);
    }

    public void pontoExtra ()
    {
        for (int i = 0; i < notas().length; i++)
        {
            if (notas()[i] <= 9)
            {
                notas()[i]+=1.0;
            }
            else
            {
                notas()[i]=10.0;
            }
        }
        impressaoNota();
    }
}