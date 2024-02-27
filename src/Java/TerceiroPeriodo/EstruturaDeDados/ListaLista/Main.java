package Java.TerceiroPeriodo.EstruturaDeDados.ListaLista;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada encadeada = new ListaEncadeada();
        Object[] vetor = new Object[]{10,11,12,13,14};
        encadeada.adicionaElementoInicio(1);
        encadeada.adicionaElementoInicio(2);
        encadeada.adicionaElementoInicio(3);
        encadeada.adicionaElementoInicio(4);
        encadeada.adicionaElementoInicio(5);
        System.out.println(encadeada);
        System.out.println(encadeada.listaElemntosPares());
        System.out.println(encadeada.adicionaApartirVetor(vetor));

    }
}
