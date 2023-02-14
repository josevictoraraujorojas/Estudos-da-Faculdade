package Java.TerceiroPeriodo;
import java.util.*;  

public class Televisor {
	
 public int volume;
 public int canal;
 
 public void aumentarVolume() {
	 volume++;
 }
 
 public void reduzirVolume() {
	 volume--;
 }
 
 public void trocarCanal() {
	 Scanner ler = new Scanner(System.in);
	 try
	 {
	 System.out.println("Qual o canal desejado?");
	 canal=ler.nextInt();
	 
	 }catch(InputMismatchException e) {
		 System.out.println("Resposta invalida");
		 trocarCanal();
	 }
 }
 
 public void mostrar() {
	 System.out.printf("\nVolume:%d\nCanal:%d\n",volume,canal);
 }

 public static void main(String[] args) {
 Televisor televisor = new Televisor();
 
 televisor.canal=0;
 televisor.volume=30;
 televisor.mostrar();

 televisor.aumentarVolume();
 televisor.trocarCanal();
 televisor.mostrar();
 
 televisor.reduzirVolume();
 televisor.mostrar();
 
 }
 
}