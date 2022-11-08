package Java.Recursao;

public class Palindromo {
    public static void main(String[] args) {
        String palavra = "osso";
        System.out.println(verificaPalindromo(palavra,palavra.length()));

    }
    public static boolean verificaPalindromo(String palavra, int n){
       if (n==0){
           return palavra.charAt(n) == palavra.charAt(palavra.length()-1-n);
       }
        return verificaPalindromo(palavra,n-1);
    }
}
