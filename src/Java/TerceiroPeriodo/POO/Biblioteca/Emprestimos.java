package Java.TerceiroPeriodo.POO.Biblioteca;

public class Emprestimos {
    private String dataDoEmprestimo;
    private String horaDoEmprestimo;
    private Livros livro;
    private Usuarios usuario;


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

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
