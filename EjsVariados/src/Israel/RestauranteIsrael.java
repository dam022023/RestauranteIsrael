package Israel;


public class RestauranteIsrael {
	public int patatas;
	public int calamares;

	public RestauranteIsrael(int a, int b) {
		this.patatas = a;
		this.calamares = b;
		}
	
	int cantP() {
		int a = this.patatas * 3;
		return a;
		}
	
	int cantC() {
		int ch = this.calamares * 6;
		return ch;
		}
	
	public void addCalamares(int c) {
		this.calamares = this.calamares + c;
		}
	
	public void addPatatas(int d) {
		this.patatas = this.patatas + d;
		}
	
	public void calculaComansales() {
		
	}
	
	public static void main(String[] args) {
		RestauranteIsrael r1 = new RestauranteIsrael(50, 60);
		System.out.println("Cantidad de calamares: " + r1.calamares);
		System.out.println("Cantidad de patatas: " + r1.patatas);
		
		if (r1.cantP() <= r1.cantC()) {
			System.out.println("\nIsrael puede dar de comer a " + r1.cantP()	+ " personas con raciones de patatas máximo");
		} else {
			System.out.println("\nIsrael puede dar de comer a " + r1.cantC()+ " personas con raciones de calamares máximo");
			}
		
		r1.addCalamares(1);
		r1.addPatatas(80);
		System.out.println("\nPedido Recibido!! Stock actual: ");
		System.out.println(r1.patatas + " patatas.\n" + r1.calamares + " calamares");
		
		if (r1.cantP() <= r1.cantC()) {
			System.out.println("\nIsrael puede dar de comer a " + r1.cantP()+ " personas con raciones de patatas máximo");
		} else {
			System.out.println("\nIsrael puede dar de comer a " + r1.cantC()+ " personas con raciones de calamares máximo");
		}
	}
}
