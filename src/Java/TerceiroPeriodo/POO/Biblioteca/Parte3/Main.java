package Java.TerceiroPeriodo.POO.Biblioteca.Parte3;
import java.util.ArrayList;
import java.util.Scanner;

public class
Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String resposta="";
        while (!resposta.equals("3")) {
            System.out.println("""
                    1) fazer login
                    2) fazer cadastr
                    """);
            resposta = scanner.nextLine();
            switch (resposta){
                case "1"->{
                   Usuario usuario = login();
                    String resposta1="";
                   while (!resposta1.equals("10")){
                    if (!(usuario instanceof Funcionario)) {
                        System.out.println("nao funcionario");
                        break;
                    }
                    else {
                        Funcionario usuarioLogado = (Funcionario) usuario;
                        System.out.println("""
                                1 Cadastrar livro
                                2 Cadastrar usuários
                                3 Excluir livro
                                4 Excluir usuários
                                5 Realizar empréstimo
                                6 Realizar devolução
                                7 Realizar reservas
                                8 Listar todas as obras
                                9 listar minhas obras
                                9 Listar todos os seus empréstimos e reservas
                                10 sair do programa
                                            """);
                        resposta1 = scanner.nextLine();
                        switch (resposta1){
                            case "1"->{
                                cadastraLivro();
                            }
                            case "2"->{
                               String resposta3="";
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
                            case "3"->{
                                excluirLivros();
                            }
                            case "4"->{
                                excluirUsuario();
                            }
                            case "5"->{
                                cadastraEmprestimo(usuarioLogado);
                            }
                            case "6"->{
                                realizaDevolucao(usuarioLogado);
                            }
                            case "7"->{
                                cadastrarReserva(usuarioLogado);
                            }
                        }
                    }
                    }

                }
                case "2"->{
                   String resposta1="";
                    System.out.println("""
                            Digite 1 para aluno
                            Digite 2 para professor
                            Digite 3 para funcionario
                            """);
                    resposta1 = scanner.nextLine();
                    switch (resposta1) {
                        case "1" -> cadastraEstudante();
                        case "2" -> cadastraProfessor();
                        case "3" -> cadastraFuncionario();
                        default -> System.out.println("resposta invalida");
                    }
                }
                default -> {
                    System.out.println("resposta invalida");
                }
            }

        }


    }
    public static Usuario login() throws Exception {
        String login,senha;
        Usuario usuario;

        System.out.println("digite o login");
        login = scanner.nextLine();

        Estudande auxiliar = new Estudande();
        Professor auxiliar1 = new Professor();
        Funcionario auxiliar2 = new Funcionario();

        if (auxiliar.ler(login) != null) {
            usuario = (Usuario) auxiliar.ler(login);
        } else if (auxiliar1.ler(login) != null) {
            usuario = (Usuario) auxiliar1.ler(login);
        } else if (auxiliar2.ler(login) != null) {
            usuario = (Usuario) auxiliar2.ler(login);
        } else {
            System.out.println("usuario nao existe");
            return null;
        }

        System.out.println("digite a senha");
        senha = scanner.nextLine();

        if (!usuario.getSenha().equals(senha)){
            return null;
        }

        return usuario;
    }

    public static void cadastraLivro() throws Exception {
        String titulo, autor, area, editora, ano, edicao;
        int numeroDePaginas;
        boolean digital = true;

        System.out.println("Qual o titulo do livro");
        titulo = scanner.nextLine();
        Livros auxilaiar = new Livros();
        if (auxilaiar.ler(titulo) != null) {
            System.out.println("livro ja existe");

        } else {
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
            Livros livro = new Livros(titulo, autor, area, editora,digital ,ano, edicao, numeroDePaginas);
            livro.gravar();
        }
    }

    public static void excluirLivros() throws Exception {
        String titulo;

        System.out.println("Qual o titulo do livro");
        titulo = scanner.nextLine();
        Livros livro = new Livros();
        livro= (Livros) livro.ler(titulo);
        if (livro == null) {
            System.out.println("livro nao existe");
            return;
        }
        livro.excluir();
    }

    public static void cadastraEstudante() throws Exception {
        String nome, sexo, telefone, matricula, curso, login, senha;
        int idade, periodo;
        long id;

        System.out.println("qual o id do aluno");
        id = Long.parseLong(scanner.nextLine());
        System.out.println("qual o login do aluno");
        login = scanner.nextLine();
        System.out.println("qual a senha do aluno");
        senha = scanner.nextLine();
        System.out.println("qual o nome do aluno");
        nome = scanner.nextLine();
        Estudande auxilaiar = new Estudande();
        if (auxilaiar.ler(nome) != null) {
            System.out.println("Estudante ja existe");
            return;

        }
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

        Estudande estudante = new Estudande(id, login, senha, nome, idade, sexo, telefone, matricula, curso, periodo);
        estudante.gravar();
    }

    public static void cadastraProfessor() throws Exception {
        String nome, sexo, telefone, login, senha, formacaoAcademica, cursoMinistrado;
        int idade;
        long id;
//


        System.out.println("qual o id do profssor");
        id = Long.parseLong(scanner.nextLine());
        System.out.println("qual o login do professor");
        login = scanner.nextLine();
        System.out.println("qual a senha do prodessor");
        senha = scanner.nextLine();
        System.out.println("qual o nome do professor");
        nome = scanner.nextLine();

        Professor auxiliar = new Professor();
        if (auxiliar.ler(nome) != null) {
            System.out.println("professor ja existe");
            return;
        }
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

        Professor professor = new Professor(id, login, senha, nome, idade, sexo, telefone, formacaoAcademica, cursoMinistrado);
        professor.gravar();

    }

    public static void cadastraFuncionario() throws Exception {
        String nome, login, senha, sexo, telefone, departamento, cargo;
        int idade;
        long id;

        System.out.println("qual o id do funcionario");
        id = Long.parseLong(scanner.nextLine());
        System.out.println("qual o login do funcionario");
        login = scanner.nextLine();
        System.out.println("qual a senha do funcionario");
        senha = scanner.nextLine();
        System.out.println("qual o nome do funcionario");
        nome = scanner.nextLine();

        Funcionario auxiliar = new Funcionario();
        if (auxiliar.ler(nome) != null) {
            System.out.println("funcionario ja existe");
            return;
        }

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

        Funcionario funcionario = new Funcionario(id, login, senha, nome, idade, sexo, telefone, departamento, cargo);
        funcionario.gravar();

    }
    public static void excluirUsuario() throws Exception {
        String login;
        Usuario usuario;

        System.out.println("digite o login");
        login = scanner.nextLine();

        Estudande auxiliar = new Estudande();
        Professor auxiliar1 = new Professor();
        Funcionario auxiliar2 = new Funcionario();

        if (auxiliar.ler(login) != null) {
            usuario = (Usuario) auxiliar.ler(login);
        } else if (auxiliar1.ler(login) != null) {
            usuario = (Usuario) auxiliar1.ler(login);
        } else if (auxiliar2.ler(login) != null) {
            usuario = (Usuario) auxiliar2.ler(login);
        } else {
            System.out.println("usuario nao existe");
            return;
        }

        if (usuario instanceof Estudande){
            Estudande estudande = (Estudande) usuario;
            estudande.excluir();
        }else if (usuario instanceof Professor){
            Professor estudande = (Professor) usuario;
            estudande.excluir();
        }else if (usuario instanceof Funcionario){
            Funcionario estudande = (Funcionario) usuario;
            estudande.excluir();
        }
    }

    public static void cadastraEmprestimo(Funcionario usuario) throws Exception {
        String dataDoEmprestimo, horaDoEmprestimo, tituloLivro;
        Livros livro = null;

        System.out.println("escreva o titulo do livro");
        tituloLivro = scanner.nextLine();
        Livros auxiliar3 = new Livros();

        if (auxiliar3.ler(tituloLivro) != null) {
            livro = (Livros) auxiliar3.ler(tituloLivro);
        } else {
            System.out.println("Livro nao existe");
            return;
        }


        if (!livro.isEmprestimo()) {
            System.out.println("Livro ja esta emprestado");
            return;
        }

        System.out.println("escreva a data do emprestimo");
        dataDoEmprestimo = scanner.nextLine();

        System.out.println("escreva a hora do emprestimo");
        horaDoEmprestimo = scanner.nextLine();

        Emprestimos emprestimo = new Emprestimos(dataDoEmprestimo, horaDoEmprestimo, livro, usuario);
        livro.setEmprestimo(false);
        livro.atualizar();
        emprestimo.gravar();
        usuario.setEmprestimos(emprestimo);
        usuario.atualizar();
    }

    public static void realizaDevolucao(Funcionario usuario) throws Exception {
        usuario.getEmprestimos().devolverLivro();
        usuario.getEmprestimos().excluir();
    }

    public static void cadastrarReserva(Funcionario usuario) throws Exception {
        String dataDoEmprestimo, horaDoEmprestimo, tituloLivro;
        Livros livro = null;

        System.out.println("escreva o titulo do livro");
        tituloLivro = scanner.nextLine();
        Livros auxiliar3 = new Livros();

        if (auxiliar3.ler(tituloLivro) != null) {
            livro = (Livros) auxiliar3.ler(tituloLivro);
        } else {
            System.out.println("Livro nao existe");
            return;
        }


        if (!livro.isEmprestimo()) {
            System.out.println("Livro ja esta reservado");
            return;
        }

        System.out.println("escreva a data da reserva");
        dataDoEmprestimo = scanner.nextLine();

        System.out.println("escreva a hora da reserva");
        horaDoEmprestimo = scanner.nextLine();

        Reserva reserva = new Reserva(dataDoEmprestimo, horaDoEmprestimo, livro, usuario);
        livro.setEmprestimo(false);
        livro.atualizar();
        reserva.gravar();
        usuario.setReserva(reserva);
        usuario.atualizar();
    }
}
