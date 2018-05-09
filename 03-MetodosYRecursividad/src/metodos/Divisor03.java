package metodos;

import scanner.ScannerJava;

/**
 * 3.	Escribir un método que reciba dos parámetros y decida si uno es divisor del otro. 
 * Escribir un main que introduzca dichos números e invoque al método.
 * @author David Palanco
 *
 */

public class Divisor03 {
	public static void main(String[] args) {
		int  a=1,b=2;
		System.out.println("Escribe dos numeros");
		a=ScannerJava.entero();
		b=ScannerJava.entero();
		if (esDivi(a, b)==1) {
			System.out.println(b+" es divisor de "+a);
		}
		else {
			System.out.println(b+" no es divisor de "+a);
		}

	}

	public static int esDivi(int a, int b) {
		if(a%b==0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
