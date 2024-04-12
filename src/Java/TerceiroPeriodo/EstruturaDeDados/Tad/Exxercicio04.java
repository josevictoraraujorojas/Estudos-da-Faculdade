package Java.TerceiroPeriodo.EstruturaDeDados.Tad;

public class Exxercicio04 {
    double a;

    public void criaCubo(double a){
        this.a=a;
    }
    public double tamanhoLadoCudo(){
        return a;
    }
    public double volumeCubo(){
        return Math.pow(a,3);
    }
    public double areatTotalCubo(){
        return 6*Math.pow(a,3);
    }

}