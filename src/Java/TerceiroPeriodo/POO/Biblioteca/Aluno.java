package Java.TerceiroPeriodo.POO.Biblioteca;

public class Aluno extends Usuarios{
    private String matricula;

    private String cursoMatriculado;

    private int periodo;

    public Aluno(String nome, int idade, String sexo, String telefone, String matricula, String curso, int periodo) {
        super(nome, idade, sexo, telefone);
        this.matricula = matricula;
        this.cursoMatriculado = curso;
        this.periodo = periodo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", cursoMatriculado='" + cursoMatriculado + '\'' +
                ", periodo=" + periodo +
                "} " + super.toString();
    }
}
