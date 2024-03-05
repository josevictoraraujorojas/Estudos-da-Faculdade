package Java.TerceiroPeriodo.POO.Professor;

public class ProfessorDE extends Professor {
    private int salario;

    public ProfessorDE(String nome, int matricula, int cargaHoraria, int salario) {
        super(nome, matricula, cargaHoraria);
        setSalario(salario);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ProfessorDE{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
