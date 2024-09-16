package Java.Periodo3.POO.Biblioteca.Parte1;

public class Estudande extends Usuarios {
    private String matricula;

    private String cursoMatriculado;

    private int periodo;

    public Estudande(String nome, int idade, String sexo, String telefone, String matricula, String cursoMatriculado, int periodo) {
        super(nome, idade, sexo, telefone);
        this.matricula = matricula;
        this.cursoMatriculado = cursoMatriculado;
        this.periodo = periodo;
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


}
