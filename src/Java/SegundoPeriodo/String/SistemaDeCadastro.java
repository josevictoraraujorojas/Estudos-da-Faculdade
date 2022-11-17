package Java.SegundoPeriodo.String;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SistemaDeCadastro {
    public static void main(String[] args) throws IOException {

        BufferedWriter armazenaSenha = new BufferedWriter(new FileWriter("BancoDeDadosSenha.txt", true));
        BufferedWriter armazenalogin = new BufferedWriter(new FileWriter("BancoDeDadosLogin.txt", true));

           Scanner ler = new Scanner(System.in);

           System.out.println("Informe seu login:");
           String login = ler.nextLine();
           System.out.println("informe a sua senha:");
           String senha = ler.nextLine();

           do {
               if (!validacaoDeUsuario(login)||!verificaLoginDuplicada(login)) {
                   System.out.println("login invalido");
                   System.out.println("Informe seu login:");
                   login = ler.nextLine();
               }

               else if (!validacaoDeSenha(senha)||senha.equals(login)||!verificacaoDeSequencia(senha)){
                   System.out.println("Senha invalida");
                   System.out.println("Informe sua senha:");
                   senha = ler.nextLine();
               }

           }while (senha.equals(login)||!validacaoDeUsuario(senha)||!validacaoDeSenha(senha)||!verificaLoginDuplicada(login));

//           while (!validacaoDeSenhaRegex(senha)&&!verificacaoDeSequencia(senha)) {
//                   System.out.println("Senha invalida");
//                  System.out.println("Informe sua senha:");
//                   senha = ler.nextLine();
//              }

        armazenaLoginESenha(armazenaSenha,armazenalogin,login,senha);
    }

    public static boolean validacaoDeUsuario(String login){
        for (char letra:login.toCharArray()) {
            if (!Character.isLetterOrDigit(letra)&&letra!='_')
            {
                return false;
            } else if (Character.isDigit(login.charAt(0)))
            {
                return false;
            }else if (!(login.length()>=8&&login.length()<=16))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean validacaoDeSenha(String senha){
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
                return false;
            }else if (!(senha.length()>=8&&senha.length()<=16))
            {
                return false;
            }
            else if (contadorDeLetrasMaiusculas == senha.length()||contadorDeLetrasMinusculas == senha.length())
                return false;

            else if (contadorDeNumeros == senha.length())
                return false;
        }
        return true;
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

   public static Boolean verificaLoginDuplicada(String login) throws IOException {
       BufferedReader rd = new BufferedReader(new FileReader("BancoDeDadosLogin.txt"));
       String linha;
       while ( (linha=rd.readLine())!=null){
           if (login.equals(linha)){
               return false;
           }
       }
       return true;
   }

   public static void armazenaLoginESenha(BufferedWriter armazenaSenha, BufferedWriter armazenalogin,String login, String senha){
       try {
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
            codificacao.append(" ");
        }

        return codificacao;
    }
}