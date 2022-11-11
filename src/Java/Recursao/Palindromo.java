package Java.Recursao;

public class Palindromo {
    public static void main(String[] args) {
        String palavra = "amor � roma";
        if (verificaPalindromo(palavra,palavra.length()-1)){
            System.out.printf("A palavra \"%s\" � um palindromo",palavra);
        }else {
            System.out.printf("A palavra \"%s\" n�o � um palindromo",palavra);
        }

    }
    public static boolean verificaPalindromo(String palavra, int n){
       if (n==0){
           return palavra.charAt(n) == palavra.charAt(palavra.length()-1-n);
       }
        return verificaPalindromo(palavra,n-1);
    }
}
