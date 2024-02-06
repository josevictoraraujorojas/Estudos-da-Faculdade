package Java.TerceiroPeriodo.EstruturaDeDados;

public class ListaEstatica {
    private  Object item[];
    private int primeiro,ultimo;

    public ListaEstatica(int maxTam) {
        this.item = new Object[maxTam];
        this.primeiro = 0;
        this.ultimo = this.primeiro;
    }
    public void insere(Object elemento) throws Exception {
        if (ultimo<=item.length) {
            this.item[ultimo] = elemento;
            this.ultimo++;
        }
        throw new Exception("erro lista cheia");
    }
    public void insereNoMeio(int indice,Object elento){
        if (indice<ultimo) {
            for (int i = 8; i >= indice; i--) {

                this.item[i + 1] = this.item[i];
            }
            this.item[indice] = elento;
            this.ultimo++;
        }
        System.out.println();
    }

}
