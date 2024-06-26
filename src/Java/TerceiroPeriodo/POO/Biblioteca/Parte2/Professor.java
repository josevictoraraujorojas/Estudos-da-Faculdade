package Java.TerceiroPeriodo.POO.Biblioteca.Parte2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Professor extends Usuario {

    private String formacaoAcademica;
    private String cursoMinistrado;


    public Professor(String nome, int idade, String sexo, String telefone, String formacaoAcademica, String cursoMinistrado) {
        super(nome, idade, sexo, telefone);
        this.formacaoAcademica = formacaoAcademica;
        this.cursoMinistrado = cursoMinistrado;
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
            FileOutputStream file = new FileOutputStream("D://Biblioteca/UsuarioProfessor"+getNome());
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
            Files.delete(Path.of("D://Biblioteca/UsuarioProfessor" + getNome()));
            return true;
        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    @Override
    public Object ler() throws Exception {
        try {
            FileInputStream file = new FileInputStream("D://Biblioteca/UsuarioProfessor"+getNome());
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
            FileOutputStream file = new FileOutputStream("D:\\Biblioteca/UsuarioProfessor"+getNome());
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
                "formacaoAcademica='" + formacaoAcademica + '\'' +
                ", cursoMinistrado='" + cursoMinistrado + '\'' +
                "} " + super.toString();
    }
}
