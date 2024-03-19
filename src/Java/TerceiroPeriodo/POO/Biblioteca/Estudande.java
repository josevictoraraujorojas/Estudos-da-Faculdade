package Java.TerceiroPeriodo.POO.Biblioteca;

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

    public Estudande(String nome, int idade, String sexo, String telefone, String matricula, String curso, int periodo) {
        super(nome, telefone, sexo, idade);
        this.matricula = matricula;
        this.cursoMatriculado = curso;
        this.periodo = periodo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
            FileOutputStream file = new FileOutputStream("D://Biblioteca/UsuarioAluno"+getMatricula());
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
            Files.delete(Path.of("D://Biblioteca/UsuarioAluno" + getMatricula()));
            return true;
        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    @Override
    public Object ler() throws Exception {
        try {
            FileInputStream file = new FileInputStream("D://Biblioteca/UsuarioAluno"+getMatricula());
            ObjectInputStream ler = new ObjectInputStream(file);
            Estudande aluno = (Estudande) ler.readObject();
            ler.close();
            return aluno;


        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    @Override
    public void atualizar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("D:\\Biblioteca/UsuarioAluno"+getMatricula());
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
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", cursoMatriculado='" + cursoMatriculado + '\'' +
                ", periodo=" + periodo +
                "} " + super.toString();
    }

}
