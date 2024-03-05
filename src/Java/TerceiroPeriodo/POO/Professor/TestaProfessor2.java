package Java.TerceiroPeriodo.POO.Professor;

import java.util.ArrayList;

public class TestaProfessor2 {
    public static void main(String[] args) {
        ArrayList<Professor>cadProfessor = new ArrayList<>();
        cadProfessor.add(new ProfessorDE("joao",1,1123.56));
        cadProfessor.add(new ProfessorDE("maria",2,1200.00));
        cadProfessor.add(new ProfessorHorista("jose",3,14,12.5));
        cadProfessor.add(new ProfessorHorista("Fernando",4,12,12.5));
        cadProfessor.add(new ProfessorHorista("Ana",5,20,12.5));

        System.out.println("Nome dos professores:");
        for (Professor atual:cadProfessor) {
            System.out.println(atual.getNome());
        }

        System.out.println("Salaraio dos professores:");
        for (Professor atual:cadProfessor) {
            if (atual instanceof ProfessorDE){
                ProfessorDE professorDE = (ProfessorDE) atual;
                System.out.println(professorDE.getSalario());
            }else {
                ProfessorHorista professorHorista = (ProfessorHorista) atual;
                System.out.println(((ProfessorHorista) atual).getSalario());
            }
        }
    }
}
