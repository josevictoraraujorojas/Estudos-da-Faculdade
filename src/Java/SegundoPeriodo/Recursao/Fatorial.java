package Java.SegundoPeriodo.Recursao;

public class Fatorial {
    public static void main(String[] args) {

        System.out.println(fatorial(4));

    }
    public static int fatorial(int n){
        if (n==1) {
            return 1;
        }
        return  n* fatorial(n-1);
    }
}
