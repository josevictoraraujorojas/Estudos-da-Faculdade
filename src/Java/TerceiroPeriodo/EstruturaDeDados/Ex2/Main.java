package Java.TerceiroPeriodo.EstruturaDeDados.Ex2;

public class Main {
    public static void main(String[] args) {
        Aluno al1 = new Aluno("jose",60,"01/01/1901");
        Aluno al2 = new Aluno("jose",70,"02/02/1902");
        Aluno al3 = new Aluno("jose",80,"03/03/1903");
        Aluno al4 = new Aluno("jose",90,"04/04/1904");
        Aluno al5 = new Aluno("jose",100,"05/05/1905");
        Aluno al6 = new Aluno("jose",30,"06/06/1906");
        Aluno al7 = new Aluno("jose",40,"07/07/1907");
        Aluno al8 = new Aluno("jose",20,"08/08/1908");


        VetorAlunos alunos = new VetorAlunos(al1,al2,al3,al4,al5,al6,al7,al8);

        alunos.mostraVetor();
        System.out.println("------");
        alunos.encontraAluno("jose");
        System.out.println("----------");
        alunos.insereNoIndice(al1,4);
        System.out.println("----------");
        alunos.mostraVetor();
        System.out.println("----------");
        alunos.encontraAluno("jose");


    }

}
