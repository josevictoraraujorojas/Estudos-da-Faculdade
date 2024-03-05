package Java.TerceiroPeriodo.POO.Professor;

public class ProfessorDE extends Professor {
    private double salario;

    public ProfessorDE(String nome, int matricula, double salario) {
        super(nome, matricula, 40);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ProfessorDE{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
