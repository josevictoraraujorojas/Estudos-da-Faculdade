package Java.TerceiroPeriodo.EstruturaDeDados.ListaLista.Ex01;

public class ListaEncadeada {
    No inicio;
    No ultimo;
    int tamanho;

    public ListaEncadeada() {
        inicio = new No();
        this.ultimo = inicio;
        this.tamanho = 0;
    }

    public void listaEncadeada(Object[] vetor) {
        for (int i = 0; i < vetor.length ; i++) {
            No novo = new No();
            this.ultimo.proximo=novo;
            this.ultimo.proximo.elemento=vetor[i];
            this.ultimo=ultimo.proximo;
            this.tamanho++;
        }
    }

    @Override
    public String toString() {
        return "Ex01{" +
                "inicio=" + inicio +
                ", ultimo=" + ultimo +
                ", tamanho=" + tamanho +
                '}';
    }
}
