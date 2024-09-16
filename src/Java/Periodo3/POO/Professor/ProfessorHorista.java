package Java.Periodo3.POO.Professor;

public class ProfessorHorista extends Professor{
    private double salarioHora;

    public ProfessorHorista(String nome, int matricula,int cargaHorario, double salarioHora) {
        super(nome, matricula, cargaHorario);
        setSalarioHora(salarioHora);
    }


    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getSalario(){
        return (getCargaHoraria()*this.salarioHora)*4.5;
    }

    @Override
    public String toString() {
        return "ProfessorHorista{" +
                ", salarioHora=" + salarioHora +
                "} " + super.toString();
    }
}
