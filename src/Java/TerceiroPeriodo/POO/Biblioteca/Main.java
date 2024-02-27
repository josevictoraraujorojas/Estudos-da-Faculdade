package Java.TerceiroPeriodo.POO.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Livros livro = new Livros();
        livro.setTitulo("O amor");

        Usuarios usuario = new Usuarios();
        usuario.setNome("Michele");

        Emprestimos emprestimos = new Emprestimos();
        emprestimos.setLivro(livro);
        emprestimos.setUsuario(usuario);
        emprestimos.setDataDoEmprestimo("26/02/24");
        System.out.println("---Emprestimo---");
        System.out.println("Livro:"+emprestimos.getLivro().getTitulo());
        System.out.println("Usuario:"+emprestimos.getUsuario().getNome());
        System.out.println("Data:"+emprestimos.getDataDoEmprestimo());
        emprestimos.getUsuario().lerLivro();
        emprestimos.getLivro().abrirLivro();
        emprestimos.getLivro().fecharLivro();
        emprestimos.devolverLivro();


    }
}
