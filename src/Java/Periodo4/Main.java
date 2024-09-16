package Java.Periodo4;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(5);
        arvore.inserir(11);
        arvore.inserir(3);
        arvore.inserir(4);
        arvore.inserir(2);
        arvore.inserir(10);
        arvore.inserir(14);

        arvore.imprimiArvoreOrdem();
    }
}
