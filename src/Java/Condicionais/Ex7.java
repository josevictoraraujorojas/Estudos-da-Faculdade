package Java.Condicionais;

public class Ex7 {
    public static void main(String[] args) {
//        Questão 7 Determine os valores de cada variável após o cálculo ser realizado em cada alternativa. Admita que no
//        início da execução de cada instrução a variável produto possui valor 10 e x valor 2.

        int produto = 10;
        int x = 2;

        System.out.println("valores iniciais" + "\nproduto: " + produto + "\nx: " + x);
        produto *= x++;
        System.out.println("a) produto: " + produto);
        produto += x--;
        System.out.println("b) produto: " + produto);
        produto -= x++;
        System.out.println("c) produto: " + produto);
        x *= produto++;
        System.out.println("d) x: " + x);
        x = produto--;
        System.out.println("e) x: " + x);
    }
}
