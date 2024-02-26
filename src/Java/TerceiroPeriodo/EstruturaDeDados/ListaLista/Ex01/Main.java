package Java.TerceiroPeriodo.EstruturaDeDados.ListaLista.Ex01;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada encadeada = new ListaEncadeada();
        Object[] vetor = new Object[]{1,2,3,4,5};
        encadeada.listaEncadeada(vetor);
        System.out.println(encadeada);
    }
}
