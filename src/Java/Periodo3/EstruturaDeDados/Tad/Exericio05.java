package Java.Periodo3.EstruturaDeDados.Tad;

public class Exericio05 {
    double altura;
    double raio;

    public void criaCilindro(double altura,double raio){
        this.altura=altura;
        this.raio=raio;
    }
    public double areaCilindro(){
        return (2*Math.PI)*(raio+altura);
    }
    public double volumeCilindro(){
        return (Math.PI*Math.pow(raio,3))*altura;
    }

}
