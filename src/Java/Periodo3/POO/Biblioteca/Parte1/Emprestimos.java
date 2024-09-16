package Java.Periodo3.POO.Biblioteca.Parte1;

public class Emprestimos {
    private String dataDoEmprestimo;
    private String horaDoEmprestimo;
    private Livros livro;
    private Usuarios usuario;

    public Emprestimos(String dataDoEmprestimo, String horaDoEmprestimo, Livros livro, Usuarios usuario) {
        this.dataDoEmprestimo = dataDoEmprestimo;
        this.horaDoEmprestimo = horaDoEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
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

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuarios) {
        this.usuario = usuarios;
    }
}
