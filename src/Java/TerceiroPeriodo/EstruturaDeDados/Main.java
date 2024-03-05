package Java.TerceiroPeriodo.EstruturaDeDados;


public class Main {
    public static void main(String[] args) throws Exception {
       /* ListaEstatica lista = new ListaEstatica(10);
        lista.insereInicio(90);
        lista.insereInicio(10);
        lista.insereInicio(13);
        lista.insereInicio(20);
        lista.insereInicio(22);
        lista.insereInicio(23);
        lista.insereInicio(24);
        System.out.println(lista);
        lista.removeMeio(20);
        System.out.println(lista);
        lista.procuraIndiceIdealEInssere(20);
        System.out.println(lista);
        System.out.println(lista.procuraElementoRapido(20));*/

        ListaCircular circular = new ListaCircular();
        circular.adicionaInicio(12);
        circular.adicionaInicio(13);
        circular.adicionaInicio(14);
        circular.adicionaInicio(15);
        circular.adicionaInicio(16);
        circular.adicionaInicio(17);
        circular.adicionaInicio(18);
        circular.adicionaInicio(19);
        circular.imprimi();

    }
}
