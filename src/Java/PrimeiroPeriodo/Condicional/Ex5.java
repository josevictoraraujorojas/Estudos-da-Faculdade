package Java.PrimeiroPeriodo.Condicional;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
//        Quest�o 5 Escreva um programa Java que mantenha um numero do usu�rio e exiba o nome do dia da semana.
//        Por exemplo, se o usu�rio digitar 5, o programa deve exibir ?sexta-feira?. Se o usu�rio digitar 10, o programa deve
//        exibir ?n�mero inv�lido?.

        int numero;
        Scanner ler = new Scanner(System.in);
        System.out.println("informe um numero");
        numero = ler.nextInt();
        if (numero==1)
        {
            System.out.println("segunda");
        }
        else if (numero==2)
        {
            System.out.println("terca");
        }
        else if (numero==3)
        {
            System.out.println("quarta");
        }
        else if (numero==4)
        {
            System.out.println("quinta");
        }
        else if (numero==5)
        {
            System.out.println("sexta");
        }
        else if (numero==6)
        {
            System.out.println("sabado");
        }
        else if (numero==7)
        {
            System.out.println("domingo");
        }
        else if (numero>7)
        {
            System.out.println("numero invalido");
        }
    }
}
