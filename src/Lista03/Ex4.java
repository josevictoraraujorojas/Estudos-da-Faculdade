package Lista03;

public class Ex4 {
    public static void main(String[] args) {
//        Quest�o 4 Escreva um programa que some os n�meros de 1 a 10 usando o la�o White e o operador de incremento
//                (++) para controlar o la�o.

        int i=1;
        int soma=0;
        while (i<=10)
        {
            soma+=i;
            i++;
            System.out.println("soma: "+soma);
            System.out.println("repeticao: "+i);
        }
        System.out.println("resultado "+soma);
    }
}
