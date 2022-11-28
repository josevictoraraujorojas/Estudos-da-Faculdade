package Java.SegundoPeriodo.Recursao;

public class Palindromo {
    public static int contador =0;
    public static void main(String[] args) {
        String palavra = "amor e roma";

        System.out.printf("a palavra \"%s\" %s um palindromo",palavra,verificaPalindromo(palavra,palavra.length()-1,0)? "e":"nao e");
    }


    public static Boolean verificaPalindromo(String palavra, int fim, int inicio){


        if (inicio<=fim)
        {

           if (palavra.charAt(inicio) == palavra.charAt(fim))
           {
               contador++;
           }
           verificaPalindromo( palavra, fim-1, inicio+1);
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
