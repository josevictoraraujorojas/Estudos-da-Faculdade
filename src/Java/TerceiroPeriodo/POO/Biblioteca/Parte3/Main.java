package Java.TerceiroPeriodo.POO.Biblioteca.Parte3;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class
Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        criaPastas();
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

                    if (!(usuario instanceof Funcionario usuarioLogado)) {
                        while (!resposta1.equals("7")){

                        System.out.println("""
                                1 Realizar empr?stimo
                                2 Realizar devolu??o
                                3 Realizar reservas
                                4 Listar todas as obras
                                5 listar minhas obras
                                6 Listar todos os seus empr?stimos e reservas
                                7 sair do programa
                                           \s""");
                        resposta1 = scanner.nextLine();
                        switch (resposta1) {
                            case "1" -> cadastraEmprestimo(usuario);
                            case "2" -> {
                                assert usuario != null;
                                realizaDevolucao(usuario);
                            }
                            case "3" -> cadastrarReserva(usuario);
                            case "4" -> listarObras();
                            case "5" -> {
                                assert usuario != null;
                                listarMinhasObras(usuario);
                            }
                            case "6" -> listarEmprestimoEReservas();
                            default -> System.out.println("resposta invalida");
                        }
                    }
                    }
                    else {
                        while (!resposta1.equals("11")){
                        System.out.println("""
                                1 Cadastrar livro
                                2 Cadastrar usu?rios
                                3 Excluir livro
                                4 Excluir usu?rios
                                5 Realizar empr?stimo
                                6 Realizar devolu??o
                                7 Realizar reservas
                                8 Listar todas as obras
                                9 listar minhas obras
                                10 Listar todos os seus empr?stimos e reservas
                                11 sair do programa
                                           \s""");
                        resposta1 = scanner.nextLine();
                        switch (resposta1){
                            case "1"-> cadastraLivro();
                            case "2"->{
                               String resposta3="";
                                System.out.println("""
                            Digite 1 para aluno
                            Digite 2 para professor
                            Digite 3 para funcionario
                            """);
                                resposta3 = scanner.nextLine();
                                switch (resposta3) {
                                    case "1" -> cadastraEstudante();
                                    case "2" -> cadastraProfessor();
                                    case "3" -> cadastraFuncionario();
                                    default -> System.out.println("resposta invalida");
                                }
                            }
                            case "3"-> excluirLivros();
                            case "4"-> excluirUsuario();
                            case "5"-> cadastraEmprestimo(usuarioLogado);
                            case "6"-> realizaDevolucao(usuarioLogado);
                            case "7"-> cadastrarReserva(usuarioLogado);
                            case "8"-> listarObras();
                            case "9"-> listarMinhasObras(usuarioLogado);
                            case "10"-> listarEmprestimoEReservas();
                            default -> System.out.println("resposta invalida");
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
                default -> System.out.println("resposta invalida");
            }

        }


    }
    public static void listarEmprestimoEReservas() throws Exception {
        System.out.println("Emprestimos:");
        Emprestimos auxiliar = new Emprestimos();
        ArrayList<String> lista = auxiliar.listar();
        ArrayList<Emprestimos> emprestimos = new ArrayList<>();
        for (String aux:lista) {
            emprestimos.add((Emprestimos) auxiliar.ler(aux));
        }
        for (Emprestimos aux:emprestimos) {
            System.out.println(aux);
        }

        System.out.println("Reservas:");
        Reserva auxiliar1 = new Reserva();
        ArrayList<String> lista1 = auxiliar1.listar();
        ArrayList<Reserva> reservas = new ArrayList<>();
        for (String aux1:lista1) {
            reservas.add((Reserva) auxiliar1.ler(aux1));
        }
        for (Reserva aux1:reservas) {
            System.out.println(aux1);
        }


    }

    public static void listarObras() throws Exception {
        Livros auxiliar = new Livros();
        ArrayList<String> lista = auxiliar.listar();
        ArrayList<Livros> emprestimos = new ArrayList<>();
        for (String aux:lista) {
            int indice = aux.indexOf('+')+1;
            emprestimos.add(auxiliar.ler(aux.substring(indice)));
        }
        for (Livros aux:emprestimos) {
            System.out.println(aux);
        }
    }
    public static void listarMinhasObras(Usuario usuario) {
        ArrayList<Emprestimos>auxiliar= usuario.getEmprestimos();

        for (Emprestimos atual : auxiliar) {
            System.out.println(atual.getLivro());
        }

    }

    public static void criaPastas(){
        String diretorio = "C:\\";
        String nomePasta = "BibliotecaParte3";
        File pasta = new File(diretorio, nomePasta);
        if (!pasta.exists()) {
            pasta.mkdirs();
        }
        String diretorio2 = "C://BibliotecaParte3";
        String nomePasta2 = "Emprestimo";
        File pasta2 = new File(diretorio2, nomePasta2);
        if (!pasta2.exists()) {
            pasta2.mkdirs();
        }
        String nomePasta3 = "Obra";
        File pasta3 = new File(diretorio2, nomePasta3);
        if (!pasta3.exists()) {
            pasta3.mkdirs();
        }
        String nomePasta4 = "Reserva";
        File pasta4 = new File(diretorio2, nomePasta4);
        if (!pasta4.exists()) {
            pasta4.mkdirs();
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
        livro= livro.ler(titulo);
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

        System.out.println("qual o login do aluno");
        login = scanner.nextLine();
        Estudande auxilaiar = new Estudande();
        Professor auxilaiar2 = new Professor();
        Funcionario auxilaiar3 = new Funcionario();
        if (auxilaiar.ler(login) != null || auxilaiar2.ler(login) != null || auxilaiar3.ler(login) != null) {
            System.out.println("Usuario ja existe");
            return;

        }
        System.out.println("qual o id do aluno");
        id = Long.parseLong(scanner.nextLine());
        System.out.println("qual a senha do aluno");
        senha = scanner.nextLine();
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

        Estudande estudante = new Estudande(id, login, senha, nome, idade, sexo, telefone, matricula, curso, periodo);
        estudante.gravar();
    }

    public static void cadastraProfessor() throws Exception {
        String nome, sexo, telefone, login, senha, formacaoAcademica, cursoMinistrado;
        int idade;
        long id;
//


        System.out.println("qual o login do professor");
        login = scanner.nextLine();
        Estudande auxilaiar = new Estudande();
        Professor auxilaiar2 = new Professor();
        Funcionario auxilaiar3 = new Funcionario();
        if (auxilaiar.ler(login) != null || auxilaiar2.ler(login) != null || auxilaiar3.ler(login) != null) {
            System.out.println("Usuario ja existe");
            return;

        }
        System.out.println("qual o id do profssor");
        id = Long.parseLong(scanner.nextLine());
        System.out.println("qual a senha do prodessor");
        senha = scanner.nextLine();
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

        Professor professor = new Professor(id, login, senha, nome, idade, sexo, telefone, formacaoAcademica, cursoMinistrado);
        professor.gravar();

    }

    public static void cadastraFuncionario() throws Exception {
        String nome, login, senha, sexo, telefone, departamento, cargo;
        int idade;
        long id;

        System.out.println("qual o login do funcionario");
        login = scanner.nextLine();
        Estudande auxilaiar = new Estudande();
        Professor auxilaiar2 = new Professor();
        Funcionario auxilaiar3 = new Funcionario();
        if (auxilaiar.ler(login) != null || auxilaiar2.ler(login) != null || auxilaiar3.ler(login) != null) {
            System.out.println("Usuario ja existe");
            return;

        }
        System.out.println("qual o id do funcionario");
        id = Long.parseLong(scanner.nextLine());
        System.out.println("qual a senha do funcionario");
        senha = scanner.nextLine();
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
            Professor professor = (Professor) usuario;
            professor.excluir();
        }else if (usuario instanceof Funcionario){
            Funcionario funcionario = (Funcionario) usuario;
            funcionario.excluir();
        }
    }

    public static void cadastraEmprestimo(Usuario usuario) throws Exception {
        String dataDoEmprestimo, horaDoEmprestimo, tituloLivro;
        Livros livro = null;

        System.out.println("escreva o titulo do livro");
        tituloLivro = scanner.nextLine();
        Livros auxiliar3 = new Livros();

        if (auxiliar3.ler(tituloLivro) != null) {
            livro = auxiliar3.ler(tituloLivro);
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
        ArrayList<Emprestimos> auxiliar = usuario.getEmprestimos();
        auxiliar.add(emprestimo);
        usuario.setEmprestimos(auxiliar);
        usuario.atualizar();
    }

    public static void realizaDevolucao(Usuario usuario) throws Exception {
        boolean verificaEmprestimo = false;
        ArrayList<Emprestimos>auxiliar= usuario.getEmprestimos();
        System.out.println("Qual o titulo do livro");
        String tituloLivro = scanner.nextLine();
        Livros auxiliar3 = new Livros();

        if (auxiliar3.ler(tituloLivro) == null) {
            System.out.println("Livro nao existe");
            return;
        }

        for (Emprestimos atual : auxiliar) {
            if (atual.getLivro().getTitulo().equals(tituloLivro)){
                atual.devolverLivro();
                auxiliar.remove(atual);
                atual.excluir();
                verificaEmprestimo=true;
                break;
            }
        }
        if (!verificaEmprestimo){
            System.out.println("livro nao emprestado");
        }
        usuario.setEmprestimos(auxiliar);
    }

    public static void cadastrarReserva(Usuario usuario) throws Exception {
        String dataDoEmprestimo, horaDoEmprestimo, tituloLivro;
        Livros livro;

        System.out.println("escreva o titulo do livro");
        tituloLivro = scanner.nextLine();
        Livros auxiliar3 = new Livros();

        if (auxiliar3.ler(tituloLivro) != null) {
            livro = auxiliar3.ler(tituloLivro);
        } else {
            System.out.println("Livro nao existe");
            return;
        }


        if (!livro.isReserva()) {
            System.out.println("Livro ja esta reservado");
            return;
        }

        System.out.println("escreva a data da reserva");
        dataDoEmprestimo = scanner.nextLine();

        System.out.println("escreva a hora da reserva");
        horaDoEmprestimo = scanner.nextLine();

        Reserva reserva = new Reserva(dataDoEmprestimo, horaDoEmprestimo, livro, usuario);

        livro.setReserva(false);
        livro.atualizar();
        reserva.gravar();
        ArrayList<Reserva> auxiliar = usuario.getReserva();
        auxiliar.add(reserva);
        usuario.setReserva(auxiliar);
        usuario.atualizar();
    }
}
