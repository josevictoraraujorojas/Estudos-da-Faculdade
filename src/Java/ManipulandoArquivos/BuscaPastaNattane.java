package Java.ManipulandoArquivos;

import java.io.File;
import java.util.Scanner;

public class BuscaPastaNattane {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("escreva o caminho para a pasta:");
                Scanner ler = new Scanner(System.in);
                String caminho= ler.nextLine();
                System.out.println("escreva o tipo de arquivo que vc quer encontrar e saber a quantidade: ");
                String tipoDeArquivo= ler.nextLine();
                analizandoPasta(caminho,tipoDeArquivo);
                break;
            } catch (NullPointerException e) {
                System.out.println("caminho nao encontrado");
            }
        }
    }
    public static void analizandoPasta(String caminhoPasta,String tipoDeArquivo){
        File pasta = new File(caminhoPasta);
        String[] arquivo = pasta.list();
        int quantidadeDeArquivos=0;
        for (String copia: arquivo) {
            if (copia.contains(tipoDeArquivo)){
                System.out.println(copia);
                quantidadeDeArquivos++;
            }
        }
        System.out.printf("\n quantidades de arquivos %s encontrados: %d", tipoDeArquivo, quantidadeDeArquivos);
    }
}
