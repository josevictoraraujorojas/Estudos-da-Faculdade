package Lista04;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int[] nummeros = new int[10];
        Scanner ler =new Scanner(System.in);
        int countCrescente=0;
        int countDecrescente=0;

        for (int i=0;i<10;i++){
            System.out.println("informe os numeros do vetor");
            nummeros[i]= ler.nextInt();
        }

        int crescente=nummeros[0];
        for (int i=1;i<=9;i++)
        {
            if (crescente<nummeros[i])
            {
                ++countCrescente;
                System.out.println(countCrescente);
            }

        }
        int decrescente=nummeros[0];
        for (int i=9;i>=1;i--)
        {
            if (decrescente>nummeros[i]){
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
