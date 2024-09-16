package Java.Periodo3.POO.Biblioteca.Parte2;

import java.io.Serializable;

public abstract class Usuario implements Serializable, DAO {
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;

    public Usuario() {
        this.nome = nome;
    }

    public Usuario(String nome, int idade, String sexo, String telefone) {

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public void lerLivro(){
        System.out.println("O usuario esta lendo um livro");
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

    @Override
    public String toString() {
        return "Usuario{" +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
