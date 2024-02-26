package Java.TerceiroPeriodo.POO.Carro;

public class Pessoa {
    private String nome;
    private String corDoCabelo;
    private String biotipo;
    private int idade;
    private Carro veiculo;
    private int cambioMarcha;

    public Pessoa(String nome, String corDoCabelo, String biotipo, int idade, Carro veiculo) {
        this.nome = nome;
        this.corDoCabelo = corDoCabelo;
        this.biotipo = biotipo;
        this.idade = idade;
        this.veiculo = veiculo;
    }


    void ligarCarro(){
        veiculo.ligar();
    }

    void desligarCarro(){
        veiculo.desligar();
    }

    void acelerarCarro(){
        veiculo.acelerar();
    }

    void freaeCarro(){
        veiculo.frear();
    }


    public Carro getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Carro veiculo) {
        this.veiculo = veiculo;
    }

    public int getCambioMarcha() {
        return cambioMarcha;
    }

    public void setCambioMarcha(int marcha) {
       veiculo.setCambio(marcha);
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
