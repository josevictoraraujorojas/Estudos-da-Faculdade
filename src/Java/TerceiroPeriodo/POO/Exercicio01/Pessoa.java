package Java.TerceiroPeriodo.POO.Exercicio01;

public class Pessoa {
    private String nome;
    private String corDoCabelo;
    private String biotipo;
    private int idade;
    private Carro veiculo;

    public Pessoa(String nome, String corDoCabelo, String biotipo, int idade, Carro veiculo) {
        this.nome = nome;
        this.corDoCabelo = corDoCabelo;
        this.biotipo = biotipo;
        this.idade = idade;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public String getBiotipo() {
        return biotipo;
    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("Pessoa[nome:%s,cor do cabelo:%s,biotipo:%s,idade:%d,veiculo:%s]",nome,corDoCabelo,biotipo,idade,veiculo);
    }
}
