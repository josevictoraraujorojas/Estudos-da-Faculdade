package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.Objects;

public class ListaCircular {
    private static class Nodo{
        Object item;
        Nodo proximo;
    }

    private Nodo lista;

    public ListaCircular() {
        lista=new Nodo();
        lista.proximo=null;
    }

    public void insercaoNoInicio(Object elemento){
        Nodo novo = new Nodo();
        novo.item=elemento;

        if (vazia()) {
            lista = novo;
            novo.proximo = lista;
        }else {
            novo.proximo = lista.proximo;
            lista.proximo = novo;
        }

    }

    public void insercaoNoFim(Object elemento){
        Nodo novo = new Nodo();
        novo.item=elemento;

        if (vazia()) {
            lista = novo;
            novo.proximo = lista;
        }else {
            novo.proximo = lista.proximo;
            lista.proximo = novo;
            lista=novo;
        }

    }

    public void insercaoNomeio(Object elemento){
        Nodo novo = new Nodo();
        novo.item=elemento;

        if (vazia()) {
            lista = novo;
            novo.proximo = lista;
        }else if ((int)elemento>=(int)lista.item){
            insercaoNoFim(elemento);
        }else if ((int)elemento<=(int)lista.proximo.item){
            insercaoNoInicio(elemento);
        } else {
            Nodo atual =lista.proximo;
            Nodo anterio=lista;
           while (atual.proximo!=lista){
               if ((int)atual.item>(int)elemento){
                   anterio.proximo=novo;
                   novo.proximo=atual;
                   return;
               }
               anterio=atual;
               atual=atual.proximo;
           }
        }
    }

    public Object removeInicio() throws Exception {
        if (vazia()){
            throw new Exception("Lista vazia");

        }

        Object elemento;
        Nodo auxiliar = lista.proximo;
        elemento = auxiliar.item;

        if (auxiliar==lista){
            lista.proximo=null;
        }else {

            lista.proximo = auxiliar.proximo;

        }
        return elemento;
    }

    public Object removeFinal() throws Exception {
        if (vazia()){
            throw new Exception("Lista vazia");

        }
        Object elemento;
        Nodo auxiliar = lista;
        elemento = auxiliar.item;
        if (auxiliar.proximo==lista){
            lista.proximo=null;
        }else{
            do{
                if (auxiliar.proximo==lista){
                    auxiliar.proximo=lista.proximo;
                }
                auxiliar=auxiliar.proximo;
            }while ( auxiliar.proximo!=lista.proximo );

        }
        return elemento;
    }

    public Object removeMeio(Object chave) throws Exception {
        Object item = null;
        if ( vazia() ) throw new Exception("Erro : Lista vazia");
        if (Objects.equals(lista.proximo.item, chave)) {
            item = lista.item;
            return removeInicio(); // removeMeio o primeiro
        }
        else if ( lista.item == chave) {
            item = lista.item;
            return removeFinal(); // removeMeio o ultimo
        }
        else {// removeMeio no meio
            Nodo auxiliar = lista.proximo; Nodo anterior = lista;
            while ( auxiliar != lista ) {
                if (auxiliar.item.equals(chave)){
                    anterior.proximo=auxiliar.proximo;
                    break;
                }
                anterior = auxiliar; auxiliar = auxiliar.proximo;
            }
            if (auxiliar.proximo == lista ) return null ; // não encontrada
            item = auxiliar.item; // guardo o ?item? encontrado
            anterior.proximo = auxiliar.proximo; // removo a Nodo da lista
        }
        return item;
    }

    public Object BuscaElemento(Object elemento) throws Exception {
        if ( vazia() ) throw new Exception("Erro : Lista vazia");
        Nodo auxiliar = lista.proximo;
        do {
            if (auxiliar.item.equals(elemento) )
                return auxiliar.item;
            auxiliar = auxiliar.proximo ;
        }while ( auxiliar != lista.proximo);
        return null;

    }

    public Object ValidaPosicao(Object elemento) throws Exception {
        if (vazia()) throw new Exception("Erro : Lista vazia");
        Nodo auxiliar = lista.proximo;
        do {
            if (auxiliar.item.equals(elemento))
                return auxiliar.item;
            auxiliar = auxiliar.proximo;
        } while (auxiliar != lista.proximo);
        return null;
    }

    public int quantidadeElementos(){
        int count=0;
        if (vazia()){
            System.out.println("erro vazia");
        }else {
            Nodo atual = lista.proximo;
            do {
               count++;
               atual=atual.proximo;
            }while (atual != lista.proximo);
        }
        return count;
    }

    public boolean validaposicao(int posicao) {
        int count = 0;
        if (vazia()) {
            System.out.println("erro vazia");
        } else {
            Nodo atual = lista.proximo;
            do {
                if (posicao==count){
                    return true;
                }
                count++;
                atual = atual.proximo;
            } while (atual != lista.proximo);
        }
        return false;
    }

    public Object menorElemeno() {
        Object menorElemento=null;
        if (vazia()) {
            System.out.println("erro vazia");
        } else {
            Nodo atual = lista.proximo;
            menorElemento=atual.item;
            do {
                if ((int)atual.proximo.item<(int)menorElemento){
                    menorElemento=atual.proximo.item;
                }
                atual = atual.proximo;
            } while (atual != lista.proximo);
        }
        return menorElemento;
    }

    public void insereAposUmValor(Object elemento,Object posicao) throws Exception {
        if (vazia()) {
            throw new Exception("erro lista vazia");
        } else {
            Nodo novo = new Nodo();
            novo.item=elemento;
            Nodo atual = lista.proximo;
            Nodo anterior = lista;
            do {
                if(anterior.item==posicao){
                    anterior.proximo=novo;
                    novo.proximo=atual;
                    return;
                }
                anterior=atual;
                atual = atual.proximo;
            } while (atual != lista.proximo);
        }
    }

    public void ConcatenaDuasLista(ListaCircular segundaLista) throws Exception {
        if (segundaLista.vazia()) {
            throw new Exception("erro lista vazia");
        }if (vazia()) {
            throw new Exception("erro lista vazia");
        }
        Nodo auxiliar = new Nodo();
        auxiliar = segundaLista.lista.proximo;
        segundaLista.lista.proximo=this.lista.proximo;
        lista.proximo=auxiliar;
    }

    public void ConcatenaDuasListaOrdenadas(ListaCircular segundaLista) throws Exception {
        if (segundaLista.vazia()) {
            throw new Exception("erro lista vazia");
        }else if (vazia()) {
            throw new Exception("erro lista vazia");
        }
        Nodo auxiliar = new Nodo();
        if ((int)this.lista.proximo.item>(int)segundaLista.lista.proximo.item){
            auxiliar = segundaLista.lista.proximo;
            segundaLista.lista.proximo=this.lista.proximo;
            lista.proximo=auxiliar;
        }else {
            auxiliar = lista.proximo;
            this.lista.proximo=segundaLista.lista.proximo;
            segundaLista.lista.proximo=auxiliar;
            lista=segundaLista.lista;
        }
    }

    public void imprimi(){
        if (vazia()){
            System.out.println("erro vazia");
        }else {
            Nodo atual = lista.proximo;
            do {
                System.out.println("atual:"+atual.item + "|" +"Proximo:"+atual.proximo.item);
                atual = atual.proximo;
            }while (atual != lista.proximo);
        }
    }

    public boolean vazia(){
        return lista.proximo==null;
    }

}
