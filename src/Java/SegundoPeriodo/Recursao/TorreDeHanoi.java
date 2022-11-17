package Java.SegundoPeriodo.Recursao;

public class TorreDeHanoi {
    public static void main(String[] args) {
        hanoi(3,1,2,3);
    }
    public static void hanoi (int n, int pilarOriginal, int pilarAuxiliar, int pilarDestino){
        if (n>0){
            hanoi(n-1, pilarOriginal, pilarDestino, pilarAuxiliar);
            System.out.println(pilarOriginal +"->"+ pilarDestino);
            hanoi(n-1, pilarAuxiliar, pilarOriginal, pilarDestino);
        }
    }
}
