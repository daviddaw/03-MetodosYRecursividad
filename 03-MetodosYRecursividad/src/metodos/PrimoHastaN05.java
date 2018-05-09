package metodos;

import scanner.ScannerJava;

/**
 * 5.	Usando el método del apartado 4, obtener todos los primos de 2 a N introducido por teclado.
 * @author David Palanco
 *
 */
public class PrimoHastaN05 {

	public static void main(String[] args) {
		int n;
		System.out.println("Escribe un numero");
		n=ScannerJava.positivo();
		System.out.println("Estos son los números primos que hay  hasta el "+n);
		for (int i = 2; i <=n; i++) {
			if(NumeroPrimo04.esPrimo(i)==true)
		    System.out.print(i+"  ");
		}

	}

}
