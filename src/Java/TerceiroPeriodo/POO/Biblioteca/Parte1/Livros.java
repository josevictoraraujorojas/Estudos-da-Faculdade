package Java.TerceiroPeriodo.POO.Biblioteca.Parte1;

public class Livros extends Obra{
    private String edicao;
    private int numeroDeFolhas;
    private boolean emprestimo;



    public Livros(String titulo, String autor, String area, String editora, String ano, String edicao, int numeroDeFolhas) {
        super(titulo, autor, area, editora, ano);
        this.edicao = edicao;
        this.numeroDeFolhas = numeroDeFolhas;
        this.emprestimo = false;
    }

    public void abrirLivro(){
        System.out.println("o livro esta aberto");
    }
    public void fecharLivro() {
        System.out.println("o livro esta fechado" );
    }
    public void lerLivro(){
        System.out.println("o usuário está lendo o livro");
    }
    public void devolverLivro(){
        System.out.println("?Livro devolvido");
        this.emprestimo=true;
    }
    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getNumeroDeFolhas() {
        return numeroDeFolhas;
    }

    public void setNumeroDeFolhas(int numeroDeFolhas) {
        this.numeroDeFolhas = numeroDeFolhas;
    }
}
