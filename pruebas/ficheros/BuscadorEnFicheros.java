import java.util.Scanner;
import java.io.File;

public class BuscadorEnFicheros{

	public static void main (String[] args) throws Exception{
	
		Scanner scanner = new Scanner(new File ("./ficheroparaleer.txt"));

		if(args.length > 0){
			String frase = args[0];
			int cont = 0;//contador de coincidencias

			while (scanner.hasNextLine()) {

		        String fraseEnFichero = scanner.nextLine();
	      
				//if(fraseEnFichero.contains(frase)){
		        //	cont++;
		        //}

				int indexPalabra = -1;
		       	while ( (indexPalabra = fraseEnFichero.indexOf(frase)) > -1){
		       		fraseEnFichero = fraseEnFichero.substring(fraseEnFichero.indexOf(frase)+frase.length(),fraseEnFichero.length());
		        	//System.out.println(indexPalabra);
		        	cont++;
		        }

		    }

		    System.out.println("Hay un total de " + cont + " coincidencias con la frase " + frase);

		}
	}
	
}
