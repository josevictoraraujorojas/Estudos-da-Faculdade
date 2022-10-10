package Java.ManipulandoArquivos;
import java.io.File;
import java.util.Scanner;
    public class LeituraArquivosDeitelExemplo {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Entre com o nome do arquivo ou diretório:");
            analyzePath(input.nextLine());
        }
        public static void analyzePath(String path){
            File name = new File(path);
            if(name.exists()){
                System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                        name.getName(), "exists ",
                        (name.isFile() ? "is a file" : "is not a file"),
                        (name.isDirectory() ? "is a directory" : "is not a directory"),
                        (name.isAbsolute() ? "is a absolute path" : "is not a absolute path"),
                        "Last modified: ", name.lastModified(),
                        "Length: ", name.length(),
                        "Path:", name.getPath(),
                        "Absolute Path:" , name.getAbsolutePath(),
                        "Parent:", name.getParent());
                if(name.isDirectory()){
                    String[] directory = name.list();
                    System.out.println("\n\n Quantidade de itens: " + directory.length);
                    System.out.println("\n\n Directory contents:\n");
                    int[] count = new int[6];
                    for(String directoryName : directory){
                        for (int i = 0; i <= count.length; i++) {
                            if(directoryName.contains("("+(i+1)+")")){
                                count[i]++;
                            }
                        }
                    }
                    for (int i = 1; i <= count.length; i++) {
                        System.out.println("Quantidade de arquivos baixados "+(i+1)+" vezes: " +
                                count[i-1]);
                    }
                }//fim do if isDirectory
            }//fim do if externo exists
else{ //se não for arquivo ou diretório, gera uma mensagem de erro:
                System.out.printf("%s %s", path, "does not exists.");
            }//fim do else
        }//fim do método
    }//fuim da classe


