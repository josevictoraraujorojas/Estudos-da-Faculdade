package Java.Periodo4;

public class ArvoreAvl {
    public class Nodo{
        Object item;
        Nodo pai;
        Nodo esquerda;
        Nodo direita;
        int fatorBalanceamento;

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

        public Nodo getPai() {
            return pai;
        }

        public void setPai(Nodo pai) {
            this.pai = pai;
        }

        public int getFatorBalanceamento() {
            return fatorBalanceamento;
        }

        public void setFatorBalanceamento(int fatorBalanceamento) {
            this.fatorBalanceamento = fatorBalanceamento;
        }
    }
    private Nodo raiz;
    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(Object item) {
        this.raiz = insere(item,null ,raiz);
        System.out.println("----------------Arvore antes do balanceamento--------------------");
        imprimiArvoreOrdem();
        this.raiz = balanceia(raiz);
        System.out.println("----------------Arvore dps do balanceamento--------------------");
        imprimiArvoreOrdem();
    }

    private Nodo insere(Object item,Nodo pai, Nodo p) {

        if (p == null) {
            // Cria um novo Nodo e o retorna
            Nodo novo = new Nodo(item);
            novo.setPai(pai);
            return novo;
        } else if ((int)item <(int) p.item) {
            // Insere na subárvore esquerda

            p.esquerda = insere(item, p,p.esquerda);
            defineFB(p);

        } else if ((int)item >(int) p.item) {
            // Insere na subárvore direita

            p.direita = insere(item, p,p.direita);
            defineFB(p);

        }
        // Retorna o nó atual para que as referências dos filhos possam ser atualizadas corretamente
        return p;
    }

