package Java.TerceiroPeriodo.EstruturaDeDados;

public class Nodo2 {
    private Object item;
    private Nodo2 anterior;
    private Nodo2 proximo;

    public Nodo2(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Nodo2 getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo2 anterior) {
        this.anterior = anterior;
    }

    public Nodo2 getProximo() {
        return proximo;
    }

    public void setProximo(Nodo2 proximo) {
        this.proximo = proximo;
    }
}
