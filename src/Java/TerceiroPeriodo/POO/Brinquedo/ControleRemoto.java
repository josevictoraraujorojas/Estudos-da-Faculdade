package Java.TerceiroPeriodo.POO.Brinquedo;

public class ControleRemoto {
    private Brinquedo brinquedo;

    public ControleRemoto(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }
    public void mover(){
        brinquedo.mover();
    }

}

