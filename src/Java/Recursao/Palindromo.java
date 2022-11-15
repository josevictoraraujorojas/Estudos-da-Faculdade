package Java.Recursao;

public class Palindromo {
    public static int x =0;
    public static void main(String[] args) {
        String palavra = "lava esse aval";

        if (verificaPalindromo(palavra,palavra.length()-1)){
            System.out.printf("a palavra \"%s\" e um palindromo",palavra);
        }else {
            System.out.printf("a palavra \"%s\" nao e um palindromo",palavra);
        }
    }
    public static Boolean verificaPalindromo(String palavra, int n){
       if (n>0) {
           if (palavra.charAt(n) == palavra.charAt(palavra.length() - 1 - n)) {
               x++;
           }
           verificaPalindromo( palavra, n-1);
       }
        return x == palavra.length() - 1;
    }
}
