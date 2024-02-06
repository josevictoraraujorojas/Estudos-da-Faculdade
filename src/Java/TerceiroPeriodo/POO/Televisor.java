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
        try {
            if (volume>=0&&volume<100) {
                this.volume = volume;
            }else {
                throw new Exception("volume deve ser um valor entre 0 e 100");
            }
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        try {
            if (volume >= 0 && canal < 1000) {
                this.canal = canal;
            }
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }

    public void aumentarVolume(){
        if (canal<100) {
            this.volume++;
        }
    }
    public void reduzirVolume(){
        if (canal<100) {
            this.volume--;
        }
    }

    public void trocarCanal(int canal){
        if (canal<1000) {
            this.canal = canal;
        }
    }
    public String mostrar(){

        return  "Canal:"+getCanal()+ " " +"Volume:" +getVolume();
    }
}
