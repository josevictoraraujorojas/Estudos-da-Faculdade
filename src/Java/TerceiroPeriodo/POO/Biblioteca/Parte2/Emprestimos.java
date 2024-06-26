package Java.TerceiroPeriodo.POO.Biblioteca.Parte2;

import Java.TerceiroPeriodo.POO.Biblioteca.Parte3.DAO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Emprestimos implements Serializable, DAO {
    private String dataDoEmprestimo;
    private String horaDoEmprestimo;
    private Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Livros livro;
    private Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Usuario usuario;


    public Emprestimos(String dataDoEmprestimo, String horaDoEmprestimo, Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Livros livro, Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Usuario usuario) {
        this.dataDoEmprestimo = dataDoEmprestimo;
        this.horaDoEmprestimo = horaDoEmprestimo;
        this.livro = livro;
        livro.setEmprestimo(false);
        this.usuario = usuario;
    }

    public void devolverLivro(){
        this.livro.setEmprestimo(true);
        System.out.println("O livro foi devolvido");
    }

    public String getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(String dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public String getHoraDoEmprestimo() {
        return horaDoEmprestimo;
    }

    public void setHoraDoEmprestimo(String horaDoEmprestimo) {
        this.horaDoEmprestimo = horaDoEmprestimo;
    }

    public Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void gravar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("D://Biblioteca/Emprestimo"+getDataDoEmprestimo());
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
            Files.delete(Path.of("D://Biblioteca/Emprestimo" + getDataDoEmprestimo()));
            return true;
        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    @Override
    public Object ler() throws Exception {
        try {
            FileInputStream file = new FileInputStream("D://Biblioteca/Emprestimo"+getDataDoEmprestimo());
            ObjectInputStream ler = new ObjectInputStream(file);
            Emprestimos emprestimos = (Emprestimos) ler.readObject();
            ler.close();
            return emprestimos;


        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    @Override
    public void atualizar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("D:\\Biblioteca/Emprestimo"+getDataDoEmprestimo());
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
        return "Emprestimos{" +
                "dataDoEmprestimo='" + dataDoEmprestimo + '\'' +
                ", horaDoEmprestimo='" + horaDoEmprestimo + '\'' +
                ", livro=" + livro +
                ", usuario=" + usuario +
                '}';
    }
}
