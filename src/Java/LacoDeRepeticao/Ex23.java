package Java.LacoDeRepeticao;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
//        Quest�o 23 Fa�a um programa em Java que leia um n�mero N, some todos os n�meros m�ltiplos de 3 entre 1 e
//        N, e mostre o resultado obtido. Utilize o la�o for.

        int num=0;
        int limite;
        int i=1;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();

        for (i=1;i<=limite;i++)
        {
            if (i%3==0)
                num+=i;
        }
        System.out.println(num);
    }
}
