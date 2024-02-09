package Java.TerceiroPeriodo.EstruturaDeDados;


public class Main {
    public static void main(String[] args) throws Exception {
        ListaEstatica lista = new ListaEstatica(10);
        lista.insereInicio(90);
        lista.insereInicio(10);
        lista.insereInicio(13);
        lista.insereInicio(20);
        lista.insereInicio(22);
        lista.insereInicio(23);
        lista.insereInicio(24);
        lista.insereInicio(25);
        lista.insereInicio(26);
        lista.insereInicio(27);

        System.out.println(lista);
        System.out.println(lista);
        lista.procuraElementoRapido(10);
        System.out.println(lista);




    }
}
