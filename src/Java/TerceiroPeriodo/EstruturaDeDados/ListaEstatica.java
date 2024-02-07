package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.Arrays;

public class ListaEstatica {
    private  Object item[];
    private int primeiro,ultimo;

    @Override
    public String toString() {
        return "ListaEstatica{" +
                "item=" + Arrays.toString(item) +
                ", primeiro=" + primeiro +
                ", ultimo=" + ultimo +
                '}';
    }

    public Object[] getItem() {
        return item;
    }

    public int getUltimo() {
        return ultimo;
    }

    public ListaEstatica(int maxTam) {
        this.item = new Object[maxTam];
        this.primeiro = 0;
        this.ultimo = 0;
    }
    public void insereInicio (Object x) throws Exception {
        if ( this . ultimo == this . item. length)
            throw new Exception ( "Erro : A lista esta cheia" ) ;
        for (int i = ultimo-1; i >=0; i--) {

            this.item[i + 1] = this.item[i];
        }
        this.item[0] = x;
        this.ultimo++;
    }

    public void insereFinal (Object x) throws Exception {
        if ( this . ultimo == this . item. length)
            throw new Exception ( "Erro : A lista esta cheia" ) ;
        else {
            this . item[ this . ultimo ] = x;
            this . ultimo = this . ultimo + 1;
        }
    }
    private void insereNoMeioIndice(int indice,Object x) throws Exception {
        if ( this . ultimo == this . item. length)
            throw new Exception ( "Erro : A lista esta cheia" ) ;
        if (indice<ultimo) {
            for (int i = ultimo-1; i >= indice; i--) {

                this.item[i + 1] = this.item[i];
            }
            this.item[indice] = x;
            this.ultimo++;
        }
    }

    public void insereNoMeio(Object x) throws Exception {
        int posicao=0;
        if (!verificaListaDecrescente()){
            ordenaDecrescente();
        }
        if ( this . ultimo == this . item. length)
            throw new Exception ( "Erro : A lista esta cheia" ) ;
            for (int i = 0; i < ultimo; i++) {
                if ((int)this.item[i] < (int)x ) {
                    posicao=i;
                    break;
                }
            }
            insereNoMeioIndice(posicao,x);
    }
    public void insereProximoIndice(int n1,int n2) throws Exception {
        Object[] vetor = getItem();
        for (int i = 0; i < getUltimo() ; i++) {
            if (vetor[i].equals(n1)) {
                insereNoMeioIndice(i+1,n2);
                return;
            }
        }
    }
    public boolean verificaListaDecrescente(){
        Object[] vetor = getItem();
        int count = 0;
        for (int i = 0; i < getUltimo()-1 ; i++) {
            if ((int)vetor[i]>(int) vetor[i+1]) {
                count++;
            }
        }
        return count == ultimo - 1;
    }
    public void ordenaDecrescente() {
        Object[] vetor = getItem();
        int auxiliar;
        for (int j = 0; j < getUltimo() - 1; j++) {
            for (int i = 0; i < getUltimo() - 1; i++) {
                if ((int) vetor[i] < (int) vetor[i + 1]) {
                    auxiliar=(int)vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1]=auxiliar;
                }
            }
        }
    }
    public void procuraElementoRapido(Object x){
        if (!verificaListaDecrescente()){
            ordenaDecrescente();
        }
            Object[] vetor = getItem();
            int metadedovetor = getUltimo() / 2;
            if ((int) x > (int) vetor[metadedovetor]) {
                for (int i = getUltimo() / 2; i >= 0; i--) {
                    if (vetor[i].equals(x)) {
                        System.out.println(i);
                    }
                }
            } else {
                for (int i = getUltimo() / 2; i < getUltimo(); i++) {
                    if (vetor[i].equals(x)) {
                        System.out.println(i);
                    }
                }
            }
    }

    public int tamanho(){
        return getUltimo();
    }

    public Boolean validaPos(int posicao){
        Object[] vetor = getItem();
        return posicao< vetor.length;
    }


}