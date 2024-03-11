package Java.TerceiroPeriodo.POO.Brinquedo;

public class Main {
    public static void main(String[] args) {
        Brinquedo brinquedo = new Brinquedo();
        Aviao aviao = new Aviao();
        Barco barco = new Barco();
        Carro carro = new Carro();
        ControleRemoto controleRemoto = new ControleRemoto(carro);
        brinquedo.mover();
        aviao.mover();
        barco.mover();
        carro.mover();
        controleRemoto.mover();
    }
}
