package clases;

/***
 * 
 * La clase ordenador devuelve el color basado en el número aleatorio dado.
 * 
 * @author Julieta Ferrari
 * @version 1.0
 */

/** Clase importada para generar números aleatorios.*/
import java.util.Random;

public class ordenador {
	/* Este es el constructor.*/
	public ordenador() {
	}

	/**
	 * Se crea un método llamado color que devuelve un String.
	 * @param La variable llamada randomGernerator debe ser importada (línea 10).
	 * @param randomInt hará que se generen 3 números al azar (entre el 0 y 2).
	 * 
	 * Se abre un if para asignar un color a cada número.
	 * @return Si el número es 0 el color será rojo. 
	 * @return Si el número es 1 será amarillo.
	 * @return Si no es ninguno de los 2, será verde.
	 */
	public String color() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(3);
		if (randomInt == 0) {
			return "rojo";
		} else if (randomInt == 1) {
			return "amarillo";
		} else {
			return "verde";
		}
	}
}
