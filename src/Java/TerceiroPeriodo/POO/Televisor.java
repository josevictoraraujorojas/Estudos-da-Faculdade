package Java.TerceiroPeriodo.POO;

public class Televisor {
    private int volume;
    private int canal;

    public Televisor(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume(){
        this.volume++;
    }
    public void reduzirVolumeVolume(){
        this.volume--;
    }
    public void trocarCanal(int canal){
        this.canal=canal;
    }
    public String mostrar(){

        return  "Canal:"+this.canal + "\n" +"Volume:" +this.volume;
    }
}
