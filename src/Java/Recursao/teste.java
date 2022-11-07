package Java.Recursao;

public class teste {
    public static void main(String[] args) {

        System.out.println(recursao(4));

    }
    public static int recursao(int n){
        if (n==1) {
            return n;
        }
        return  n*recursao(n-1);
    }
}
