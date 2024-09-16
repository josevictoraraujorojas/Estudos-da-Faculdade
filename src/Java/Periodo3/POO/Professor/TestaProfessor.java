package Java.Periodo3.POO.Professor;

import java.util.ArrayList;

public class TestaProfessor {
    public static void main(String[] args) {
        ArrayList<ProfessorDE> cadDE = new ArrayList<ProfessorDE>();
        ArrayList<ProfessorHorista> cadHorario = new ArrayList<ProfessorHorista>();

        cadDE.add(new ProfessorDE("joao",1,1123.56));
        cadDE.add(new ProfessorDE("maria",2,1200.00));

        cadHorario.add(new ProfessorHorista("jose",3,14,12.5));
        cadHorario.add(new ProfessorHorista("Fernando",4,12,12.5));
        cadHorario.add(new ProfessorHorista("Ana",5,20,12.5));

        System.out.println("Nome dos Professores De: ");

        for (ProfessorDE autal: cadDE) {
            System.out.println(autal.getNome());
        }

        System.out.println("Salario/hora dos professores horistas: ");

        for (ProfessorHorista autal: cadHorario) {
            System.out.println(autal.getNome()+" "+autal.getSalario());
        }
    }
}
