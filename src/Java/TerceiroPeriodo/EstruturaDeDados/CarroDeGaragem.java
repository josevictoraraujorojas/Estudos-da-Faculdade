package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarroDeGaragem {
    String marca;
    String modelo;
    String cor;
    String placa;

    public void insereDados(String marca,String modelo,String cor,String placa){
        Pattern pattern = Pattern.compile("[A-Z]{3}[1-9][A-Z][1-9]{2}");
        Matcher matcher = pattern.matcher(placa);
        boolean verificaPlaca = matcher.matches();

        if (!verificaPlaca){
            System.out.println("valor da placa(LLLNLNN) e invalido tente novamente");
            return;
        }

        this.marca=marca;
        this.modelo=modelo;
        this.cor=cor;
        this.placa=placa;

    }

    public void excluiDados(){
        this.marca=null;
        this.modelo=null;
        this.cor=null;
        this.placa=null;
    }

    public void consultaDados(){
        System.out.printf("marca:%s\nmodelo:%s\ncor:%s\nplaca:%s\n",this.marca,this.modelo,this.cor,this.placa);
    }

}
