package Java.SegundoPeriodo.Recursao;

public class Palindromo {
    public static int contador =0;
    public static void main(String[] args) {
        String palavra = "osso";

        System.out.printf("a palavra \"%s\" %s um palindromo",palavra,verificaPalindromo(palavra,palavra.length()-1)? "e":"nao e");
    }


    public static Boolean verificaPalindromo(String palavra, int n){

        // 2>=0 (true) && 2>=1
        if (n>=0&&n>=palavra.length()/2)
        {
            // a == a
           if (palavra.charAt(n) == palavra.charAt(palavra.length() - 1 - n))
           {
               contador++;
           }
           verificaPalindromo( palavra, n-1);
        }

        if (palavra.length()/2%2==0)
        {
            return contador == palavra.length()/2;
        }
        else
        {
            return contador == (palavra.length()/2)+1;
        }
    }
}
