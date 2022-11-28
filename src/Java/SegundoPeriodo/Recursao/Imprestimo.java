package Java.SegundoPeriodo.Recursao;

public class Imprestimo {
    public static void main(String[] args) {
        calculo(2000, 0.03f,1,4);
    }
    public static void calculo(float creditoIncial,float taxaDeJuros,int tempoInicial, int tempoFinal){
        if (tempoInicial <= tempoFinal){
            String montante = String.valueOf((creditoIncial*Math.pow((1+taxaDeJuros),tempoInicial)));
            System.out.println(montante.substring(0,montante.indexOf(".")+3));
            calculo(creditoIncial,taxaDeJuros,tempoInicial+1,tempoFinal);
        }
    }
}
