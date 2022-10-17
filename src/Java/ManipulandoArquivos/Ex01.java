package Java.ManipulandoArquivos;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        magicaNasPalavras(ler.nextLine());
    }
    public static void magicaNasPalavras(String nome){
        Random aleatorio = new Random();
        StringBuilder nomeBaguncado = new StringBuilder();
        boolean escolha;
        for (char letra :nome.toCharArray()) {
            escolha=aleatorio.nextBoolean();
            if (escolha)
               nomeBaguncado.append(Character.toLowerCase(letra));
            else
                nomeBaguncado.append(Character.toUpperCase(letra));
        }
        System.out.println("Observe a magica acontecer");
        System.out.println(nomeBaguncado);
    }
}
