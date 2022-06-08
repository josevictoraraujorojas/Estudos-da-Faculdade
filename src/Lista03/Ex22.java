package Lista03;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        int limite;
        int i=1;
        int soma = 0;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();
        for (i=0;i<=limite;i++)
        {
            soma+=i;
            System.out.println(soma);
        }
    }
}
