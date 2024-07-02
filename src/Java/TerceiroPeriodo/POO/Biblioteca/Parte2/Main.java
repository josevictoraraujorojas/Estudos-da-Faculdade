package Java.TerceiroPeriodo.POO.Biblioteca.Parte2;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class
Main {
    static Scanner scanner = new Scanner(System.in);
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
                    Emprestimos auxiliar = new Emprestimos();
                    ArrayList<String> lista = auxiliar.listar();
                    ArrayList<Emprestimos> emprestimos = new ArrayList<>();
                    for (String aux:lista) {
                        emprestimos.add((Emprestimos) auxiliar.ler(aux));
                    }
                    for (Emprestimos aux:emprestimos) {
                        System.out.println(aux);;
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
        Livros auxilaiar = new Livros();
        if (auxilaiar.ler(titulo)!=null){
            System.out.println("livro ja existe");

        }else {
            System.out.println("Qual o autor do livro");
            autor = scanner.nextLine();
            System.out.println("Qual a area do livro");
            area = scanner.nextLine();
            System.out.println("Qual a editora do livro");
            editora = scanner.nextLine();
            System.out.println("Qual o ano do livro");
            ano = scanner.nextLine();
            System.out.println("Qual a edicao do livro");
            edicao = scanner.nextLine();
            System.out.println("Quantas paginas tem o livro");
            numeroDePaginas = Integer.parseInt(scanner.nextLine());
            Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Livros livro = new Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Livros(titulo, autor, area, editora, ano, edicao, numeroDePaginas);
            livro.gravar();
        }
    }
    public static void cadastraEstudante() throws Exception {
        String nome, sexo, telefone, matricula, curso;
        int idade, periodo;
        System.out.println("qual o nome do aluno");
        nome = scanner.nextLine();

        Estudande auxiliar = new Estudande();
        if (auxiliar.ler(nome)!=null){
            System.out.println("Estudante ja existe");


        }else {

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

            Estudande estudante = new Estudande(nome, idade, sexo, telefone, matricula, curso, periodo);
            estudante.gravar();
        }
    }
    public static void cadastraProfessor() throws Exception {
        String nome, sexo, telefone, formacaoAcademica, cursoMinistrado;
        int idade;


        System.out.println("qual o nome do professor");
        nome = scanner.nextLine();

        Professor auxiliar = new Professor();
        if (auxiliar.ler(nome)!=null){
            System.out.println("professor ja existe");

        }else {

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

            Professor professor = new Professor(nome, idade, sexo, telefone, formacaoAcademica, cursoMinistrado);
            professor.gravar();
        }
    }
    public static void cadastraFuncionario() throws Exception {
        String nome, sexo, telefone, departamento, cargo;
        int idade;


        System.out.println("qual o nome do funcionario");
        nome = scanner.nextLine();

        Funcionario auxiliar = new Funcionario();
        if (auxiliar.ler(nome)!=null){
            System.out.println("funcionario ja existe");

        }else {

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

            Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Funcionario funcionario = new Funcionario(nome, idade, sexo, telefone, departamento, cargo);
            funcionario.gravar();
        }
    }

    public static void cadastraEmprestimo() throws Exception {
        String dataDoEmprestimo, horaDoEmprestimo, nomeUsuario, tituloLivro;
        Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Livros livro=null;
        Usuario usuario;

        System.out.println("escreva o seu nome de usuario");
        nomeUsuario =scanner.nextLine();
        Estudande auxiliar = new Estudande();
        Professor auxiliar1 = new Professor();
        Funcionario auxiliar2 = new Funcionario();

        if (auxiliar.ler(nomeUsuario)!=null){
            usuario= (Usuario) auxiliar.ler(nomeUsuario);
        }
        else if (auxiliar1.ler(nomeUsuario)!=null) {
            usuario = (Usuario) auxiliar1.ler(nomeUsuario);
        }
        else if (auxiliar2.ler(nomeUsuario)!=null) {
            usuario = (Usuario) auxiliar2.ler(nomeUsuario);
        }
        else {
            System.out.println("usuario nao existe");
            return;
        }


        System.out.println("escreva o titulo do livro");
        tituloLivro =scanner.nextLine();
        Livros auxiliar3 = new Livros();

        if (auxiliar3.ler(tituloLivro)!= null){
            livro= (Livros) auxiliar3.ler(tituloLivro);
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
        Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Emprestimos emprestimo =new Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Emprestimos(dataDoEmprestimo,horaDoEmprestimo,livro,usuario);
        livro.setEmprestimo(false);
        livro.atualizar();
        System.out.println(livro.isEmprestimo());
        emprestimo.gravar();

    }

    public static void realizaDevolucao() throws Exception {
        String nomeUsuario,tituloLivro,dataEmprestimo;
        Usuario usuario;
        Java.TerceiroPeriodo.POO.Biblioteca.Parte2.Livros livro;
        Emprestimos emprestimo;
        System.out.println("escreva o seu nome de usuario");
        nomeUsuario =scanner.nextLine();

        Estudande auxiliar = new Estudande();
        Professor auxiliar1 = new Professor();
        Funcionario auxiliar2 = new Funcionario();

        if (auxiliar.ler(nomeUsuario)!=null){
            usuario= (Usuario) auxiliar.ler(nomeUsuario);
        }
        else if (auxiliar1.ler(nomeUsuario)!=null) {
            usuario = (Usuario) auxiliar1.ler(nomeUsuario);
        }
        else if (auxiliar2.ler(nomeUsuario)!=null) {
            usuario = (Usuario) auxiliar2.ler(nomeUsuario);
        }
        else {
            System.out.println("usuario nao existe");
            return;
        }


        System.out.println("escreva o titulo do livro");
        tituloLivro =scanner.nextLine();

        Livros auxilia3 = new Livros();

        if (auxilia3.ler(tituloLivro)!= null){
            livro= (Livros) auxilia3.ler(tituloLivro);
        }else {
            System.out.println("Livro nao existe");
            return;
        }

        System.out.println("escreva a data do emprestimo");
        dataEmprestimo =scanner.nextLine();
        Emprestimos auxiliar4 = new Emprestimos();

        if (auxiliar4.ler(dataEmprestimo)!= null){
            emprestimo= (Emprestimos) auxiliar4.ler(dataEmprestimo);
        }else {
            System.out.println("emprestimo nao existe");
            return;
        }
        
        emprestimo.devolverLivro();
        emprestimo.excluir();
    }

}
