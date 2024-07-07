package Java.TerceiroPeriodo.POO.Biblioteca.Parte3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Reserva implements DAO {

    private String dataDaReserva;
    private String horaDaReserva;
    private Livros livro;
    private Usuario usuario;

    public Reserva(String dataDaReserva, String horaDaReserva, Livros livro, Usuario usuario) {
        this.dataDaReserva = dataDaReserva;
        this.horaDaReserva = horaDaReserva;
        this.livro = livro;
        this.usuario = usuario;
    }

    public String getDataDaReserva() {
        return dataDaReserva;
    }

    public void setDataDaReserva(String dataDaReserva) {
        this.dataDaReserva = dataDaReserva;
    }

    public String getHoraDaReserva() {
        return horaDaReserva;
    }

    public void setHoraDaReserva(String horaDaReserva) {
        this.horaDaReserva = horaDaReserva;
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
    public String toString() {
        return "Reserva{" +
                "dataDaReserva='" + dataDaReserva + '\'' +
                ", horaDaReserva='" + horaDaReserva + '\'' +
                ", livro=" + livro +
                ", usuario=" + usuario +
                '}';
    }

    @Override
    public void gravar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("D:\\Biblioteca\\Emprestimo\\"+getDataDaReserva());
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
            Files.delete(Path.of("D:\\Biblioteca\\Emprestimo\\" + getDataDaReserva()));
            return true;
        }catch (Exception erro){
            return false;
        }
    }

    @Override
    public void atualizar() throws Exception {
        try {
            FileOutputStream file = new FileOutputStream("D:\\Biblioteca\\Emprestimo\\"+getDataDaReserva());
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
        return null;
    }
}
