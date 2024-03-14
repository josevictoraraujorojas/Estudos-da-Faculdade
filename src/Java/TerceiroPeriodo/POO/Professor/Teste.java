package Java.TerceiroPeriodo.POO.Professor;

public class Teste {
    public static void main(String[] args) {
        Professor prof1 = new ProfessorDE("joao",1,2500);
        Professor prof2 = new ProfessorHorista("jose",3,14,12.5);

       /*
       nao pode cria um objeto expecifico apartir de um generalizado
        ProfessorDE prof3 = new Professor("maria",2,14);
        */
        Professor profSuper;
        ProfessorDE profSub;
        ProfessorDE prof4 = new ProfessorDE("jose",3,1500);
        profSuper=prof4;
        /*
        nao pode ser criado
        profSub= profSuper;
         */
        profSub= (ProfessorDE) profSuper;
        System.out.println();
        System.out.println();


    }
}
