package Java.PrimeiroPeriodo.LacoDeRepeticao;

public class Ex17 {
    public static void main(String[] args) {
//        Quest�o 17 Escreva o comando de um la�o de repeti��o fore outro do while para imprimir ?oi?15 vezes sem
//        utilizar os operados ++, - -, += 1 ou -=1, ou seja, n�o programar o la�o para caminhar de 1 em 1.

        int num=1;
        do {
            num=num+2;
            System.out.println("oi");
        }while (num<=30);
    }
}
