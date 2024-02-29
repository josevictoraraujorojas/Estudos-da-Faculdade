package Java.TerceiroPeriodo.EstruturaDeDados;

public class ListaCircular {
    No inicio;
    No ultimo;
    int tamanho;

    public ListaCircular() {
        this.inicio = new No();
        this.ultimo = inicio;
    }
    public  void adicionaInicio(int elemento){
        No novo = new No(elemento);
        this.ultimo.setProximo(novo);
        this.ultimo=this.ultimo.getProximo();
        this.ultimo.setProximo(inicio.getProximo());
        tamanho++;
    }
    public void imprimi(){
        No atual = inicio.getProximo();
        for (int i = 0; i < tamanho ; i++) {
            System.out.println("Item atual:"+atual+"Proximo item:"+atual.getProximo());
            atual=atual.getProximo();
        }
    }

}
