package metodos;

import scanner.ScannerJava;

public class NumeroPrimo04 {

	public static void main(String[] args) {
		int a;
		System.out.println("Escribe un número");
		a=ScannerJava.mayorUno();
		
		if (esPrimo(a)==true) 
			System.out.println("El "+a+" es primo");
		 else 
			System.out.println("El "+a+" no es primo");
		
		
	}
	
	public static boolean esPrimo (int n) {
		boolean primo = true;
		for (int i = 2; i <= n/2; i++) {

			if (n%i==0) {
				primo=false;
			}
		}
		//System.out.println(primo);
		return primo;

		
		
	}

}