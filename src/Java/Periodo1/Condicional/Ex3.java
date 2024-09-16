package Java.Periodo1.Condicional;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
//        Questão 3 Dado 3 números, encontre o maior e o menor deles.

        int primeiro_numero;
        int segundo_numero;
        int terceiro_numero;
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o primeiro numero");
        primeiro_numero= ler.nextInt();
        System.out.println("informe o segundo numero");
        segundo_numero= ler.nextInt();
        System.out.println("informe o terceiro numero");
        terceiro_numero= ler.nextInt();
        if(primeiro_numero>segundo_numero && primeiro_numero>terceiro_numero)
        {
            System.out.println("O numero "+primeiro_numero+" e maior");
        }
        else if(segundo_numero>primeiro_numero && segundo_numero>terceiro_numero)
        {
            System.out.println("O numero "+segundo_numero+" e maior");
        }
        else if(terceiro_numero>primeiro_numero && terceiro_numero>segundo_numero)
        {
            System.out.println("O numero "+terceiro_numero+" e maior");
        }
        if(primeiro_numero<segundo_numero && primeiro_numero<terceiro_numero)
        {
            System.out.println("O numero "+primeiro_numero+" e menor");
        }
        else if(segundo_numero<primeiro_numero && segundo_numero<terceiro_numero)
        {
            System.out.println("O numero "+segundo_numero+" e menor");
        }
        else if(terceiro_numero<primeiro_numero && terceiro_numero<segundo_numero)
        {
            System.out.println("O numero "+terceiro_numero+" e menor");
        }
    }
}
