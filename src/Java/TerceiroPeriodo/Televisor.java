package Java.TerceiroPeriodo;

public class Televisor {
	
 private int volume;
 private int canal;
 
 public void aumentarVolume()
 {
	 if(this.volume<100) {
	this.volume++;
	 }
 }
 
 public void reduzirVolume() 
 {
	 if(this.volume>0){
	 this.volume--;
	 }
 }
 
 public void trocarCanal(int canal) 
 {
	 if(this.canal<100 && this.canal>0) {
	 this.canal=canal;
	 }
 }
 
 public String mostrar() 
 {
	 return "\nVolume:"+volume+"\nCanal:"+canal+"\n";
 }

}