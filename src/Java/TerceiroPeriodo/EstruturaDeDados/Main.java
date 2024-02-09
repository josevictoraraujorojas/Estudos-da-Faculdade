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

        System.out.println(lista);
        lista.removeInicio();
        System.out.println(lista);
        lista.insereNoMeio(20);
        System.out.println(lista);




    }
}
