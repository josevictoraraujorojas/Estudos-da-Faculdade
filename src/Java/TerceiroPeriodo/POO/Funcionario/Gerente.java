package Java.TerceiroPeriodo.POO.Funcionario;

public class Gerente extends Funcionario {
    int sala;


    public Gerente() {
        super("nenhum",0);
    }

    public Gerente(String nome, double salario, int sala) {
        super(nome, salario);
        this.sala=sala;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return String.format("Gerente{ Nome:%s; Salario:%.2f; Sala:%d",getNome(),getSalario(),getSala());
    }
}
