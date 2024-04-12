package Java.TerceiroPeriodo.EstruturaDeDados.AlocacaoDeMemoria.Ex03;

public class No {
    private int elemento;
    private Java.TerceiroPeriodo.EstruturaDeDados.ListaSimplesmenteEncadeada.No proximo;

    public No(int dado, Java.TerceiroPeriodo.EstruturaDeDados.ListaSimplesmenteEncadeada.No proximo) {
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

    public Java.TerceiroPeriodo.EstruturaDeDados.ListaSimplesmenteEncadeada.No getProximo() {
        return proximo;
    }

    public void setProximo(Java.TerceiroPeriodo.EstruturaDeDados.ListaSimplesmenteEncadeada.No proximo) {
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
