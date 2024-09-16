package Java.Periodo2.ManipulandoArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ItemPorItem {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner importar = new Scanner(new File("src/Java/ManipulandoArquivos/ItemPorItem.txt"));
        while (importar.hasNext()){
            System.out.println(importar.next());
        }
        importar.close();
    }
}
