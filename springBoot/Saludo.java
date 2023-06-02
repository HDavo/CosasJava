/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SALUDO.java."

import java.io.*;

public class Saludo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		// Entorno
		// Bloque de sentencias
		System.out.println("¿Como te llamas?");
		nombre = bufEntrada.readLine();
		System.out.println("Buenas tardes"+nombre);
	}


}

