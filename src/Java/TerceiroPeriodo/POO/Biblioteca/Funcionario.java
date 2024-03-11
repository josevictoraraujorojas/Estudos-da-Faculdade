package Java.TerceiroPeriodo.POO.Biblioteca;

public class Funcionario extends Usuarios{
    private String id;
    private String departamento;
    private String cargo;

    public Funcionario(String nome, int idade, String sexo, String telefone, String id, String departamento, String cargo) {
        super(nome, telefone, sexo, idade);
        this.id = id;
        this.departamento = departamento;
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
