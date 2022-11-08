package Java.Recursao;

public class TorreDeHanoi {
    public static void main(String[] args) {
        hanoi(4,1,2,3);
    }
    public static void hanoi (int n, int po, int pi, int pd){
        if (n>0){
            hanoi(n-1,po,pd,pi);
            System.out.println(po+"->"+pd);
            hanoi(n-1,pi,po,pd);
        }
    }
}
