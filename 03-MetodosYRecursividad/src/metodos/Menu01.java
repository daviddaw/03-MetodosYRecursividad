package metodos;



import scanner.ScannerJava;
/**
 * 1.	Escribir un método que reciba como parámetro dos números y devuelva su  suma. 
 * Análogamente, crear varios métodos para  la resta, el producto y la división. 
 * Escribir un main que pida dos números y una opción entre 1 y 4 
 * y según dicha opción invoque al método de suma, resta, producto o división.
 * @author David Palanco
 *
 */
public class Menu01 {

	public static void main(String[] args) {
		int a,b,menu;
		String respuesta;
		do {
			
		
		System.out.println("Dame dos numeros");
		a=ScannerJava.entero();
		b=ScannerJava.entero();
		do {
		System.out.println("       Menu");
		System.out.println(" ");
		System.out.println("Elije una opcion");
		System.out.println(" ");
		do {
		System.out.println("> Pulsa 1 para sumar ");
		System.out.println("> Pulsa 2 para restar");
		System.out.println("> Pulsa 3 para multiplicar");
		System.out.println("> Pulsa 4 para dividir");
		menu=ScannerJava.entero();
		
		switch (menu) {
		case 1:System.out.println(suma(a, b));break;
		case 2:System.out.println(resta(a, b));break;
		case 3:System.out.println(multi(a, b));break;
		case 4:System.out.println(divi(a, b));break;
		default:System.out.println("Esta opción no existe, elije una opción de la lista.");
		System.out.println(" ");break;
		
		}
		} while (menu<1 || menu>4);
		System.out.println("¿Quieres realizar otra operacion con estos numeros? S/N");
		 respuesta = ScannerJava.siNo();

		} while (respuesta.equalsIgnoreCase("S"));
		System.out.println("¿Quieres realizar otra operacion con otros numeros? S/N");
		 respuesta = ScannerJava.siNo();
		} while (respuesta.equalsIgnoreCase("S"));
		System.out.println("Programa finalizado");
	
	}
	
	public static int suma(int n1,int n2) {
		
		return n1+n2;
	}
	
	public static int resta(int a, int b) {
	
		return a-b;
	}
	public static int multi(int a, int b) {
		System.out.println("");
		return a*b;
	}
	public static double divi(int a, int b) {
		
		return  (double)a/b;
	}
	


}
