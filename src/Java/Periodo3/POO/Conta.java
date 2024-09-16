package Java.Periodo3.POO;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private String nome;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean saca(double valor){
        if (saldo<=limite){
            this.saldo = saldo - valor;
            return true;
        }
        return false;
    }
    public void deposita(double valor){
         if (valor<=limite){
            this.saldo+=valor;
        }
     }
    public void transfere(Conta destino,double valor){
        if (saca(valor)) {
            destino.deposita(valor);
        }else {
            System.out.printf("Saldo insuficiente, o saldo esta em:%f\n",getSaldo());
        }
    }

}
