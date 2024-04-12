package Java.TerceiroPeriodo.EstruturaDeDados.ListaEstatica;

import java.util.Arrays;

public class ListaEstatica {
    private  Object item[];
    private int primeiro,ultimo;

    public ListaEstatica(int maxTam) {
        this.item = new Object[maxTam];
        this.primeiro = 0;
        this.ultimo = this.primeiro;
    }
 
    public void insereInicio (Object x) throws Exception {
        if (verificaListaCheia())
            throw new Exception ( "Erro : A lista esta cheia" ) ;
        for (int i = tamanho()-1; i >=0; i--) {

            this.item[i + 1] = this.item[i];
        }
        this.item[primeiro] = x;
        this.ultimo++;
    }
    private void InsereNoIndice(int indice, Object x) throws Exception {
        if (verificaListaCheia())
            throw new Exception ( "Erro : A lista esta cheia" ) ;
        if (indice<=ultimo) {
            for (int i = ultimo; i >= indice; i--) {

                this.item[i + 1] = this.item[i];
            }
            this.item[indice] = x;
            this.ultimo++;
        }
    }
    public void procuraIndiceIdealEInssere(Object x) throws Exception {
        int posicao=ultimo;
        if (!verificaListaDecrescente()){
            ordenaDecrescente();
        }
        for (int i = 0; i < tamanho(); i++) {
            if ((int)this.item[i] <= (int)x ) {
                posicao=i;
                break;
            }
        }
        InsereNoIndice(posicao,x);
    }
    public void insereProximoIndice(int n1,int n2) throws Exception {
        if (verificaListaCheia())
            throw new Exception ( "Erro : A lista esta cheia" ) ;
        for (int i = 0; i < tamanho() ; i++) {
            if (this.item[i].equals(n1)) {
                InsereNoIndice(i+1,n2);
                return;
            }
        }
    }
    public void insereFinal (Object x) throws Exception {
        if (verificaListaCheia())
            throw new Exception ( "Erro : A lista esta cheia" ) ;
        else {
            this.item[ this . ultimo ] = x;
            this.ultimo = this.ultimo + 1;
        }
    }

    public Object removeInicio () throws Exception {
        if (verificaListaVazia())
            throw new Exception ( "Erro : A lista esta vazia" ) ;
        Object item = this.item[0];
        ultimo--;
        for (int i = 0; i <=tamanho(); i++) {

                this.item[i] = this.item[i+1] ;

        }
        return item;
    }

    public Object removeMeio(Object x) throws Exception {
        if (verificaListaVazia()&&x==null)
            throw new Exception("Erro : A lista esta vazia");

        if (!verificaListaDecrescente())
            ordenaDecrescente();

        ultimo--;

        int indiceRemocao=procuraElementoRapido(x);
        if (indiceRemocao==-1){
            return null;
        }

        Object item = this.item[indiceRemocao];
        for (int i = indiceRemocao; i <=ultimo; i++) {
            this.item[i] = this.item[i+1] ;
        }
        return item;
    }

    public Object removeFinal () throws Exception {
        if (verificaListaVazia())
            throw new Exception ( "Erro : A lista esta vazia" ) ;
        Object item = this.item[ultimo];

        ultimo--;
        for (int i = ultimo; i <=ultimo; i++) {
                this.item[i] = this.item[i+1] ;
        }
        return ultimo;
    }

    public boolean verificaListaDecrescente(){
        int count = 0;
        for (int i = 0; i < tamanho()-2 ; i++) {
            if ((int)this.item[i]>(int) this.item[i+1]) {
                count++;
            }
        }
        return count == this.ultimo - 1;
    }

    public void ordenaDecrescente() {
        int elementoAnterior=0;

        for (int j = 0; j < tamanho()-1; j++) {
            for (int i = 0; i < tamanho()-1; i++) {
                if ((int) item[i] < (int) this.item[i + 1]) {
                    elementoAnterior =(int)this.item[i];
                    this.item[i] = this.item[i+1];
                    this.item[i+1]= elementoAnterior;
                }
            }
        }
    }

    public int procuraElementoRapido(Object x){
        if (verificaListaVazia()&&x==null){
            return -1;
        }
        if (!verificaListaDecrescente()){
            ordenaDecrescente();
        }
            int metadeDoVetor = (tamanho()-1)/ 2;
            if ((int) x > (int) this.item[metadeDoVetor]) {
                for (int i = metadeDoVetor; i >= 0; i--) {
                    if (this.item[i].equals(x)) {
                        return i;
                    }
                }
            } else {
                for (int i = metadeDoVetor; i < tamanho(); i++) {
                    if ((int)this.item[i]==(int)x) {
                        return i;
                    }
                }
            }
            return -1;
    }

    public int tamanho(){
        return ultimo;
    }

    public Boolean validaPos(int posicao){
        return posicao<= this.item.length;
    }

    @Override
    public String toString() {
        return "ListaEstatica{" +
                "item=" + Arrays.toString(item)
                +
                ", primeiro=" + primeiro +
                ", ultimo=" + ultimo +
                '}';
    }

    public Boolean verificaListaVazia(){
         return this . ultimo == this.primeiro;
    }

    public Boolean verificaListaCheia(){
         return this . ultimo == this.item.length;
    }

    public void destroiVetor(){
        this.item=null;
    }


}