package Java.TerceiroPeriodo.POO;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume=50;
        this.ligado=false;
        this.tocando=false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.printf("\nO aparelho esta ligado:%b\nO volume esta em:%d\nO aparelho esta tocando:%B\n",getLigado(),getVolume(),getTocando());
        for (int i = 0; i < getVolume(); i+=10) {
            System.out.print("|");
        }
        System.out.println();
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado()){
            setVolume(getVolume()+1);
        }else {
            System.out.println("O aparelho esta desligado");
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()){
            setVolume(getVolume()-1);
        }else {
            System.out.println("O aparelho esta desligado");
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado()&&getVolume()>0){
            setVolume(0);
        }else {
            System.out.println("O aparelho esta desligado ou o volume ja esta no mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado()&&getVolume()==0){
            setVolume(50);
        }else {
            System.out.println("O aparelho esta desligado ou o volume ja esta no mudo");
        }
    }

    @Override
    public void play() {
        if (getLigado()&&!getTocando()){
            setTocando(true);
        }else {
            System.out.println("O aparelho esta desligado ou o volume ja esta no play");
        }
    }

    @Override
    public void pause() {
        if (getLigado()&&getTocando()){
            setTocando(false);
        }else {
            System.out.println("O aparelho esta desligado ou o volume ja esta pausado");
        }
    }
}
