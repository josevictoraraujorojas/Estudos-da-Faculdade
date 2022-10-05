package Java.Excecao;

import java.sql.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        try {
            int a=0;
            int b=3;
            int c=5;

            a=a+b/3;
            b=b/a;
            System.out.println(b);
        }catch (ArithmeticException e){
            System.out.println("nao se pode dividir por zero");
        }
    }
}
