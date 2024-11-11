package Java.Periodo4;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(10);
        arvore.inserir(9);
        arvore.inserir(8);
        arvore.inserir(7);

        System.out.println("---------------------------");

        arvore.retirar(10);

    }
}
