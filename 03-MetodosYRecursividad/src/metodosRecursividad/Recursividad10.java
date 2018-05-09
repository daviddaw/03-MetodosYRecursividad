package metodosRecursividad;

import scanner.ScannerJava;
/**
 * Escribir un método recursivo que reciba como parámetros una base a y un  exponente b y calcule la potencia por productos sucesivos:
 * ab  se calculará multiplicando el nº a tantas veces como indique b.
 * Hay que tener en cuenta que:
 * a0=1
 * a-b=1/ab
 * @author David Palanco
 */

public class Recursividad10 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("calculadora de potencias");
		System.out.println("Escribe la base");
		a=ScannerJava.entero();
		System.out.println("Escribe el exponente");
		b=ScannerJava.entero();
		
		if (b>=0) {
			System.out.println(potenciaRecursiva(a, b));
		} else if (b<0) {
			System.out.println(1/(potenciaRecursiva(a, -b)));
		}
			
		


	}
	
	public static double potenciaRecursiva(int base,int exponente) {
		if (exponente==0) {
			System.out.println(base+" elevado a "+exponente);
			System.out.println("exponente==0, devuelve 1");
			System.out.println(1);
			return 1;
			
		} 
		else {
			
			System.out.println(base+" elevado a "+exponente);
			//aN=a*aN-1;
			System.out.println("resta exponente");
			System.out.println(base+" elevado a "+exponente+" = "+base*potenciaRecursiva(base, exponente-1));
			System.out.println();
			return base*potenciaRecursiva(base, exponente-1);
			
		}
		
		
		
	}

}
