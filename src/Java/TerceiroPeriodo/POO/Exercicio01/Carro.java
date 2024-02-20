package Java.TerceiroPeriodo.POO.Exercicio01;

public class Carro {
    private Pessoa dono;
    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;

    public Carro(){

    }

    public Carro(Pessoa dono, String tipo, String cor, String placa, int numPortas) {
        this.dono = dono;
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return String.format("\nCarro[dono:%s,tipo:%s,cor:%s,placa:%s,numero de portas:%d]\n",dono,tipo,cor,placa,numPortas);
    }
}