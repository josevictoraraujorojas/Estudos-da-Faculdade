package Java.TerceiroPeriodo.POO;

public class MainTelevisor {
    public static void main(String[] args) {
        Televisor t1= new Televisor();
        t1.volume=10;
        t1.canal=11;
        System.out.println(t1.mostrar());

        t1.aumentarVolume();
        t1.trocarCanal(4);

        System.out.println(t1.mostrar());
    }
}
