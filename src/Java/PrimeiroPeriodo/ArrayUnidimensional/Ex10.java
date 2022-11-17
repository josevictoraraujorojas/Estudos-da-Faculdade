package Java.PrimeiroPeriodo.ArrayUnidimensional;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int[] nummeros = new int[10];
        Scanner ler =new Scanner(System.in);
        int countCrescente=0;
        int countDecrescente=0;

        for (int i=0;i<=9;i++){
            System.out.println("informe os numeros do vetor");
            nummeros[i]= ler.nextInt();
        }


        for (int i=0;i<9;i++)
        {
            if (nummeros[i]<nummeros[i+1])
            {
                ++countCrescente;
                System.out.println(countCrescente);
            }

        }
        int decrescente=nummeros[0];
        for (int i=0;i<9;i++)
        {
            if (nummeros[i]>nummeros[i+1]){
                ++countDecrescente;
                System.out.println(countDecrescente);
            }
        }
        if (countCrescente==9)
        {
            System.out.println("esse vetor esta em ordem crescente");
        }
        else if (countDecrescente==9){
            System.out.println("esse vetor esta em ordem decrescente");
        }
        else {
            System.out.println("esse vetor esta bagunçado");
        }
    }

}
