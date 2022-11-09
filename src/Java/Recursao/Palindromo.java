package Java.Recursao;

public class Palindromo {
    public static void main(String[] args) {
        String palavra = "roma é amor";
        System.out.println(verificaPalindromo(palavra,palavra.length()-1));

    }
    public static boolean verificaPalindromo(String palavra, int n){
       if (n==0){
           return palavra.charAt(n) == palavra.charAt(palavra.length()-1-n);
       }
        return verificaPalindromo(palavra,n-1);
    }
}
