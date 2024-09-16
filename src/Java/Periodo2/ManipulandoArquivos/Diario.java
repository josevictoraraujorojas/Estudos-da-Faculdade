package Java.Periodo2.ManipulandoArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Diario {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner importar = new Scanner(new File("src/Java/ManipulandoArquivos/Diario.txt"));
        while (importar.hasNextLine()) {
            System.out.println(importar.nextLine());
        }
        importar.close();
    }
}
