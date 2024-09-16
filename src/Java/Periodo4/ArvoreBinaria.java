package Java.Periodo4;

public class ArvoreBinaria {
    public class Nodo{
        int item;
        Nodo esquerda;
        Nodo direita;

        public Nodo(int item) {
            this.item = item;
        }

        public int getItem() {
            return item;
        }

        public void setItem(int item) {
            this.item = item;
        }

        public Nodo getEsquerda() {
            return esquerda;
        }

        public void setEsquerda(Nodo esquerda) {
            this.esquerda = esquerda;
        }

        public Nodo getDireita() {
            return direita;
        }

        public void setDireita(Nodo direita) {
            this.direita = direita;
        }
    }
    private Nodo raiz;
    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int item) {
        this.raiz = insere(item, raiz);
    }

    private Nodo insere(int item, Nodo p) {
        if (p == null) {
            // Cria um novo Nodo e o retorna
            return new Nodo(item);
        } else if (item < p.item) {
            // Insere na sub�rvore esquerda
            p.esquerda = insere(item, p.esquerda);
        } else if (item > p.item) {
            // Insere na sub�rvore direita
            p.direita = insere(item, p.direita);
        }
        // Retorna o n� atual para que as refer�ncias dos filhos possam ser atualizadas corretamente
        return p;
    }

    public void imprimiArvoreOrdem(){
        imprimiArvoreOrdemRecursao(this.raiz);
    }
    public void imprimiArvoreOrdemRecursao(Nodo p) {
        if (p == null) {
            return;
        }
        imprimiArvoreOrdemRecursao(p.esquerda); // Visita a sub�rvore esquerda
        System.out.println(p.item); // Imprime o item do n� atual
        imprimiArvoreOrdemRecursao(p.direita); // Visita a sub�rvore direita
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
