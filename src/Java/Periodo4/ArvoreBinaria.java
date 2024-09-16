package Java.Periodo4;

public class ArvoreBinaria {
    public class Nodo{
        Object item;
        Nodo esquerda;
        Nodo direita;

        public Nodo(Object item) {
            this.item = item;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
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

    public void inserir(Object item) {
        this.raiz = insere(item, raiz);
    }

    private Nodo insere(Object item, Nodo p) {
        if (p == null) {
            // Cria um novo Nodo e o retorna
            return new Nodo(item);
        } else if ((int)item <(int) p.item) {
            // Insere na sub�rvore esquerda
            p.esquerda = insere(item, p.esquerda);
        } else if ((int)item >(int) p.item) {
            // Insere na sub�rvore direita
            p.direita = insere(item, p.direita);
        }
        // Retorna o n� atual para que as refer�ncias dos filhos possam ser atualizadas corretamente
        return p;
    }

    public void imprimiArvoreOrdem(){
        imprimiArvoreOrdemRecursao(this.raiz);
    }
    private void imprimiArvoreOrdemRecursao(Nodo p) {
        if (p == null) {
            return;
        }
        imprimiArvoreOrdemRecursao(p.esquerda); // Visita a sub�rvore esquerda
        System.out.println(p.item); // Imprime o item do n� atual
        imprimiArvoreOrdemRecursao(p.direita); // Visita a sub�rvore direita
    }
    public void imprimiArvorePosfixa(){
        imprimiArvorePosfixaRecursao(this.raiz);
    }
    private void imprimiArvorePosfixaRecursao(Nodo p) {
        if (p == null) {
            return;
        }
        imprimiArvorePosfixaRecursao(p.esquerda); // Visita a sub�rvore esquerda
        imprimiArvorePosfixaRecursao(p.direita); // Visita a sub�rvore direita
        System.out.println(p.item); // Imprime o item do n� atual
    }

    public Object busca(Object item){
        return  buscaRecursao(item, this.raiz);
    }
    private Object buscaRecursao(Object item, Nodo p) {
        if (p == null) {
            return null; // Item n�o encontrado
        } else if ((int)item <(int) p.item) {
            // Item � menor, buscar na sub�rvore esquerda
            return buscaRecursao(item, p.esquerda);
        } else if ((int)item >(int) p.item) {
            // Item � maior, buscar na sub�rvore direita
            return buscaRecursao(item, p.direita);
        } else {
            // Item encontrado
            return p.item;
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
