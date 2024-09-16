package Java.Periodo3.POO.Heranca2;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, String cpf, String calendar, String matricula) {
        super(nome, cpf, calendar);
        setMatricula(matricula);
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", calendar='" + calendar + '\'' +
                "} ";
    }
}
