package Java.Periodo3.POO.Biblioteca.Parte2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Livros extends Obra implements DAO, Serializable{

    private String edicao;
    private int numeroDePaginas;
    private boolean emprestimo;

    public Livros(String titulo, String autor, String area, String editora, String ano, String edicao, int numeroDePaginas) {
        super(titulo, autor, area, editora, ano);
        this.edicao = edicao;
        this.numeroDePaginas = numeroDePaginas;
        this.emprestimo = true;
    }
    public Livros(){

    }
    public void abrir(){
        System.out.println("Livro aberto");
    }
    public void fechar(){
        System.out.println("Livro fechado");
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "edicao='" + edicao + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", emprestimo=" + emprestimo +
                "} " + super.toString();
    }

    @Override
    public void gravar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("C://BibliotecaParte2/Livro"+getTitulo());
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
            Files.delete(Path.of("C://BibliotecaParte2/Livro" + getTitulo()));
            return true;
        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    public Object ler(String titulo) throws Exception {
        try {
            FileInputStream file = new FileInputStream("C://BibliotecaParte2/Livro"+titulo);
            ObjectInputStream ler = new ObjectInputStream(file);
            Object livro = ler.readObject();
            ler.close();
            return livro;


        }catch (Exception erro){
            return null;
        }
    }

    @Override
    public void atualizar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("C:\\BibliotecaParte2/Livro"+getTitulo());
            ObjectOutputStream escreve = new ObjectOutputStream(file);
            escreve.writeObject(this);
            escreve.flush();
            escreve.close();

        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }
}
