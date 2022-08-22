package Java.Relembrando;
import java.util.Arrays;
public class Notas {
    public static void main(String[] args) {
//        criando o objeto da minha classe "notas" onde estão todos os meus métodos
        Notas valores = new Notas();

        System.out.println("*Informações das notas sem o ponto extra* ");

        valores.impressaoNota(notas());

        valores.maiorMenorNota(notas());
//
        valores.notasAbaixo(notas());

        valores.media(notas());

//        O professor resolveu dar um ponto extra para todos.
        System.out.println("\n*Informações das notas com ponto extra* ");
        
        valores.impressaoNota(valores.pontoExtra(notas()));

        valores.pontoExtra(notas());

        valores.maiorMenorNota(valores.pontoExtra(notas()));

        valores.notasAbaixo(valores.pontoExtra(notas()));

        valores.media(valores.pontoExtra(notas()));

    }

    //Cria o vetor para guardar as notas
    public static  double[]  notas (){
        double[] notas = {3.5,9.2,5.5,10.0,6.1,6.6,8.2,9.5,5.0,7.0};
        Arrays.sort(notas);
        return  notas;
    }

//    Imprimi as notas
    public void impressaoNota (double[] x)
    {

        System.out.print("As notas são: ");
        for (int i = 0; i < notas().length; i++)
        {
            System.out.printf(" %.2f ",x[i]);
        }
        System.out.println();
    }

//    Encontra a maior e a menor nota
    public void maiorMenorNota (double[] x)
    {
        System.out.println("A nota maior é: "+x[x.length-1]+", a menor nota é: "+x[0]);
    }

//    Determine quantas notas estão abaixo da média
    public void notasAbaixo (double[] x)
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
    public  void media (double[] x)
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
    public double[] pontoExtra (double[] x)
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
        return x;
    }
}