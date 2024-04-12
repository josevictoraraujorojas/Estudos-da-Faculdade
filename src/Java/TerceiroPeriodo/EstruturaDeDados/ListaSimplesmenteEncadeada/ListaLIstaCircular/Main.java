package Java.TerceiroPeriodo.EstruturaDeDados.ListaSimplesmenteEncadeada.ListaLIstaCircular;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4};
        ListaCircular listaCircular = new ListaCircular(vetor);
        listaCircular.imprimi();
        System.out.println(listaCircular.tamanho());
        System.out.println(Arrays.toString(listaCircular.vetorDaLista()));
    }
}
