package Java.Recursao;

public class Potenciacao {
    public static void main(String[] args) {
        System.out.println(power(5,10));
    }
    public static  int power(int base,int exp){
        if (exp==0){
            return 1;
        }else {
            return base*power(base,exp-1);
        }
    }
}
