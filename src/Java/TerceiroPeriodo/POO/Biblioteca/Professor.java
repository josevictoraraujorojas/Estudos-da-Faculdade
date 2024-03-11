package Java.TerceiroPeriodo.POO.Biblioteca;

public class Professor extends Usuarios{
    private String id;
    private String formacaoAcademica;
    private String cursoMinistrado;

    public Professor(String nome, int idade, String sexo, String telefone, String id, String formacaoAcademica, String cursoMinistrado) {
        super(nome, telefone, sexo, idade);
        this.id = id;
        this.formacaoAcademica = formacaoAcademica;
        this.cursoMinistrado = cursoMinistrado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Professor{" +
                "id='" + id + '\'' +
                ", formacaoAcademica='" + formacaoAcademica + '\'' +
                ", cursoMinistrado='" + cursoMinistrado + '\'' +
                "} " + super.toString();
    }
}
