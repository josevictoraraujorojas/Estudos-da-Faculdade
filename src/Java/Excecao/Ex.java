package Java.Excecao;

public class Ex {
    public static void main(String[] args) {
        try {
            int x= 5;
            int y= 3;
            int[] array = new int[x*y/5];
            System.out.println(array[y]);
            System.out.print("BOB");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.print("Unicornio");
        }finally {
            System.out.print("flutuante");
        }

        /*Qual a saida do codigo
        a) Unicornio
        b) bob
        c) Unicornioflutuante
        d) bobflutuante
        e) flutuante
        */

    }
}
