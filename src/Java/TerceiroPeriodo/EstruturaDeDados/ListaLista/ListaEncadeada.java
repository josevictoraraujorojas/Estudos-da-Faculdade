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

    //ex01
    public ListaEncadeada(Object[] vetor) {
        inicio = new No();
        this.ultimo = inicio;
        this.tamanho = 0;

        for (int i = 0; i < vetor.length ; i++) {
            No novo = new No();
            novo.elemento=vetor[i];
            this.ultimo.proximo=novo;
            this.ultimo=this.ultimo.proximo;
            this.tamanho++;
        }
    }
    public void adicionaElementoInicio(Object elemento){
        No novo = new No();
        novo.elemento=elemento;
        this.ultimo.proximo=novo;
        this.ultimo=ultimo.proximo;
        this.tamanho++;
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

    //ex19
    public void removeOcorrencia(Object elemnto){
        No atual = this.inicio.proximo;
        No anterior = inicio;

        while (atual!=null){
            if (atual.elemento == elemnto) {
                anterior.proximo = atual.proximo;
                atual = atual.proximo;
                this.tamanho--;
            } else {
                anterior = atual;
                atual = atual.proximo;
            }
        }

        ultimo=anterior;
    }
    //ex07
    public boolean verificaListaCrescente(){
        No atual = this.inicio.proximo;
        for (int i = 0; i < this.tamanho ; i++) {
            if ((int)atual.elemento>(int)atual.proximo.elemento){
                return false;
            }
            atual=atual.proximo;

        }
        return true;
    }
    public int somaElementos(){
        No atual = this.inicio.proximo;
        int soma = 0;
        for (int i = 0; i < tamanho ; i++) {
           soma+=(int)atual.elemento;
            atual=atual.proximo;
        }
        return soma;
    }
    //ex07
    public boolean verificaListaDecrescente(){
        No atual = inicio.proximo;
        for (int i = 0; i < this.tamanho ; i++) {
            if ((int)atual.elemento<(int)atual.proximo.elemento){
                return false;
            }
            atual=atual.proximo;

        }
        return true;
    }
    public ListaEncadeada listaElemntosPares(){
        ListaEncadeada listaPar = new ListaEncadeada();
        No atual = inicio.proximo;
        for (int i = 0; i < this.tamanho ; i++) {
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
    //Ex06
    public boolean trocaDoisElementos(Object x,Object y){
        No atual = this.inicio.proximo;
        No anterior = this.inicio;
        No primeiraTroca = new No();
        primeiraTroca.elemento=x;
        No segundaTroca = new No();
        int troca =0;
        segundaTroca.elemento=y;
        for (int i = 0; i < this.tamanho ; i++) {
            if (atual.elemento==y){
                anterior.proximo=primeiraTroca;
                primeiraTroca.proximo=atual.proximo;
                troca++;
            }else if (atual.elemento==x){
                anterior.proximo= segundaTroca;
                segundaTroca.proximo=atual.proximo;
                troca++;
            }
            anterior = atual;
            atual = atual.proximo;
        }
        return troca==2;
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
