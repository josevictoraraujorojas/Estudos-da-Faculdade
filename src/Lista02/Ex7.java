package Lista02;

public class Ex7 {
    public static void main(String[] args) {
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
