package Java.Periodo3.POO.HerancaAbstract;

public abstract class Veiculo {
    protected int velocidade;
    protected boolean status;

    public void ligar(){
        status=true;
    }

    public  void desligar(){
        status=false;
    }

    public void mostrarStatus(){
        System.out.println(status);
    }

    public abstract void acelerar();

}
