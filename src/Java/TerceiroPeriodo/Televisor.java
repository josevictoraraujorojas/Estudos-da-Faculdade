package Java.TerceiroPeriodo;

public class Televisor {
	
 private int volume;
 private int canal;
 
public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	if(volume > 0 && volume <= 100) {
		this.volume = volume;
		}else {
			System.out.println("Volume invalido");
		}
}
public int getCanal() {
	return canal;
}
public void setCanal(int canal) {
	if(canal > 0 && canal <= 100) {
	this.canal = canal;
	}else {
		System.out.println("Canal invalido");
	}
}
 
}