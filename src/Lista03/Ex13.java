package Lista03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int i=0;
        int num2;
        int auxiliar;
        int soma=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        i = ler.nextInt();
        System.out.println("informe o segundo numero");
        num2 = ler.nextInt();
        System.out.println("essa é a soma dos numeros multilos de 7 entre "+i+" e "+num2);
        if (i > num2)
        {
            auxiliar = i;
            i = num2;
            num2 = auxiliar;
        }
        for (i=i;i <= num2;i++)
        {
            System.out.println(i);
            if (i % 7 == 0)
            {
                System.out.println(i+"+"+soma);
                soma+=i;
                System.out.println("resultado da soma: "+soma);
            }
        }
        System.out.println("resultado final da soma: "+soma);
    }
}
