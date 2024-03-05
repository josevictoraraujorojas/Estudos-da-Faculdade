package Java.TerceiroPeriodo.POO.Professor;

public class ProfessorHorista extends Professor{
    private int totalHoras;
    private double salarioHora;

    public ProfessorHorista(int totalHoras, int salarioHora,String nome, int matricula, int cargaHoraria) {
        super(nome, matricula, cargaHoraria);
        setSalarioHora(salarioHora);
        setTotalHoras(totalHoras);
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(int salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double calculaSalario(){
        return (this.totalHoras*this.salarioHora)*4.5;
    }

    @Override
    public String toString() {
        return "ProfessorHorista{" +
                "totalHoras=" + totalHoras +
                ", salarioHora=" + salarioHora +
                "} " + super.toString();
    }
}
