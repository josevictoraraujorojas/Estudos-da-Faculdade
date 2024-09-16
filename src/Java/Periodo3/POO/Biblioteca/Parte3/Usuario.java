package Java.Periodo3.POO.Biblioteca.Parte3;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Usuario implements Serializable,DAO {
    private long id;
    private String login;
    private String senha;
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;
    private ArrayList<Emprestimos> emprestimos;
    private ArrayList<Reserva> reserva;

    public Usuario() {
    }

    public Usuario(long id, String login, String senha, String nome, int idade, String sexo, String telefone) {
        emprestimos = new ArrayList<>();
        reserva = new ArrayList<>();
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public void lerLivro(){
        System.out.println("O usuario esta lendo um livro");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public ArrayList<Emprestimos> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimos> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public ArrayList<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(ArrayList<Reserva> reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
