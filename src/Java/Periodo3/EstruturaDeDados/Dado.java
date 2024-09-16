package Java.Periodo3.EstruturaDeDados;

public class Dado {
    int numero;
    char letra;

    public Dado(int numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "numero=" + numero +
                ", letra=" + letra +
                '}';
    }
}
