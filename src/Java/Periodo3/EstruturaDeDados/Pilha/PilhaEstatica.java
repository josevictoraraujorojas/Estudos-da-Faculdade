package Java.Periodo3.EstruturaDeDados.Pilha;

public class PilhaEstatica {
    private Object item[];
    private int topo;

    public PilhaEstatica(int maxTam) {
        this.item = new Object[maxTam];
        this.topo = 0;
    }

    public void empilhar(Object elemnto) throws Exception {
        if (cheio()){
            throw new Exception("Estouro de pilha");
        }
        this.item[topo]=elemnto;
        this.topo++;
    }
    public Object desempilhar() throws Exception {
        if (vazio()){
            throw new Exception("pilha vazia");
        }
        this.topo--;

        return this.item[topo];
    }

    public Object topo() throws Exception {
        if (vazio()){
            throw new Exception("pilha vazia");
        }
        return this.item[this.topo-1];
    }
    public void imprimi() throws Exception {
        if (vazio()){
            throw new Exception("pilha vazia");
        }
        for (int i = 0; i < topo ; i++) {
            System.out.println(this.item[i]);
        }
    }

    public boolean cheio(){
        return topo==this.item.length;
    }
    public boolean vazio(){
        return this.topo==0;
    }
}
