package principal;

/***
 * 
 *El profesor pregunta a un alumno por un color entre rojo, amarillo y verde.
 * 
 * @author Julieta Ferrari
 * @version 1.0
 */
import clases.profesor;

/** @hidden */
public class clasecolor {
	public static void main(String[] args) {
		profesor teacher = new profesor();
		String color = teacher.preguntacolor();
		System.out.println("La respuesta recibida es:" + color);
	}
}
