package Java.Periodo3.POO.Biblioteca.Parte1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Usuarios> usuarios = new ArrayList<>();
    static ArrayList<Java.Periodo3.POO.Biblioteca.Parte1.Livros> livros = new ArrayList<>();
    static ArrayList<Java.Periodo3.POO.Biblioteca.Parte1.Emprestimos> emprestimos = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        String resposta = "";
        while (!resposta.equals("6")) {
            System.out.print("""
                    1 Cadastrar livro
                    2 Cadastrar usu�rios
                    3 Realizar empr�stimo
                    4 Realizar devolu��o
                    5 Listar todos os empr�stimos
                    6 Sair do programa""");
            resposta = scanner.nextLine();

            switch (resposta) {
                case "1" -> cadastraLivro();
                case "2" -> {
                    resposta="";
                    System.out.println("""
                            Digite 1 para aluno
                            Digite 2 para professor
                            Digite 3 para funcionario
                            """);
                    resposta = scanner.nextLine();
                    switch (resposta) {
                        case "1" -> cadastraEstudante();
                        case "2" -> cadastraProfessor();
                        case "3" -> cadastraFuncionario();
                        default -> System.out.println("resposta invalida");
                    }
                }
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
    public static void cadastraLivro() throws Exception {
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
        Java.Periodo3.POO.Biblioteca.Parte1.Livros livro = new Java.Periodo3.POO.Biblioteca.Parte1.Livros(titulo,autor,area,editora,ano,edicao,numeroDePaginas);
        livros.add(livro);
    }
    public static void cadastraEstudante() throws Exception {
        String nome, sexo, telefone, matricula, curso;
        int idade, periodo;




        System.out.println("qual o nome do aluno");
        nome = scanner.nextLine();
        System.out.println("qual o sexo do aluno");
        sexo = scanner.nextLine();
        System.out.println("qual o telefone do aluno");
        telefone = scanner.nextLine();
        System.out.println("qual a matricula do aluno");
        matricula = scanner.nextLine();
        System.out.println("qual o curso do aluno");
        curso = scanner.nextLine();
        System.out.println("qual a idade do aluno");
        idade = Integer.parseInt(scanner.nextLine());
        System.out.println("qual o periodo do aluno");
        periodo = Integer.parseInt(scanner.nextLine());

        Java.Periodo3.POO.Biblioteca.Parte1.Estudande estudante = new Estudande(nome,idade,sexo,telefone,matricula,curso,periodo);
        usuarios.add(estudante);
    }
    public static void cadastraProfessor() throws Exception {
        String nome, sexo, telefone, formacaoAcademica, cursoMinistrado;
        int idade;


        System.out.println("qual o nome do professor");
        nome = scanner.nextLine();
        System.out.println("qual o sexo do professor");
        sexo = scanner.nextLine();
        System.out.println("qual o telefone do professor");
        telefone = scanner.nextLine();
        System.out.println("qual o formacao academica do professor");
        formacaoAcademica = scanner.nextLine();
        System.out.println("qual o curso ministrado do professor");
        cursoMinistrado = scanner.nextLine();
        System.out.println("qual a idade do professor");
        idade = Integer.parseInt(scanner.nextLine());

        Java.Periodo3.POO.Biblioteca.Parte1.Professor professor = new Professor(nome,idade,sexo,telefone,formacaoAcademica,cursoMinistrado);
        usuarios.add(professor);
    }
    public static void cadastraFuncionario() throws Exception {
        String nome, sexo, telefone, departamento, cargo;
        int idade;

        System.out.println("qual o nome do funcionario");
        nome = scanner.nextLine();
        System.out.println("qual o sexo do funcionario");
        sexo = scanner.nextLine();
        System.out.println("qual o telefone do funcionario");
        telefone = scanner.nextLine();
        System.out.println("qual o departamento do funcionario");
        departamento = scanner.nextLine();
        System.out.println("qual o cargo do funcionario");
        cargo = scanner.nextLine();
        System.out.println("qual a idade do funcionario");
        idade = Integer.parseInt(scanner.nextLine());

        Java.Periodo3.POO.Biblioteca.Parte1.Funcionario funcionario = new Funcionario(nome,idade,sexo,telefone,departamento,cargo);

        usuarios.add(funcionario);
    }

    public static void cadastraEmprestimo() throws Exception {
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


        if (!livro.isEmprestimo()) {
            System.out.println("Livro ja esta emprestado");
            return;
        }

        System.out.println("escreva a data do emprestimo");
        dataDoEmprestimo =scanner.nextLine();

        System.out.println("escreva a hora do emprestimo");
        horaDoEmprestimo =scanner.nextLine();
        Java.Periodo3.POO.Biblioteca.Parte1.Emprestimos emprestimo =new Java.Periodo3.POO.Biblioteca.Parte1.Emprestimos(dataDoEmprestimo,horaDoEmprestimo,livro,usuario);
        emprestimos.add(emprestimo);

    }

    public static void realizaDevolucao() throws Exception {
        String nomeUsuario,tituloLivro;
        Usuarios usuario;
        Java.Periodo3.POO.Biblioteca.Parte1.Livros livro;
        Java.Periodo3.POO.Biblioteca.Parte1.Emprestimos emprestimo;
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

        emprestimo.getLivro().devolverLivro();
        emprestimos.remove(emprestimo);

    }

    public static Java.Periodo3.POO.Biblioteca.Parte1.Livros buscaLivro(String titulo){
        for (Java.Periodo3.POO.Biblioteca.Parte1.Livros atual:livros) {
            if (atual.getTitulo().equals(titulo))
                return atual;
        }
        return null;
    }

    public static boolean contemLivro(String titulo){
        for (Java.Periodo3.POO.Biblioteca.Parte1.Livros atual:livros) {
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

    public static boolean contemEmprestimo(Java.Periodo3.POO.Biblioteca.Parte1.Livros livro, Usuarios usuario){
        for (Java.Periodo3.POO.Biblioteca.Parte1.Emprestimos atual:emprestimos) {
            if (atual.getLivro().equals(livro)&&atual.getUsuario().equals(usuario))
                return true;
        }
        return false;
    }

    public static Java.Periodo3.POO.Biblioteca.Parte1.Emprestimos buscaEmprestimo(Java.Periodo3.POO.Biblioteca.Parte1.Livros livro, Usuarios usuario){
        for (Java.Periodo3.POO.Biblioteca.Parte1.Emprestimos atual:emprestimos) {
            if (atual.getLivro().equals(livro)&&atual.getUsuario().equals(usuario))
                return atual;
        }
        return null;
    }
}