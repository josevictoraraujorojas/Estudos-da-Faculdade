package Java.TerceiroPeriodo.POO.Biblioteca;

public class Livros {
    private String titulo;
    private String autor;
    private String area;
    private String editora;
    private String ano;
    private String edicao;
    private int numeroDePaginas;
    private boolean emprestimo;

    public Livros() {
        this.emprestimo = false;
    }

    public void abrirLivro(){
        System.out.println("Livro aberto");
    }
    public void fecharLivro(){
        System.out.println("Livro fechado");
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
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

}
