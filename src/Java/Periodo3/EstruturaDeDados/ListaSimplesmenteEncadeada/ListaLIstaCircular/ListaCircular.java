package Java.Periodo3.EstruturaDeDados.ListaSimplesmenteEncadeada.ListaLIstaCircular;

public class ListaCircular {
    private Nodo novo;

    public static class Nodo {
        Object item;
        Nodo proximo;
    }

    private Nodo lista;

    public ListaCircular() {
        this.lista =new Nodo();
        this.lista.proximo=null;
    }
    //ex01
    public ListaCircular(int[] vetor) {
        for (int i = 0; i < vetor.length ; i++) {
            Nodo novo = new Nodo();
            novo.item=vetor[i];
            if (i==0){
                lista = novo;
                novo.proximo = lista;
            }else {
                novo.proximo = lista.proximo;
                lista.proximo = novo;
                lista=novo;
            }
        }
    }
    //ex02
    public int[] vetorDaLista(){
        int[] vetor = new int[tamanho()];
        Nodo atual = lista.proximo;
        int indice=0;
        do {
            vetor[indice]= (int) atual.item;
            indice++;
            atual=atual.proximo;
        }while (atual!=lista.proximo);
        return vetor;
    }
    public int tamanho(){
        int count=0;
        Nodo atual = lista.proximo;
        do {
            count++;
            atual=atual.proximo;
        }while (atual!=lista.proximo);
        return count;
    }
    public void imprimi(){
        Nodo atual = lista.proximo;
        do {
            System.out.println(atual.item+"|"+atual.proximo.item);
            atual=atual.proximo;
        }while (atual!=lista.proximo);
    }

    public boolean vazia(){
        return lista.proximo==null;
    }


}
