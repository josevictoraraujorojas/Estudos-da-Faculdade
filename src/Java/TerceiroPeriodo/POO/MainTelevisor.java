package Java.TerceiroPeriodo.POO;

public class MainTelevisor {
    public static void main(String[] args) {
        Televisor t1= new Televisor(10,5);
        System.out.println(t1.mostrar());

        t1.aumentarVolume();
        t1.trocarCanal(4);

        System.out.println(t1.mostrar());
    }
}
