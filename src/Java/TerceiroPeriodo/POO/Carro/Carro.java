package Java.TerceiroPeriodo.POO.Carro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Carro {
    private Pessoa dono;
    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;
    private int cambio;

    public Carro(){

    }

    public Carro(Pessoa dono, String tipo, String cor, String placa, int numPortas) {
        this.dono = dono;
        this.tipo = tipo;
        this.cor = cor;
        setPlaca(placa);
        this.numPortas = numPortas;
    }


    public void ligar(){
        System.out.println("Carro ligado");
    }
    public void desligar(){
        System.out.println("Carro desligado");
    }
    public void acelerar(){
        System.out.println("Carro acelerando");
    }
    public void frear(){
        System.out.println("Carro freando");
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
        Pattern modeloPlaca = Pattern.compile("[A-Z]{3}-\\d[A-Z]\\d{2}");
        Matcher verificaPlaca=  modeloPlaca.matcher(placa);
        if (verificaPlaca.matches()) {
            this.placa=placa;
            return;
        }
        System.out.println("modelo de placa invalida tente este modelo(AAA-1A11)");
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getCambio() {
        System.out.println("Marcha:"+this.cambio);
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    @Override
    public String toString() {
        return String.format("\nCarro[dono:%s,tipo:%s,cor:%s,placa:%s,numero de portas:%d]\n",dono,tipo,cor,placa,numPortas);
    }
}
