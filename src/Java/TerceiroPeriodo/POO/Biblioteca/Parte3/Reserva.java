package Java.TerceiroPeriodo.POO.Biblioteca.Parte3;

public class Reserva {

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
}
