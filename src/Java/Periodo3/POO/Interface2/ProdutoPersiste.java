package Java.Periodo3.POO.Interface2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProdutoPersiste extends  Produto{
    public String gravar(){
        String ret = "Produto armazenado com sucesso";
        try {
            FileOutputStream file = new FileOutputStream("d:/Produto"+this.getCodigo());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
        }catch (Exception erro){
            ret="falha na gravacao"+erro.toString();
        }
        return ret;
    }

    public static Produto ler(int codigo){
        try {
            FileInputStream file = new FileInputStream("d:/Produto"+codigo);
            ObjectInputStream stream = new ObjectInputStream(file);
            return (Produto) stream.readObject();
        }catch (Exception erro){
            System.out.println("falha na gravacao"+erro.toString());
            return null;
        }
    }
}
