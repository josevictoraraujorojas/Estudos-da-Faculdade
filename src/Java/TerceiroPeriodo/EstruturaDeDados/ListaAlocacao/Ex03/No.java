package Java.TerceiroPeriodo.EstruturaDeDados.ListaAlocacao.Ex03;

public class No {
    private int elemento;
    private Java.TerceiroPeriodo.EstruturaDeDados.No proximo;

    public No(int dado, Java.TerceiroPeriodo.EstruturaDeDados.No proximo) {
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

    public Java.TerceiroPeriodo.EstruturaDeDados.No getProximo() {
        return proximo;
    }

    public void setProximo(Java.TerceiroPeriodo.EstruturaDeDados.No proximo) {
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
