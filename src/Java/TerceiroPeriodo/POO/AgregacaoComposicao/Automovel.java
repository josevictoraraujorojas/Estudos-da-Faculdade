package Java.TerceiroPeriodo.POO.AgregacaoComposicao;

public class Automovel {
    private Motor motor;
    private Direcao direcao;


    public Automovel() {
    }

    public Automovel(Motor motor, Direcao direcao) {
        setMotor(motor);
        setDirecao(direcao);
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "motor=" + motor +
                ", direcao=" + direcao +
                '}';
    }
}
