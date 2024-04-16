package Java.TerceiroPeriodo.EstruturaDeDados.Pilha;

public class Main {
    public static void main(String[] args) throws Exception {
        PilhaDinamica<Integer> pilhaDinamica = new PilhaDinamica<>();
        PilhaDinamica<Integer> pilhaDinamica2 = new PilhaDinamica<>();
        pilhaDinamica.empilhar(1);
        pilhaDinamica.empilhar(2);
        pilhaDinamica.empilhar(3);
        pilhaDinamica.empilhar(4);

        pilhaDinamica2.empilhar(5);
        pilhaDinamica2.empilhar(6);
        pilhaDinamica2.empilhar(7);
        pilhaDinamica2.empilhar(8);
        //ex01
        PilhaDinamica.retiraElementosImpares(pilhaDinamica);
        //ex02
        pilhaDinamica.inverter();
        //ex03
        PilhaDinamica.empilhaSegundaSobrePrimeira(pilhaDinamica,pilhaDinamica2);
        //ex07
        pilhaDinamica.menorValor();
        pilhaDinamica.maiorValor();
        pilhaDinamica.mediaValor();

        pilhaDinamica.imprimi();


    }
}
