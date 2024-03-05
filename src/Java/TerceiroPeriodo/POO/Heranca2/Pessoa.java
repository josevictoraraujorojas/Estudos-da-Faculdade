package Java.TerceiroPeriodo.POO.Heranca2;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String calendar;

    public Pessoa(String nome, String cpf, String calendar) {
        setNome(nome);
        setCpf(cpf);
        setCalendar(calendar);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", calendar='" + calendar + '\'' +
                '}';
    }
}
