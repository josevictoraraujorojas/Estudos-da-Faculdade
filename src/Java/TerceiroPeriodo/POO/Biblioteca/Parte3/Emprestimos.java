package Java.TerceiroPeriodo.POO.Biblioteca.Parte3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Emprestimos implements Serializable, DAO{
    private String dataDoEmprestimo;
    private String horaDoEmprestimo;
    private Livros livro;
    private Usuario usuario;


    public Emprestimos() {
    }

    public Emprestimos(String dataDoEmprestimo, String horaDoEmprestimo, Livros livro, Usuario usuario) {
        this.dataDoEmprestimo = dataDoEmprestimo;
        this.horaDoEmprestimo = horaDoEmprestimo;
        this.livro = livro;
        livro.setEmprestimo(false);
        this.usuario = usuario;
    }

    public void devolverLivro() throws Exception {
        this.livro.setEmprestimo(true);
        livro.atualizar();
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

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void gravar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("D:\\Biblioteca\\Emprestimo\\"+getDataDoEmprestimo());
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
            Files.delete(Path.of("D:\\Biblioteca\\Emprestimo\\" + getDataDoEmprestimo()));
            return true;
        }catch (Exception erro){
            return false;
        }
    }




    @Override
    public void atualizar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("D:\\Biblioteca\\Emprestimo\\"+getDataDoEmprestimo());
            ObjectOutputStream escreve = new ObjectOutputStream(file);
            escreve.writeObject(this);
            escreve.flush();
            escreve.close();

        }catch (Exception erro){
            throw new Exception(erro.toString());
        }
    }

    @Override
    public Object ler(String dataDoEmprestimo) throws Exception {
        try {
            FileInputStream file = new FileInputStream("D:\\Biblioteca\\Emprestimo\\"+dataDoEmprestimo);
            ObjectInputStream ler = new ObjectInputStream(file);
            Object emprestimos = ler.readObject();
            ler.close();
            return emprestimos;


        }catch (Exception erro){
            return null;
        }
    }

    public ArrayList<String> listar() {
        try {
            ArrayList<String> emprestimos = new ArrayList<>();
            Path caminho = Paths.get("D:\\Biblioteca\\Emprestimo");
            Files.list(caminho).forEach(arquivo -> emprestimos.add(String.valueOf(arquivo.getFileName())));
            return emprestimos;

        }catch (Exception erro){
            return null;
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
