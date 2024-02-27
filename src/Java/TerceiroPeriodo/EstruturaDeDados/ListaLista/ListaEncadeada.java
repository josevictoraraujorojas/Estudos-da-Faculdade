package Java.TerceiroPeriodo.EstruturaDeDados.ListaLista;

public class ListaEncadeada {
    No inicio;
    No ultimo;
    int tamanho;

    public ListaEncadeada() {
        inicio = new No();
        this.ultimo = inicio;
        this.tamanho = 0;
    }

    public void adicionaElementoInicio(Object elemento){
        No novo = new No();
        novo.elemento=elemento;
        this.ultimo.proximo=novo;
        this.ultimo=ultimo.proximo;
        this.tamanho++;
    }
    //ex01
    public ListaEncadeada(Object[] vetor) {
        ListaEncadeada lista = new ListaEncadeada();
        for (int i = 0; i < vetor.length ; i++) {
            No novo = new No();
            novo.elemento=vetor[i];
            lista.ultimo.proximo=novo;
            lista.ultimo=lista.ultimo.proximo;
            lista.tamanho++;
        }
    }

    //Ex02
    public Object[] vetorDaLista(){
        if (vazio()){
            Object[] vetor = new Object[tamanho];
            No atual = inicio.proximo;
            for (int i = 0; i <vetor.length ; i++) {
               vetor[i]= atual.elemento;
               atual=atual.proximo;
            }
            return vetor;
        }
        return null;
    }

    //Ex03
    public ListaEncadeada  concatenaDuasListas(ListaEncadeada lista1,ListaEncadeada  lista2){
        lista1.ultimo.proximo=lista2.inicio.proximo;
         ListaEncadeada lista3 = new ListaEncadeada();
        lista3.inicio.proximo=lista1.inicio.proximo;
        return lista3;
    }

    //Ex07
    public ListaEncadeada listaElemntosPares(){
        ListaEncadeada listaPar = new ListaEncadeada();
        No atual = inicio.proximo;
        for (int i = 0; i < tamanho ; i++) {
            if ((int)atual.elemento%2==0){
                No auxiliar = new No();
                auxiliar.elemento=atual.elemento;
                listaPar.ultimo.proximo=auxiliar;
                listaPar.ultimo= listaPar.ultimo.proximo;
            }
            atual=atual.proximo;
        }
        return listaPar;
    }

    public boolean vazio(){
        return tamanho==0;
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
