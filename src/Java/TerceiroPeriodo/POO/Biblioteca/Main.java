package Java.TerceiroPeriodo.POO.Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Usuarios> usuarios = new ArrayList<>();
    static ArrayList<Livros> livros = new ArrayList<>();
    static ArrayList<Emprestimos> emprestimos = new ArrayList<>();
    public static void main(String[] args) {
        String resposta = "";
        while (!resposta.equals("6")) {
            System.out.print("""
                    1 Cadastrar livro
                    2 Cadastrar usuários
                    3 Realizar empréstimo
                    4 Realizar devolução
                    5 Listar todos os empréstimos
                    6 Sair do programa""");
            resposta = scanner.nextLine();

            switch (resposta) {
                case "1" -> cadastraLivro();
                case "2" -> cadastraUsuario();
                case "3" -> cadastraEmprestimo();
                case "4" -> realizaDevolucao();
                case "5" -> {
                    for (Emprestimos atual:emprestimos) {
                        System.out.println(atual);
                    }
                }
                case "6" -> System.out.println("Saindo do programa");
                default -> System.out.println("Alternativa invalida");
            }
        }

    }
    public static void cadastraLivro(){
        String titulo, autor,  area, editora, ano, edicao;
        int numeroDePaginas;

        System.out.println("Qual o titulo do livro");
        titulo=scanner.nextLine();
        System.out.println("Qual o autor do livro");
        autor=scanner.nextLine();
        System.out.println("Qual a area do livro");
        area=scanner.nextLine();
        System.out.println("Qual a editora do livro");
        editora=scanner.nextLine();
        System.out.println("Qual o ano do livro");
        ano=scanner.nextLine();
        System.out.println("Qual a edicao do livro");
        edicao=scanner.nextLine();
        System.out.println("Quantas paginas tem o livro");
        numeroDePaginas= Integer.parseInt(scanner.nextLine());

        livros.add(new Livros(titulo,autor,area,editora,ano,edicao,numeroDePaginas));
    }
    public static void cadastraUsuario(){
        String nome, sexo, telefone;
        int idade;

        System.out.println("qual o nome do usuario");
        nome = scanner.nextLine();
        System.out.println("qual o sexo do usuario");
        sexo = scanner.nextLine();
        System.out.println("qual o telefone do usuario");
        telefone = scanner.nextLine();
        System.out.println("qual a idade do usuario");
        idade = Integer.parseInt(scanner.nextLine());

        usuarios.add(new Usuarios(nome,sexo,telefone,idade));
    }

    public static void cadastraEmprestimo(){
        String dataDoEmprestimo, horaDoEmprestimo, nomeUsuario, tituloLivro;
        Livros livro;
        Usuarios usuario;

        System.out.println("escreva o seu nome de usuario");
        nomeUsuario =scanner.nextLine();

        if (contemUsuario(nomeUsuario)){
            usuario=buscaUsuario(nomeUsuario);
        }else {
            System.out.println("usuario nao existe");
            return;
        }


        System.out.println("escreva o titulo do livro");
        tituloLivro =scanner.nextLine();

        if (contemLivro(tituloLivro)){
            livro=buscaLivro(tituloLivro);
        }else {
            System.out.println("Livro nao existe");
            return;
        }

        System.out.println("escreva a data do emprestimo");
        dataDoEmprestimo =scanner.nextLine();

        System.out.println("escreva a hora do emprestimo");
        horaDoEmprestimo =scanner.nextLine();

        emprestimos.add(new Emprestimos(dataDoEmprestimo,horaDoEmprestimo,livro,usuario));
    }

    public static void realizaDevolucao(){
        String nomeUsuario,tituloLivro;
        Usuarios usuario;
        Livros livro;
        Emprestimos emprestimo;
        System.out.println("escreva o seu nome de usuario");
        nomeUsuario =scanner.nextLine();

        if (contemUsuario(nomeUsuario)){
            usuario=buscaUsuario(nomeUsuario);
        }else {
            System.out.println("usuario nao existe");
            return;
        }


        System.out.println("escreva o titulo do livro");
        tituloLivro =scanner.nextLine();

        if (contemLivro(tituloLivro)){
            livro=buscaLivro(tituloLivro);
        }else {
            System.out.println("Livro nao existe");
            return;
        }

        if (contemEmprestimo(livro,usuario)){
            emprestimo=buscaEmprestimo(livro,usuario);
        }else {
            System.out.println("emprestimo nao existe");
            return;
        }

        emprestimo.devolverLivro();
        emprestimos.remove(emprestimo);

    }

    public static Livros buscaLivro(String titulo){
        for (Livros atual:livros) {
            if (atual.getTitulo().equals(titulo))
                return atual;
        }
        return null;
    }
    public static boolean contemLivro(String titulo){
        for (Livros atual:livros) {
            if (atual.getTitulo().equals(titulo))
                return true;
        }
        return false;
    }
    public static Usuarios buscaUsuario(String nome){
        for (Usuarios atual:usuarios) {
            if (atual.getNome().equals(nome))
                return atual;
        }
        return null;
    }
    public static boolean contemUsuario(String nome){
        for (Usuarios atual:usuarios) {
            if (atual.getNome().equals(nome))
                return true;
        }
        return false;
    }
    public static boolean contemEmprestimo(Livros livro,Usuarios usuario){
        for (Emprestimos atual:emprestimos) {
            if (atual.getLivro().equals(livro)&&atual.getUsuario().equals(usuario))
                return true;
        }
        return false;
    }
    public static Emprestimos buscaEmprestimo(Livros livro,Usuarios usuario){
        for (Emprestimos atual:emprestimos) {
            if (atual.getLivro().equals(livro)&&atual.getUsuario().equals(usuario))
                return atual;
        }
        return null;
    }
}
