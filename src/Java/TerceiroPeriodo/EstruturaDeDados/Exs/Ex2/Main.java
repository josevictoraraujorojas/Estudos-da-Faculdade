package Java.TerceiroPeriodo.EstruturaDeDados.Exs.Ex2;

public class Main {
    public static void main(String[] args) {
        Aluno al1 = new Aluno("jose",60,"01/01/1901");
        Aluno al2 = new Aluno("joao",70,"02/02/1902");
        Aluno al3 = new Aluno("junior",80,"03/03/1903");
        Aluno al4 = new Aluno("ariana",90,"04/04/1904");
        Aluno al5 = new Aluno("pedro",100,"05/05/1905");
        Aluno al6 = new Aluno("luis",30,"06/06/1906");
        Aluno al7 = new Aluno("dany",40,"07/07/1907");
        Aluno al8 = new Aluno("valeria",20,"08/08/1908");


        VetorAlunos alunos = new VetorAlunos(al1,al2,al3,al4,al5,al6,al7,al8);

        alunos.mostraAlunos();
        System.out.println("------");
        alunos.encontraAluno("jose");
        System.out.println("----------");

        Aluno novoAluno = new Aluno("rhavi",10,"015/12/2020");

        alunos.insereAluno(novoAluno,8);
        System.out.println("----------");
        alunos.mostraAlunos();
        System.out.println("----------");
        alunos.encontraAluno("jose");


    }

}
