package Lista03;

public class Ex4 {
    public static void main(String[] args) {
//        Questão 4 Escreva um programa que some os números de 1 a 10 usando o laço White e o operador de incremento
//                (++) para controlar o laço.

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
