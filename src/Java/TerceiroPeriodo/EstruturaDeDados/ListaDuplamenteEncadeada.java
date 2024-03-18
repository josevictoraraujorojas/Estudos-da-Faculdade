package Java.TerceiroPeriodo.EstruturaDeDados;

public class ListaDuplamenteEncadeada {
        private Nodo2 head;
        private Nodo2 ultimo;

        public ListaDuplamenteEncadeada() {
            this.head = null;
            this.ultimo = this.head;
        }

        public void insereInicio(Object elemento){
            // aloca espaco e atualiza ponteiros do novo nodo
            Nodo2 novoNo = new Nodo2(elemento );
            novoNo.setAnterior(null);
            novoNo.setProximo(head);
            if (!vazia())
                head.setAnterior(novoNo);
            else
                ultimo = novoNo;

            head = novoNo;
        }
        public void insereFinal(Object elemento){
            Nodo2 novo = new Nodo2(elemento);
            novo.setProximo(null);
            novo.setAnterior(ultimo);
            if (vazia()){
                setHead(novo);
            }else {
                ultimo.setProximo(novo);
            }
            setUltimo(novo);
        }
        public void insereMeio(Object elemento){
            Nodo2 novo = new Nodo2(elemento);
            if (vazia()) {
                setHead(novo);
                setUltimo(novo);
                novo.setProximo(null);
                novo.setAnterior(null);
            }
            else if (getHead().getItem().equals(elemento)){
                insereInicio(elemento);
            }
            else if (getUltimo().getItem().equals(elemento)){
                insereFinal(elemento);
            }else {
                Nodo2 atual = head;
                do {
                    atual=atual.getProximo();
                } while (atual != getHead() && (int) atual.getItem() < (int) elemento);
                Nodo2 auxiliar = atual.getProximo();
                atual.setProximo(novo);
                novo.setProximo(auxiliar);
                auxiliar.setAnterior(novo);
                novo.setAnterior(atual);
            }

        }

        public boolean vazia(){
            return this.head==null;
        }

        public void imprimi() throws Exception {
            if (vazia()){
                throw new Exception("Lista vazia");
            }
            System.out.println("___________________________");
            Nodo2 atual = getHead();
            do {
                if (atual == head) {
                    System.out.println(atual.getItem()+"|"+atual.getProximo().getItem());
                }else if (atual == ultimo) {
                    System.out.println(atual.getAnterior().getItem()+"|"+atual.getItem());
                }else {
                    System.out.println(atual.getAnterior().getItem()+"|"+atual.getItem()+"|"+atual.getProximo().getItem());
                }
                atual=atual.getProximo();
            }while (atual!=null);
            System.out.println("___________________________");
        }

    public Nodo2 getHead() {
        return head;
    }

    public void setHead(Nodo2 head) {
        this.head = head;
    }

    public Nodo2 getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo2 ultimo) {
        this.ultimo = ultimo;
    }

}

