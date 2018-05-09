package metodosSubirNota;

import scanner.ScannerJava;

/*2.- Escribe un programa que pida por teclado una cantidad de euros  y una moneda que
 *    puede ser  dólar, yen o libras y convierta la cantidad de euros  a la otra moneda. 
 *    Para ello se invocará a un método que tendrá como parámetros la cantidad de euros 
 *    y la moneda a pasar;  este método no devolverá ningún valor y mostrará un mensaje indicando el cambio.
	El cambio de divisas es:
•	1 EUR = 0,79550 Libras esterlinas
•	1 EUR = 1,24650 dólar americano
•	1 EUR = 144,959 JPY
*/
public class MetodoSubirNota2 {

	public static void main(String[] args) {
		double euros;
		int menu;
		System.out.println("=================================================");
		System.out.println("              Menú principal");
		System.out.println(" ");
		System.out.println("=================================================");
		System.out.println(" ");
		System.out.println("Escribe una cantidad de Euros.");
		euros=ScannerJava.positivoDouble();
		System.out.println("          Elija una moneda:");
		System.out.println(" ");
		System.out.println("> Pulse 1 para convertir a dolar.");
		System.out.println(" ");
		System.out.println("> Pulse 2 para convertir a yen.");
		System.out.println(" ");
		System.out.println("> Pulse 3 para convertir a libras.");
		System.out.println(" ");
		System.out.println("=================================================");
		menu=ScannerJava.positivo();
		

	
	switch (menu) {
	case 1:/*System.out.println("Son "+euroDolar(euros)+" dolares");*/euroDolar(euros); break;
		
	case 2:/*System.out.println("Son "+euroYen(euros)+" yenes");*/euroYen(euros); break;
	
	case 3:/*System.out.println("Son "+euroLibra(euros)+" libras")*/euroLibra(euros);break;

	default:System.out.println("No has introducido una opcion valida.");
		break;
	}

	}
		
	public static void euroDolar(double euros) {
	double cambio;
	cambio=euros*1.24650;
	System.out.println("Son "+cambio+" dolares");
}
public static void euroYen(double euros) {
	double cambio;
	cambio=euros*144.959;
	System.out.println("Son "+cambio+" yenes");
}
public static void euroLibra(double euros) {
	double cambio;
	cambio=euros*0.79550;
	System.out.println("Son "+cambio+" libras");
}

		/*public static double euroDolar(double euros) {
			double cambio;
			cambio=euros*1.24650;
			return cambio;
	}
		public static double euroYen(double euros) {
			double cambio;
			cambio=euros*144.959;
			return cambio;
	}
		public static double euroLibra(double euros) {
			double cambio;
			cambio=euros*0.79550;
			return cambio;
	}
*/
}