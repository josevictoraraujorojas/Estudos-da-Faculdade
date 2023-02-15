package Java.TerceiroPeriodo;

public class Televisor {
	
 private int volume;
 private int canal;
 
 public void aumentarVolume()
 {
	this.volume++;
 }
 
 public void reduzirVolume() 
 {
	 this.volume--;
 }
 
 public void trocarCanal(int canal) 
 {
	 this.canal=canal;
 }
 
 public String mostrar() 
 {
	 return "\nVolume:"+volume+"\nCanal:"+canal+"\n";
 }

}