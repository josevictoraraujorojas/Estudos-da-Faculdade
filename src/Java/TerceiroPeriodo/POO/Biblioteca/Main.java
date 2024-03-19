package Java.TerceiroPeriodo.POO.Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Usuarios> usuarios = new ArrayList<>();
    static ArrayList<Livros> livros = new ArrayList<>();
    static ArrayList<Emprestimos> emprestimos = new ArrayList<>();
    public static void main(String[] args) throws Exception {
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
                case "2" -> {
                    resposta="";
                    System.out.println("""
                            Digite 1 para aluno
                            Digite 2 para professor
                            Digite 3 para funcionario
                            """);
                    resposta = scanner.nextLine();
                    if (resposta.equals("1")){
                        cadastraAluno();
                    }
                    else if (resposta.equals("2")) {
                        cadastraProfessor();
                    }
                    else if (resposta.equals("3")) {
                        cadastraFuncionario();
                    }else {
                        System.out.println("resposta invalida");
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
        Livros livro = new Livros(titulo,autor,area,editora,ano,edicao,numeroDePaginas);
        livro.gravar();
        livros.add(livro);
    }
    public static void cadastraAluno() throws Exception {
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

        Aluno aluno = new Aluno(nome,idade,sexo,telefone,matricula,curso,periodo);
        aluno.gravar();
        usuarios.add(aluno);
    }
    public static void cadastraProfessor() throws Exception {
        String nome, sexo, telefone,id, formacaoAcademica, cursoMinistrado;
        int idade;

        System.out.println("qual o nome do professor");
        nome = scanner.nextLine();
        System.out.println("qual o sexo do professor");
        sexo = scanner.nextLine();
        System.out.println("qual o telefone do professor");
        telefone = scanner.nextLine();
        System.out.println("qual o id do professor");
        id = scanner.nextLine();
        System.out.println("qual o formacao academica do professor");
        formacaoAcademica = scanner.nextLine();
        System.out.println("qual o curso ministrado do professor");
        cursoMinistrado = scanner.nextLine();
        System.out.println("qual a idade do professor");
        idade = Integer.parseInt(scanner.nextLine());

        Professor professor = new Professor(nome,idade,sexo,telefone,id,formacaoAcademica,cursoMinistrado);
        professor.gravar();
        usuarios.add(professor);
    }
    public static void cadastraFuncionario() throws Exception {
        String nome, sexo, telefone, id,departamento, cargo;
        int idade;

        System.out.println("qual o nome do funcionario");
        nome = scanner.nextLine();
        System.out.println("qual o sexo do funcionario");
        sexo = scanner.nextLine();
        System.out.println("qual o telefone do funcionario");
        telefone = scanner.nextLine();
        System.out.println("qual o id do funcionario");
        id = scanner.nextLine();
        System.out.println("qual o departamento do funcionario");
        departamento = scanner.nextLine();
        System.out.println("qual o cargo do funcionario");
        cargo = scanner.nextLine();
        System.out.println("qual a idade do funcionario");
        idade = Integer.parseInt(scanner.nextLine());

        Funcionario funcionario =new Funcionario(nome,idade,sexo,telefone,id,departamento,cargo);
        funcionario.gravar();

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

        System.out.println("escreva a data do emprestimo");
        dataDoEmprestimo =scanner.nextLine();

        System.out.println("escreva a hora do emprestimo");
        horaDoEmprestimo =scanner.nextLine();
        Emprestimos emprestimo =new Emprestimos(dataDoEmprestimo,horaDoEmprestimo,livro,usuario);
        emprestimo.gravar();
        emprestimos.add(emprestimo);

    }

    public static void realizaDevolucao() throws Exception {
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
        emprestimo.excluir();
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
