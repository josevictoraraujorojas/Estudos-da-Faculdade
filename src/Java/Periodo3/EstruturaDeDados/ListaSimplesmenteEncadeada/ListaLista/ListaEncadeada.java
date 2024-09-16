package Java.Periodo3.EstruturaDeDados.ListaSimplesmenteEncadeada.ListaLista;

public class ListaEncadeada {
    No inicio;
    No ultimo;
    int tamanho;

    public ListaEncadeada() {
        inicio = new No();
        this.ultimo = inicio;
        this.tamanho = 0;
    }

    //ex01
    public ListaEncadeada(Object[] vetor) {
        inicio = new No();
        this.ultimo = inicio;
        this.tamanho = 0;

        for (int i = 0; i < vetor.length ; i++) {
            No novo = new No();
            novo.elemento=vetor[i];
            this.ultimo.proximo=novo;
            this.ultimo=this.ultimo.proximo;
            this.tamanho++;
        }
    }

    //Ex02
    public Object[] vetorDaLista(){
        if (vazio()){
            Object[] vetor = new Object[tamanho];
            No atual = inicio.proximo;
            for (int i = 0; i <vetor.length ; i++) {
                vetor[i]= atual.elemento;
                atual=atual.proximo;
            }
            return vetor;
        }
        return null;
    }

    //Ex03
    public ListaEncadeada  concatenaDuasListas(ListaEncadeada lista1,ListaEncadeada  lista2) {
        lista1.ultimo.proximo = lista2.inicio.proximo;
        ListaEncadeada lista3 = new ListaEncadeada();
        lista3.inicio.proximo = lista1.inicio.proximo;
        return lista3;
    }
    //ex04
    public void removeOsNPrimeirosElementos(int quantidadeDElementos){
        No atual = this.inicio.proximo;
        for (int i = 0; i <tamanho ; i++) {
            if (i<quantidadeDElementos){
                atual.proximo=atual.proximo.proximo;
                return;
            }
            atual=atual.proximo;
        }
    }

    //Ex05
    public boolean buscaMaiorValor(){
        if (vazio()){
            return false;
        }
        No atual = inicio.proximo;
        int maiorElemento=(int)atual.elemento;
        int posicao=0;
        for (int i = 0; i < tamanho ; i++) {
            if (atual.proximo!=null&&maiorElemento<(int)atual.proximo.elemento){
                maiorElemento=(int)atual.proximo.elemento;
                posicao=i+1;
            }
            atual=atual.proximo;
        }
        System.out.println(maiorElemento+" "+posicao);
        return true;
    }


    //Ex06
    public boolean trocaDoisElementos(Object x,Object y){
        No atual = this.inicio.proximo;
        No anterior = this.inicio;
        No primeiraTroca = new No();
        primeiraTroca.elemento=x;
        No segundaTroca = new No();
        segundaTroca.elemento=y;
        int troca =0;
        for (int i = 0; i < this.tamanho ; i++) {
            if (atual.elemento==y){
                anterior.proximo=primeiraTroca;
                primeiraTroca.proximo=atual.proximo;
                troca++;
            }else if (atual.elemento==x){
                anterior.proximo= segundaTroca;
                segundaTroca.proximo=atual.proximo;
                troca++;
            }
            anterior = atual;
            atual = atual.proximo;
        }
        return troca==2;
    }

    //Ex07
    public ListaEncadeada listaElemntosPares(){
        ListaEncadeada listaPar = new ListaEncadeada();
        No atual = inicio.proximo;
        for (int i = 0; i < this.tamanho ; i++) {
            if ((int)atual.elemento%2==0){
                No auxiliar = new No();
                auxiliar.elemento=atual.elemento;
                listaPar.ultimo.proximo=auxiliar;
                listaPar.ultimo= listaPar.ultimo.proximo;
            }
            atual=atual.proximo;

        }
        return listaPar;
    }

    //Ex08
    public int mediaDaLista(){
        No atual = inicio.proximo;
        int media=0;
        for (int i = 0; i < tamanho ; i++) {
            media+=(int)atual.elemento;
            atual=atual.proximo;
        }
        return media/tamanho;
    }

    //ex09
    public boolean verificaListaCrescente(){
        No atual = this.inicio.proximo;
        for (int i = 0; i < this.tamanho ; i++) {
            if ((int)atual.elemento>(int)atual.proximo.elemento){
                return false;
            }
            atual=atual.proximo;

        }
        return true;
    }
    //ex09
    public boolean verificaListaDecrescente(){
        No atual = inicio.proximo;
        for (int i = 0; i < this.tamanho ; i++) {
            if ((int)atual.elemento<(int)atual.proximo.elemento){
                return false;
            }
            atual=atual.proximo;

        }
        return true;
    }

