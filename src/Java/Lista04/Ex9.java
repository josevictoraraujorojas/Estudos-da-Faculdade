package Java.Lista04;



public class Ex9 {
    public static void main(String[] args) {
//        Quest�o 9 Escreva um programa em Java que encontre o segundo menor valor em um vetor de 10 posil�oes.

        int[] c = {0, 5, 2, 3, 2, 0, 2, 2, 0, };
        int menor1 = Integer.MAX_VALUE;
        int menor2 = Integer.MAX_VALUE;
        int i = 0;

        for (i = 0; i < c.length; i++){
            if (c[i] < menor1){
                menor2 = menor1;
                menor1 = c[i];
            } else if (c[i] < menor2 && c[i] > menor1) {
                menor2 = c[i];
            }
        }
        System.out.println("O menor n�mero �: " + menor1);
        System.out.println("O segundo menor n�mero �: " + menor2);
    }
}
