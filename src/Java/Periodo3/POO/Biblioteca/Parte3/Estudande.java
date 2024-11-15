package Java.Periodo3.POO.Biblioteca.Parte3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Estudande extends Usuario {
    private String matricula;

    private String cursoMatriculado;

    private int periodo;

    public Estudande() {
    }

    public Estudande(long id, String login, String senha, String nome, int idade, String sexo, String telefone, String matricula, String cursoMatriculado, int periodo) {
        super(id, login, senha, nome, idade, sexo, telefone);
        this.matricula = matricula;
        this.cursoMatriculado = cursoMatriculado;
        this.periodo = periodo;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public void gravar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("C:\\BibliotecaParte3/UsuarioAluno"+getLogin());
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
            Files.delete(Path.of("C:\\BibliotecaParte3/UsuarioAluno" + getLogin()));
            return true;
        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }


    public Object ler(String login) throws Exception {
        try {
            FileInputStream file = new FileInputStream("C:\\BibliotecaParte3/UsuarioAluno"+login);
            ObjectInputStream ler = new ObjectInputStream(file);
            Object aluno =  ler.readObject();
            ler.close();
            return aluno;


        }catch (Exception erro){
            return null;
        }
    }

    @Override
    public void atualizar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("C:\\BibliotecaParte3/UsuarioAluno"+getLogin());
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
        return "Estudande{" +
                "matricula='" + matricula + '\'' +
                ", cursoMatriculado='" + cursoMatriculado + '\'' +
                ", periodo=" + periodo +
                "} " + super.toString();
    }
}
