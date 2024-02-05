package Java.TerceiroPeriodo.EstruturaDeDados.Exs.Ex4;

public class Main {
    public static void main(String[] args) {
        VetorDinamico vetor = new VetorDinamico();
        vetor.adiciona(1);
        vetor.adiciona(2);
        vetor.adiciona(3);
        vetor.adiciona(4);
        vetor.adiciona(5);
        vetor.adiciona(1000);
        vetor.adiciona(7);
        vetor.adiciona(8);
        vetor.adiciona(9);
        vetor.adiciona(10);

        System.out.println(vetor);

        vetor.busca(1000);

        vetor.remove(1000);
        System.out.println(vetor);




    }
}
