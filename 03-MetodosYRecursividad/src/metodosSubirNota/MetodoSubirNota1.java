package metodosSubirNota;

import scanner.ScannerJava;

public class MetodoSubirNota1 {
	/*1.- Escribe un programa que calcule el área de una figura que se pide por teclado 
	 * que puede ser un círculo, cuadrado o triángulo; según el tipo de figura se pedirán unos datos u otros. 
	 * Se creará un método para calcular el área según la figura y en cada caso se pasarán como parámetros 
	 * los datos que necesitemos. Todos los métodos devolverán un double.  
	 * En el main se invocará al método correspondiente según el tipo de figura y se  mostrará el resultado por pantalla:
Área de cada figura:
•	Circulo: (radio^2)*PI 
•	Triangulo: (base * altura) / 2 
•	Cuadrado: lado * lado */

	public static void main(String[] args) {
		int menu,R=0,base=0,altura=0,lado=0;
		final double PI=3.1416;

		
		System.out.println("            Elija una opción:"+
		
		"\n "+
		"\n > Pulse 1 para calcular el area del circulo."+
		"\n "+
		"\n > Pulse 2 para calcular el area del triángulo."+
		"\n "+
		"\n > Pulse 3 para calcular el area del cuadrado.");
		
		menu=ScannerJava.positivo();

		switch (menu) {
		case 1:System.out.println(areaCirculo(R, PI)); break;
			
		case 2:System.out.println(areaTriangulo(base, altura)); break;
		
		case 3:System.out.println(areaCuadrado(lado));
			break;

		default:System.out.println("No has introducido una opcion valida.");
			break;
		}
		System.out.println(" "+
				"\n Fin de programa.");

	}
//metodos
	public static double areaCirculo(int R,double PI) {
		double circulo;
		System.out.println("           Área del círculo"+
				"\n Escribe un valor para el radio");
	    R=ScannerJava.positivo();
	    circulo=PI*Math.pow(R, 2);
	    System.out.println("el area del circulo es "+circulo);
		return circulo;
	}
	
	public static double areaTriangulo(int base,int altura) {
		double triangulo;
		System.out.println("         Área del triángulo"+
		"\n "+
		"\n Escribe un valor para la base "+
		"\n >");
	    base=ScannerJava.positivo();
	    System.out.println("Escribe un valor para la altura ");
	    altura=ScannerJava.positivo(); 
	    triangulo=(double)(base*altura)/2;
	    System.out.println("el area del triangulo es "+triangulo);
		return triangulo;
	}
	
	public static double areaCuadrado(int lado) {
		double cuadrado;
		System.out.println("          Área del cuadrado");
	    System.out.println("Escribe un valor para el lado");
	    lado=ScannerJava.positivo();
	    cuadrado=Math.pow(lado, 2);
	    System.out.println("el area del cuadrado es "+cuadrado);
		return cuadrado;
		
	}

}
