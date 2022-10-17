package Java.ManipulandoArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws IOException {
       try {
           Scanner ler = new Scanner(System.in);
           BufferedWriter armazenaSenha = new BufferedWriter(new FileWriter("BancoDeDadosSenha.txt", true));
           BufferedWriter armazenalogin = new BufferedWriter(new FileWriter("BancoDeDadosLogin.txt", true));
           System.out.println("Informe seu login:");
           String login = ler.nextLine();
           while (verificacaoLogin(login)) {
               System.out.println("login invalido");
               System.out.println("Informe seu login:");
               login = ler.nextLine();
           }
           armazenalogin.write(login+"\n");
           armazenalogin.close();
           armazenaSenha.close();
       }catch (IOException e){
           e.printStackTrace();
       }

    }

    public static boolean verificacaoLogin(String login){
        boolean verificacao = false;
        for (char letra:login.toCharArray()) {
            if (!Character.isLetterOrDigit(letra)&&letra!='_')
            {
                verificacao=true;
                break;
            }else if (Character.isSpaceChar(letra))
            {
                verificacao =true;
                break;
            }else if (Character.isDigit(login.charAt(0)))
            {
                verificacao=true;
                break;
            }else if (!(login.length()>=8&&login.length()<=16))
            {
                verificacao =true;
            }
        }
        return verificacao;
    }
}
