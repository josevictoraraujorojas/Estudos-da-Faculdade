package Java.Relembrando;

import java.util.Arrays;

public class Troca {
    public static void main(String[] args) {
        int[] numeros = atribuindoValores();
        impressao(numeros);
        troca(numeros);
        impressao(numeros);

    }
    public static int[] atribuindoValores (){
        return new int[]{42,44};
    }
    public static void troca (int[] x){
        int auxiliar = x[0];
        x[0]=x[1];
        x[1]=auxiliar;
    }
    public static void impressao (int[] x)
    {
        for (int i = 0; i < x.length; i++)
        {
            System.out.printf(" %d numero: %d ",i+1,x[i]);
        }
        System.out.println();
    }
}
