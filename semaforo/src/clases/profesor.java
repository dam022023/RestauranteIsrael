package clases;

/***
 * 
 * El profesor (clase) hace la pregunta al estudiante sobre el color.
 * 
 * @author Julieta Ferrari
 * @version 1.0
 */

public class profesor extends persona {
	/**
	 * Este es el constructor, que explica que cuelga de la clase persona
	 * (superclase).
	 */
	public profesor() {
	}

	/**
	 * Es creado un método llamado preguntacolor que devuelve un String.
	 * @param variable de la clase estudiante llamada alumno. 
	 * @param colorRec representa el color que va a responder el alumno.
	 * @return  colorRec devuelve el color que se le pregunta al alumno.
	 */
	public String preguntacolor() {

		estudiante alumno = new estudiante();
		String colorRec = alumno.preguntacolor();
		return colorRec;
	}
}
