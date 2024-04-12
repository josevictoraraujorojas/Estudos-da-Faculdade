package Java.TerceiroPeriodo.EstruturaDeDados.Pilha;

import Java.TerceiroPeriodo.EstruturaDeDados.Pilha.NodoPilha;

public class PilhaDinamica<T>{
    private NodoPilha<T> topo;
    private int tam;

    public PilhaDinamica(NodoPilha<T> topo, int tam) {
        this.topo = null;
        this.tam = 0;
    }

    public void empilhar(T elemento){
        NodoPilha<T> novo = new NodoPilha<>(elemento);
        novo.setProximio(getTopo());
        setTopo(novo);
        setTam(1);
    }
    public T desempilhar() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia");
        }

        T elemento= topo.getItem();
        setTopo(getTopo().getProximio());
        setTam(-1);

        return elemento;
    }
    public T topoDaPilha() throws Exception {
        if (vazia()){
            throw new Exception("Pilha vazia");
        }

        return getTopo().getItem();
    }

    public void imprimi(){
        NodoPilha<T> auxiliar = topo;
        do {
            System.out.println(auxiliar.getItem()+"|");
            auxiliar=auxiliar.getProximio();
        }while (auxiliar!=null);
    }

    public boolean vazia(){
        return this.topo == null;
    }

    public NodoPilha<T> getTopo() {
        return topo;
    }

    public void setTopo(NodoPilha<T> topo) {
        this.topo = topo;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam+=tam;
    }
}
