package Java.TerceiroPeriodo.EstruturaDeDados.ListaAlocacao;

import java.util.Arrays;

public class Ex05 {
    private String[] elementos;
    private int tamanho;

    public Ex05() {
        this.elementos = new String[100];
        this.tamanho=0;
    }
    public Ex05(int capacidade) {
        this.elementos = new String[capacidade];
    }
    public boolean adiciona(String elemento){
        if (this.tamanho==this.elementos.length){
            return false;
        }
        for (int i = this.tamanho; i >= 0 ; i--) {
            this.elementos[i]=this.elementos[i+1];
        }
        this.elementos[0]=elemento;
        this.tamanho++;
        return true;
    }

    @Override
    public String toString() {
        return "Ex05{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }
}
