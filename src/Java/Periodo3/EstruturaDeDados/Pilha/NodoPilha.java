package Java.Periodo3.EstruturaDeDados.Pilha;

public class NodoPilha <T>{
    private T item;
    private NodoPilha <T> proximio;

    public NodoPilha(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public NodoPilha<T> getProximio() {
        return proximio;
    }

    public void setProximio(NodoPilha<T> proximio) {
        this.proximio = proximio;
    }
}
