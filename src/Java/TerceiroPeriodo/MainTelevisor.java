package Java.TerceiroPeriodo;

public class MainTelevisor {

	public static void main(String[] args) {
		
		Televisor televisor = new Televisor();
		
		televisor.aumentarVolume();
		televisor.trocarCanal(6);
		System.out.print(televisor.mostrar());
		
		televisor.reduzirVolume();
		televisor.trocarCanal(10);
		System.out.print(televisor.mostrar());

	}

}
