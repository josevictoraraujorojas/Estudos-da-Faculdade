package Java.Periodo3.EstruturaDeDados.Tad;

public class Ex06 {
    double raio;

    public void criaEsfera(double raio){
        this.raio=raio;
    }
    public double volumeEsfera(){
        return Math.pow(4*Math.PI*raio,3)/3;
    }
    public double areaEsfera(){
        return Math.pow(4*Math.PI*raio,2);
    }
}
