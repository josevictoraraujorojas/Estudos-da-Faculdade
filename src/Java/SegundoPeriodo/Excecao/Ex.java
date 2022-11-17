package Java.SegundoPeriodo.Excecao;

public class Ex {
    public static void main(String[] args) {
        try {
            int x=5;
            int y=3;
            int[] arrway = new int[x*y/5];
            System.out.println(arrway[y]);
            System.out.print("BOB");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Unicórnio");
        }finally {
            System.out.print("flutuante");
        }

    }
}
