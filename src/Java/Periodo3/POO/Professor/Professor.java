package Java.Periodo3.POO.Professor;

public class Professor {
    private String nome;
    private int matricula;
    private int cargaHoraria;

    public Professor(String nome, int matricula, int cargaHoraria) {
        setNome(nome);
        setMatricula(matricula);
        setCargaHoraria(cargaHoraria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public double geetSalario(){
        return 0;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
