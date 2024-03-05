package Java.TerceiroPeriodo.POO.Heranca2;

public class Funcionario extends Pessoa {
    protected String matricula;
    protected String dataAdmissao;
    protected double salario;


    public Funcionario(String nome, String cpf, String calendar, String matricula, String dataAdmissao, double salario) {
        super(nome, cpf, calendar);
        setMatricula(matricula);
        setDataAdmissao(dataAdmissao);
        setSalario(salario);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula='" + matricula + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", calendar='" + calendar + '\'' +
                "} ";
    }


}
