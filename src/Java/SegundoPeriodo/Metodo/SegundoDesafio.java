package Java.SegundoPeriodo.Metodo;
import java.util.Scanner;

public class SegundoDesafio {
    public static String nome;
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        perguntaNome();
        padraoDesenho();
    }
    public static void perguntaNome(){
        System.out.println("informe o seu nome:");
        nome= ler.nextLine();
    }
    public static void padraoDesenho(){
        for (int i = 0; i <nome.indexOf(" ") ; i++)
                System.out.println(nome.substring(0,nome.indexOf(" ")-i));
        for (int i = 2; i <=nome.indexOf(" ") ; i++)
            System.out.println(nome.substring(0,i));

        for (int i = 0; i <nome.length()-2-nome.indexOf(" ") ; i++)
            System.out.println(nome.substring(nome.indexOf(" ")+1,nome.length()-i));
        for (int i = nome.indexOf(" ")+2; i < nome.length()+1 ; i++)
            System.out.println(nome.substring(nome.indexOf(" ")+1,i));

    }
}
