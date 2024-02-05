package Java.TerceiroPeriodo.POO;

import java.util.ArrayList;

public class MainTelevisor {
    public static void main(String[] args) {
        Televisor t1= new Televisor(10,5);
        Televisor t2= new Televisor(11,7);
        Televisor t3= new Televisor(5,9);

        t1.aumentarVolume();
        t1.reduzirVolume();
        t1.trocarCanal(4);

        ArrayList<Televisor> televisores = new ArrayList<>();
        televisores.add(t1);
        televisores.add(t2);
        televisores.add(t3);
        int i = 0;
        for (Televisor televisor:televisores) {
            i++;
            System.out.println("Informacoes do televisor "+i+":"+televisor.mostrar());
        }

    }
}
