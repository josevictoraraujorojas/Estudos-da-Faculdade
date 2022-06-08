package Lista03;

public class Ex4 {
    public static void main(String[] args) {
        int i=1;
        int soma=0;
        while (i<=10)
        {
            soma+=i;
            i++;
            System.out.println("soma: "+soma);
            System.out.println("repeticao: "+i);
        }
        System.out.println("resultado "+soma);
    }
}
