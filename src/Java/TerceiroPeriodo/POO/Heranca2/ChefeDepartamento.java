package Java.TerceiroPeriodo.POO.Heranca2;

public class ChefeDepartamento extends Funcionario{
    private String departamento;
    private String dataPromocao;
    private double gratificacao;


    public ChefeDepartamento(String nome, String cpf, String calendar, String matricula, String dataAdmissao, double salario, String departamento, String dataPromocao, double gratificacao) {
        super(nome, cpf, calendar, matricula, dataAdmissao, salario);
        setDepartamento(departamento);
        setDataPromocao(dataPromocao);
        setGratificacao(gratificacao);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataPromocao() {
        return dataPromocao;
    }

    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public String toString() {
        return "ChefeDepartamento{" +
                "departamento='" + departamento + '\'' +
                ", dataPromocao='" + dataPromocao + '\'' +
                ", gratificacao=" + gratificacao +
                ", matricula='" + matricula + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", calendar='" + calendar + '\'' +
                "} ";
    }
}
