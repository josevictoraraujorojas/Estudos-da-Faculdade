package Java.TerceiroPeriodo.EstruturaDeDados.ListaLista.Ex02;

public class ListaEncadeada {
    No inicio;
    No ultimo;
    int tamanho;

    public ListaEncadeada() {
        this.inicio = new No();
        this.ultimo = this.inicio;
        this.tamanho = 0;
    }
    public void adicionaElemento(Object elemento){
        No novo = new No();
        novo.elemento=elemento;
        this.ultimo.proximo=novo;
        this.ultimo=ultimo.proximo;
        this.tamanho++;
    }
    public boolean verificaVazio(){
        return this.tamanho==0;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                ", ultimo=" + ultimo +
                ", tamanho=" + tamanho +
                '}';
    }
}
