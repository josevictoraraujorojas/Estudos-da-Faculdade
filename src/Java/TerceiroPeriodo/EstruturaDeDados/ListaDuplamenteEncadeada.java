package Java.TerceiroPeriodo.EstruturaDeDados;

public class ListaDuplamenteEncadeada {
        private Nodo2 head;
        private Nodo2 ultimo;

        public ListaDuplamenteEncadeada() {
            this.head = null;
            this.ultimo = this.head;
        }

        public void insereInicio(Object elemento){
            Nodo2 novo = new Nodo2(elemento);
            novo.setAnterior(null);
            novo.setProximo(head);
            if (vazia()){
                setUltimo(head);
            }else {
                ultimo.setAnterior(novo);
            }
            setHead(novo);
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

        public boolean vazia(){
            return this.head==null;
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

