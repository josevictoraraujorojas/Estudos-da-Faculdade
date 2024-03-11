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
            resposta = scanner.next();

            switch (resposta) {
                case "1" -> cadastrarLivro(livros);
                case "2" -> cadastrarUsuario(usuarios);
                case "3" -> {
                    System.out.println("informe o titulo do livro");
                    String titulo = scanner.next();
                    System.out.println("informe o nome do usuario");
                    String nome;
                    for (Livros atual : livros) {
                        if (atual.getTitulo().equals(titulo)) {
                            atual.setEmprestimo(true);
                        }
                    }
                }
                case "4" -> {
                    System.out.println("informe o titulo do livro");
                    String titulo = scanner.next();
                    System.out.println();
                    for (Emprestimos atual : emprestimos) {
                    }
                }
                case "5" -> {

                }
                case "6" -> System.out.println("Saindo do programa");
                default -> System.out.println("Alternativa invalida");
            }
        }

    }
    public static void cadastrarLivro(ArrayList<Livros> livros){
        String titulo, autor,  area, editora, ano, edicao;
        int numeroDePaginas;
        boolean emprestimo=false;

        System.out.println("Qual o titulo do livro");
        titulo=scanner.next();
        System.out.println("Qual o autor do livro");
        autor=scanner.next();
        System.out.println("Qual a area do livro");
        area=scanner.next();
        System.out.println("Qual a editora do livro");
        editora=scanner.next();
        System.out.println("Qual o ano do livro");
        ano=scanner.next();
        System.out.println("Qual a edicao do livro");
        edicao=scanner.next();
        System.out.println("Quantas paginas tem o livro");
        numeroDePaginas= scanner.nextInt();

        livros.add(new Livros(titulo,autor,area,editora,ano,edicao,numeroDePaginas,emprestimo));
    }
    public static void cadastrarUsuario(ArrayList<Usuarios> usuarios){
        String nome, sexo, telefone;
        int idade;

        System.out.println("qual o nome do usuario");
        nome = scanner.next();
        System.out.println("qual o sexo do usuario");
        sexo = scanner.next();
        System.out.println("qual o telefone do usuario");
        telefone = scanner.next();
        System.out.println("qual a idade do usuario");
        idade = scanner.nextInt();

        usuarios.add(new Usuarios(nome,sexo,telefone,idade));
    }
    public static void castrarEmprestimo(ArrayList<Emprestimos>emprestimos, Livros livro, Usuarios usuarios){
        String nome, sexo, telefone;
        int idade;

        System.out.println("qual o nome do usuario");
        nome = scanner.next();
        System.out.println("qual o sexo do usuario");
        sexo = scanner.next();
        System.out.println("qual o telefone do usuario");
        telefone = scanner.next();
        System.out.println("qual a idade do usuario");
        idade = scanner.nextInt();

//        usuarios.add(new Usuarios(nome,sexo,telefone,idade));
    }
}
