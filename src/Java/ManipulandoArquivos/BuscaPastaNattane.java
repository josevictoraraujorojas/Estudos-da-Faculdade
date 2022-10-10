package Java.ManipulandoArquivos;

import java.io.File;
import java.util.Scanner;

public class BuscaPastaNattane {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        analizandoPasta(ler.nextLine());
    }
    public static void analizandoPasta(String caminhoPasta){
        File pasta = new File(caminhoPasta);
        String[] arquivos = pasta.list();

        for (String copia: arquivos) {
            if (copia.contains("exe")){
                System.out.println(copia);
            }
        }
    }
}
