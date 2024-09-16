package Java.Periodo3.EstruturaDeDados.AlocacaoDeMemoria.Ex03;

import java.util.Arrays;

public class VetorEstatico {
    private  Object item[];
    private int primeiro,ultimo;

    public VetorEstatico(int maxTam) {
        this.item = new Object[maxTam];
        this.primeiro = 0;
        this.ultimo = this.primeiro;
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

    public int procuraElementoRapido(Object x){
        if (verificaListaVazia()&&x==null){
            return -1;
        }

        for (int i = this.primeiro; i < tamanho(); i++) {
            if ((int)this.item[i]==(int)x) {
                    return i;
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
