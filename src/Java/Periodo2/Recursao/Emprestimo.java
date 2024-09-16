package Java.Periodo2.Recursao;

public class Emprestimo {
    public static void main(String[] args) {
        StringBuilder impressao = new StringBuilder();
        System.out.println(calculo(impressao,2000/12, 0.04f,1,12));
    }
    public static StringBuilder calculo(StringBuilder impressao,float creditoIncial,float taxaDeJuros,int tempoInicial, int tempoFinal){
        if (tempoInicial <= tempoFinal){
            StringBuilder montante = new StringBuilder(String.valueOf((creditoIncial * Math.pow((1 + taxaDeJuros), tempoInicial))));
            impressao.append(montante, 0, montante.indexOf(".")+3);
            impressao.append("\n");
            calculo(impressao,creditoIncial,taxaDeJuros,tempoInicial+1,tempoFinal);
        }
        return impressao;
    }
}
