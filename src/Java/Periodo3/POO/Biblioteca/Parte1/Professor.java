package Java.Periodo3.POO.Biblioteca.Parte1;

public class Professor extends Usuarios {

    private String formacaoAcademica;
    private String cursoMinistrado;


    public Professor(String nome, int idade, String sexo, String telefone, String formacaoAcademica, String cursoMinistrado) {
        super(nome, idade, sexo, telefone);
        this.formacaoAcademica = formacaoAcademica;
        this.cursoMinistrado = cursoMinistrado;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getCursoMinistrado() {
        return cursoMinistrado;
    }

    public void setCursoMinistrado(String cursoMinistrado) {
        this.cursoMinistrado = cursoMinistrado;
    }

}
