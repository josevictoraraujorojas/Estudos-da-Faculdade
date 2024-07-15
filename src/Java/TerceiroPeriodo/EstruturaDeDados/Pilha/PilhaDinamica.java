package Java.TerceiroPeriodo.EstruturaDeDados.Pilha;

public class PilhaDinamica<T>{
    private NodoPilha<T> topo;
    private int tam;

    public PilhaDinamica() {
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
    public void inverter() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia");
        }
        PilhaDinamica<T> auxiliar = new PilhaDinamica();
        while (!vazia()){
            auxiliar.empilhar(this.topoDaPilha());
            this.desempilhar();
        }
        PilhaDinamica<T> auxiliar2 = new PilhaDinamica();
        while (!auxiliar.vazia()){
            auxiliar2.empilhar(auxiliar.topoDaPilha());
            auxiliar.desempilhar();
        }
        while (!auxiliar2.vazia()){
            empilhar(auxiliar2.topoDaPilha());
            auxiliar2.desempilhar();
        }
    }
    public static void retiraElementosImpares(PilhaDinamica<Integer> pilhaDinamica) throws Exception {
        if (pilhaDinamica.vazia()) {
            throw new Exception("Pilha vazia");
        }

        PilhaDinamica<Integer> pilhaImpar = new PilhaDinamica<>();
        PilhaDinamica<Integer> pilhaPar = new PilhaDinamica<>();
        while (!pilhaDinamica.vazia()){
            if (pilhaDinamica.topoDaPilha()%2==0){
                pilhaPar.empilhar(pilhaDinamica.topoDaPilha());
                pilhaDinamica.desempilhar();
            }else {
                pilhaImpar.empilhar(pilhaDinamica.topoDaPilha());
                pilhaDinamica.desempilhar();
            }
        }

        while (!pilhaPar.vazia()){
            pilhaDinamica.empilhar(pilhaPar.topoDaPilha());
            pilhaPar.desempilhar();
        }
    }
    public static void empilhaSegundaSobrePrimeira(PilhaDinamica primeira, PilhaDinamica segunda) throws Exception {
        if (primeira.vazia()&&segunda.vazia()){
            throw new Exception("Pilha vazia");
        }

        PilhaDinamica aux = new PilhaDinamica<>();
        while (!segunda.vazia()){
            aux.empilhar(segunda.topoDaPilha());
            segunda.desempilhar();
        }
        while (!aux.vazia()){
            primeira.empilhar(aux.topoDaPilha());
            aux.desempilhar();
        }
    }

    public T topoDaPilha() throws Exception {
        if (vazia()){
            throw new Exception("Pilha vazia");
        }

        return getTopo().getItem();
    }

    public int menorValor() throws Exception {
        if (vazia()){
            throw new Exception("Pilha vazia");
        }

        PilhaDinamica<T> aux = new PilhaDinamica<>();
        int menor= (int) topoDaPilha();

        while (!vazia()){
            if ((int)topoDaPilha()<menor){
                menor=(int)topoDaPilha();
            }
            aux.empilhar(topoDaPilha());
            desempilhar();
        }
        while (!aux.vazia()){
            empilhar(aux.topoDaPilha());
            aux.desempilhar();
        }
        return menor;
    }
    public int maiorValor() throws Exception {
        if (vazia()){
            throw new Exception("Pilha vazia");
        }

        PilhaDinamica<T> aux = new PilhaDinamica<>();
        int maior = (int) topoDaPilha();

        while (!vazia()){
            if ((int)topoDaPilha()> maior){
                maior =(int)topoDaPilha();
            }
            aux.empilhar(topoDaPilha());
            desempilhar();
        }
        while (!aux.vazia()){
            empilhar(aux.topoDaPilha());
            aux.desempilhar();
        }
        return maior;
    }
    public float mediaValor() throws Exception {
        if (vazia()){
            throw new Exception("Pilha vazia");
        }

        PilhaDinamica<T> aux = new PilhaDinamica<>();
        double maior = 0;

        while (!vazia()){
            maior +=(int)topoDaPilha();

            aux.empilhar(topoDaPilha());
            desempilhar();
        }
        while (!aux.vazia()){
            empilhar(aux.topoDaPilha());
            aux.desempilhar();
        }
        return (float) (maior/this.tam);
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
