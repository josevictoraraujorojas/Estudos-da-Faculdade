package Java.LacoDeRepeticao;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
//        Quest�o 10 Fa�a um programa em Java que imprima todos os n�meros inteiros de 1 a N. N  ?e um n�mero que
//        deve ser digitado pelo usu�rio.

        int num;
        int limite;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();
        System.out.println("sao esses os numeros inteiros de 1 a "+limite);
        for (num=1;num<=limite;num++)
        {
            System.out.println(num);
        }
    }
}
