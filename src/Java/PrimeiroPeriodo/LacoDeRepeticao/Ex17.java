package Java.PrimeiroPeriodo.LacoDeRepeticao;

public class Ex17 {
    public static void main(String[] args) {
//        Questão 17 Escreva o comando de um laço de repetição fore outro do while para imprimir ?oi?15 vezes sem
//        utilizar os operados ++, - -, += 1 ou -=1, ou seja, não programar o laço para caminhar de 1 em 1.

        int num=1;
        do {
            num=num+2;
            System.out.println("oi");
        }while (num<=30);
    }
}
