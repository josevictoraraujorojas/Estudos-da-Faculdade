package Java.TerceiroPeriodo.EstruturaDeDados;


public class Main {
    public static void main(String[] args) throws Exception {
        ListaEstatica lista = new ListaEstatica(10);
        lista.insereInicio(11);
        lista.insereInicio(12);
        lista.insereInicio(13);
        lista.insereInicio(14);
        lista.insereInicio(15);
        lista.insereInicio(16);
        System.out.println(lista);
        lista.procuraElementoRapido(14);

        lista.insereProximoIndice(lista,15,30);
        System.out.println(lista);
        lista.insereFinal(20);
        lista.insereNoMeio(4,10);
        System.out.println(lista);
        System.out.println(lista.tamanho());
        System.out.println(lista.validaPos(9));



    }
}
