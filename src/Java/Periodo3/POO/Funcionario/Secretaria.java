package Java.Periodo3.POO.Funcionario;

public class Secretaria extends Funcionario{
   private String ramal;

    public Secretaria() {
        super("nenhum",0);
    }

    public Secretaria(String nome, double salario, String ramal) {
        super(nome, salario);
        this.ramal=ramal;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @Override
    public String toString() {
        return String.format("Secretaria{ Nome:%s; Salario:%.2f; Ramal:%s",getNome(),getSalario(),getRamal());
    }
}
