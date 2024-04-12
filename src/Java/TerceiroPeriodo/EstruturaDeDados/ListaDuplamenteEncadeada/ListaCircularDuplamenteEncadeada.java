package Java.TerceiroPeriodo.EstruturaDeDados.ListaDuplamenteEncadeada;

public class ListaCircularDuplamenteEncadeada {
    Nodo2 head;

    ListaCircularDuplamenteEncadeada() {
        head = null;
    }

    public Nodo2 getHead() {
        return head;
    }

    public void setHead(Nodo2 head) {
        this.head = head;
    }

    public void insere(Object x) {
        Nodo2 novoNo = new Nodo2(x);
        if (vazia()) {
            novoNo.setAnterior(novoNo);
            novoNo.setProximo(novoNo);
            setHead(novoNo);
        } else {
// guardo a posicao do antigo ultimo item
            Nodo2 aux = head.getAnterior();
// atualizo as referências do novo nodo
            novoNo.setAnterior(aux);
            novoNo.setProximo(head);
            aux.setProximo(novoNo);
            head.setAnterior(novoNo);
        }

    }

    public boolean vazia(){
        return head==null;
    }
    public static int posicaoDoNodo(Object elemento,ListaCircularDuplamenteEncadeada lista) throws Exception {
        if (lista.vazia()){
            throw new Exception("lista vazia");
        }
        int count=0;
        Nodo2 atual = lista.getHead();
        do {
            count++;
            if (atual.getItem().equals(elemento)){
                return count;
            }
            atual=atual.getProximo();
        }while (atual!=lista.getHead());
        return -1;
    }
    public static void adicnaAposOElemento(Object n1,Object n2,ListaCircularDuplamenteEncadeada lista) throws Exception {
        if (lista.vazia()){
            throw new Exception("lista vazia");
        }
        Nodo2 novo = new Nodo2(n2);
        Nodo2 atual = lista.getHead();
        do {
            if (atual.getItem().equals(n1)){
                Nodo2 auxiliar = atual.getProximo();
                atual.setProximo(novo);
                auxiliar.setAnterior(novo);
                novo.setAnterior(atual);
                novo.setProximo(auxiliar);
            }
            atual=atual.getProximo();
        }while (atual!=lista.getHead());
    }

    public int tamanho() throws Exception {
        if (vazia()){
            throw new Exception("lista vazia");
        }
        int count=0;
        Nodo2 atual = getHead();
        do {
            count++;
            atual=atual.getProximo();
        }while (atual!=getHead());
        return count;
    }
    public void imprimi() throws Exception {
        if (vazia()){
            throw new Exception("lista vazia");
        }
        int count=0;
        Nodo2 atual = getHead();
        do {
            System.out.println(atual.getAnterior().getItem()+"||"+atual.getItem()+"||"+atual.getProximo().getItem());
            atual=atual.getProximo();
        }while (atual!=getHead());

    }

    @Override
    public String toString() {
        return "ListaCircularDuplamenteEncadeada{" +
                "head=" + getHead() +
                '}';
    }
}