package Java.String;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) throws IOException {
       try {
           Scanner ler = new Scanner(System.in);
           BufferedWriter armazenaSenha = new BufferedWriter(new FileWriter("BancoDeDadosSenha.txt", true));
           BufferedWriter armazenalogin = new BufferedWriter(new FileWriter("BancoDeDadosLogin.txt", true));

           System.out.println("Informe seu login:");
           String login = ler.nextLine();
           System.out.println("informe a sua senha:");
           String senha = ler.nextLine();

           while (login.equals(senha)) {
               System.out.println("Sua senha é a mesma que o seu login,tente novamente");
               System.out.println("Informe seu login:");
                login = ler.nextLine();
               System.out.println("informe a sua senha:");
               senha = ler.nextLine();
           }
               while (verificacaoLogin(login)) {
                   System.out.println("login invalido");
                   System.out.println("Informe seu login:"); 
                   login = ler.nextLine();
               }
//               while (verificacaoSenha(senha)) {
//                   System.out.println("Senha invalida");
//                   System.out.println("Informe sua senha:");
//                   senha = ler.nextLine();
//               }
           while (!verificacaoSenhaRegex(senha)) {
                   System.out.println("Senha invalida");
                  System.out.println("Informe sua senha:");
                   senha = ler.nextLine();
              }


           armazenalogin.write(login+"\n");
           armazenaSenha.write(criptografia(senha)+"\n");
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

    public static boolean verificacaoSenha(String senha){
        boolean verificacao = false;
        int contadorDeNumeros=0;
        int contadorDeLetrasMaiusculas=0;
        int contadorDeLetrasMinusculas=0;
        for (char letra:senha.toCharArray()) {
            if (!Character.isUpperCase(letra))
                contadorDeLetrasMaiusculas++;

            if (!Character.isLowerCase(letra))
                contadorDeLetrasMinusculas++;

            if (!Character.isDigit(letra))
                contadorDeNumeros++;

            if (Character.isSpaceChar(letra))
            {
                verificacao =true;
                break;
            }else if (!(senha.length()>=8&&senha.length()<=16))
            {
                verificacao =true;
                break;
            }
            else if (contadorDeLetrasMaiusculas == senha.length()||contadorDeLetrasMinusculas == senha.length())
                verificacao =true;

            else if (contadorDeNumeros == senha.length())
                verificacao = true;
        }
        return verificacao;
    }
   public static boolean verificacaoSenhaRegex(String senha){
       Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,16}$");
       Matcher matcher = pattern.matcher(senha);
       return matcher.find();
   }
    public static StringBuilder criptografia(String senha){
        StringBuilder codificacao = new StringBuilder();
        for (int i = 0; i < senha.length() ; i++) {
            codificacao.append(senha.codePointAt(i));
        }

        return codificacao;
    }
}