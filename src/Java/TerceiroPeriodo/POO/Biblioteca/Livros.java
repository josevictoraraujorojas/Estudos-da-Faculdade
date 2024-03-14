package Java.TerceiroPeriodo.POO.Biblioteca;

public class Livros extends Obra{

    private String edicao;
    private int numeroDePaginas;
    private boolean emprestimo;

    public Livros(String titulo, String autor, String area, String editora, String ano, String edicao, int numeroDePaginas) {
        super(titulo, autor, area, editora, ano);
        this.edicao = edicao;
        this.numeroDePaginas = numeroDePaginas;
        this.emprestimo = true;
    }

    public void abrirLivro(){
        System.out.println("Livro aberto");
    }
    public void fecharLivro(){
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
}
