package Java.TerceiroPeriodo.EstruturaDeDados.ListaLista;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada encadeada = new ListaEncadeada();
        encadeada.adicionaElementoInicio(1);
        encadeada.adicionaElementoInicio(2);
        encadeada.adicionaElementoInicio(3);


        System.out.println(encadeada.copiaDaListaSemRepetticao());

    }
}
