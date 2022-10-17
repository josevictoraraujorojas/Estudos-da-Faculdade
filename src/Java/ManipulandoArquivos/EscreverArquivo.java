package Java.ManipulandoArquivos;
import java.io.*;
public class EscreverArquivo {
    public static void main(String[] args) {
        try {
            BufferedWriter wt = new BufferedWriter(new FileWriter("teste.txt",true));
            wt.write("oi! \n");
            wt.write("tudo bem");
            wt.close();
            BufferedReader rd = new BufferedReader(new FileReader("teste.txt"));
            String line;
            while ( (line=rd.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
