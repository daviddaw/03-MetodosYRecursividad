package metodos;

import scanner.ScannerJava;

/**
 * 8.	Escribir un m�todo que recibe como par�metro un n� y devuelva su factorial. 
 * Escribir un main que pida por teclado un N>=0 e invoque a dicho m�todo.
 * @author David Palanco
 *
 */
public class Factorial {

	public static void main(String[] args) {
	int n;
	System.out.println("Dame un numero");
	n=ScannerJava.positivoYCero();
	System.out.println(factorial(n));

	}
	
	public static int factorial(int n) {
		int factorial=1;
		for (int i = 1; i <=n; i++) {
			
			factorial=factorial*i;
			
		


			}
		return factorial;
	}

}
