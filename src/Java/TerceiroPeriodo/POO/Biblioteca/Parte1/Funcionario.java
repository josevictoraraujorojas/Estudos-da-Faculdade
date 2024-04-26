package Java.TerceiroPeriodo.POO.Biblioteca.Parte1;

public class Funcionario extends Usuarios{
    private String departamento;
    private String cargo;

    public Funcionario(String nome, int idade, String sexo, String telefone, String departamento, String cargo) {
        super(nome, idade, sexo, telefone);
        this.departamento = departamento;
        this.cargo = cargo;
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
