package Java.TerceiroPeriodo.EstruturaDeDados.ListaLista;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada encadeada = new ListaEncadeada();
        Object[] vetor = new Object[]{13,12,11,22,10,10,10,10,10,10};
        encadeada.adicionaElementoInicio(1);
        encadeada.adicionaElementoInicio(2);
        encadeada.adicionaElementoInicio(3);
        encadeada.adicionaElementoInicio(4);
        encadeada.adicionaElementoInicio(5);
        System.out.println(encadeada);
        ListaEncadeada lista = new ListaEncadeada(vetor);
        System.out.println(lista);
        lista.removeOcorrencia((int)10);
        System.out.println(lista);
        System.out.println(lista.somaElementos());
        System.out.println(lista.trocaDoisElementos(12,0));
        System.out.println(lista);
        ListaEncadeada string = new ListaEncadeada("danielly");
        ListaEncadeada string1 = new ListaEncadeada("olamundoeusoujose");
        System.out.println(string);
        System.out.println(string.converteListaParaString(string));
        System.out.println(string1.caracterDiferente(string1,string));
        System.out.println(string1.substring('o','e'));
    }
}