    public  void retirar(Object item) {
        this.raiz = retirar(item, raiz);

        System.out.println("------------antes de balancear--------------");
        imprimiArvoreOrdem();


        this.raiz = balanceia(raiz);

        System.out.println("------------dps de balancear--------------");
        imprimiArvoreOrdem();


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

        if(raiz!=null){
            defineFB(raiz);//atualiza o fator de balanceamento de cada nó
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
        System.out.println("valor item:"+p.item + " fb:"+p.fatorBalanceamento); // Imprime o item do nó atual
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

    public int altura(Nodo atual) {//Verifica a altura de um determinado nó
        if (atual == null) {//Se o nó for nulo, sua altura será -1
            return -1;
        }
        if (atual.getDireita() == null && atual.getEsquerda() == null) {//Se ele não tiver nenhum filho, sua altura será 0
            return 0;
        } else if (atual.getEsquerda() == null) {//Se o nó tiver apenas um filho, sua altura será 1 + a altura do nó filho
            return 1 + altura(atual.getDireita());
        } else if (atual.getDireita() == null) { //Mesma do passo anterior aqui
            return 1 + altura(atual.getEsquerda());
        } else { //Se ele tiver dois filhos, temos q verificar qual filho é mais "alto"
            if (altura(atual.getEsquerda()) > altura(atual.getDireita())) {//a altura do nó será a soma de 1+ a altura do filho mais alto
                return 1 + altura(atual.getEsquerda());
            } else {
                return 1 + altura(atual.getDireita());
            }
        }//e assim recursivamente, até chegar nas folhas q não terão filhos, a altura será 0 e assim a recursão para.
    }

    public void defineFB(Nodo atual) {//Define o valor de balanceamento de cada nó com base na altura (adicionei um atributo pra armazenar o balanceamento na classe nó)
        atual.setFatorBalanceamento(altura(atual.getEsquerda()) - altura(atual.getDireita()));//O valor do balanceamendo será a altura do filho da esquerda menos o da direita
        if (atual.getDireita() != null) {//verifica todos os nós
            defineFB(atual.getDireita());
        }
        if (atual.getEsquerda() != null) {//verifica todos os nós
            defineFB(atual.getEsquerda());
        }
    }

    public Nodo rotacaoADireita(Nodo atual) {
        Nodo aux = atual.getEsquerda(); //Armazena o valor do nó da esquerda do atual
        aux.setPai(atual.getPai());
        if (aux.getDireita() != null) {//tratamento para quando a árvore é degenerada
            aux.getDireita().setPai(atual);
        }
        atual.setPai(aux);
        atual.setEsquerda(aux.getDireita());//Joga o valor da direita do nó da esquerda do atual, na esquerda do atual
        aux.setDireita(atual);//troca o valor da direita do nó da esquerda pelo atual
        if (aux.getPai() != null) {//Se aux não for a raiz principal, configura o pai pra apontar pro novo nó
            if (aux.getPai().getDireita() == atual) {
                aux.getPai().setDireita(aux);
            } else if (aux.getPai().getEsquerda() == atual) {
                aux.getPai().setEsquerda(aux);
            }
        }
        defineFB(aux);//atualiza o valor do balanceamento
        return aux; //retorna o valor do nó da esquerda q é o novo pai
    }

    //mesma coisa do rotação a direita, só que invertido pra esquerda
    public Nodo rotacaoAEsquerda(Nodo atual) {
        Nodo aux = atual.getDireita();
        aux.setPai(atual.getPai());
        if (aux.getEsquerda() != null) {//tratamento para quando a árvore é degenerada
            aux.getEsquerda().setPai(atual);
        }

        atual.setPai(aux);
        atual.setDireita(aux.getEsquerda());
        aux.setEsquerda(atual);
        if (aux.getPai() != null) {
            if (aux.getPai().getDireita() == atual) {
                aux.getPai().setDireita(aux);
            } else if (aux.getPai().getEsquerda() == atual) {
                aux.getPai().setEsquerda(aux);
            }
        }
        defineFB(aux);//atualiza o valor do balanceamento
        return aux;
    }

    public Nodo rotacaoDuplaDireita(Nodo atual) {
        Nodo aux = atual.getEsquerda();//Armazena o valor do filho da esquerda
        atual.setEsquerda(rotacaoAEsquerda(aux));//faz uma rotação para a esquerda no filho da esquerda
        Nodo aux2 = rotacaoADireita(atual); //Faz uma rotação para a direita no atual/pai com o filho da esquerda já rodado
        return aux2; //retorna o nó q será o novo pai com seus filhos
    }

    //mesma coisa do de rotação dupla pra direita, só que invertido pra esquerda
    public Nodo rotacaoDuplaEsquerda(Nodo atual) {
        Nodo aux = atual.getDireita();
        atual.setDireita(rotacaoADireita(aux));
        Nodo aux2 = rotacaoAEsquerda(atual);
        return aux2;
    }

    public Nodo balanceia(Nodo atual) {//Recebe como parâmetro a raiz
        /*Se o nó atual tiver FB=2 e o seu filho da esquerda dele tiver Fb>=0,
         troca o valor dele pelo resultado da rotação a direita com ele*/
        if (atual.getFatorBalanceamento() == 2 && atual.getEsquerda().getFatorBalanceamento() >= 0) {
            atual = rotacaoADireita(atual);
            /* Senão se o nó atual tiver FB=-2 e o filho da direita dele tiver Fb<0,
             troca o valor dele pelo resultado da rotação a esquerda com ele*/
        } else if (atual.getFatorBalanceamento() == -2 && atual.getDireita().fatorBalanceamento <= 0) { //mudat dps
            atual = rotacaoAEsquerda(atual);
            /*Senão se o nó atual tiver FB=2 e o filho da esquerda dele tiver Fb<0,
             troca o valor dele pelo resultado da rotação dupla a direita com ele*/
        } else if (atual.getFatorBalanceamento() == 2 && atual.getEsquerda().getFatorBalanceamento() < 0) {
            atual = rotacaoDuplaDireita(atual);
            /*Senão se o nó atual tiver FB=-2 e o filho da direita dele tiver Fb>0,
             troca o valor dele pelo resultado da rotação dupla a esquerda com ele*/
        } else if (atual.getFatorBalanceamento() == -2 && atual.getDireita().getFatorBalanceamento() > 0) {
            atual = rotacaoDuplaEsquerda(atual);
        }
        /*Nessa parte aqui a recursão vai procurar por mais nós desbalanceados*/
        if (atual.getDireita() != null) {
            balanceia(atual.getDireita());
        }
        if (atual.getEsquerda() != null) {
            balanceia(atual.getEsquerda());
        }
        return atual; //Retorna a nova raiz com seus filhotes balanceados
    }



    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

}
