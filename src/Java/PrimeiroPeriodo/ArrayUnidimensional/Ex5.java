package Java.PrimeiroPeriodo.ArrayUnidimensional;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
//        Questão 5 Escreva um programa em Java que leia um vetor de 10 posições com números inteiros.
//        Verifique se dentre os números digitados há um número primo.

        Scanner ler = new Scanner(System.in);
        long[] numeros = new long[10];

        for(int i = 0; i< 10; i++)
        {
            System.out.println("Digite o "+ (i+1) + "º número:");
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
        if(temPrimo) System.out.println("Existe um número primo na sequência.");
        else System.out.println("Não tem número primo na sequência.");



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

