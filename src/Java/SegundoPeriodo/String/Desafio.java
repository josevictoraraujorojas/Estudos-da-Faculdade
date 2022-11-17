package Java.SegundoPeriodo.String;

import java.util.Locale;


public class Desafio {
    public static void main(String[] args) {
        String mae = "Jose";
        String pai = "Danielly";
        char sexo = 'f';
        System.out.println(sugestaoNomeFilho(mae,pai,sexo));

    }
    public static String sugestaoNomeFilho (String mae,String pai,char sexo){
        String filho="contador";
        if (sexo=='f') {
             filho = mae.substring(0, mae.length() / 2) + pai.substring(0, pai.length() / 2);
        }
        if (sexo=='m') {
             filho = pai.substring(0, mae.length() / 2) + mae.substring(0, pai.length() / 2);
        }
        return filho.toUpperCase(Locale.ROOT);
    }

}
