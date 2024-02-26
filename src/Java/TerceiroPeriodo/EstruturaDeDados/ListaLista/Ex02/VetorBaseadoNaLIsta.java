package Java.TerceiroPeriodo.EstruturaDeDados.ListaLista.Ex02;

import java.util.Arrays;

public class VetorBaseadoNaLIsta {
    Object[] vetor;

    ListaEncadeada lista;

    public VetorBaseadoNaLIsta(ListaEncadeada lista) {
        this.lista = lista;
        this.vetor = new Object[this.lista.tamanho];

    }

    public void adicionaElementos() throws Exception {
        if (this.lista.verificaVazio()){
            throw new Exception("lista vazia");
        }
        No atual = this.lista.inicio.proximo;
        for (int i = 0; i < this.lista.tamanho ; i++) {
            vetor[i]=atual.elemento;
            atual=atual.proximo;
        }
    }

    @Override
    public String toString() {
        return "VetorBaseadoNaLIsta{" +
                "vetor=" + Arrays.toString(vetor) +
                '}';
    }
}
