package Java.TerceiroPeriodo.EstruturaDeDados.Exs.Ex4;

public class VetorDinamico {
    private No inicio;
    private No ultimo;
    private int tamanho;
    public void adiciona(int valor) {
        No celula = new No(valor);
        if (this.tamanho==0) {
            this.inicio = celula;
        }else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo=celula;
        this.tamanho++;
    }

    public void busca(int valor){
        StringBuilder builder = new StringBuilder();
        No atual = this.inicio;
        builder.append(atual.getElemento()+","+atual.getProximo());
        for (int i = 0; i <tamanho ; i++) {
            if (atual.getElemento()==valor){
                System.out.println(atual.getElemento());
                return;
            }
            atual=atual.getProximo();
        }

        System.out.println("valor inesxistente");
    }
    public void remove( int valor){
        StringBuilder builder = new StringBuilder();
        No atual = this.inicio;
        builder.append(atual.getElemento()+","+atual.getProximo());
        for (int i = 0; i <tamanho ; i++) {
            if (atual.getElemento()==valor){
                atual.setProximo(null);
                atual.setElemento(0);
                return;
            }
            atual=atual.getProximo();
        }

        System.out.println("valor inesxistente");
    }

    @Override
    public String toString() {
        return "VetorDinamico{" +
                "inicio=" + inicio +
                ", ultimo=" + ultimo +
                ", tamanho=" + tamanho +
                '}';
    }

    public int getTamanho() {
        return tamanho;
    }

}
