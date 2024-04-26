package Java.TerceiroPeriodo.EstruturaDeDados.Fila;

public class Fila {
    private Nodo primeiro;
    private Nodo ultimo;

    public Fila() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public Nodo getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Nodo primeiro) {
        this.primeiro = primeiro;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public void insercao(int elemento){
        Nodo novo = new Nodo(elemento);
        if (vazia()) {
            setPrimeiro(novo);
            setUltimo(novo);
        }
            getUltimo().setProx(novo);
            setUltimo(novo);
    }
    public int remocao() throws Exception {
        int elemento=0;
        if (vazia()){
            throw new Exception("Erro vazia");
        }
        elemento=getPrimeiro().getItem();
        setPrimeiro(getPrimeiro().getProx());
        if (vazia()){
            System.out.println("sua lista ficou vazia");
            setUltimo(null);
        }
        return elemento;
    }
    public boolean vazia(){
        return getPrimeiro()==null;
    }
    public void imprimi(){
        Nodo aux = getPrimeiro();
        while (aux!=null){
            System.out.print("|"+aux.getItem()+"|");
            aux=aux.getProx();
        }
        System.out.println();
    }


    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        fila.insercao(12);
        fila.insercao(13);
        fila.insercao(14);
        fila.insercao(15);
        fila.insercao(16);
        fila.imprimi();
        fila.remocao();
        fila.remocao();
        fila.remocao();
        fila.remocao();
        fila.remocao();
        fila.imprimi();

    }
}
