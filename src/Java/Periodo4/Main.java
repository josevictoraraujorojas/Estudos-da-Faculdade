package Java.Periodo4;

public class Main {
    public static void main(String[] args) {
        ArvoreAvl arvore = new ArvoreAvl();
        arvore.inserir(11);
        arvore.inserir(9);
        arvore.inserir(8);
        arvore.inserir(7);

        System.out.println("---------------------------");

        arvore.retirar(7);

        arvore.inserir(10);

        arvore.retirar(8);
    }

}
