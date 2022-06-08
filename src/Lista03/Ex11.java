package Lista03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int limite;
        int i=1;
        int num=0;
        Scanner ler =new Scanner(System.in);
        System.out.println("informe o numero");
        limite= ler.nextInt();
        for (i=1;i<=limite;i++)
        {
            num+=i;
            System.out.println(num);
        }
    }
}