    //Ex10

    public ListaEncadeada copiaDaLista(){
        No atual = inicio.proximo;
        ListaEncadeada copia = new ListaEncadeada();
        for (int i = 0; i < this.tamanho; i++) {
            copia.adicionaElementoInicio(atual.elemento);
            atual=atual.proximo;
        }
        return copia;
    }

    //Ex11
    public ListaEncadeada copiaDaListaSemRepetticao(){
        No anterio = inicio;
        No atual = inicio.proximo;
        Object elemento;
        ListaEncadeada copia = new ListaEncadeada();
        for (int i = 0; i < this.tamanho; i++) {
            if (atual.elemento!=anterio.elemento) {
                copia.adicionaElementoInicio(atual.elemento);
                anterio=atual;
            }
            atual=atual.proximo;
        }
        return copia;
    }

    //Ex012




    //ex19
    public void removeOcorrencia(Object elemnto){
        No atual = this.inicio.proximo;
        No anterior = inicio;

        while (atual!=null){
            if (atual.elemento == elemnto) {
                anterior.proximo = atual.proximo;
                atual = atual.proximo;
                this.tamanho--;
            } else {
                anterior = atual;
                atual = atual.proximo;
            }
        }

        ultimo=anterior;
    }

    //Ex31
    public int somaElementos(){
        No atual = this.inicio.proximo;
        int soma = 0;
        for (int i = 0; i < tamanho ; i++) {
            soma+=(int)atual.elemento;
            atual=atual.proximo;
        }
        return soma;
    }

    //ex36 a)
    public ListaEncadeada(String string) {
        inicio = new No();
        this.ultimo = inicio;
        this.tamanho = 0;

        for (int i = 0; i < string.length() ; i++) {
            No novo = new No();
            novo.elemento=string.charAt(i);
            this.ultimo.proximo=novo;
            this.ultimo=this.ultimo.proximo;
            this.tamanho++;
        }
    }
    //Ex36 b)
    public String  converteListaParaString(ListaEncadeada lista){
        String str="";
        No atual = this.inicio.proximo;
        for (int i = 0; i < tamanho ; i++) {
            str+=atual.elemento;
            atual=atual.proximo;
        }
        return str;
    }

    //Ex36 c)

    public  int caracterDiferente(ListaEncadeada l1, ListaEncadeada l2){
        No atualL1=l1.inicio.proximo;
        No atualL2=l2.inicio.proximo;

        for (int i = 0; i < l1.tamanho ; i++) {
            if (atualL1.elemento!=atualL2.elemento){
                return i;
            }
            atualL1 = atualL1.proximo;
            atualL2 = atualL2.proximo;
        }
        return -1;
    }
    //Ex36 d)
    public  ListaEncadeada substring( char inicio, char ultimo){
        No atual=this.inicio.proximo;
        String substring="";
        boolean percorrreSubstring = false;

        for (int i = 0; i < this.tamanho ; i++) {
            if (atual.elemento.equals(inicio)){
                percorrreSubstring=true;
            }
            if (percorrreSubstring){
                substring+=atual.elemento;
            }
            if (atual.elemento.equals(ultimo)){
                break;
            }
            atual=atual.proximo;
        }
        ListaEncadeada listaSubstring = new ListaEncadeada(substring);
        return listaSubstring;
    }
    public void trocaElementosDeLista(ListaEncadeada l1, Object i1, ListaEncadeada l2, Object i2){

    }

    //EX36 f)
    public int analizaTamanhode2Listas(ListaEncadeada l1,ListaEncadeada l2){
        if (l1.tamanho== l2.tamanho){
            return 0;
        } else if (l1.tamanho>l2.tamanho){
            return 1;
        } else {
            return -1;
        }
    }



    public void adicionaElementoInicio(Object elemento){
        No novo = new No();
        novo.elemento=elemento;
        this.ultimo.proximo=novo;
        this.ultimo=ultimo.proximo;
        this.tamanho++;
    }



    public boolean vazio(){
        return tamanho==0;
    }

    @Override
    public String toString() {
        return "Ex01{" +
                "inicio=" + inicio +
                ", ultimo=" + ultimo +
                ", tamanho=" + tamanho +
                '}';
    }

}
