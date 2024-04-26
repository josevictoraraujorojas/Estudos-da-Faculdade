package Java.TerceiroPeriodo.EstruturaDeDados.Fila;

public class Nodo {
    private int item;
    private Nodo prox;

    public Nodo(int item) {
        this.item = item;
        this.prox = null;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }
}
