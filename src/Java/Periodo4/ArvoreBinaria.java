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

    public  void retirar(Object item) {
        this.raiz = retirar(item, raiz);
    }
    private Nodo retirar(Object item, Nodo p) {
        if (p == null) {
            return null; // N� n�o encontrado
        } else if ((int) item < (int) p.item) {
            // O item est� na sub�rvore esquerda
            p.esquerda = retirar(item, p.esquerda);
        } else if ((int) item > (int) p.item) {
            // O item est� na sub�rvore direita
            p.direita = retirar(item, p.direita);
        } else {
            // O item � igual ao item do n� atual (n� a ser removido encontrado)
            if (p.esquerda == null && p.direita == null) {
                // Caso 1: N� sem filhos
                return null;
            } else if (p.esquerda == null) {
                // Caso 2: N� com um filho � direita
                return p.direita;
            } else if (p.direita == null) {
                // Caso 2: N� com um filho � esquerda
                return p.esquerda;
            } else {
                // Caso 3: N� com dois filhos
                Nodo antecessor = encontrarAntecessor(p,p.esquerda);
            }
        }
        return p;
    }

    private Nodo encontrarAntecessor(Nodo q, Nodo r) {
        // O antecessor � o maior valor na sub�rvore � esquerda

        if(r.direita!=null){
            r.direita=encontrarAntecessor(q, r.direita);
        }else {
            q.item=r.item;
            r=r.esquerda;
        }
        return r;
    }


    public void imprimiArvoreOrdem(){
        imprimiArvoreOrdem(this.raiz);
    }
    private void imprimiArvoreOrdem(Nodo p) {
        if (p == null) {
            return;
        }
        imprimiArvoreOrdem(p.esquerda); // Visita a sub�rvore esquerda
        System.out.println(p.item); // Imprime o item do n� atual
        imprimiArvoreOrdem(p.direita); // Visita a sub�rvore direita
    }
    public void imprimiArvorePosfixa(){
        imprimiArvorePosfixa(this.raiz);
    }
    private void imprimiArvorePosfixa(Nodo p) {
        if (p == null) {
            return;
        }
        imprimiArvorePosfixa(p.esquerda); // Visita a sub�rvore esquerda
        imprimiArvorePosfixa(p.direita); // Visita a sub�rvore direita
        System.out.println(p.item); // Imprime o item do n� atual
    }

    public Object busca(Object item){
        return  busca(item, this.raiz);
    }
    private Object busca(Object item, Nodo p) {
        if (p == null) {
            return null; // Item n�o encontrado
        } else if ((int)item <(int) p.item) {
            // Item � menor, buscar na sub�rvore esquerda
            return busca(item, p.esquerda);
        } else if ((int)item >(int) p.item) {
            // Item � maior, buscar na sub�rvore direita
            return busca(item, p.direita);
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
