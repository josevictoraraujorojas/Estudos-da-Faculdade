package Java.TerceiroPeriodo.EstruturaDeDados;

public class No {
    private int elemento;
    private No proximo;

    public No(int dado, No proximo) {
        this.elemento = dado;
        this.proximo = proximo;
    }

    public No(int dado) {
        this.elemento = dado;
        this.proximo = null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
