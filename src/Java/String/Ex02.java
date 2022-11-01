package Java.String;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) throws IOException {

           Scanner ler = new Scanner(System.in);

           System.out.println("Informe seu login:");
           String login = ler.nextLine();
           System.out.println("informe a sua senha:");
           String senha = ler.nextLine();

           do {
               if (!validacaoDeUsuario(login)) {
                   System.out.println("login invalido");
                   System.out.println("Informe seu login:");
                   login = ler.nextLine();
               }

               else if (!validacaoDeSenha(senha)||senha.equals(login)||!verificacaoDeSequencia(senha)){
                   System.out.println("Senha invalida");
                   System.out.println("Informe sua senha:");
                   senha = ler.nextLine();
               }
               
           }while (senha.equals(login)||!validacaoDeUsuario(senha)||!validacaoDeSenha(senha));
//           while (!validacaoDeSenhaRegex(senha)&&!verificacaoDeSequencia(senha)) {
//                   System.out.println("Senha invalida");
//                  System.out.println("Informe sua senha:");
//                   senha = ler.nextLine();
//              }
        armazenaLoginESenha(senha,login);
    }

    public static boolean validacaoDeUsuario(String login){
        boolean verificacao = true;
        for (char letra:login.toCharArray()) {
            if (!Character.isLetterOrDigit(letra)&&letra!='_')
            {
                verificacao=false;
                break;
            }else if (Character.isSpaceChar(letra))
            {
                verificacao =false;
                break;
            }else if (Character.isDigit(login.charAt(0)))
            {
                verificacao=false;
                break;
            }else if (!(login.length()>=8&&login.length()<=16))
            {
                verificacao =false;
            }
        }
        return verificacao;
    }

    public static boolean validacaoDeSenha(String senha){
        boolean verificacao = true;
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
                verificacao =false;
                break;
            }else if (!(senha.length()>=8&&senha.length()<=16))
            {
                verificacao =false;
                break;
            }
            else if (contadorDeLetrasMaiusculas == senha.length()||contadorDeLetrasMinusculas == senha.length())
                verificacao =false;

            else if (contadorDeNumeros == senha.length())
                verificacao = false;
        }
        return verificacao;
    }
    public static boolean verificacaoDeSequencia(String senha){
        boolean retonar=true;
        for (int i = 0; i < senha.length(); i++) {
            if (i< senha.length()-2&& Character.isDigit(senha.charAt(i))){
                int p1,p2;
                p1=senha.charAt(i)-senha.charAt(i+1);
                p2=senha.charAt(i+1)-senha.charAt(i+2);
                if (p1== 1 && p2 == 1 || p1 == -1 && p2 == -1){
                    retonar = false;
                }

            }
        }return retonar;
    }


    public static boolean validacaoDeSenhaRegex(String senha){
       Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,16}$");
       Matcher matcher = pattern.matcher(senha);
       return matcher.find();
   }
   public static void armazenaLoginESenha(String login, String senha){
       try {
           BufferedWriter armazenaSenha = new BufferedWriter(new FileWriter("BancoDeDadosSenha.txt", true));
           BufferedWriter armazenalogin = new BufferedWriter(new FileWriter("BancoDeDadosLogin.txt", true));
           armazenalogin.write(login+"\n");
           armazenaSenha.write(criptografia(senha)+"\n");
           armazenalogin.close();
           armazenaSenha.close();

       }catch (IOException e){
           e.printStackTrace();
       }

   }
    public static StringBuilder criptografia(String senha){
        StringBuilder codificacao = new StringBuilder();
        for (int i = 0; i < senha.length() ; i++) {
            codificacao.append(senha.codePointAt(i));
        }

        return codificacao;
    }
}