package Java.Lista03;

public class Ex5 {
    public static void main(String[] args) {
//        Questão 5 Explique duas maneiras de alterar o exercício anterior para somar apenas os números pares de 1 e 10.

        int i = 1;
        int soma = 0;
        while (i <= 10) {
            i++;
            System.out.println("i: "+i);
            if (i%2==0)
            {
                soma+=i;
                System.out.println("soma: "+soma);
            }
        }
        System.out.println("resultado final " + soma);

         i = 1;
         soma = 0;
        while (i <= 10) {
            i++;
            System.out.println("i: "+i);
            if (i%3!=0 && i!=1 )
            {
                soma+=i;
                System.out.println("soma: "+soma);
            }
        }
        System.out.println("resultado final " + soma);
    }
}
