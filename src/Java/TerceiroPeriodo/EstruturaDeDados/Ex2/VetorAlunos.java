package Java.TerceiroPeriodo.EstruturaDeDados.Ex2;

import Java.TerceiroPeriodo.EstruturaDeDados.Ex2.Aluno;

public class VetorAlunos {

    private Aluno[] alunos = new Aluno[10];

    private int indice;


    public VetorAlunos(Aluno al1,Aluno al2,Aluno al3,Aluno al4,Aluno al5,Aluno al6,Aluno al7,Aluno al8) {
        this.alunos = alunos;

        this.alunos[0]=al1;
        this.alunos[1]=al2;
        this.alunos[2]=al3;
        this.alunos[3]=al4;
        this.alunos[4]=al5;
        this.alunos[5]=al6;
        this.alunos[6]=al7;
        this.alunos[7]=al8;
        this.alunos[8]=null;
        this.alunos[9]=null;
    }


    public void insereNoIndice(Aluno aluno, int posicao){
        for (int i = 8; i >=indice; i--) {

            this.alunos[i+1]= this.alunos[i];
        }
        this.alunos[indice] = aluno;
    }

    public void encontraAluno(String nome ){
        for (int i = 0; i < 10 ; i++) {
            if (this.alunos[i]!=null&&this.alunos[i].getNome().equals(nome)) {
                System.out.printf("Indice:%d Nome:%s, Peso:%d, Data de nascimento: %s\n", i,this.alunos[i].getNome(), this.alunos[i].getPeso(), this.alunos[i].getDataNascimento());
            }
        }
    }
    public void mostraVetor(){
        for (int i = 0; i < 10 ; i++) {
            if (this.alunos[i]!=null) {
                System.out.printf("Indice:%d Nome:%s, Peso:%d, Data de nascimento: %s\n", i,this.alunos[i].getNome(), this.alunos[i].getPeso(), this.alunos[i].getDataNascimento());
            }
        }
    }

}
