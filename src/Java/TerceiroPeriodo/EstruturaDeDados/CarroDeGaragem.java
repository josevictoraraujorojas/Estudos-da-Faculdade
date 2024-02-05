package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarroDeGaragem {
    String marca;
    private String modelo;
    private String cor;
    private String placa;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        Pattern pattern = Pattern.compile("[A-Z]{3}[1-9][A-Z][1-9]{2}");
        Matcher matcher = pattern.matcher(placa);
        boolean verificaPlaca = matcher.matches();

        if (!verificaPlaca){
            System.out.println("valor da placa(LLLNLNN) e invalido tente novamente");
            return;
        }
        this.placa = placa;
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
