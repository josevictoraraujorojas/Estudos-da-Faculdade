package Java.PrimeiroPeriodo.ArrayUnidimensional;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
//        Quest�o 5 Escreva um programa em Java que leia um vetor de 10 posi��es com n�meros inteiros.
//        Verifique se dentre os n�meros digitados h� um n�mero primo.

        Scanner ler = new Scanner(System.in);
        long[] numeros = new long[10];

        for(int i = 0; i< 10; i++)
        {
            System.out.println("Digite o "+ (i+1) + "� n�mero:");
            numeros[i] = ler.nextLong();
        }


        boolean temPrimo = false;
        for(int i = 0; i< 10; i++)
        {
            if(verificaPrimoRapido(numeros[i]))
            {
                temPrimo = true;
                break;
            }
        }
        if(temPrimo) System.out.println("Existe um n�mero primo na sequ�ncia.");
        else System.out.println("N�o tem n�mero primo na sequ�ncia.");



    }
    public static boolean verificaPrimoRapido(long x){
        if(x<=1)
            return false;
        if(x == 2 || x== 3)
            return true;
        else{
            for(int j = 2; j <= Math.sqrt(x) ; j++)
            {
                if( x % j == 0)
                    return false;
            }
            return true;
        }
    }
}

