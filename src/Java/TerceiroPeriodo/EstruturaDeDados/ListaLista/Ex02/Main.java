package Java.TerceiroPeriodo.EstruturaDeDados.ListaLista.Ex02;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionaElemento(11);
        lista.adicionaElemento(12);
        lista.adicionaElemento(13);
        lista.adicionaElemento(14);
        lista.adicionaElemento(15);
        System.out.println(lista);
        VetorBaseadoNaLIsta vetor = new VetorBaseadoNaLIsta(lista);
        vetor.adicionaElementos();
        System.out.println(vetor);
    }
}
