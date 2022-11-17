package Java.SegundoPeriodo.Recursao;

public class Palindromo {
    public static int contador =0;
    public static void main(String[] args) {
        String palavra = "ata";


        // verificaPalindromo(palavra,palavra.length()-1) true
        System.out.printf("a palavra \"%s\" %s um palindromo",palavra,verificaPalindromo(palavra,palavra.length()-1)? "e":"nao e");



    }
    // n = 2
    public static Boolean verificaPalindromo(String palavra, int n){

        if (n>=0) {

           if (palavra.charAt(n) == palavra.charAt(palavra.length() - 1 - n)) {
               contador++;
           }
           verificaPalindromo( palavra, n-1);
        }
        //contador = 3,
        // 3 == 3 true
        return contador == palavra.length();
    }
}
