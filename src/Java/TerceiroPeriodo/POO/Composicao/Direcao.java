package Java.TerceiroPeriodo.POO.Composicao;

public class Direcao {
    private String cor;
    private double tamanhoRaio;
    private boolean kitMultimidia;

    public Direcao(){
    }
    public Direcao(String cor, double tamanhoRaio, boolean kitMultimidia) {
        setCor(cor);
        setTamanhoRaio(tamanhoRaio);
        setKitMultimidia(kitMultimidia);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanhoRaio() {
        return tamanhoRaio;
    }

    public void setTamanhoRaio(double tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }

    public boolean isKitMultimidia() {
        return kitMultimidia;
    }

    public void setKitMultimidia(boolean kitMultimidia) {
        this.kitMultimidia = kitMultimidia;
    }

    @Override
    public String toString() {
        return "Direcao{" +
                "cor='" + cor + '\'' +
                ", tamanhoRaio=" + tamanhoRaio +
                ", kitMultimidia=" + kitMultimidia +
                '}';
    }
}
