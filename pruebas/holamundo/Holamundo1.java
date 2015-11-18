package pruebas.holamundo;

import org.joda.time.*;

public class Holamundo1 {
	
	/*public static void main (String[] args){
		System.out.println("Hola mundo.");
		
		if (args.lenght >= 1) {
			String nombre = args[0];
			System.out.println(nombre);
		}else{
			System.out.println("Anónimo");
		}

	
	}*/
	public static void main (String[] args){
		DateTime ahora = new DateTime();
		DateTime ayer = ahora.plusDays(-1);

		System.out.println("Ahora " + ahora);
		System.out.println("Ayer " + ayer);

		System.setProperty("NOMBRE", "Laura");

		String path = System.getProperty("PATH");
		String nombre = System.getProperty("NOMBRE");
		System.out.println("PATH= " + path);
		System.out.println("NOMBRE= " + nombre);

		long milliseconds = System.currentTimeMillis();

		int seconds = (int) (milliseconds / 1000) % 60 ;
		int minutes = (int) ((milliseconds / (1000*60)) % 60);
		int hours   = (int) ((milliseconds / (1000*60*60)) % 24);

		System.out.println("Time= " + hours + " horas, " + minutes + " minutos, " + minutes+ " y " + seconds + " segundos.");

	}


}