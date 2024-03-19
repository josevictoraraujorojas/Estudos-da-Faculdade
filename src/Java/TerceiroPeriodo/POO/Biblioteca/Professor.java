package Java.TerceiroPeriodo.POO.Biblioteca;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Professor extends Usuario {

    private String id;
    private String formacaoAcademica;
    private String cursoMinistrado;

    public Professor(String nome, int idade, String sexo, String telefone, String id, String formacaoAcademica, String cursoMinistrado) {
        super(nome, telefone, sexo, idade);
        this.id = id;
        this.formacaoAcademica = formacaoAcademica;
        this.cursoMinistrado = cursoMinistrado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getCursoMinistrado() {
        return cursoMinistrado;
    }

    public void setCursoMinistrado(String cursoMinistrado) {
        this.cursoMinistrado = cursoMinistrado;
    }

    @Override
    public void gravar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("D://Biblioteca/UsuarioProfessor"+getId());
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
            Files.delete(Path.of("D://Biblioteca/UsuarioProfessor" + getId()));
            return true;
        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    @Override
    public Object ler() throws Exception {
        try {
            FileInputStream file = new FileInputStream("D://Biblioteca/UsuarioProfessor"+getId());
            ObjectInputStream ler = new ObjectInputStream(file);
            Professor professor = (Professor) ler.readObject();
            ler.close();
            return professor;


        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    @Override
    public void atualizar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("D:\\Biblioteca/UsuarioProfessor"+getId());
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
        return "Professor{" +
                "id='" + id + '\'' +
                ", formacaoAcademica='" + formacaoAcademica + '\'' +
                ", cursoMinistrado='" + cursoMinistrado + '\'' +
                "} " + super.toString();
    }
}
