package Java.TerceiroPeriodo.POO;

public class Conta {
    public int numero;
    public double saldo;
    public double limite;
    public String nome;

    public boolean saca(double valor){
        if (saldo<=limite&&saldo>=valor){
            this.saldo-=valor;
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
            destino.saldo += valor;
        }
    }

}
