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
            // Insere na subárvore esquerda
            p.esquerda = insere(item, p.esquerda);
        } else if ((int)item >(int) p.item) {
            // Insere na subárvore direita
            p.direita = insere(item, p.direita);
        }
        // Retorna o nó atual para que as referências dos filhos possam ser atualizadas corretamente
        return p;
    }

    public  void retirar(Object item) {
        this.raiz = retirar(item, raiz);
    }
    private Nodo retirar(Object item, Nodo p) {
        if (p == null) {
            return null; // Nó não encontrado
        } else if ((int) item < (int) p.item) {
            // O item está na subárvore esquerda
            p.esquerda = retirar(item, p.esquerda);
        } else if ((int) item > (int) p.item) {
            // O item está na subárvore direita
            p.direita = retirar(item, p.direita);
        } else {
            // O item é igual ao item do nó atual (nó a ser removido encontrado)
            if (p.esquerda == null && p.direita == null) {
                // Caso 1: Nó sem filhos
                return null;
            } else if (p.esquerda == null) {
                // Caso 2: Nó com um filho à direita
                return p.direita;
            } else if (p.direita == null) {
                // Caso 2: Nó com um filho à esquerda
                return p.esquerda;
            } else {
                // Caso 3: Nó com dois filhos
                Nodo antecessor = encontrarAntecessor(p,p.esquerda);
            }
        }
        return p;
    }

    private Nodo encontrarAntecessor(Nodo q, Nodo r) {
        // O antecessor é o maior valor na subárvore à esquerda

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
        imprimiArvoreOrdem(p.esquerda); // Visita a subárvore esquerda
        System.out.println(p.item); // Imprime o item do nó atual
        imprimiArvoreOrdem(p.direita); // Visita a subárvore direita
    }
    public void imprimiArvorePosfixa(){
        imprimiArvorePosfixa(this.raiz);
    }
    private void imprimiArvorePosfixa(Nodo p) {
        if (p == null) {
            return;
        }
        imprimiArvorePosfixa(p.esquerda); // Visita a subárvore esquerda
        imprimiArvorePosfixa(p.direita); // Visita a subárvore direita
        System.out.println(p.item); // Imprime o item do nó atual
    }

    public Object busca(Object item){
        return  busca(item, this.raiz);
    }
    private Object busca(Object item, Nodo p) {
        if (p == null) {
            return null; // Item não encontrado
        } else if ((int)item <(int) p.item) {
            // Item é menor, buscar na subárvore esquerda
            return busca(item, p.esquerda);
        } else if ((int)item >(int) p.item) {
            // Item é maior, buscar na subárvore direita
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
