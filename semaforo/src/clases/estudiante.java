package clases;
/***
 * 
 * La clase estudiante cuelga de la clase persona. 
 * Incluye un metodo de clase que se une a los heredados.
 * 
 * @author Julieta Ferrari
 * @version 1.0
 */
public class estudiante extends persona {
	/**
	 * @param i_Curso mostrará el curso en el que está cada alumno.*/
	int i_Curso;

	/* Este es el constructor.*/
	/**
	 * @param Asigna i_Edad (edad) a 25.
	 * @param Asigna s_Nombre (nombre) a Luis.
	 * @param Asigna i_Curso (curso) a 1. */
	public estudiante() {
		i_Edad = 25;
		s_Nombre = "Luis";
		i_Curso = 1;
	}
	/**
	 * Es creado un método llamado presentarse.
	 * @return Devolverá una oración compuesta por el nombre del alumno, el curso y el color elegido 
	 * acorde a las opciones dadas.*/
	public void presentarse() {
		System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) + " y 	tengo una edad de: "
				+ Integer.toString(i_Edad));
	}

	/**
	 * Se crea otro método llamado preguntacolor (también existe en la clase profesor).
	 * Esta misma clase llama al método presentarse.
	 * @param La variable llamada mipc proviene de la clase ordenador.
	 * @return Devuelve el color (creado en la clase ordenador).*/
	public String preguntacolor() {
		presentarse();
		ordenador mipc = new ordenador();
		return mipc.color();
	}
}
