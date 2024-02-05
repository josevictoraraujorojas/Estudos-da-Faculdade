package Java.TerceiroPeriodo.POO;

public class Televisor {
    public int volume;
    public int canal;

    public Televisor(int volume, int canal) {
        this.volume = volume;
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
