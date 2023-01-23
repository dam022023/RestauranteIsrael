package figuras;

public class Circunferencia {
	double radio;
	private String color;

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	// Getters y setters
	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}

	public void imprimir() {
		color = "rojo";
		System.out.println("Diametro: " + (2 * radio));
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * radio * radio;
		System.out.println(area);
	}

	private double calcularArea() {
		return 2 * 3.1416 * radio * radio;
	}

	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.radio;
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
