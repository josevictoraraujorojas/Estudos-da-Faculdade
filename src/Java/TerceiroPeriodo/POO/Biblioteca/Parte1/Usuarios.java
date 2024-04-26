package Java.TerceiroPeriodo.POO.Biblioteca.Parte1;

public class Usuarios {
    private String nome;
    private int idade;
    private  String sexo;
    private  String telefone;

    public Usuarios(String nome, int idade, String sexo, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
