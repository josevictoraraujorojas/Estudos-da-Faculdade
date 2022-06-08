package Lista03;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        int i;
        int limite;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();
        System.out.println("sao esses os numeros inteiros de 1 a "+limite);
        for (i=1;i<=limite;i++)
        {
            System.out.println(i);
        }
    }
}
