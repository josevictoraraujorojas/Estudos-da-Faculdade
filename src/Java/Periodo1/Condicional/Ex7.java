package Java.Periodo1.Condicional;

public class Ex7 {
    public static void main(String[] args) {
//        Quest�o 7 Determine os valores de cada vari�vel ap�s o c�lculo ser realizado em cada alternativa. Admita que no
//        in�cio da execu��o de cada instru��o a vari�vel produto possui valor 10 e contador valor 2.

        int produto = 10;
        int x = 2;

        System.out.println("valores iniciais" + "\nproduto: " + produto + "\ncontador: " + x);
        produto *= x++;
        System.out.println("a) produto: " + produto);
        produto += x--;
        System.out.println("b) produto: " + produto);
        produto -= x++;
        System.out.println("c) produto: " + produto);
        x *= produto++;
        System.out.println("d) contador: " + x);
        x = produto--;
        System.out.println("e) contador: " + x);
    }
}
