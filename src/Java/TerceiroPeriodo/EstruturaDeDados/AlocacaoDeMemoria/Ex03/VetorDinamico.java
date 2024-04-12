package Java.TerceiroPeriodo.EstruturaDeDados.AlocacaoDeMemoria.Ex03;

import Java.TerceiroPeriodo.EstruturaDeDados.ListaSimplesmenteEncadeada.No;

public class VetorDinamico {
    private No inicio;
    private No ultimo;
    private int tamanho;
    public void adiciona(int valor) {
        if (cheio()){
            System.out.println("limite do vetor");
            return;
        }
        No celula = new No(valor);
        if (this.tamanho==0) {
            this.inicio = celula;
        }else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo=celula;
        this.tamanho++;
    }

    public void busca(int valor){
        No atual = this.inicio;
        int count=0;
        for (int i = 0; i <tamanho ; i++) {
            if (atual.getElemento()==valor){
                System.out.println(atual.getElemento()+" indice:"+count);
                return;
            }
            count++;
            atual=atual.getProximo();
        }

        System.out.println("valor inesxistente");
    }
    public void remove(){
        No atual = this.inicio;
        for (int i = 0; i <tamanho ; i++) {
            if (atual.getProximo()==null){
                atual.setProximo(null);
                this.ultimo=atual;
                tamanho--;
                return;
            }
            atual=atual.getProximo();
        }
    }

    @Override
    public String toString() {
        return "VetorDinamico{" +
                "inicio=" + inicio +
                ", ultimo=" + ultimo +
                ", tamanho=" + tamanho +
                '}';
    }

    public int getTamanho() {
        return tamanho;
    }
    public boolean vazio(){
        return tamanho==0;
    }
    public boolean cheio(){
        return tamanho==9;
    }

}

