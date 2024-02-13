package Java.TerceiroPeriodo.EstruturaDeDados.Exs.Ex4;

public class Main {
    public static void main(String[] args) {
        VetorDinamico vetor = new VetorDinamico();
        vetor.adiciona(1);
        vetor.adiciona(2);
        vetor.adiciona(3);
        vetor.adiciona(4);


        System.out.println(vetor);

        vetor.busca(2);

        vetor.remove(3);
        System.out.println(vetor);




    }
}
