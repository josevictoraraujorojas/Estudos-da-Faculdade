package Java.TerceiroPeriodo;

public class MainTelevisor {

	public static void main(String[] args) {
		
		Televisor televisor = new Televisor();
		
		televisor.setVolume(8);
		televisor.setCanal(100);
		System.out.print(televisor.getCanal()+" "+televisor.getVolume());
	

	}

}
