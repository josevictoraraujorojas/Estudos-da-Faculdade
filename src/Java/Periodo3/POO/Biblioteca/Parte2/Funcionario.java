package Java.Periodo3.POO.Biblioteca.Parte2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Funcionario extends Usuario {
    private String departamento;
    private String cargo;

    public Funcionario() {
    }

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

    @Override
    public void gravar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("C://BibliotecaParte2/UsuarioFuncionario"+getNome());
            ObjectOutputStream escreve = new ObjectOutputStream(file);
            escreve.writeObject(this);
            escreve.flush();
            escreve.close();


        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    @Override
    public boolean excluir() throws Exception {
        try {
            Files.delete(Path.of("C://BibliotecaParte2/UsuarioFuncionario" + getNome()));
            return true;
        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }


    public Object ler(String nome) throws Exception {
        try {
            FileInputStream file = new FileInputStream("C://BibliotecaParte2/UsuarioFuncionario"+nome);
            ObjectInputStream ler = new ObjectInputStream(file);
            Object funcionario = ler.readObject();
            ler.close();
            return funcionario;

        }catch (Exception erro){
            return  null;
        }
    }

    @Override
    public void atualizar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("C:\\BibliotecaParte2/UsuarioFuncionario"+getNome());
            ObjectOutputStream escreve = new ObjectOutputStream(file);
            escreve.writeObject(this);
            escreve.flush();
            escreve.close();

        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "departamento='" + departamento + '\'' +
                ", cargo='" + cargo + '\'' +
                "} " + super.toString();
    }
}
